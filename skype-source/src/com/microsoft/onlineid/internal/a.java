// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.microsoft.onlineid.i;
import com.microsoft.onlineid.sts.b;

public final class com.microsoft.onlineid.internal.a
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a d[];
        private final String c;

        public static a a(String s)
        {
            a aa[] = values();
            int j = aa.length;
            for (int i = 0; i < j; i++)
            {
                a a1 = aa[i];
                if (a1.c.equals(s))
                {
                    return a1;
                }
            }

            return null;
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/microsoft/onlineid/internal/a$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        public final String a()
        {
            return c;
        }

        static 
        {
            a = new a("Account", 0, "account");
            b = new a("Ticket", 1, "ticket");
            d = (new a[] {
                a, b
            });
        }

        private a(String s, int i, String s1)
        {
            super(s, i);
            c = s1;
        }
    }


    protected final Activity a;
    protected final Bundle b = new Bundle();
    protected int c;

    public com.microsoft.onlineid.internal.a(Activity activity, a a1)
    {
        a = activity;
        b.putString("com.microsoft.onlineid.result_type", a1.a());
        b.putBundle("com.microsoft.onlineid.client_state", a.getIntent().getBundleExtra("com.microsoft.onlineid.client_state"));
        c = 0;
        a();
    }

    public final com.microsoft.onlineid.internal.a a(i i)
    {
        b.putAll(com.microsoft.onlineid.internal.sso.a.a(i));
        c = -1;
        return this;
    }

    public final com.microsoft.onlineid.internal.a a(b b1)
    {
        b.putAll(com.microsoft.onlineid.internal.sso.a.a(b1));
        c = -1;
        return this;
    }

    public final com.microsoft.onlineid.internal.a a(Exception exception)
    {
        b.putAll(com.microsoft.onlineid.internal.sso.a.a(exception));
        c = -1;
        return this;
    }

    public final com.microsoft.onlineid.internal.a a(String s, boolean flag)
    {
        b.putString("com.microsoft.onlineid.user_cid", s);
        b.putBoolean("com.microsoft.onlineid.signed_out_this_app_only", flag);
        return a(((Exception) (new com.microsoft.onlineid.internal.b.a("The account was signed out."))));
    }

    public final void a()
    {
        a.setResult(c, (new Intent()).putExtras(b));
    }
}
