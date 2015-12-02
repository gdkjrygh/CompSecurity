// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.v4.view:
//            ViewPager

public class ay extends android.view.ViewGroup.LayoutParams
{

    public boolean a;
    public int b;
    public float c;
    public boolean d;

    public ay()
    {
        super(-1, -1);
        c = 0.0F;
    }

    public ay(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 0.0F;
        context = context.obtainStyledAttributes(attributeset, ViewPager.i());
        b = context.getInteger(0, 48);
        context.recycle();
    }
}
