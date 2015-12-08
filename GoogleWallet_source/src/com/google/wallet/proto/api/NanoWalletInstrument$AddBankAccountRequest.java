// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletInstrument

public static final class clear extends ExtendableMessageNano
{
    public static final class EncryptedAccountData extends ExtendableMessageNano
    {

        public String billingPublicKeyEncryptedSessionMaterial;
        public String encryptedAccountNumber;

        private EncryptedAccountData clear()
        {
            billingPublicKeyEncryptedSessionMaterial = null;
            encryptedAccountNumber = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private EncryptedAccountData mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    billingPublicKeyEncryptedSessionMaterial = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    encryptedAccountNumber = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (billingPublicKeyEncryptedSessionMaterial != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, billingPublicKeyEncryptedSessionMaterial);
            }
            j = i;
            if (encryptedAccountNumber != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, encryptedAccountNumber);
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
            if (billingPublicKeyEncryptedSessionMaterial != null)
            {
                codedoutputbytebuffernano.writeString(1, billingPublicKeyEncryptedSessionMaterial);
            }
            if (encryptedAccountNumber != null)
            {
                codedoutputbytebuffernano.writeString(2, encryptedAccountNumber);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public EncryptedAccountData()
        {
            clear();
        }
    }


    public String accountHolderName;
    public String accountNumberTrailingDigits;
    public Integer accountType;
    public String bankCode;
    public EncryptedAccountData encryptedAccountData;
    public String regionCode;

    private EncryptedAccountData.encryptedAccountNumber clear()
    {
        encryptedAccountData = null;
        accountType = null;
        accountHolderName = null;
        accountNumberTrailingDigits = null;
        bankCode = null;
        regionCode = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L9:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   10: 83
    //                   16: 112
    //                   26: 158
    //                   34: 169
    //                   42: 180
    //                   50: 191;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        if (encryptedAccountData == null)
        {
            encryptedAccountData = new EncryptedAccountData();
        }
        codedinputbytebuffernano.readMessage(encryptedAccountData);
          goto _L9
_L4:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            accountType = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        accountHolderName = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L6:
        accountNumberTrailingDigits = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L7:
        bankCode = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L8:
        regionCode = codedinputbytebuffernano.readString();
        if (true) goto _L9; else goto _L10
_L10:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (encryptedAccountData != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, encryptedAccountData);
        }
        j = i;
        if (accountType != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, accountType.intValue());
        }
        i = j;
        if (accountHolderName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, accountHolderName);
        }
        j = i;
        if (accountNumberTrailingDigits != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, accountNumberTrailingDigits);
        }
        i = j;
        if (bankCode != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, bankCode);
        }
        j = i;
        if (regionCode != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, regionCode);
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
        if (encryptedAccountData != null)
        {
            codedoutputbytebuffernano.writeMessage(1, encryptedAccountData);
        }
        if (accountType != null)
        {
            codedoutputbytebuffernano.writeInt32(2, accountType.intValue());
        }
        if (accountHolderName != null)
        {
            codedoutputbytebuffernano.writeString(3, accountHolderName);
        }
        if (accountNumberTrailingDigits != null)
        {
            codedoutputbytebuffernano.writeString(4, accountNumberTrailingDigits);
        }
        if (bankCode != null)
        {
            codedoutputbytebuffernano.writeString(5, bankCode);
        }
        if (regionCode != null)
        {
            codedoutputbytebuffernano.writeString(6, regionCode);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public EncryptedAccountData.clear()
    {
        clear();
    }
}
