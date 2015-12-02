// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

final class bko extends bkq
{

    private final bkl a;
    private final bkc b;
    private final bjw c;
    private final bmj d;
    private final bkr e;
    private bkq f;

    private bko(bkl bkl1, bkc bkc1, bjw bjw1, bmj bmj1, bkr bkr)
    {
        a = bkl1;
        b = bkc1;
        c = bjw1;
        d = bmj1;
        e = bkr;
    }

    bko(bkl bkl1, bkc bkc1, bjw bjw1, bmj bmj1, bkr bkr, byte byte0)
    {
        this(bkl1, bkc1, bjw1, bmj1, bkr);
    }

    private bkq a()
    {
        bkq bkq1 = f;
        if (bkq1 != null)
        {
            return bkq1;
        } else
        {
            bkq bkq2 = c.a(e, d);
            f = bkq2;
            return bkq2;
        }
    }

    public static bkr a(bmj bmj1, Object obj)
    {
        return new bkp(obj, bmj1, false, (byte)0);
    }

    public static bkr b(bmj bmj1, Object obj)
    {
        boolean flag;
        if (bmj1.getType() == bmj1.getRawType())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new bkp(obj, bmj1, flag, (byte)0);
    }

    public final Object a(JsonReader jsonreader)
    {
        if (b == null)
        {
            return a().a(jsonreader);
        }
        jsonreader = bln.a(jsonreader);
        if (jsonreader.j())
        {
            return null;
        } else
        {
            return b.a(jsonreader, d.getType(), c.a);
        }
    }

    public final void a(JsonWriter jsonwriter, Object obj)
    {
        if (a == null)
        {
            a().a(jsonwriter, obj);
            return;
        }
        if (obj == null)
        {
            jsonwriter.nullValue();
            return;
        } else
        {
            bkl bkl1 = a;
            d.getType();
            bln.a(bkl1.a(obj), jsonwriter);
            return;
        }
    }
}
