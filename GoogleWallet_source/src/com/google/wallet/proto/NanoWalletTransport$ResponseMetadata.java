// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletTransport

public static final class clear extends ExtendableMessageNano
{
    public static final class RejectedRequestInfo extends ExtendableMessageNano
    {

        private static volatile RejectedRequestInfo _emptyArray[];
        public NanoWalletError.CallError callError;
        public NanoWalletEntities.KycStatus kycStatus;
        public NanoWalletEntities.LatestLegalDocument latestLegalDocument;
        public Integer reason;

        private RejectedRequestInfo clear()
        {
            reason = null;
            callError = null;
            latestLegalDocument = null;
            kycStatus = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static RejectedRequestInfo[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new RejectedRequestInfo[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private RejectedRequestInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 65
        //                       8: 67
        //                       18: 138
        //                       26: 167
        //                       34: 196;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
                reason = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (callError == null)
            {
                callError = new NanoWalletError.CallError();
            }
            codedinputbytebuffernano.readMessage(callError);
            continue; /* Loop/switch isn't completed */
_L5:
            if (latestLegalDocument == null)
            {
                latestLegalDocument = new NanoWalletEntities.LatestLegalDocument();
            }
            codedinputbytebuffernano.readMessage(latestLegalDocument);
            continue; /* Loop/switch isn't completed */
_L6:
            if (kycStatus == null)
            {
                kycStatus = new NanoWalletEntities.KycStatus();
            }
            codedinputbytebuffernano.readMessage(kycStatus);
            if (true) goto _L7; else goto _L8
_L8:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (reason != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, reason.intValue());
            }
            j = i;
            if (callError != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, callError);
            }
            i = j;
            if (latestLegalDocument != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, latestLegalDocument);
            }
            j = i;
            if (kycStatus != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, kycStatus);
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
            if (reason != null)
            {
                codedoutputbytebuffernano.writeInt32(1, reason.intValue());
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            if (latestLegalDocument != null)
            {
                codedoutputbytebuffernano.writeMessage(3, latestLegalDocument);
            }
            if (kycStatus != null)
            {
                codedoutputbytebuffernano.writeMessage(4, kycStatus);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RejectedRequestInfo()
        {
            clear();
        }
    }


    public profileToken profileToken;
    public RejectedRequestInfo rejections[];

    private t clear()
    {
        rejections = RejectedRequestInfo.emptyArray();
        profileToken = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (storeUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                RejectedRequestInfo arejectedrequestinfo[];
                int j;
                if (rejections == null)
                {
                    j = 0;
                } else
                {
                    j = rejections.length;
                }
                arejectedrequestinfo = new RejectedRequestInfo[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(rejections, 0, arejectedrequestinfo, 0, j);
                    k = j;
                }
                for (; k < arejectedrequestinfo.length - 1; k++)
                {
                    arejectedrequestinfo[k] = new RejectedRequestInfo();
                    codedinputbytebuffernano.readMessage(arejectedrequestinfo[k]);
                    codedinputbytebuffernano.readTag();
                }

                arejectedrequestinfo[k] = new RejectedRequestInfo();
                codedinputbytebuffernano.readMessage(arejectedrequestinfo[k]);
                rejections = arejectedrequestinfo;
                break;

            case 26: // '\032'
                if (profileToken == null)
                {
                    profileToken = new t>();
                }
                codedinputbytebuffernano.readMessage(profileToken);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (rejections != null)
        {
            j = i;
            if (rejections.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= rejections.length)
                    {
                        break;
                    }
                    RejectedRequestInfo rejectedrequestinfo = rejections[k];
                    j = i;
                    if (rejectedrequestinfo != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(1, rejectedrequestinfo);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (profileToken != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, profileToken);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (rejections != null && rejections.length > 0)
        {
            for (int i = 0; i < rejections.length; i++)
            {
                RejectedRequestInfo rejectedrequestinfo = rejections[i];
                if (rejectedrequestinfo != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, rejectedrequestinfo);
                }
            }

        }
        if (profileToken != null)
        {
            codedoutputbytebuffernano.writeMessage(3, profileToken);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public RejectedRequestInfo.clear()
    {
        clear();
    }
}
