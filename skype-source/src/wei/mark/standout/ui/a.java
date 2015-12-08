// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package wei.mark.standout.ui;

import java.util.Locale;

public final class a
{

    public int a;
    public int b;
    public int c;
    public int d;
    public double e;
    public double f;
    public double g;
    public double h;
    public float i;
    public boolean j;

    public a()
    {
    }

    public final String toString()
    {
        return String.format(Locale.US, "WindowTouchInfo { firstX=%d, firstY=%d,lastX=%d, lastY=%d, firstWidth=%d, firstHeight=%d }", new Object[] {
            Integer.valueOf(a), Integer.valueOf(b), Integer.valueOf(c), Integer.valueOf(d), Double.valueOf(g), Double.valueOf(h)
        });
    }
}
