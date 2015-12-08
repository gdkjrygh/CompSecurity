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

public interface NanoWalletAnalytics
{
    public static final class AnalyticsInfo extends ExtendableMessageNano
    {

        public GoogleAnalyticsCustomDimension sessionScopedCustomDimension[];

        private AnalyticsInfo clear()
        {
            sessionScopedCustomDimension = GoogleAnalyticsCustomDimension.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private AnalyticsInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    GoogleAnalyticsCustomDimension agoogleanalyticscustomdimension[];
                    int j;
                    if (sessionScopedCustomDimension == null)
                    {
                        j = 0;
                    } else
                    {
                        j = sessionScopedCustomDimension.length;
                    }
                    agoogleanalyticscustomdimension = new GoogleAnalyticsCustomDimension[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(sessionScopedCustomDimension, 0, agoogleanalyticscustomdimension, 0, j);
                        k = j;
                    }
                    for (; k < agoogleanalyticscustomdimension.length - 1; k++)
                    {
                        agoogleanalyticscustomdimension[k] = new GoogleAnalyticsCustomDimension();
                        codedinputbytebuffernano.readMessage(agoogleanalyticscustomdimension[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    agoogleanalyticscustomdimension[k] = new GoogleAnalyticsCustomDimension();
                    codedinputbytebuffernano.readMessage(agoogleanalyticscustomdimension[k]);
                    sessionScopedCustomDimension = agoogleanalyticscustomdimension;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int k = i;
            if (sessionScopedCustomDimension != null)
            {
                k = i;
                if (sessionScopedCustomDimension.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= sessionScopedCustomDimension.length)
                        {
                            break;
                        }
                        GoogleAnalyticsCustomDimension googleanalyticscustomdimension = sessionScopedCustomDimension[j];
                        k = i;
                        if (googleanalyticscustomdimension != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(1, googleanalyticscustomdimension);
                        }
                        j++;
                        i = k;
                    } while (true);
                }
            }
            return k;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (sessionScopedCustomDimension != null && sessionScopedCustomDimension.length > 0)
            {
                for (int i = 0; i < sessionScopedCustomDimension.length; i++)
                {
                    GoogleAnalyticsCustomDimension googleanalyticscustomdimension = sessionScopedCustomDimension[i];
                    if (googleanalyticscustomdimension != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, googleanalyticscustomdimension);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AnalyticsInfo()
        {
            clear();
        }
    }

    public static final class GoogleAnalyticsCustomDimension extends ExtendableMessageNano
    {

        private static volatile GoogleAnalyticsCustomDimension _emptyArray[];
        public Integer id;
        public String value;

        private GoogleAnalyticsCustomDimension clear()
        {
            id = null;
            value = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static GoogleAnalyticsCustomDimension[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new GoogleAnalyticsCustomDimension[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private GoogleAnalyticsCustomDimension mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 8: // '\b'
                    id = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 18: // '\022'
                    value = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (id != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, id.intValue());
            }
            j = i;
            if (value != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, value);
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
            if (id != null)
            {
                codedoutputbytebuffernano.writeInt32(1, id.intValue());
            }
            if (value != null)
            {
                codedoutputbytebuffernano.writeString(2, value);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GoogleAnalyticsCustomDimension()
        {
            clear();
        }
    }

    public static final class GoogleAnalyticsEvent extends ExtendableMessageNano
    {

        public String action;
        public String category;
        public GoogleAnalyticsCustomDimension customDimensions[];
        public String label;
        public Integer value;

        private GoogleAnalyticsEvent clear()
        {
            category = null;
            action = null;
            label = null;
            value = null;
            customDimensions = GoogleAnalyticsCustomDimension.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GoogleAnalyticsEvent mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    category = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    action = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    label = codedinputbytebuffernano.readString();
                    break;

                case 32: // ' '
                    value = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 42: // '*'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                    GoogleAnalyticsCustomDimension agoogleanalyticscustomdimension[];
                    int j;
                    if (customDimensions == null)
                    {
                        j = 0;
                    } else
                    {
                        j = customDimensions.length;
                    }
                    agoogleanalyticscustomdimension = new GoogleAnalyticsCustomDimension[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(customDimensions, 0, agoogleanalyticscustomdimension, 0, j);
                        k = j;
                    }
                    for (; k < agoogleanalyticscustomdimension.length - 1; k++)
                    {
                        agoogleanalyticscustomdimension[k] = new GoogleAnalyticsCustomDimension();
                        codedinputbytebuffernano.readMessage(agoogleanalyticscustomdimension[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    agoogleanalyticscustomdimension[k] = new GoogleAnalyticsCustomDimension();
                    codedinputbytebuffernano.readMessage(agoogleanalyticscustomdimension[k]);
                    customDimensions = agoogleanalyticscustomdimension;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (category != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, category);
            }
            j = i;
            if (action != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, action);
            }
            int l = j;
            if (label != null)
            {
                l = j + CodedOutputByteBufferNano.computeStringSize(3, label);
            }
            i = l;
            if (value != null)
            {
                i = l + CodedOutputByteBufferNano.computeInt32Size(4, value.intValue());
            }
            l = i;
            if (customDimensions != null)
            {
                l = i;
                if (customDimensions.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= customDimensions.length)
                        {
                            break;
                        }
                        GoogleAnalyticsCustomDimension googleanalyticscustomdimension = customDimensions[k];
                        l = i;
                        if (googleanalyticscustomdimension != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(5, googleanalyticscustomdimension);
                        }
                        k++;
                        i = l;
                    } while (true);
                }
            }
            return l;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (category != null)
            {
                codedoutputbytebuffernano.writeString(1, category);
            }
            if (action != null)
            {
                codedoutputbytebuffernano.writeString(2, action);
            }
            if (label != null)
            {
                codedoutputbytebuffernano.writeString(3, label);
            }
            if (value != null)
            {
                codedoutputbytebuffernano.writeInt32(4, value.intValue());
            }
            if (customDimensions != null && customDimensions.length > 0)
            {
                for (int i = 0; i < customDimensions.length; i++)
                {
                    GoogleAnalyticsCustomDimension googleanalyticscustomdimension = customDimensions[i];
                    if (googleanalyticscustomdimension != null)
                    {
                        codedoutputbytebuffernano.writeMessage(5, googleanalyticscustomdimension);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GoogleAnalyticsEvent()
        {
            clear();
        }
    }

    public static final class GoogleAnalyticsScreen extends ExtendableMessageNano
    {

        public GoogleAnalyticsCustomDimension customDimensions[];
        public String name;

        private GoogleAnalyticsScreen clear()
        {
            name = null;
            customDimensions = GoogleAnalyticsCustomDimension.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GoogleAnalyticsScreen mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    name = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    GoogleAnalyticsCustomDimension agoogleanalyticscustomdimension[];
                    int j;
                    if (customDimensions == null)
                    {
                        j = 0;
                    } else
                    {
                        j = customDimensions.length;
                    }
                    agoogleanalyticscustomdimension = new GoogleAnalyticsCustomDimension[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(customDimensions, 0, agoogleanalyticscustomdimension, 0, j);
                        k = j;
                    }
                    for (; k < agoogleanalyticscustomdimension.length - 1; k++)
                    {
                        agoogleanalyticscustomdimension[k] = new GoogleAnalyticsCustomDimension();
                        codedinputbytebuffernano.readMessage(agoogleanalyticscustomdimension[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    agoogleanalyticscustomdimension[k] = new GoogleAnalyticsCustomDimension();
                    codedinputbytebuffernano.readMessage(agoogleanalyticscustomdimension[k]);
                    customDimensions = agoogleanalyticscustomdimension;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (name != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, name);
            }
            int l = i;
            if (customDimensions != null)
            {
                l = i;
                if (customDimensions.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= customDimensions.length)
                        {
                            break;
                        }
                        GoogleAnalyticsCustomDimension googleanalyticscustomdimension = customDimensions[k];
                        l = i;
                        if (googleanalyticscustomdimension != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(2, googleanalyticscustomdimension);
                        }
                        k++;
                        i = l;
                    } while (true);
                }
            }
            return l;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (name != null)
            {
                codedoutputbytebuffernano.writeString(1, name);
            }
            if (customDimensions != null && customDimensions.length > 0)
            {
                for (int i = 0; i < customDimensions.length; i++)
                {
                    GoogleAnalyticsCustomDimension googleanalyticscustomdimension = customDimensions[i];
                    if (googleanalyticscustomdimension != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, googleanalyticscustomdimension);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GoogleAnalyticsScreen()
        {
            clear();
        }
    }

}
