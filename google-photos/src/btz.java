// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

final class btz extends ddc
{

    private bty a;

    btz(bty bty1, Class class1, String s)
    {
        a = bty1;
        super(class1, s);
    }

    protected final void a(qlw qlw)
    {
        qlw = (cvk)qlw;
        qlw.a = new cvj[bty.a(a).b()];
        for (int i = 0; i < bty.a(a).b(); i++)
        {
            cvj cvj1 = (cvj)bty.a(a).a(i);
            ((cvk) (qlw)).a[i] = cvj1;
        }

    }

    protected final void b(qlw qlw)
    {
        cvk cvk1 = (cvk)qlw;
        qlw = new HashSet();
        cvj acvj[] = cvk1.a;
        int j = acvj.length;
        int i = 0;
        while (i < j) 
        {
            Object obj = acvj[i];
            if (((cvj) (obj)).a == null || ((cvj) (obj)).b == null || ((cvj) (obj)).c == null || ((cvj) (obj)).e == null)
            {
                String s = bty.a();
                String s1 = String.valueOf(((cvj) (obj)).a);
                String s2 = String.valueOf(((cvj) (obj)).c);
                long l = ((cvj) (obj)).d;
                obj = String.valueOf(((cvj) (obj)).e);
                Log.e(s, (new StringBuilder(String.valueOf(s1).length() + 79 + String.valueOf(s2).length() + String.valueOf(obj).length())).append("missing cover fields mediaKey:").append(s1).append(" coverUri:").append(s2).append(" durationMs:").append(l).append(" title:").append(((String) (obj))).toString());
            } else
            {
                bty.a(a).c(obj);
                qlw.add(((cvj) (obj)).a);
            }
            i++;
        }
        qlw = bty.b(a).a(qlw);
        bty.a(a).a(qlw);
    }
}
