// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package com.android.widget:
//            ResolverDrawerLayout

public static class b extends android.view.arams
{

    public boolean a;
    public boolean b;

    public (int i, int j)
    {
        super(i, j);
    }

    public (Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, com.pandora.android.ayoutParams);
        a = context.getBoolean(1, false);
        b = context.getBoolean(2, false);
        context.recycle();
    }

    public b(android.view.arams arams)
    {
        super(arams);
    }

    public b(android.view.arams arams)
    {
        super(arams);
    }

    public b(b b1)
    {
        super(b1);
        a = b1.a;
        b = b1.b;
    }
}
