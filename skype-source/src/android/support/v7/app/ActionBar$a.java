// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.app:
//            ActionBar

public static class a extends android.view.rginLayoutParams
{

    public int a;

    public ()
    {
        super(-2, -2);
        a = 0;
        a = 0x800013;
    }

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.rLayout);
        a = context.getInt(android.support.v7.appcompat.rLayout_android_layout_gravity, 0);
        context.recycle();
    }

    public Params(cle cle)
    {
        super(cle);
        a = 0;
        a = cle.a;
    }

    public (android.view.youtParams youtparams)
    {
        super(youtparams);
        a = 0;
    }
}
