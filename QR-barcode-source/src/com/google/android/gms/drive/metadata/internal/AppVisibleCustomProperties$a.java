// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            AppVisibleCustomProperties

public static class Q
{

    private final Map PI = new HashMap();

    public AppVisibleCustomProperties im()
    {
        return new AppVisibleCustomProperties(PI.values(), null);
    }

    public Q()
    {
    }
}
