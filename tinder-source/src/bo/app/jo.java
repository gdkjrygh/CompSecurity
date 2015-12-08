// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.widget.ImageView;

// Referenced classes of package bo.app:
//            jp

public final class jo extends Enum
{

    public static final int a;
    public static final int b;
    private static final int c[];

    public static int a(ImageView imageview)
    {
        switch (jp.a[imageview.getScaleType().ordinal()])
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

    public static int[] a()
    {
        return (int[])c.clone();
    }

    static 
    {
        a = 1;
        b = 2;
        c = (new int[] {
            a, b
        });
    }
}
