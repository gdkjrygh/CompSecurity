// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.IOException;

// Referenced classes of package com.crashlytics.android:
//            NativeCrashWriter, CodedOutputStream, ByteString

private static final class eData.importance extends ge
{

    private static final int PROTOBUF_TAG = 3;
    private final long address;
    private final String file;
    private final int importance;
    private final long offset;
    private final String symbol;

    public int getPropertiesSize()
    {
        return CodedOutputStream.computeUInt64Size(1, address) + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(symbol)) + CodedOutputStream.computeBytesSize(3, ByteString.copyFromUtf8(file)) + CodedOutputStream.computeUInt64Size(4, offset) + CodedOutputStream.computeUInt32Size(5, importance);
    }

    public void writeProperties(CodedOutputStream codedoutputstream)
        throws IOException
    {
        codedoutputstream.writeUInt64(1, address);
        codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(symbol));
        codedoutputstream.writeBytes(3, ByteString.copyFromUtf8(file));
        codedoutputstream.writeUInt64(4, offset);
        codedoutputstream.writeUInt32(5, importance);
    }

    public ge(com.crashlytics.android.internal.models. )
    {
        super(3, new ge[0]);
        address = ._20_supe_19_;
        symbol = ._20_supe_19_;
        file = ._20_supe_19_;
        offset = ._20_supe_19_;
        importance = .;
    }
}
