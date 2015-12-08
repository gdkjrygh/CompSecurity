// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.squareup.otto.Bus;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class lang.Object
    implements lang.Object
{

    private rh a;

    public final void a(RC rc, pi pi)
    {
        Timber.i("ScheduledLensesDataSource", "onScheduleLoadFailed [\n\tNetworkResult=%s,\n\tLoadScheduledLensesResponse=%s\n]", new Object[] {
            pi, rc
        });
        rh.a(a);
    }

    public final void a(List list)
    {
        Timber.i("ScheduledLensesDataSource", "onScheduleLoaded [\n\t%s\n]", new Object[] {
            list
        });
        a.a();
        BX bx;
        for (list = list.iterator(); list.hasNext(); a.a(bx))
        {
            bx = (BX)list.next();
        }

        rh.i();
        Bt.a(PB.b());
        Bt.f(a.e.size());
        rh.a(a);
        a.b.a(new NP());
    }

    >(rh rh1)
    {
        a = rh1;
        super();
    }
}
