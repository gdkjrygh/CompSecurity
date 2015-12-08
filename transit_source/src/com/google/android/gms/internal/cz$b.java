// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//            cz

static final class kv extends android.graphics.drawable.ble.ConstantState
{

    int ku;
    int kv;

    public int getChangingConfigurations()
    {
        return ku;
    }

    public Drawable newDrawable()
    {
        return new cz(this);
    }

    nstantState(nstantState nstantstate)
    {
        if (nstantstate != null)
        {
            ku = nstantstate.ku;
            kv = nstantstate.kv;
        }
    }
}
