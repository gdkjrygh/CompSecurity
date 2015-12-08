// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import com.crashlytics.android.core.internal.models.ThreadData;
import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//            NativeCrashWriter, ByteString, CodedOutputStream

private static final class b extends e
{

    private final String a;
    private final int b;

    private boolean c()
    {
        return a != null && a.length() > 0;
    }

    public final int a()
    {
        int i;
        if (c())
        {
            i = CodedOutputStream.b(1, ByteString.a(a));
        } else
        {
            i = 0;
        }
        return i + CodedOutputStream.c(2, b);
    }

    public final void a(CodedOutputStream codedoutputstream)
        throws IOException
    {
        if (c())
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
