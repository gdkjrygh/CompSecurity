// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import com.fitbit.e.a;
import com.fitbit.e.b;

// Referenced classes of package com.fitbit.util:
//            q

class it>
    implements Runnable
{

    final String a;
    final q b;

    public void run()
    {
        DialogFragment dialogfragment;
        try
        {
            dialogfragment = (DialogFragment)b.a.findFragmentByTag(a);
            com.fitbit.e.b.a("DialogFragmentHelper postDismiss", new Object[0]);
        }
        catch (IllegalStateException illegalstateexception)
        {
            com.fitbit.e.a.e("DialogFragmentHelper", illegalstateexception);
            return;
        }
        if (dialogfragment == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        dialogfragment.dismiss();
        b.a.executePendingTransactions();
    }

    teException(q q1, String s)
    {
        b = q1;
        a = s;
        super();
    }
}
