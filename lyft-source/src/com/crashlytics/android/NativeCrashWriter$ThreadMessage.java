// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.models.ThreadData;

// Referenced classes of package com.crashlytics.android:
//            ByteString, CodedOutputStream

final class b extends e
{

    private final String a;
    private final int b;

    private boolean d()
    {
        return a != null && a.length() > 0;
    }

    public int a()
    {
        int i;
        if (d())
        {
            i = CodedOutputStream.b(1, ByteString.a(a));
        } else
        {
            i = 0;
        }
        return i + CodedOutputStream.d(2, b);
    }

    public void a(CodedOutputStream codedoutputstream)
    {
        if (d())
        {
            codedoutputstream.a(1, ByteString.a(a));
        }
        codedoutputstream.a(2, b);
    }

    public e(ThreadData threaddata, e e)
    {
        super(1, new e[] {
            e
        });
        a = threaddata.a;
        b = threaddata.b;
    }
}
