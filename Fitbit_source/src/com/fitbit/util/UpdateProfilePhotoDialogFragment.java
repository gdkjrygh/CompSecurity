// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

// Referenced classes of package com.fitbit.util:
//            r

public class UpdateProfilePhotoDialogFragment extends DialogFragment
{

    private android.content.DialogInterface.OnClickListener a;

    public UpdateProfilePhotoDialogFragment()
    {
    }

    static android.content.DialogInterface.OnClickListener a(UpdateProfilePhotoDialogFragment updateprofilephotodialogfragment)
    {
        return updateprofilephotodialogfragment.a;
    }

    public static UpdateProfilePhotoDialogFragment a(int i, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        UpdateProfilePhotoDialogFragment updateprofilephotodialogfragment = new UpdateProfilePhotoDialogFragment();
        updateprofilephotodialogfragment.setArguments(r.a(i, 0));
        updateprofilephotodialogfragment.a(onclicklistener);
        return updateprofilephotodialogfragment;
    }

    public void a(android.content.DialogInterface.OnClickListener onclicklistener)
    {
        a = onclicklistener;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getString(0x7f080519);
        String s = getString(0x7f0804a5);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        builder.setTitle(r.a(this));
        android.content.DialogInterface.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener() {

            final UpdateProfilePhotoDialogFragment a;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                if (UpdateProfilePhotoDialogFragment.a(a) != null)
                {
                    UpdateProfilePhotoDialogFragment.a(a).onClick(dialoginterface, i);
                    a.dismiss();
                }
            }

            
            {
                a = UpdateProfilePhotoDialogFragment.this;
                super();
            }
        };
        builder.setItems(new String[] {
            bundle, s
        }, onclicklistener);
        builder.setNegativeButton(0x7f0802c2, new android.content.DialogInterface.OnClickListener() {

            final UpdateProfilePhotoDialogFragment a;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                a = UpdateProfilePhotoDialogFragment.this;
                super();
            }
        });
        bundle = builder.create();
        bundle.setCanceledOnTouchOutside(false);
        return bundle;
    }
}
