// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//            NativeCrashWriter, CodedOutputStream, ByteString

private static final class a extends sage
{

    ByteString a;

    public final int a()
    {
        return CodedOutputStream.b(1, a);
    }

    public final void a(CodedOutputStream codedoutputstream)
        throws IOException
    {
        codedoutputstream.a(1, a);
    }

    public sage(ByteString bytestring)
    {
        super(6, new sage[0]);
        a = bytestring;
    }
}
