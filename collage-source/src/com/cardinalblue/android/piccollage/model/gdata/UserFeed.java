// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gdata;

import com.android.volley.m;
import com.android.volley.r;
import com.android.volley.toolbox.e;
import com.cardinalblue.android.piccollage.model.gson.IGsonable;
import com.google.b.f;
import com.google.b.g;
import com.google.b.i;
import com.google.b.j;
import com.google.b.k;
import com.google.b.l;
import com.google.b.o;
import com.google.b.p;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gdata:
//            AlbumEntry

public class UserFeed
    implements IGsonable
{
    public static class a
        implements k
    {

        public UserFeed a(l l1, Type type, j j1)
            throws p
        {
            if (l1 != null && l1.j())
            {
                if ((type = l1.m().e("feed")) != null)
                {
                    l1 = new UserFeed();
                    for (type = type.d("entry").iterator(); type.hasNext(); l1.a((AlbumEntry)j1.a((l)type.next(), com/cardinalblue/android/piccollage/model/gdata/AlbumEntry))) { }
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

        public a()
        {
        }
    }

    public static class b extends com.android.volley.toolbox.k
    {

        protected m a(com.android.volley.g g1)
        {
            UserFeed userfeed = (UserFeed)(new g()).a(com/cardinalblue/android/piccollage/model/gdata/UserFeed, new a()).a(com/cardinalblue/android/piccollage/model/gdata/AlbumEntry, new AlbumEntry.a()).a().a(new String(g1.b), com/cardinalblue/android/piccollage/model/gdata/UserFeed);
            if (userfeed != null)
            {
                return m.a(userfeed, e.a(g1));
            } else
            {
                return m.a(new r("Cannot parse UserFeed"));
            }
        }

        public b(int i, String s, String s1, com.android.volley.m.b b1, com.android.volley.m.a a1)
        {
            super(i, s, s1, b1, a1);
        }
    }


    private ArrayList a;

    public UserFeed()
    {
        a = new ArrayList();
    }

    public List a()
    {
        return a;
    }

    public void a(AlbumEntry albumentry)
    {
        if (albumentry != null)
        {
            a.add(albumentry);
        }
    }
}
