// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;

public final class geh extends nzc
{

    public qiq a;
    private final String b;
    private final String c;

    private geh(Context context, int i, String s, String s1, boolean flag)
    {
        nyg nyg1 = new nyg(context, i);
        String s2;
        if (flag)
        {
            s2 = "syncusermediabackground";
        } else
        {
            s2 = "syncusermedia";
        }
        super(context, nyg1, s2, new pdj(), new pdk());
        b = s1;
        c = s;
    }

    public static geh a(Context context, geu geu1, String s)
    {
        return new geh(context, geu1.d(), null, s, geu1.a());
    }

    public static geh a(Context context, geu geu1, String s, String s1)
    {
        p.a(s);
        return new geh(context, geu1.d(), s, s1, geu1.a());
    }

    public static hpu a(Context context, boolean flag)
    {
        if (flag)
        {
            return (hpu)olm.a(context, hpq);
        } else
        {
            return (hpu)olm.a(context, hpp);
        }
    }

    protected final void a(qlw qlw)
    {
        qlw = (pdj)qlw;
        qlw.a = new qip();
        ((pdj) (qlw)).a.e = b;
        ((pdj) (qlw)).a.f = c;
        ((pdj) (qlw)).a.g = 2;
        ((pdj) (qlw)).a.c = b.h();
        ((pdj) (qlw)).a.a = b.i();
        ((pdj) (qlw)).a.d = b.j();
        if (gjr.b())
        {
            qlw = ((pdj) (qlw)).a;
            qfy qfy1 = new qfy();
            qfy1.a = new qbj();
            qlw.b = qfy1;
        }
    }

    protected final void b(qlw qlw)
    {
        qlw = (pdk)qlw;
        super.b(qlw);
        a = ((pdk) (qlw)).a;
        if (Log.isLoggable("SyncUserMediaOperation", 3))
        {
            qlw = String.valueOf("Response:  resumeToken: ");
            String s = String.valueOf(a.a);
            String s1 = String.valueOf(a.g);
            int i;
            if (a.b != null)
            {
                i = a.b.length;
            } else
            {
                i = 0;
            }
            (new StringBuilder(String.valueOf(qlw).length() + 35 + String.valueOf(s).length() + String.valueOf(s1).length())).append(qlw).append(s).append(" syncToken: ").append(s1).append(" num items: ").append(i);
        }
    }
}
