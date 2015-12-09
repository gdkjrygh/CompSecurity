// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//            zzhd

static final class b extends android.graphics.drawable.e.ConstantState
{

    int a;
    int b;

    public int getChangingConfigurations()
    {
        return a;
    }

    public Drawable newDrawable()
    {
        return new zzhd(this);
    }

    tantState(tantState tantstate)
    {
        if (tantstate != null)
        {
            a = tantstate.a;
            b = tantstate.b;
        }
    }
}
