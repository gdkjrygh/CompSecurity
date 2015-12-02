// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.widgets;


public final class d extends Enum
{

    private static final d $VALUES[];
    public static final d NORMAL;
    public static final d WARNING;

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/orca/common/ui/widgets/d, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    static 
    {
        NORMAL = new d("NORMAL", 0);
        WARNING = new d("WARNING", 1);
        $VALUES = (new d[] {
            NORMAL, WARNING
        });
    }
}
