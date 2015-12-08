// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ega
{

    private final mmv a;
    private final mhh b;
    private final eto c;
    private final noz d;

    ega(Context context, mmv mmv1, mhh mhh1, eto eto1)
    {
        d = noz.a(context, 3, "ABMediaStateFetcher", new String[] {
            "sync"
        });
        a = mmv1;
        b = mhh1;
        c = eto1;
    }

    public final int a(Context context, int i, int j)
    {
        String s;
        try
        {
            s = a.a(i).b("account_name");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (d.a())
            {
                noy.a(i);
            }
            return 0;
        }
        context = b.a(context, s);
        context.a(30L, TimeUnit.SECONDS);
        if (context.c())
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (d.a())
        {
            noy.a(i);
        }
        context.b();
        return 0;
        mhn mhn1;
        boolean flag;
        long l = noy.a();
        mhn1 = (mhn)context.a(s).a(30, TimeUnit.SECONDS);
        if (d.a())
        {
            noy.a("fetch time", l);
        }
        flag = mhn1.r().a();
        if (flag) goto _L2; else goto _L1
_L1:
        j = 0;
_L4:
        if (j == 0)
        {
            context.b();
            return 0;
        }
          goto _L3
_L2:
        Exception exception;
        if (!TextUtils.equals(mhn1.a().e(), s))
        {
            j = 0;
        } else
        {
            j = 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        i = a(((mhe) (context)), s, i, c.d(i), 30);
        context.b();
        return i;
        exception;
        context.b();
        throw exception;
    }

    public final int a(mhe mhe1, String s, int i, List list, int j)
    {
        int k;
        int l;
        int j1;
        if (list.isEmpty())
        {
            return 0;
        }
        j1 = list.size();
        k = 0;
        l = 0;
_L15:
        Object obj;
        int k1;
        if (k >= j1)
        {
            break MISSING_BLOCK_LABEL_446;
        }
        k1 = Math.min(j1 - k, 25);
        String as[] = new String[k1];
        list.subList(k, k + k1).toArray(as);
        obj = (mhs)mhe1.a(s, as).a(j, TimeUnit.SECONDS);
        if (((mhs) (obj)).r().a()) goto _L2; else goto _L1
_L1:
        int i1;
        if (d.a())
        {
            noy.a(i);
        }
        i1 = -1;
_L14:
        if (i1 >= 0) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L16:
        if (d.a())
        {
            noy.a(i);
            noy.a("withError", Boolean.valueOf(flag));
            noy.a(list.size());
            noy.a("updated", Integer.valueOf(l));
        }
        return l;
_L2:
        eto eto1;
        ArrayList arraylist;
        obj = ((mhs) (obj)).a();
        new efz();
        eto1 = c;
        p.b(obj, "Can not convert null state.");
        String as1[];
        int ai[];
        long al[];
        String s1;
        if (((mhr) (obj)).a().length == ((mhr) (obj)).b().length && ((mhr) (obj)).b().length == ((mhr) (obj)).c().length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Require the same number of uri, timestamp and status.");
        arraylist = new ArrayList();
        as1 = ((mhr) (obj)).a();
        ai = ((mhr) (obj)).b();
        al = ((mhr) (obj)).c();
        i1 = 0;
        if (i1 >= as1.length)
        {
            break MISSING_BLOCK_LABEL_416;
        }
        s1 = as1[i1];
        ai[i1];
        JVM INSTR tableswitch 1 4: default 340
    //                   1 384
    //                   2 392
    //                   3 400
    //                   4 408;
           goto _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_408;
_L6:
        break; /* Loop/switch isn't completed */
_L5:
        obj = efx.a;
_L13:
        arraylist.add(new efw(s1, ((efx) (obj)), al[i1]));
        i1++;
        if (true) goto _L11; else goto _L10
_L11:
        break MISSING_BLOCK_LABEL_291;
_L10:
        obj = efx.b;
        continue; /* Loop/switch isn't completed */
_L7:
        obj = efx.c;
        continue; /* Loop/switch isn't completed */
_L8:
        obj = efx.d;
        continue; /* Loop/switch isn't completed */
        obj = efx.e;
        if (true) goto _L13; else goto _L12
_L12:
        i1 = eto1.b(i, arraylist);
          goto _L14
_L4:
        l += i1;
        k += k1;
          goto _L15
        flag = false;
          goto _L16
    }
}
