// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.layertype;


public final class LayerType extends Enum
{

    private static final LayerType $VALUES[];
    public static final LayerType HARDWARE;
    public static final LayerType NONE;
    public static final LayerType SOFTWARE;
    private int a;

    private LayerType(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static LayerType valueOf(String s)
    {
        return (LayerType)Enum.valueOf(com/snapchat/android/ui/layertype/LayerType, s);
    }

    public static LayerType[] values()
    {
        return (LayerType[])$VALUES.clone();
    }

    public final int getFrameworkLayerValue()
    {
        return a;
    }

    static 
    {
        NONE = new LayerType("NONE", 0, 0);
        HARDWARE = new LayerType("HARDWARE", 1, 2);
        SOFTWARE = new LayerType("SOFTWARE", 2, 1);
        $VALUES = (new LayerType[] {
            NONE, HARDWARE, SOFTWARE
        });
    }
}
