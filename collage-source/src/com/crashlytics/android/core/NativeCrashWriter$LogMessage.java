// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//            NativeCrashWriter, CodedOutputStream, ByteString

private static final class logBytes extends sage
{

    private static final int PROTOBUF_TAG = 6;
    ByteString logBytes;

    public int getPropertiesSize()
    {
        return CodedOutputStream.computeBytesSize(1, logBytes);
    }

    public void writeProperties(CodedOutputStream codedoutputstream)
        throws IOException
    {
        codedoutputstream.writeBytes(1, logBytes);
    }

    public sage(ByteString bytestring)
    {
        super(6, new sage[0]);
        logBytes = bytestring;
    }
}
