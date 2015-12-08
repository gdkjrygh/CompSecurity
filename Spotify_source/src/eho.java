// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eho
{

    int a;

    public eho()
    {
        a = 65535;
    }

    public final byte a(byte byte0)
    {
        a = (a >>> 8 | a << 8) & 0xffff;
        a = a ^ byte0 & 0xff;
        a = a ^ (a & 0xff) >> 4;
        a = a ^ a << 12 & 0xffff;
        a = a ^ (a & 0xff) << 5 & 0xffff;
        return byte0;
    }
}
