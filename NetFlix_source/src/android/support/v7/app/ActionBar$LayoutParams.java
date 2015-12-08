// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.app:
//            ActionBar

public static class gravity extends android.view.arams
{

    public int gravity;

    public (int i)
    {
        this(-2, -1, i);
    }

    public <init>(int i, int j)
    {
        super(i, j);
        gravity = -1;
        gravity = 19;
    }

    public gravity(int i, int j, int k)
    {
        super(i, j);
        gravity = -1;
        gravity = k;
    }

    public gravity(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        gravity = -1;
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.yout);
        gravity = context.getInt(0, -1);
        context.recycle();
    }

    public gravity(gravity gravity1)
    {
        super(gravity1);
        gravity = -1;
        gravity = gravity1.gravity;
    }

    public gravity(android.view.outParams outparams)
    {
        super(outparams);
        gravity = -1;
    }
}
