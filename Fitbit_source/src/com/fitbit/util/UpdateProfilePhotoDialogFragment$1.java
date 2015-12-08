// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.DialogInterface;

// Referenced classes of package com.fitbit.util:
//            UpdateProfilePhotoDialogFragment

class a
    implements android.content.a
{

    final UpdateProfilePhotoDialogFragment a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (UpdateProfilePhotoDialogFragment.a(a) != null)
        {
            UpdateProfilePhotoDialogFragment.a(a).lick(dialoginterface, i);
            a.dismiss();
        }
    }

    (UpdateProfilePhotoDialogFragment updateprofilephotodialogfragment)
    {
        a = updateprofilephotodialogfragment;
        super();
    }
}
