// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;


// Referenced classes of package com.crashlytics.android:
//            CodedOutputStream

final class a extends a
{

    private final b a[];

    public int b()
    {
        int i = 0;
        a aa[] = a;
        int k = aa.length;
        int j = 0;
        for (; i < k; i++)
        {
            j += aa[i].b();
        }

        return j;
    }

    public void b(CodedOutputStream codedoutputstream)
    {
        b ab[] = a;
        int j = ab.length;
        for (int i = 0; i < j; i++)
        {
            ab[i].b(codedoutputstream);
        }

    }

    public transient ( a1[])
    {
        super(0, new <init>[0]);
        a = a1;
    }
}
