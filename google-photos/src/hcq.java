// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class hcq
    implements hcs
{

    private final String a[];

    public hcq(Collection collection)
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
        p.a(flag, "can not have empty content uris.");
    }

    hcq(String as[])
    {
        a = as;
    }

    public final String a()
    {
        return "PHOTOS_JOB_SUBSYSTEM";
    }

    public final boolean a(Context context, int i)
    {
        noz noz1 = noz.a(context, 3, "LocalTrashRestoreJob", new String[] {
            "perf"
        });
        if (a.length > 0 || !noz1.a()) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        long l;
        l = noy.a();
        obj3 = (jae)olm.a(context, jae);
        obj2 = (eto)olm.a(context, eto);
        obj1 = ((mmv)olm.a(context, mmv)).a(new String[] {
            "logged_in"
        });
        obj = new ArrayList();
        Collections.addAll(((Collection) (obj)), a);
        if (!((List) (obj1)).isEmpty()) goto _L4; else goto _L3
_L3:
        obj = Arrays.asList(a);
_L6:
        if (!((List) (obj)).isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        if (noz1.a())
        {
            noy.a("duration", l);
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        Cursor cursor;
        ArrayList arraylist;
        arraylist = new ArrayList();
        cursor = (new etj()).a(new String[] {
            "content_uri"
        }).a(new HashSet(((Collection) (obj)))).a(eun.b).a(context, i);
        while (cursor.moveToNext()) 
        {
            arraylist.add(cursor.getString(cursor.getColumnIndexOrThrow("content_uri")));
        }
        break MISSING_BLOCK_LABEL_249;
        context;
        cursor.close();
        throw context;
        ((List) (obj)).removeAll(arraylist);
        cursor.close();
        if (true) goto _L6; else goto _L5
_L5:
        obj = ((jae) (obj3)).b(((List) (obj)));
        if (!((List) (obj)).isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        if (noz1.a())
        {
            noy.a("duration", l);
            return true;
        }
        if (true) goto _L1; else goto _L7
_L7:
        obj = ((jae) (obj3)).a(((List) (obj)), true);
        obj3 = ((jag) (obj)).a(jai.a);
        if (!((List) (obj3)).isEmpty())
        {
            for (Iterator iterator = ((List) (obj1)).iterator(); iterator.hasNext(); ((eto) (obj2)).a(((Integer)iterator.next()).intValue(), Collections.emptyList(), ((Iterable) (obj3)), true)) { }
        }
        context = (hdu)olm.a(context, hdu);
        obj2 = ((jag) (obj)).a(jai.d);
        if (!((List) (obj2)).isEmpty())
        {
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); context.a(((Integer)((Iterator) (obj1)).next()).intValue(), b.c(((List) (obj2))))) { }
        }
        if (noz1.a())
        {
            context = String.valueOf(this);
            (new StringBuilder(String.valueOf(context).length() + 9)).append("finished ").append(context);
            noy.a("duration", l);
            noy.a("result", obj);
            return true;
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    public final boolean b()
    {
        return false;
    }

    public final byte[] c()
    {
        hde hde1 = new hde();
        hde1.a = a;
        return qlw.a(hde1);
    }

    public final int d()
    {
        return 3;
    }

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(Arrays.toString(a));
        return (new StringBuilder(String.valueOf(s).length() + 21 + String.valueOf(s1).length())).append(s).append(" - LocalRestoreJob:  ").append(s1).toString();
    }
}
