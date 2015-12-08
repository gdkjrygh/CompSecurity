// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.logging.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class ang.Object
    implements epg
{

    private epj a;

    public final void a(Object obj)
    {
        int j;
        j = 1;
        obj = (fip)obj;
        if (a.j == 0x80000000 || obj == null) goto _L2; else goto _L1
_L1:
        epj epj1;
        int l;
        epj1 = a;
        int i = ((fip) (obj)).getUnrangedLength();
        boolean flag;
        if (epj1.a != i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (i < epj1.a)
            {
                if (i == 0)
                {
                    epj1.a();
                } else
                if (epj1.b + epj1.k.size() > i)
                {
                    epj1.c((epj1.b + epj1.k.size()) - i);
                }
            }
            epj1.a = i;
            if (epj1.c != 0x80000000)
            {
                epj1.g = true;
            }
        }
        obj = ((Object) (((fip) (obj)).getItems()));
        if (obj.length <= 0) goto _L4; else goto _L3
_L3:
        epj1 = a;
        l = a.j;
        if (epj1.b != 0x80000000 && obj.length + l >= epj1.b && l <= epj1.b + epj1.k.size()) goto _L6; else goto _L5
_L5:
        epj1.k.clear();
        epj1.k.addAll(Arrays.asList(((Object []) (obj))));
        epj1.b = l;
        epj1.c = l;
        epj1.d = obj.length + l;
_L4:
        if (a.h || flag)
        {
            if (a.a == 0 || a.e >= a.b && a.e < a.b + a.k.size())
            {
                a.h = false;
            }
            a.l.a();
        }
_L2:
        a.i = false;
        if (a.a > 0)
        {
            a.b();
        }
        return;
_L6:
        boolean flag1;
        int k;
        int i1;
        flag1 = j;
        if (epj1.c != 0x80000000)
        {
            if (obj.length + l >= epj1.c && l <= epj1.d)
            {
                flag1 = j;
            } else
            {
                flag1 = false;
            }
        }
        j = obj.length;
        k = Math.max(epj1.b - l, 0);
        j = (Math.max((j + l) - epj1.b - epj1.k.size(), 0) + k + epj1.k.size()) - 10000;
        if (j <= 0) goto _L8; else goto _L7
_L7:
        if (l < epj1.b) goto _L10; else goto _L9
_L9:
        epj1.b(j);
        epj1.b = j + epj1.b;
        if (epj1.c != 0x80000000)
        {
            epj1.c = Math.max(epj1.c, epj1.b);
        }
_L8:
        k = Math.max(0, epj1.b - l);
        i1 = Math.max(0, (obj.length + l) - epj1.b - epj1.k.size());
        for (j = k; j < obj.length - i1; j++)
        {
            epj1.k.set((l + j) - epj1.b, obj[j]);
        }

        break; /* Loop/switch isn't completed */
_L10:
        epj1.c(j);
        if (epj1.c != 0x80000000)
        {
            epj1.d = Math.min(epj1.d, epj1.b + epj1.k.size());
        }
        if (true) goto _L8; else goto _L11
_L11:
        if (k > 0)
        {
            epj1.k.addAll(0, Arrays.asList(((Object []) (obj))).subList(0, k));
        }
        if (i1 > 0)
        {
            epj1.k.addAll(Arrays.asList(((Object []) (obj))).subList(obj.length - i1, obj.length));
        }
        epj1.b = Math.min(epj1.b, l);
        if (flag1)
        {
            if (epj1.c == 0x80000000)
            {
                epj1.c = l;
                epj1.d = obj.length + l;
            } else
            {
                epj1.c = Math.min(epj1.c, l);
                epj1.d = Math.max(epj1.d, obj.length + l);
            }
        }
        if (true) goto _L4; else goto _L12
_L12:
    }

    public final void a(String s)
    {
        Logger.c("Failed loading items: %s", new Object[] {
            s
        });
    }

    (epj epj1)
    {
        a = epj1;
        super();
    }
}
