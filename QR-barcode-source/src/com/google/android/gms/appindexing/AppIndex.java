// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appindexing;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.hd;
import com.google.android.gms.internal.hz;

// Referenced classes of package com.google.android.gms.appindexing:
//            AppIndexApi

public final class AppIndex
{

    public static final Api APP_INDEX_API;
    public static final AppIndexApi AppIndexApi = new hz();

    private AppIndex()
    {
    }

    static 
    {
        APP_INDEX_API = hd.BP;
    }
}
