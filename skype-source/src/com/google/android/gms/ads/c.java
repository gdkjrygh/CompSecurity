// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.aa;
import java.util.Date;

public final class c
{
    public static final class a
    {

        private final com.google.android.gms.ads.internal.client.aa.a a = new com.google.android.gms.ads.internal.client.aa.a();

        static com.google.android.gms.ads.internal.client.aa.a a(a a1)
        {
            return a1.a;
        }

        public final a a(int i)
        {
            a.a(i);
            return this;
        }

        public final a a(Location location)
        {
            a.a(location);
            return this;
        }

        public final a a(Class class1, Bundle bundle)
        {
            a.a(class1, bundle);
            if (class1.equals(com/google/ads/mediation/a/a) && bundle.getBoolean("_emulatorLiveAds"))
            {
                a.c(c.a);
            }
            return this;
        }

        public final a a(String s)
        {
            a.a(s);
            return this;
        }

        public final a a(Date date)
        {
            a.a(date);
            return this;
        }

        public final a a(boolean flag)
        {
            a.a(flag);
            return this;
        }

        public final c a()
        {
            return new c(this, (byte)0);
        }

        public final a b(String s)
        {
            a.b(s);
            return this;
        }

        public a()
        {
            a.b(c.a);
        }
    }


    public static final String a;
    private final aa b;

    private c(a a1)
    {
        b = new aa(a.a(a1));
    }

    c(a a1, byte byte0)
    {
        this(a1);
    }

    public final aa a()
    {
        return b;
    }

    static 
    {
        a = aa.a;
    }
}
