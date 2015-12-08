// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.fitbit.util.c.b;

// Referenced classes of package com.fitbit.util:
//            RetryDialogFragment, r

public class RetryDialogFragmentWithSendlog extends RetryDialogFragment
{

    public RetryDialogFragmentWithSendlog()
    {
    }

    public static RetryDialogFragmentWithSendlog b(SimpleConfirmDialogFragment.a a, int i, int j)
    {
        RetryDialogFragmentWithSendlog retrydialogfragmentwithsendlog = new RetryDialogFragmentWithSendlog();
        a(retrydialogfragmentwithsendlog, i, j, a);
        return retrydialogfragmentwithsendlog;
    }

    public static RetryDialogFragmentWithSendlog b(SimpleConfirmDialogFragment.a a, int i, String s)
    {
        RetryDialogFragmentWithSendlog retrydialogfragmentwithsendlog = new RetryDialogFragmentWithSendlog();
        a(retrydialogfragmentwithsendlog, i, s, a);
        return retrydialogfragmentwithsendlog;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -3)
        {
            com.fitbit.util.c.b.a(getActivity(), getArguments());
            super.onClick(dialoginterface, -2);
            return;
        } else
        {
            super.onClick(dialoginterface, i);
            return;
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = r.c(this);
        bundle.setOnCancelListener(this);
        bundle.setPositiveButton(0x7f08048d, this);
        bundle.setNegativeButton(0x7f0802c2, this);
        bundle.setNeutralButton(0x7f080342, this);
        return bundle.create();
    }
}
