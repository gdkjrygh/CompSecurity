// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class ImageType extends Enum
{

    public static final ImageType a;
    public static final ImageType b;
    private static final ImageType c[];

    private ImageType(String s, int i)
    {
        super(s, i);
    }

    public static ImageType valueOf(String s)
    {
        return (ImageType)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/ImageType, s);
    }

    public static ImageType[] values()
    {
        return (ImageType[])c.clone();
    }

    static 
    {
        a = new ImageType("STATIC", 0);
        b = new ImageType("DYNAMIC", 1);
        c = (new ImageType[] {
            a, b
        });
    }
}
