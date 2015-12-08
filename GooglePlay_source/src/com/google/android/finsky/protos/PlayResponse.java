// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface PlayResponse
{
    public static final class PlayPayload extends MessageNano
    {

        public Experiments.ExperimentsResponse experimentsResponse;
        public PlayPlusProfile.PlayPlusProfileResponse oBSOLETEPlusProfileResponse;
        public PlusProfile.PlusProfileResponse plusProfileResponse;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (oBSOLETEPlusProfileResponse != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, oBSOLETEPlusProfileResponse);
            }
            j = i;
            if (plusProfileResponse != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, plusProfileResponse);
            }
            i = j;
            if (experimentsResponse != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, experimentsResponse);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    if (oBSOLETEPlusProfileResponse == null)
                    {
                        oBSOLETEPlusProfileResponse = new PlayPlusProfile.PlayPlusProfileResponse();
                    }
                    codedinputbytebuffernano.readMessage(oBSOLETEPlusProfileResponse);
                    break;

                case 18: // '\022'
                    if (plusProfileResponse == null)
                    {
                        plusProfileResponse = new PlusProfile.PlusProfileResponse();
                    }
                    codedinputbytebuffernano.readMessage(plusProfileResponse);
                    break;

                case 26: // '\032'
                    if (experimentsResponse == null)
                    {
                        experimentsResponse = new Experiments.ExperimentsResponse();
                    }
                    codedinputbytebuffernano.readMessage(experimentsResponse);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (oBSOLETEPlusProfileResponse != null)
            {
                codedoutputbytebuffernano.writeMessage(1, oBSOLETEPlusProfileResponse);
            }
            if (plusProfileResponse != null)
            {
                codedoutputbytebuffernano.writeMessage(2, plusProfileResponse);
            }
            if (experimentsResponse != null)
            {
                codedoutputbytebuffernano.writeMessage(3, experimentsResponse);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlayPayload()
        {
            oBSOLETEPlusProfileResponse = null;
            plusProfileResponse = null;
            experimentsResponse = null;
            cachedSize = -1;
        }
    }

    public static final class PlayResponseWrapper extends MessageNano
    {

        public ResponseMessages.ServerCommands commands;
        public PlayPayload payload;
        public ResponseMessages.PreFetch preFetch[];
        public ResponseMessages.ServerMetadata serverMetadata;

        public static PlayResponseWrapper parseFrom(byte abyte0[])
            throws InvalidProtocolBufferNanoException
        {
            return (PlayResponseWrapper)MessageNano.mergeFrom$1ec43da(new PlayResponseWrapper(), abyte0, abyte0.length);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (payload != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(1, payload);
            }
            i = j;
            if (commands != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, commands);
            }
            j = i;
            if (preFetch != null)
            {
                j = i;
                if (preFetch.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= preFetch.length)
                        {
                            break;
                        }
                        ResponseMessages.PreFetch prefetch = preFetch[k];
                        j = i;
                        if (prefetch != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(3, prefetch);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (serverMetadata != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(4, serverMetadata);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    if (payload == null)
                    {
                        payload = new PlayPayload();
                    }
                    codedinputbytebuffernano.readMessage(payload);
                    break;

                case 18: // '\022'
                    if (commands == null)
                    {
                        commands = new ResponseMessages.ServerCommands();
                    }
                    codedinputbytebuffernano.readMessage(commands);
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    ResponseMessages.PreFetch aprefetch[];
                    int j;
                    if (preFetch == null)
                    {
                        j = 0;
                    } else
                    {
                        j = preFetch.length;
                    }
                    aprefetch = new ResponseMessages.PreFetch[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(preFetch, 0, aprefetch, 0, j);
                        k = j;
                    }
                    for (; k < aprefetch.length - 1; k++)
                    {
                        aprefetch[k] = new ResponseMessages.PreFetch();
                        codedinputbytebuffernano.readMessage(aprefetch[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    aprefetch[k] = new ResponseMessages.PreFetch();
                    codedinputbytebuffernano.readMessage(aprefetch[k]);
                    preFetch = aprefetch;
                    break;

                case 34: // '"'
                    if (serverMetadata == null)
                    {
                        serverMetadata = new ResponseMessages.ServerMetadata();
                    }
                    codedinputbytebuffernano.readMessage(serverMetadata);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (payload != null)
            {
                codedoutputbytebuffernano.writeMessage(1, payload);
            }
            if (commands != null)
            {
                codedoutputbytebuffernano.writeMessage(2, commands);
            }
            if (preFetch != null && preFetch.length > 0)
            {
                for (int i = 0; i < preFetch.length; i++)
                {
                    ResponseMessages.PreFetch prefetch = preFetch[i];
                    if (prefetch != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, prefetch);
                    }
                }

            }
            if (serverMetadata != null)
            {
                codedoutputbytebuffernano.writeMessage(4, serverMetadata);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlayResponseWrapper()
        {
            payload = null;
            commands = null;
            preFetch = ResponseMessages.PreFetch.emptyArray();
            serverMetadata = null;
            cachedSize = -1;
        }
    }

}
