// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.wobs.imageupload;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

public interface NanoUserAddedImageMetadata
{
    public static final class UserAddedImageMetadata extends ExtendableMessageNano
    {

        public String localSourceUri;
        public String sessionMaterial;
        public Integer tag;
        public String wobInstanceId;

        private UserAddedImageMetadata clear()
        {
            wobInstanceId = null;
            localSourceUri = null;
            sessionMaterial = null;
            tag = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UserAddedImageMetadata mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 65
        //                       10: 67
        //                       18: 78
        //                       26: 89
        //                       32: 100;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
            return this;
_L3:
            wobInstanceId = codedinputbytebuffernano.readString();
              goto _L7
_L4:
            localSourceUri = codedinputbytebuffernano.readString();
              goto _L7
_L5:
            sessionMaterial = codedinputbytebuffernano.readString();
              goto _L7
_L6:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                tag = Integer.valueOf(j);
                break;
            }
            if (true) goto _L7; else goto _L8
_L8:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (wobInstanceId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, wobInstanceId);
            }
            j = i;
            if (localSourceUri != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, localSourceUri);
            }
            i = j;
            if (sessionMaterial != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, sessionMaterial);
            }
            j = i;
            if (tag != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, tag.intValue());
            }
            return j;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (wobInstanceId != null)
            {
                codedoutputbytebuffernano.writeString(1, wobInstanceId);
            }
            if (localSourceUri != null)
            {
                codedoutputbytebuffernano.writeString(2, localSourceUri);
            }
            if (sessionMaterial != null)
            {
                codedoutputbytebuffernano.writeString(3, sessionMaterial);
            }
            if (tag != null)
            {
                codedoutputbytebuffernano.writeInt32(4, tag.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UserAddedImageMetadata()
        {
            clear();
        }
    }

}
