// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gdata;

import com.google.b.i;
import com.google.b.j;
import com.google.b.k;
import com.google.b.l;
import com.google.b.o;
import com.google.b.p;
import java.lang.reflect.Type;
import java.util.Iterator;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gdata:
//            AlbumFeed, PhotoEntry

public static class A
    implements k
{

    public AlbumFeed a(l l1, Type type, j j1)
        throws p
    {
        if (l1 != null && l1.j())
        {
            if ((type = l1.m().e("feed")) != null)
            {
                l1 = new AlbumFeed();
                for (type = type.d("entry").iterator(); type.hasNext(); l1.a((PhotoEntry)j1.a((l)type.next(), com/cardinalblue/android/piccollage/model/gdata/PhotoEntry))) { }
                return l1;
            }
        }
        return null;
    }

    public Object deserialize(l l1, Type type, j j1)
        throws p
    {
        return a(l1, type, j1);
    }

    public A()
    {
    }
}
