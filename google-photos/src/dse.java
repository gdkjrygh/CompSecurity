// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class dse
    implements ell
{

    public static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "_id", "dedup_key", "content_uri", "media_key", "photo_id", "collection_id"
    })));
    private final eto b;
    private final gbd c;
    private final eun d;
    private final dsd e;

    public dse(Context context, eun eun, dsd dsd1)
    {
        d = eun;
        e = dsd1;
        b = (eto)olm.a(context, eto);
        c = (gbd)olm.a(context, gbd);
    }

    private List a(int i, String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        HashSet hashset = new HashSet();
        hashset.add(s);
        s = b.a(i, (new etj()).a(d), hashset).iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            String s2 = (String)s.next();
            nko nko1 = c.a(s2);
            if (nko1 != null && nko1.b().equals(s1))
            {
                arraylist.add(s2);
            }
        } while (true);
        return arraylist;
    }

    public final ekf a(int i, Cursor cursor)
    {
        ArrayList arraylist = new ArrayList();
        String s1 = cursor.getString(cursor.getColumnIndexOrThrow("dedup_key"));
        String s2 = cursor.getString(cursor.getColumnIndexOrThrow("media_key"));
        boolean flag = s1.startsWith("fake:");
        Object obj = cursor.getString(cursor.getColumnIndexOrThrow("content_uri"));
        String s = null;
        Object obj1;
        hpm hpm1;
        long l;
        if (flag)
        {
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                nko nko1 = c.a(((String) (obj)));
                if (nko1 != null)
                {
                    s = nko1.b();
                }
            } else
            {
                s = null;
            }
        } else
        {
            s = s1;
        }
        obj1 = new ArrayList();
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!s.equals(s1))
        {
            ((List) (obj1)).addAll(a(i, s1, s));
        }
        ((List) (obj1)).addAll(b.a(i, (new etj()).a(d), Collections.singleton(s)));
_L4:
        for (obj = ((List) (obj1)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(hpm1.a()))
        {
            obj1 = (String)((Iterator) (obj)).next();
            hpm1 = new hpm();
            hpm1.a = s;
            hpm1.b = ((String) (obj1));
        }

        break; /* Loop/switch isn't completed */
_L2:
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            ((List) (obj1)).add(obj);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (flag && !TextUtils.isEmpty(s2))
        {
            l = cursor.getLong(cursor.getColumnIndexOrThrow("photo_id"));
            cursor = cursor.getString(cursor.getColumnIndexOrThrow("collection_id"));
            obj = (new hpm()).a(Long.valueOf(l).longValue());
            obj.d = s2;
            obj.e = cursor;
            arraylist.add(((hpm) (obj)).a());
        }
        if (s != null)
        {
            arraylist.addAll(b.a(i, s1, d));
        }
        return e.a(arraylist);
    }

    public final volatile ekf a(int i, Object obj)
    {
        return a(i, (Cursor)obj);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return hpg;
    }

}
