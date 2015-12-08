// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.graphics.Color;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            gd

public static final class l extends Enum
{

    public static final j a;
    public static final j b;
    public static final j c;
    public static final j d;
    public static final j e;
    public static final j f;
    public static final j g;
    public static final j h;
    public static final j i;
    public static final j j;
    private static final j m[];
    public final int k;
    public final String l;

    public static l valueOf(String s)
    {
        return (l)Enum.valueOf(com/tremorvideo/sdk/android/videoad/gd$a, s);
    }

    public static l[] values()
    {
        return (l[])m.clone();
    }

    static 
    {
        a = new <init>("ButtonText", 0, -1, "button_text_color");
        b = new <init>("ButtonTextShadow", 1, Color.argb(150, 0, 0, 0), "button_text_shadow_color");
        c = new <init>("WatermarkText", 2, -1, "watermark_text_color");
        d = new <init>("InputText", 3, 0xff000000, "input_text_color");
        e = new <init>("InputHintText", 4, 0xff888888, "input_hint_text_color");
        f = new <init>("DialogFill", 5, Color.argb(153, 0, 0, 0), "dialog_color");
        g = new <init>("DialogTitle", 6, -1, "dialog_title_color");
        h = new <init>("DialogTitleShadow", 7, Color.argb(153, 0, 0, 0), "dialog_title_shadow_color");
        i = new <init>("DialogText", 8, 0xff888888, "dialog_text_color");
        j = new <init>("DialogButtonText", 9, 0xff000000, "dialog_button_text_color");
        m = (new m[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }

    private (String s, int i1, int j1, String s1)
    {
        super(s, i1);
        k = j1;
        l = s1;
    }
}
