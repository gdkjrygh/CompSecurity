// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.configuration.ConfigurationOperations;
import com.soundcloud.android.onboarding.auth.tasks.AuthTask;
import com.soundcloud.android.onboarding.auth.tasks.AuthTaskException;
import com.soundcloud.android.onboarding.auth.tasks.AuthTaskResult;
import com.soundcloud.android.storage.LegacyUserStorage;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;
import java.lang.ref.WeakReference;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            SignupTaskFragment, TokenInformationGenerator, SignupVia

public abstract class AuthTaskFragment extends DialogFragment
{
    public static interface OnAuthResultListener
    {

        public abstract void onAuthTaskComplete(PublicApiUser publicapiuser, SignupVia signupvia, boolean flag, boolean flag1);

        public abstract void onBlocked();

        public abstract void onDeviceConflict(Bundle bundle);

        public abstract void onEmailInvalid();

        public abstract void onEmailTaken();

        public abstract void onError(String s, boolean flag);

        public abstract void onSpam();

        public abstract void onUsernameInvalid(String s);
    }


    AccountOperations accountOperations;
    ApiClient apiClient;
    ConfigurationOperations configurationOperations;
    EventBus eventBus;
    private WeakReference listenerRef;
    NetworkConnectionHelper networkConnectionHelper;
    private AuthTaskResult result;
    private AuthTask task;
    TokenInformationGenerator tokenUtils;
    LegacyUserStorage userStorage;

    protected AuthTaskFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    private void deliverResultAndDismiss()
    {
        OnAuthResultListener onauthresultlistener = (OnAuthResultListener)listenerRef.get();
        if (onauthresultlistener != null)
        {
            ErrorUtils.log(4, "ScOnboarding", (new StringBuilder("auth result will be sent to listener: ")).append(result.toString()).toString());
            if (result.wasSuccess())
            {
                onauthresultlistener.onAuthTaskComplete(result.getUser(), result.getSignupVia(), this instanceof SignupTaskFragment, result.getShowFacebookSuggestions());
            } else
            if (result.wasEmailTaken())
            {
                onauthresultlistener.onEmailTaken();
            } else
            if (result.wasSpam())
            {
                onauthresultlistener.onSpam();
            } else
            if (result.wasDenied())
            {
                onauthresultlistener.onBlocked();
            } else
            if (result.wasEmailInvalid())
            {
                onauthresultlistener.onEmailInvalid();
            } else
            if (result.wasDeviceConflict())
            {
                onauthresultlistener.onDeviceConflict(result.getLoginBundle());
            } else
            if (result.wasValidationError())
            {
                onauthresultlistener.onUsernameInvalid(result.getServerErrorMessage());
            } else
            {
                onauthresultlistener.onError(getErrorFromResult((Activity)onauthresultlistener, result), shouldAllowFeedback(result));
            }
        } else
        {
            ErrorUtils.log(4, "ScOnboarding", "auth result listener is gone, when delivering result");
        }
        dismiss();
    }

    private boolean shouldAllowFeedback(AuthTaskResult authtaskresult)
    {
        return networkConnectionHelper.isNetworkConnected() && authtaskresult.wasUnexpectedError();
    }

    abstract AuthTask createAuthTask();

    protected String getErrorFromResult(Activity activity, AuthTaskResult authtaskresult)
    {
        Throwable throwable = ErrorUtils.removeTokenRetrievalException(authtaskresult.getException());
        boolean flag;
        if (!networkConnectionHelper.isNetworkConnected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (authtaskresult.wasServerError())
        {
            return activity.getString(0x7f07012c);
        }
        if (authtaskresult.wasNetworkError() && flag)
        {
            return activity.getString(0x7f07008e);
        }
        if (throwable instanceof AuthTaskException)
        {
            return ((AuthTaskException)throwable).getFirstError();
        } else
        {
            return activity.getString(0x7f07008b);
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            listenerRef = new WeakReference((OnAuthResultListener)activity);
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement OnAuthResultListener").toString());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setRetainInstance(true);
        setCancelable(false);
        networkConnectionHelper = new NetworkConnectionHelper();
        task = createAuthTask();
        task.setTaskOwner(this);
        task.executeOnThreadPool(new Bundle[] {
            getArguments()
        });
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new ProgressDialog(getActivity(), 2);
        bundle.setMessage(getString(0x7f070096));
        bundle.setIndeterminate(true);
        bundle.setCanceledOnTouchOutside(false);
        bundle.setCancelable(false);
        return bundle;
    }

    public void onDestroyView()
    {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance())
        {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (task != null)
        {
            task.cancel(false);
        }
    }

    public void onResume()
    {
        super.onResume();
        if (task == null)
        {
            deliverResultAndDismiss();
        }
    }

    public void onTaskResult(AuthTaskResult authtaskresult)
    {
        task = null;
        result = authtaskresult;
        if (isResumed())
        {
            deliverResultAndDismiss();
        }
    }
}
