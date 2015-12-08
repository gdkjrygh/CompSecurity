// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture;


// Referenced classes of package com.microsoft.dl.video.capture:
//            DeviceManager

private static class c
{

    private final int a;
    private final com.microsoft.dl.video.capture.api. b;
    private final String c;

    public com.microsoft.dl.video.capture.api. getFacing()
    {
        return b;
    }

    public String getName()
    {
        return c;
    }

    public int getOrientation()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [orientation=").append(a).append(", facing=").append(b).append(", name=").append(c).append("]").toString();
    }

    public cing(int i, com.microsoft.dl.video.capture.api. , String s)
    {
        a = i;
        b = ;
        c = s;
    }
}
