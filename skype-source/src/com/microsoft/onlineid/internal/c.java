// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.text.TextUtils;
import com.microsoft.onlineid.d;
import com.microsoft.onlineid.i;
import java.util.Locale;

public final class c
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/microsoft/onlineid/internal/c$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        public final String a()
        {
            return (new StringBuilder("com.microsoft.msa.authenticator.")).append(name()).toString();
        }

        static 
        {
            a = new a("Exception", 0);
            b = new a("UINeededIntent", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int j)
        {
            super(s, j);
        }
    }


    private final Bundle a;

    public c()
    {
        this(new Bundle());
    }

    public c(Bundle bundle)
    {
        a = bundle;
    }

    private static String a(d d1)
    {
        return TextUtils.join(".", new Object[] {
            "com.microsoft.msa.authenticator", "Ticket", d1.a().toLowerCase(Locale.US), d1.b().toLowerCase(Locale.US)
        });
    }

    public final Bundle a()
    {
        return a;
    }

    public final c a(PendingIntent pendingintent)
    {
        a.putParcelable(a.b.a(), pendingintent);
        return this;
    }

    public final c a(i j)
    {
        d d1 = j.a();
        a.putSerializable(b.a.j.a(), d1);
        a.putSerializable(a(j.a()), j);
        return this;
    }

    public final c a(Exception exception)
    {
        a.putSerializable(a.a.a(), exception);
        return this;
    }

    public final c a(String s)
    {
        a.putString(b.a.b.a(), s);
        return this;
    }

    public final c b(String s)
    {
        a.putString(b.a.g.a(), s);
        return this;
    }

    public final String b()
    {
        return a.getString(b.a.b.a());
    }

    public final String c()
    {
        return a.getString(b.a.g.a());
    }

    public final i d()
    {
        d d1 = (d)a.getSerializable(b.a.j.a());
        if (d1 == null)
        {
            return null;
        } else
        {
            return (i)a.getSerializable(a(d1));
        }
    }

    public final Exception e()
    {
        return (Exception)a.getSerializable(a.a.a());
    }

    public final PendingIntent f()
    {
        return (PendingIntent)a.getParcelable(a.b.a());
    }
}
