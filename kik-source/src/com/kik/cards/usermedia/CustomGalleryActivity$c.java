// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import java.util.Comparator;

// Referenced classes of package com.kik.cards.usermedia:
//            CustomGalleryActivity

private final class <init>
    implements Comparator
{

    final CustomGalleryActivity a;

    public final int compare(Object obj, Object obj1)
    {
        obj = (<init>)obj;
        obj1 = (<init>)obj1;
        return ((<init>) (obj)).a().compareTo(((a) (obj1)).a());
    }

    private (CustomGalleryActivity customgalleryactivity)
    {
        a = customgalleryactivity;
        super();
    }

    a(CustomGalleryActivity customgalleryactivity, byte byte0)
    {
        this(customgalleryactivity);
    }
}
