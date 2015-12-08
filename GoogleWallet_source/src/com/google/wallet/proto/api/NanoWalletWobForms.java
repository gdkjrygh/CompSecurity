// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface NanoWalletWobForms
{
    public static final class InputForm extends ExtendableMessageNano
    {

        public Message introMessage;
        public LinkPrompt linkPrompts[];
        public NanoUserAddedImages.UserAddedImagePrefill userAddedImagePrefill[];

        private InputForm clear()
        {
            introMessage = null;
            linkPrompts = LinkPrompt.emptyArray();
            userAddedImagePrefill = NanoUserAddedImages.UserAddedImagePrefill.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private InputForm mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (introMessage == null)
                    {
                        introMessage = new Message();
                    }
                    codedinputbytebuffernano.readMessage(introMessage);
                    break;

                case 18: // '\022'
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    LinkPrompt alinkprompt[];
                    int j;
                    if (linkPrompts == null)
                    {
                        j = 0;
                    } else
                    {
                        j = linkPrompts.length;
                    }
                    alinkprompt = new LinkPrompt[j + l];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(linkPrompts, 0, alinkprompt, 0, j);
                        l = j;
                    }
                    for (; l < alinkprompt.length - 1; l++)
                    {
                        alinkprompt[l] = new LinkPrompt();
                        codedinputbytebuffernano.readMessage(alinkprompt[l]);
                        codedinputbytebuffernano.readTag();
                    }

                    alinkprompt[l] = new LinkPrompt();
                    codedinputbytebuffernano.readMessage(alinkprompt[l]);
                    linkPrompts = alinkprompt;
                    break;

                case 26: // '\032'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    NanoUserAddedImages.UserAddedImagePrefill auseraddedimageprefill[];
                    int k;
                    if (userAddedImagePrefill == null)
                    {
                        k = 0;
                    } else
                    {
                        k = userAddedImagePrefill.length;
                    }
                    auseraddedimageprefill = new NanoUserAddedImages.UserAddedImagePrefill[k + i1];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(userAddedImagePrefill, 0, auseraddedimageprefill, 0, k);
                        i1 = k;
                    }
                    for (; i1 < auseraddedimageprefill.length - 1; i1++)
                    {
                        auseraddedimageprefill[i1] = new NanoUserAddedImages.UserAddedImagePrefill();
                        codedinputbytebuffernano.readMessage(auseraddedimageprefill[i1]);
                        codedinputbytebuffernano.readTag();
                    }

                    auseraddedimageprefill[i1] = new NanoUserAddedImages.UserAddedImagePrefill();
                    codedinputbytebuffernano.readMessage(auseraddedimageprefill[i1]);
                    userAddedImagePrefill = auseraddedimageprefill;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (introMessage != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(1, introMessage);
            }
            i = j;
            if (linkPrompts != null)
            {
                i = j;
                if (linkPrompts.length > 0)
                {
                    int l = 0;
                    do
                    {
                        i = j;
                        if (l >= linkPrompts.length)
                        {
                            break;
                        }
                        LinkPrompt linkprompt = linkPrompts[l];
                        i = j;
                        if (linkprompt != null)
                        {
                            i = j + CodedOutputByteBufferNano.computeMessageSize(2, linkprompt);
                        }
                        l++;
                        j = i;
                    } while (true);
                }
            }
            int i1 = i;
            if (userAddedImagePrefill != null)
            {
                i1 = i;
                if (userAddedImagePrefill.length > 0)
                {
                    int k = 0;
                    do
                    {
                        i1 = i;
                        if (k >= userAddedImagePrefill.length)
                        {
                            break;
                        }
                        NanoUserAddedImages.UserAddedImagePrefill useraddedimageprefill = userAddedImagePrefill[k];
                        i1 = i;
                        if (useraddedimageprefill != null)
                        {
                            i1 = i + CodedOutputByteBufferNano.computeMessageSize(3, useraddedimageprefill);
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
            if (introMessage != null)
            {
                codedoutputbytebuffernano.writeMessage(1, introMessage);
            }
            if (linkPrompts != null && linkPrompts.length > 0)
            {
                for (int i = 0; i < linkPrompts.length; i++)
                {
                    LinkPrompt linkprompt = linkPrompts[i];
                    if (linkprompt != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, linkprompt);
                    }
                }

            }
            if (userAddedImagePrefill != null && userAddedImagePrefill.length > 0)
            {
                for (int j = 0; j < userAddedImagePrefill.length; j++)
                {
                    NanoUserAddedImages.UserAddedImagePrefill useraddedimageprefill = userAddedImagePrefill[j];
                    if (useraddedimageprefill != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, useraddedimageprefill);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public InputForm()
        {
            clear();
        }
    }

    public static final class InputFormSubmission extends ExtendableMessageNano
    {

        public LinkValue linkValues[];
        public NanoUserAddedImages.UserAddedImage userAddedImage[];

        private InputFormSubmission clear()
        {
            linkValues = LinkValue.emptyArray();
            userAddedImage = NanoUserAddedImages.UserAddedImage.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private InputFormSubmission mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                    LinkValue alinkvalue[];
                    int j;
                    if (linkValues == null)
                    {
                        j = 0;
                    } else
                    {
                        j = linkValues.length;
                    }
                    alinkvalue = new LinkValue[j + l];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(linkValues, 0, alinkvalue, 0, j);
                        l = j;
                    }
                    for (; l < alinkvalue.length - 1; l++)
                    {
                        alinkvalue[l] = new LinkValue();
                        codedinputbytebuffernano.readMessage(alinkvalue[l]);
                        codedinputbytebuffernano.readTag();
                    }

                    alinkvalue[l] = new LinkValue();
                    codedinputbytebuffernano.readMessage(alinkvalue[l]);
                    linkValues = alinkvalue;
                    break;

                case 18: // '\022'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    NanoUserAddedImages.UserAddedImage auseraddedimage[];
                    int k;
                    if (userAddedImage == null)
                    {
                        k = 0;
                    } else
                    {
                        k = userAddedImage.length;
                    }
                    auseraddedimage = new NanoUserAddedImages.UserAddedImage[k + i1];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(userAddedImage, 0, auseraddedimage, 0, k);
                        i1 = k;
                    }
                    for (; i1 < auseraddedimage.length - 1; i1++)
                    {
                        auseraddedimage[i1] = new NanoUserAddedImages.UserAddedImage();
                        codedinputbytebuffernano.readMessage(auseraddedimage[i1]);
                        codedinputbytebuffernano.readTag();
                    }

                    auseraddedimage[i1] = new NanoUserAddedImages.UserAddedImage();
                    codedinputbytebuffernano.readMessage(auseraddedimage[i1]);
                    userAddedImage = auseraddedimage;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (linkValues != null)
            {
                i = j;
                if (linkValues.length > 0)
                {
                    int l = 0;
                    do
                    {
                        i = j;
                        if (l >= linkValues.length)
                        {
                            break;
                        }
                        LinkValue linkvalue = linkValues[l];
                        i = j;
                        if (linkvalue != null)
                        {
                            i = j + CodedOutputByteBufferNano.computeMessageSize(1, linkvalue);
                        }
                        l++;
                        j = i;
                    } while (true);
                }
            }
            int i1 = i;
            if (userAddedImage != null)
            {
                i1 = i;
                if (userAddedImage.length > 0)
                {
                    int k = 0;
                    do
                    {
                        i1 = i;
                        if (k >= userAddedImage.length)
                        {
                            break;
                        }
                        NanoUserAddedImages.UserAddedImage useraddedimage = userAddedImage[k];
                        i1 = i;
                        if (useraddedimage != null)
                        {
                            i1 = i + CodedOutputByteBufferNano.computeMessageSize(2, useraddedimage);
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
            if (linkValues != null && linkValues.length > 0)
            {
                for (int i = 0; i < linkValues.length; i++)
                {
                    LinkValue linkvalue = linkValues[i];
                    if (linkvalue != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, linkvalue);
                    }
                }

            }
            if (userAddedImage != null && userAddedImage.length > 0)
            {
                for (int j = 0; j < userAddedImage.length; j++)
                {
                    NanoUserAddedImages.UserAddedImage useraddedimage = userAddedImage[j];
                    if (useraddedimage != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, useraddedimage);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public InputFormSubmission()
        {
            clear();
        }
    }

    public static final class LinkPrompt extends ExtendableMessageNano
    {

        private static volatile LinkPrompt _emptyArray[];
        public Integer fieldType;
        public Boolean isRequired;
        public String label;
        public Boolean modifiableByUser;
        public com.google.wallet.proto.NanoWalletEntities.Barcode prefilledBarcode;
        public com.google.wallet.proto.NanoWalletEntities.DisplayableMoney prefilledMoney;
        public Integer prefilledProgramIcon;
        public String prefilledValue;
        public Integer promptId;

        private LinkPrompt clear()
        {
            promptId = null;
            fieldType = null;
            label = null;
            prefilledValue = null;
            prefilledMoney = null;
            prefilledProgramIcon = null;
            prefilledBarcode = null;
            modifiableByUser = null;
            isRequired = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static LinkPrompt[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new LinkPrompt[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private LinkPrompt mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L12:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 10: default 96
        //                       0: 105
        //                       8: 107
        //                       16: 121
        //                       26: 178
        //                       34: 189
        //                       42: 200
        //                       48: 229
        //                       56: 243
        //                       64: 257
        //                       74: 338;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
_L2:
            return this;
_L3:
            promptId = Integer.valueOf(codedinputbytebuffernano.readInt32());
              goto _L12
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 6: // '\006'
                fieldType = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            label = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L6:
            prefilledValue = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L7:
            if (prefilledMoney == null)
            {
                prefilledMoney = new com.google.wallet.proto.NanoWalletEntities.DisplayableMoney();
            }
            codedinputbytebuffernano.readMessage(prefilledMoney);
            continue; /* Loop/switch isn't completed */
_L8:
            modifiableByUser = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L9:
            isRequired = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L10:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 1: // '\001'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
                prefilledProgramIcon = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L11:
            if (prefilledBarcode == null)
            {
                prefilledBarcode = new com.google.wallet.proto.NanoWalletEntities.Barcode();
            }
            codedinputbytebuffernano.readMessage(prefilledBarcode);
            if (true) goto _L12; else goto _L13
_L13:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (promptId != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, promptId.intValue());
            }
            j = i;
            if (fieldType != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, fieldType.intValue());
            }
            i = j;
            if (label != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, label);
            }
            j = i;
            if (prefilledValue != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, prefilledValue);
            }
            i = j;
            if (prefilledMoney != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, prefilledMoney);
            }
            j = i;
            if (modifiableByUser != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(6, modifiableByUser.booleanValue());
            }
            i = j;
            if (isRequired != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(7, isRequired.booleanValue());
            }
            j = i;
            if (prefilledProgramIcon != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(8, prefilledProgramIcon.intValue());
            }
            i = j;
            if (prefilledBarcode != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(9, prefilledBarcode);
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
            if (promptId != null)
            {
                codedoutputbytebuffernano.writeInt32(1, promptId.intValue());
            }
            if (fieldType != null)
            {
                codedoutputbytebuffernano.writeInt32(2, fieldType.intValue());
            }
            if (label != null)
            {
                codedoutputbytebuffernano.writeString(3, label);
            }
            if (prefilledValue != null)
            {
                codedoutputbytebuffernano.writeString(4, prefilledValue);
            }
            if (prefilledMoney != null)
            {
                codedoutputbytebuffernano.writeMessage(5, prefilledMoney);
            }
            if (modifiableByUser != null)
            {
                codedoutputbytebuffernano.writeBool(6, modifiableByUser.booleanValue());
            }
            if (isRequired != null)
            {
                codedoutputbytebuffernano.writeBool(7, isRequired.booleanValue());
            }
            if (prefilledProgramIcon != null)
            {
                codedoutputbytebuffernano.writeInt32(8, prefilledProgramIcon.intValue());
            }
            if (prefilledBarcode != null)
            {
                codedoutputbytebuffernano.writeMessage(9, prefilledBarcode);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LinkPrompt()
        {
            clear();
        }
    }

    public static final class LinkValue extends ExtendableMessageNano
    {

        private static volatile LinkValue _emptyArray[];
        public com.google.wallet.proto.NanoWalletEntities.Barcode barcode;
        public Boolean delete;
        public com.google.wallet.proto.NanoWalletEntities.MoneyProto moneyValue;
        public Integer programIcon;
        public Integer promptId;
        public String textValue;

        private LinkValue clear()
        {
            promptId = null;
            textValue = null;
            moneyValue = null;
            programIcon = null;
            barcode = null;
            delete = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static LinkValue[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new LinkValue[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private LinkValue mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L9:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 7: default 72
        //                       0: 81
        //                       8: 83
        //                       18: 97
        //                       26: 108
        //                       32: 137
        //                       40: 218
        //                       50: 232;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
            return this;
_L3:
            promptId = Integer.valueOf(codedinputbytebuffernano.readInt32());
              goto _L9
_L4:
            textValue = codedinputbytebuffernano.readString();
              goto _L9
_L5:
            if (moneyValue == null)
            {
                moneyValue = new com.google.wallet.proto.NanoWalletEntities.MoneyProto();
            }
            codedinputbytebuffernano.readMessage(moneyValue);
              goto _L9
_L6:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
                programIcon = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            delete = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L8:
            if (barcode == null)
            {
                barcode = new com.google.wallet.proto.NanoWalletEntities.Barcode();
            }
            codedinputbytebuffernano.readMessage(barcode);
            if (true) goto _L9; else goto _L10
_L10:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (promptId != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, promptId.intValue());
            }
            j = i;
            if (textValue != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, textValue);
            }
            i = j;
            if (moneyValue != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, moneyValue);
            }
            j = i;
            if (programIcon != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, programIcon.intValue());
            }
            i = j;
            if (delete != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(5, delete.booleanValue());
            }
            j = i;
            if (barcode != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, barcode);
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
            if (promptId != null)
            {
                codedoutputbytebuffernano.writeInt32(1, promptId.intValue());
            }
            if (textValue != null)
            {
                codedoutputbytebuffernano.writeString(2, textValue);
            }
            if (moneyValue != null)
            {
                codedoutputbytebuffernano.writeMessage(3, moneyValue);
            }
            if (programIcon != null)
            {
                codedoutputbytebuffernano.writeInt32(4, programIcon.intValue());
            }
            if (delete != null)
            {
                codedoutputbytebuffernano.writeBool(5, delete.booleanValue());
            }
            if (barcode != null)
            {
                codedoutputbytebuffernano.writeMessage(6, barcode);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LinkValue()
        {
            clear();
        }
    }

    public static final class Message extends ExtendableMessageNano
    {

        public String content;
        public String title;

        private Message clear()
        {
            title = null;
            content = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Message mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    title = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    content = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (title != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, title);
            }
            j = i;
            if (content != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, content);
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
            if (title != null)
            {
                codedoutputbytebuffernano.writeString(1, title);
            }
            if (content != null)
            {
                codedoutputbytebuffernano.writeString(2, content);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Message()
        {
            clear();
        }
    }

}
