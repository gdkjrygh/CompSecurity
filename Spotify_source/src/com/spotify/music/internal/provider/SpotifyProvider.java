// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.internal.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.spotify.mobile.android.util.logging.Logger;
import dmm;
import dmt;
import duc;
import dug;
import dwo;
import eaa;
import gmm;
import gmt;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SpotifyProvider extends ContentProvider
{

    public static final String a = "com.spotify.music";
    public static final Uri b = Uri.parse((new StringBuilder("content://")).append(a).toString());
    dwo c;
    private ExecutorService d;

    public SpotifyProvider()
    {
    }

    static dwo a(SpotifyProvider spotifyprovider)
    {
        return spotifyprovider.c;
    }

    static void a(SpotifyProvider spotifyprovider, Uri uri)
    {
        if (spotifyprovider.c.d())
        {
            spotifyprovider.c.c().b(uri.getEncodedPath().substring(1));
        }
    }

    static void a(SpotifyProvider spotifyprovider, Uri uri, ContentValues contentvalues)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        ArrayList arraylist2;
        if (!spotifyprovider.c.d())
        {
            break MISSING_BLOCK_LABEL_258;
        }
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        java.util.Map.Entry entry;
        for (contentvalues = contentvalues.valueSet().iterator(); contentvalues.hasNext(); arraylist1.add(entry.getValue().toString()))
        {
            entry = (java.util.Map.Entry)contentvalues.next();
            arraylist.add(entry.getKey());
        }

        contentvalues = new ArrayList();
        arraylist2 = new ArrayList();
        dmm dmm1;
        for (Iterator iterator = dmt.a(URI.create(uri.toString()), "UTF-8").iterator(); iterator.hasNext(); arraylist2.add((String)dmm1.second))
        {
            dmm1 = (dmm)iterator.next();
            contentvalues.add((String)dmm1.first);
        }

        spotifyprovider = spotifyprovider.c.c();
        spotifyprovider.b(uri.getEncodedPath().substring(1), (String[])arraylist.toArray(new String[arraylist.size()]), (String[])arraylist1.toArray(new String[arraylist1.size()]), (String[])contentvalues.toArray(new String[contentvalues.size()]), (String[])arraylist2.toArray(new String[arraylist2.size()]));
        return;
        spotifyprovider;
        Logger.b(spotifyprovider, "Error calling insert.", new Object[0]);
        return;
    }

    private static boolean a()
    {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public int delete(Uri uri, String s, String as[])
    {
        uri = new Runnable(uri) {

            private Uri a;
            private SpotifyProvider b;

            public final void run()
            {
                SpotifyProvider.a(b).a();
                SpotifyProvider.a(b, a);
                SpotifyProvider.a(b).b();
                return;
                Exception exception;
                exception;
                SpotifyProvider.a(b).b();
                throw exception;
            }

            
            {
                b = SpotifyProvider.this;
                a = uri;
                super();
            }
        };
        if (a())
        {
            d.execute(uri);
        } else
        {
            uri.run();
        }
        return 1;
    }

    public String getType(Uri uri)
    {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        uri = new Runnable(uri, contentvalues) {

            private Uri a;
            private ContentValues b;
            private SpotifyProvider c;

            public final void run()
            {
                SpotifyProvider.a(c).a();
                SpotifyProvider.a(c, a, b);
                SpotifyProvider.a(c).b();
                return;
                Exception exception;
                exception;
                SpotifyProvider.a(c).b();
                throw exception;
            }

            
            {
                c = SpotifyProvider.this;
                a = uri;
                b = contentvalues;
                super();
            }
        };
        if (a())
        {
            d.execute(uri);
        } else
        {
            uri.run();
        }
        return null;
    }

    public boolean onCreate()
    {
        gmm.a(getContext());
        d = Executors.newFixedThreadPool(5);
        c = new dwo(getContext());
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String s)
    {
        c.a();
        if (uri != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L7:
        boolean flag = c.d();
        if (!flag || obj == null)
        {
            c.b();
            return null;
        }
          goto _L3
_L2:
        obj = uri.getPathSegments();
        if (((List) (obj)).size() >= 2 && ((String)((List) (obj)).get(0)).equals("image")) goto _L5; else goto _L4
_L5:
        obj = TextUtils.join("/", ((List) (obj)).subList(1, ((List) (obj)).size()));
        continue; /* Loop/switch isn't completed */
_L3:
        obj = c.c().c(((String) (obj)));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        uri = super.openFile(uri, s);
        c.b();
        return uri;
        c.b();
        return ((ParcelFileDescriptor) (obj));
        uri;
        c.b();
        throw uri;
_L4:
        obj = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putAll(dug.a(s, as1));
        s = new Bundle();
        if (s1 != null)
        {
            as1 = s1.trim().split(" ");
            if (as1.length > 0)
            {
                s.putString("order", as1[0]);
                if (as1.length >= 2 && as1[1].trim().equalsIgnoreCase("reverse"))
                {
                    s.putBoolean("reverse", true);
                }
            }
        }
        bundle.putAll(s);
        try
        {
            as = new duc(getContext(), c, uri, as, bundle, d);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Logger.b("RTE thrown when creating MetadataCursor", new Object[0]);
            throw new RuntimeException((new StringBuilder("The query failed: ")).append(uri).toString(), as);
        }
        return as;
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        uri = new Runnable(uri, contentvalues) {

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
                java.util.Map.Entry entry;
                for (obj2 = ((ContentValues) (obj2)).valueSet().iterator(); ((Iterator) (obj2)).hasNext(); arraylist1.add(entry.getValue().toString()))
                {
                    entry = (java.util.Map.Entry)((Iterator) (obj2)).next();
                    arraylist.add(entry.getKey());
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

            
            {
                c = SpotifyProvider.this;
                a = uri;
                b = contentvalues;
                super();
            }
        };
        if (a())
        {
            d.execute(uri);
        } else
        {
            uri.run();
        }
        return 1;
    }

    static 
    {
        gmt.a();
    }
}
