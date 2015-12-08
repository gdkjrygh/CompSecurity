// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.io.IOException;

// Referenced classes of package com.google.protobuf:
//            UnknownFieldSetLite, ByteString, CodedOutputStream, CodedInputStream, 
//            WireFormat, InvalidProtocolBufferException

public static final class <init>
{

    private boolean built;
    private _cls4 byteStringOutput;
    private CodedOutputStream output;

    private void ensureInitializedButNotBuilt()
    {
        if (built)
        {
            throw new IllegalStateException("Do not reuse UnknownFieldSetLite Builders.");
        }
        if (output == null && byteStringOutput == null)
        {
            byteStringOutput = ByteString.newOutput(100);
            output = CodedOutputStream.newInstance(byteStringOutput);
        }
    }

    private byteStringOutput mergeFrom(CodedInputStream codedinputstream)
        throws IOException
    {
        int i;
        do
        {
            i = codedinputstream.readTag();
        } while (i != 0 && mergeFieldFrom(i, codedinputstream));
        return this;
    }

    public final UnknownFieldSetLite build()
    {
        if (built)
        {
            throw new IllegalStateException("Do not reuse UnknownFieldSetLite Builders.");
        }
        built = true;
        Object obj;
        if (output == null)
        {
            obj = UnknownFieldSetLite.getDefaultInstance();
        } else
        {
            try
            {
                output.flush();
            }
            catch (IOException ioexception) { }
            obj = byteStringOutput.ng();
            if (((ByteString) (obj)).isEmpty())
            {
                obj = UnknownFieldSetLite.getDefaultInstance();
            } else
            {
                obj = new UnknownFieldSetLite(((ByteString) (obj)), null);
            }
        }
        output = null;
        byteStringOutput = null;
        return ((UnknownFieldSetLite) (obj));
    }

    public final boolean mergeFieldFrom(int i, CodedInputStream codedinputstream)
        throws IOException
    {
        ensureInitializedButNotBuilt();
        int j = WireFormat.getTagFieldNumber(i);
        switch (WireFormat.getTagWireType(i))
        {
        default:
            throw InvalidProtocolBufferException.invalidWireType();

        case 0: // '\0'
            output.writeUInt64(j, codedinputstream.readInt64());
            return true;

        case 5: // '\005'
            output.writeFixed32(j, codedinputstream.readFixed32());
            return true;

        case 1: // '\001'
            output.writeFixed64(j, codedinputstream.readFixed64());
            return true;

        case 2: // '\002'
            output.writeBytes(j, codedinputstream.readBytes());
            return true;

        case 3: // '\003'
            byteStringOutput bytestringoutput = UnknownFieldSetLite.newBuilder();
            bytestringoutput.mergeFrom(codedinputstream);
            codedinputstream.checkLastTagWas(WireFormat.makeTag(j, 4));
            output.writeTag(j, 3);
            bytestringoutput.build().writeTo(output);
            output.writeTag(j, 4);
            return true;

        case 4: // '\004'
            return false;
        }
    }

    public final output mergeVarintField(int i, int j)
    {
        if (i == 0)
        {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        ensureInitializedButNotBuilt();
        try
        {
            output.writeUInt64(i, j);
        }
        catch (IOException ioexception)
        {
            return this;
        }
        return this;
    }

    private on()
    {
    }

    on(on on)
    {
        this();
    }
}
