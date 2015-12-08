// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class djy
    implements iyi
{

    private final Context a;
    private final mmv b;
    private final hpb c;
    private final eto d;
    private final fps e;
    private final noz f;

    public djy(Context context)
    {
        a = context;
        d = (eto)olm.a(context, eto);
        e = (fps)olm.a(context, fps);
        b = (mmv)olm.a(context, mmv);
        c = (hpb)olm.a(context, hpb);
        f = noz.a(context, 3, "AllDelete", new String[] {
            "perf"
        });
    }

    private void a(int i, Collection collection)
    {
        hcr hcr1 = new hcr(collection);
        e.a(i, hcr1);
        for (Iterator iterator = b.a(new String[] {
    "logged_in"
}).iterator(); iterator.hasNext(); d.a(i, Collections.emptyList(), collection, true))
        {
            i = ((Integer)iterator.next()).intValue();
        }

    }

    private void a(int i, Collection collection, Collection collection1, Collection collection2)
    {
        Cursor cursor;
        int j;
        j = 0;
        cursor = (new euj()).a(new String[] {
            "protobuf"
        }).a(collection2).a(a, i);
        byte abyte0[][] = new byte[cursor.getCount()][];
_L1:
        if (!cursor.moveToNext())
        {
            break MISSING_BLOCK_LABEL_89;
        }
        abyte0[j] = cursor.getBlob(cursor.getColumnIndex("protobuf"));
        j++;
          goto _L1
        cursor.close();
        collection = new hcu(iye.a, abyte0, collection1, collection);
        e.a(i, collection);
        d.a(i, collection2, Collections.emptyList(), true);
        return;
        collection;
        cursor.close();
        throw collection;
    }

    public final elb a(int i, Collection collection, gaw gaw1)
    {
        Object obj;
        boolean flag;
        if (!collection.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "cannot delete 0 medias.");
        obj = c.a(collection);
        if (((List) (obj)).isEmpty())
        {
            return b.a(new eke("Failed to move medias to trash."));
        }
        long l = noy.a();
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        HashSet hashset2 = new HashSet();
        HashSet hashset3 = new HashSet();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            hpk hpk1 = (hpk)((Iterator) (obj)).next();
            if (hpk1.d() && !hpk1.a())
            {
                collection = String.valueOf(hpk1);
                throw new IllegalStateException((new StringBuilder(String.valueOf(collection).length() + 46)).append("ResolvedMedia has photo id but not media key: ").append(collection).toString());
            }
            if (hpk1.e())
            {
                hashset.add(hpk1.a);
            }
            if (hpk1.a())
            {
                hashset1.add(hpk1.c);
                if (!hpk1.f())
                {
                    hashset3.add(hpk1.c);
                } else
                {
                    hashset2.add(hpk1.e);
                }
            }
        } while (true);
        if (gaw1.a(gav.a) && !hashset.isEmpty())
        {
            a(i, ((Collection) (hashset)));
        }
        if (gaw1.a(gav.b) && !hashset1.isEmpty())
        {
            a(i, ((Collection) (new ArrayList(hashset2))), ((Collection) (hashset3)), ((Collection) (hashset1)));
        }
        if (f.a())
        {
            noy.a(i);
            noy.a("media", Integer.valueOf(collection.size()));
            noy.a("sourcesToDelete", gaw1);
            noy.a("duration", l);
        }
        return b.b(collection);
    }
}
