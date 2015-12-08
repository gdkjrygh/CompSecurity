// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.facebook.internal:
//            LikeActionController

class shouldTrim
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
        if (shouldTrim && mruCachedItems.size() >= 128)
        {
            String s;
            for (; 64 < mruCachedItems.size(); LikeActionController.access$400().remove(s))
            {
                s = (String)mruCachedItems.remove(mruCachedItems.size() - 1);
            }

        }
    }


    A(String s, boolean flag)
    {
        cacheItem = s;
        shouldTrim = flag;
    }
}
