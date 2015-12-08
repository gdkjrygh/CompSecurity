// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.basictlv;

import com.google.android.apps.wallet.hce.base.NonnullFunction;

// Referenced classes of package com.google.android.apps.wallet.hce.basictlv:
//            BasicTlv

final class  extends NonnullFunction
{

    private static Integer applyNonnull(BasicTlv basictlv)
    {
        return Integer.valueOf(basictlv.getTag());
    }

    public final volatile Object applyNonnull(Object obj)
    {
        return applyNonnull((BasicTlv)obj);
    }

    ()
    {
    }
}
