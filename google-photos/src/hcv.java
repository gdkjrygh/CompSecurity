// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class hcv
    implements hcs
{

    private final String a[];
    private final String b[];

    public hcv(Collection collection, Collection collection1)
    {
        this((String[])collection.toArray(new String[collection.size()]), (String[])collection1.toArray(new String[collection1.size()]));
        boolean flag;
        if (collection.size() > 0 || collection1.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "can not have empty media keys and dedup keys.");
    }

    hcv(String as[], String as1[])
    {
        a = as;
        b = as1;
    }

    public final String a()
    {
        return "PHOTOS_JOB_SUBSYSTEM";
    }

    public final boolean a(Context context, int i)
    {
        noz noz1;
        noz noz2;
        ArrayList arraylist;
        Object obj;
        long l;
        l = noy.a();
        noz1 = noz.a(context, 3, "RemoteRestoreJob", new String[] {
            "perf"
        });
        noz2 = noz.a(context, 3, "RemoteRestoreJob", new String[0]);
        arraylist = new ArrayList();
        if (a.length <= 0)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        obj = (new euj()).a(new String[] {
            "media_key"
        }).a(Arrays.asList(a)).a(eun.a).a(context, i);
        while (((Cursor) (obj)).moveToNext()) 
        {
            arraylist.add(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("media_key")));
        }
        break MISSING_BLOCK_LABEL_141;
        context;
        ((Cursor) (obj)).close();
        throw context;
        ((Cursor) (obj)).close();
        obj = new ArrayList();
        if (b.length > 0)
        {
            hcw hcw1 = new hcw(context, i, Arrays.asList(b));
            b.a(500, b.length, hcw1);
            ((List) (obj)).addAll(hcw1.a);
        }
        if (!arraylist.isEmpty() || !((List) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        if (noz1.a())
        {
            noy.a("duration", l);
        }
_L4:
        return true;
_L2:
        context = iyd.b(context, i, ((List) (obj)), arraylist);
        context.d();
        if (context.l())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!noz2.a());
_L5:
        if (noz1.a())
        {
            context = String.valueOf(this);
            (new StringBuilder(String.valueOf(context).length() + 9)).append("finished ").append(context);
            noy.a("duration", l);
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception = ((nxx) (context)).n;
        if (exception != null && nxx.a(exception))
        {
            return false;
        }
        if (noz2.a())
        {
            context.d("RemoteRestoreJob");
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final boolean b()
    {
        return true;
    }

    public final byte[] c()
    {
        hdh hdh1 = new hdh();
        hdh1.a = a;
        hdh1.b = b;
        return qlw.a(hdh1);
    }

    public final int d()
    {
        return 6;
    }

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(Arrays.toString(a));
        String s2 = String.valueOf(Arrays.toString(b));
        return (new StringBuilder(String.valueOf(s).length() + 44 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(" - RemoteRestoreJob: mediaKeys: ").append(s1).append(" dedupKeys: ").append(s2).toString();
    }
}
