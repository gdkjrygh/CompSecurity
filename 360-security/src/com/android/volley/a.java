// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import java.util.Collections;
import java.util.Map;

public interface com.android.volley.a
{
    public static class a
    {

        public byte a[];
        public String b;
        public long c;
        public long d;
        public long e;
        public Map f;

        public boolean a()
        {
            return d < System.currentTimeMillis();
        }

        public boolean b()
        {
            return e < System.currentTimeMillis();
        }

        public a()
        {
            f = Collections.emptyMap();
        }
    }


    public abstract a a(String s);

    public abstract void a();

    public abstract void a(String s, a a1);
}
