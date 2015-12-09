// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import java.util.Comparator;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            PhotoProtoView, k

class a
    implements Comparator
{

    final PhotoProtoView a;

    public int a(k k1, k k2)
    {
        return k1.W() - k2.W();
    }

    public int compare(Object obj, Object obj1)
    {
        return a((k)obj, (k)obj1);
    }

    (PhotoProtoView photoprotoview)
    {
        a = photoprotoview;
        super();
    }
}
