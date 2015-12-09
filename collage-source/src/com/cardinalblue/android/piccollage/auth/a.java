// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.auth;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.cardinalblue.android.b.k;

public abstract class com.cardinalblue.android.piccollage.auth.a
{
    public static class a extends RuntimeException
    {

        protected final int a;
        protected final String b;

        public int a()
        {
            return a;
        }

        public String b()
        {
            return b;
        }

        public a()
        {
            a = -1;
            b = "AuthorizerException";
        }

        public a(int l)
        {
            a = l;
            b = "AuthorizerException";
        }
    }

    public static interface b
    {

        public abstract void a(Bundle bundle, a a1);

        public abstract void a(String s);
    }


    protected b a;

    public com.cardinalblue.android.piccollage.auth.a()
    {
        f();
        g();
    }

    private String h()
    {
        return getClass().getName();
    }

    private String i()
    {
        return (new StringBuilder()).append(h()).append("_access_token_key").toString();
    }

    private String j()
    {
        return (new StringBuilder()).append(h()).append("_user_key").toString();
    }

    public void a()
    {
        a(((String) (null)));
        b(null);
        f();
        g();
    }

    public void a(b b1)
    {
        if (!k.b(k.a()))
        {
            k.a(k.a(), 0x7f07021d, 1);
            return;
        } else
        {
            a = b1;
            c();
            return;
        }
    }

    public void a(String s)
    {
        k.a(i(), s);
    }

    public void b(String s)
    {
        k.a(j(), s);
    }

    public boolean b()
    {
        return false;
    }

    protected abstract void c();

    public String d()
    {
        String s = null;
        SharedPreferences sharedpreferences = k.j();
        if (sharedpreferences != null)
        {
            s = sharedpreferences.getString(i(), null);
        }
        return s;
    }

    public String e()
    {
        String s = null;
        SharedPreferences sharedpreferences = k.j();
        if (sharedpreferences != null)
        {
            s = sharedpreferences.getString(j(), null);
        }
        return s;
    }

    protected abstract void f();

    protected abstract void g();
}
