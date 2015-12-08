// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class nlm
{

    final Context a;
    Map b;

    private nlm(Context context)
    {
        b = new HashMap();
        a = context;
    }

    static long a(Context context, nlq nlq1)
    {
        String s = a(nlq1.a);
        return c(context, nlq1.b).a(s, 0L);
    }

    static String a(Uri uri)
    {
        String s = String.valueOf("last_max_media_id-");
        uri = String.valueOf(uri.toString());
        if (uri.length() != 0)
        {
            return s.concat(uri);
        } else
        {
            return new String(s);
        }
    }

    static nlm a(Context context, nlo nlo1, Class class1)
    {
        int i = 0;
        List list = ((mmv)olm.a(context, mmv)).a(new String[] {
            "logged_in"
        });
        context = new nlm(context);
        Uri auri[] = nlb.c;
        for (int j = auri.length; i < j; i++)
        {
            Uri uri = auri[i];
            nlp nlp1;
            int k;
            for (Iterator iterator = list.iterator(); iterator.hasNext(); ((nlm) (context)).b.put(new nlq(uri, k, class1), nlp1))
            {
                k = ((Integer)iterator.next()).intValue();
                nlp1 = nlo1.a(k, uri, class1);
            }

        }

        return context;
    }

    public static void a(Context context)
    {
        for (Iterator iterator = ((mmv)olm.a(context, mmv)).a(new String[] {
    "logged_in"
}).iterator(); iterator.hasNext(); a(context, ((Integer)iterator.next()).intValue())) { }
    }

    public static void a(Context context, int i)
    {
        context = b(context, i);
        Uri auri[] = nkw.a;
        int j = auri.length;
        for (i = 0; i < j; i++)
        {
            Uri uri = auri[i];
            context.g(b(uri));
            context.g(a(uri));
        }

        context.d();
    }

    static String b(Uri uri)
    {
        String s = String.valueOf("last_scan-");
        uri = String.valueOf(uri.toString());
        if (uri.length() != 0)
        {
            return s.concat(uri);
        } else
        {
            return new String(s);
        }
    }

    static mmz b(Context context, int i)
    {
        return ((mmv)olm.a(context, mmv)).b(i).h("MediaStoreUriSynchronizer");
    }

    private static mmx c(Context context, int i)
    {
        return ((mmv)olm.a(context, mmv)).a(i).d("MediaStoreUriSynchronizer");
    }

    public final nlc a(nlm nlm1)
    {
        nlc nlc1 = new nlc(a);
        Iterator iterator = b.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            nlq nlq1 = (nlq)iterator.next();
            if (!((nlp)b.get(nlq1)).equals((nlp)nlm1.b.get(nlq1)))
            {
                Context context = a;
                String s = b(nlq1.a);
                nlc1.a(nlq1, c(context, nlq1.b).a(s, 0L), a(a, nlq1));
            }
        } while (true);
        return nlc1;
    }

    public final boolean a()
    {
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext();)
        {
            nlq nlq1 = (nlq)iterator.next();
            if (((nlp)b.get(nlq1)).a < a(a, nlq1))
            {
                return true;
            }
        }

        return false;
    }

    public final void b()
    {
        ContentValues contentvalues = new ContentValues();
        Iterator iterator = b.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (nlq)iterator.next();
            SQLiteDatabase sqlitedatabase = mvj.a(a, ((nlq) (obj)).b);
            contentvalues.clear();
            nlp nlp1 = (nlp)b.get(obj);
            obj = ((nlq) (obj)).a.toString();
            contentvalues.put("media_store_uri", ((String) (obj)));
            contentvalues.put("media_store_token", nlp1.toString());
            if (sqlitedatabase.update("all_photos_local_sync", contentvalues, "media_store_uri = ?", new String[] {
    obj
}) == 0)
            {
                sqlitedatabase.insert("all_photos_local_sync", null, contentvalues);
            }
        } while (true);
    }

    public final String toString()
    {
        String s = String.valueOf("MediaStoreSyncState{tokenMap=");
        String s1 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(s1).append("}").toString();
    }
}
