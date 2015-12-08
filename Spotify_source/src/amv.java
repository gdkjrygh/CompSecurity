// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.crashlytics.android.core.CodedOutputStream;

abstract class amv
{

    private final int a;
    private final amv b[];

    public transient amv(int i, amv aamv[])
    {
        a = i;
        if (aamv == null)
        {
            aamv = aml.a();
        }
        b = aamv;
    }

    private int c()
    {
        int j = a();
        amv aamv[] = b;
        int k = aamv.length;
        for (int i = 0; i < k; i++)
        {
            j += aamv[i].b();
        }

        return j;
    }

    public int a()
    {
        return 0;
    }

    public void a(CodedOutputStream codedoutputstream)
    {
    }

    public int b()
    {
        int i = c();
        return i + CodedOutputStream.f(i) + CodedOutputStream.d(a);
    }

    public void b(CodedOutputStream codedoutputstream)
    {
        codedoutputstream.e(a, 2);
        codedoutputstream.e(c());
        a(codedoutputstream);
        amv aamv[] = b;
        int j = aamv.length;
        for (int i = 0; i < j; i++)
        {
            aamv[i].b(codedoutputstream);
        }

    }
}
