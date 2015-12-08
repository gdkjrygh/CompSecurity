// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class hcu
    implements hcs
{

    private final iye a;
    private final byte b[][];
    private final String c[];
    private final String d[];

    public hcu(iye iye1, byte abyte0[][], Collection collection, Collection collection1)
    {
        boolean flag1 = true;
        this(iye1, abyte0, (String[])collection.toArray(new String[collection.size()]), (String[])collection1.toArray(new String[collection1.size()]));
        boolean flag;
        if (collection.size() > 0 || collection1.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "can not have empty media keys and dedup keys.");
        if (abyte0.length > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, "can not have empty bytes of media items");
    }

    hcu(iye iye1, byte abyte0[][], String as[], String as1[])
    {
        a = iye1;
        b = abyte0;
        c = as;
        d = as1;
    }

    public final String a()
    {
        return "PHOTOS_JOB_SUBSYSTEM";
    }

    public final boolean a(Context context, int i)
    {
        Object obj;
        noz noz1;
        long l;
        l = noy.a();
        noz1 = noz.a(context, 3, "RemoteDeleteJob", new String[] {
            "perf"
        });
        obj = noz.a(context, 3, "RemoteDeleteJob", new String[0]);
        if (c.length > 0 || d.length > 0 || !((noz) (obj)).a()) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        Object obj1;
        obj1 = iyd.a(context, i, Arrays.asList(d), Arrays.asList(c), a);
        ((iyd) (obj1)).d();
        if (((iyd) (obj1)).l())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((noz) (obj)).a());
_L4:
        if (noz1.a())
        {
            context = String.valueOf(this);
            (new StringBuilder(String.valueOf(context).length() + 9)).append("finished ").append(context);
            noy.a("duration", l);
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception = ((nxx) (obj1)).n;
        if (exception != null && nxx.a(exception))
        {
            return false;
        }
        if (((noz) (obj)).a())
        {
            ((iyd) (obj1)).d("RemoteDeleteJob");
        }
        obj1 = new ArrayList();
        byte abyte0[][] = b;
        int k = abyte0.length;
        int j = 0;
        while (j < k) 
        {
            byte abyte1[] = abyte0[j];
            qgg qgg1 = (qgg)mve.a(new qgg(), abyte1);
            if (qgg1 == null)
            {
                if (!((noz) (obj)).a());
            } else
            {
                ((List) (obj1)).add(qgg1);
            }
            j++;
        }
        obj = (mmv)olm.a(context, mmv);
        try
        {
            obj = ((mmv) (obj)).a(i).b("gaia_id");
        }
        catch (mmy mmy1)
        {
            mmy1 = null;
        }
        if (obj != null)
        {
            qfu qfu1 = new qfu();
            qfu1.b = ((String) (obj));
            ((eto)olm.a(context, eto)).a(i, (qgg[])((List) (obj1)).toArray(new qgg[((List) (obj1)).size()]), new qgi[0], qfu1, true);
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final boolean b()
    {
        return true;
    }

    public final byte[] c()
    {
        hdg hdg1 = new hdg();
        hdg1.c = c;
        hdg1.d = d;
        boolean flag;
        if (a == iye.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hdg1.a = Boolean.valueOf(flag);
        hdg1.b = b;
        return qlw.a(hdg1);
    }

    public final int d()
    {
        return 7;
    }

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(Arrays.toString(c));
        String s2 = String.valueOf(Arrays.toString(d));
        boolean flag;
        if (a == iye.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return (new StringBuilder(String.valueOf(s).length() + 67 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(" - RemoteDeleteJob:   mediaKeys: ").append(s1).append(" dedupKeys: ").append(s2).append(" isContentAlive: ").append(flag).toString();
    }
}
