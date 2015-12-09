// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface NanoView
{
    public static final class BasicView extends ExtendableMessageNano
    {

        public NanoCommon.ActionRenderable actionRenderable[];
        public String listAmount;
        public Integer listAmountStyle;
        public String listImageUrl;
        public String listLabel;
        public Integer listStyle;
        public String listTitle;
        public Row row[];
        public com.google.checkout.customer.common.definitions.NanoDatetime.DateTime transactionTime;

        private BasicView clear()
        {
            listTitle = null;
            listLabel = null;
            transactionTime = null;
            listAmount = null;
            listImageUrl = null;
            listAmountStyle = null;
            row = Row.emptyArray();
            listStyle = null;
            actionRenderable = NanoCommon.ActionRenderable.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private BasicView mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L12:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 10: default 96
        //                       0: 105
        //                       10: 107
        //                       18: 118
        //                       26: 129
        //                       34: 158
        //                       42: 169
        //                       58: 293
        //                       64: 304
        //                       72: 346
        //                       82: 390;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
_L2:
            return this;
_L3:
            listTitle = codedinputbytebuffernano.readString();
              goto _L12
_L4:
            listLabel = codedinputbytebuffernano.readString();
              goto _L12
_L5:
            if (transactionTime == null)
            {
                transactionTime = new com.google.checkout.customer.common.definitions.NanoDatetime.DateTime();
            }
            codedinputbytebuffernano.readMessage(transactionTime);
              goto _L12
_L6:
            listAmount = codedinputbytebuffernano.readString();
              goto _L12
_L7:
            int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
            Row arow[];
            int j;
            if (row == null)
            {
                j = 0;
            } else
            {
                j = row.length;
            }
            arow = new Row[j + j1];
            j1 = j;
            if (j != 0)
            {
                System.arraycopy(row, 0, arow, 0, j);
                j1 = j;
            }
            for (; j1 < arow.length - 1; j1++)
            {
                arow[j1] = new Row();
                codedinputbytebuffernano.readMessage(arow[j1]);
                codedinputbytebuffernano.readTag();
            }

            arow[j1] = new Row();
            codedinputbytebuffernano.readMessage(arow[j1]);
            row = arow;
              goto _L12
_L8:
            listImageUrl = codedinputbytebuffernano.readString();
              goto _L12
_L9:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 1: // '\001'
            case 2: // '\002'
                listAmountStyle = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L10:
            int l = codedinputbytebuffernano.readInt32();
            switch (l)
            {
            case 0: // '\0'
            case 1: // '\001'
                listStyle = Integer.valueOf(l);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L11:
            int k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 82);
            NanoCommon.ActionRenderable aactionrenderable[];
            int i1;
            if (actionRenderable == null)
            {
                i1 = 0;
            } else
            {
                i1 = actionRenderable.length;
            }
            aactionrenderable = new NanoCommon.ActionRenderable[i1 + k1];
            k1 = i1;
            if (i1 != 0)
            {
                System.arraycopy(actionRenderable, 0, aactionrenderable, 0, i1);
                k1 = i1;
            }
            for (; k1 < aactionrenderable.length - 1; k1++)
            {
                aactionrenderable[k1] = new NanoCommon.ActionRenderable();
                codedinputbytebuffernano.readMessage(aactionrenderable[k1]);
                codedinputbytebuffernano.readTag();
            }

            aactionrenderable[k1] = new NanoCommon.ActionRenderable();
            codedinputbytebuffernano.readMessage(aactionrenderable[k1]);
            actionRenderable = aactionrenderable;
            if (true) goto _L12; else goto _L13
_L13:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (listTitle != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, listTitle);
            }
            j = i;
            if (listLabel != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, listLabel);
            }
            int l = j;
            if (transactionTime != null)
            {
                l = j + CodedOutputByteBufferNano.computeMessageSize(3, transactionTime);
            }
            i = l;
            if (listAmount != null)
            {
                i = l + CodedOutputByteBufferNano.computeStringSize(4, listAmount);
            }
            j = i;
            if (row != null)
            {
                j = i;
                if (row.length > 0)
                {
                    l = 0;
                    do
                    {
                        j = i;
                        if (l >= row.length)
                        {
                            break;
                        }
                        Row row1 = row[l];
                        j = i;
                        if (row1 != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(5, row1);
                        }
                        l++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (listImageUrl != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(7, listImageUrl);
            }
            j = i;
            if (listAmountStyle != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(8, listAmountStyle.intValue());
            }
            i = j;
            if (listStyle != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(9, listStyle.intValue());
            }
            l = i;
            if (actionRenderable != null)
            {
                l = i;
                if (actionRenderable.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= actionRenderable.length)
                        {
                            break;
                        }
                        NanoCommon.ActionRenderable actionrenderable = actionRenderable[k];
                        l = i;
                        if (actionrenderable != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(10, actionrenderable);
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
            if (listTitle != null)
            {
                codedoutputbytebuffernano.writeString(1, listTitle);
            }
            if (listLabel != null)
            {
                codedoutputbytebuffernano.writeString(2, listLabel);
            }
            if (transactionTime != null)
            {
                codedoutputbytebuffernano.writeMessage(3, transactionTime);
            }
            if (listAmount != null)
            {
                codedoutputbytebuffernano.writeString(4, listAmount);
            }
            if (row != null && row.length > 0)
            {
                for (int i = 0; i < row.length; i++)
                {
                    Row row1 = row[i];
                    if (row1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(5, row1);
                    }
                }

            }
            if (listImageUrl != null)
            {
                codedoutputbytebuffernano.writeString(7, listImageUrl);
            }
            if (listAmountStyle != null)
            {
                codedoutputbytebuffernano.writeInt32(8, listAmountStyle.intValue());
            }
            if (listStyle != null)
            {
                codedoutputbytebuffernano.writeInt32(9, listStyle.intValue());
            }
            if (actionRenderable != null && actionRenderable.length > 0)
            {
                for (int j = 0; j < actionRenderable.length; j++)
                {
                    NanoCommon.ActionRenderable actionrenderable = actionRenderable[j];
                    if (actionrenderable != null)
                    {
                        codedoutputbytebuffernano.writeMessage(10, actionrenderable);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public BasicView()
        {
            clear();
        }
    }

    public static final class DateTime extends ExtendableMessageNano
    {

        public Long millisSinceEpoch;
        public Integer renderType;

        private DateTime clear()
        {
            millisSinceEpoch = null;
            renderType = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DateTime mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       8: 51
        //                       16: 65;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            millisSinceEpoch = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L5
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
                renderType = Integer.valueOf(j);
                break;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (millisSinceEpoch != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, millisSinceEpoch.longValue());
            }
            j = i;
            if (renderType != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, renderType.intValue());
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
            if (millisSinceEpoch != null)
            {
                codedoutputbytebuffernano.writeInt64(1, millisSinceEpoch.longValue());
            }
            if (renderType != null)
            {
                codedoutputbytebuffernano.writeInt32(2, renderType.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DateTime()
        {
            clear();
        }
    }

    public static final class Renderable extends ExtendableMessageNano
    {

        public String altImageText;
        public DateTime dateTime;
        public String imageUrl;
        public String linkUrl;
        public Integer style;
        public String text;

        private Renderable clear()
        {
            text = null;
            imageUrl = null;
            dateTime = null;
            linkUrl = null;
            style = null;
            altImageText = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Renderable mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L9:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 7: default 72
        //                       0: 81
        //                       10: 83
        //                       18: 94
        //                       26: 105
        //                       34: 134
        //                       40: 145
        //                       50: 190;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
            return this;
_L3:
            text = codedinputbytebuffernano.readString();
              goto _L9
_L4:
            imageUrl = codedinputbytebuffernano.readString();
              goto _L9
_L5:
            if (dateTime == null)
            {
                dateTime = new DateTime();
            }
            codedinputbytebuffernano.readMessage(dateTime);
              goto _L9
_L6:
            linkUrl = codedinputbytebuffernano.readString();
              goto _L9
_L7:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                style = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L8:
            altImageText = codedinputbytebuffernano.readString();
            if (true) goto _L9; else goto _L10
_L10:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (text != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, text);
            }
            j = i;
            if (imageUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, imageUrl);
            }
            i = j;
            if (dateTime != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, dateTime);
            }
            j = i;
            if (linkUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, linkUrl);
            }
            i = j;
            if (style != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(5, style.intValue());
            }
            j = i;
            if (altImageText != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, altImageText);
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
            if (text != null)
            {
                codedoutputbytebuffernano.writeString(1, text);
            }
            if (imageUrl != null)
            {
                codedoutputbytebuffernano.writeString(2, imageUrl);
            }
            if (dateTime != null)
            {
                codedoutputbytebuffernano.writeMessage(3, dateTime);
            }
            if (linkUrl != null)
            {
                codedoutputbytebuffernano.writeString(4, linkUrl);
            }
            if (style != null)
            {
                codedoutputbytebuffernano.writeInt32(5, style.intValue());
            }
            if (altImageText != null)
            {
                codedoutputbytebuffernano.writeString(6, altImageText);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Renderable()
        {
            clear();
        }
    }

    public static final class Row extends ExtendableMessageNano
    {

        private static volatile Row _emptyArray[];
        public Renderable content;
        public String footer;
        public String footerLinkUrl;
        public String header;
        public String headerLinkUrl;
        public Renderable rightContent;
        public Integer rule;
        public String tag[];

        private Row clear()
        {
            header = null;
            content = null;
            rightContent = null;
            footer = null;
            rule = null;
            tag = WireFormatNano.EMPTY_STRING_ARRAY;
            headerLinkUrl = null;
            footerLinkUrl = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static Row[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Row[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private Row mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L11:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 9: default 88
        //                       0: 97
        //                       10: 99
        //                       18: 110
        //                       26: 139
        //                       34: 168
        //                       40: 179
        //                       50: 226
        //                       58: 328
        //                       66: 339;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L11; else goto _L2
_L2:
            return this;
_L3:
            header = codedinputbytebuffernano.readString();
              goto _L11
_L4:
            if (content == null)
            {
                content = new Renderable();
            }
            codedinputbytebuffernano.readMessage(content);
              goto _L11
_L5:
            if (rightContent == null)
            {
                rightContent = new Renderable();
            }
            codedinputbytebuffernano.readMessage(rightContent);
              goto _L11
_L6:
            footer = codedinputbytebuffernano.readString();
              goto _L11
_L7:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                rule = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L8:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 50);
            String as[];
            int k;
            if (tag == null)
            {
                k = 0;
            } else
            {
                k = tag.length;
            }
            as = new String[k + l];
            l = k;
            if (k != 0)
            {
                System.arraycopy(tag, 0, as, 0, k);
                l = k;
            }
            for (; l < as.length - 1; l++)
            {
                as[l] = codedinputbytebuffernano.readString();
                codedinputbytebuffernano.readTag();
            }

            as[l] = codedinputbytebuffernano.readString();
            tag = as;
            continue; /* Loop/switch isn't completed */
_L9:
            headerLinkUrl = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L10:
            footerLinkUrl = codedinputbytebuffernano.readString();
            if (true) goto _L11; else goto _L12
_L12:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (header != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, header);
            }
            j = i;
            if (content != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, content);
            }
            i = j;
            if (rightContent != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, rightContent);
            }
            j = i;
            if (footer != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, footer);
            }
            i = j;
            if (rule != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(5, rule.intValue());
            }
            j = i;
            if (tag != null)
            {
                j = i;
                if (tag.length > 0)
                {
                    int i1 = 0;
                    int k = 0;
                    for (j = 0; j < tag.length;)
                    {
                        String s = tag[j];
                        int j1 = i1;
                        int l = k;
                        if (s != null)
                        {
                            j1 = i1 + 1;
                            l = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        j++;
                        i1 = j1;
                        k = l;
                    }

                    j = i + k + i1 * 1;
                }
            }
            i = j;
            if (headerLinkUrl != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(7, headerLinkUrl);
            }
            j = i;
            if (footerLinkUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(8, footerLinkUrl);
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
            if (header != null)
            {
                codedoutputbytebuffernano.writeString(1, header);
            }
            if (content != null)
            {
                codedoutputbytebuffernano.writeMessage(2, content);
            }
            if (rightContent != null)
            {
                codedoutputbytebuffernano.writeMessage(3, rightContent);
            }
            if (footer != null)
            {
                codedoutputbytebuffernano.writeString(4, footer);
            }
            if (rule != null)
            {
                codedoutputbytebuffernano.writeInt32(5, rule.intValue());
            }
            if (tag != null && tag.length > 0)
            {
                for (int i = 0; i < tag.length; i++)
                {
                    String s = tag[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(6, s);
                    }
                }

            }
            if (headerLinkUrl != null)
            {
                codedoutputbytebuffernano.writeString(7, headerLinkUrl);
            }
            if (footerLinkUrl != null)
            {
                codedoutputbytebuffernano.writeString(8, footerLinkUrl);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Row()
        {
            clear();
        }
    }

}
