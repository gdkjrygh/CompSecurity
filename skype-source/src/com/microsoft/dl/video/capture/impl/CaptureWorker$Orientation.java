// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl;


// Referenced classes of package com.microsoft.dl.video.capture.impl:
//            CaptureWorker

private static final class c extends Enum
{

    public static final PORTRAIT_UPSIDEDOWN LANDSCAPE_LEFT;
    public static final PORTRAIT_UPSIDEDOWN LANDSCAPE_RIGHT;
    public static final PORTRAIT_UPSIDEDOWN PORTRAIT;
    public static final PORTRAIT_UPSIDEDOWN PORTRAIT_UPSIDEDOWN;
    private static final PORTRAIT_UPSIDEDOWN d[];
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/microsoft/dl/video/capture/impl/CaptureWorker$Orientation, s);
    }

    public static c[] values()
    {
        return (c[])d.clone();
    }

    public final boolean isHorizFlipped()
    {
        return b;
    }

    public final boolean isTransposed()
    {
        return c;
    }

    public final boolean isVertFlipped()
    {
        return a;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(name()).append(" (");
        String s;
        if (a)
        {
            s = "V";
        } else
        {
            s = "-";
        }
        stringbuilder = stringbuilder.append(s);
        if (b)
        {
            s = "H";
        } else
        {
            s = "-";
        }
        stringbuilder = stringbuilder.append(s);
        if (c)
        {
            s = "T";
        } else
        {
            s = "-";
        }
        return stringbuilder.append(s).append(")").toString();
    }

    static 
    {
        LANDSCAPE_LEFT = new <init>("LANDSCAPE_LEFT", 0, false, false, false);
        PORTRAIT = new <init>("PORTRAIT", 1, false, true, true);
        LANDSCAPE_RIGHT = new <init>("LANDSCAPE_RIGHT", 2, true, true, false);
        PORTRAIT_UPSIDEDOWN = new <init>("PORTRAIT_UPSIDEDOWN", 3, true, false, true);
        d = (new d[] {
            LANDSCAPE_LEFT, PORTRAIT, LANDSCAPE_RIGHT, PORTRAIT_UPSIDEDOWN
        });
    }

    private (String s, int i, boolean flag, boolean flag1, boolean flag2)
    {
        super(s, i);
        a = flag;
        b = flag1;
        c = flag2;
    }
}
