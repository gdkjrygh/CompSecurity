// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

public final class nn extends android.view.ViewGroup.LayoutParams
{

    public boolean a;
    public int b;
    public float c;
    public boolean d;
    public int e;
    public int f;

    public nn()
    {
        super(-1, -1);
        c = 0.0F;
    }

    public nn(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 0.0F;
        context = context.obtainStyledAttributes(attributeset, ViewPager.h());
        b = context.getInteger(0, 48);
        context.recycle();
    }
}
