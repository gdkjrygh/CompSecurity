// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//            ex

static final class CN extends android.graphics.drawable.ble.ConstantState
{

    int CM;
    int CN;

    public int getChangingConfigurations()
    {
        return CM;
    }

    public Drawable newDrawable()
    {
        return new ex(this);
    }

    nstantState(nstantState nstantstate)
    {
        if (nstantstate != null)
        {
            CM = nstantstate.CM;
            CN = nstantstate.CN;
        }
    }
}
