// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            IClientLogging

public static final class A extends Enum
{

    private static final profileAvatar $VALUES[];
    public static final profileAvatar bif;
    public static final profileAvatar boxArt;
    public static final profileAvatar heroImage;
    public static final profileAvatar merchStill;
    public static final profileAvatar profileAvatar;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/netflix/mediaclient/servicemgr/IClientLogging$AssetType, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        boxArt = new <init>("boxArt", 0);
        merchStill = new <init>("merchStill", 1);
        bif = new <init>("bif", 2);
        heroImage = new <init>("heroImage", 3);
        profileAvatar = new <init>("profileAvatar", 4);
        $VALUES = (new .VALUES[] {
            boxArt, merchStill, bif, heroImage, profileAvatar
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
