// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util;

import android.os.SystemClock;

// Referenced classes of package com.google.android.apps.gsa.shared.util:
//            b

public final class h
    implements b
{

    public h()
    {
    }

    public final long a()
    {
        return SystemClock.elapsedRealtime();
    }

    public final long a(long l)
    {
        return (l - SystemClock.elapsedRealtime()) + System.currentTimeMillis();
    }
}
