// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class apm extends WeakReference
{

    private final ane a;

    public apm(ane ane, apt apt, ReferenceQueue referencequeue)
    {
        super(apt, referencequeue);
        a = ane;
    }

    static ane a(apm apm1)
    {
        return apm1.a;
    }
}
