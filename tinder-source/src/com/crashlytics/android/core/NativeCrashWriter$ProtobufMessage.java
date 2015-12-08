// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//            NativeCrashWriter, CodedOutputStream

private static abstract class b
{

    private final int a;
    private final b b[];

    private int c()
    {
        int j = a();
        b ab[] = b;
        int k = ab.length;
        for (int i = 0; i < k; i++)
        {
            j += ab[i].b();
        }

        return j;
    }

    public int a()
    {
        return 0;
    }

    public void a(CodedOutputStream codedoutputstream)
        throws IOException
    {
    }

    public int b()
    {
        int i = c();
        return i + CodedOutputStream.f(i) + CodedOutputStream.d(a);
    }

    public void b(CodedOutputStream codedoutputstream)
        throws IOException
    {
        codedoutputstream.e(a, 2);
        codedoutputstream.e(c());
        a(codedoutputstream);
        a aa[] = b;
        int j = aa.length;
        for (int i = 0; i < j; i++)
        {
            aa[i].b(codedoutputstream);
        }

    }

    public transient (int i,  a1[])
    {
        a = i;
        if (a1 == null)
        {
            a1 = NativeCrashWriter.a();
        }
        b = a1;
    }
}
