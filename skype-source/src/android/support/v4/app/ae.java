// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

public final class ae extends RemoteInputCompatBase.RemoteInput
{
    public static final class a
    {

        private final String a;
        private CharSequence b;
        private CharSequence c[];
        private boolean d;
        private Bundle e;

        public final a a(CharSequence charsequence)
        {
            b = charsequence;
            return this;
        }

        public final a a(CharSequence acharsequence[])
        {
            c = acharsequence;
            return this;
        }

        public final ae a()
        {
            return new ae(a, b, c, d, e);
        }

        public a(String s)
        {
            d = true;
            e = new Bundle();
            a = s;
        }
    }

    static interface b
    {
    }

    static final class c
        implements b
    {

        c()
        {
        }
    }

    static final class d
        implements b
    {

        d()
        {
        }
    }

    static final class e
        implements b
    {

        e()
        {
        }
    }


    public static final RemoteInputCompatBase.RemoteInput.Factory a = new RemoteInputCompatBase.RemoteInput.Factory() {

        public final RemoteInputCompatBase.RemoteInput build(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
        {
            return new ae(s, charsequence, acharsequence, flag, bundle);
        }

        public final volatile RemoteInputCompatBase.RemoteInput[] newArray(int i)
        {
            return new ae[i];
        }

    };
    private static final b g;
    private final String b;
    private final CharSequence c;
    private final CharSequence d[];
    private final boolean e;
    private final Bundle f;

    ae(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
    {
        b = s;
        c = charsequence;
        d = acharsequence;
        e = flag;
        f = bundle;
    }

    public final String a()
    {
        return b;
    }

    public final CharSequence b()
    {
        return c;
    }

    public final CharSequence[] c()
    {
        return d;
    }

    public final boolean d()
    {
        return e;
    }

    public final Bundle e()
    {
        return f;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            g = new c();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            g = new e();
        } else
        {
            g = new d();
        }
    }
}
