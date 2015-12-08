// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;


// Referenced classes of package com.squareup.picasso:
//            Picasso

public static final class debugColor extends Enum
{

    private static final NETWORK $VALUES[];
    public static final NETWORK DISK;
    public static final NETWORK MEMORY;
    public static final NETWORK NETWORK;
    final int debugColor;

    public static debugColor valueOf(String s)
    {
        return (debugColor)Enum.valueOf(com/squareup/picasso/Picasso$LoadedFrom, s);
    }

    public static debugColor[] values()
    {
        return (debugColor[])$VALUES.clone();
    }

    static 
    {
        MEMORY = new <init>("MEMORY", 0, 0xff00ff00);
        DISK = new <init>("DISK", 1, -256);
        NETWORK = new <init>("NETWORK", 2, 0xffff0000);
        $VALUES = (new .VALUES[] {
            MEMORY, DISK, NETWORK
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        debugColor = j;
    }
}
