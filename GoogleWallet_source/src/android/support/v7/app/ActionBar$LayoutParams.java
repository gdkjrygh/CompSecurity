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

    public (int i, int j)
    {
        super(i, j);
        gravity = 0;
        gravity = 0x800013;
    }

    public gravity(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        gravity = 0;
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.yout);
        gravity = context.getInt(android.support.v7.appcompat.yout_android_layout_gravity, 0);
        context.recycle();
    }

    public ut_gravity(ut_gravity ut_gravity)
    {
        super(ut_gravity);
        gravity = 0;
        gravity = ut_gravity.gravity;
    }

    public gravity(android.view.outParams outparams)
    {
        super(outparams);
        gravity = 0;
    }
}
