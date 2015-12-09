// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import java.util.List;

final class ang.Object
    implements ckj
{

    private String a;
    private Integer b;
    private Integer c;
    private int d;
    private int e;
    private int f;

    private bgz a(List list)
    {
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        String s;
        List list1;
        Integer integer;
        Integer integer1;
        try
        {
            if (list.isEmpty())
            {
                break MISSING_BLOCK_LABEL_93;
            }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            bka.b("Could not get attribution icon", list);
            return null;
        }
        s = a;
        list1 = chw.a(list);
        integer = b;
        integer1 = c;
        if (d <= 0)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        list = Integer.valueOf(d);
_L1:
        list = new bgz(s, list1, integer, integer1, list, e + f);
        return list;
        list = null;
          goto _L1
        return null;
    }

    public final Object a(Object obj)
    {
        return a((List)obj);
    }

    (String s, Integer integer, Integer integer1, int i, int j, int k)
    {
        a = s;
        b = integer;
        c = integer1;
        d = i;
        e = j;
        f = k;
        super();
    }
}
