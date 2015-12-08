// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;


// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            IGsonable, PICDeviceConfig

public static class etting.delayMs
    implements IGsonable
{

    public etting uncreatedCollage;
    public etting unfinishedCollage;

    public String toString()
    {
        return (new StringBuilder()).append("unfinished_collage : ").append(unfinishedCollage.toString()).append("\n").append("uncreated_collage : ").append(uncreatedCollage.toString()).toString();
    }

    public etting()
    {
        unfinishedCollage = new etting();
        unfinishedCollage.enable = true;
        unfinishedCollage.delayMs = 0x5265c00L;
        uncreatedCollage = new etting();
        uncreatedCollage.enable = true;
        uncreatedCollage.delayMs = 0x5265c00L;
    }
}
