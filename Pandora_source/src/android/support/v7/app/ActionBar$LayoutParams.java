// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.app:
//            ActionBar

public static class a extends android.view.arams
{

    public int a;

    public (int i)
    {
        this(-2, -1, i);
    }

    public <init>(int i, int j, int k)
    {
        super(i, j);
        a = -1;
        a = k;
    }

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = -1;
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.yout);
        a = context.getInt(0, -1);
        context.recycle();
    }
}
