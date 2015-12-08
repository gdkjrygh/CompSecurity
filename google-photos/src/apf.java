// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import android.os.MessageQueue;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;

public final class apf
    implements apq, apu, arr
{

    public final Map a;
    public final arq b;
    public final api c;
    public final Map d;
    public final apg e;
    private final aps f;
    private final aqd g;
    private final aou h;
    private ReferenceQueue i;

    public apf(arq arq1, are are, arw arw, arw arw1)
    {
        this(arq1, are, arw, arw1, null, null, null, null, null, null);
    }

    private apf(arq arq1, are are, arw arw, arw arw1, Map map, aps aps1, Map map1, 
            api api1, apg apg1, aqd aqd1)
    {
        b = arq1;
        h = new aou(are);
        d = new HashMap();
        f = new aps();
        a = new HashMap();
        c = new api(arw, arw1, this);
        e = new apg(h);
        g = new aqd();
        arq1.a(this);
    }

    public static void a(String s, long l, ane ane)
    {
        double d1 = bac.a(l);
        ane = String.valueOf(ane);
        (new StringBuilder(String.valueOf(s).length() + 37 + String.valueOf(ane).length())).append(s).append(" in ").append(d1).append("ms, key: ").append(ane);
    }

    public ReferenceQueue a()
    {
        if (i == null)
        {
            i = new ReferenceQueue();
            Looper.myQueue().addIdleHandler(new apl(d, i));
        }
        return i;
    }

    public final void a(ane ane, apt apt1)
    {
        bag.a();
        if (apt1 != null)
        {
            apt1.c = ane;
            apt1.b = this;
            if (apt1.a)
            {
                d.put(ane, new apm(ane, apt1, a()));
            }
        }
        a.remove(ane);
    }

    public final void a(apn apn1, ane ane)
    {
        bag.a();
        if (apn1.equals((apn)a.get(ane)))
        {
            a.remove(ane);
        }
    }

    public final void a(aqa aqa)
    {
        bag.a();
        g.a(aqa);
    }

    public final void b(ane ane, apt apt1)
    {
        bag.a();
        d.remove(ane);
        if (apt1.a)
        {
            b.a(ane, apt1);
            return;
        } else
        {
            g.a(apt1);
            return;
        }
    }
}
