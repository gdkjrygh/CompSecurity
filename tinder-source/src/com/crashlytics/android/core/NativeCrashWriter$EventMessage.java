// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//            NativeCrashWriter, CodedOutputStream, ByteString

private static final class b extends ge
{

    private final long a;
    private final String b;

    public final int a()
    {
        return CodedOutputStream.b(1, a) + CodedOutputStream.b(2, ByteString.a(b));
    }

    public final void a(CodedOutputStream codedoutputstream)
        throws IOException
    {
        codedoutputstream.a(1, a);
        codedoutputstream.a(2, ByteString.a(b));
    }

    public transient ge(long l, String s, ge age[])
    {
        super(10, age);
        a = l;
        b = s;
    }
}
