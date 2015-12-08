// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import android.widget.ImageView;

// Referenced classes of package com.a.a.b.a:
//            j

public final class i extends Enum
{

    public static final i a;
    public static final i b;
    private static final i c[];

    private i(String s, int k)
    {
        super(s, k);
    }

    public static i a(ImageView imageview)
    {
        switch (j.a[imageview.getScaleType().ordinal()])
        {
        default:
            return b;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return a;
        }
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/a/a/b/a/i, s);
    }

    public static i[] values()
    {
        return (i[])c.clone();
    }

    static 
    {
        a = new i("FIT_INSIDE", 0);
        b = new i("CROP", 1);
        c = (new i[] {
            a, b
        });
    }
}
