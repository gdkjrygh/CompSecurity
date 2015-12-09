// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.crashlytics.android.core.CodedOutputStream;

final class amw extends amv
{

    private final amv a[];

    public transient amw(amv aamv[])
    {
        super(0, new amv[0]);
        a = aamv;
    }

    public final int b()
    {
        int i = 0;
        amv aamv[] = a;
        int k = aamv.length;
        int j = 0;
        for (; i < k; i++)
        {
            j += aamv[i].b();
        }

        return j;
    }

    public final void b(CodedOutputStream codedoutputstream)
    {
        amv aamv[] = a;
        int j = aamv.length;
        for (int i = 0; i < j; i++)
        {
            aamv[i].b(codedoutputstream);
        }

    }
}
