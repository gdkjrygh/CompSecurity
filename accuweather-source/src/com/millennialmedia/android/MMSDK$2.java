// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;

// Referenced classes of package com.millennialmedia.android:
//            MMSDK, CachedAd, MMLog

static final class Iterator extends Iterator
{

    final Context val$context;

    boolean callback(CachedAd cachedad)
    {
        String s1 = cachedad.getTypeString();
        String s2 = cachedad.getId();
        String s;
        if (cachedad.isOnDisk(val$context))
        {
            s = "";
        } else
        {
            s = "not ";
        }
        if (cachedad.isExpired())
        {
            cachedad = "";
        } else
        {
            cachedad = "not ";
        }
        MMLog.i("MMSDK", String.format("%s %s is %son disk. Is %sexpired.", new Object[] {
            s1, s2, s, cachedad
        }));
        return true;
    }

    (Context context1)
    {
        val$context = context1;
        super();
    }
}
