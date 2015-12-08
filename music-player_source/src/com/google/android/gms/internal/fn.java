// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//            fk

final class fn extends android.graphics.drawable.Drawable.ConstantState
{

    int a;
    int b;

    fn(fn fn1)
    {
        if (fn1 != null)
        {
            a = fn1.a;
            b = fn1.b;
        }
    }

    public final int getChangingConfigurations()
    {
        return a;
    }

    public final Drawable newDrawable()
    {
        return new fk(this);
    }
}
