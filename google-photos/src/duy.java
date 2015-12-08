// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class duy
    implements dur
{

    private static final oni a = new oni("debug.photos.onboarding");
    private final duz b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final dux g;
    private final noz h;
    private final dul i;
    private final duv j;

    public duy(Context context, String s, String s1, String s2, int k, dux dux, duz duz1, 
            dul dul)
    {
        b = duz1;
        c = s;
        d = s1;
        e = s2;
        f = k;
        g = dux;
        i = dul;
        j = (duv)olm.a(context, duv);
        h = noz.a(context, 3, "OnboardingCardSource", new String[0]);
    }

    public final int a(int k)
    {
        Iterator iterator = a(k, null).iterator();
        k = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (b(((dum)iterator.next()).a) == dut.a)
            {
                k++;
            }
        } while (true);
        return k;
    }

    public final duu a(dui dui1)
    {
        return null;
    }

    public final Object a()
    {
        return d;
    }

    public final List a(int k, imi imi1)
    {
        duj duj1 = new duj(k, c, d);
        if (h.a())
        {
            noy.a("OnboardingDebugFlag", Boolean.valueOf(false));
        }
        duv duv1 = j;
        dux dux = g;
        boolean flag;
        if (!duv1.a(duj1.a(), duv.a(duj1.b()), dux))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (duv1.b.a())
        {
            noy.a("card", duj1.b());
            noy.a("visible", Boolean.valueOf(flag));
            noy.a("prefs location", dux);
        }
        if (!flag || !b.a(k))
        {
            k = 0;
        } else
        {
            k = 1;
        }
        if (k != 0)
        {
            long l;
            if (imi1 == null)
            {
                l = -1L;
            } else
            {
                l = imi1.a(d.hashCode());
            }
            imi1 = new dun();
            imi1.a = duj1;
            imi1.f = e;
            imi1.g = f;
            imi1.b = dva.b;
            imi1.c = 0x7fffffffL;
            imi1.e = l;
            imi1.h = i;
            return Arrays.asList(new dum[] {
                imi1.a()
            });
        }
        if (h.a())
        {
            noy.a("card", c);
            noy.a("visible", Boolean.valueOf(false));
        }
        return Collections.emptyList();
    }

    public final void a(List list)
    {
        dui dui1;
        duv duv1;
        dux dux;
        for (list = list.iterator(); list.hasNext(); duv1.b(dui1.a(), duv.b(dui1.b()), dux))
        {
            dui1 = (dui)list.next();
            duv1 = j;
            dux = g;
        }

    }

    public final int b(dui dui1)
    {
        duv duv1 = j;
        dux dux = g;
        if (duv1.a(dui1.a(), duv.b(dui1.b()), dux))
        {
            return dut.b;
        } else
        {
            return dut.a;
        }
    }

    public final Uri b()
    {
        return duv.a;
    }

    public final boolean c()
    {
        return false;
    }

}
