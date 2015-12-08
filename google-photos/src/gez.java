// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class gez
{

    public final Context a;
    public final int b;
    public final noz c;
    public boolean d;
    public List e;
    private final fla f;
    private final eto g;
    private final noz h;

    public gez(Context context, int i)
    {
        a = context;
        b = i;
        f = (fla)olm.a(context, fla);
        g = (eto)olm.a(context, eto);
        c = noz.a(context, 3, "RemoteTrashProcessor", new String[] {
            "perf", "sync"
        });
        h = noz.a(context, 2, "RemoteTrashProcessor", new String[] {
            "sync"
        });
        e = new ArrayList();
    }

    public Set a(SQLiteDatabase sqlitedatabase, Collection collection)
    {
        boolean flag1 = true;
        if (collection.isEmpty())
        {
            return Collections.emptySet();
        }
        if (h.a())
        {
            noy.a("mediaKey count", Integer.valueOf(collection.size()));
        }
        String as[] = new String[collection.size()];
        collection = collection.iterator();
        for (int i = 0; collection.hasNext(); i++)
        {
            as[i] = ((qgg)collection.next()).b.a;
        }

        collection = g;
        eun eun1 = eun.b;
        boolean flag;
        if (as.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "can not find dedupKey for empty keys.");
        if (eun1 != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, "can not match null state");
        return collection.a(sqlitedatabase, as, eun1);
    }

    public Set a(qir aqir[])
    {
        if (aqir.length == 0)
        {
            return Collections.emptySet();
        }
        if (h.a())
        {
            noy.a("mediaKey count", Integer.valueOf(aqir.length));
        }
        ArrayList arraylist = new ArrayList(aqir.length);
        int j = aqir.length;
        int i = 0;
        while (i < j) 
        {
            Object obj = aqir[i];
            boolean flag;
            if (((qir) (obj)).b != null && ((qir) (obj)).b.booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = ((qir) (obj)).a.b;
            if (flag && obj != null && ((qev) (obj)).a != null)
            {
                arraylist.add(((qev) (obj)).a);
            }
            i++;
        }
        if (arraylist.isEmpty())
        {
            return Collections.emptySet();
        } else
        {
            aqir = mvj.b(a, b);
            return g.a(aqir, (String[])arraylist.toArray(new String[arraylist.size()]), null);
        }
    }

    public final void a()
    {
        p.a(d, "processor is not prepared before process.");
        long l = noy.a();
        Object obj = f.a(b);
        if (c.a())
        {
            noy.a("isSuccess", Boolean.valueOf(((fld) (obj)).a));
            noy.a("duration", l);
        }
        if (((fld) (obj)).a)
        {
            if (h.a())
            {
                String s = String.valueOf(((fld) (obj)).b());
                (new StringBuilder(String.valueOf(s).length() + 12)).append("All Folders:").append(s);
            }
            if (!((fld) (obj)).b().a.isEmpty())
            {
                for (Iterator iterator = e.iterator(); iterator.hasNext(); ((gey)iterator.next()).a(((fld) (obj)).b())) { }
                obj = ((mmv)olm.a(a, mmv)).a();
                for (Iterator iterator1 = e.iterator(); iterator1.hasNext(); ((gey)iterator1.next()).a(((List) (obj)))) { }
                if (c.a())
                {
                    noy.a("duration", l);
                    return;
                }
            }
        }
    }

    public Set b(SQLiteDatabase sqlitedatabase, Collection collection)
    {
        if (collection.isEmpty())
        {
            return Collections.emptySet();
        }
        if (h.a())
        {
            noy.a("mediaKey count", Integer.valueOf(collection.size()));
        }
        HashSet hashset = new HashSet();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            Object obj = (qgg)collection.next();
            obj = g.a(sqlitedatabase, ((qgg) (obj)));
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                hashset.add(obj);
            }
        } while (true);
        return hashset;
    }
}
