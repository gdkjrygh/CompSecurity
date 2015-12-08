// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.crashlytics.android.internal:
//            bz

final class cb extends ThreadLocal
{

    cb(bz bz)
    {
    }

    protected final Object initialValue()
    {
        return new ConcurrentLinkedQueue();
    }
}
