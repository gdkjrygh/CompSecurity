// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.widget.ViewSwitcher;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.gdata.AlbumFeed;
import com.cardinalblue.android.piccollage.model.l;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            GooglePlusPhotoListActivity

class a
    implements i
{

    final GooglePlusPhotoListActivity a;

    public Object then(j j1)
        throws Exception
    {
        if (j1.d() || j1.c())
        {
            f.a(j1.f());
            a.finish();
        } else
        {
            j1 = (AlbumFeed)((l)j1.e()).a;
            GooglePlusPhotoListActivity.a(a).clear();
            GooglePlusPhotoListActivity.a(a).addAll(j1.a());
            GooglePlusPhotoListActivity.b(a).setDisplayedChild(1);
        }
        return null;
    }

    (GooglePlusPhotoListActivity googleplusphotolistactivity)
    {
        a = googleplusphotolistactivity;
        super();
    }
}
