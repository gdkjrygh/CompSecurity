// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui.landing;

import android.os.Bundle;
import com.fitbit.data.domain.SleepLogEntry;
import com.fitbit.util.SimpleConfirmDialogFragment;

public class DeleteSleepLogConfirmationDialog extends SimpleConfirmDialogFragment
{
    public static interface a
    {

        public abstract void e();

        public abstract void f();
    }


    private static final String e = "DeleteSleepLogConfirmationDialog";
    private static final String f = "DeleteSleepLogConfirmationDialog.LOG_ID_EXTRA";

    public DeleteSleepLogConfirmationDialog()
    {
        super(0x7f08013c, 0x7f0802c2);
    }

    private DeleteSleepLogConfirmationDialog(com.fitbit.util.SimpleConfirmDialogFragment.a a1)
    {
        super(0x7f08013c, 0x7f0802c2);
        a(this, 0x7f08013d, 0x7f08005a, a1);
    }

    static long a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        return b(simpleconfirmdialogfragment);
    }

    public static DeleteSleepLogConfirmationDialog a(SleepLogEntry sleeplogentry)
    {
        return a(((a) (null)), sleeplogentry);
    }

    public static DeleteSleepLogConfirmationDialog a(a a1, SleepLogEntry sleeplogentry)
    {
        a1 = new DeleteSleepLogConfirmationDialog(new _cls1(a1));
        a(((SimpleConfirmDialogFragment) (a1)), sleeplogentry.getEntityId().longValue());
        return a1;
    }

    private static void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment, long l)
    {
        Bundle bundle = simpleconfirmdialogfragment.getArguments();
        bundle.putLong("DeleteSleepLogConfirmationDialog.LOG_ID_EXTRA", l);
        simpleconfirmdialogfragment.setArguments(bundle);
    }

    private static long b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        return simpleconfirmdialogfragment.getArguments().getLong("DeleteSleepLogConfirmationDialog.LOG_ID_EXTRA");
    }

    /* member class not found */
    class _cls1 {}

}
