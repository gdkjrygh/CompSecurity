// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.akita.gestrueimageview;


// Referenced classes of package com.alibaba.akita.gestrueimageview:
//            GestureImageView

static class 
{

    static final int a[];

    static 
    {
        a = new int[android.widget..values().length];
        try
        {
            a[android.widget..CENTER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[android.widget..CENTER_CROP.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[android.widget..CENTER_INSIDE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
