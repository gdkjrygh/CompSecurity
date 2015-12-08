// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aju
{

    public ahn a;
    public String b;
    ajx c;
    aic d;
    aib e;
    public boolean f;
    public ajo g;

    aju(ahn ahn1, String s, ajx ajx)
    {
        d = null;
        e = null;
        f = true;
        g = null;
        a = ahn1;
        b = s;
        c = ajx;
    }

    public final ahs a(int ai[])
    {
        ai = e.a.a(ai);
        if (ai != null)
        {
            a.a(ai);
        }
        return ai;
    }

    public final void a(ahs ahs1)
    {
        if (ahs1.c() == -1L)
        {
            ahs1.a(a.mCurrentTimestamp);
        }
        e.a.a(ahs1);
    }

    public final boolean a()
    {
        return e == null || e.a.b();
    }

    public final String toString()
    {
        String s = a.mName;
        String s1 = b;
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(":").append(s1).toString();
    }
}
