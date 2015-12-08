// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class dz
{
    public static final class a
    {

        private boolean a;
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e;

        static boolean a(a a1)
        {
            return a1.a;
        }

        static boolean b(a a1)
        {
            return a1.b;
        }

        static boolean c(a a1)
        {
            return a1.c;
        }

        static boolean d(a a1)
        {
            return a1.d;
        }

        static boolean e(a a1)
        {
            return a1.e;
        }

        public final a a()
        {
            e = true;
            return this;
        }

        public final a a(boolean flag)
        {
            a = flag;
            return this;
        }

        public final a b(boolean flag)
        {
            b = flag;
            return this;
        }

        public final a c(boolean flag)
        {
            c = flag;
            return this;
        }

        public final a d(boolean flag)
        {
            d = flag;
            return this;
        }

        public a()
        {
        }
    }


    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    private dz(a a1)
    {
        a = a.a(a1);
        b = com.google.android.gms.internal.a.b(a1);
        c = a.c(a1);
        d = a.d(a1);
        e = a.e(a1);
    }

    dz(a a1, byte byte0)
    {
        this(a1);
    }

    public final JSONObject a()
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = (new JSONObject()).put("sms", a).put("tel", b).put("calendar", c).put("storePicture", d).put("inlineVideo", e);
        }
        catch (JSONException jsonexception)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Error occured while obtaining the MRAID capabilities.", jsonexception);
            return null;
        }
        return jsonobject;
    }
}
