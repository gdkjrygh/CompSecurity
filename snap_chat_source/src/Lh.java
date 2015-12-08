// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.analytics.framework.UpdateSnapsAnalyticsPlatform;

public final class Lh
    implements afw
{

    static final boolean $assertionsDisabled;
    private final KS module;

    private Lh(KS ks)
    {
        if (!$assertionsDisabled && ks == null)
        {
            throw new AssertionError();
        } else
        {
            module = ks;
            return;
        }
    }

    public static afw a(KS ks)
    {
        return new Lh(ks);
    }

    public final Object get()
    {
        return new UpdateSnapsAnalyticsPlatform();
    }

    static 
    {
        boolean flag;
        if (!Lh.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
