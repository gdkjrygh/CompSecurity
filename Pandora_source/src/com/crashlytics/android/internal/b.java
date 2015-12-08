// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.os.Handler;
import android.os.Looper;

// Referenced classes of package com.crashlytics.android.internal:
//            bz, cf

public final class b extends bz
{

    private final Handler a = new Handler(Looper.getMainLooper());

    public b(cf cf)
    {
        super(cf);
    }
}
