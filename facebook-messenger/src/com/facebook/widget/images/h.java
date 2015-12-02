// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images;


final class h extends Enum
{

    private static final h $VALUES[];
    public static final h LOADED_IMAGE;
    public static final h PLACEHOLDER;
    public static final h PROGRESS_BAR;

    private h(String s, int i)
    {
        super(s, i);
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/facebook/widget/images/h, s);
    }

    public static h[] values()
    {
        return (h[])$VALUES.clone();
    }

    static 
    {
        PLACEHOLDER = new h("PLACEHOLDER", 0);
        LOADED_IMAGE = new h("LOADED_IMAGE", 1);
        PROGRESS_BAR = new h("PROGRESS_BAR", 2);
        $VALUES = (new h[] {
            PLACEHOLDER, LOADED_IMAGE, PROGRESS_BAR
        });
    }
}
