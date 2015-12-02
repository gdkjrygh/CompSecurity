// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bzw
{

    Integer a;
    public String b;

    public bzw(String s, Integer integer)
    {
        b = s;
        a = integer;
    }

    public final boolean a()
    {
        return a != null && a.equals(Integer.valueOf(401));
    }

    public final boolean b()
    {
        return a() && b.equals("2fa_required");
    }

    public final boolean c()
    {
        return b.equals(brf.b.toString());
    }
}
