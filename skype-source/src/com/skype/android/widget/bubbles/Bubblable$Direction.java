// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.bubbles;

import android.content.res.Resources;
import android.view.View;

// Referenced classes of package com.skype.android.widget.bubbles:
//            Bubblable

public static final class h extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c i[];
    private final int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/skype/android/widget/bubbles/Bubblable$Direction, s);
    }

    public static h[] values()
    {
        return (h[])i.clone();
    }

    public final int a()
    {
        return d;
    }

    public final void a(View view)
    {
        Resources resources = view.getResources();
        view.setPadding(resources.getDimensionPixelSize(e), resources.getDimensionPixelSize(f), resources.getDimensionPixelSize(g), resources.getDimensionPixelSize(h));
    }

    static 
    {
        a = new <init>("INBOUND", 0, 0x7f0e002a, 0x7f0c009d, 0x7f0c0071, 0x7f0c009e, 0x7f0c0070);
        b = new <init>("OUTBOUND", 1, 0x7f0e0032, 0x7f0c00ba, 0x7f0c0071, 0x7f0c00bb, 0x7f0c0070);
        c = new <init>("NO_BUBBLE", 2, 0x7f0e0031, 0x7f0c0201, 0x7f0c0203, 0x7f0c0202, 0x7f0c0200);
        i = (new i[] {
            a, b, c
        });
    }

    private (String s, int j, int k, int l, int i1, int j1, int k1)
    {
        super(s, j);
        d = k;
        e = l;
        f = i1;
        g = j1;
        h = k1;
    }
}
