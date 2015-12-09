// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dow
    implements doy
{

    private static final dow a = new dow();

    private dow()
    {
    }

    public static doy a()
    {
        return a;
    }

    public final int a(dqz dqz1)
    {
        return dqz1.getMaxRows();
    }

}
