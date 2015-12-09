// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.base;

import com.google.common.base.Function;

// Referenced classes of package com.google.android.apps.wallet.hce.base:
//            Nonnulls

public abstract class NonnullFunction
    implements Function
{

    public NonnullFunction()
    {
    }

    public final Object apply(Object obj)
    {
        return applyNonnull(Nonnulls.nonnull(obj));
    }

    public abstract Object applyNonnull(Object obj);

    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public int hashCode()
    {
        return super.hashCode();
    }
}
