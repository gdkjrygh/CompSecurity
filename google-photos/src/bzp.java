// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

final class bzp extends ddc
{

    private bzo a;

    bzp(bzo bzo1, Class class1, String s)
    {
        a = bzo1;
        super(class1, s);
    }

    protected final void a(qlw qlw)
    {
        qlw = (cvm)qlw;
        qlw.a = new cvl[bzo.a(a).b()];
        int j;
        for (int i = 0; i < bzo.a(a).b(); i = j + 1)
        {
            cvl cvl1 = (cvl)bzo.a(a).a(i);
            j = i;
            if (cvl1 != null)
            {
                ((cvm) (qlw)).a[i] = cvl1;
                j = i + 1;
            }
        }

    }

    protected final void b(qlw qlw)
    {
        qlw = ((cvm)qlw).a;
        int j = qlw.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = qlw[i];
            if (((cvl) (obj)).a == null || ((cvl) (obj)).b == null || ((cvl) (obj)).c == null)
            {
                String s = bzo.a();
                String s1 = String.valueOf(((cvl) (obj)).a);
                String s2 = String.valueOf(((cvl) (obj)).b);
                String s3 = String.valueOf(((cvl) (obj)).c);
                Log.e(s, (new StringBuilder(String.valueOf(s1).length() + 47 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("missing video fields mediaKey:").append(s1).append(" versionId:").append(s2).append(" path:").append(s3).toString());
            }
            bzo.a(a).c(obj);
        }

    }
}
