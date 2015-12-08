// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import com.fitbit.util.ProgressDialogFragment;

// Referenced classes of package com.fitbit.friends.ui:
//            ProfilePhotoUploader

public static class _cls1.a extends ProgressDialogFragment
{

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = super.onCreateDialog(bundle);
        bundle.setCancelable(false);
        bundle.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() {

            final ProfilePhotoUploader.NotCancellableProgressDialogFragment a;

            public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
            {
                while (i == 84 || i == 4) 
                {
                    return true;
                }
                return false;
            }

            
            {
                a = ProfilePhotoUploader.NotCancellableProgressDialogFragment.this;
                super();
            }
        });
        return bundle;
    }

    public _cls1.a()
    {
    }
}
