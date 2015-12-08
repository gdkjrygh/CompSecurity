// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.IOException;

// Referenced classes of package com.crashlytics.android:
//            NativeCrashWriter, CodedOutputStream

private static final class e extends e
{

    private static final int PROTOBUF_TAG = 5;

    public int getPropertiesSize()
    {
        return 0 + CodedOutputStream.computeFloatSize(1, 0.0F) + CodedOutputStream.computeInt32Size(2, 0) + CodedOutputStream.computeBoolSize(3, false) + CodedOutputStream.computeUInt32Size(4, 0) + CodedOutputStream.computeUInt64Size(5, 0L) + CodedOutputStream.computeUInt64Size(6, 0L);
    }

    public void writeProperties(CodedOutputStream codedoutputstream)
        throws IOException
    {
        codedoutputstream.writeFloat(1, 0.0F);
        codedoutputstream.writeInt32(2, 0);
        codedoutputstream.writeBool(3, false);
        codedoutputstream.writeUInt32(4, 0);
        codedoutputstream.writeUInt64(5, 0L);
        codedoutputstream.writeUInt64(6, 0L);
    }

    public e()
    {
        super(5, new e[0]);
    }
}
