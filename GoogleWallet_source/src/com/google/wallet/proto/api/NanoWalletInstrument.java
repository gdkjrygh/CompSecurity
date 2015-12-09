// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface NanoWalletInstrument
{
    public static final class AddBankAccountRequest extends ExtendableMessageNano
    {

        public String accountHolderName;
        public String accountNumberTrailingDigits;
        public Integer accountType;
        public String bankCode;
        public EncryptedAccountData encryptedAccountData;
        public String regionCode;

        private AddBankAccountRequest clear()
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

        private AddBankAccountRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L9:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 7: default 72
        //                       0: 81
        //                       10: 83
        //                       16: 112
        //                       26: 158
        //                       34: 169
        //                       42: 180
        //                       50: 191;
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

        public AddBankAccountRequest()
        {
            clear();
        }
    }

    public static final class AddBankAccountRequest.EncryptedAccountData extends ExtendableMessageNano
    {

        public String billingPublicKeyEncryptedSessionMaterial;
        public String encryptedAccountNumber;

        private AddBankAccountRequest.EncryptedAccountData clear()
        {
            billingPublicKeyEncryptedSessionMaterial = null;
            encryptedAccountNumber = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private AddBankAccountRequest.EncryptedAccountData mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public AddBankAccountRequest.EncryptedAccountData()
        {
            clear();
        }
    }

    public static final class AddBankAccountResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.BankAccount account;
        public com.google.wallet.proto.NanoWalletError.CallError callError;

        private AddBankAccountResponse clear()
        {
            callError = null;
            account = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private AddBankAccountResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;

                case 18: // '\022'
                    if (account == null)
                    {
                        account = new com.google.wallet.proto.NanoWalletEntities.BankAccount();
                    }
                    codedinputbytebuffernano.readMessage(account);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, callError);
            }
            j = i;
            if (account != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, account);
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
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(1, callError);
            }
            if (account != null)
            {
                codedoutputbytebuffernano.writeMessage(2, account);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AddBankAccountResponse()
        {
            clear();
        }
    }

    public static final class DeleteInstrumentRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.Credential credential;

        private DeleteInstrumentRequest clear()
        {
            credential = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DeleteInstrumentRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (credential == null)
                    {
                        credential = new com.google.wallet.proto.NanoWalletEntities.Credential();
                    }
                    codedinputbytebuffernano.readMessage(credential);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (credential != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, credential);
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
            if (credential != null)
            {
                codedoutputbytebuffernano.writeMessage(1, credential);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DeleteInstrumentRequest()
        {
            clear();
        }
    }

    public static final class DeleteInstrumentResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public Integer errorCode;

        private DeleteInstrumentResponse clear()
        {
            errorCode = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DeleteInstrumentResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       8: 51
        //                       18: 94;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
                errorCode = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (callError == null)
            {
                callError = new com.google.wallet.proto.NanoWalletError.CallError();
            }
            codedinputbytebuffernano.readMessage(callError);
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (errorCode != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, errorCode.intValue());
            }
            j = i;
            if (callError != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, callError);
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
            if (errorCode != null)
            {
                codedoutputbytebuffernano.writeInt32(1, errorCode.intValue());
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DeleteInstrumentResponse()
        {
            clear();
        }
    }

    public static final class DeletePaymentInstrumentRequest extends ExtendableMessageNano
    {

        public String instrumentSubId;

        private DeletePaymentInstrumentRequest clear()
        {
            instrumentSubId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DeletePaymentInstrumentRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    instrumentSubId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (instrumentSubId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, instrumentSubId);
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
            if (instrumentSubId != null)
            {
                codedoutputbytebuffernano.writeString(1, instrumentSubId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DeletePaymentInstrumentRequest()
        {
            clear();
        }
    }

    public static final class DeletePaymentInstrumentResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;

        private DeletePaymentInstrumentResponse clear()
        {
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DeletePaymentInstrumentResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, callError);
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
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(1, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DeletePaymentInstrumentResponse()
        {
            clear();
        }
    }

    public static final class FetchInstrumentsRequest extends ExtendableMessageNano
    {

        private FetchInstrumentsRequest clear()
        {
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchInstrumentsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L3:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 33;
               goto _L1 _L2
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public FetchInstrumentsRequest()
        {
            clear();
        }
    }

    public static final class FetchInstrumentsResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.Credential entities[];

        private FetchInstrumentsResponse clear()
        {
            entities = com.google.wallet.proto.NanoWalletEntities.Credential.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchInstrumentsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    com.google.wallet.proto.NanoWalletEntities.Credential acredential[];
                    int j;
                    if (entities == null)
                    {
                        j = 0;
                    } else
                    {
                        j = entities.length;
                    }
                    acredential = new com.google.wallet.proto.NanoWalletEntities.Credential[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(entities, 0, acredential, 0, j);
                        k = j;
                    }
                    for (; k < acredential.length - 1; k++)
                    {
                        acredential[k] = new com.google.wallet.proto.NanoWalletEntities.Credential();
                        codedinputbytebuffernano.readMessage(acredential[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    acredential[k] = new com.google.wallet.proto.NanoWalletEntities.Credential();
                    codedinputbytebuffernano.readMessage(acredential[k]);
                    entities = acredential;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int k = i;
            if (entities != null)
            {
                k = i;
                if (entities.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= entities.length)
                        {
                            break;
                        }
                        com.google.wallet.proto.NanoWalletEntities.Credential credential = entities[j];
                        k = i;
                        if (credential != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(1, credential);
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
            if (entities != null && entities.length > 0)
            {
                for (int i = 0; i < entities.length; i++)
                {
                    com.google.wallet.proto.NanoWalletEntities.Credential credential = entities[i];
                    if (credential != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, credential);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchInstrumentsResponse()
        {
            clear();
        }
    }

    public static final class GetBankAccountsRequest extends ExtendableMessageNano
    {

        private GetBankAccountsRequest clear()
        {
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetBankAccountsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L3:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 33;
               goto _L1 _L2
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public GetBankAccountsRequest()
        {
            clear();
        }
    }

    public static final class GetBankAccountsResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.BankAccount bankAccounts[];
        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public Integer errorCode;

        private GetBankAccountsResponse clear()
        {
            errorCode = null;
            callError = null;
            bankAccounts = com.google.wallet.proto.NanoWalletEntities.BankAccount.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetBankAccountsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       8: 59
        //                       18: 98
        //                       26: 127;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
                errorCode = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (callError == null)
            {
                callError = new com.google.wallet.proto.NanoWalletError.CallError();
            }
            codedinputbytebuffernano.readMessage(callError);
            continue; /* Loop/switch isn't completed */
_L5:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
            com.google.wallet.proto.NanoWalletEntities.BankAccount abankaccount[];
            int k;
            if (bankAccounts == null)
            {
                k = 0;
            } else
            {
                k = bankAccounts.length;
            }
            abankaccount = new com.google.wallet.proto.NanoWalletEntities.BankAccount[k + l];
            l = k;
            if (k != 0)
            {
                System.arraycopy(bankAccounts, 0, abankaccount, 0, k);
                l = k;
            }
            for (; l < abankaccount.length - 1; l++)
            {
                abankaccount[l] = new com.google.wallet.proto.NanoWalletEntities.BankAccount();
                codedinputbytebuffernano.readMessage(abankaccount[l]);
                codedinputbytebuffernano.readTag();
            }

            abankaccount[l] = new com.google.wallet.proto.NanoWalletEntities.BankAccount();
            codedinputbytebuffernano.readMessage(abankaccount[l]);
            bankAccounts = abankaccount;
            if (true) goto _L6; else goto _L7
_L7:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (errorCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(1, errorCode.intValue());
            }
            i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, callError);
            }
            int l = i;
            if (bankAccounts != null)
            {
                l = i;
                if (bankAccounts.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= bankAccounts.length)
                        {
                            break;
                        }
                        com.google.wallet.proto.NanoWalletEntities.BankAccount bankaccount = bankAccounts[k];
                        l = i;
                        if (bankaccount != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(3, bankaccount);
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
            if (errorCode != null)
            {
                codedoutputbytebuffernano.writeInt32(1, errorCode.intValue());
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            if (bankAccounts != null && bankAccounts.length > 0)
            {
                for (int i = 0; i < bankAccounts.length; i++)
                {
                    com.google.wallet.proto.NanoWalletEntities.BankAccount bankaccount = bankAccounts[i];
                    if (bankaccount != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, bankaccount);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetBankAccountsResponse()
        {
            clear();
        }
    }

    public static final class GetStoredValueRequest extends ExtendableMessageNano
    {

        public Boolean alwaysIncludePendingTopups;
        public com.google.wallet.proto.NanoWalletEntities.CdpIdData knownStoredValueId;
        public com.google.wallet.proto.NanoWalletTransport.RequestMetadata metadata;

        private GetStoredValueRequest clear()
        {
            knownStoredValueId = null;
            alwaysIncludePendingTopups = null;
            metadata = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetStoredValueRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (knownStoredValueId == null)
                    {
                        knownStoredValueId = new com.google.wallet.proto.NanoWalletEntities.CdpIdData();
                    }
                    codedinputbytebuffernano.readMessage(knownStoredValueId);
                    break;

                case 16: // '\020'
                    alwaysIncludePendingTopups = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 72002: 
                    if (metadata == null)
                    {
                        metadata = new com.google.wallet.proto.NanoWalletTransport.RequestMetadata();
                    }
                    codedinputbytebuffernano.readMessage(metadata);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (knownStoredValueId != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, knownStoredValueId);
            }
            j = i;
            if (alwaysIncludePendingTopups != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(2, alwaysIncludePendingTopups.booleanValue());
            }
            i = j;
            if (metadata != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(9000, metadata);
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
            if (knownStoredValueId != null)
            {
                codedoutputbytebuffernano.writeMessage(1, knownStoredValueId);
            }
            if (alwaysIncludePendingTopups != null)
            {
                codedoutputbytebuffernano.writeBool(2, alwaysIncludePendingTopups.booleanValue());
            }
            if (metadata != null)
            {
                codedoutputbytebuffernano.writeMessage(9000, metadata);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetStoredValueRequest()
        {
            clear();
        }
    }

    public static final class GetStoredValueResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public Integer errorCode;
        public com.google.wallet.proto.NanoWalletTransport.ResponseMetadata metadata;
        public com.google.wallet.proto.NanoWalletEntities.StoredValue storedValue;
        public String storedValueNotCreatedDisplay;

        private GetStoredValueResponse clear()
        {
            errorCode = null;
            callError = null;
            storedValue = null;
            storedValueNotCreatedDisplay = null;
            metadata = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetStoredValueResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 73
        //                       8: 75
        //                       18: 114
        //                       26: 143
        //                       34: 172
        //                       72002: 183;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
                errorCode = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (callError == null)
            {
                callError = new com.google.wallet.proto.NanoWalletError.CallError();
            }
            codedinputbytebuffernano.readMessage(callError);
            continue; /* Loop/switch isn't completed */
_L5:
            if (storedValue == null)
            {
                storedValue = new com.google.wallet.proto.NanoWalletEntities.StoredValue();
            }
            codedinputbytebuffernano.readMessage(storedValue);
            continue; /* Loop/switch isn't completed */
_L6:
            storedValueNotCreatedDisplay = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L7:
            if (metadata == null)
            {
                metadata = new com.google.wallet.proto.NanoWalletTransport.ResponseMetadata();
            }
            codedinputbytebuffernano.readMessage(metadata);
            if (true) goto _L8; else goto _L9
_L9:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (errorCode != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, errorCode.intValue());
            }
            j = i;
            if (callError != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, callError);
            }
            i = j;
            if (storedValue != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, storedValue);
            }
            j = i;
            if (storedValueNotCreatedDisplay != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, storedValueNotCreatedDisplay);
            }
            i = j;
            if (metadata != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(9000, metadata);
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
            if (errorCode != null)
            {
                codedoutputbytebuffernano.writeInt32(1, errorCode.intValue());
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            if (storedValue != null)
            {
                codedoutputbytebuffernano.writeMessage(3, storedValue);
            }
            if (storedValueNotCreatedDisplay != null)
            {
                codedoutputbytebuffernano.writeString(4, storedValueNotCreatedDisplay);
            }
            if (metadata != null)
            {
                codedoutputbytebuffernano.writeMessage(9000, metadata);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetStoredValueResponse()
        {
            clear();
        }
    }

    public static final class InitiateChallengeDepositRequest extends ExtendableMessageNano
    {

        public String bankAccountSubId;

        private InitiateChallengeDepositRequest clear()
        {
            bankAccountSubId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private InitiateChallengeDepositRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    bankAccountSubId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (bankAccountSubId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, bankAccountSubId);
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
            if (bankAccountSubId != null)
            {
                codedoutputbytebuffernano.writeString(1, bankAccountSubId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public InitiateChallengeDepositRequest()
        {
            clear();
        }
    }

    public static final class InitiateChallengeDepositResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.BankAccount account;
        public com.google.wallet.proto.NanoWalletError.CallError callError;

        private InitiateChallengeDepositResponse clear()
        {
            callError = null;
            account = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private InitiateChallengeDepositResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;

                case 18: // '\022'
                    if (account == null)
                    {
                        account = new com.google.wallet.proto.NanoWalletEntities.BankAccount();
                    }
                    codedinputbytebuffernano.readMessage(account);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, callError);
            }
            j = i;
            if (account != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, account);
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
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(1, callError);
            }
            if (account != null)
            {
                codedoutputbytebuffernano.writeMessage(2, account);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public InitiateChallengeDepositResponse()
        {
            clear();
        }
    }

    public static final class VerifyChallengeDepositRequest extends ExtendableMessageNano
    {

        public String bankAccountSubId;
        public com.google.wallet.proto.NanoWalletEntities.MoneyProto depositAmount;

        private VerifyChallengeDepositRequest clear()
        {
            bankAccountSubId = null;
            depositAmount = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private VerifyChallengeDepositRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    bankAccountSubId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    if (depositAmount == null)
                    {
                        depositAmount = new com.google.wallet.proto.NanoWalletEntities.MoneyProto();
                    }
                    codedinputbytebuffernano.readMessage(depositAmount);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (bankAccountSubId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, bankAccountSubId);
            }
            j = i;
            if (depositAmount != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, depositAmount);
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
            if (bankAccountSubId != null)
            {
                codedoutputbytebuffernano.writeString(1, bankAccountSubId);
            }
            if (depositAmount != null)
            {
                codedoutputbytebuffernano.writeMessage(2, depositAmount);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public VerifyChallengeDepositRequest()
        {
            clear();
        }
    }

    public static final class VerifyChallengeDepositResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.BankAccount account;
        public com.google.wallet.proto.NanoWalletError.CallError callError;

        private VerifyChallengeDepositResponse clear()
        {
            callError = null;
            account = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private VerifyChallengeDepositResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;

                case 18: // '\022'
                    if (account == null)
                    {
                        account = new com.google.wallet.proto.NanoWalletEntities.BankAccount();
                    }
                    codedinputbytebuffernano.readMessage(account);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, callError);
            }
            j = i;
            if (account != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, account);
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
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(1, callError);
            }
            if (account != null)
            {
                codedoutputbytebuffernano.writeMessage(2, account);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public VerifyChallengeDepositResponse()
        {
            clear();
        }
    }

}
