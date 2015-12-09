// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;


// Referenced classes of package com.pandora.android.util:
//            f

static final class  extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pandora/android/util/f$a, s);
    }

    public static [] values()
    {
        return ([])h.clone();
    }

    static 
    {
        a = new <init>("MP3_APP_SHOW_ALBUM_DETAILS", 0);
        b = new <init>("MP3_APP_SHOW_TRACK_DETAILS", 1);
        c = new <init>("MP3_APP_SEARCH", 2);
        d = new <init>("BROWSER_ALBUM_SONG_URL", 3);
        e = new <init>("BROWSER_ALBUM_URL", 4);
        f = new <init>("BROWSER_SONG_URL", 5);
        g = new <init>("BROWSER_SEARCH_URL", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
