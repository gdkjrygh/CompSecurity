// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.leak;

import android.content.Context;
import com.qihoo.security.SecurityApplication;
import com.qihoo360.mobilesafe.share.SharedPref;

public class e
{
    static interface a
    {

        public abstract long a(String s, long l);

        public abstract void b(String s, long l);
    }

    private static class b
        implements a
    {

        private final Context a;

        public long a(String s, long l)
        {
            return SharedPref.b(a, s, l);
        }

        public void b(String s, long l)
        {
            SharedPref.a(a, s, l);
        }

        protected b(Context context)
        {
            a = context.getApplicationContext();
        }
    }


    public static final String a = com/qihoo/security/leak/e.getSimpleName();
    private final a b;

    e(a a1)
    {
        b = a1;
    }

    static e a()
    {
        return new e(new b(SecurityApplication.a()));
    }

    public long a(String s, long l)
    {
        return b.a(s, l);
    }

    public void b(String s, long l)
    {
        b.b(s, l);
    }

}
