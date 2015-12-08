// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.squareup.otto.Bus;
import java.util.Iterator;
import java.util.List;

final class lang.Object
    implements lang.Object
{

    private rg a;

    public final void a(Tt tt, pi pi)
    {
        Timber.i("PurchasedLensesDataSource", "onPurchasedLensesLoadFailed [\n\tNetworkResult=%s,\n\tUserOwnedUnlockables=%s\n]", new Object[] {
            pi, tt
        });
        rg.a(a);
    }

    public final void a(List list)
    {
        Timber.i("PurchasedLensesDataSource", "onPurchasedLensesLoaded [\n\t%s\n]", new Object[] {
            list
        });
        a.a();
        BY by;
        for (list = list.iterator(); list.hasNext(); a.a(by))
        {
            by = (BY)list.next();
        }

        rg.f();
        Bt.c(PB.b());
        rg.a(a);
        a.b.a(new NA());
    }

    >(rg rg1)
    {
        a = rg1;
        super();
    }
}
