// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.l;
import com.google.android.gms.auth.d;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            GooglePlusPhotoListActivity

class a
    implements i
{

    final GooglePlusPhotoListActivity a;

    public l a(j j1)
        throws Exception
    {
        if (j1.d() || j1.c())
        {
            if (j1.f() instanceof d)
            {
                Intent intent = ((d)j1.f()).a();
                try
                {
                    a.startActivityForResult(intent, 100);
                }
                catch (ActivityNotFoundException activitynotfoundexception)
                {
                    k.a(a, 0x7f0700f8, 0);
                }
            }
            throw j1.f();
        }
        j1 = GooglePlusPhotoListActivity.a(a, a.getIntent().getStringExtra("extra_album_id"), (String)j1.e());
        if (j1 == null)
        {
            throw new IllegalStateException("No result from Google Plus");
        }
        if (((l) (j1)).b != null)
        {
            throw ((l) (j1)).b;
        } else
        {
            return j1;
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (GooglePlusPhotoListActivity googleplusphotolistactivity)
    {
        a = googleplusphotolistactivity;
        super();
    }
}
