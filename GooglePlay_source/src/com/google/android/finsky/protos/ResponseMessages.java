// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public interface ResponseMessages
{
    public static final class PreFetch extends MessageNano
    {

        private static volatile PreFetch _emptyArray[];
        public String etag;
        public boolean hasEtag;
        public boolean hasResponse;
        public boolean hasSoftTtl;
        public boolean hasTtl;
        public boolean hasUrl;
        public byte response[];
        public long softTtl;
        public long ttl;
        public String url;

        public static PreFetch[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PreFetch[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasUrl)
                {
                    i = j;
                    if (url.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, url);
            }
            int k;
label1:
            {
                if (!hasResponse)
                {
                    k = i;
                    if (Arrays.equals(response, WireFormatNano.EMPTY_BYTES))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeBytesSize(2, response);
            }
label2:
            {
                if (!hasEtag)
                {
                    i = k;
                    if (etag.equals(""))
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(3, etag);
            }
label3:
            {
                if (!hasTtl)
                {
                    k = i;
                    if (ttl == 0L)
                    {
                        break label3;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt64Size(4, ttl);
            }
label4:
            {
                if (!hasSoftTtl)
                {
                    i = k;
                    if (softTtl == 0L)
                    {
                        break label4;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt64Size(5, softTtl);
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
                    url = codedinputbytebuffernano.readString();
                    hasUrl = true;
                    break;

                case 18: // '\022'
                    response = codedinputbytebuffernano.readBytes();
                    hasResponse = true;
                    break;

                case 26: // '\032'
                    etag = codedinputbytebuffernano.readString();
                    hasEtag = true;
                    break;

                case 32: // ' '
                    ttl = codedinputbytebuffernano.readRawVarint64();
                    hasTtl = true;
                    break;

                case 40: // '('
                    softTtl = codedinputbytebuffernano.readRawVarint64();
                    hasSoftTtl = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasUrl || !url.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, url);
            }
            if (hasResponse || !Arrays.equals(response, WireFormatNano.EMPTY_BYTES))
            {
                codedoutputbytebuffernano.writeBytes(2, response);
            }
            if (hasEtag || !etag.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, etag);
            }
            if (hasTtl || ttl != 0L)
            {
                codedoutputbytebuffernano.writeInt64(4, ttl);
            }
            if (hasSoftTtl || softTtl != 0L)
            {
                codedoutputbytebuffernano.writeInt64(5, softTtl);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PreFetch()
        {
            url = "";
            hasUrl = false;
            response = WireFormatNano.EMPTY_BYTES;
            hasResponse = false;
            etag = "";
            hasEtag = false;
            ttl = 0L;
            hasTtl = false;
            softTtl = 0L;
            hasSoftTtl = false;
            cachedSize = -1;
        }
    }

    public static final class ServerCommands extends MessageNano
    {

        public boolean clearCache;
        public String displayErrorMessage;
        public boolean hasClearCache;
        public boolean hasDisplayErrorMessage;
        public boolean hasLogErrorStacktrace;
        public String logErrorStacktrace;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasClearCache)
                {
                    i = j;
                    if (!clearCache)
                    {
                        break label0;
                    }
                }
                i = j + (CodedOutputByteBufferNano.computeTagSize(1) + 1);
            }
            int k;
label1:
            {
                if (!hasDisplayErrorMessage)
                {
                    k = i;
                    if (displayErrorMessage.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, displayErrorMessage);
            }
label2:
            {
                if (!hasLogErrorStacktrace)
                {
                    i = k;
                    if (logErrorStacktrace.equals(""))
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(3, logErrorStacktrace);
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

                case 8: // '\b'
                    clearCache = codedinputbytebuffernano.readBool();
                    hasClearCache = true;
                    break;

                case 18: // '\022'
                    displayErrorMessage = codedinputbytebuffernano.readString();
                    hasDisplayErrorMessage = true;
                    break;

                case 26: // '\032'
                    logErrorStacktrace = codedinputbytebuffernano.readString();
                    hasLogErrorStacktrace = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasClearCache || clearCache)
            {
                codedoutputbytebuffernano.writeBool(1, clearCache);
            }
            if (hasDisplayErrorMessage || !displayErrorMessage.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, displayErrorMessage);
            }
            if (hasLogErrorStacktrace || !logErrorStacktrace.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, logErrorStacktrace);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ServerCommands()
        {
            clearCache = false;
            hasClearCache = false;
            displayErrorMessage = "";
            hasDisplayErrorMessage = false;
            logErrorStacktrace = "";
            hasLogErrorStacktrace = false;
            cachedSize = -1;
        }
    }

    public static final class ServerMetadata extends MessageNano
    {

        public boolean hasLatencyMillis;
        public long latencyMillis;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasLatencyMillis)
                {
                    i = j;
                    if (latencyMillis == 0L)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, latencyMillis);
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

                case 8: // '\b'
                    latencyMillis = codedinputbytebuffernano.readRawVarint64();
                    hasLatencyMillis = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasLatencyMillis || latencyMillis != 0L)
            {
                codedoutputbytebuffernano.writeInt64(1, latencyMillis);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ServerMetadata()
        {
            latencyMillis = 0L;
            hasLatencyMillis = false;
            cachedSize = -1;
        }
    }

}
