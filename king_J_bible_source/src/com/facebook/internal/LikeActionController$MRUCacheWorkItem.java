// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.facebook.internal:
//            LikeActionController

private static class shouldTrim
    implements Runnable
{

    private static ArrayList mruCachedItems = new ArrayList();
    private String cacheItem;
    private boolean shouldTrim;

    public void run()
    {
        if (cacheItem != null)
        {
            mruCachedItems.remove(cacheItem);
            mruCachedItems.add(0, cacheItem);
        }
        if (!shouldTrim || mruCachedItems.size() < 128) goto _L2; else goto _L1
_L1:
        if (64 < mruCachedItems.size()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        String s = (String)mruCachedItems.remove(mruCachedItems.size() - 1);
        LikeActionController.access$8().remove(s);
        if (true) goto _L1; else goto _L4
_L4:
    }


    A(String s, boolean flag)
    {
        cacheItem = s;
        shouldTrim = flag;
    }
}
