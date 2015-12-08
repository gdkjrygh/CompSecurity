// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class hcn
    implements hcs
{

    private static final String a[] = {
        "content_uri"
    };
    private final String b[];

    public hcn(Collection collection)
    {
        this((String[])collection.toArray(new String[collection.size()]));
        boolean flag;
        if (collection.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "can not have empty dedupKeys.");
    }

    private hcn(String as[])
    {
        b = as;
    }

    public static hcs a(byte abyte0[])
    {
        return new hcn(((hdf)mve.a(new hdf(), abyte0)).a);
    }

    private List a(Context context, int i, List list, Set set)
    {
        ArrayList arraylist = new ArrayList();
        set = new ArrayList(set);
        int k;
        for (int j = 0; j < set.size(); j += k)
        {
            k = Math.min(250, set.size() - j);
            List list1 = set.subList(j, j + k);
            b.a(500, list.size(), new hcp(this, list, list1, context, i, arraylist));
        }

        return arraylist;
    }

    static String[] e()
    {
        return a;
    }

    public final String a()
    {
        return "PHOTOS_JOB_SUBSYSTEM";
    }

    public final boolean a(Context context, int i)
    {
        noz noz1 = noz.a(context, 3, "LocalTrashJob", new String[] {
            "perf"
        });
        if (b.length <= 0)
        {
            return true;
        }
        long l = noy.a();
        Object obj1 = (jae)olm.a(context, jae);
        Object obj = (mmv)olm.a(context, mmv);
        eto eto1 = (eto)olm.a(context, eto);
        if (!((mmv) (obj)).d(i))
        {
            if (noz1.a())
            {
                noy.a("job", this);
            }
            return true;
        }
        Object obj2 = Arrays.asList(b);
        ArrayList arraylist = new ArrayList();
        b.a(500, ((List) (obj2)).size(), new hco(this, ((List) (obj2)), context, i, arraylist));
        if (arraylist.isEmpty())
        {
            if (noz1.a())
            {
                noy.a("duration", l);
            }
            return true;
        }
        arraylist.removeAll(((jae) (obj1)).b(arraylist));
        if (arraylist.isEmpty())
        {
            if (noz1.a())
            {
                noy.a("duration", l);
            }
            return true;
        }
        fkz fkz1 = ((flb)olm.a(context, flb)).a(i);
        if (fkz1.a.isEmpty())
        {
            if (noz1.a())
            {
                noy.a("duration", l);
            }
            return true;
        }
        obj2 = new ArrayList(arraylist);
        context = a(context, i, ((List) (arraylist)), fkz1.a);
        ((List) (obj2)).removeAll(context);
        if (!((List) (obj2)).isEmpty())
        {
            if (noz1.a())
            {
                noy.a("duration", l);
            }
            eto1.a(i, Collections.emptyList(), ((Iterable) (obj2)), true);
        }
        if (context.isEmpty())
        {
            if (noz1.a())
            {
                noy.a("duration", l);
            }
            return true;
        }
        context = ((jae) (obj1)).a(context);
        if (!context.a(jai.c).isEmpty())
        {
            for (obj1 = ((mmv) (obj)).a(new String[] {
    "logged_in"
}).iterator(); ((Iterator) (obj1)).hasNext(); eto1.a(((Integer)((Iterator) (obj1)).next()).intValue(), Collections.emptyList(), context.a(jai.c), true)) { }
        }
        obj1 = context.a(jai.b);
        if (!((List) (obj1)).isEmpty())
        {
            for (obj = ((mmv) (obj)).a(new String[] {
    "logged_in"
}).iterator(); ((Iterator) (obj)).hasNext(); eto1.a(((Integer)((Iterator) (obj)).next()).intValue(), ((Collection) (obj1)))) { }
        }
        if (noz1.a())
        {
            String s = String.valueOf(this);
            (new StringBuilder(String.valueOf(s).length() + 9)).append("finished ").append(s);
            noy.a("duration", l);
            noy.a("trashOps result", context);
        }
        return true;
    }

    public final boolean b()
    {
        return false;
    }

    public final byte[] c()
    {
        hdf hdf1 = new hdf();
        hdf1.a = b;
        return qlw.a(hdf1);
    }

    public final int d()
    {
        return 1;
    }

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(Arrays.toString(b));
        return (new StringBuilder(String.valueOf(s).length() + 19 + String.valueOf(s1).length())).append(s).append(" - LocalTrashJob:  ").append(s1).toString();
    }

}
