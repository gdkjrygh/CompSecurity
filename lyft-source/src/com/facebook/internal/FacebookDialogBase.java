// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookDialog;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.internal:
//            Validate, Utility, DialogPresenter, CallbackManagerImpl, 
//            AppCall

public abstract class FacebookDialogBase
    implements FacebookDialog
{

    protected static final Object BASE_AUTOMATIC_MODE = new Object();
    private static final String TAG = "FacebookDialog";
    private final Activity activity;
    private final Fragment fragment;
    private List modeHandlers;
    private int requestCode;

    protected FacebookDialogBase(Activity activity1, int i)
    {
        Validate.notNull(activity1, "activity");
        activity = activity1;
        fragment = null;
        requestCode = i;
    }

    protected FacebookDialogBase(Fragment fragment1, int i)
    {
        Validate.notNull(fragment1, "fragment");
        fragment = fragment1;
        activity = null;
        requestCode = i;
        if (fragment1.getActivity() == null)
        {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
        } else
        {
            return;
        }
    }

    private List cachedModeHandlers()
    {
        if (modeHandlers == null)
        {
            modeHandlers = getOrderedModeHandlers();
        }
        return modeHandlers;
    }

    private AppCall createAppCallForMode(Object obj, Object obj1)
    {
        Iterator iterator;
        ModeHandler modehandler;
        boolean flag;
        if (obj1 == BASE_AUTOMATIC_MODE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        iterator = cachedModeHandlers().iterator();
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        modehandler = (ModeHandler)iterator.next();
        if (!flag && !Utility.areObjectsEqual(modehandler.getMode(), obj1) || !modehandler.canShow(obj))
        {
            break MISSING_BLOCK_LABEL_20;
        }
        try
        {
            obj = modehandler.createAppCall(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj = createBaseAppCall();
            DialogPresenter.setupAppCallForValidationError(((AppCall) (obj)), ((FacebookException) (obj1)));
        }
_L4:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = createBaseAppCall();
            DialogPresenter.setupAppCallForCannotShowError(((AppCall) (obj1)));
        }
        return ((AppCall) (obj1));
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean canShow(Object obj)
    {
        return canShowImpl(obj, BASE_AUTOMATIC_MODE);
    }

    protected boolean canShowImpl(Object obj, Object obj1)
    {
        Iterator iterator;
        boolean flag;
        if (obj1 == BASE_AUTOMATIC_MODE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        for (iterator = cachedModeHandlers().iterator(); iterator.hasNext();)
        {
            ModeHandler modehandler = (ModeHandler)iterator.next();
            if ((flag || Utility.areObjectsEqual(modehandler.getMode(), obj1)) && modehandler.canShow(obj))
            {
                return true;
            }
        }

        return false;
    }

    protected abstract AppCall createBaseAppCall();

    protected Activity getActivityContext()
    {
        if (activity != null)
        {
            return activity;
        }
        if (fragment != null)
        {
            return fragment.getActivity();
        } else
        {
            return null;
        }
    }

    protected abstract List getOrderedModeHandlers();

    public int getRequestCode()
    {
        return requestCode;
    }

    public final void registerCallback(CallbackManager callbackmanager, FacebookCallback facebookcallback)
    {
        if (!(callbackmanager instanceof CallbackManagerImpl))
        {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        } else
        {
            registerCallbackImpl((CallbackManagerImpl)callbackmanager, facebookcallback);
            return;
        }
    }

    public final void registerCallback(CallbackManager callbackmanager, FacebookCallback facebookcallback, int i)
    {
        setRequestCode(i);
        registerCallback(callbackmanager, facebookcallback);
    }

    protected abstract void registerCallbackImpl(CallbackManagerImpl callbackmanagerimpl, FacebookCallback facebookcallback);

    protected void setRequestCode(int i)
    {
        if (FacebookSdk.isFacebookRequestCode(i))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Request code ").append(i).append(" cannot be within the range reserved by the Facebook SDK.").toString());
        } else
        {
            requestCode = i;
            return;
        }
    }

    public void show(Object obj)
    {
        showImpl(obj, BASE_AUTOMATIC_MODE);
    }

    protected void showImpl(Object obj, Object obj1)
    {
        obj = createAppCallForMode(obj, obj1);
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (fragment == null) goto _L4; else goto _L3
_L3:
        DialogPresenter.present(((AppCall) (obj)), fragment);
_L6:
        return;
_L4:
        DialogPresenter.present(((AppCall) (obj)), activity);
        return;
_L2:
        Log.e("FacebookDialog", "No code path should ever result in a null appCall");
        if (FacebookSdk.isDebugEnabled())
        {
            throw new IllegalStateException("No code path should ever result in a null appCall");
        }
        if (true) goto _L6; else goto _L5
_L5:
    }


    private class ModeHandler
    {

        final FacebookDialogBase this$0;

        public abstract boolean canShow(Object obj);

        public abstract AppCall createAppCall(Object obj);

        public Object getMode()
        {
            return FacebookDialogBase.BASE_AUTOMATIC_MODE;
        }

        protected ModeHandler()
        {
            this$0 = FacebookDialogBase.this;
            super();
        }
    }

}
