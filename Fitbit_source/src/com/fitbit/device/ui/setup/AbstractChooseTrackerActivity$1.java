// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.exceptions.IncorrectTimestampException;
import com.fitbit.data.bl.exceptions.NetworkTimeoutException;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.restrictions.RestrictionInfo;
import com.fitbit.serverinteraction.restrictions.RestrictionsController;
import com.fitbit.util.RetryDialogFragment;
import com.fitbit.util.ar;

// Referenced classes of package com.fitbit.device.ui.setup:
//            AbstractChooseTrackerActivity

class a
    implements Runnable
{

    final Exception a;
    final AbstractChooseTrackerActivity b;

    public void run()
    {
        if (b.P())
        {
            FragmentTransaction fragmenttransaction = b.getSupportFragmentManager().beginTransaction();
            Object obj = (RetryDialogFragment)b.getSupportFragmentManager().findFragmentByTag("com.fitbit.onboarding.setup.ChooseTrackerActivity.TAG_RETRY_DIALOG");
            if (obj != null)
            {
                fragmenttransaction.detach(((android.support.v4.app.Fragment) (obj)));
            }
            obj = ServerGateway.a().b().a();
            RestrictionInfo restrictioninfo = ServerGateway.a().b().c();
            if (a != null && (a instanceof IncorrectTimestampException))
            {
                b.getIntent().putExtra("EXTRA_PENDING_MESSAGE", b.getString(0x7f080286));
                b.setResult(0, b.getIntent());
                b.finish();
                return;
            }
            boolean flag = ar.c(b);
            if (obj != null && flag)
            {
                if (obj == com.fitbit.serverinteraction.restrictions.istener.OfflineReason.d && restrictioninfo != null)
                {
                    obj = RetryDialogFragment.a(b, 0x7f08048f, restrictioninfo.d());
                } else
                {
                    obj = RetryDialogFragment.a(b, 0x7f08048f, ((com.fitbit.serverinteraction.restrictions.istener.OfflineReason) (obj)).a(b, ServerGateway.a().b()));
                }
            } else
            if (flag)
            {
                if (a != null && (a instanceof NetworkTimeoutException))
                {
                    if (an.a().g())
                    {
                        obj = RetryDialogFragment.a(b, 0x7f08048f, 0x7f08048e);
                    } else
                    {
                        obj = RetryDialogFragment.a(b, 0x7f08048f, 0x7f080352);
                    }
                } else
                {
                    obj = RetryDialogFragment.a(b, 0x7f08048f, 0x7f08018e);
                }
            } else
            {
                obj = RetryDialogFragment.a(b, 0x7f08048f, 0x7f08048e);
            }
            fragmenttransaction.add(((android.support.v4.app.Fragment) (obj)), "com.fitbit.onboarding.setup.ChooseTrackerActivity.TAG_RETRY_DIALOG").commit();
            return;
        } else
        {
            AbstractChooseTrackerActivity.a(b, true);
            return;
        }
    }

    oller.PresenceListener.OfflineReason(AbstractChooseTrackerActivity abstractchoosetrackeractivity, Exception exception)
    {
        b = abstractchoosetrackeractivity;
        a = exception;
        super();
    }
}
