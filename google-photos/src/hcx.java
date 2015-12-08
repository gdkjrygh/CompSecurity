// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class hcx
    implements hcs
{

    private final String a[];
    private final String b[];
    private final String c[];

    public hcx(Collection collection, Collection collection1, Collection collection2)
    {
        this((String[])collection.toArray(new String[collection.size()]), (String[])collection1.toArray(new String[collection1.size()]), (String[])collection2.toArray(new String[collection2.size()]));
        boolean flag;
        if (collection.size() > 0 || collection1.size() > 0 || collection2.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "can not have empty media keys, remoteDedupKeys and localDedupKeys.");
    }

    hcx(String as[], String as1[], String as2[])
    {
        a = as;
        b = as1;
        c = as2;
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
        Cursor cursor;
        ArrayList arraylist1;
        long l;
        l = noy.a();
        noz1 = noz.a(context, 3, "RemoteTrashJob", new String[] {
            "perf"
        });
        noz2 = noz.a(context, 3, "RemoteTrashJob", new String[0]);
        arraylist = new ArrayList();
        if (b.length > 0)
        {
            hcz hcz1 = new hcz(context, i, Arrays.asList(b));
            b.a(500, b.length, hcz1);
            arraylist.addAll(hcz1.a);
        }
        if (c.length > 0)
        {
            hcy hcy1 = new hcy(context, i, Arrays.asList(c));
            b.a(500, c.length, hcy1);
            arraylist.addAll(hcy1.a);
        }
        arraylist1 = new ArrayList();
        if (a.length <= 0)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        cursor = (new euj()).a(new String[] {
            "media_key"
        }).a(Arrays.asList(a)).a(eun.b).a(context, i);
        while (cursor.moveToNext()) 
        {
            arraylist1.add(cursor.getString(cursor.getColumnIndexOrThrow("media_key")));
        }
        break MISSING_BLOCK_LABEL_254;
        context;
        cursor.close();
        throw context;
        cursor.close();
        if (!arraylist.isEmpty() || !arraylist1.isEmpty()) goto _L2; else goto _L1
_L1:
        if (noz1.a())
        {
            noy.a("duration", l);
        }
_L4:
        return true;
_L2:
        context = iyd.a(context, i, arraylist, arraylist1);
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
            context.d("RemoteTrashJob");
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
        hdi hdi1 = new hdi();
        hdi1.a = a;
        hdi1.b = c;
        hdi1.c = b;
        return qlw.a(hdi1);
    }

    public final int d()
    {
        return 2;
    }

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(Arrays.toString(a));
        String s2 = String.valueOf(Arrays.toString(c));
        String s3 = String.valueOf(Arrays.toString(b));
        return (new StringBuilder(String.valueOf(s).length() + 65 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append(" - RemoteTrashJob: mediaKeys: ").append(s1).append(" localDedupKeys: ").append(s2).append(" remoteDedupKeys: ").append(s3).toString();
    }
}
