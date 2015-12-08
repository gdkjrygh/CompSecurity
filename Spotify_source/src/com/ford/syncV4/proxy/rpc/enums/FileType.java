// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class FileType extends Enum
{

    public static final FileType a;
    public static final FileType b;
    private static FileType c;
    private static FileType d;
    private static FileType e;
    private static FileType f;
    private static FileType g;
    private static FileType h;
    private static final FileType i[];

    private FileType(String s, int j)
    {
        super(s, j);
    }

    public static FileType a(String s)
    {
        return valueOf(s);
    }

    public static FileType valueOf(String s)
    {
        return (FileType)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/FileType, s);
    }

    public static FileType[] values()
    {
        return (FileType[])i.clone();
    }

    static 
    {
        c = new FileType("GRAPHIC_BMP", 0);
        d = new FileType("GRAPHIC_JPEG", 1);
        a = new FileType("GRAPHIC_PNG", 2);
        e = new FileType("AUDIO_WAVE", 3);
        f = new FileType("AUDIO_AAC", 4);
        g = new FileType("AUDIO_MP3", 5);
        h = new FileType("BINARY", 6);
        b = new FileType("JSON", 7);
        i = (new FileType[] {
            c, d, a, e, f, g, h, b
        });
    }
}
