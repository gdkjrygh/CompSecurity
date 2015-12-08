// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.android;

import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.widget.WebDialog;

// Referenced classes of package com.facebook.android:
//            DialogError, FacebookError

public class FbDialog extends WebDialog
{

    private Facebook.DialogListener mListener;

    public FbDialog(Context context, String s, Bundle bundle, Facebook.DialogListener dialoglistener)
    {
        super(context, s, bundle, 0x1030010, null);
        setDialogListener(dialoglistener);
    }

    public FbDialog(Context context, String s, Bundle bundle, Facebook.DialogListener dialoglistener, int i)
    {
        super(context, s, bundle, i, null);
        setDialogListener(dialoglistener);
    }

    public FbDialog(Context context, String s, Facebook.DialogListener dialoglistener)
    {
        this(context, s, dialoglistener, 0x1030010);
    }

    public FbDialog(Context context, String s, Facebook.DialogListener dialoglistener, int i)
    {
        super(context, s, i);
        setDialogListener(dialoglistener);
    }

    private void callDialogListener(Bundle bundle, FacebookException facebookexception)
    {
        if (mListener == null)
        {
            return;
        }
        if (bundle != null)
        {
            mListener.onComplete(bundle);
            return;
        }
        if (facebookexception instanceof FacebookDialogException)
        {
            bundle = (FacebookDialogException)facebookexception;
            bundle = new DialogError(bundle.getMessage(), bundle.getErrorCode(), bundle.getFailingUrl());
            mListener.onError(bundle);
            return;
        }
        if (facebookexception instanceof FacebookOperationCanceledException)
        {
            mListener.onCancel();
            return;
        } else
        {
            bundle = new FacebookError(facebookexception.getMessage());
            mListener.onFacebookError(bundle);
            return;
        }
    }

    private void setDialogListener(Facebook.DialogListener dialoglistener)
    {
        mListener = dialoglistener;
        setOnCompleteListener(new com.facebook.widget.WebDialog.OnCompleteListener() {

            final FbDialog this$0;

            public void onComplete(Bundle bundle, FacebookException facebookexception)
            {
                callDialogListener(bundle, facebookexception);
            }

            
            {
                this$0 = FbDialog.this;
                super();
            }
        });
    }

}
