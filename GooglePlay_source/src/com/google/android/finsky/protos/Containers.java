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

public interface Containers
{
    public static final class ContainerMetadata extends MessageNano
    {

        public String analyticsCookie;
        public String browseUrl;
        public ContainerView containerView[];
        public long estimatedResults;
        public boolean hasAnalyticsCookie;
        public boolean hasBrowseUrl;
        public boolean hasEstimatedResults;
        public boolean hasNextPageUrl;
        public boolean hasOrdered;
        public boolean hasRelevance;
        public String nextPageUrl;
        public boolean ordered;
        public double relevance;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasBrowseUrl)
                {
                    i = j;
                    if (browseUrl.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, browseUrl);
            }
            int k;
label1:
            {
                if (!hasNextPageUrl)
                {
                    k = i;
                    if (nextPageUrl.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, nextPageUrl);
            }
label2:
            {
                if (!hasRelevance)
                {
                    i = k;
                    if (Double.doubleToLongBits(relevance) == Double.doubleToLongBits(0.0D))
                    {
                        break label2;
                    }
                }
                i = k + (CodedOutputByteBufferNano.computeTagSize(3) + 8);
            }
label3:
            {
                if (!hasEstimatedResults)
                {
                    k = i;
                    if (estimatedResults == 0L)
                    {
                        break label3;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt64Size(4, estimatedResults);
            }
            int i1;
label4:
            {
                if (!hasAnalyticsCookie)
                {
                    i1 = k;
                    if (analyticsCookie.equals(""))
                    {
                        break label4;
                    }
                }
                i1 = k + CodedOutputByteBufferNano.computeStringSize(5, analyticsCookie);
            }
label5:
            {
                if (!hasOrdered)
                {
                    i = i1;
                    if (!ordered)
                    {
                        break label5;
                    }
                }
                i = i1 + (CodedOutputByteBufferNano.computeTagSize(6) + 1);
            }
            i1 = i;
            if (containerView != null)
            {
                i1 = i;
                if (containerView.length > 0)
                {
                    int l = 0;
                    do
                    {
                        i1 = i;
                        if (l >= containerView.length)
                        {
                            break;
                        }
                        ContainerView containerview = containerView[l];
                        i1 = i;
                        if (containerview != null)
                        {
                            i1 = i + CodedOutputByteBufferNano.computeMessageSize(7, containerview);
                        }
                        l++;
                        i = i1;
                    } while (true);
                }
            }
            return i1;
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
                    browseUrl = codedinputbytebuffernano.readString();
                    hasBrowseUrl = true;
                    break;

                case 18: // '\022'
                    nextPageUrl = codedinputbytebuffernano.readString();
                    hasNextPageUrl = true;
                    break;

                case 25: // '\031'
                    relevance = Double.longBitsToDouble(codedinputbytebuffernano.readRawLittleEndian64());
                    hasRelevance = true;
                    break;

                case 32: // ' '
                    estimatedResults = codedinputbytebuffernano.readRawVarint64();
                    hasEstimatedResults = true;
                    break;

                case 42: // '*'
                    analyticsCookie = codedinputbytebuffernano.readString();
                    hasAnalyticsCookie = true;
                    break;

                case 48: // '0'
                    ordered = codedinputbytebuffernano.readBool();
                    hasOrdered = true;
                    break;

                case 58: // ':'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 58);
                    ContainerView acontainerview[];
                    int j;
                    if (containerView == null)
                    {
                        j = 0;
                    } else
                    {
                        j = containerView.length;
                    }
                    acontainerview = new ContainerView[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(containerView, 0, acontainerview, 0, j);
                        k = j;
                    }
                    for (; k < acontainerview.length - 1; k++)
                    {
                        acontainerview[k] = new ContainerView();
                        codedinputbytebuffernano.readMessage(acontainerview[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    acontainerview[k] = new ContainerView();
                    codedinputbytebuffernano.readMessage(acontainerview[k]);
                    containerView = acontainerview;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasBrowseUrl || !browseUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, browseUrl);
            }
            if (hasNextPageUrl || !nextPageUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, nextPageUrl);
            }
            if (hasRelevance || Double.doubleToLongBits(relevance) != Double.doubleToLongBits(0.0D))
            {
                codedoutputbytebuffernano.writeDouble(3, relevance);
            }
            if (hasEstimatedResults || estimatedResults != 0L)
            {
                codedoutputbytebuffernano.writeInt64(4, estimatedResults);
            }
            if (hasAnalyticsCookie || !analyticsCookie.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, analyticsCookie);
            }
            if (hasOrdered || ordered)
            {
                codedoutputbytebuffernano.writeBool(6, ordered);
            }
            if (containerView != null && containerView.length > 0)
            {
                for (int i = 0; i < containerView.length; i++)
                {
                    ContainerView containerview = containerView[i];
                    if (containerview != null)
                    {
                        codedoutputbytebuffernano.writeMessage(7, containerview);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ContainerMetadata()
        {
            browseUrl = "";
            hasBrowseUrl = false;
            nextPageUrl = "";
            hasNextPageUrl = false;
            relevance = 0.0D;
            hasRelevance = false;
            estimatedResults = 0L;
            hasEstimatedResults = false;
            analyticsCookie = "";
            hasAnalyticsCookie = false;
            ordered = false;
            hasOrdered = false;
            containerView = ContainerView.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class ContainerView extends MessageNano
    {

        private static volatile ContainerView _emptyArray[];
        public boolean hasListUrl;
        public boolean hasSelected;
        public boolean hasServerLogsCookie;
        public boolean hasTitle;
        public String listUrl;
        public boolean selected;
        public byte serverLogsCookie[];
        public String title;

        public static ContainerView[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new ContainerView[0];
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
                if (!hasSelected)
                {
                    i = j;
                    if (!selected)
                    {
                        break label0;
                    }
                }
                i = j + (CodedOutputByteBufferNano.computeTagSize(1) + 1);
            }
            int k;
label1:
            {
                if (!hasTitle)
                {
                    k = i;
                    if (title.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, title);
            }
label2:
            {
                if (!hasListUrl)
                {
                    i = k;
                    if (listUrl.equals(""))
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(3, listUrl);
            }
label3:
            {
                if (!hasServerLogsCookie)
                {
                    k = i;
                    if (Arrays.equals(serverLogsCookie, WireFormatNano.EMPTY_BYTES))
                    {
                        break label3;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeBytesSize(4, serverLogsCookie);
            }
            return k;
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
                    selected = codedinputbytebuffernano.readBool();
                    hasSelected = true;
                    break;

                case 18: // '\022'
                    title = codedinputbytebuffernano.readString();
                    hasTitle = true;
                    break;

                case 26: // '\032'
                    listUrl = codedinputbytebuffernano.readString();
                    hasListUrl = true;
                    break;

                case 34: // '"'
                    serverLogsCookie = codedinputbytebuffernano.readBytes();
                    hasServerLogsCookie = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasSelected || selected)
            {
                codedoutputbytebuffernano.writeBool(1, selected);
            }
            if (hasTitle || !title.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, title);
            }
            if (hasListUrl || !listUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, listUrl);
            }
            if (hasServerLogsCookie || !Arrays.equals(serverLogsCookie, WireFormatNano.EMPTY_BYTES))
            {
                codedoutputbytebuffernano.writeBytes(4, serverLogsCookie);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ContainerView()
        {
            selected = false;
            hasSelected = false;
            title = "";
            hasTitle = false;
            listUrl = "";
            hasListUrl = false;
            serverLogsCookie = WireFormatNano.EMPTY_BYTES;
            hasServerLogsCookie = false;
            cachedSize = -1;
        }
    }

}
