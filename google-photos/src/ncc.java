// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;

final class ncc
{

    final Map a = new HashMap();
    final ncd b = new ncd(null);

    ncc()
    {
    }

    private static void a(ncd ncd1)
    {
        ncd1.a.b = ncd1.b;
        ncd1.b.a = ncd1.a;
    }

    public final Bitmap a()
    {
        for (ncd ncd1 = b.b; ncd1 != b; ncd1 = ncd1.b)
        {
            if (ncd1.a() > 0)
            {
                return ncd1.b();
            }
            a.remove(ncd1.c);
            a(ncd1);
        }

        return null;
    }

    public final Bitmap a(nbw nbw)
    {
        ncd ncd1 = (ncd)a.get(nbw);
        if (ncd1 == null)
        {
            ncd1 = new ncd(nbw);
            a.put(nbw, ncd1);
            nbw = ncd1;
        } else
        {
            a(ncd1);
            nbw = ncd1;
        }
        nbw.b = b;
        nbw.a = b.a;
        ((ncd) (nbw)).a.b = nbw;
        b.a = nbw;
        return nbw.b();
    }

    public final String toString()
    {
        ncd ncd1 = b.a;
        String s = "GroupedLinkedMap(";
        Object obj = s;
        if (!a.isEmpty())
        {
            for (obj = ncd1; obj != b; obj = ((ncd) (obj)).a)
            {
                s = String.valueOf(s);
                String s1 = String.valueOf(((ncd) (obj)).c);
                int i = ((ncd) (obj)).a();
                s = (new StringBuilder(String.valueOf(s).length() + 16 + String.valueOf(s1).length())).append(s).append("{").append(s1).append(", ").append(i).append("} ").toString();
            }

            obj = s.substring(0, s.length() - 1);
        }
        return String.valueOf(obj).concat(")");
    }
}
