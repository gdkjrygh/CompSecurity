// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user.tiles;


// Referenced classes of package com.facebook.user.tiles:
//            f

class d
{

    static final int a[];

    static 
    {
        a = new int[f.values().length];
        try
        {
            a[f.PIC_CROP_INFO.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[f.USER_KEY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
