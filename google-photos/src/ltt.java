// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class ltt extends lqd
{

    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private static final String f;
    private final Context g;
    private lpu h;
    private final HandlerThread i = new HandlerThread("Google GTM SDK Timer", 10);
    private Handler j;
    private final Set k = new HashSet();

    public ltt(Context context, lpu lpu)
    {
        super(b, new String[] {
            d, c
        });
        g = context;
        h = lpu;
        i.start();
        j = new Handler(i.getLooper());
    }

    static Set a(ltt ltt1)
    {
        return ltt1.k;
    }

    static lpu b(ltt ltt1)
    {
        return ltt1.h;
    }

    static Handler c(ltt ltt1)
    {
        return ltt1.j;
    }

    static boolean d(ltt ltt1)
    {
        return false;
    }

    static boolean e(ltt ltt1)
    {
        return false;
    }

    static Context f(ltt ltt1)
    {
        return ltt1.g;
    }

    public final ksp a(Map map)
    {
label0:
        {
label1:
            {
                String s1 = ltw.a((ksp)map.get(c));
                String s = ltw.a((ksp)map.get(f));
                String s2 = ltw.a((ksp)map.get(d));
                map = ltw.a((ksp)map.get(e));
                long l;
                long l1;
                try
                {
                    l = Long.parseLong(s2);
                }
                catch (NumberFormatException numberformatexception)
                {
                    l = 0L;
                }
                try
                {
                    l1 = Long.parseLong(map);
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    l1 = 0L;
                }
                if (l <= 0L || TextUtils.isEmpty(s1))
                {
                    break label0;
                }
                if (s != null)
                {
                    map = s;
                    if (!s.isEmpty())
                    {
                        break label1;
                    }
                }
                map = "0";
            }
            if (!k.contains(map))
            {
                if (!"0".equals(map))
                {
                    k.add(map);
                }
                j.postDelayed(new ltu(this, s1, map, l, l1), l);
            }
        }
        return ltw.f();
    }

    public final boolean b()
    {
        return false;
    }

    static 
    {
        b = kse.Q.toString();
        c = ksf.B.toString();
        d = ksf.v.toString();
        e = ksf.y.toString();
        f = ksf.J.toString();
    }
}
