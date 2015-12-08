// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.squareup.otto.Bus;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class lang.Object
    implements lang.Object
{

    private rf a;

    public final void a(Sf sf, pi pi)
    {
        Timber.i("PromoLensesDataSource", "onScheduleLoadFailed [\n\tNetworkResult=%s,\n\tStoreLenses=%s\n]", new Object[] {
            pi, sf
        });
        rf.a(a);
    }

    public final void a(List list, int i)
    {
        Timber.i("PromoLensesDataSource", "onPromoLensesLoaded [\n\t%s\n]", new Object[] {
            list
        });
        Timber.i("PromoLensesDataSource", "onPromoLensesLoaded display count = %d", new Object[] {
            Integer.valueOf(i)
        });
        a.a();
        HashSet hashset = new HashSet();
        BY by;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); hashset.add(by.mGplayIapId))
        {
            by = (BY)iterator.next();
            a.a(by);
        }

        Set set = Bt.cd();
        if (set != null && !set.equals(hashset))
        {
            Timber.i("PromoLensesDataSource", "onPromoLensesLoaded send ReCreateCheckoutEvent", new Object[] {
                list
            });
            Bt.a(hashset);
            a.b.a(new ND());
        }
        rf.g();
        Bt.b(PB.b());
        Bt.g(i);
        rf.a(a);
        a.b.a(new Nz());
    }

    >(rf rf1)
    {
        a = rf1;
        super();
    }
}
