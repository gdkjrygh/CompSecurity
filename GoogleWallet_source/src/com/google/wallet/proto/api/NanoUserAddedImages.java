// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

public interface NanoUserAddedImages
{
    public static final class UserAddedImage extends ExtendableMessageNano
    {

        private static volatile UserAddedImage _emptyArray[];
        public Integer action;
        public Float aspectRatio;
        public String localSourceUri;
        public Integer tag;

        private UserAddedImage clear()
        {
            localSourceUri = null;
            aspectRatio = null;
            tag = null;
            action = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static UserAddedImage[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new UserAddedImage[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private UserAddedImage mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 65
        //                       10: 67
        //                       21: 78
        //                       24: 92
        //                       32: 138;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
            return this;
_L3:
            localSourceUri = codedinputbytebuffernano.readString();
              goto _L7
_L4:
            aspectRatio = Float.valueOf(codedinputbytebuffernano.readFloat());
              goto _L7
_L5:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                tag = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 1: // '\001'
            case 2: // '\002'
                action = Integer.valueOf(k);
                break;
            }
            if (true) goto _L7; else goto _L8
_L8:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (localSourceUri != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, localSourceUri);
            }
            j = i;
            if (aspectRatio != null)
            {
                j = i + CodedOutputByteBufferNano.computeFloatSize(2, aspectRatio.floatValue());
            }
            i = j;
            if (tag != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, tag.intValue());
            }
            j = i;
            if (action != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, action.intValue());
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
            if (localSourceUri != null)
            {
                codedoutputbytebuffernano.writeString(1, localSourceUri);
            }
            if (aspectRatio != null)
            {
                codedoutputbytebuffernano.writeFloat(2, aspectRatio.floatValue());
            }
            if (tag != null)
            {
                codedoutputbytebuffernano.writeInt32(3, tag.intValue());
            }
            if (action != null)
            {
                codedoutputbytebuffernano.writeInt32(4, action.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UserAddedImage()
        {
            clear();
        }
    }

    public static final class UserAddedImagePrefill extends ExtendableMessageNano
    {

        private static volatile UserAddedImagePrefill _emptyArray[];
        public Integer tag;
        public String uri;

        private UserAddedImagePrefill clear()
        {
            uri = null;
            tag = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static UserAddedImagePrefill[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new UserAddedImagePrefill[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private UserAddedImagePrefill mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       10: 51
        //                       16: 62;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            uri = codedinputbytebuffernano.readString();
              goto _L5
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                tag = Integer.valueOf(j);
                break;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (uri != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, uri);
            }
            j = i;
            if (tag != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, tag.intValue());
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
            if (uri != null)
            {
                codedoutputbytebuffernano.writeString(1, uri);
            }
            if (tag != null)
            {
                codedoutputbytebuffernano.writeInt32(2, tag.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UserAddedImagePrefill()
        {
            clear();
        }
    }

}
