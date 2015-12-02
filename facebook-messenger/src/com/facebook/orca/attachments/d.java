// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.attachments;


public final class d extends Enum
{

    private static final d $VALUES[];
    public static final d OTHER_HIGHLIGHTED;
    public static final d OTHER_NORMAL;
    public static final d SELF_HIGHLIGHTED;
    public static final d SELF_NORMAL;

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/orca/attachments/d, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    static 
    {
        SELF_NORMAL = new d("SELF_NORMAL", 0);
        SELF_HIGHLIGHTED = new d("SELF_HIGHLIGHTED", 1);
        OTHER_NORMAL = new d("OTHER_NORMAL", 2);
        OTHER_HIGHLIGHTED = new d("OTHER_HIGHLIGHTED", 3);
        $VALUES = (new d[] {
            SELF_NORMAL, SELF_HIGHLIGHTED, OTHER_NORMAL, OTHER_HIGHLIGHTED
        });
    }
}
