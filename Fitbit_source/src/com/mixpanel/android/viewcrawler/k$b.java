// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.util.LruCache;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            k

private static class  extends LruCache
{

    protected String a(Class class1)
    {
        return class1.getCanonicalName();
    }

    protected Object create(Object obj)
    {
        return a((Class)obj);
    }

    public (int i)
    {
        super(i);
    }
}
