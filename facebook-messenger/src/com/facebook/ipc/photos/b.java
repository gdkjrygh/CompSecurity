// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ipc.photos;

import java.util.Comparator;

// Referenced classes of package com.facebook.ipc.photos:
//            MediaItem, a

class b
    implements Comparator
{

    private b()
    {
    }

    b(a a1)
    {
        this();
    }

    public int a(MediaItem mediaitem, MediaItem mediaitem1)
    {
        return Long.signum(mediaitem1.c() - mediaitem.c());
    }

    public int compare(Object obj, Object obj1)
    {
        return a((MediaItem)obj, (MediaItem)obj1);
    }
}
