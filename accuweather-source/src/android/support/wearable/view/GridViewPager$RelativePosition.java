// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.wearable.view;


// Referenced classes of package android.support.wearable.view:
//            GridViewPager

static final class y extends Enum
{

    private static final BELOW $VALUES[];
    public static final BELOW ABOVE;
    public static final BELOW BELOW;
    public static final BELOW CENTER;
    public static final BELOW LEFT;
    public static final BELOW RIGHT;
    public final int x;
    public final int y;

    public static y get(int i, int j)
    {
        if (i < -1 || i > 1 || j < -1 || j > 1)
        {
            throw new IllegalArgumentException("x and y must be in the range of [-1, 1]");
        }
        if (i != 0 && j != 0)
        {
            throw new IllegalArgumentException("one of x or y must be equal to 0");
        }
        if (j == 0)
        {
            return values()[i + 1];
        }
        if (j == -1)
        {
            return ABOVE;
        } else
        {
            return BELOW;
        }
    }

    public static BELOW valueOf(String s)
    {
        return (BELOW)Enum.valueOf(android/support/wearable/view/GridViewPager$RelativePosition, s);
    }

    public static BELOW[] values()
    {
        return (BELOW[])$VALUES.clone();
    }

    static 
    {
        LEFT = new <init>("LEFT", 0, -1, 0);
        CENTER = new <init>("CENTER", 1, 0, 0);
        RIGHT = new <init>("RIGHT", 2, 1, 0);
        ABOVE = new <init>("ABOVE", 3, 0, -1);
        BELOW = new <init>("BELOW", 4, 0, 1);
        $VALUES = (new .VALUES[] {
            LEFT, CENTER, RIGHT, ABOVE, BELOW
        });
    }

    private (String s, int i, int j, int k)
    {
        super(s, i);
        x = j;
        y = k;
    }
}
