// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user.tiles;


public final class f extends Enum
{

    private static final f $VALUES[];
    public static final f PIC_CROP_INFO;
    public static final f USER_KEY;

    private f(String s, int i)
    {
        super(s, i);
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/facebook/user/tiles/f, s);
    }

    public static f[] values()
    {
        return (f[])$VALUES.clone();
    }

    static 
    {
        PIC_CROP_INFO = new f("PIC_CROP_INFO", 0);
        USER_KEY = new f("USER_KEY", 1);
        $VALUES = (new f[] {
            PIC_CROP_INFO, USER_KEY
        });
    }
}
