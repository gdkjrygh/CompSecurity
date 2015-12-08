// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;


public final class h
{
    public static final class a extends Exception
    {

        public a()
        {
        }

        public a(String s)
        {
            super(s);
        }
    }


    private boolean a;
    private int b;

    public h()
    {
        a = true;
        b = 5;
    }

    public final void a()
    {
        a = true;
        b = 5;
    }

    public final boolean b()
    {
        return b > 0;
    }

    public final void c()
    {
        if (b <= 0)
        {
            throw new a("Handling a response for more requests that the policy allows. Caller should break");
        }
        if (!a)
        {
            b = b - 1;
            return;
        } else
        {
            a = false;
            return;
        }
    }
}
