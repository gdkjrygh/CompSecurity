// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Map;

public interface aa
{
    public static class a
    {

        public byte a[];
        public String b;
        public long c;
        public long d;
        public long e;
        public long f;
        public Map g;

        public boolean a()
        {
            return e < System.currentTimeMillis();
        }

        public boolean b()
        {
            return f < System.currentTimeMillis();
        }

        public a()
        {
            g = Collections.emptyMap();
        }
    }


    public abstract a a(String s);

    public abstract void a();

    public abstract void a(String s, a a1);
}
