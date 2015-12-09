// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget.carousel;


// Referenced classes of package com.spotify.android.paste.widget.carousel:
//            CarouselLayoutManager

public final class rollDirection
{

    public static final int a[];

    static 
    {
        a = new int[rollDirection.values().length];
        try
        {
            a[rollDirection.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[rollDirection.c.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
