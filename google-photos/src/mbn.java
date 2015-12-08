// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class mbn
    implements mbe
{

    kou a;

    public mbn()
    {
        a = new kou();
    }

    public mbd a()
    {
        return new mbm(a.a());
    }

    public final mbe a(String s)
    {
        a.b = s;
        return this;
    }

    public final mbe a(boolean flag)
    {
        a.d = true;
        return this;
    }

    public final mbe b(String s)
    {
        a.c = s;
        return this;
    }
}
