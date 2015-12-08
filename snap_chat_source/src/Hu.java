// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Paint;
import com.snapchat.android.ui.swipefilters.FilterPageType;

public final class Hu
{

    public Paint a;

    public Hu()
    {
    }

    public static int a(Hz hz, int i, int j)
    {
        if (hz.b(i) == FilterPageType.BACKGROUNDFILTER)
        {
            return i;
        } else
        {
            return j;
        }
    }

    public final Paint a(Ho ho)
    {
        Paint paint = ho.c();
        ho = paint;
        if (paint == null)
        {
            ho = a;
        }
        return ho;
    }
}
