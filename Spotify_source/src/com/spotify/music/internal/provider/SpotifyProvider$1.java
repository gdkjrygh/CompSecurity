// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.internal.provider;

import android.content.ContentValues;
import android.net.Uri;
import com.spotify.mobile.android.util.logging.Logger;
import dmm;
import dmt;
import dwo;
import eaa;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.spotify.music.internal.provider:
//            SpotifyProvider

final class b
    implements Runnable
{

    private Uri a;
    private ContentValues b;
    private SpotifyProvider c;

    public final void run()
    {
        SpotifyProvider.a(c).a();
        Object obj;
        ArrayList arraylist;
        ArrayList arraylist1;
        Object obj1;
        obj1 = c;
        obj = a;
        Object obj2 = b;
        if (!((SpotifyProvider) (obj1)).c.d())
        {
            break MISSING_BLOCK_LABEL_306;
        }
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        java.util.s s;
        for (obj2 = ((ContentValues) (obj2)).valueSet().iterator(); ((Iterator) (obj2)).hasNext(); arraylist1.add(s.().toString()))
        {
            s = (java.util.)((Iterator) (obj2)).next();
            arraylist.add(s.());
        }

        break MISSING_BLOCK_LABEL_131;
        obj;
        SpotifyProvider.a(c).b();
        throw obj;
        ArrayList arraylist2;
        ArrayList arraylist3;
        arraylist2 = new ArrayList();
        arraylist3 = new ArrayList();
        dmm dmm1;
        for (Iterator iterator = dmt.a(URI.create(((Uri) (obj)).toString()), "UTF-8").iterator(); iterator.hasNext(); arraylist3.add((String)dmm1.second))
        {
            dmm1 = (dmm)iterator.next();
            arraylist2.add((String)dmm1.first);
        }

        obj1 = ((SpotifyProvider) (obj1)).c.c();
        ((eaa) (obj1)).a(((Uri) (obj)).getEncodedPath().substring(1), (String[])arraylist.toArray(new String[arraylist.size()]), (String[])arraylist1.toArray(new String[arraylist1.size()]), (String[])arraylist2.toArray(new String[arraylist2.size()]), (String[])arraylist3.toArray(new String[arraylist3.size()]));
_L1:
        SpotifyProvider.a(c).b();
        return;
        Exception exception;
        exception;
        Logger.b(exception, "Error calling update.", new Object[0]);
          goto _L1
    }

    (SpotifyProvider spotifyprovider, Uri uri, ContentValues contentvalues)
    {
        c = spotifyprovider;
        a = uri;
        b = contentvalues;
        super();
    }
}
