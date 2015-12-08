// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;


// Referenced classes of package com.kik.view.adapters:
//            au

private static final class  extends Enum
{

    public static final k a;
    public static final k b;
    public static final k c;
    public static final k d;
    public static final k e;
    public static final k f;
    public static final k g;
    public static final k h;
    public static final k i;
    public static final k j;
    public static final k k;
    private static final k l[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kik/view/adapters/au$a, s);
    }

    public static [] values()
    {
        return ([])l.clone();
    }

    static 
    {
        a = new <init>("VIEW_TYPE_SYSTEM", 0);
        b = new <init>("VIEW_TYPE_CHAT", 1);
        c = new <init>("VIEW_TYPE_ARTICLE", 2);
        d = new <init>("VIEW_TYPE_REDACTED", 3);
        e = new <init>("VIEW_TYPE_CONTENT_PHOTO", 4);
        f = new <init>("VIEW_TYPE_CONTENT_PNG_PHOTO", 5);
        g = new <init>("VIEW_TYPE_FULL_BLEED", 6);
        h = new <init>("VIEW_TYPE_VIDEO_FULL_BLEED", 7);
        i = new <init>("VIEW_TYPE_VIDEO_CLASSIC", 8);
        j = new <init>("VIEW_TYPE_BANNER", 9);
        k = new <init>("VIEW_TYPE_GIF", 10);
        l = (new l[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }

    private (String s, int i1)
    {
        super(s, i1);
    }
}
