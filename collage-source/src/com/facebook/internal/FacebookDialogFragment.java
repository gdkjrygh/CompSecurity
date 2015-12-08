// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;

// Referenced classes of package com.facebook.internal:
//            NativeProtocol, WebDialog, Utility, FacebookWebFallbackDialog

public class FacebookDialogFragment extends DialogFragment
{

    public static final String TAG = "FacebookDialogFragment";
    private Dialog dialog;

    public FacebookDialogFragment()
    {
    }

    private void onCompleteWebDialog(Bundle bundle, FacebookException facebookexception)
    {
        FragmentActivity fragmentactivity = getActivity();
        bundle = NativeProtocol.createProtocolResultIntent(fragmentactivity.getIntent(), bundle, facebookexception);
        byte byte0;
        if (facebookexception == null)
        {
            byte0 = -1;
        } else
        {
            byte0 = 0;
        }
        fragmentactivity.setResult(byte0, bundle);
        fragmentactivity.finish();
    }

    private void onCompleteWebFallbackDialog(Bundle bundle)
    {
        FragmentActivity fragmentactivity = getActivity();
        Intent intent = new Intent();
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        intent.putExtras(bundle1);
        fragmentactivity.setResult(-1, intent);
        fragmentactivity.finish();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (dialog instanceof WebDialog)
        {
            ((WebDialog)dialog).resize();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (dialog != null) goto _L2; else goto _L1
_L1:
        Bundle bundle1;
        bundle = getActivity();
        bundle1 = NativeProtocol.getMethodArgumentsFromIntent(bundle.getIntent());
        if (bundle1.getBoolean("is_fallback", false)) goto _L4; else goto _L3
_L3:
        String s;
        s = bundle1.getString("action");
        bundle1 = bundle1.getBundle("params");
        if (!Utility.isNullOrEmpty(s)) goto _L6; else goto _L5
_L5:
        Utility.logd("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
        bundle.finish();
_L2:
        return;
_L6:
        bundle = (new WebDialog.Builder(bundle, s, bundle1)).setOnCompleteListener(new WebDialog.OnCompleteListener() {

            final FacebookDialogFragment this$0;

            public void onComplete(Bundle bundle2, FacebookException facebookexception)
            {
                onCompleteWebDialog(bundle2, facebookexception);
            }

            
            {
                this$0 = FacebookDialogFragment.this;
                super();
            }
        }).build();
_L8:
        dialog = bundle;
        return;
_L4:
        String s1 = bundle1.getString("url");
        if (Utility.isNullOrEmpty(s1))
        {
            Utility.logd("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
            bundle.finish();
            return;
        }
        bundle = new FacebookWebFallbackDialog(bundle, s1, String.format("fb%s://bridge/", new Object[] {
            FacebookSdk.getApplicationId()
        }));
        bundle.setOnCompleteListener(new WebDialog.OnCompleteListener() {

            final FacebookDialogFragment this$0;

            public void onComplete(Bundle bundle2, FacebookException facebookexception)
            {
                onCompleteWebFallbackDialog(bundle2);
            }

            
            {
                this$0 = FacebookDialogFragment.this;
                super();
            }
        });
        if (true) goto _L8; else goto _L7
_L7:
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        if (dialog == null)
        {
            onCompleteWebDialog(null, null);
            setShowsDialog(false);
        }
        return dialog;
    }

    public void onDestroyView()
    {
        if (getDialog() != null && getRetainInstance())
        {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    public void setDialog(Dialog dialog1)
    {
        dialog = dialog1;
    }


}
