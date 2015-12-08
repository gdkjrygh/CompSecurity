// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gqm
{

    public final ekp a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    gqm(gqn gqn1)
    {
        a = gqn1.b;
        d = gqn1.a;
        b = gqn1.e;
        c = gqn1.d;
        e = gqn1.c;
        f = gqn1.f;
    }

    public final String toString()
    {
        String s = String.valueOf("CastMedia{isViewingMedia=");
        boolean flag = d;
        int i = b;
        String s1 = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 39 + String.valueOf(s1).length())).append(s).append(flag).append(", accountId=").append(i).append(", current=").append(s1).append("}").toString();
    }
}
