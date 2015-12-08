// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;


public final class  extends Enum
{

    public static final DOWNLOADING DOWNLOADING;
    public static final DOWNLOADING EXISTS_IN_ASSETS;
    public static final DOWNLOADING NONE;
    private static final DOWNLOADING a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/leanplum/FileManager$DownloadFileResult, s);
    }

    public static [] values()
    {
         a1[] = a;
        int i = a1.length;
         a2[] = new a[i];
        System.arraycopy(a1, 0, a2, 0, i);
        return a2;
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        EXISTS_IN_ASSETS = new <init>("EXISTS_IN_ASSETS", 1);
        DOWNLOADING = new <init>("DOWNLOADING", 2);
        a = (new a[] {
            NONE, EXISTS_IN_ASSETS, DOWNLOADING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
