// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import com.google.android.gms.auth.b;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            GooglePlusPhotoListActivity

class a
    implements Callable
{

    final GooglePlusPhotoListActivity a;

    public String a()
        throws Exception
    {
        return b.a(a, GooglePlusPhotoListActivity.c(a), "oauth2:https://picasaweb.google.com/data/");
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (GooglePlusPhotoListActivity googleplusphotolistactivity)
    {
        a = googleplusphotolistactivity;
        super();
    }
}
