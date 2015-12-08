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

public interface NanoCompiledWobl
{
    public static final class ActionWidget extends ExtendableMessageNano
    {

        public Integer icon;
        public Float iconAlpha;
        public InlineTextContent inlineTextContent[];
        public TextBoxAttributes textBoxAttributes;
        public TextStyleAttributes textStyleAttributes;
        public WidgetAttributes widgetAttributes;

        private ActionWidget clear()
        {
            widgetAttributes = null;
            textBoxAttributes = null;
            textStyleAttributes = null;
            icon = null;
            iconAlpha = null;
            inlineTextContent = InlineTextContent.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ActionWidget mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L9:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 7: default 72
        //                       0: 81
        //                       10: 83
        //                       18: 112
        //                       26: 141
        //                       32: 170
        //                       45: 238
        //                       50: 252;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
            return this;
_L3:
            if (widgetAttributes == null)
            {
                widgetAttributes = new WidgetAttributes();
            }
            codedinputbytebuffernano.readMessage(widgetAttributes);
              goto _L9
_L4:
            if (textBoxAttributes == null)
            {
                textBoxAttributes = new TextBoxAttributes();
            }
            codedinputbytebuffernano.readMessage(textBoxAttributes);
              goto _L9
_L5:
            if (textStyleAttributes == null)
            {
                textStyleAttributes = new TextStyleAttributes();
            }
            codedinputbytebuffernano.readMessage(textStyleAttributes);
              goto _L9
_L6:
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
                icon = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            iconAlpha = Float.valueOf(codedinputbytebuffernano.readFloat());
            continue; /* Loop/switch isn't completed */
_L8:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 50);
            InlineTextContent ainlinetextcontent[];
            int k;
            if (inlineTextContent == null)
            {
                k = 0;
            } else
            {
                k = inlineTextContent.length;
            }
            ainlinetextcontent = new InlineTextContent[k + l];
            l = k;
            if (k != 0)
            {
                System.arraycopy(inlineTextContent, 0, ainlinetextcontent, 0, k);
                l = k;
            }
            for (; l < ainlinetextcontent.length - 1; l++)
            {
                ainlinetextcontent[l] = new InlineTextContent();
                codedinputbytebuffernano.readMessage(ainlinetextcontent[l]);
                codedinputbytebuffernano.readTag();
            }

            ainlinetextcontent[l] = new InlineTextContent();
            codedinputbytebuffernano.readMessage(ainlinetextcontent[l]);
            inlineTextContent = ainlinetextcontent;
            if (true) goto _L9; else goto _L10
_L10:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (widgetAttributes != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, widgetAttributes);
            }
            j = i;
            if (textBoxAttributes != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, textBoxAttributes);
            }
            i = j;
            if (textStyleAttributes != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, textStyleAttributes);
            }
            j = i;
            if (icon != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, icon.intValue());
            }
            i = j;
            if (iconAlpha != null)
            {
                i = j + CodedOutputByteBufferNano.computeFloatSize(5, iconAlpha.floatValue());
            }
            int l = i;
            if (inlineTextContent != null)
            {
                l = i;
                if (inlineTextContent.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= inlineTextContent.length)
                        {
                            break;
                        }
                        InlineTextContent inlinetextcontent = inlineTextContent[k];
                        l = i;
                        if (inlinetextcontent != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(6, inlinetextcontent);
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
            if (widgetAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(1, widgetAttributes);
            }
            if (textBoxAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(2, textBoxAttributes);
            }
            if (textStyleAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(3, textStyleAttributes);
            }
            if (icon != null)
            {
                codedoutputbytebuffernano.writeInt32(4, icon.intValue());
            }
            if (iconAlpha != null)
            {
                codedoutputbytebuffernano.writeFloat(5, iconAlpha.floatValue());
            }
            if (inlineTextContent != null && inlineTextContent.length > 0)
            {
                for (int i = 0; i < inlineTextContent.length; i++)
                {
                    InlineTextContent inlinetextcontent = inlineTextContent[i];
                    if (inlinetextcontent != null)
                    {
                        codedoutputbytebuffernano.writeMessage(6, inlinetextcontent);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ActionWidget()
        {
            clear();
        }
    }

    public static final class BarcodeWidget extends ExtendableMessageNano
    {

        public Float alpha;
        public String code;
        public String readableCode;
        public TextStyleAttributes textStyleAttributes;
        public Integer type;
        public WidgetAttributes widgetAttributes;

        private BarcodeWidget clear()
        {
            widgetAttributes = null;
            textStyleAttributes = null;
            type = null;
            code = null;
            readableCode = null;
            alpha = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private BarcodeWidget mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L9:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 7: default 72
        //                       0: 81
        //                       10: 83
        //                       18: 112
        //                       24: 141
        //                       34: 226
        //                       42: 237
        //                       53: 248;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
            return this;
_L3:
            if (widgetAttributes == null)
            {
                widgetAttributes = new WidgetAttributes();
            }
            codedinputbytebuffernano.readMessage(widgetAttributes);
              goto _L9
_L4:
            if (textStyleAttributes == null)
            {
                textStyleAttributes = new TextStyleAttributes();
            }
            codedinputbytebuffernano.readMessage(textStyleAttributes);
              goto _L9
_L5:
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
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
                type = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            code = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L7:
            readableCode = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L8:
            alpha = Float.valueOf(codedinputbytebuffernano.readFloat());
            if (true) goto _L9; else goto _L10
_L10:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (widgetAttributes != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, widgetAttributes);
            }
            j = i;
            if (textStyleAttributes != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, textStyleAttributes);
            }
            i = j;
            if (type != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, type.intValue());
            }
            j = i;
            if (code != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, code);
            }
            i = j;
            if (readableCode != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, readableCode);
            }
            j = i;
            if (alpha != null)
            {
                j = i + CodedOutputByteBufferNano.computeFloatSize(6, alpha.floatValue());
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
            if (widgetAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(1, widgetAttributes);
            }
            if (textStyleAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(2, textStyleAttributes);
            }
            if (type != null)
            {
                codedoutputbytebuffernano.writeInt32(3, type.intValue());
            }
            if (code != null)
            {
                codedoutputbytebuffernano.writeString(4, code);
            }
            if (readableCode != null)
            {
                codedoutputbytebuffernano.writeString(5, readableCode);
            }
            if (alpha != null)
            {
                codedoutputbytebuffernano.writeFloat(6, alpha.floatValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public BarcodeWidget()
        {
            clear();
        }
    }

    public static final class Color extends ExtendableMessageNano
    {

        public Integer blue;
        public Integer green;
        public Integer red;

        private Color clear()
        {
            red = null;
            green = null;
            blue = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Color mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    red = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 16: // '\020'
                    green = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 24: // '\030'
                    blue = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (red != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, red.intValue());
            }
            j = i;
            if (green != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, green.intValue());
            }
            i = j;
            if (blue != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, blue.intValue());
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
            if (red != null)
            {
                codedoutputbytebuffernano.writeInt32(1, red.intValue());
            }
            if (green != null)
            {
                codedoutputbytebuffernano.writeInt32(2, green.intValue());
            }
            if (blue != null)
            {
                codedoutputbytebuffernano.writeInt32(3, blue.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Color()
        {
            clear();
        }
    }

    public static final class ColumnLayoutAttributes extends ExtendableMessageNano
    {

        public Integer column;
        public Integer columnSpan;
        public Integer row;
        public Integer rowSpan;

        private ColumnLayoutAttributes clear()
        {
            column = null;
            row = null;
            columnSpan = null;
            rowSpan = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ColumnLayoutAttributes mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    column = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 16: // '\020'
                    row = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 24: // '\030'
                    columnSpan = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 32: // ' '
                    rowSpan = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (column != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, column.intValue());
            }
            j = i;
            if (row != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, row.intValue());
            }
            i = j;
            if (columnSpan != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, columnSpan.intValue());
            }
            j = i;
            if (rowSpan != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, rowSpan.intValue());
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
            if (column != null)
            {
                codedoutputbytebuffernano.writeInt32(1, column.intValue());
            }
            if (row != null)
            {
                codedoutputbytebuffernano.writeInt32(2, row.intValue());
            }
            if (columnSpan != null)
            {
                codedoutputbytebuffernano.writeInt32(3, columnSpan.intValue());
            }
            if (rowSpan != null)
            {
                codedoutputbytebuffernano.writeInt32(4, rowSpan.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ColumnLayoutAttributes()
        {
            clear();
        }
    }

    public static final class ColumnLayoutWidget extends ExtendableMessageNano
    {

        public Widget child[];
        public Length columnWidth[];
        public WidgetAttributes widgetAttributes;

        private ColumnLayoutWidget clear()
        {
            widgetAttributes = null;
            columnWidth = Length.emptyArray();
            child = Widget.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ColumnLayoutWidget mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (widgetAttributes == null)
                    {
                        widgetAttributes = new WidgetAttributes();
                    }
                    codedinputbytebuffernano.readMessage(widgetAttributes);
                    break;

                case 18: // '\022'
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    Length alength[];
                    int j;
                    if (columnWidth == null)
                    {
                        j = 0;
                    } else
                    {
                        j = columnWidth.length;
                    }
                    alength = new Length[j + l];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(columnWidth, 0, alength, 0, j);
                        l = j;
                    }
                    for (; l < alength.length - 1; l++)
                    {
                        alength[l] = new Length();
                        codedinputbytebuffernano.readMessage(alength[l]);
                        codedinputbytebuffernano.readTag();
                    }

                    alength[l] = new Length();
                    codedinputbytebuffernano.readMessage(alength[l]);
                    columnWidth = alength;
                    break;

                case 26: // '\032'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    Widget awidget[];
                    int k;
                    if (child == null)
                    {
                        k = 0;
                    } else
                    {
                        k = child.length;
                    }
                    awidget = new Widget[k + i1];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(child, 0, awidget, 0, k);
                        i1 = k;
                    }
                    for (; i1 < awidget.length - 1; i1++)
                    {
                        awidget[i1] = new Widget();
                        codedinputbytebuffernano.readMessage(awidget[i1]);
                        codedinputbytebuffernano.readTag();
                    }

                    awidget[i1] = new Widget();
                    codedinputbytebuffernano.readMessage(awidget[i1]);
                    child = awidget;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (widgetAttributes != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(1, widgetAttributes);
            }
            i = j;
            if (columnWidth != null)
            {
                i = j;
                if (columnWidth.length > 0)
                {
                    int l = 0;
                    do
                    {
                        i = j;
                        if (l >= columnWidth.length)
                        {
                            break;
                        }
                        Length length = columnWidth[l];
                        i = j;
                        if (length != null)
                        {
                            i = j + CodedOutputByteBufferNano.computeMessageSize(2, length);
                        }
                        l++;
                        j = i;
                    } while (true);
                }
            }
            int i1 = i;
            if (child != null)
            {
                i1 = i;
                if (child.length > 0)
                {
                    int k = 0;
                    do
                    {
                        i1 = i;
                        if (k >= child.length)
                        {
                            break;
                        }
                        Widget widget = child[k];
                        i1 = i;
                        if (widget != null)
                        {
                            i1 = i + CodedOutputByteBufferNano.computeMessageSize(3, widget);
                        }
                        k++;
                        i = i1;
                    } while (true);
                }
            }
            return i1;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (widgetAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(1, widgetAttributes);
            }
            if (columnWidth != null && columnWidth.length > 0)
            {
                for (int i = 0; i < columnWidth.length; i++)
                {
                    Length length = columnWidth[i];
                    if (length != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, length);
                    }
                }

            }
            if (child != null && child.length > 0)
            {
                for (int j = 0; j < child.length; j++)
                {
                    Widget widget = child[j];
                    if (widget != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, widget);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ColumnLayoutWidget()
        {
            clear();
        }
    }

    public static final class FieldWidget extends ExtendableMessageNano
    {

        public FieldChild name;
        public FieldChild value;
        public WidgetAttributes widgetAttributes;

        private FieldWidget clear()
        {
            widgetAttributes = null;
            name = null;
            value = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FieldWidget mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (widgetAttributes == null)
                    {
                        widgetAttributes = new WidgetAttributes();
                    }
                    codedinputbytebuffernano.readMessage(widgetAttributes);
                    break;

                case 18: // '\022'
                    if (name == null)
                    {
                        name = new FieldChild();
                    }
                    codedinputbytebuffernano.readMessage(name);
                    break;

                case 26: // '\032'
                    if (value == null)
                    {
                        value = new FieldChild();
                    }
                    codedinputbytebuffernano.readMessage(value);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (widgetAttributes != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, widgetAttributes);
            }
            j = i;
            if (name != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, name);
            }
            i = j;
            if (value != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, value);
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
            if (widgetAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(1, widgetAttributes);
            }
            if (name != null)
            {
                codedoutputbytebuffernano.writeMessage(2, name);
            }
            if (value != null)
            {
                codedoutputbytebuffernano.writeMessage(3, value);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FieldWidget()
        {
            clear();
        }
    }

    public static final class FieldWidget.FieldChild extends ExtendableMessageNano
    {

        public InlineTextContent inlineTextContent[];
        public TextBoxAttributes textBoxAttributes;
        public TextStyleAttributes textStyleAttributes;

        private FieldWidget.FieldChild clear()
        {
            textBoxAttributes = null;
            textStyleAttributes = null;
            inlineTextContent = InlineTextContent.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FieldWidget.FieldChild mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (textBoxAttributes == null)
                    {
                        textBoxAttributes = new TextBoxAttributes();
                    }
                    codedinputbytebuffernano.readMessage(textBoxAttributes);
                    break;

                case 18: // '\022'
                    if (textStyleAttributes == null)
                    {
                        textStyleAttributes = new TextStyleAttributes();
                    }
                    codedinputbytebuffernano.readMessage(textStyleAttributes);
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    InlineTextContent ainlinetextcontent[];
                    int j;
                    if (inlineTextContent == null)
                    {
                        j = 0;
                    } else
                    {
                        j = inlineTextContent.length;
                    }
                    ainlinetextcontent = new InlineTextContent[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(inlineTextContent, 0, ainlinetextcontent, 0, j);
                        k = j;
                    }
                    for (; k < ainlinetextcontent.length - 1; k++)
                    {
                        ainlinetextcontent[k] = new InlineTextContent();
                        codedinputbytebuffernano.readMessage(ainlinetextcontent[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    ainlinetextcontent[k] = new InlineTextContent();
                    codedinputbytebuffernano.readMessage(ainlinetextcontent[k]);
                    inlineTextContent = ainlinetextcontent;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (textBoxAttributes != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(1, textBoxAttributes);
            }
            i = j;
            if (textStyleAttributes != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, textStyleAttributes);
            }
            int l = i;
            if (inlineTextContent != null)
            {
                l = i;
                if (inlineTextContent.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= inlineTextContent.length)
                        {
                            break;
                        }
                        InlineTextContent inlinetextcontent = inlineTextContent[k];
                        l = i;
                        if (inlinetextcontent != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(3, inlinetextcontent);
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
            if (textBoxAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(1, textBoxAttributes);
            }
            if (textStyleAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(2, textStyleAttributes);
            }
            if (inlineTextContent != null && inlineTextContent.length > 0)
            {
                for (int i = 0; i < inlineTextContent.length; i++)
                {
                    InlineTextContent inlinetextcontent = inlineTextContent[i];
                    if (inlinetextcontent != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, inlinetextcontent);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FieldWidget.FieldChild()
        {
            clear();
        }
    }

    public static final class ImageWidget extends ExtendableMessageNano
    {

        public Float alpha;
        public String altText;
        public Double aspectRatio;
        public String sourceUrl;
        public WidgetAttributes widgetAttributes;

        private ImageWidget clear()
        {
            widgetAttributes = null;
            sourceUrl = null;
            aspectRatio = null;
            altText = null;
            alpha = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ImageWidget mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (widgetAttributes == null)
                    {
                        widgetAttributes = new WidgetAttributes();
                    }
                    codedinputbytebuffernano.readMessage(widgetAttributes);
                    break;

                case 18: // '\022'
                    sourceUrl = codedinputbytebuffernano.readString();
                    break;

                case 25: // '\031'
                    aspectRatio = Double.valueOf(codedinputbytebuffernano.readDouble());
                    break;

                case 34: // '"'
                    altText = codedinputbytebuffernano.readString();
                    break;

                case 45: // '-'
                    alpha = Float.valueOf(codedinputbytebuffernano.readFloat());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (widgetAttributes != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, widgetAttributes);
            }
            j = i;
            if (sourceUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, sourceUrl);
            }
            i = j;
            if (aspectRatio != null)
            {
                i = j + CodedOutputByteBufferNano.computeDoubleSize(3, aspectRatio.doubleValue());
            }
            j = i;
            if (altText != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, altText);
            }
            i = j;
            if (alpha != null)
            {
                i = j + CodedOutputByteBufferNano.computeFloatSize(5, alpha.floatValue());
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
            if (widgetAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(1, widgetAttributes);
            }
            if (sourceUrl != null)
            {
                codedoutputbytebuffernano.writeString(2, sourceUrl);
            }
            if (aspectRatio != null)
            {
                codedoutputbytebuffernano.writeDouble(3, aspectRatio.doubleValue());
            }
            if (altText != null)
            {
                codedoutputbytebuffernano.writeString(4, altText);
            }
            if (alpha != null)
            {
                codedoutputbytebuffernano.writeFloat(5, alpha.floatValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ImageWidget()
        {
            clear();
        }
    }

    public static final class InlineTextContent extends ExtendableMessageNano
    {

        private static volatile InlineTextContent _emptyArray[];
        public Date date;
        public Link link;
        public String text;

        private InlineTextContent clear()
        {
            text = null;
            link = null;
            date = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static InlineTextContent[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new InlineTextContent[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private InlineTextContent mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    text = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    if (link == null)
                    {
                        link = new Link();
                    }
                    codedinputbytebuffernano.readMessage(link);
                    break;

                case 26: // '\032'
                    if (date == null)
                    {
                        date = new Date();
                    }
                    codedinputbytebuffernano.readMessage(date);
                    break;
                }
            } while (true);
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
            if (link != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, link);
            }
            i = j;
            if (date != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, date);
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
            if (text != null)
            {
                codedoutputbytebuffernano.writeString(1, text);
            }
            if (link != null)
            {
                codedoutputbytebuffernano.writeMessage(2, link);
            }
            if (date != null)
            {
                codedoutputbytebuffernano.writeMessage(3, date);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public InlineTextContent()
        {
            clear();
        }
    }

    public static final class InlineTextContent.Date extends ExtendableMessageNano
    {

        public String absoluteTemplate;
        public Long millisSinceEpoch;
        public Integer style;
        public TextStyleAttributes textStyleAttributes;
        public String timeZone;

        private InlineTextContent.Date clear()
        {
            textStyleAttributes = null;
            millisSinceEpoch = null;
            style = null;
            absoluteTemplate = null;
            timeZone = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private InlineTextContent.Date mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 73
        //                       10: 75
        //                       16: 104
        //                       24: 118
        //                       34: 166
        //                       42: 177;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            if (textStyleAttributes == null)
            {
                textStyleAttributes = new TextStyleAttributes();
            }
            codedinputbytebuffernano.readMessage(textStyleAttributes);
              goto _L8
_L4:
            millisSinceEpoch = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L8
_L5:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                style = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            absoluteTemplate = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L7:
            timeZone = codedinputbytebuffernano.readString();
            if (true) goto _L8; else goto _L9
_L9:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (textStyleAttributes != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, textStyleAttributes);
            }
            j = i;
            if (millisSinceEpoch != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, millisSinceEpoch.longValue());
            }
            i = j;
            if (style != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, style.intValue());
            }
            j = i;
            if (absoluteTemplate != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, absoluteTemplate);
            }
            i = j;
            if (timeZone != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, timeZone);
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
            if (textStyleAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(1, textStyleAttributes);
            }
            if (millisSinceEpoch != null)
            {
                codedoutputbytebuffernano.writeInt64(2, millisSinceEpoch.longValue());
            }
            if (style != null)
            {
                codedoutputbytebuffernano.writeInt32(3, style.intValue());
            }
            if (absoluteTemplate != null)
            {
                codedoutputbytebuffernano.writeString(4, absoluteTemplate);
            }
            if (timeZone != null)
            {
                codedoutputbytebuffernano.writeString(5, timeZone);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public InlineTextContent.Date()
        {
            clear();
        }
    }

    public static final class InlineTextContent.Link extends ExtendableMessageNano
    {

        public TapUri tapUri[];
        public String text;
        public TextStyleAttributes textStyleAttributes;

        private InlineTextContent.Link clear()
        {
            textStyleAttributes = null;
            tapUri = TapUri.emptyArray();
            text = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private InlineTextContent.Link mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (textStyleAttributes == null)
                    {
                        textStyleAttributes = new TextStyleAttributes();
                    }
                    codedinputbytebuffernano.readMessage(textStyleAttributes);
                    break;

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    TapUri atapuri[];
                    int j;
                    if (tapUri == null)
                    {
                        j = 0;
                    } else
                    {
                        j = tapUri.length;
                    }
                    atapuri = new TapUri[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(tapUri, 0, atapuri, 0, j);
                        k = j;
                    }
                    for (; k < atapuri.length - 1; k++)
                    {
                        atapuri[k] = new TapUri();
                        codedinputbytebuffernano.readMessage(atapuri[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    atapuri[k] = new TapUri();
                    codedinputbytebuffernano.readMessage(atapuri[k]);
                    tapUri = atapuri;
                    break;

                case 26: // '\032'
                    text = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (textStyleAttributes != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, textStyleAttributes);
            }
            j = i;
            if (tapUri != null)
            {
                j = i;
                if (tapUri.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= tapUri.length)
                        {
                            break;
                        }
                        TapUri tapuri = tapUri[k];
                        j = i;
                        if (tapuri != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(2, tapuri);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (text != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, text);
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
            if (textStyleAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(1, textStyleAttributes);
            }
            if (tapUri != null && tapUri.length > 0)
            {
                for (int i = 0; i < tapUri.length; i++)
                {
                    TapUri tapuri = tapUri[i];
                    if (tapuri != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, tapuri);
                    }
                }

            }
            if (text != null)
            {
                codedoutputbytebuffernano.writeString(3, text);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public InlineTextContent.Link()
        {
            clear();
        }
    }

    public static final class Layout extends ExtendableMessageNano
    {

        public Widget widget;

        private Layout clear()
        {
            widget = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Layout mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (widget == null)
                    {
                        widget = new Widget();
                    }
                    codedinputbytebuffernano.readMessage(widget);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (widget != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, widget);
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
            if (widget != null)
            {
                codedoutputbytebuffernano.writeMessage(1, widget);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Layout()
        {
            clear();
        }
    }

    public static final class Layout.Widget extends ExtendableMessageNano
    {

        public ColumnLayoutWidget columnLayout;

        private Layout.Widget clear()
        {
            columnLayout = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Layout.Widget mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (columnLayout == null)
                    {
                        columnLayout = new ColumnLayoutWidget();
                    }
                    codedinputbytebuffernano.readMessage(columnLayout);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (columnLayout != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, columnLayout);
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
            if (columnLayout != null)
            {
                codedoutputbytebuffernano.writeMessage(1, columnLayout);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Layout.Widget()
        {
            clear();
        }
    }

    public static final class LayoutAttributes extends ExtendableMessageNano
    {

        public ColumnLayoutAttributes columnLayoutAttributes;

        private LayoutAttributes clear()
        {
            columnLayoutAttributes = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LayoutAttributes mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (columnLayoutAttributes == null)
                    {
                        columnLayoutAttributes = new ColumnLayoutAttributes();
                    }
                    codedinputbytebuffernano.readMessage(columnLayoutAttributes);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (columnLayoutAttributes != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, columnLayoutAttributes);
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
            if (columnLayoutAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(1, columnLayoutAttributes);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LayoutAttributes()
        {
            clear();
        }
    }

    public static final class Length extends ExtendableMessageNano
    {

        private static volatile Length _emptyArray[];
        public Float dps;
        public Float inches;
        public Float millimeters;
        public Float points;
        public Float sps;
        public Float weight;

        private Length clear()
        {
            weight = null;
            sps = null;
            dps = null;
            inches = null;
            points = null;
            millimeters = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static Length[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Length[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private Length mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 13: // '\r'
                    weight = Float.valueOf(codedinputbytebuffernano.readFloat());
                    break;

                case 21: // '\025'
                    sps = Float.valueOf(codedinputbytebuffernano.readFloat());
                    break;

                case 29: // '\035'
                    dps = Float.valueOf(codedinputbytebuffernano.readFloat());
                    break;

                case 37: // '%'
                    inches = Float.valueOf(codedinputbytebuffernano.readFloat());
                    break;

                case 45: // '-'
                    points = Float.valueOf(codedinputbytebuffernano.readFloat());
                    break;

                case 53: // '5'
                    millimeters = Float.valueOf(codedinputbytebuffernano.readFloat());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (weight != null)
            {
                i = j + CodedOutputByteBufferNano.computeFloatSize(1, weight.floatValue());
            }
            j = i;
            if (sps != null)
            {
                j = i + CodedOutputByteBufferNano.computeFloatSize(2, sps.floatValue());
            }
            i = j;
            if (dps != null)
            {
                i = j + CodedOutputByteBufferNano.computeFloatSize(3, dps.floatValue());
            }
            j = i;
            if (inches != null)
            {
                j = i + CodedOutputByteBufferNano.computeFloatSize(4, inches.floatValue());
            }
            i = j;
            if (points != null)
            {
                i = j + CodedOutputByteBufferNano.computeFloatSize(5, points.floatValue());
            }
            j = i;
            if (millimeters != null)
            {
                j = i + CodedOutputByteBufferNano.computeFloatSize(6, millimeters.floatValue());
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
            if (weight != null)
            {
                codedoutputbytebuffernano.writeFloat(1, weight.floatValue());
            }
            if (sps != null)
            {
                codedoutputbytebuffernano.writeFloat(2, sps.floatValue());
            }
            if (dps != null)
            {
                codedoutputbytebuffernano.writeFloat(3, dps.floatValue());
            }
            if (inches != null)
            {
                codedoutputbytebuffernano.writeFloat(4, inches.floatValue());
            }
            if (points != null)
            {
                codedoutputbytebuffernano.writeFloat(5, points.floatValue());
            }
            if (millimeters != null)
            {
                codedoutputbytebuffernano.writeFloat(6, millimeters.floatValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Length()
        {
            clear();
        }
    }

    public static final class LineWidget extends ExtendableMessageNano
    {

        public Color color;
        public Length length;
        public Integer orientation;
        public Length thickness;
        public WidgetAttributes widgetAttributes;

        private LineWidget clear()
        {
            widgetAttributes = null;
            orientation = null;
            length = null;
            thickness = null;
            color = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LineWidget mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 73
        //                       10: 75
        //                       16: 104
        //                       26: 146
        //                       34: 175
        //                       42: 204;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            if (widgetAttributes == null)
            {
                widgetAttributes = new WidgetAttributes();
            }
            codedinputbytebuffernano.readMessage(widgetAttributes);
              goto _L8
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
                orientation = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            if (length == null)
            {
                length = new Length();
            }
            codedinputbytebuffernano.readMessage(length);
            continue; /* Loop/switch isn't completed */
_L6:
            if (thickness == null)
            {
                thickness = new Length();
            }
            codedinputbytebuffernano.readMessage(thickness);
            continue; /* Loop/switch isn't completed */
_L7:
            if (color == null)
            {
                color = new Color();
            }
            codedinputbytebuffernano.readMessage(color);
            if (true) goto _L8; else goto _L9
_L9:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (widgetAttributes != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, widgetAttributes);
            }
            j = i;
            if (orientation != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, orientation.intValue());
            }
            i = j;
            if (length != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, length);
            }
            j = i;
            if (thickness != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, thickness);
            }
            i = j;
            if (color != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, color);
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
            if (widgetAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(1, widgetAttributes);
            }
            if (orientation != null)
            {
                codedoutputbytebuffernano.writeInt32(2, orientation.intValue());
            }
            if (length != null)
            {
                codedoutputbytebuffernano.writeMessage(3, length);
            }
            if (thickness != null)
            {
                codedoutputbytebuffernano.writeMessage(4, thickness);
            }
            if (color != null)
            {
                codedoutputbytebuffernano.writeMessage(5, color);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LineWidget()
        {
            clear();
        }
    }

    public static final class SpinnerWidget extends ExtendableMessageNano
    {

        public String altText;
        public WidgetAttributes widgetAttributes;

        private SpinnerWidget clear()
        {
            widgetAttributes = null;
            altText = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SpinnerWidget mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (widgetAttributes == null)
                    {
                        widgetAttributes = new WidgetAttributes();
                    }
                    codedinputbytebuffernano.readMessage(widgetAttributes);
                    break;

                case 18: // '\022'
                    altText = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (widgetAttributes != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, widgetAttributes);
            }
            j = i;
            if (altText != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, altText);
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
            if (widgetAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(1, widgetAttributes);
            }
            if (altText != null)
            {
                codedoutputbytebuffernano.writeString(2, altText);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SpinnerWidget()
        {
            clear();
        }
    }

    public static final class TapUri extends ExtendableMessageNano
    {

        private static volatile TapUri _emptyArray[];
        public String tapUri;

        private TapUri clear()
        {
            tapUri = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static TapUri[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new TapUri[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private TapUri mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    tapUri = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (tapUri != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, tapUri);
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
            if (tapUri != null)
            {
                codedoutputbytebuffernano.writeString(1, tapUri);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TapUri()
        {
            clear();
        }
    }

    public static final class TextBoxAttributes extends ExtendableMessageNano
    {

        public Length lineHeight;
        public Integer maxLines;
        public Integer numLines;
        public Integer overflow;

        private TextBoxAttributes clear()
        {
            lineHeight = null;
            overflow = null;
            maxLines = null;
            numLines = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private TextBoxAttributes mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 65
        //                       10: 67
        //                       16: 96
        //                       24: 138
        //                       32: 152;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
            return this;
_L3:
            if (lineHeight == null)
            {
                lineHeight = new Length();
            }
            codedinputbytebuffernano.readMessage(lineHeight);
              goto _L7
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
                overflow = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            maxLines = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L6:
            numLines = Integer.valueOf(codedinputbytebuffernano.readInt32());
            if (true) goto _L7; else goto _L8
_L8:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (lineHeight != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, lineHeight);
            }
            j = i;
            if (overflow != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, overflow.intValue());
            }
            i = j;
            if (maxLines != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, maxLines.intValue());
            }
            j = i;
            if (numLines != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, numLines.intValue());
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
            if (lineHeight != null)
            {
                codedoutputbytebuffernano.writeMessage(1, lineHeight);
            }
            if (overflow != null)
            {
                codedoutputbytebuffernano.writeInt32(2, overflow.intValue());
            }
            if (maxLines != null)
            {
                codedoutputbytebuffernano.writeInt32(3, maxLines.intValue());
            }
            if (numLines != null)
            {
                codedoutputbytebuffernano.writeInt32(4, numLines.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TextBoxAttributes()
        {
            clear();
        }
    }

    public static final class TextStyleAttributes extends ExtendableMessageNano
    {

        public Float fontAlpha;
        public Color fontColor;
        public Integer fontFamily;
        public Length fontSize;
        public Integer fontStyle;
        public Integer fontWeight;
        public int textDecoration[];
        public Integer textTransform;

        private TextStyleAttributes clear()
        {
            fontFamily = null;
            fontStyle = null;
            fontWeight = null;
            fontColor = null;
            fontSize = null;
            textTransform = null;
            textDecoration = WireFormatNano.EMPTY_INT_ARRAY;
            fontAlpha = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private TextStyleAttributes mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L12:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 10: default 100
        //                       0: 110
        //                       8: 112
        //                       16: 163
        //                       24: 207
        //                       34: 255
        //                       42: 284
        //                       48: 313
        //                       56: 367
        //                       58: 548
        //                       69: 746;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
_L2:
            return this;
_L3:
            i = codedinputbytebuffernano.readInt32();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                fontFamily = Integer.valueOf(i);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            i = codedinputbytebuffernano.readInt32();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
                fontStyle = Integer.valueOf(i);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            i = codedinputbytebuffernano.readInt32();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                fontWeight = Integer.valueOf(i);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            if (fontColor == null)
            {
                fontColor = new Color();
            }
            codedinputbytebuffernano.readMessage(fontColor);
            continue; /* Loop/switch isn't completed */
_L7:
            if (fontSize == null)
            {
                fontSize = new Length();
            }
            codedinputbytebuffernano.readMessage(fontSize);
            continue; /* Loop/switch isn't completed */
_L8:
            i = codedinputbytebuffernano.readInt32();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                textTransform = Integer.valueOf(i);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L9:
            int ai[];
            int j;
            int i1;
            i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 56);
            ai = new int[i1];
            j = 0;
            i = 0;
_L18:
            if (j >= i1) goto _L14; else goto _L13
_L13:
            int j1;
            if (j != 0)
            {
                codedinputbytebuffernano.readTag();
            }
            j1 = codedinputbytebuffernano.readInt32();
            j1;
            JVM INSTR tableswitch 0 1: default 432
        //                       0 441
        //                       1 441;
               goto _L15 _L16 _L16
_L15:
            j++;
            continue; /* Loop/switch isn't completed */
_L16:
            int k = i + 1;
            ai[i] = j1;
            i = k;
            if (true) goto _L15; else goto _L14
_L14:
            if (i != 0)
            {
                if (textDecoration == null)
                {
                    j = 0;
                } else
                {
                    j = textDecoration.length;
                }
                if (j == 0 && i == i1)
                {
                    textDecoration = ai;
                } else
                {
                    int ai1[] = new int[j + i];
                    if (j != 0)
                    {
                        System.arraycopy(textDecoration, 0, ai1, 0, j);
                    }
                    System.arraycopy(ai, 0, ai1, j, i);
                    textDecoration = ai1;
                }
            }
            continue; /* Loop/switch isn't completed */
            if (true) goto _L18; else goto _L17
_L17:
_L10:
            int l;
            l = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
            j = 0;
            i = codedinputbytebuffernano.getPosition();
_L24:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                switch (codedinputbytebuffernano.readInt32())
                {
                case 0: // '\0'
                case 1: // '\001'
                    j++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (j == 0) goto _L20; else goto _L19
_L19:
            codedinputbytebuffernano.rewindToPosition(i);
            if (textDecoration == null)
            {
                i = 0;
            } else
            {
                i = textDecoration.length;
            }
            ai = new int[i + j];
            j = i;
            if (i != 0)
            {
                System.arraycopy(textDecoration, 0, ai, 0, i);
                j = i;
            }
_L22:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                i = codedinputbytebuffernano.readInt32();
                switch (i)
                {
                case 0: // '\0'
                case 1: // '\001'
                    ai[j] = i;
                    j++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            textDecoration = ai;
_L20:
            codedinputbytebuffernano.popLimit(l);
            continue; /* Loop/switch isn't completed */
            if (true) goto _L22; else goto _L21
_L21:
            if (true) goto _L24; else goto _L23
_L23:
_L11:
            fontAlpha = Float.valueOf(codedinputbytebuffernano.readFloat());
            if (true) goto _L12; else goto _L25
_L25:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (fontFamily != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, fontFamily.intValue());
            }
            j = i;
            if (fontStyle != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, fontStyle.intValue());
            }
            i = j;
            if (fontWeight != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, fontWeight.intValue());
            }
            j = i;
            if (fontColor != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, fontColor);
            }
            int k = j;
            if (fontSize != null)
            {
                k = j + CodedOutputByteBufferNano.computeMessageSize(5, fontSize);
            }
            i = k;
            if (textTransform != null)
            {
                i = k + CodedOutputByteBufferNano.computeInt32Size(6, textTransform.intValue());
            }
            j = i;
            if (textDecoration != null)
            {
                j = i;
                if (textDecoration.length > 0)
                {
                    int l = 0;
                    for (j = 0; j < textDecoration.length; j++)
                    {
                        l += CodedOutputByteBufferNano.computeInt32SizeNoTag(textDecoration[j]);
                    }

                    j = i + l + textDecoration.length * 1;
                }
            }
            i = j;
            if (fontAlpha != null)
            {
                i = j + CodedOutputByteBufferNano.computeFloatSize(8, fontAlpha.floatValue());
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
            if (fontFamily != null)
            {
                codedoutputbytebuffernano.writeInt32(1, fontFamily.intValue());
            }
            if (fontStyle != null)
            {
                codedoutputbytebuffernano.writeInt32(2, fontStyle.intValue());
            }
            if (fontWeight != null)
            {
                codedoutputbytebuffernano.writeInt32(3, fontWeight.intValue());
            }
            if (fontColor != null)
            {
                codedoutputbytebuffernano.writeMessage(4, fontColor);
            }
            if (fontSize != null)
            {
                codedoutputbytebuffernano.writeMessage(5, fontSize);
            }
            if (textTransform != null)
            {
                codedoutputbytebuffernano.writeInt32(6, textTransform.intValue());
            }
            if (textDecoration != null && textDecoration.length > 0)
            {
                for (int i = 0; i < textDecoration.length; i++)
                {
                    codedoutputbytebuffernano.writeInt32(7, textDecoration[i]);
                }

            }
            if (fontAlpha != null)
            {
                codedoutputbytebuffernano.writeFloat(8, fontAlpha.floatValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TextStyleAttributes()
        {
            clear();
        }
    }

    public static final class TextWidget extends ExtendableMessageNano
    {

        public InlineTextContent inlineTextContent[];
        public TextBoxAttributes textBoxAttributes;
        public TextStyleAttributes textStyleAttributes;
        public WidgetAttributes widgetAttributes;

        private TextWidget clear()
        {
            widgetAttributes = null;
            textBoxAttributes = null;
            textStyleAttributes = null;
            inlineTextContent = InlineTextContent.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private TextWidget mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (widgetAttributes == null)
                    {
                        widgetAttributes = new WidgetAttributes();
                    }
                    codedinputbytebuffernano.readMessage(widgetAttributes);
                    break;

                case 18: // '\022'
                    if (textBoxAttributes == null)
                    {
                        textBoxAttributes = new TextBoxAttributes();
                    }
                    codedinputbytebuffernano.readMessage(textBoxAttributes);
                    break;

                case 26: // '\032'
                    if (textStyleAttributes == null)
                    {
                        textStyleAttributes = new TextStyleAttributes();
                    }
                    codedinputbytebuffernano.readMessage(textStyleAttributes);
                    break;

                case 34: // '"'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    InlineTextContent ainlinetextcontent[];
                    int j;
                    if (inlineTextContent == null)
                    {
                        j = 0;
                    } else
                    {
                        j = inlineTextContent.length;
                    }
                    ainlinetextcontent = new InlineTextContent[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(inlineTextContent, 0, ainlinetextcontent, 0, j);
                        k = j;
                    }
                    for (; k < ainlinetextcontent.length - 1; k++)
                    {
                        ainlinetextcontent[k] = new InlineTextContent();
                        codedinputbytebuffernano.readMessage(ainlinetextcontent[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    ainlinetextcontent[k] = new InlineTextContent();
                    codedinputbytebuffernano.readMessage(ainlinetextcontent[k]);
                    inlineTextContent = ainlinetextcontent;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (widgetAttributes != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, widgetAttributes);
            }
            j = i;
            if (textBoxAttributes != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, textBoxAttributes);
            }
            i = j;
            if (textStyleAttributes != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, textStyleAttributes);
            }
            int l = i;
            if (inlineTextContent != null)
            {
                l = i;
                if (inlineTextContent.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= inlineTextContent.length)
                        {
                            break;
                        }
                        InlineTextContent inlinetextcontent = inlineTextContent[k];
                        l = i;
                        if (inlinetextcontent != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(4, inlinetextcontent);
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
            if (widgetAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(1, widgetAttributes);
            }
            if (textBoxAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(2, textBoxAttributes);
            }
            if (textStyleAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(3, textStyleAttributes);
            }
            if (inlineTextContent != null && inlineTextContent.length > 0)
            {
                for (int i = 0; i < inlineTextContent.length; i++)
                {
                    InlineTextContent inlinetextcontent = inlineTextContent[i];
                    if (inlinetextcontent != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, inlinetextcontent);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TextWidget()
        {
            clear();
        }
    }

    public static final class Widget extends ExtendableMessageNano
    {

        private static volatile Widget _emptyArray[];
        public ActionWidget actionWidget;
        public BarcodeWidget barcodeWidget;
        public ColumnLayoutWidget columnLayoutWidget;
        public FieldWidget fieldWidget;
        public ImageWidget imageWidget;
        public LineWidget lineWidget;
        public SpinnerWidget spinnerWidget;
        public TextWidget textWidget;

        private Widget clear()
        {
            actionWidget = null;
            barcodeWidget = null;
            columnLayoutWidget = null;
            fieldWidget = null;
            imageWidget = null;
            lineWidget = null;
            textWidget = null;
            spinnerWidget = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static Widget[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Widget[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private Widget mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (actionWidget == null)
                    {
                        actionWidget = new ActionWidget();
                    }
                    codedinputbytebuffernano.readMessage(actionWidget);
                    break;

                case 18: // '\022'
                    if (barcodeWidget == null)
                    {
                        barcodeWidget = new BarcodeWidget();
                    }
                    codedinputbytebuffernano.readMessage(barcodeWidget);
                    break;

                case 26: // '\032'
                    if (columnLayoutWidget == null)
                    {
                        columnLayoutWidget = new ColumnLayoutWidget();
                    }
                    codedinputbytebuffernano.readMessage(columnLayoutWidget);
                    break;

                case 34: // '"'
                    if (fieldWidget == null)
                    {
                        fieldWidget = new FieldWidget();
                    }
                    codedinputbytebuffernano.readMessage(fieldWidget);
                    break;

                case 42: // '*'
                    if (imageWidget == null)
                    {
                        imageWidget = new ImageWidget();
                    }
                    codedinputbytebuffernano.readMessage(imageWidget);
                    break;

                case 50: // '2'
                    if (lineWidget == null)
                    {
                        lineWidget = new LineWidget();
                    }
                    codedinputbytebuffernano.readMessage(lineWidget);
                    break;

                case 58: // ':'
                    if (textWidget == null)
                    {
                        textWidget = new TextWidget();
                    }
                    codedinputbytebuffernano.readMessage(textWidget);
                    break;

                case 66: // 'B'
                    if (spinnerWidget == null)
                    {
                        spinnerWidget = new SpinnerWidget();
                    }
                    codedinputbytebuffernano.readMessage(spinnerWidget);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (actionWidget != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, actionWidget);
            }
            j = i;
            if (barcodeWidget != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, barcodeWidget);
            }
            i = j;
            if (columnLayoutWidget != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, columnLayoutWidget);
            }
            j = i;
            if (fieldWidget != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, fieldWidget);
            }
            i = j;
            if (imageWidget != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, imageWidget);
            }
            j = i;
            if (lineWidget != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, lineWidget);
            }
            i = j;
            if (textWidget != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, textWidget);
            }
            j = i;
            if (spinnerWidget != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(8, spinnerWidget);
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
            if (actionWidget != null)
            {
                codedoutputbytebuffernano.writeMessage(1, actionWidget);
            }
            if (barcodeWidget != null)
            {
                codedoutputbytebuffernano.writeMessage(2, barcodeWidget);
            }
            if (columnLayoutWidget != null)
            {
                codedoutputbytebuffernano.writeMessage(3, columnLayoutWidget);
            }
            if (fieldWidget != null)
            {
                codedoutputbytebuffernano.writeMessage(4, fieldWidget);
            }
            if (imageWidget != null)
            {
                codedoutputbytebuffernano.writeMessage(5, imageWidget);
            }
            if (lineWidget != null)
            {
                codedoutputbytebuffernano.writeMessage(6, lineWidget);
            }
            if (textWidget != null)
            {
                codedoutputbytebuffernano.writeMessage(7, textWidget);
            }
            if (spinnerWidget != null)
            {
                codedoutputbytebuffernano.writeMessage(8, spinnerWidget);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Widget()
        {
            clear();
        }
    }

    public static final class WidgetAttributes extends ExtendableMessageNano
    {

        public Color backgroundColor;
        public Integer horizontalAlign;
        public LayoutAttributes layoutAttributes;
        public Padding padding;
        public TapUri tapUri[];
        public Integer verticalAlign;
        public Float zDepthInDps;

        private WidgetAttributes clear()
        {
            backgroundColor = null;
            padding = null;
            horizontalAlign = null;
            verticalAlign = null;
            tapUri = TapUri.emptyArray();
            zDepthInDps = null;
            layoutAttributes = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private WidgetAttributes mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L10:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 8: default 80
        //                       0: 89
        //                       10: 91
        //                       18: 120
        //                       24: 149
        //                       32: 202
        //                       42: 250
        //                       53: 374
        //                       58: 388;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L10; else goto _L2
_L2:
            return this;
_L3:
            if (backgroundColor == null)
            {
                backgroundColor = new Color();
            }
            codedinputbytebuffernano.readMessage(backgroundColor);
              goto _L10
_L4:
            if (padding == null)
            {
                padding = new Padding();
            }
            codedinputbytebuffernano.readMessage(padding);
              goto _L10
_L5:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                horizontalAlign = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                verticalAlign = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
            TapUri atapuri[];
            int l;
            if (tapUri == null)
            {
                l = 0;
            } else
            {
                l = tapUri.length;
            }
            atapuri = new TapUri[l + i1];
            i1 = l;
            if (l != 0)
            {
                System.arraycopy(tapUri, 0, atapuri, 0, l);
                i1 = l;
            }
            for (; i1 < atapuri.length - 1; i1++)
            {
                atapuri[i1] = new TapUri();
                codedinputbytebuffernano.readMessage(atapuri[i1]);
                codedinputbytebuffernano.readTag();
            }

            atapuri[i1] = new TapUri();
            codedinputbytebuffernano.readMessage(atapuri[i1]);
            tapUri = atapuri;
            continue; /* Loop/switch isn't completed */
_L8:
            zDepthInDps = Float.valueOf(codedinputbytebuffernano.readFloat());
            continue; /* Loop/switch isn't completed */
_L9:
            if (layoutAttributes == null)
            {
                layoutAttributes = new LayoutAttributes();
            }
            codedinputbytebuffernano.readMessage(layoutAttributes);
            if (true) goto _L10; else goto _L11
_L11:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (backgroundColor != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, backgroundColor);
            }
            j = i;
            if (padding != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, padding);
            }
            int k = j;
            if (horizontalAlign != null)
            {
                k = j + CodedOutputByteBufferNano.computeInt32Size(3, horizontalAlign.intValue());
            }
            i = k;
            if (verticalAlign != null)
            {
                i = k + CodedOutputByteBufferNano.computeInt32Size(4, verticalAlign.intValue());
            }
            j = i;
            if (tapUri != null)
            {
                j = i;
                if (tapUri.length > 0)
                {
                    int l = 0;
                    do
                    {
                        j = i;
                        if (l >= tapUri.length)
                        {
                            break;
                        }
                        TapUri tapuri = tapUri[l];
                        j = i;
                        if (tapuri != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(5, tapuri);
                        }
                        l++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (zDepthInDps != null)
            {
                i = j + CodedOutputByteBufferNano.computeFloatSize(6, zDepthInDps.floatValue());
            }
            j = i;
            if (layoutAttributes != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(7, layoutAttributes);
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
            if (backgroundColor != null)
            {
                codedoutputbytebuffernano.writeMessage(1, backgroundColor);
            }
            if (padding != null)
            {
                codedoutputbytebuffernano.writeMessage(2, padding);
            }
            if (horizontalAlign != null)
            {
                codedoutputbytebuffernano.writeInt32(3, horizontalAlign.intValue());
            }
            if (verticalAlign != null)
            {
                codedoutputbytebuffernano.writeInt32(4, verticalAlign.intValue());
            }
            if (tapUri != null && tapUri.length > 0)
            {
                for (int i = 0; i < tapUri.length; i++)
                {
                    TapUri tapuri = tapUri[i];
                    if (tapuri != null)
                    {
                        codedoutputbytebuffernano.writeMessage(5, tapuri);
                    }
                }

            }
            if (zDepthInDps != null)
            {
                codedoutputbytebuffernano.writeFloat(6, zDepthInDps.floatValue());
            }
            if (layoutAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(7, layoutAttributes);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WidgetAttributes()
        {
            clear();
        }
    }

    public static final class WidgetAttributes.Padding extends ExtendableMessageNano
    {

        public Length bottom;
        public Length left;
        public Length right;
        public Length top;

        private WidgetAttributes.Padding clear()
        {
            top = null;
            right = null;
            bottom = null;
            left = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private WidgetAttributes.Padding mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (top == null)
                    {
                        top = new Length();
                    }
                    codedinputbytebuffernano.readMessage(top);
                    break;

                case 18: // '\022'
                    if (right == null)
                    {
                        right = new Length();
                    }
                    codedinputbytebuffernano.readMessage(right);
                    break;

                case 26: // '\032'
                    if (bottom == null)
                    {
                        bottom = new Length();
                    }
                    codedinputbytebuffernano.readMessage(bottom);
                    break;

                case 34: // '"'
                    if (left == null)
                    {
                        left = new Length();
                    }
                    codedinputbytebuffernano.readMessage(left);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (top != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, top);
            }
            j = i;
            if (right != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, right);
            }
            i = j;
            if (bottom != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, bottom);
            }
            j = i;
            if (left != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, left);
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
            if (top != null)
            {
                codedoutputbytebuffernano.writeMessage(1, top);
            }
            if (right != null)
            {
                codedoutputbytebuffernano.writeMessage(2, right);
            }
            if (bottom != null)
            {
                codedoutputbytebuffernano.writeMessage(3, bottom);
            }
            if (left != null)
            {
                codedoutputbytebuffernano.writeMessage(4, left);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WidgetAttributes.Padding()
        {
            clear();
        }
    }

}
