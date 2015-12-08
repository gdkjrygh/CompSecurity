// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class eom
    implements omb, opl, ops, opv
{

    Context a;
    Resources b;
    mmr c;
    epf d;
    List e;
    String f;
    epd g;
    ekq h;
    noq i;
    private epi j;

    public eom(opd opd1)
    {
        opd1.a(this);
    }

    private boolean f()
    {
        return f != null;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = context;
        b = context.getResources();
        j = new epi(context);
        c = (mmr)olm1.a(mmr);
        i = (noq)olm1.a(noq);
        g = (epd)olm1.b(epd);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            f = bundle.getString("CreateStateMixin.existing_album");
            d = (epf)bundle.getParcelable("CreateStateMixin.bundle_type");
            e = bundle.getParcelableArrayList("CreateStateMixin.media_list");
        }
    }

    public final void a(List list)
    {
        boolean flag;
        if (!list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "mediaList cannot be empty");
        e = Collections.unmodifiableList(list);
    }

    boolean a()
    {
        return d != null;
    }

    public final boolean b()
    {
        return a() || f();
    }

    public final nup c()
    {
        p.b(b(), "must specify create/copy type");
        if (f())
        {
            return nup.a;
        }
        if (a())
        {
            if (d.e())
            {
                return nup.h;
            }
            if (d.c())
            {
                return nup.i;
            }
            if (d.b())
            {
                return nup.e;
            }
            if (d.d())
            {
                return nup.f;
            }
            boolean flag;
            if (d.c == 4)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return nup.g;
            }
        }
        throw new IllegalStateException("Unknown create/copy type");
    }

    public final epj d()
    {
        p.b(b(), "must set create/copy type");
        p.b(e(), "must set mediaList");
        epi epi1 = j;
        Object obj1 = d;
        Object obj = e;
        ekq ekq1 = h;
        if (obj1 == null)
        {
            if (((hjr)ekq1.a(hjr)).a + ((Collection) (obj)).size() > 2000)
            {
                return new epj(epi1.a.getQuantityString(b.mG, 2000), false);
            } else
            {
                return null;
            }
        }
        obj1 = ((epf) (obj1)).e;
        int k = ((Collection) (obj)).size();
        obj = ((Collection) (obj)).iterator();
        long l2 = 0x7fffffffffffffffL;
        long l = 0x8000000000000000L;
        while (((Iterator) (obj)).hasNext()) 
        {
            long l3 = ((ekp)((Iterator) (obj)).next()).d();
            long l1 = l2;
            if (l3 < l2)
            {
                l1 = l3;
            }
            if (l3 > l)
            {
                l = l3;
            }
            l2 = l1;
        }
        if (TimeUnit.MILLISECONDS.toDays(l - l2) > (long)((epk) (obj1)).c)
        {
            return new epj(epi1.a.getString(b.mV, new Object[] {
                Integer.valueOf(((epk) (obj1)).c)
            }), true);
        }
        if (((epk) (obj1)).a > 1 && ((epk) (obj1)).b < 0x7fffffff)
        {
            if (k < ((epk) (obj1)).a || k > ((epk) (obj1)).b)
            {
                return new epj(epi1.a.getString(b.mU, new Object[] {
                    Integer.valueOf(((epk) (obj1)).a), Integer.valueOf(((epk) (obj1)).b)
                }), true);
            }
        } else
        {
            if (k < ((epk) (obj1)).a)
            {
                return new epj(epi1.a.getQuantityString(b.mI, ((epk) (obj1)).a, new Object[] {
                    Integer.valueOf(((epk) (obj1)).a)
                }), true);
            }
            if (k > ((epk) (obj1)).b)
            {
                return new epj(epi1.a.getQuantityString(b.mH, ((epk) (obj1)).b, new Object[] {
                    Integer.valueOf(((epk) (obj1)).b)
                }), true);
            }
        }
        return null;
    }

    public final void e(Bundle bundle)
    {
        bundle.putString("CreateStateMixin.existing_album", f);
        bundle.putParcelable("CreateStateMixin.bundle_type", d);
        ArrayList arraylist;
        if (e == null)
        {
            arraylist = null;
        } else
        {
            arraylist = new ArrayList(e);
        }
        bundle.putParcelableArrayList("CreateStateMixin.media_list", arraylist);
    }

    public final boolean e()
    {
        return e != null;
    }
}
