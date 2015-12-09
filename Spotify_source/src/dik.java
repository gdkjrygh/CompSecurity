// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ImageView;

public final class dik
{

    public boolean a;
    private ImageView b;
    private int c;
    private int d;
    private int e;

    public dik(ImageView imageview)
    {
        b = imageview;
    }

    private int b(int i)
    {
        if (a)
        {
            return 0;
        } else
        {
            return -(int)((1.0F - (float)i / (float)d) * (float)(b.getMeasuredHeight() - d));
        }
    }

    public final void a()
    {
        int i = b(e);
        b.layout(0, i, b.getMeasuredWidth(), b.getMeasuredHeight() + i);
    }

    public final void a(int i)
    {
        e = i;
        i = b(i);
        int j = b.getTop();
        b.offsetTopAndBottom(i - j);
        km.d(b);
    }

    public final void a(int i, int j, int k)
    {
        c = i;
        d = j;
        i = k;
        if (!a)
        {
            i = (int)((float)k * 1.4F);
        }
        b.measure(android.view.View.MeasureSpec.makeMeasureSpec(c, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000));
    }
}
