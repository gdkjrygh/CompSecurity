// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.time;

import android.os.SystemClock;

// Referenced classes of package com.facebook.common.time:
//            a

public class b
    implements a
{

    public b()
    {
    }

    public long a()
    {
        return SystemClock.elapsedRealtime();
    }
}
