// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.database.Cursor;
import java.security.InvalidParameterException;
import org.json.JSONException;
import org.json.JSONObject;
import p.cw.c;

// Referenced classes of package com.pandora.radio.data:
//            a

public static class a.b
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/radio/data/a$b$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("CURSOR", 0);
            b = new a("JSON", 1);
            c = new a("REGULAR", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private final com.pandora.radio.data.a a;
    private final a b;

    private String d(String s)
    {
        return String.format("Cannot call %s() when constructed with Builder(Cursor || JSONObject);", new Object[] {
            s
        });
    }

    private void e(String s)
    {
        if (b == a.a || b == a.b)
        {
            throw new InvalidParameterException(d(s));
        } else
        {
            return;
        }
    }

    public d a(int i)
    {
        e("setHeight");
        com.pandora.radio.data.a.a(a, i);
        return this;
    }

    public a a(a a1)
    {
        e("setType");
        com.pandora.radio.data.a.a(a, a1);
        return this;
    }

    public a a(String s)
    {
        e("setInterstitialHtml");
        com.pandora.radio.data.a.a(a, s);
        return this;
    }

    public a a(boolean flag)
    {
        e("setIsCreateStationAdFollowOnBanner");
        com.pandora.radio.data.a.a(a, flag);
        return this;
    }

    public com.pandora.radio.data.a a()
    {
        return a;
    }

    public a b(String s)
    {
        e("setDfpAdUnitId");
        com.pandora.radio.data.a.b(a, s);
        return this;
    }

    public a b(boolean flag)
    {
        e("setIsValueExchangeFollowOnBanner");
        com.pandora.radio.data.a.b(a, flag);
        return this;
    }

    public a c(String s)
    {
        e("setHtml");
        com.pandora.radio.data.a.c(a, s);
        return this;
    }

    public a(Cursor cursor)
    {
        this(new com.pandora.radio.data.a(cursor, null), a.a);
    }

    public a(com.pandora.radio.data.a a1)
    {
        this(new com.pandora.radio.data.a(a1, null), com.pandora.radio.data.a.c);
    }

    private a(com.pandora.radio.data.a a1, a a2)
    {
        if (com.pandora.radio.data.a.a(a1) == com.pandora.radio.data.c)
        {
            throw new InvalidParameterException("Use a VideoAdData constructor to build AdData of type AdType.VIDEO");
        } else
        {
            a = a1;
            b = a2;
            return;
        }
    }

    public a(String s, int i, b b1)
    {
        this(new com.pandora.radio.data.a(s, i, b1), com.pandora.radio.data.a.c);
    }

    public a(JSONObject jsonobject, boolean flag, c c1)
        throws JSONException
    {
        this(new com.pandora.radio.data.a(jsonobject, flag, c1, null), a.b);
    }
}
