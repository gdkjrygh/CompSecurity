// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images.internal;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.common.images.internal:
//            CrossFadingDrawable

static final class mChildrenChangingConfigurations extends android.graphics.drawable.RealTransitionState
{

    int mChangingConfigurations;
    int mChildrenChangingConfigurations;

    public final int getChangingConfigurations()
    {
        return mChangingConfigurations;
    }

    public final Drawable newDrawable()
    {
        return new CrossFadingDrawable(this);
    }

    ( )
    {
        if ( != null)
        {
            mChangingConfigurations = .mChangingConfigurations;
            mChildrenChangingConfigurations = .mChildrenChangingConfigurations;
        }
    }
}
