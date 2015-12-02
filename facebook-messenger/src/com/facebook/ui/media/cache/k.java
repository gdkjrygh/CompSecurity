// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.cache;

import android.content.Context;
import com.facebook.base.c;

// Referenced classes of package com.facebook.ui.media.cache:
//            MediaCacheCleanupService

public class k
    implements c
{

    private Context a;

    public k(Context context)
    {
        a = context;
    }

    public void a()
    {
        MediaCacheCleanupService.a(a);
    }
}
