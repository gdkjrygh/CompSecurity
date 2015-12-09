// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.micro;

import java.io.IOException;

// Referenced classes of package com.google.protobuf.micro:
//            InvalidProtocolBufferMicroException, CodedInputStreamMicro, CodedOutputStreamMicro

public abstract class MessageMicro
{

    public MessageMicro()
    {
    }

    public abstract int getCachedSize();

    public abstract int getSerializedSize();

    public abstract MessageMicro mergeFrom(CodedInputStreamMicro codedinputstreammicro)
        throws IOException;

    public MessageMicro mergeFrom$e0bd1db(byte abyte0[], int i)
        throws InvalidProtocolBufferMicroException
    {
        try
        {
            abyte0 = new CodedInputStreamMicro(abyte0, 0, i);
            mergeFrom(abyte0);
            abyte0.checkLastTagWas(0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return this;
    }

    public abstract void writeTo(CodedOutputStreamMicro codedoutputstreammicro)
        throws IOException;
}
