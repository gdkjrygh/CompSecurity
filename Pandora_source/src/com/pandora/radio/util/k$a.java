// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;


// Referenced classes of package com.pandora.radio.util:
//            k

public static final class  extends Enum
{

    public static final l a;
    public static final l b;
    public static final l c;
    public static final l d;
    public static final l e;
    public static final l f;
    public static final l g;
    public static final l h;
    public static final l i;
    public static final l j;
    public static final l k;
    public static final l l;
    private static final l m[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pandora/radio/util/k$a, s);
    }

    public static [] values()
    {
        return ([])m.clone();
    }

    static 
    {
        a = new <init>("close_ad_tapped", 0);
        b = new <init>("close_ad_api_called", 1);
        c = new <init>("why_ads_tapped", 2);
        d = new <init>("why_ads_api_called", 3);
        e = new <init>("close_ad_swipe", 4);
        f = new <init>("close_ad_scroll", 5);
        g = new <init>("landing_page_open", 6);
        h = new <init>("landing_page_done", 7);
        i = new <init>("landing_page_app_resign", 8);
        j = new <init>("landing_page_app_active", 9);
        k = new <init>("web_view_error", 10);
        l = new <init>("value_exchange_started", 11);
        m = (new m[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }

    private (String s, int i1)
    {
        super(s, i1);
    }
}
