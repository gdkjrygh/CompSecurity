// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.io.IOException;

// Referenced classes of package com.google.protobuf:
//            ByteString, CodedOutputStream, CodedInputStream, WireFormat, 
//            InvalidProtocolBufferException

public final class UnknownFieldSetLite
{
    public static final class Builder
    {

        private boolean built;
        private ByteString.Output byteStringOutput;
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

        private Builder mergeFrom(CodedInputStream codedinputstream)
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
                obj = byteStringOutput.toByteString();
                if (((ByteString) (obj)).isEmpty())
                {
                    obj = UnknownFieldSetLite.getDefaultInstance();
                } else
                {
                    obj = new UnknownFieldSetLite(((ByteString) (obj)));
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
                Builder builder = UnknownFieldSetLite.newBuilder();
                builder.mergeFrom(codedinputstream);
                codedinputstream.checkLastTagWas(WireFormat.makeTag(j, 4));
                output.writeTag(j, 3);
                builder.build().writeTo(output);
                output.writeTag(j, 4);
                return true;

            case 4: // '\004'
                return false;
            }
        }

        public final Builder mergeVarintField(int i, int j)
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

        private Builder()
        {
        }

    }


    private static final UnknownFieldSetLite DEFAULT_INSTANCE;
    private final ByteString byteString;

    private UnknownFieldSetLite(ByteString bytestring)
    {
        byteString = bytestring;
    }


    static UnknownFieldSetLite concat(UnknownFieldSetLite unknownfieldsetlite, UnknownFieldSetLite unknownfieldsetlite1)
    {
        return new UnknownFieldSetLite(unknownfieldsetlite.byteString.concat(unknownfieldsetlite1.byteString));
    }

    public static UnknownFieldSetLite getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder()
    {
        return new Builder();
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof UnknownFieldSetLite)
        {
            return byteString.equals(((UnknownFieldSetLite)obj).byteString);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return byteString.hashCode();
    }

    public final void writeTo(CodedOutputStream codedoutputstream)
        throws IOException
    {
        codedoutputstream.writeRawBytes(byteString);
    }

    static 
    {
        DEFAULT_INSTANCE = new UnknownFieldSetLite(ByteString.EMPTY);
    }
}
