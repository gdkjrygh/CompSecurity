// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.cache;

import android.content.Context;

// Referenced classes of package com.facebook.ui.images.cache:
//            ImageCacheCleanupService

public class c
    implements com.facebook.base.c
{

    private Context a;

    public c(Context context)
    {
        a = context;
    }

    public void a()
    {
        ImageCacheCleanupService.a(a);
    }
}
