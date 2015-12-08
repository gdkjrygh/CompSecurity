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

public interface NanoWalletEntities
{
    public static final class AccountIdentifier extends ExtendableMessageNano
    {

        public byte accountId[];
        public String emailAddress;

        private AccountIdentifier clear()
        {
            emailAddress = null;
            accountId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private AccountIdentifier mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    emailAddress = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    accountId = codedinputbytebuffernano.readBytes();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (emailAddress != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, emailAddress);
            }
            j = i;
            if (accountId != null)
            {
                j = i + CodedOutputByteBufferNano.computeBytesSize(2, accountId);
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
            if (emailAddress != null)
            {
                codedoutputbytebuffernano.writeString(1, emailAddress);
            }
            if (accountId != null)
            {
                codedoutputbytebuffernano.writeBytes(2, accountId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AccountIdentifier()
        {
            clear();
        }
    }

    public static final class Address extends ExtendableMessageNano
    {

        private static volatile Address _emptyArray[];
        public CdpIdData cdpAddressId;
        public String city;
        public String countryCode;
        public String dependentLocalityName;
        public EntityIdentifier id;
        public String languageCode;
        public String line1;
        public String line2;
        public String postalCode;
        public String premiseName;
        public String recipientName;
        public String sortingCode;
        public String state;
        public String subAdministrativeAreaName;
        public String subPremiseName;
        public String thoroughfareName;
        public String thoroughfareNumber;

        private Address clear()
        {
            id = null;
            line1 = null;
            line2 = null;
            city = null;
            state = null;
            postalCode = null;
            countryCode = null;
            recipientName = null;
            cdpAddressId = null;
            languageCode = null;
            subAdministrativeAreaName = null;
            dependentLocalityName = null;
            thoroughfareName = null;
            thoroughfareNumber = null;
            sortingCode = null;
            premiseName = null;
            subPremiseName = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static Address[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Address[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private Address mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (id == null)
                    {
                        id = new EntityIdentifier();
                    }
                    codedinputbytebuffernano.readMessage(id);
                    break;

                case 18: // '\022'
                    line1 = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    line2 = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    city = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    state = codedinputbytebuffernano.readString();
                    break;

                case 50: // '2'
                    postalCode = codedinputbytebuffernano.readString();
                    break;

                case 58: // ':'
                    recipientName = codedinputbytebuffernano.readString();
                    break;

                case 66: // 'B'
                    languageCode = codedinputbytebuffernano.readString();
                    break;

                case 74: // 'J'
                    subAdministrativeAreaName = codedinputbytebuffernano.readString();
                    break;

                case 82: // 'R'
                    dependentLocalityName = codedinputbytebuffernano.readString();
                    break;

                case 90: // 'Z'
                    thoroughfareName = codedinputbytebuffernano.readString();
                    break;

                case 98: // 'b'
                    thoroughfareNumber = codedinputbytebuffernano.readString();
                    break;

                case 106: // 'j'
                    sortingCode = codedinputbytebuffernano.readString();
                    break;

                case 114: // 'r'
                    premiseName = codedinputbytebuffernano.readString();
                    break;

                case 122: // 'z'
                    subPremiseName = codedinputbytebuffernano.readString();
                    break;

                case 130: 
                    if (cdpAddressId == null)
                    {
                        cdpAddressId = new CdpIdData();
                    }
                    codedinputbytebuffernano.readMessage(cdpAddressId);
                    break;

                case 138: 
                    countryCode = codedinputbytebuffernano.readString();
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
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
            }
            j = i;
            if (line1 != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, line1);
            }
            i = j;
            if (line2 != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, line2);
            }
            j = i;
            if (city != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, city);
            }
            i = j;
            if (state != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, state);
            }
            j = i;
            if (postalCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, postalCode);
            }
            i = j;
            if (recipientName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(7, recipientName);
            }
            j = i;
            if (languageCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(8, languageCode);
            }
            i = j;
            if (subAdministrativeAreaName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(9, subAdministrativeAreaName);
            }
            j = i;
            if (dependentLocalityName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(10, dependentLocalityName);
            }
            i = j;
            if (thoroughfareName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(11, thoroughfareName);
            }
            j = i;
            if (thoroughfareNumber != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(12, thoroughfareNumber);
            }
            i = j;
            if (sortingCode != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(13, sortingCode);
            }
            j = i;
            if (premiseName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(14, premiseName);
            }
            i = j;
            if (subPremiseName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(15, subPremiseName);
            }
            j = i;
            if (cdpAddressId != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(16, cdpAddressId);
            }
            i = j;
            if (countryCode != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(17, countryCode);
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
            if (id != null)
            {
                codedoutputbytebuffernano.writeMessage(1, id);
            }
            if (line1 != null)
            {
                codedoutputbytebuffernano.writeString(2, line1);
            }
            if (line2 != null)
            {
                codedoutputbytebuffernano.writeString(3, line2);
            }
            if (city != null)
            {
                codedoutputbytebuffernano.writeString(4, city);
            }
            if (state != null)
            {
                codedoutputbytebuffernano.writeString(5, state);
            }
            if (postalCode != null)
            {
                codedoutputbytebuffernano.writeString(6, postalCode);
            }
            if (recipientName != null)
            {
                codedoutputbytebuffernano.writeString(7, recipientName);
            }
            if (languageCode != null)
            {
                codedoutputbytebuffernano.writeString(8, languageCode);
            }
            if (subAdministrativeAreaName != null)
            {
                codedoutputbytebuffernano.writeString(9, subAdministrativeAreaName);
            }
            if (dependentLocalityName != null)
            {
                codedoutputbytebuffernano.writeString(10, dependentLocalityName);
            }
            if (thoroughfareName != null)
            {
                codedoutputbytebuffernano.writeString(11, thoroughfareName);
            }
            if (thoroughfareNumber != null)
            {
                codedoutputbytebuffernano.writeString(12, thoroughfareNumber);
            }
            if (sortingCode != null)
            {
                codedoutputbytebuffernano.writeString(13, sortingCode);
            }
            if (premiseName != null)
            {
                codedoutputbytebuffernano.writeString(14, premiseName);
            }
            if (subPremiseName != null)
            {
                codedoutputbytebuffernano.writeString(15, subPremiseName);
            }
            if (cdpAddressId != null)
            {
                codedoutputbytebuffernano.writeMessage(16, cdpAddressId);
            }
            if (countryCode != null)
            {
                codedoutputbytebuffernano.writeString(17, countryCode);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Address()
        {
            clear();
        }
    }

    public static final class AndroidIdRegistrationInfo extends ExtendableMessageNano
    {

        public Long androidId;

        private AndroidIdRegistrationInfo clear()
        {
            androidId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private AndroidIdRegistrationInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    androidId = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (androidId != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, androidId.longValue());
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
            if (androidId != null)
            {
                codedoutputbytebuffernano.writeInt64(1, androidId.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AndroidIdRegistrationInfo()
        {
            clear();
        }
    }

    public static final class ApnsRegistrationInfo extends ExtendableMessageNano
    {

        public String bundleId;
        public String gaiaAuthToken;
        public byte token[];

        private ApnsRegistrationInfo clear()
        {
            token = null;
            bundleId = null;
            gaiaAuthToken = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ApnsRegistrationInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    token = codedinputbytebuffernano.readBytes();
                    break;

                case 18: // '\022'
                    bundleId = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    gaiaAuthToken = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (token != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(1, token);
            }
            j = i;
            if (bundleId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, bundleId);
            }
            i = j;
            if (gaiaAuthToken != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, gaiaAuthToken);
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
            if (token != null)
            {
                codedoutputbytebuffernano.writeBytes(1, token);
            }
            if (bundleId != null)
            {
                codedoutputbytebuffernano.writeString(2, bundleId);
            }
            if (gaiaAuthToken != null)
            {
                codedoutputbytebuffernano.writeString(3, gaiaAuthToken);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ApnsRegistrationInfo()
        {
            clear();
        }
    }

    public static final class AuthenticationQuestion extends ExtendableMessageNano
    {

        private static volatile AuthenticationQuestion _emptyArray[];
        public String description;
        public String displayText;
        public String id;
        public Integer maxAnswerLength;
        public Integer minAnswerLength;
        public Integer questionType;

        private AuthenticationQuestion clear()
        {
            id = null;
            displayText = null;
            description = null;
            maxAnswerLength = null;
            minAnswerLength = null;
            questionType = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static AuthenticationQuestion[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new AuthenticationQuestion[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private AuthenticationQuestion mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
        //                       32: 116
        //                       40: 130
        //                       48: 144;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
            return this;
_L3:
            id = codedinputbytebuffernano.readString();
              goto _L9
_L4:
            displayText = codedinputbytebuffernano.readString();
              goto _L9
_L5:
            description = codedinputbytebuffernano.readString();
              goto _L9
_L6:
            maxAnswerLength = Integer.valueOf(codedinputbytebuffernano.readInt32());
              goto _L9
_L7:
            minAnswerLength = Integer.valueOf(codedinputbytebuffernano.readInt32());
              goto _L9
_L8:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                questionType = Integer.valueOf(j);
                break;
            }
            if (true) goto _L9; else goto _L10
_L10:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (id != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, id);
            }
            j = i;
            if (displayText != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, displayText);
            }
            i = j;
            if (description != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, description);
            }
            j = i;
            if (maxAnswerLength != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, maxAnswerLength.intValue());
            }
            i = j;
            if (minAnswerLength != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(5, minAnswerLength.intValue());
            }
            j = i;
            if (questionType != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(6, questionType.intValue());
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
                codedoutputbytebuffernano.writeString(1, id);
            }
            if (displayText != null)
            {
                codedoutputbytebuffernano.writeString(2, displayText);
            }
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(3, description);
            }
            if (maxAnswerLength != null)
            {
                codedoutputbytebuffernano.writeInt32(4, maxAnswerLength.intValue());
            }
            if (minAnswerLength != null)
            {
                codedoutputbytebuffernano.writeInt32(5, minAnswerLength.intValue());
            }
            if (questionType != null)
            {
                codedoutputbytebuffernano.writeInt32(6, questionType.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AuthenticationQuestion()
        {
            clear();
        }
    }

    public static final class BankAccount extends ExtendableMessageNano
    {

        private static volatile BankAccount _emptyArray[];
        public String accountHolderName;
        public String accountNumberTrailingDigits;
        public AccountStatus accountStatus;
        public Integer accountType;
        public ChallengeDepositStatus challengeStatus;
        public YodleeIavStatus iavStatus;
        public CdpIdData id;
        public String nickname;
        public RestrictedInstrumentUse restrictedUses[];

        private BankAccount clear()
        {
            id = null;
            accountHolderName = null;
            accountType = null;
            accountNumberTrailingDigits = null;
            nickname = null;
            accountStatus = null;
            challengeStatus = null;
            iavStatus = null;
            restrictedUses = RestrictedInstrumentUse.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static BankAccount[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new BankAccount[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private BankAccount mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L12:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 10: default 96
        //                       0: 105
        //                       10: 107
        //                       18: 136
        //                       24: 147
        //                       34: 194
        //                       42: 205
        //                       50: 216
        //                       58: 245
        //                       66: 274
        //                       74: 303;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
_L2:
            return this;
_L3:
            if (id == null)
            {
                id = new CdpIdData();
            }
            codedinputbytebuffernano.readMessage(id);
              goto _L12
_L4:
            accountHolderName = codedinputbytebuffernano.readString();
              goto _L12
_L5:
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
_L6:
            accountNumberTrailingDigits = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L7:
            nickname = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L8:
            if (accountStatus == null)
            {
                accountStatus = new AccountStatus();
            }
            codedinputbytebuffernano.readMessage(accountStatus);
            continue; /* Loop/switch isn't completed */
_L9:
            if (challengeStatus == null)
            {
                challengeStatus = new ChallengeDepositStatus();
            }
            codedinputbytebuffernano.readMessage(challengeStatus);
            continue; /* Loop/switch isn't completed */
_L10:
            if (iavStatus == null)
            {
                iavStatus = new YodleeIavStatus();
            }
            codedinputbytebuffernano.readMessage(iavStatus);
            continue; /* Loop/switch isn't completed */
_L11:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 74);
            RestrictedInstrumentUse arestrictedinstrumentuse[];
            int k;
            if (restrictedUses == null)
            {
                k = 0;
            } else
            {
                k = restrictedUses.length;
            }
            arestrictedinstrumentuse = new RestrictedInstrumentUse[k + l];
            l = k;
            if (k != 0)
            {
                System.arraycopy(restrictedUses, 0, arestrictedinstrumentuse, 0, k);
                l = k;
            }
            for (; l < arestrictedinstrumentuse.length - 1; l++)
            {
                arestrictedinstrumentuse[l] = new RestrictedInstrumentUse();
                codedinputbytebuffernano.readMessage(arestrictedinstrumentuse[l]);
                codedinputbytebuffernano.readTag();
            }

            arestrictedinstrumentuse[l] = new RestrictedInstrumentUse();
            codedinputbytebuffernano.readMessage(arestrictedinstrumentuse[l]);
            restrictedUses = arestrictedinstrumentuse;
            if (true) goto _L12; else goto _L13
_L13:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (id != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
            }
            j = i;
            if (accountHolderName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, accountHolderName);
            }
            i = j;
            if (accountType != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, accountType.intValue());
            }
            j = i;
            if (accountNumberTrailingDigits != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, accountNumberTrailingDigits);
            }
            i = j;
            if (nickname != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, nickname);
            }
            j = i;
            if (accountStatus != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, accountStatus);
            }
            int l = j;
            if (challengeStatus != null)
            {
                l = j + CodedOutputByteBufferNano.computeMessageSize(7, challengeStatus);
            }
            i = l;
            if (iavStatus != null)
            {
                i = l + CodedOutputByteBufferNano.computeMessageSize(8, iavStatus);
            }
            l = i;
            if (restrictedUses != null)
            {
                l = i;
                if (restrictedUses.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= restrictedUses.length)
                        {
                            break;
                        }
                        RestrictedInstrumentUse restrictedinstrumentuse = restrictedUses[k];
                        l = i;
                        if (restrictedinstrumentuse != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(9, restrictedinstrumentuse);
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
            if (id != null)
            {
                codedoutputbytebuffernano.writeMessage(1, id);
            }
            if (accountHolderName != null)
            {
                codedoutputbytebuffernano.writeString(2, accountHolderName);
            }
            if (accountType != null)
            {
                codedoutputbytebuffernano.writeInt32(3, accountType.intValue());
            }
            if (accountNumberTrailingDigits != null)
            {
                codedoutputbytebuffernano.writeString(4, accountNumberTrailingDigits);
            }
            if (nickname != null)
            {
                codedoutputbytebuffernano.writeString(5, nickname);
            }
            if (accountStatus != null)
            {
                codedoutputbytebuffernano.writeMessage(6, accountStatus);
            }
            if (challengeStatus != null)
            {
                codedoutputbytebuffernano.writeMessage(7, challengeStatus);
            }
            if (iavStatus != null)
            {
                codedoutputbytebuffernano.writeMessage(8, iavStatus);
            }
            if (restrictedUses != null && restrictedUses.length > 0)
            {
                for (int i = 0; i < restrictedUses.length; i++)
                {
                    RestrictedInstrumentUse restrictedinstrumentuse = restrictedUses[i];
                    if (restrictedinstrumentuse != null)
                    {
                        codedoutputbytebuffernano.writeMessage(9, restrictedinstrumentuse);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public BankAccount()
        {
            clear();
        }
    }

    public static final class BankAccount.AccountStatus extends ExtendableMessageNano
    {

        public Integer status;

        private BankAccount.AccountStatus clear()
        {
            status = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private BankAccount.AccountStatus mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 41
        //                       8: 43;
               goto _L1 _L2 _L3
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
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
                status = Integer.valueOf(j);
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (status != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, status.intValue());
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
            if (status != null)
            {
                codedoutputbytebuffernano.writeInt32(1, status.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public BankAccount.AccountStatus()
        {
            clear();
        }
    }

    public static final class BankAccount.ChallengeDepositStatus extends ExtendableMessageNano
    {

        public Integer status;

        private BankAccount.ChallengeDepositStatus clear()
        {
            status = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private BankAccount.ChallengeDepositStatus mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 41
        //                       8: 43;
               goto _L1 _L2 _L3
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
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
                status = Integer.valueOf(j);
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (status != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, status.intValue());
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
            if (status != null)
            {
                codedoutputbytebuffernano.writeInt32(1, status.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public BankAccount.ChallengeDepositStatus()
        {
            clear();
        }
    }

    public static final class BankAccount.YodleeIavStatus extends ExtendableMessageNano
    {

        public Integer status;

        private BankAccount.YodleeIavStatus clear()
        {
            status = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private BankAccount.YodleeIavStatus mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 41
        //                       8: 43;
               goto _L1 _L2 _L3
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
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
                status = Integer.valueOf(j);
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (status != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, status.intValue());
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
            if (status != null)
            {
                codedoutputbytebuffernano.writeInt32(1, status.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public BankAccount.YodleeIavStatus()
        {
            clear();
        }
    }

    public static final class BankTransaction extends ExtendableMessageNano
    {

        public String amount;
        public String authorizationCode;
        public Boolean creditToAccount;
        public String description;
        public String merchantCity;
        public String merchantName;
        public String merchantPhoneNumber;
        public String merchantState;
        public String messageGroupId;
        public MoneyProto moneyAmount;
        public String offerId;
        public Long purchaseTimeMillis;
        public Long settlementTimeMillis;
        public MoneyProto totalAmount;
        public String transactionId;

        private BankTransaction clear()
        {
            description = null;
            amount = null;
            merchantName = null;
            merchantCity = null;
            merchantState = null;
            merchantPhoneNumber = null;
            purchaseTimeMillis = null;
            creditToAccount = null;
            settlementTimeMillis = null;
            moneyAmount = null;
            authorizationCode = null;
            transactionId = null;
            messageGroupId = null;
            offerId = null;
            totalAmount = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private BankTransaction mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    description = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    amount = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    merchantName = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    merchantCity = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    merchantState = codedinputbytebuffernano.readString();
                    break;

                case 50: // '2'
                    merchantPhoneNumber = codedinputbytebuffernano.readString();
                    break;

                case 56: // '8'
                    purchaseTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 64: // '@'
                    creditToAccount = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 72: // 'H'
                    settlementTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 82: // 'R'
                    if (moneyAmount == null)
                    {
                        moneyAmount = new MoneyProto();
                    }
                    codedinputbytebuffernano.readMessage(moneyAmount);
                    break;

                case 90: // 'Z'
                    authorizationCode = codedinputbytebuffernano.readString();
                    break;

                case 98: // 'b'
                    transactionId = codedinputbytebuffernano.readString();
                    break;

                case 106: // 'j'
                    messageGroupId = codedinputbytebuffernano.readString();
                    break;

                case 114: // 'r'
                    offerId = codedinputbytebuffernano.readString();
                    break;

                case 122: // 'z'
                    if (totalAmount == null)
                    {
                        totalAmount = new MoneyProto();
                    }
                    codedinputbytebuffernano.readMessage(totalAmount);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (description != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, description);
            }
            j = i;
            if (amount != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, amount);
            }
            i = j;
            if (merchantName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, merchantName);
            }
            j = i;
            if (merchantCity != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, merchantCity);
            }
            i = j;
            if (merchantState != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, merchantState);
            }
            j = i;
            if (merchantPhoneNumber != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, merchantPhoneNumber);
            }
            i = j;
            if (purchaseTimeMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(7, purchaseTimeMillis.longValue());
            }
            j = i;
            if (creditToAccount != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(8, creditToAccount.booleanValue());
            }
            i = j;
            if (settlementTimeMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(9, settlementTimeMillis.longValue());
            }
            j = i;
            if (moneyAmount != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(10, moneyAmount);
            }
            i = j;
            if (authorizationCode != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(11, authorizationCode);
            }
            j = i;
            if (transactionId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(12, transactionId);
            }
            i = j;
            if (messageGroupId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(13, messageGroupId);
            }
            j = i;
            if (offerId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(14, offerId);
            }
            i = j;
            if (totalAmount != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(15, totalAmount);
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
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(1, description);
            }
            if (amount != null)
            {
                codedoutputbytebuffernano.writeString(2, amount);
            }
            if (merchantName != null)
            {
                codedoutputbytebuffernano.writeString(3, merchantName);
            }
            if (merchantCity != null)
            {
                codedoutputbytebuffernano.writeString(4, merchantCity);
            }
            if (merchantState != null)
            {
                codedoutputbytebuffernano.writeString(5, merchantState);
            }
            if (merchantPhoneNumber != null)
            {
                codedoutputbytebuffernano.writeString(6, merchantPhoneNumber);
            }
            if (purchaseTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(7, purchaseTimeMillis.longValue());
            }
            if (creditToAccount != null)
            {
                codedoutputbytebuffernano.writeBool(8, creditToAccount.booleanValue());
            }
            if (settlementTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(9, settlementTimeMillis.longValue());
            }
            if (moneyAmount != null)
            {
                codedoutputbytebuffernano.writeMessage(10, moneyAmount);
            }
            if (authorizationCode != null)
            {
                codedoutputbytebuffernano.writeString(11, authorizationCode);
            }
            if (transactionId != null)
            {
                codedoutputbytebuffernano.writeString(12, transactionId);
            }
            if (messageGroupId != null)
            {
                codedoutputbytebuffernano.writeString(13, messageGroupId);
            }
            if (offerId != null)
            {
                codedoutputbytebuffernano.writeString(14, offerId);
            }
            if (totalAmount != null)
            {
                codedoutputbytebuffernano.writeMessage(15, totalAmount);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public BankTransaction()
        {
            clear();
        }
    }

    public static final class Barcode extends ExtendableMessageNano
    {

        public String text;
        public Integer type;
        public String value;

        private Barcode clear()
        {
            type = null;
            value = null;
            text = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Barcode mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       8: 59
        //                       18: 158
        //                       26: 169;
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
            case 2: // '\002'
            case 3: // '\003'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
                type = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            value = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L5:
            text = codedinputbytebuffernano.readString();
            if (true) goto _L6; else goto _L7
_L7:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (type != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, type.intValue());
            }
            j = i;
            if (value != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, value);
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
            if (type != null)
            {
                codedoutputbytebuffernano.writeInt32(1, type.intValue());
            }
            if (value != null)
            {
                codedoutputbytebuffernano.writeString(2, value);
            }
            if (text != null)
            {
                codedoutputbytebuffernano.writeString(3, text);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Barcode()
        {
            clear();
        }
    }

    public static final class BillingKeys extends ExtendableMessageNano
    {

        public EntityIdentifier id;
        public EntityMetadata metadata;
        public String publicKey;
        public String signingKey;

        private BillingKeys clear()
        {
            id = null;
            metadata = null;
            publicKey = null;
            signingKey = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private BillingKeys mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (id == null)
                    {
                        id = new EntityIdentifier();
                    }
                    codedinputbytebuffernano.readMessage(id);
                    break;

                case 18: // '\022'
                    if (metadata == null)
                    {
                        metadata = new EntityMetadata();
                    }
                    codedinputbytebuffernano.readMessage(metadata);
                    break;

                case 26: // '\032'
                    publicKey = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    signingKey = codedinputbytebuffernano.readString();
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
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
            }
            j = i;
            if (metadata != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, metadata);
            }
            i = j;
            if (publicKey != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, publicKey);
            }
            j = i;
            if (signingKey != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, signingKey);
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
                codedoutputbytebuffernano.writeMessage(1, id);
            }
            if (metadata != null)
            {
                codedoutputbytebuffernano.writeMessage(2, metadata);
            }
            if (publicKey != null)
            {
                codedoutputbytebuffernano.writeString(3, publicKey);
            }
            if (signingKey != null)
            {
                codedoutputbytebuffernano.writeString(4, signingKey);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public BillingKeys()
        {
            clear();
        }
    }

    public static final class BrokerAndRelationships extends ExtendableMessageNano
    {

        private static volatile BrokerAndRelationships _emptyArray[];
        public String obfuscatedBrokerId;
        public String relationship[];

        private BrokerAndRelationships clear()
        {
            obfuscatedBrokerId = null;
            relationship = WireFormatNano.EMPTY_STRING_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static BrokerAndRelationships[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new BrokerAndRelationships[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private BrokerAndRelationships mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    obfuscatedBrokerId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    String as[];
                    int j;
                    if (relationship == null)
                    {
                        j = 0;
                    } else
                    {
                        j = relationship.length;
                    }
                    as = new String[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(relationship, 0, as, 0, j);
                        k = j;
                    }
                    for (; k < as.length - 1; k++)
                    {
                        as[k] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[k] = codedinputbytebuffernano.readString();
                    relationship = as;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (obfuscatedBrokerId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, obfuscatedBrokerId);
            }
            j = i;
            if (relationship != null)
            {
                j = i;
                if (relationship.length > 0)
                {
                    int i1 = 0;
                    int k = 0;
                    for (j = 0; j < relationship.length;)
                    {
                        String s = relationship[j];
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
            if (obfuscatedBrokerId != null)
            {
                codedoutputbytebuffernano.writeString(1, obfuscatedBrokerId);
            }
            if (relationship != null && relationship.length > 0)
            {
                for (int i = 0; i < relationship.length; i++)
                {
                    String s = relationship[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(2, s);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public BrokerAndRelationships()
        {
            clear();
        }
    }

    public static final class C2dmRegistrationInfo extends ExtendableMessageNano
    {

        public Long androidId;
        public EntityIdentifier id;
        public Boolean isRegistered;
        public Boolean isRegisteredWithServer;
        public EntityMetadata metadata;
        public String registrationId;
        public String walletPackageName;

        private C2dmRegistrationInfo clear()
        {
            id = null;
            metadata = null;
            registrationId = null;
            isRegistered = null;
            androidId = null;
            walletPackageName = null;
            isRegisteredWithServer = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private C2dmRegistrationInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (id == null)
                    {
                        id = new EntityIdentifier();
                    }
                    codedinputbytebuffernano.readMessage(id);
                    break;

                case 18: // '\022'
                    registrationId = codedinputbytebuffernano.readString();
                    break;

                case 24: // '\030'
                    isRegistered = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 34: // '"'
                    if (metadata == null)
                    {
                        metadata = new EntityMetadata();
                    }
                    codedinputbytebuffernano.readMessage(metadata);
                    break;

                case 40: // '('
                    androidId = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 50: // '2'
                    walletPackageName = codedinputbytebuffernano.readString();
                    break;

                case 56: // '8'
                    isRegisteredWithServer = Boolean.valueOf(codedinputbytebuffernano.readBool());
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
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
            }
            j = i;
            if (registrationId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, registrationId);
            }
            i = j;
            if (isRegistered != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(3, isRegistered.booleanValue());
            }
            j = i;
            if (metadata != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, metadata);
            }
            i = j;
            if (androidId != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(5, androidId.longValue());
            }
            j = i;
            if (walletPackageName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, walletPackageName);
            }
            i = j;
            if (isRegisteredWithServer != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(7, isRegisteredWithServer.booleanValue());
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
            if (id != null)
            {
                codedoutputbytebuffernano.writeMessage(1, id);
            }
            if (registrationId != null)
            {
                codedoutputbytebuffernano.writeString(2, registrationId);
            }
            if (isRegistered != null)
            {
                codedoutputbytebuffernano.writeBool(3, isRegistered.booleanValue());
            }
            if (metadata != null)
            {
                codedoutputbytebuffernano.writeMessage(4, metadata);
            }
            if (androidId != null)
            {
                codedoutputbytebuffernano.writeInt64(5, androidId.longValue());
            }
            if (walletPackageName != null)
            {
                codedoutputbytebuffernano.writeString(6, walletPackageName);
            }
            if (isRegisteredWithServer != null)
            {
                codedoutputbytebuffernano.writeBool(7, isRegisteredWithServer.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public C2dmRegistrationInfo()
        {
            clear();
        }
    }

    public static final class CancelPlasticCardReason extends ExtendableMessageNano
    {

        public String otherExplanation;
        public Integer reason;

        private CancelPlasticCardReason clear()
        {
            reason = null;
            otherExplanation = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CancelPlasticCardReason mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       8: 51
        //                       18: 110;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
                reason = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            otherExplanation = codedinputbytebuffernano.readString();
            if (true) goto _L5; else goto _L6
_L6:
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
            if (otherExplanation != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, otherExplanation);
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
            if (otherExplanation != null)
            {
                codedoutputbytebuffernano.writeString(2, otherExplanation);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CancelPlasticCardReason()
        {
            clear();
        }
    }

    public static final class CashWithdrawalDetails extends ExtendableMessageNano
    {

        public String cashWithdrawalLimitDescription;
        public String googleAtmFeeDescription;

        private CashWithdrawalDetails clear()
        {
            cashWithdrawalLimitDescription = null;
            googleAtmFeeDescription = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CashWithdrawalDetails mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    cashWithdrawalLimitDescription = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    googleAtmFeeDescription = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (cashWithdrawalLimitDescription != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, cashWithdrawalLimitDescription);
            }
            j = i;
            if (googleAtmFeeDescription != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, googleAtmFeeDescription);
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
            if (cashWithdrawalLimitDescription != null)
            {
                codedoutputbytebuffernano.writeString(1, cashWithdrawalLimitDescription);
            }
            if (googleAtmFeeDescription != null)
            {
                codedoutputbytebuffernano.writeString(2, googleAtmFeeDescription);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CashWithdrawalDetails()
        {
            clear();
        }
    }

    public static final class CdpIdData extends ExtendableMessageNano
    {

        private static volatile CdpIdData _emptyArray[];
        public String subId;

        private CdpIdData clear()
        {
            subId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static CdpIdData[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new CdpIdData[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private CdpIdData mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 18: // '\022'
                    subId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (subId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, subId);
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
            if (subId != null)
            {
                codedoutputbytebuffernano.writeString(2, subId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CdpIdData()
        {
            clear();
        }
    }

    public static final class ClientConfiguration extends ExtendableMessageNano
    {

        public NanoWalletAnalytics.AnalyticsInfo analyticsInfo;
        public AppControlEntry appControlEntries[];
        public Boolean enableApplyNow;
        public Boolean enableClientReceiptResolution;
        public Boolean enableCreateGiftCardOnCrossbar;
        public Boolean enableDeveloperBuildDetection;
        public Boolean enableP2P;
        public Boolean enableRootedPhoneDetection;
        public Boolean enableTapAndPayV2;
        public FeatureFlag featureFlags[];
        public Features features;
        public Boolean isDogfood;

        private ClientConfiguration clear()
        {
            featureFlags = FeatureFlag.emptyArray();
            appControlEntries = AppControlEntry.emptyArray();
            features = null;
            analyticsInfo = null;
            enableApplyNow = null;
            enableCreateGiftCardOnCrossbar = null;
            enableRootedPhoneDetection = null;
            enableP2P = null;
            enableClientReceiptResolution = null;
            enableDeveloperBuildDetection = null;
            isDogfood = null;
            enableTapAndPayV2 = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ClientConfiguration mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 16: // '\020'
                    enableApplyNow = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 24: // '\030'
                    enableCreateGiftCardOnCrossbar = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 32: // ' '
                    enableRootedPhoneDetection = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 40: // '('
                    enableP2P = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 48: // '0'
                    enableClientReceiptResolution = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 56: // '8'
                    enableDeveloperBuildDetection = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 64: // '@'
                    isDogfood = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 72: // 'H'
                    enableTapAndPayV2 = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 82: // 'R'
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 82);
                    FeatureFlag afeatureflag[];
                    int j;
                    if (featureFlags == null)
                    {
                        j = 0;
                    } else
                    {
                        j = featureFlags.length;
                    }
                    afeatureflag = new FeatureFlag[j + l];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(featureFlags, 0, afeatureflag, 0, j);
                        l = j;
                    }
                    for (; l < afeatureflag.length - 1; l++)
                    {
                        afeatureflag[l] = new FeatureFlag();
                        codedinputbytebuffernano.readMessage(afeatureflag[l]);
                        codedinputbytebuffernano.readTag();
                    }

                    afeatureflag[l] = new FeatureFlag();
                    codedinputbytebuffernano.readMessage(afeatureflag[l]);
                    featureFlags = afeatureflag;
                    break;

                case 90: // 'Z'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 90);
                    AppControlEntry aappcontrolentry[];
                    int k;
                    if (appControlEntries == null)
                    {
                        k = 0;
                    } else
                    {
                        k = appControlEntries.length;
                    }
                    aappcontrolentry = new AppControlEntry[k + i1];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(appControlEntries, 0, aappcontrolentry, 0, k);
                        i1 = k;
                    }
                    for (; i1 < aappcontrolentry.length - 1; i1++)
                    {
                        aappcontrolentry[i1] = new AppControlEntry();
                        codedinputbytebuffernano.readMessage(aappcontrolentry[i1]);
                        codedinputbytebuffernano.readTag();
                    }

                    aappcontrolentry[i1] = new AppControlEntry();
                    codedinputbytebuffernano.readMessage(aappcontrolentry[i1]);
                    appControlEntries = aappcontrolentry;
                    break;

                case 98: // 'b'
                    if (features == null)
                    {
                        features = new Features();
                    }
                    codedinputbytebuffernano.readMessage(features);
                    break;

                case 106: // 'j'
                    if (analyticsInfo == null)
                    {
                        analyticsInfo = new NanoWalletAnalytics.AnalyticsInfo();
                    }
                    codedinputbytebuffernano.readMessage(analyticsInfo);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (enableApplyNow != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(2, enableApplyNow.booleanValue());
            }
            j = i;
            if (enableCreateGiftCardOnCrossbar != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(3, enableCreateGiftCardOnCrossbar.booleanValue());
            }
            i = j;
            if (enableRootedPhoneDetection != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(4, enableRootedPhoneDetection.booleanValue());
            }
            j = i;
            if (enableP2P != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(5, enableP2P.booleanValue());
            }
            i = j;
            if (enableClientReceiptResolution != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(6, enableClientReceiptResolution.booleanValue());
            }
            j = i;
            if (enableDeveloperBuildDetection != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(7, enableDeveloperBuildDetection.booleanValue());
            }
            i = j;
            if (isDogfood != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(8, isDogfood.booleanValue());
            }
            j = i;
            if (enableTapAndPayV2 != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(9, enableTapAndPayV2.booleanValue());
            }
            i = j;
            if (featureFlags != null)
            {
                i = j;
                if (featureFlags.length > 0)
                {
                    int k = 0;
                    do
                    {
                        i = j;
                        if (k >= featureFlags.length)
                        {
                            break;
                        }
                        FeatureFlag featureflag = featureFlags[k];
                        i = j;
                        if (featureflag != null)
                        {
                            i = j + CodedOutputByteBufferNano.computeMessageSize(10, featureflag);
                        }
                        k++;
                        j = i;
                    } while (true);
                }
            }
            j = i;
            if (appControlEntries != null)
            {
                j = i;
                if (appControlEntries.length > 0)
                {
                    int l = 0;
                    do
                    {
                        j = i;
                        if (l >= appControlEntries.length)
                        {
                            break;
                        }
                        AppControlEntry appcontrolentry = appControlEntries[l];
                        j = i;
                        if (appcontrolentry != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(11, appcontrolentry);
                        }
                        l++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (features != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(12, features);
            }
            j = i;
            if (analyticsInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(13, analyticsInfo);
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
            if (enableApplyNow != null)
            {
                codedoutputbytebuffernano.writeBool(2, enableApplyNow.booleanValue());
            }
            if (enableCreateGiftCardOnCrossbar != null)
            {
                codedoutputbytebuffernano.writeBool(3, enableCreateGiftCardOnCrossbar.booleanValue());
            }
            if (enableRootedPhoneDetection != null)
            {
                codedoutputbytebuffernano.writeBool(4, enableRootedPhoneDetection.booleanValue());
            }
            if (enableP2P != null)
            {
                codedoutputbytebuffernano.writeBool(5, enableP2P.booleanValue());
            }
            if (enableClientReceiptResolution != null)
            {
                codedoutputbytebuffernano.writeBool(6, enableClientReceiptResolution.booleanValue());
            }
            if (enableDeveloperBuildDetection != null)
            {
                codedoutputbytebuffernano.writeBool(7, enableDeveloperBuildDetection.booleanValue());
            }
            if (isDogfood != null)
            {
                codedoutputbytebuffernano.writeBool(8, isDogfood.booleanValue());
            }
            if (enableTapAndPayV2 != null)
            {
                codedoutputbytebuffernano.writeBool(9, enableTapAndPayV2.booleanValue());
            }
            if (featureFlags != null && featureFlags.length > 0)
            {
                for (int i = 0; i < featureFlags.length; i++)
                {
                    FeatureFlag featureflag = featureFlags[i];
                    if (featureflag != null)
                    {
                        codedoutputbytebuffernano.writeMessage(10, featureflag);
                    }
                }

            }
            if (appControlEntries != null && appControlEntries.length > 0)
            {
                for (int j = 0; j < appControlEntries.length; j++)
                {
                    AppControlEntry appcontrolentry = appControlEntries[j];
                    if (appcontrolentry != null)
                    {
                        codedoutputbytebuffernano.writeMessage(11, appcontrolentry);
                    }
                }

            }
            if (features != null)
            {
                codedoutputbytebuffernano.writeMessage(12, features);
            }
            if (analyticsInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(13, analyticsInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientConfiguration()
        {
            clear();
        }
    }

    public static final class ClientConfiguration.AppControlEntry extends ExtendableMessageNano
    {

        private static volatile ClientConfiguration.AppControlEntry _emptyArray[];
        public String key;
        public String value;

        private ClientConfiguration.AppControlEntry clear()
        {
            key = null;
            value = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static ClientConfiguration.AppControlEntry[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new ClientConfiguration.AppControlEntry[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private ClientConfiguration.AppControlEntry mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    key = codedinputbytebuffernano.readString();
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
            if (key != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, key);
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
            if (key != null)
            {
                codedoutputbytebuffernano.writeString(1, key);
            }
            if (value != null)
            {
                codedoutputbytebuffernano.writeString(2, value);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientConfiguration.AppControlEntry()
        {
            clear();
        }
    }

    public static final class ClientConfiguration.FeatureFlag extends ExtendableMessageNano
    {

        private static volatile ClientConfiguration.FeatureFlag _emptyArray[];
        public String flagName;
        public Boolean flagValue;

        private ClientConfiguration.FeatureFlag clear()
        {
            flagName = null;
            flagValue = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static ClientConfiguration.FeatureFlag[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new ClientConfiguration.FeatureFlag[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private ClientConfiguration.FeatureFlag mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    flagName = codedinputbytebuffernano.readString();
                    break;

                case 16: // '\020'
                    flagValue = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (flagName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, flagName);
            }
            j = i;
            if (flagValue != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(2, flagValue.booleanValue());
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
            if (flagName != null)
            {
                codedoutputbytebuffernano.writeString(1, flagName);
            }
            if (flagValue != null)
            {
                codedoutputbytebuffernano.writeBool(2, flagValue.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientConfiguration.FeatureFlag()
        {
            clear();
        }
    }

    public static final class ClientPreferences extends ExtendableMessageNano
    {

        public Boolean emailOptIn;

        private ClientPreferences clear()
        {
            emailOptIn = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ClientPreferences mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    emailOptIn = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (emailOptIn != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(1, emailOptIn.booleanValue());
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
            if (emailOptIn != null)
            {
                codedoutputbytebuffernano.writeBool(1, emailOptIn.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientPreferences()
        {
            clear();
        }
    }

    public static final class Credential extends ExtendableMessageNano
    {

        private static volatile Credential _emptyArray[];
        public Address billingAddress;
        public int cardColor[];
        public String cardFrontImageUrl;
        public String cardNumberLast4;
        public CdpIdData cdpInstrumentId;
        public Integer cloudSyncState;
        public Long creationTime;
        public CredentialTemplate credentialTemplate;
        public EntityIdentifier credentialTemplateId;
        public EncryptedInboundCardData encryptedInboundCardData;
        public String expirationMonth;
        public String expirationYear;
        public EntityIdentifier id;
        public Integer invalidFundingSourceReason;
        public Boolean isExpired;
        public EntityMetadata metadata;
        public String nameOnCard;
        public Integer network;
        public String nickname;
        public String paymentsSdkInstrumentId;
        public RestrictedInstrumentUse restrictedUses[];
        public Integer status;
        public Integer type;

        private Credential clear()
        {
            id = null;
            metadata = null;
            nickname = null;
            expirationMonth = null;
            expirationYear = null;
            nameOnCard = null;
            billingAddress = null;
            credentialTemplateId = null;
            credentialTemplate = null;
            creationTime = null;
            cardFrontImageUrl = null;
            cardNumberLast4 = null;
            encryptedInboundCardData = null;
            cloudSyncState = null;
            cdpInstrumentId = null;
            network = null;
            cardColor = WireFormatNano.EMPTY_INT_ARRAY;
            status = null;
            isExpired = null;
            invalidFundingSourceReason = null;
            restrictedUses = RestrictedInstrumentUse.emptyArray();
            paymentsSdkInstrumentId = null;
            type = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static Credential[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Credential[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private Credential mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L27:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 25: default 216
        //                       0: 225
        //                       10: 227
        //                       18: 256
        //                       34: 267
        //                       42: 278
        //                       58: 289
        //                       66: 300
        //                       74: 329
        //                       80: 358
        //                       98: 372
        //                       106: 383
        //                       114: 394
        //                       122: 423
        //                       130: 452
        //                       136: 481
        //                       146: 530
        //                       152: 559
        //                       160: 606
        //                       162: 708
        //                       168: 836
        //                       176: 890
        //                       184: 904
        //                       194: 970
        //                       202: 1095
        //                       208: 1106;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L27; else goto _L2
_L2:
            return this;
_L3:
            if (id == null)
            {
                id = new EntityIdentifier();
            }
            codedinputbytebuffernano.readMessage(id);
              goto _L27
_L4:
            nickname = codedinputbytebuffernano.readString();
              goto _L27
_L5:
            expirationMonth = codedinputbytebuffernano.readString();
              goto _L27
_L6:
            expirationYear = codedinputbytebuffernano.readString();
              goto _L27
_L7:
            nameOnCard = codedinputbytebuffernano.readString();
              goto _L27
_L8:
            if (billingAddress == null)
            {
                billingAddress = new Address();
            }
            codedinputbytebuffernano.readMessage(billingAddress);
              goto _L27
_L9:
            if (credentialTemplateId == null)
            {
                credentialTemplateId = new EntityIdentifier();
            }
            codedinputbytebuffernano.readMessage(credentialTemplateId);
              goto _L27
_L10:
            creationTime = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L27
_L11:
            cardFrontImageUrl = codedinputbytebuffernano.readString();
              goto _L27
_L12:
            cardNumberLast4 = codedinputbytebuffernano.readString();
              goto _L27
_L13:
            if (metadata == null)
            {
                metadata = new EntityMetadata();
            }
            codedinputbytebuffernano.readMessage(metadata);
              goto _L27
_L14:
            if (encryptedInboundCardData == null)
            {
                encryptedInboundCardData = new EncryptedInboundCardData();
            }
            codedinputbytebuffernano.readMessage(encryptedInboundCardData);
              goto _L27
_L15:
            if (cdpInstrumentId == null)
            {
                cdpInstrumentId = new CdpIdData();
            }
            codedinputbytebuffernano.readMessage(cdpInstrumentId);
              goto _L27
_L16:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                network = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L17:
            if (credentialTemplate == null)
            {
                credentialTemplate = new CredentialTemplate();
            }
            codedinputbytebuffernano.readMessage(credentialTemplate);
            continue; /* Loop/switch isn't completed */
_L18:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                cloudSyncState = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L19:
            int j2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 160);
            int ai[];
            int l;
            if (cardColor == null)
            {
                l = 0;
            } else
            {
                l = cardColor.length;
            }
            ai = new int[l + j2];
            j2 = l;
            if (l != 0)
            {
                System.arraycopy(cardColor, 0, ai, 0, l);
                j2 = l;
            }
            for (; j2 < ai.length - 1; j2++)
            {
                ai[j2] = codedinputbytebuffernano.readInt32();
                codedinputbytebuffernano.readTag();
            }

            ai[j2] = codedinputbytebuffernano.readInt32();
            cardColor = ai;
            continue; /* Loop/switch isn't completed */
_L20:
            int i3 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
            int k2 = 0;
            int i1 = codedinputbytebuffernano.getPosition();
            while (codedinputbytebuffernano.getBytesUntilLimit() > 0) 
            {
                codedinputbytebuffernano.readInt32();
                k2++;
            }
            codedinputbytebuffernano.rewindToPosition(i1);
            int ai1[];
            if (cardColor == null)
            {
                i1 = 0;
            } else
            {
                i1 = cardColor.length;
            }
            ai1 = new int[i1 + k2];
            k2 = i1;
            if (i1 != 0)
            {
                System.arraycopy(cardColor, 0, ai1, 0, i1);
                k2 = i1;
            }
            for (; k2 < ai1.length; k2++)
            {
                ai1[k2] = codedinputbytebuffernano.readInt32();
            }

            cardColor = ai1;
            codedinputbytebuffernano.popLimit(i3);
            continue; /* Loop/switch isn't completed */
_L21:
            int j1 = codedinputbytebuffernano.readInt32();
            switch (j1)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                status = Integer.valueOf(j1);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L22:
            isExpired = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L23:
            int k1 = codedinputbytebuffernano.readInt32();
            switch (k1)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                invalidFundingSourceReason = Integer.valueOf(k1);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L24:
            int l2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 194);
            RestrictedInstrumentUse arestrictedinstrumentuse[];
            int l1;
            if (restrictedUses == null)
            {
                l1 = 0;
            } else
            {
                l1 = restrictedUses.length;
            }
            arestrictedinstrumentuse = new RestrictedInstrumentUse[l1 + l2];
            l2 = l1;
            if (l1 != 0)
            {
                System.arraycopy(restrictedUses, 0, arestrictedinstrumentuse, 0, l1);
                l2 = l1;
            }
            for (; l2 < arestrictedinstrumentuse.length - 1; l2++)
            {
                arestrictedinstrumentuse[l2] = new RestrictedInstrumentUse();
                codedinputbytebuffernano.readMessage(arestrictedinstrumentuse[l2]);
                codedinputbytebuffernano.readTag();
            }

            arestrictedinstrumentuse[l2] = new RestrictedInstrumentUse();
            codedinputbytebuffernano.readMessage(arestrictedinstrumentuse[l2]);
            restrictedUses = arestrictedinstrumentuse;
            continue; /* Loop/switch isn't completed */
_L25:
            paymentsSdkInstrumentId = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L26:
            int i2 = codedinputbytebuffernano.readInt32();
            switch (i2)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                type = Integer.valueOf(i2);
                break;
            }
            if (true) goto _L27; else goto _L28
_L28:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (id != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
            }
            j = i;
            if (nickname != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, nickname);
            }
            i = j;
            if (expirationMonth != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(4, expirationMonth);
            }
            j = i;
            if (expirationYear != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(5, expirationYear);
            }
            i = j;
            if (nameOnCard != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(7, nameOnCard);
            }
            j = i;
            if (billingAddress != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(8, billingAddress);
            }
            i = j;
            if (credentialTemplateId != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(9, credentialTemplateId);
            }
            j = i;
            if (creationTime != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(10, creationTime.longValue());
            }
            i = j;
            if (cardFrontImageUrl != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(12, cardFrontImageUrl);
            }
            j = i;
            if (cardNumberLast4 != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(13, cardNumberLast4);
            }
            i = j;
            if (metadata != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(14, metadata);
            }
            j = i;
            if (encryptedInboundCardData != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(15, encryptedInboundCardData);
            }
            i = j;
            if (cdpInstrumentId != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(16, cdpInstrumentId);
            }
            j = i;
            if (network != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(17, network.intValue());
            }
            int k = j;
            if (credentialTemplate != null)
            {
                k = j + CodedOutputByteBufferNano.computeMessageSize(18, credentialTemplate);
            }
            i = k;
            if (cloudSyncState != null)
            {
                i = k + CodedOutputByteBufferNano.computeInt32Size(19, cloudSyncState.intValue());
            }
            j = i;
            if (cardColor != null)
            {
                j = i;
                if (cardColor.length > 0)
                {
                    int l = 0;
                    for (j = 0; j < cardColor.length; j++)
                    {
                        l += CodedOutputByteBufferNano.computeInt32SizeNoTag(cardColor[j]);
                    }

                    j = i + l + cardColor.length * 2;
                }
            }
            i = j;
            if (status != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(21, status.intValue());
            }
            j = i;
            if (isExpired != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(22, isExpired.booleanValue());
            }
            i = j;
            if (invalidFundingSourceReason != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(23, invalidFundingSourceReason.intValue());
            }
            j = i;
            if (restrictedUses != null)
            {
                j = i;
                if (restrictedUses.length > 0)
                {
                    int i1 = 0;
                    do
                    {
                        j = i;
                        if (i1 >= restrictedUses.length)
                        {
                            break;
                        }
                        RestrictedInstrumentUse restrictedinstrumentuse = restrictedUses[i1];
                        j = i;
                        if (restrictedinstrumentuse != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(24, restrictedinstrumentuse);
                        }
                        i1++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (paymentsSdkInstrumentId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(25, paymentsSdkInstrumentId);
            }
            j = i;
            if (type != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(26, type.intValue());
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
                codedoutputbytebuffernano.writeMessage(1, id);
            }
            if (nickname != null)
            {
                codedoutputbytebuffernano.writeString(2, nickname);
            }
            if (expirationMonth != null)
            {
                codedoutputbytebuffernano.writeString(4, expirationMonth);
            }
            if (expirationYear != null)
            {
                codedoutputbytebuffernano.writeString(5, expirationYear);
            }
            if (nameOnCard != null)
            {
                codedoutputbytebuffernano.writeString(7, nameOnCard);
            }
            if (billingAddress != null)
            {
                codedoutputbytebuffernano.writeMessage(8, billingAddress);
            }
            if (credentialTemplateId != null)
            {
                codedoutputbytebuffernano.writeMessage(9, credentialTemplateId);
            }
            if (creationTime != null)
            {
                codedoutputbytebuffernano.writeInt64(10, creationTime.longValue());
            }
            if (cardFrontImageUrl != null)
            {
                codedoutputbytebuffernano.writeString(12, cardFrontImageUrl);
            }
            if (cardNumberLast4 != null)
            {
                codedoutputbytebuffernano.writeString(13, cardNumberLast4);
            }
            if (metadata != null)
            {
                codedoutputbytebuffernano.writeMessage(14, metadata);
            }
            if (encryptedInboundCardData != null)
            {
                codedoutputbytebuffernano.writeMessage(15, encryptedInboundCardData);
            }
            if (cdpInstrumentId != null)
            {
                codedoutputbytebuffernano.writeMessage(16, cdpInstrumentId);
            }
            if (network != null)
            {
                codedoutputbytebuffernano.writeInt32(17, network.intValue());
            }
            if (credentialTemplate != null)
            {
                codedoutputbytebuffernano.writeMessage(18, credentialTemplate);
            }
            if (cloudSyncState != null)
            {
                codedoutputbytebuffernano.writeInt32(19, cloudSyncState.intValue());
            }
            if (cardColor != null && cardColor.length > 0)
            {
                for (int i = 0; i < cardColor.length; i++)
                {
                    codedoutputbytebuffernano.writeInt32(20, cardColor[i]);
                }

            }
            if (status != null)
            {
                codedoutputbytebuffernano.writeInt32(21, status.intValue());
            }
            if (isExpired != null)
            {
                codedoutputbytebuffernano.writeBool(22, isExpired.booleanValue());
            }
            if (invalidFundingSourceReason != null)
            {
                codedoutputbytebuffernano.writeInt32(23, invalidFundingSourceReason.intValue());
            }
            if (restrictedUses != null && restrictedUses.length > 0)
            {
                for (int j = 0; j < restrictedUses.length; j++)
                {
                    RestrictedInstrumentUse restrictedinstrumentuse = restrictedUses[j];
                    if (restrictedinstrumentuse != null)
                    {
                        codedoutputbytebuffernano.writeMessage(24, restrictedinstrumentuse);
                    }
                }

            }
            if (paymentsSdkInstrumentId != null)
            {
                codedoutputbytebuffernano.writeString(25, paymentsSdkInstrumentId);
            }
            if (type != null)
            {
                codedoutputbytebuffernano.writeInt32(26, type.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Credential()
        {
            clear();
        }
    }

    public static final class Credential.EncryptedInboundCardData extends ExtendableMessageNano
    {

        public String billingPublicKeyEncryptedSessionMaterial;
        public String encryptedCardNumber;
        public String encryptedCvc;

        private Credential.EncryptedInboundCardData clear()
        {
            billingPublicKeyEncryptedSessionMaterial = null;
            encryptedCardNumber = null;
            encryptedCvc = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Credential.EncryptedInboundCardData mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    encryptedCardNumber = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    encryptedCvc = codedinputbytebuffernano.readString();
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
            if (encryptedCardNumber != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, encryptedCardNumber);
            }
            i = j;
            if (encryptedCvc != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, encryptedCvc);
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
            if (billingPublicKeyEncryptedSessionMaterial != null)
            {
                codedoutputbytebuffernano.writeString(1, billingPublicKeyEncryptedSessionMaterial);
            }
            if (encryptedCardNumber != null)
            {
                codedoutputbytebuffernano.writeString(2, encryptedCardNumber);
            }
            if (encryptedCvc != null)
            {
                codedoutputbytebuffernano.writeString(3, encryptedCvc);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Credential.EncryptedInboundCardData()
        {
            clear();
        }
    }

    public static final class CredentialTemplate extends ExtendableMessageNano
    {

        public Boolean activationRequired;
        public String alternatePhoneNumber;
        public Integer bankApiType;
        public String bankApiUrl;
        public String bankName;
        public String bankWebsite;
        public BinRange binRange[];
        public Long creationTime;
        public Integer credentialType;
        public String frontImage;
        public EntityIdentifier id;
        public AuthenticationQuestion kycQuestions[];
        public Integer network;
        public String partnerId;
        public String productName;
        public Integer provisioningType;
        public AuthenticationQuestion removeRestrictionQuestions[];
        public String restrictionMessage;
        public Boolean tapAndPayEligible;
        public String tollFreePhoneNumber;

        private CredentialTemplate clear()
        {
            id = null;
            bankName = null;
            tollFreePhoneNumber = null;
            alternatePhoneNumber = null;
            bankWebsite = null;
            frontImage = null;
            credentialType = null;
            network = null;
            productName = null;
            bankApiType = null;
            bankApiUrl = null;
            partnerId = null;
            tapAndPayEligible = null;
            provisioningType = null;
            activationRequired = null;
            kycQuestions = AuthenticationQuestion.emptyArray();
            removeRestrictionQuestions = AuthenticationQuestion.emptyArray();
            restrictionMessage = null;
            creationTime = null;
            binRange = BinRange.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CredentialTemplate mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L23:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 21: default 184
        //                       0: 193
        //                       10: 195
        //                       18: 224
        //                       26: 235
        //                       34: 246
        //                       42: 257
        //                       50: 268
        //                       56: 279
        //                       64: 334
        //                       74: 386
        //                       80: 397
        //                       88: 446
        //                       98: 460
        //                       106: 584
        //                       114: 708
        //                       120: 719
        //                       130: 733
        //                       138: 858
        //                       144: 869
        //                       152: 883
        //                       162: 926;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L23; else goto _L2
_L2:
            return this;
_L3:
            if (id == null)
            {
                id = new EntityIdentifier();
            }
            codedinputbytebuffernano.readMessage(id);
              goto _L23
_L4:
            bankName = codedinputbytebuffernano.readString();
              goto _L23
_L5:
            tollFreePhoneNumber = codedinputbytebuffernano.readString();
              goto _L23
_L6:
            alternatePhoneNumber = codedinputbytebuffernano.readString();
              goto _L23
_L7:
            bankWebsite = codedinputbytebuffernano.readString();
              goto _L23
_L8:
            frontImage = codedinputbytebuffernano.readString();
              goto _L23
_L9:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                credentialType = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L10:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                network = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L11:
            productName = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L12:
            int l = codedinputbytebuffernano.readInt32();
            switch (l)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                bankApiType = Integer.valueOf(l);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L13:
            tapAndPayEligible = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L14:
            int i2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 98);
            AuthenticationQuestion aauthenticationquestion[];
            int i1;
            if (kycQuestions == null)
            {
                i1 = 0;
            } else
            {
                i1 = kycQuestions.length;
            }
            aauthenticationquestion = new AuthenticationQuestion[i1 + i2];
            i2 = i1;
            if (i1 != 0)
            {
                System.arraycopy(kycQuestions, 0, aauthenticationquestion, 0, i1);
                i2 = i1;
            }
            for (; i2 < aauthenticationquestion.length - 1; i2++)
            {
                aauthenticationquestion[i2] = new AuthenticationQuestion();
                codedinputbytebuffernano.readMessage(aauthenticationquestion[i2]);
                codedinputbytebuffernano.readTag();
            }

            aauthenticationquestion[i2] = new AuthenticationQuestion();
            codedinputbytebuffernano.readMessage(aauthenticationquestion[i2]);
            kycQuestions = aauthenticationquestion;
            continue; /* Loop/switch isn't completed */
_L15:
            int j2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 106);
            AuthenticationQuestion aauthenticationquestion1[];
            int j1;
            if (removeRestrictionQuestions == null)
            {
                j1 = 0;
            } else
            {
                j1 = removeRestrictionQuestions.length;
            }
            aauthenticationquestion1 = new AuthenticationQuestion[j1 + j2];
            j2 = j1;
            if (j1 != 0)
            {
                System.arraycopy(removeRestrictionQuestions, 0, aauthenticationquestion1, 0, j1);
                j2 = j1;
            }
            for (; j2 < aauthenticationquestion1.length - 1; j2++)
            {
                aauthenticationquestion1[j2] = new AuthenticationQuestion();
                codedinputbytebuffernano.readMessage(aauthenticationquestion1[j2]);
                codedinputbytebuffernano.readTag();
            }

            aauthenticationquestion1[j2] = new AuthenticationQuestion();
            codedinputbytebuffernano.readMessage(aauthenticationquestion1[j2]);
            removeRestrictionQuestions = aauthenticationquestion1;
            continue; /* Loop/switch isn't completed */
_L16:
            restrictionMessage = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L17:
            creationTime = Long.valueOf(codedinputbytebuffernano.readInt64());
            continue; /* Loop/switch isn't completed */
_L18:
            int k2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 130);
            BinRange abinrange[];
            int k1;
            if (binRange == null)
            {
                k1 = 0;
            } else
            {
                k1 = binRange.length;
            }
            abinrange = new BinRange[k1 + k2];
            k2 = k1;
            if (k1 != 0)
            {
                System.arraycopy(binRange, 0, abinrange, 0, k1);
                k2 = k1;
            }
            for (; k2 < abinrange.length - 1; k2++)
            {
                abinrange[k2] = new BinRange();
                codedinputbytebuffernano.readMessage(abinrange[k2]);
                codedinputbytebuffernano.readTag();
            }

            abinrange[k2] = new BinRange();
            codedinputbytebuffernano.readMessage(abinrange[k2]);
            binRange = abinrange;
            continue; /* Loop/switch isn't completed */
_L19:
            bankApiUrl = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L20:
            activationRequired = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L21:
            int l1 = codedinputbytebuffernano.readInt32();
            switch (l1)
            {
            case 1: // '\001'
            case 2: // '\002'
                provisioningType = Integer.valueOf(l1);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L22:
            partnerId = codedinputbytebuffernano.readString();
            if (true) goto _L23; else goto _L24
_L24:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (id != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
            }
            j = i;
            if (bankName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, bankName);
            }
            i = j;
            if (tollFreePhoneNumber != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, tollFreePhoneNumber);
            }
            j = i;
            if (alternatePhoneNumber != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, alternatePhoneNumber);
            }
            i = j;
            if (bankWebsite != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, bankWebsite);
            }
            j = i;
            if (frontImage != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, frontImage);
            }
            i = j;
            if (credentialType != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(7, credentialType.intValue());
            }
            j = i;
            if (network != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(8, network.intValue());
            }
            i = j;
            if (productName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(9, productName);
            }
            int k = i;
            if (bankApiType != null)
            {
                k = i + CodedOutputByteBufferNano.computeInt32Size(10, bankApiType.intValue());
            }
            j = k;
            if (tapAndPayEligible != null)
            {
                j = k + CodedOutputByteBufferNano.computeBoolSize(11, tapAndPayEligible.booleanValue());
            }
            i = j;
            if (kycQuestions != null)
            {
                i = j;
                if (kycQuestions.length > 0)
                {
                    k = 0;
                    do
                    {
                        i = j;
                        if (k >= kycQuestions.length)
                        {
                            break;
                        }
                        AuthenticationQuestion authenticationquestion = kycQuestions[k];
                        i = j;
                        if (authenticationquestion != null)
                        {
                            i = j + CodedOutputByteBufferNano.computeMessageSize(12, authenticationquestion);
                        }
                        k++;
                        j = i;
                    } while (true);
                }
            }
            j = i;
            if (removeRestrictionQuestions != null)
            {
                j = i;
                if (removeRestrictionQuestions.length > 0)
                {
                    k = 0;
                    do
                    {
                        j = i;
                        if (k >= removeRestrictionQuestions.length)
                        {
                            break;
                        }
                        AuthenticationQuestion authenticationquestion1 = removeRestrictionQuestions[k];
                        j = i;
                        if (authenticationquestion1 != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(13, authenticationquestion1);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            k = j;
            if (restrictionMessage != null)
            {
                k = j + CodedOutputByteBufferNano.computeStringSize(14, restrictionMessage);
            }
            i = k;
            if (creationTime != null)
            {
                i = k + CodedOutputByteBufferNano.computeInt64Size(15, creationTime.longValue());
            }
            j = i;
            if (binRange != null)
            {
                j = i;
                if (binRange.length > 0)
                {
                    int l = 0;
                    do
                    {
                        j = i;
                        if (l >= binRange.length)
                        {
                            break;
                        }
                        BinRange binrange = binRange[l];
                        j = i;
                        if (binrange != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(16, binrange);
                        }
                        l++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (bankApiUrl != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(17, bankApiUrl);
            }
            j = i;
            if (activationRequired != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(18, activationRequired.booleanValue());
            }
            i = j;
            if (provisioningType != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(19, provisioningType.intValue());
            }
            j = i;
            if (partnerId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(20, partnerId);
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
                codedoutputbytebuffernano.writeMessage(1, id);
            }
            if (bankName != null)
            {
                codedoutputbytebuffernano.writeString(2, bankName);
            }
            if (tollFreePhoneNumber != null)
            {
                codedoutputbytebuffernano.writeString(3, tollFreePhoneNumber);
            }
            if (alternatePhoneNumber != null)
            {
                codedoutputbytebuffernano.writeString(4, alternatePhoneNumber);
            }
            if (bankWebsite != null)
            {
                codedoutputbytebuffernano.writeString(5, bankWebsite);
            }
            if (frontImage != null)
            {
                codedoutputbytebuffernano.writeString(6, frontImage);
            }
            if (credentialType != null)
            {
                codedoutputbytebuffernano.writeInt32(7, credentialType.intValue());
            }
            if (network != null)
            {
                codedoutputbytebuffernano.writeInt32(8, network.intValue());
            }
            if (productName != null)
            {
                codedoutputbytebuffernano.writeString(9, productName);
            }
            if (bankApiType != null)
            {
                codedoutputbytebuffernano.writeInt32(10, bankApiType.intValue());
            }
            if (tapAndPayEligible != null)
            {
                codedoutputbytebuffernano.writeBool(11, tapAndPayEligible.booleanValue());
            }
            if (kycQuestions != null && kycQuestions.length > 0)
            {
                for (int i = 0; i < kycQuestions.length; i++)
                {
                    AuthenticationQuestion authenticationquestion = kycQuestions[i];
                    if (authenticationquestion != null)
                    {
                        codedoutputbytebuffernano.writeMessage(12, authenticationquestion);
                    }
                }

            }
            if (removeRestrictionQuestions != null && removeRestrictionQuestions.length > 0)
            {
                for (int j = 0; j < removeRestrictionQuestions.length; j++)
                {
                    AuthenticationQuestion authenticationquestion1 = removeRestrictionQuestions[j];
                    if (authenticationquestion1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(13, authenticationquestion1);
                    }
                }

            }
            if (restrictionMessage != null)
            {
                codedoutputbytebuffernano.writeString(14, restrictionMessage);
            }
            if (creationTime != null)
            {
                codedoutputbytebuffernano.writeInt64(15, creationTime.longValue());
            }
            if (binRange != null && binRange.length > 0)
            {
                for (int k = 0; k < binRange.length; k++)
                {
                    BinRange binrange = binRange[k];
                    if (binrange != null)
                    {
                        codedoutputbytebuffernano.writeMessage(16, binrange);
                    }
                }

            }
            if (bankApiUrl != null)
            {
                codedoutputbytebuffernano.writeString(17, bankApiUrl);
            }
            if (activationRequired != null)
            {
                codedoutputbytebuffernano.writeBool(18, activationRequired.booleanValue());
            }
            if (provisioningType != null)
            {
                codedoutputbytebuffernano.writeInt32(19, provisioningType.intValue());
            }
            if (partnerId != null)
            {
                codedoutputbytebuffernano.writeString(20, partnerId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CredentialTemplate()
        {
            clear();
        }
    }

    public static final class CredentialTemplate.BinRange extends ExtendableMessageNano
    {

        private static volatile CredentialTemplate.BinRange _emptyArray[];
        public Long rangeMax;
        public Long rangeMin;

        private CredentialTemplate.BinRange clear()
        {
            rangeMin = null;
            rangeMax = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static CredentialTemplate.BinRange[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new CredentialTemplate.BinRange[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private CredentialTemplate.BinRange mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    rangeMin = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 16: // '\020'
                    rangeMax = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (rangeMin != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, rangeMin.longValue());
            }
            j = i;
            if (rangeMax != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, rangeMax.longValue());
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
            if (rangeMin != null)
            {
                codedoutputbytebuffernano.writeInt64(1, rangeMin.longValue());
            }
            if (rangeMax != null)
            {
                codedoutputbytebuffernano.writeInt64(2, rangeMax.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CredentialTemplate.BinRange()
        {
            clear();
        }
    }

    public static final class DateAndTime extends ExtendableMessageNano
    {

        public Integer day;
        public Integer month;
        public Integer year;

        private DateAndTime clear()
        {
            year = null;
            day = null;
            month = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DateAndTime mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    year = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 16: // '\020'
                    day = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 24: // '\030'
                    month = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (year != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, year.intValue());
            }
            j = i;
            if (day != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, day.intValue());
            }
            i = j;
            if (month != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, month.intValue());
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
            if (year != null)
            {
                codedoutputbytebuffernano.writeInt32(1, year.intValue());
            }
            if (day != null)
            {
                codedoutputbytebuffernano.writeInt32(2, day.intValue());
            }
            if (month != null)
            {
                codedoutputbytebuffernano.writeInt32(3, month.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DateAndTime()
        {
            clear();
        }
    }

    public static final class DisplayOnlyAddress extends ExtendableMessageNano
    {

        public String addressLine[];
        public PhysicalLocation physicalLocation;

        private DisplayOnlyAddress clear()
        {
            addressLine = WireFormatNano.EMPTY_STRING_ARRAY;
            physicalLocation = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DisplayOnlyAddress mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    String as[];
                    int j;
                    if (addressLine == null)
                    {
                        j = 0;
                    } else
                    {
                        j = addressLine.length;
                    }
                    as = new String[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(addressLine, 0, as, 0, j);
                        k = j;
                    }
                    for (; k < as.length - 1; k++)
                    {
                        as[k] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[k] = codedinputbytebuffernano.readString();
                    addressLine = as;
                    break;

                case 18: // '\022'
                    if (physicalLocation == null)
                    {
                        physicalLocation = new PhysicalLocation();
                    }
                    codedinputbytebuffernano.readMessage(physicalLocation);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int k1 = super.computeSerializedSize();
            int i = k1;
            if (addressLine != null)
            {
                i = k1;
                if (addressLine.length > 0)
                {
                    int i1 = 0;
                    int j = 0;
                    for (i = 0; i < addressLine.length;)
                    {
                        String s = addressLine[i];
                        int j1 = i1;
                        int l = j;
                        if (s != null)
                        {
                            j1 = i1 + 1;
                            l = j + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        i++;
                        i1 = j1;
                        j = l;
                    }

                    i = k1 + j + i1 * 1;
                }
            }
            int k = i;
            if (physicalLocation != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(2, physicalLocation);
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
            if (addressLine != null && addressLine.length > 0)
            {
                for (int i = 0; i < addressLine.length; i++)
                {
                    String s = addressLine[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(1, s);
                    }
                }

            }
            if (physicalLocation != null)
            {
                codedoutputbytebuffernano.writeMessage(2, physicalLocation);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DisplayOnlyAddress()
        {
            clear();
        }
    }

    public static final class DisplayableDuration extends ExtendableMessageNano
    {

        public String displayDuration;
        public Long durationMillis;

        private DisplayableDuration clear()
        {
            durationMillis = null;
            displayDuration = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DisplayableDuration mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    durationMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 18: // '\022'
                    displayDuration = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (durationMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, durationMillis.longValue());
            }
            j = i;
            if (displayDuration != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, displayDuration);
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
            if (durationMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(1, durationMillis.longValue());
            }
            if (displayDuration != null)
            {
                codedoutputbytebuffernano.writeString(2, displayDuration);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DisplayableDuration()
        {
            clear();
        }
    }

    public static final class DisplayableFee extends ExtendableMessageNano
    {

        public DisplayableMoney base;
        public DisplayableMoney minimum;
        public DisplayableRate rate;

        private DisplayableFee clear()
        {
            base = null;
            rate = null;
            minimum = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DisplayableFee mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (base == null)
                    {
                        base = new DisplayableMoney();
                    }
                    codedinputbytebuffernano.readMessage(base);
                    break;

                case 18: // '\022'
                    if (rate == null)
                    {
                        rate = new DisplayableRate();
                    }
                    codedinputbytebuffernano.readMessage(rate);
                    break;

                case 26: // '\032'
                    if (minimum == null)
                    {
                        minimum = new DisplayableMoney();
                    }
                    codedinputbytebuffernano.readMessage(minimum);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (base != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, base);
            }
            j = i;
            if (rate != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, rate);
            }
            i = j;
            if (minimum != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, minimum);
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
            if (base != null)
            {
                codedoutputbytebuffernano.writeMessage(1, base);
            }
            if (rate != null)
            {
                codedoutputbytebuffernano.writeMessage(2, rate);
            }
            if (minimum != null)
            {
                codedoutputbytebuffernano.writeMessage(3, minimum);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DisplayableFee()
        {
            clear();
        }
    }

    public static final class DisplayableMoney extends ExtendableMessageNano
    {

        public MoneyProto amount;
        public String displayAmount;

        private DisplayableMoney clear()
        {
            amount = null;
            displayAmount = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DisplayableMoney mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (amount == null)
                    {
                        amount = new MoneyProto();
                    }
                    codedinputbytebuffernano.readMessage(amount);
                    break;

                case 18: // '\022'
                    displayAmount = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (amount != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, amount);
            }
            j = i;
            if (displayAmount != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, displayAmount);
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
            if (amount != null)
            {
                codedoutputbytebuffernano.writeMessage(1, amount);
            }
            if (displayAmount != null)
            {
                codedoutputbytebuffernano.writeString(2, displayAmount);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DisplayableMoney()
        {
            clear();
        }
    }

    public static final class DisplayableP2pCommercialUses extends ExtendableMessageNano
    {

        public DisplayableP2pCommercialUse displaybleP2PCommercialUses[];

        private DisplayableP2pCommercialUses clear()
        {
            displaybleP2PCommercialUses = DisplayableP2pCommercialUse.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DisplayableP2pCommercialUses mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    DisplayableP2pCommercialUse adisplayablep2pcommercialuse[];
                    int j;
                    if (displaybleP2PCommercialUses == null)
                    {
                        j = 0;
                    } else
                    {
                        j = displaybleP2PCommercialUses.length;
                    }
                    adisplayablep2pcommercialuse = new DisplayableP2pCommercialUse[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(displaybleP2PCommercialUses, 0, adisplayablep2pcommercialuse, 0, j);
                        k = j;
                    }
                    for (; k < adisplayablep2pcommercialuse.length - 1; k++)
                    {
                        adisplayablep2pcommercialuse[k] = new DisplayableP2pCommercialUse();
                        codedinputbytebuffernano.readMessage(adisplayablep2pcommercialuse[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    adisplayablep2pcommercialuse[k] = new DisplayableP2pCommercialUse();
                    codedinputbytebuffernano.readMessage(adisplayablep2pcommercialuse[k]);
                    displaybleP2PCommercialUses = adisplayablep2pcommercialuse;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int k = i;
            if (displaybleP2PCommercialUses != null)
            {
                k = i;
                if (displaybleP2PCommercialUses.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= displaybleP2PCommercialUses.length)
                        {
                            break;
                        }
                        DisplayableP2pCommercialUse displayablep2pcommercialuse = displaybleP2PCommercialUses[j];
                        k = i;
                        if (displayablep2pcommercialuse != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(1, displayablep2pcommercialuse);
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
            if (displaybleP2PCommercialUses != null && displaybleP2PCommercialUses.length > 0)
            {
                for (int i = 0; i < displaybleP2PCommercialUses.length; i++)
                {
                    DisplayableP2pCommercialUse displayablep2pcommercialuse = displaybleP2PCommercialUses[i];
                    if (displayablep2pcommercialuse != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, displayablep2pcommercialuse);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DisplayableP2pCommercialUses()
        {
            clear();
        }
    }

    public static final class DisplayableP2pCommercialUses.DisplayableP2pCommercialUse extends ExtendableMessageNano
    {

        private static volatile DisplayableP2pCommercialUses.DisplayableP2pCommercialUse _emptyArray[];
        public String displayName;
        public Integer p2PCommercialUseType;

        private DisplayableP2pCommercialUses.DisplayableP2pCommercialUse clear()
        {
            displayName = null;
            p2PCommercialUseType = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static DisplayableP2pCommercialUses.DisplayableP2pCommercialUse[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new DisplayableP2pCommercialUses.DisplayableP2pCommercialUse[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private DisplayableP2pCommercialUses.DisplayableP2pCommercialUse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       10: 51
        //                       16: 62;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            displayName = codedinputbytebuffernano.readString();
              goto _L5
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
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
                p2PCommercialUseType = Integer.valueOf(j);
                break;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (displayName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, displayName);
            }
            j = i;
            if (p2PCommercialUseType != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, p2PCommercialUseType.intValue());
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
            if (displayName != null)
            {
                codedoutputbytebuffernano.writeString(1, displayName);
            }
            if (p2PCommercialUseType != null)
            {
                codedoutputbytebuffernano.writeInt32(2, p2PCommercialUseType.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DisplayableP2pCommercialUses.DisplayableP2pCommercialUse()
        {
            clear();
        }
    }

    public static final class DisplayableRate extends ExtendableMessageNano
    {

        public String displayRate;
        public Long rateInMicros;

        private DisplayableRate clear()
        {
            rateInMicros = null;
            displayRate = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DisplayableRate mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    rateInMicros = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 18: // '\022'
                    displayRate = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (rateInMicros != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, rateInMicros.longValue());
            }
            j = i;
            if (displayRate != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, displayRate);
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
            if (rateInMicros != null)
            {
                codedoutputbytebuffernano.writeInt64(1, rateInMicros.longValue());
            }
            if (displayRate != null)
            {
                codedoutputbytebuffernano.writeString(2, displayRate);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DisplayableRate()
        {
            clear();
        }
    }

    public static final class EntityIdentifier extends ExtendableMessageNano
    {

        private static volatile EntityIdentifier _emptyArray[];
        public Long generationNumber;
        public String localId;
        public String originatorId;

        private EntityIdentifier clear()
        {
            originatorId = null;
            localId = null;
            generationNumber = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static EntityIdentifier[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new EntityIdentifier[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private EntityIdentifier mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    originatorId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    localId = codedinputbytebuffernano.readString();
                    break;

                case 24: // '\030'
                    generationNumber = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (originatorId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, originatorId);
            }
            j = i;
            if (localId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, localId);
            }
            i = j;
            if (generationNumber != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(3, generationNumber.longValue());
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
            if (originatorId != null)
            {
                codedoutputbytebuffernano.writeString(1, originatorId);
            }
            if (localId != null)
            {
                codedoutputbytebuffernano.writeString(2, localId);
            }
            if (generationNumber != null)
            {
                codedoutputbytebuffernano.writeInt64(3, generationNumber.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public EntityIdentifier()
        {
            clear();
        }
    }

    public static final class EntityMetadata extends ExtendableMessageNano
    {

        public Long lastUpdateTimeMicros;
        public Integer state;

        private EntityMetadata clear()
        {
            state = null;
            lastUpdateTimeMicros = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private EntityMetadata mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       8: 51
        //                       16: 94;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
                state = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            lastUpdateTimeMicros = Long.valueOf(codedinputbytebuffernano.readInt64());
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (state != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, state.intValue());
            }
            j = i;
            if (lastUpdateTimeMicros != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, lastUpdateTimeMicros.longValue());
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
            if (state != null)
            {
                codedoutputbytebuffernano.writeInt32(1, state.intValue());
            }
            if (lastUpdateTimeMicros != null)
            {
                codedoutputbytebuffernano.writeInt64(2, lastUpdateTimeMicros.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public EntityMetadata()
        {
            clear();
        }
    }

    public static final class Feature extends ExtendableMessageNano
    {

        private static volatile Feature _emptyArray[];
        public Integer code;

        private Feature clear()
        {
            code = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static Feature[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Feature[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private Feature mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 41
        //                       8: 43;
               goto _L1 _L2 _L3
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 100: // 'd'
            case 101: // 'e'
            case 102: // 'f'
            case 103: // 'g'
            case 200: 
            case 201: 
            case 300: 
            case 301: 
            case 302: 
            case 303: 
            case 304: 
            case 305: 
            case 306: 
            case 400: 
            case 500: 
            case 600: 
            case 601: 
            case 700: 
            case 800: 
            case 900: 
            case 1000: 
            case 1101: 
            case 1200: 
            case 1300: 
            case 1301: 
            case 1302: 
            case 1600: 
            case 1601: 
            case 1602: 
            case 1700: 
            case 1800: 
            case 1902: 
                code = Integer.valueOf(j);
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (code != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, code.intValue());
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
            if (code != null)
            {
                codedoutputbytebuffernano.writeInt32(1, code.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Feature()
        {
            clear();
        }
    }

    public static final class Features extends ExtendableMessageNano
    {

        public Feature features[];

        private Features clear()
        {
            features = Feature.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Features mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    Feature afeature[];
                    int j;
                    if (features == null)
                    {
                        j = 0;
                    } else
                    {
                        j = features.length;
                    }
                    afeature = new Feature[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(features, 0, afeature, 0, j);
                        k = j;
                    }
                    for (; k < afeature.length - 1; k++)
                    {
                        afeature[k] = new Feature();
                        codedinputbytebuffernano.readMessage(afeature[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    afeature[k] = new Feature();
                    codedinputbytebuffernano.readMessage(afeature[k]);
                    features = afeature;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int k = i;
            if (features != null)
            {
                k = i;
                if (features.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= features.length)
                        {
                            break;
                        }
                        Feature feature = features[j];
                        k = i;
                        if (feature != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(1, feature);
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
            if (features != null && features.length > 0)
            {
                for (int i = 0; i < features.length; i++)
                {
                    Feature feature = features[i];
                    if (feature != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, feature);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Features()
        {
            clear();
        }
    }

    public static final class FrontingInstrumentInfo extends ExtendableMessageNano
    {

        public CashWithdrawalDetails cashWithdrawalDetails;
        public Integer consistencyState;
        public CdpIdData fundingSources[];
        public NfcProxyCardDetails nfcFrontingInstrumentDetails;
        public PlasticProxyCardDetails plasticFrontingInstrumentDetails[];

        private FrontingInstrumentInfo clear()
        {
            nfcFrontingInstrumentDetails = null;
            plasticFrontingInstrumentDetails = PlasticProxyCardDetails.emptyArray();
            fundingSources = CdpIdData.emptyArray();
            consistencyState = null;
            cashWithdrawalDetails = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FrontingInstrumentInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 73
        //                       10: 75
        //                       18: 104
        //                       26: 228
        //                       32: 352
        //                       42: 394;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            if (nfcFrontingInstrumentDetails == null)
            {
                nfcFrontingInstrumentDetails = new NfcProxyCardDetails();
            }
            codedinputbytebuffernano.readMessage(nfcFrontingInstrumentDetails);
              goto _L8
_L4:
            int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
            PlasticProxyCardDetails aplasticproxycarddetails[];
            int j;
            if (plasticFrontingInstrumentDetails == null)
            {
                j = 0;
            } else
            {
                j = plasticFrontingInstrumentDetails.length;
            }
            aplasticproxycarddetails = new PlasticProxyCardDetails[j + i1];
            i1 = j;
            if (j != 0)
            {
                System.arraycopy(plasticFrontingInstrumentDetails, 0, aplasticproxycarddetails, 0, j);
                i1 = j;
            }
            for (; i1 < aplasticproxycarddetails.length - 1; i1++)
            {
                aplasticproxycarddetails[i1] = new PlasticProxyCardDetails();
                codedinputbytebuffernano.readMessage(aplasticproxycarddetails[i1]);
                codedinputbytebuffernano.readTag();
            }

            aplasticproxycarddetails[i1] = new PlasticProxyCardDetails();
            codedinputbytebuffernano.readMessage(aplasticproxycarddetails[i1]);
            plasticFrontingInstrumentDetails = aplasticproxycarddetails;
              goto _L8
_L5:
            int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
            CdpIdData acdpiddata[];
            int k;
            if (fundingSources == null)
            {
                k = 0;
            } else
            {
                k = fundingSources.length;
            }
            acdpiddata = new CdpIdData[k + j1];
            j1 = k;
            if (k != 0)
            {
                System.arraycopy(fundingSources, 0, acdpiddata, 0, k);
                j1 = k;
            }
            for (; j1 < acdpiddata.length - 1; j1++)
            {
                acdpiddata[j1] = new CdpIdData();
                codedinputbytebuffernano.readMessage(acdpiddata[j1]);
                codedinputbytebuffernano.readTag();
            }

            acdpiddata[j1] = new CdpIdData();
            codedinputbytebuffernano.readMessage(acdpiddata[j1]);
            fundingSources = acdpiddata;
              goto _L8
_L6:
            int l = codedinputbytebuffernano.readInt32();
            switch (l)
            {
            case 1: // '\001'
            case 2: // '\002'
                consistencyState = Integer.valueOf(l);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            if (cashWithdrawalDetails == null)
            {
                cashWithdrawalDetails = new CashWithdrawalDetails();
            }
            codedinputbytebuffernano.readMessage(cashWithdrawalDetails);
            if (true) goto _L8; else goto _L9
_L9:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (nfcFrontingInstrumentDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(1, nfcFrontingInstrumentDetails);
            }
            i = j;
            if (plasticFrontingInstrumentDetails != null)
            {
                i = j;
                if (plasticFrontingInstrumentDetails.length > 0)
                {
                    int k = 0;
                    do
                    {
                        i = j;
                        if (k >= plasticFrontingInstrumentDetails.length)
                        {
                            break;
                        }
                        PlasticProxyCardDetails plasticproxycarddetails = plasticFrontingInstrumentDetails[k];
                        i = j;
                        if (plasticproxycarddetails != null)
                        {
                            i = j + CodedOutputByteBufferNano.computeMessageSize(2, plasticproxycarddetails);
                        }
                        k++;
                        j = i;
                    } while (true);
                }
            }
            j = i;
            if (fundingSources != null)
            {
                j = i;
                if (fundingSources.length > 0)
                {
                    int l = 0;
                    do
                    {
                        j = i;
                        if (l >= fundingSources.length)
                        {
                            break;
                        }
                        CdpIdData cdpiddata = fundingSources[l];
                        j = i;
                        if (cdpiddata != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(3, cdpiddata);
                        }
                        l++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (consistencyState != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(4, consistencyState.intValue());
            }
            j = i;
            if (cashWithdrawalDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(5, cashWithdrawalDetails);
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
            if (nfcFrontingInstrumentDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(1, nfcFrontingInstrumentDetails);
            }
            if (plasticFrontingInstrumentDetails != null && plasticFrontingInstrumentDetails.length > 0)
            {
                for (int i = 0; i < plasticFrontingInstrumentDetails.length; i++)
                {
                    PlasticProxyCardDetails plasticproxycarddetails = plasticFrontingInstrumentDetails[i];
                    if (plasticproxycarddetails != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, plasticproxycarddetails);
                    }
                }

            }
            if (fundingSources != null && fundingSources.length > 0)
            {
                for (int j = 0; j < fundingSources.length; j++)
                {
                    CdpIdData cdpiddata = fundingSources[j];
                    if (cdpiddata != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, cdpiddata);
                    }
                }

            }
            if (consistencyState != null)
            {
                codedoutputbytebuffernano.writeInt32(4, consistencyState.intValue());
            }
            if (cashWithdrawalDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(5, cashWithdrawalDetails);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FrontingInstrumentInfo()
        {
            clear();
        }
    }

    public static final class FundingSourceInfo extends ExtendableMessageNano
    {

        private static volatile FundingSourceInfo _emptyArray[];
        public InlineDescription inlineDescription;
        public String instrumentSubIds[];
        public Boolean isFree;

        private FundingSourceInfo clear()
        {
            instrumentSubIds = WireFormatNano.EMPTY_STRING_ARRAY;
            isFree = null;
            inlineDescription = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static FundingSourceInfo[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new FundingSourceInfo[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private FundingSourceInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    String as[];
                    int j;
                    if (instrumentSubIds == null)
                    {
                        j = 0;
                    } else
                    {
                        j = instrumentSubIds.length;
                    }
                    as = new String[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(instrumentSubIds, 0, as, 0, j);
                        k = j;
                    }
                    for (; k < as.length - 1; k++)
                    {
                        as[k] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[k] = codedinputbytebuffernano.readString();
                    instrumentSubIds = as;
                    break;

                case 16: // '\020'
                    isFree = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 26: // '\032'
                    if (inlineDescription == null)
                    {
                        inlineDescription = new InlineDescription();
                    }
                    codedinputbytebuffernano.readMessage(inlineDescription);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int k1 = super.computeSerializedSize();
            int i = k1;
            if (instrumentSubIds != null)
            {
                i = k1;
                if (instrumentSubIds.length > 0)
                {
                    int i1 = 0;
                    int j = 0;
                    for (i = 0; i < instrumentSubIds.length;)
                    {
                        String s = instrumentSubIds[i];
                        int j1 = i1;
                        int l = j;
                        if (s != null)
                        {
                            j1 = i1 + 1;
                            l = j + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        i++;
                        i1 = j1;
                        j = l;
                    }

                    i = k1 + j + i1 * 1;
                }
            }
            int k = i;
            if (isFree != null)
            {
                k = i + CodedOutputByteBufferNano.computeBoolSize(2, isFree.booleanValue());
            }
            i = k;
            if (inlineDescription != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(3, inlineDescription);
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
            if (instrumentSubIds != null && instrumentSubIds.length > 0)
            {
                for (int i = 0; i < instrumentSubIds.length; i++)
                {
                    String s = instrumentSubIds[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(1, s);
                    }
                }

            }
            if (isFree != null)
            {
                codedoutputbytebuffernano.writeBool(2, isFree.booleanValue());
            }
            if (inlineDescription != null)
            {
                codedoutputbytebuffernano.writeMessage(3, inlineDescription);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FundingSourceInfo()
        {
            clear();
        }
    }

    public static final class FundingSourceInfo.InlineDescription extends ExtendableMessageNano
    {

        public String listDescriptionText;
        public String selectedDescriptionText;

        private FundingSourceInfo.InlineDescription clear()
        {
            selectedDescriptionText = null;
            listDescriptionText = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FundingSourceInfo.InlineDescription mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    selectedDescriptionText = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    listDescriptionText = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (selectedDescriptionText != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, selectedDescriptionText);
            }
            j = i;
            if (listDescriptionText != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, listDescriptionText);
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
            if (selectedDescriptionText != null)
            {
                codedoutputbytebuffernano.writeString(1, selectedDescriptionText);
            }
            if (listDescriptionText != null)
            {
                codedoutputbytebuffernano.writeString(2, listDescriptionText);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FundingSourceInfo.InlineDescription()
        {
            clear();
        }
    }

    public static final class GcmRegistrationInfo extends ExtendableMessageNano
    {

        public String packageName;
        public String registrationId;

        private GcmRegistrationInfo clear()
        {
            registrationId = null;
            packageName = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GcmRegistrationInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    registrationId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    packageName = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (registrationId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, registrationId);
            }
            j = i;
            if (packageName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, packageName);
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
            if (registrationId != null)
            {
                codedoutputbytebuffernano.writeString(1, registrationId);
            }
            if (packageName != null)
            {
                codedoutputbytebuffernano.writeString(2, packageName);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GcmRegistrationInfo()
        {
            clear();
        }
    }

    public static final class GlobalResources extends ExtendableMessageNano
    {

        public BillingKeys billingKeys;
        public String blacklistedBinRanges[];
        public ClientConfiguration clientConfiguration;
        public LatestLegalDocument latestLegalDocument;
        public Merchant merchants[];
        public TorinoKeys torinoKeys;
        public UserInfo userInfo;
        public Long version;
        public KeyczarSignedSessionKeyPair wobEncryptionKey;

        private GlobalResources clear()
        {
            version = null;
            billingKeys = null;
            merchants = Merchant.emptyArray();
            clientConfiguration = null;
            userInfo = null;
            blacklistedBinRanges = WireFormatNano.EMPTY_STRING_ARRAY;
            latestLegalDocument = null;
            torinoKeys = null;
            wobEncryptionKey = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GlobalResources mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    version = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 34: // '"'
                    if (billingKeys == null)
                    {
                        billingKeys = new BillingKeys();
                    }
                    codedinputbytebuffernano.readMessage(billingKeys);
                    break;

                case 42: // '*'
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                    Merchant amerchant[];
                    int j;
                    if (merchants == null)
                    {
                        j = 0;
                    } else
                    {
                        j = merchants.length;
                    }
                    amerchant = new Merchant[j + l];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(merchants, 0, amerchant, 0, j);
                        l = j;
                    }
                    for (; l < amerchant.length - 1; l++)
                    {
                        amerchant[l] = new Merchant();
                        codedinputbytebuffernano.readMessage(amerchant[l]);
                        codedinputbytebuffernano.readTag();
                    }

                    amerchant[l] = new Merchant();
                    codedinputbytebuffernano.readMessage(amerchant[l]);
                    merchants = amerchant;
                    break;

                case 50: // '2'
                    if (clientConfiguration == null)
                    {
                        clientConfiguration = new ClientConfiguration();
                    }
                    codedinputbytebuffernano.readMessage(clientConfiguration);
                    break;

                case 58: // ':'
                    if (latestLegalDocument == null)
                    {
                        latestLegalDocument = new LatestLegalDocument();
                    }
                    codedinputbytebuffernano.readMessage(latestLegalDocument);
                    break;

                case 66: // 'B'
                    if (userInfo == null)
                    {
                        userInfo = new UserInfo();
                    }
                    codedinputbytebuffernano.readMessage(userInfo);
                    break;

                case 74: // 'J'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 74);
                    String as[];
                    int k;
                    if (blacklistedBinRanges == null)
                    {
                        k = 0;
                    } else
                    {
                        k = blacklistedBinRanges.length;
                    }
                    as = new String[k + i1];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(blacklistedBinRanges, 0, as, 0, k);
                        i1 = k;
                    }
                    for (; i1 < as.length - 1; i1++)
                    {
                        as[i1] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[i1] = codedinputbytebuffernano.readString();
                    blacklistedBinRanges = as;
                    break;

                case 82: // 'R'
                    if (torinoKeys == null)
                    {
                        torinoKeys = new TorinoKeys();
                    }
                    codedinputbytebuffernano.readMessage(torinoKeys);
                    break;

                case 98: // 'b'
                    if (wobEncryptionKey == null)
                    {
                        wobEncryptionKey = new KeyczarSignedSessionKeyPair();
                    }
                    codedinputbytebuffernano.readMessage(wobEncryptionKey);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (version != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(1, version.longValue());
            }
            i = j;
            if (billingKeys != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(4, billingKeys);
            }
            j = i;
            if (merchants != null)
            {
                j = i;
                if (merchants.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= merchants.length)
                        {
                            break;
                        }
                        Merchant merchant = merchants[k];
                        j = i;
                        if (merchant != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(5, merchant);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (clientConfiguration != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(6, clientConfiguration);
            }
            j = i;
            if (latestLegalDocument != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(7, latestLegalDocument);
            }
            i = j;
            if (userInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(8, userInfo);
            }
            j = i;
            if (blacklistedBinRanges != null)
            {
                j = i;
                if (blacklistedBinRanges.length > 0)
                {
                    int j1 = 0;
                    int l = 0;
                    for (j = 0; j < blacklistedBinRanges.length;)
                    {
                        String s = blacklistedBinRanges[j];
                        int k1 = j1;
                        int i1 = l;
                        if (s != null)
                        {
                            k1 = j1 + 1;
                            i1 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        j++;
                        j1 = k1;
                        l = i1;
                    }

                    j = i + l + j1 * 1;
                }
            }
            i = j;
            if (torinoKeys != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(10, torinoKeys);
            }
            j = i;
            if (wobEncryptionKey != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(12, wobEncryptionKey);
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
            if (version != null)
            {
                codedoutputbytebuffernano.writeInt64(1, version.longValue());
            }
            if (billingKeys != null)
            {
                codedoutputbytebuffernano.writeMessage(4, billingKeys);
            }
            if (merchants != null && merchants.length > 0)
            {
                for (int i = 0; i < merchants.length; i++)
                {
                    Merchant merchant = merchants[i];
                    if (merchant != null)
                    {
                        codedoutputbytebuffernano.writeMessage(5, merchant);
                    }
                }

            }
            if (clientConfiguration != null)
            {
                codedoutputbytebuffernano.writeMessage(6, clientConfiguration);
            }
            if (latestLegalDocument != null)
            {
                codedoutputbytebuffernano.writeMessage(7, latestLegalDocument);
            }
            if (userInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(8, userInfo);
            }
            if (blacklistedBinRanges != null && blacklistedBinRanges.length > 0)
            {
                for (int j = 0; j < blacklistedBinRanges.length; j++)
                {
                    String s = blacklistedBinRanges[j];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(9, s);
                    }
                }

            }
            if (torinoKeys != null)
            {
                codedoutputbytebuffernano.writeMessage(10, torinoKeys);
            }
            if (wobEncryptionKey != null)
            {
                codedoutputbytebuffernano.writeMessage(12, wobEncryptionKey);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GlobalResources()
        {
            clear();
        }
    }

    public static final class GoogleOfferTemplateId extends ExtendableMessageNano
    {

        public String id;
        public String source;

        private GoogleOfferTemplateId clear()
        {
            id = null;
            source = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GoogleOfferTemplateId mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    id = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    source = codedinputbytebuffernano.readString();
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
                i = j + CodedOutputByteBufferNano.computeStringSize(1, id);
            }
            j = i;
            if (source != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, source);
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
                codedoutputbytebuffernano.writeString(1, id);
            }
            if (source != null)
            {
                codedoutputbytebuffernano.writeString(2, source);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GoogleOfferTemplateId()
        {
            clear();
        }
    }

    public static final class InstrumentUse extends ExtendableMessageNano
    {

        public Integer use;

        private InstrumentUse clear()
        {
            use = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private InstrumentUse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 41
        //                       8: 43;
               goto _L1 _L2 _L3
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
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
                use = Integer.valueOf(j);
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (use != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, use.intValue());
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
            if (use != null)
            {
                codedoutputbytebuffernano.writeInt32(1, use.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public InstrumentUse()
        {
            clear();
        }
    }

    public static final class InternalProvisioningInfo extends ExtendableMessageNano
    {

        public String authToken;
        public Long nextScheduledTimeMillis;
        public PartnerCallRecord partnerCallRecord[];
        public Integer rescheduleErrorCount;
        public String semToken;
        public Integer tsmGetStatusAttempts;
        public String tsmId;

        private InternalProvisioningInfo clear()
        {
            authToken = null;
            tsmGetStatusAttempts = null;
            rescheduleErrorCount = null;
            partnerCallRecord = PartnerCallRecord.emptyArray();
            nextScheduledTimeMillis = null;
            semToken = null;
            tsmId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private InternalProvisioningInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    authToken = codedinputbytebuffernano.readString();
                    break;

                case 16: // '\020'
                    tsmGetStatusAttempts = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 24: // '\030'
                    rescheduleErrorCount = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 34: // '"'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    PartnerCallRecord apartnercallrecord[];
                    int j;
                    if (partnerCallRecord == null)
                    {
                        j = 0;
                    } else
                    {
                        j = partnerCallRecord.length;
                    }
                    apartnercallrecord = new PartnerCallRecord[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(partnerCallRecord, 0, apartnercallrecord, 0, j);
                        k = j;
                    }
                    for (; k < apartnercallrecord.length - 1; k++)
                    {
                        apartnercallrecord[k] = new PartnerCallRecord();
                        codedinputbytebuffernano.readMessage(apartnercallrecord[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    apartnercallrecord[k] = new PartnerCallRecord();
                    codedinputbytebuffernano.readMessage(apartnercallrecord[k]);
                    partnerCallRecord = apartnercallrecord;
                    break;

                case 40: // '('
                    nextScheduledTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 50: // '2'
                    semToken = codedinputbytebuffernano.readString();
                    break;

                case 58: // ':'
                    tsmId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (authToken != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, authToken);
            }
            j = i;
            if (tsmGetStatusAttempts != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, tsmGetStatusAttempts.intValue());
            }
            i = j;
            if (rescheduleErrorCount != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, rescheduleErrorCount.intValue());
            }
            j = i;
            if (partnerCallRecord != null)
            {
                j = i;
                if (partnerCallRecord.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= partnerCallRecord.length)
                        {
                            break;
                        }
                        PartnerCallRecord partnercallrecord = partnerCallRecord[k];
                        j = i;
                        if (partnercallrecord != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(4, partnercallrecord);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (nextScheduledTimeMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(5, nextScheduledTimeMillis.longValue());
            }
            j = i;
            if (semToken != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, semToken);
            }
            i = j;
            if (tsmId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(7, tsmId);
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
            if (authToken != null)
            {
                codedoutputbytebuffernano.writeString(1, authToken);
            }
            if (tsmGetStatusAttempts != null)
            {
                codedoutputbytebuffernano.writeInt32(2, tsmGetStatusAttempts.intValue());
            }
            if (rescheduleErrorCount != null)
            {
                codedoutputbytebuffernano.writeInt32(3, rescheduleErrorCount.intValue());
            }
            if (partnerCallRecord != null && partnerCallRecord.length > 0)
            {
                for (int i = 0; i < partnerCallRecord.length; i++)
                {
                    PartnerCallRecord partnercallrecord = partnerCallRecord[i];
                    if (partnercallrecord != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, partnercallrecord);
                    }
                }

            }
            if (nextScheduledTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(5, nextScheduledTimeMillis.longValue());
            }
            if (semToken != null)
            {
                codedoutputbytebuffernano.writeString(6, semToken);
            }
            if (tsmId != null)
            {
                codedoutputbytebuffernano.writeString(7, tsmId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public InternalProvisioningInfo()
        {
            clear();
        }
    }

    public static final class InternalProvisioningInfo.PartnerCallRecord extends ExtendableMessageNano
    {

        private static volatile InternalProvisioningInfo.PartnerCallRecord _emptyArray[];
        public Long callTimeMillis;
        public NanoWalletPartnerError.Error error;
        public String partnerId;
        public String partnerResponse;
        public String requestName;
        public Boolean success;

        private InternalProvisioningInfo.PartnerCallRecord clear()
        {
            callTimeMillis = null;
            partnerId = null;
            requestName = null;
            partnerResponse = null;
            success = null;
            error = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static InternalProvisioningInfo.PartnerCallRecord[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new InternalProvisioningInfo.PartnerCallRecord[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private InternalProvisioningInfo.PartnerCallRecord mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    callTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 18: // '\022'
                    partnerId = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    requestName = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    partnerResponse = codedinputbytebuffernano.readString();
                    break;

                case 40: // '('
                    success = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 50: // '2'
                    if (error == null)
                    {
                        error = new NanoWalletPartnerError.Error();
                    }
                    codedinputbytebuffernano.readMessage(error);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (callTimeMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, callTimeMillis.longValue());
            }
            j = i;
            if (partnerId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, partnerId);
            }
            i = j;
            if (requestName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, requestName);
            }
            j = i;
            if (partnerResponse != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, partnerResponse);
            }
            i = j;
            if (success != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(5, success.booleanValue());
            }
            j = i;
            if (error != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, error);
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
            if (callTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(1, callTimeMillis.longValue());
            }
            if (partnerId != null)
            {
                codedoutputbytebuffernano.writeString(2, partnerId);
            }
            if (requestName != null)
            {
                codedoutputbytebuffernano.writeString(3, requestName);
            }
            if (partnerResponse != null)
            {
                codedoutputbytebuffernano.writeString(4, partnerResponse);
            }
            if (success != null)
            {
                codedoutputbytebuffernano.writeBool(5, success.booleanValue());
            }
            if (error != null)
            {
                codedoutputbytebuffernano.writeMessage(6, error);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public InternalProvisioningInfo.PartnerCallRecord()
        {
            clear();
        }
    }

    public static final class KeyczarSignedSessionKeyPair extends ExtendableMessageNano
    {

        public String encryptionKey;
        public String signingKey;

        private KeyczarSignedSessionKeyPair clear()
        {
            encryptionKey = null;
            signingKey = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private KeyczarSignedSessionKeyPair mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    encryptionKey = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    signingKey = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (encryptionKey != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, encryptionKey);
            }
            j = i;
            if (signingKey != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, signingKey);
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
            if (encryptionKey != null)
            {
                codedoutputbytebuffernano.writeString(1, encryptionKey);
            }
            if (signingKey != null)
            {
                codedoutputbytebuffernano.writeString(2, signingKey);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public KeyczarSignedSessionKeyPair()
        {
            clear();
        }
    }

    public static final class KycStatus extends ExtendableMessageNano
    {

        public Boolean canPerformDocumentVerification;
        public Boolean needsFullSsn;
        public Boolean shouldPoll;
        public Integer status;
        public int validatedInformation[];

        private KycStatus clear()
        {
            status = null;
            validatedInformation = WireFormatNano.EMPTY_INT_ARRAY;
            canPerformDocumentVerification = null;
            needsFullSsn = null;
            shouldPoll = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private KycStatus mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L9:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 7: default 76
        //                       0: 86
        //                       8: 88
        //                       16: 147
        //                       18: 340
        //                       24: 562
        //                       32: 576
        //                       40: 590;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
            return this;
_L3:
            i = codedinputbytebuffernano.readInt32();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                status = Integer.valueOf(i);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            int ai[];
            int j;
            int i1;
            i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 16);
            ai = new int[i1];
            j = 0;
            i = 0;
_L15:
            if (j >= i1) goto _L11; else goto _L10
_L10:
            int j1;
            if (j != 0)
            {
                codedinputbytebuffernano.readTag();
            }
            j1 = codedinputbytebuffernano.readInt32();
            j1;
            JVM INSTR tableswitch 0 4: default 224
        //                       0 233
        //                       1 233
        //                       2 233
        //                       3 233
        //                       4 233;
               goto _L12 _L13 _L13 _L13 _L13 _L13
_L12:
            j++;
            continue; /* Loop/switch isn't completed */
_L13:
            int k = i + 1;
            ai[i] = j1;
            i = k;
            if (true) goto _L12; else goto _L11
_L11:
            if (i != 0)
            {
                if (validatedInformation == null)
                {
                    j = 0;
                } else
                {
                    j = validatedInformation.length;
                }
                if (j == 0 && i == i1)
                {
                    validatedInformation = ai;
                } else
                {
                    int ai1[] = new int[j + i];
                    if (j != 0)
                    {
                        System.arraycopy(validatedInformation, 0, ai1, 0, j);
                    }
                    System.arraycopy(ai, 0, ai1, j, i);
                    validatedInformation = ai1;
                }
            }
            continue; /* Loop/switch isn't completed */
            if (true) goto _L15; else goto _L14
_L14:
_L5:
            int l;
            l = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
            j = 0;
            i = codedinputbytebuffernano.getPosition();
_L21:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                switch (codedinputbytebuffernano.readInt32())
                {
                case 0: // '\0'
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                    j++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (j == 0) goto _L17; else goto _L16
_L16:
            codedinputbytebuffernano.rewindToPosition(i);
            if (validatedInformation == null)
            {
                i = 0;
            } else
            {
                i = validatedInformation.length;
            }
            ai = new int[i + j];
            j = i;
            if (i != 0)
            {
                System.arraycopy(validatedInformation, 0, ai, 0, i);
                j = i;
            }
_L19:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                i = codedinputbytebuffernano.readInt32();
                switch (i)
                {
                case 0: // '\0'
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                    ai[j] = i;
                    j++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            validatedInformation = ai;
_L17:
            codedinputbytebuffernano.popLimit(l);
            continue; /* Loop/switch isn't completed */
            if (true) goto _L19; else goto _L18
_L18:
            if (true) goto _L21; else goto _L20
_L20:
_L6:
            canPerformDocumentVerification = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L7:
            needsFullSsn = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L8:
            shouldPoll = Boolean.valueOf(codedinputbytebuffernano.readBool());
            if (true) goto _L9; else goto _L22
_L22:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (status != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, status.intValue());
            }
            j = i;
            if (validatedInformation != null)
            {
                j = i;
                if (validatedInformation.length > 0)
                {
                    int k = 0;
                    for (j = 0; j < validatedInformation.length; j++)
                    {
                        k += CodedOutputByteBufferNano.computeInt32SizeNoTag(validatedInformation[j]);
                    }

                    j = i + k + validatedInformation.length * 1;
                }
            }
            i = j;
            if (canPerformDocumentVerification != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(3, canPerformDocumentVerification.booleanValue());
            }
            j = i;
            if (needsFullSsn != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(4, needsFullSsn.booleanValue());
            }
            i = j;
            if (shouldPoll != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(5, shouldPoll.booleanValue());
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
            if (status != null)
            {
                codedoutputbytebuffernano.writeInt32(1, status.intValue());
            }
            if (validatedInformation != null && validatedInformation.length > 0)
            {
                for (int i = 0; i < validatedInformation.length; i++)
                {
                    codedoutputbytebuffernano.writeInt32(2, validatedInformation[i]);
                }

            }
            if (canPerformDocumentVerification != null)
            {
                codedoutputbytebuffernano.writeBool(3, canPerformDocumentVerification.booleanValue());
            }
            if (needsFullSsn != null)
            {
                codedoutputbytebuffernano.writeBool(4, needsFullSsn.booleanValue());
            }
            if (shouldPoll != null)
            {
                codedoutputbytebuffernano.writeBool(5, shouldPoll.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public KycStatus()
        {
            clear();
        }
    }

    public static final class LatestLegalDocument extends ExtendableMessageNano
    {

        public String bancorpTosUrl;
        public String displayName;
        public String documentId;
        public String documentUrl;
        public Long gracePeriodExpiresTimeMillis;
        public String privacyNoticeUrl;

        private LatestLegalDocument clear()
        {
            documentId = null;
            documentUrl = null;
            gracePeriodExpiresTimeMillis = null;
            displayName = null;
            bancorpTosUrl = null;
            privacyNoticeUrl = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LatestLegalDocument mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    documentId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    documentUrl = codedinputbytebuffernano.readString();
                    break;

                case 24: // '\030'
                    gracePeriodExpiresTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 34: // '"'
                    displayName = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    bancorpTosUrl = codedinputbytebuffernano.readString();
                    break;

                case 50: // '2'
                    privacyNoticeUrl = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (documentId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, documentId);
            }
            j = i;
            if (documentUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, documentUrl);
            }
            i = j;
            if (gracePeriodExpiresTimeMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(3, gracePeriodExpiresTimeMillis.longValue());
            }
            j = i;
            if (displayName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, displayName);
            }
            i = j;
            if (bancorpTosUrl != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, bancorpTosUrl);
            }
            j = i;
            if (privacyNoticeUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, privacyNoticeUrl);
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
            if (documentId != null)
            {
                codedoutputbytebuffernano.writeString(1, documentId);
            }
            if (documentUrl != null)
            {
                codedoutputbytebuffernano.writeString(2, documentUrl);
            }
            if (gracePeriodExpiresTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(3, gracePeriodExpiresTimeMillis.longValue());
            }
            if (displayName != null)
            {
                codedoutputbytebuffernano.writeString(4, displayName);
            }
            if (bancorpTosUrl != null)
            {
                codedoutputbytebuffernano.writeString(5, bancorpTosUrl);
            }
            if (privacyNoticeUrl != null)
            {
                codedoutputbytebuffernano.writeString(6, privacyNoticeUrl);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LatestLegalDocument()
        {
            clear();
        }
    }

    public static final class LegalDocsForCountry extends ExtendableMessageNano
    {

        private static volatile LegalDocsForCountry _emptyArray[];
        public String countryCode;
        public String legalDocumentId[];
        public String legalDocumentUrl;

        private LegalDocsForCountry clear()
        {
            countryCode = null;
            legalDocumentUrl = null;
            legalDocumentId = WireFormatNano.EMPTY_STRING_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static LegalDocsForCountry[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new LegalDocsForCountry[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private LegalDocsForCountry mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    countryCode = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    legalDocumentUrl = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    String as[];
                    int j;
                    if (legalDocumentId == null)
                    {
                        j = 0;
                    } else
                    {
                        j = legalDocumentId.length;
                    }
                    as = new String[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(legalDocumentId, 0, as, 0, j);
                        k = j;
                    }
                    for (; k < as.length - 1; k++)
                    {
                        as[k] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[k] = codedinputbytebuffernano.readString();
                    legalDocumentId = as;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (countryCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(1, countryCode);
            }
            i = j;
            if (legalDocumentUrl != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, legalDocumentUrl);
            }
            j = i;
            if (legalDocumentId != null)
            {
                j = i;
                if (legalDocumentId.length > 0)
                {
                    int i1 = 0;
                    int k = 0;
                    for (j = 0; j < legalDocumentId.length;)
                    {
                        String s = legalDocumentId[j];
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
            if (countryCode != null)
            {
                codedoutputbytebuffernano.writeString(1, countryCode);
            }
            if (legalDocumentUrl != null)
            {
                codedoutputbytebuffernano.writeString(2, legalDocumentUrl);
            }
            if (legalDocumentId != null && legalDocumentId.length > 0)
            {
                for (int i = 0; i < legalDocumentId.length; i++)
                {
                    String s = legalDocumentId[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(3, s);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LegalDocsForCountry()
        {
            clear();
        }
    }

    public static final class MaskedCredential extends ExtendableMessageNano
    {

        public String cardBackImageUrl;
        public String cardFrontImageUrl;
        public String cardNumberLast4;
        public String correlationId;
        public Integer credentialType;
        public String expirationMonth;
        public String expirationYear;
        public String nameOnCard;
        public String nickname;
        public String partnerId;

        private MaskedCredential clear()
        {
            cardFrontImageUrl = null;
            cardBackImageUrl = null;
            cardNumberLast4 = null;
            expirationMonth = null;
            expirationYear = null;
            nameOnCard = null;
            credentialType = null;
            nickname = null;
            correlationId = null;
            partnerId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private MaskedCredential mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L13:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 11: default 104
        //                       0: 113
        //                       10: 115
        //                       18: 126
        //                       26: 137
        //                       34: 148
        //                       42: 159
        //                       50: 170
        //                       56: 181
        //                       66: 234
        //                       74: 245
        //                       82: 256;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L13; else goto _L2
_L2:
            return this;
_L3:
            cardFrontImageUrl = codedinputbytebuffernano.readString();
              goto _L13
_L4:
            cardBackImageUrl = codedinputbytebuffernano.readString();
              goto _L13
_L5:
            cardNumberLast4 = codedinputbytebuffernano.readString();
              goto _L13
_L6:
            expirationMonth = codedinputbytebuffernano.readString();
              goto _L13
_L7:
            expirationYear = codedinputbytebuffernano.readString();
              goto _L13
_L8:
            nameOnCard = codedinputbytebuffernano.readString();
              goto _L13
_L9:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                credentialType = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L10:
            nickname = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L11:
            correlationId = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L12:
            partnerId = codedinputbytebuffernano.readString();
            if (true) goto _L13; else goto _L14
_L14:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (cardFrontImageUrl != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, cardFrontImageUrl);
            }
            j = i;
            if (cardBackImageUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, cardBackImageUrl);
            }
            i = j;
            if (cardNumberLast4 != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, cardNumberLast4);
            }
            j = i;
            if (expirationMonth != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, expirationMonth);
            }
            i = j;
            if (expirationYear != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, expirationYear);
            }
            j = i;
            if (nameOnCard != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, nameOnCard);
            }
            i = j;
            if (credentialType != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(7, credentialType.intValue());
            }
            j = i;
            if (nickname != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(8, nickname);
            }
            i = j;
            if (correlationId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(9, correlationId);
            }
            j = i;
            if (partnerId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(10, partnerId);
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
            if (cardFrontImageUrl != null)
            {
                codedoutputbytebuffernano.writeString(1, cardFrontImageUrl);
            }
            if (cardBackImageUrl != null)
            {
                codedoutputbytebuffernano.writeString(2, cardBackImageUrl);
            }
            if (cardNumberLast4 != null)
            {
                codedoutputbytebuffernano.writeString(3, cardNumberLast4);
            }
            if (expirationMonth != null)
            {
                codedoutputbytebuffernano.writeString(4, expirationMonth);
            }
            if (expirationYear != null)
            {
                codedoutputbytebuffernano.writeString(5, expirationYear);
            }
            if (nameOnCard != null)
            {
                codedoutputbytebuffernano.writeString(6, nameOnCard);
            }
            if (credentialType != null)
            {
                codedoutputbytebuffernano.writeInt32(7, credentialType.intValue());
            }
            if (nickname != null)
            {
                codedoutputbytebuffernano.writeString(8, nickname);
            }
            if (correlationId != null)
            {
                codedoutputbytebuffernano.writeString(9, correlationId);
            }
            if (partnerId != null)
            {
                codedoutputbytebuffernano.writeString(10, partnerId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public MaskedCredential()
        {
            clear();
        }
    }

    public static final class Merchant extends ExtendableMessageNano
    {

        private static volatile Merchant _emptyArray[];
        public String displayName;
        public EntityIdentifier id;
        public String logoUrl;
        public String matchingPatterns[];
        public String website;

        private Merchant clear()
        {
            id = null;
            displayName = null;
            matchingPatterns = WireFormatNano.EMPTY_STRING_ARRAY;
            website = null;
            logoUrl = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static Merchant[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Merchant[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private Merchant mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (id == null)
                    {
                        id = new EntityIdentifier();
                    }
                    codedinputbytebuffernano.readMessage(id);
                    break;

                case 18: // '\022'
                    displayName = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    String as[];
                    int j;
                    if (matchingPatterns == null)
                    {
                        j = 0;
                    } else
                    {
                        j = matchingPatterns.length;
                    }
                    as = new String[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(matchingPatterns, 0, as, 0, j);
                        k = j;
                    }
                    for (; k < as.length - 1; k++)
                    {
                        as[k] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[k] = codedinputbytebuffernano.readString();
                    matchingPatterns = as;
                    break;

                case 34: // '"'
                    website = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    logoUrl = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (id != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(1, id);
            }
            i = j;
            if (displayName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, displayName);
            }
            j = i;
            if (matchingPatterns != null)
            {
                j = i;
                if (matchingPatterns.length > 0)
                {
                    int i1 = 0;
                    int k = 0;
                    for (j = 0; j < matchingPatterns.length;)
                    {
                        String s = matchingPatterns[j];
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
            if (website != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(4, website);
            }
            j = i;
            if (logoUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(5, logoUrl);
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
                codedoutputbytebuffernano.writeMessage(1, id);
            }
            if (displayName != null)
            {
                codedoutputbytebuffernano.writeString(2, displayName);
            }
            if (matchingPatterns != null && matchingPatterns.length > 0)
            {
                for (int i = 0; i < matchingPatterns.length; i++)
                {
                    String s = matchingPatterns[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(3, s);
                    }
                }

            }
            if (website != null)
            {
                codedoutputbytebuffernano.writeString(4, website);
            }
            if (logoUrl != null)
            {
                codedoutputbytebuffernano.writeString(5, logoUrl);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Merchant()
        {
            clear();
        }
    }

    public static final class MoneyProto extends ExtendableMessageNano
    {

        public String currencyCode;
        public Long micros;

        private MoneyProto clear()
        {
            micros = null;
            currencyCode = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private MoneyProto mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    micros = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 18: // '\022'
                    currencyCode = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (micros != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, micros.longValue());
            }
            j = i;
            if (currencyCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, currencyCode);
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
            if (micros != null)
            {
                codedoutputbytebuffernano.writeInt64(1, micros.longValue());
            }
            if (currencyCode != null)
            {
                codedoutputbytebuffernano.writeString(2, currencyCode);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public MoneyProto()
        {
            clear();
        }
    }

    public static final class NfcProxyCardDetails extends ExtendableMessageNano
    {

        public ProvisioningInfo provisioningInfo;
        public ProxyCard proxyCard;

        private NfcProxyCardDetails clear()
        {
            proxyCard = null;
            provisioningInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private NfcProxyCardDetails mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (proxyCard == null)
                    {
                        proxyCard = new ProxyCard();
                    }
                    codedinputbytebuffernano.readMessage(proxyCard);
                    break;

                case 18: // '\022'
                    if (provisioningInfo == null)
                    {
                        provisioningInfo = new ProvisioningInfo();
                    }
                    codedinputbytebuffernano.readMessage(provisioningInfo);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (proxyCard != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, proxyCard);
            }
            j = i;
            if (provisioningInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, provisioningInfo);
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
            if (proxyCard != null)
            {
                codedoutputbytebuffernano.writeMessage(1, proxyCard);
            }
            if (provisioningInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(2, provisioningInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public NfcProxyCardDetails()
        {
            clear();
        }
    }

    public static final class NfcTapEvent extends ExtendableMessageNano
    {

        private static volatile NfcTapEvent _emptyArray[];
        public String amount;
        public BankTransaction bankTransaction;
        public String correlationId;
        public EntityIdentifier credentialIdentifier;
        public Boolean creditToAccount;
        public String description;
        public MaskedCredential fundingSource;
        public EntityIdentifier id;
        public String issuerDescription;
        public DisplayOnlyAddress locationOfPurchase;
        public MaskedCredential maskedCredential;
        public String merchantName;
        public EntityMetadata metadata;
        public Offer offers[];
        public String partnerId;
        public ProxyDisplayInfo proxyDisplayInfo;
        public Address purchaseAddress;
        public Long purchaseTimeMillis;
        public String timeZone;
        public Long transactionResolutionTimeMillis;

        private NfcTapEvent clear()
        {
            id = null;
            credentialIdentifier = null;
            metadata = null;
            purchaseTimeMillis = null;
            locationOfPurchase = null;
            maskedCredential = null;
            description = null;
            offers = Offer.emptyArray();
            bankTransaction = null;
            issuerDescription = null;
            amount = null;
            merchantName = null;
            creditToAccount = null;
            transactionResolutionTimeMillis = null;
            fundingSource = null;
            correlationId = null;
            partnerId = null;
            purchaseAddress = null;
            timeZone = null;
            proxyDisplayInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static NfcTapEvent[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new NfcTapEvent[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private NfcTapEvent mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (id == null)
                    {
                        id = new EntityIdentifier();
                    }
                    codedinputbytebuffernano.readMessage(id);
                    break;

                case 18: // '\022'
                    if (credentialIdentifier == null)
                    {
                        credentialIdentifier = new EntityIdentifier();
                    }
                    codedinputbytebuffernano.readMessage(credentialIdentifier);
                    break;

                case 24: // '\030'
                    purchaseTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 34: // '"'
                    if (locationOfPurchase == null)
                    {
                        locationOfPurchase = new DisplayOnlyAddress();
                    }
                    codedinputbytebuffernano.readMessage(locationOfPurchase);
                    break;

                case 42: // '*'
                    if (maskedCredential == null)
                    {
                        maskedCredential = new MaskedCredential();
                    }
                    codedinputbytebuffernano.readMessage(maskedCredential);
                    break;

                case 50: // '2'
                    description = codedinputbytebuffernano.readString();
                    break;

                case 58: // ':'
                    if (metadata == null)
                    {
                        metadata = new EntityMetadata();
                    }
                    codedinputbytebuffernano.readMessage(metadata);
                    break;

                case 66: // 'B'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 66);
                    Offer aoffer[];
                    int j;
                    if (offers == null)
                    {
                        j = 0;
                    } else
                    {
                        j = offers.length;
                    }
                    aoffer = new Offer[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(offers, 0, aoffer, 0, j);
                        k = j;
                    }
                    for (; k < aoffer.length - 1; k++)
                    {
                        aoffer[k] = new Offer();
                        codedinputbytebuffernano.readMessage(aoffer[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    aoffer[k] = new Offer();
                    codedinputbytebuffernano.readMessage(aoffer[k]);
                    offers = aoffer;
                    break;

                case 90: // 'Z'
                    issuerDescription = codedinputbytebuffernano.readString();
                    break;

                case 98: // 'b'
                    amount = codedinputbytebuffernano.readString();
                    break;

                case 106: // 'j'
                    merchantName = codedinputbytebuffernano.readString();
                    break;

                case 138: 
                    if (bankTransaction == null)
                    {
                        bankTransaction = new BankTransaction();
                    }
                    codedinputbytebuffernano.readMessage(bankTransaction);
                    break;

                case 144: 
                    creditToAccount = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 152: 
                    transactionResolutionTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 162: 
                    if (fundingSource == null)
                    {
                        fundingSource = new MaskedCredential();
                    }
                    codedinputbytebuffernano.readMessage(fundingSource);
                    break;

                case 170: 
                    correlationId = codedinputbytebuffernano.readString();
                    break;

                case 178: 
                    partnerId = codedinputbytebuffernano.readString();
                    break;

                case 186: 
                    if (purchaseAddress == null)
                    {
                        purchaseAddress = new Address();
                    }
                    codedinputbytebuffernano.readMessage(purchaseAddress);
                    break;

                case 194: 
                    timeZone = codedinputbytebuffernano.readString();
                    break;

                case 202: 
                    if (proxyDisplayInfo == null)
                    {
                        proxyDisplayInfo = new ProxyDisplayInfo();
                    }
                    codedinputbytebuffernano.readMessage(proxyDisplayInfo);
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
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
            }
            j = i;
            if (credentialIdentifier != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, credentialIdentifier);
            }
            i = j;
            if (purchaseTimeMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(3, purchaseTimeMillis.longValue());
            }
            j = i;
            if (locationOfPurchase != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, locationOfPurchase);
            }
            i = j;
            if (maskedCredential != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, maskedCredential);
            }
            j = i;
            if (description != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, description);
            }
            i = j;
            if (metadata != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, metadata);
            }
            j = i;
            if (offers != null)
            {
                j = i;
                if (offers.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= offers.length)
                        {
                            break;
                        }
                        Offer offer = offers[k];
                        j = i;
                        if (offer != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(8, offer);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (issuerDescription != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(11, issuerDescription);
            }
            j = i;
            if (amount != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(12, amount);
            }
            i = j;
            if (merchantName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(13, merchantName);
            }
            j = i;
            if (bankTransaction != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(17, bankTransaction);
            }
            i = j;
            if (creditToAccount != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(18, creditToAccount.booleanValue());
            }
            j = i;
            if (transactionResolutionTimeMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(19, transactionResolutionTimeMillis.longValue());
            }
            i = j;
            if (fundingSource != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(20, fundingSource);
            }
            j = i;
            if (correlationId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(21, correlationId);
            }
            i = j;
            if (partnerId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(22, partnerId);
            }
            j = i;
            if (purchaseAddress != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(23, purchaseAddress);
            }
            i = j;
            if (timeZone != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(24, timeZone);
            }
            j = i;
            if (proxyDisplayInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(25, proxyDisplayInfo);
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
                codedoutputbytebuffernano.writeMessage(1, id);
            }
            if (credentialIdentifier != null)
            {
                codedoutputbytebuffernano.writeMessage(2, credentialIdentifier);
            }
            if (purchaseTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(3, purchaseTimeMillis.longValue());
            }
            if (locationOfPurchase != null)
            {
                codedoutputbytebuffernano.writeMessage(4, locationOfPurchase);
            }
            if (maskedCredential != null)
            {
                codedoutputbytebuffernano.writeMessage(5, maskedCredential);
            }
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(6, description);
            }
            if (metadata != null)
            {
                codedoutputbytebuffernano.writeMessage(7, metadata);
            }
            if (offers != null && offers.length > 0)
            {
                for (int i = 0; i < offers.length; i++)
                {
                    Offer offer = offers[i];
                    if (offer != null)
                    {
                        codedoutputbytebuffernano.writeMessage(8, offer);
                    }
                }

            }
            if (issuerDescription != null)
            {
                codedoutputbytebuffernano.writeString(11, issuerDescription);
            }
            if (amount != null)
            {
                codedoutputbytebuffernano.writeString(12, amount);
            }
            if (merchantName != null)
            {
                codedoutputbytebuffernano.writeString(13, merchantName);
            }
            if (bankTransaction != null)
            {
                codedoutputbytebuffernano.writeMessage(17, bankTransaction);
            }
            if (creditToAccount != null)
            {
                codedoutputbytebuffernano.writeBool(18, creditToAccount.booleanValue());
            }
            if (transactionResolutionTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(19, transactionResolutionTimeMillis.longValue());
            }
            if (fundingSource != null)
            {
                codedoutputbytebuffernano.writeMessage(20, fundingSource);
            }
            if (correlationId != null)
            {
                codedoutputbytebuffernano.writeString(21, correlationId);
            }
            if (partnerId != null)
            {
                codedoutputbytebuffernano.writeString(22, partnerId);
            }
            if (purchaseAddress != null)
            {
                codedoutputbytebuffernano.writeMessage(23, purchaseAddress);
            }
            if (timeZone != null)
            {
                codedoutputbytebuffernano.writeString(24, timeZone);
            }
            if (proxyDisplayInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(25, proxyDisplayInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public NfcTapEvent()
        {
            clear();
        }
    }

    public static final class Offer extends ExtendableMessageNano
    {

        private static volatile Offer _emptyArray[];
        public String acquisitionSource;
        public Long archiveTimeMillis;
        public Long clipTimeMillis;
        public Store destStore;
        public String discountAmount;
        public DateAndTime expirationDate;
        public ExplosionDetails explosionDetails;
        public GoogleOfferTemplateId googleOfferTemplateId;
        public EntityIdentifier id;
        public String imageUrl;
        public Boolean isExploding;
        public Boolean isMarketplace;
        public Boolean isRedeemableFromDesktop;
        public Boolean isRedeemableFromMobile;
        public Boolean isRedeemableFromPrint;
        public String longDescription;
        public String merchantOfferCode;
        public String merchantSpecifiedData;
        public Long merchantUniqueId;
        public EntityMetadata metadata;
        public Integer mifareApplicationId;
        public Boolean nfcEligible;
        public String nfcOfferCode;
        public Integer offerType;
        public String offerTypeCode;
        public String progressImageUrl;
        public String progressMessage;
        public String providerLogoUrl;
        public String providerName;
        public Integer redemptionState;
        public String redemptionStateMessage;
        public Integer redemptionStrategy;
        public Long redemptionTimeMillis;
        public String shortDescription;
        public String sourceUrl;
        public DateAndTime startDate;
        public String termsAndConditions;
        public String title;

        private Offer clear()
        {
            id = null;
            metadata = null;
            imageUrl = null;
            title = null;
            shortDescription = null;
            discountAmount = null;
            longDescription = null;
            termsAndConditions = null;
            sourceUrl = null;
            destStore = null;
            expirationDate = null;
            startDate = null;
            merchantSpecifiedData = null;
            archiveTimeMillis = null;
            clipTimeMillis = null;
            redemptionTimeMillis = null;
            offerType = null;
            offerTypeCode = null;
            redemptionStrategy = null;
            nfcEligible = null;
            redemptionState = null;
            redemptionStateMessage = null;
            googleOfferTemplateId = null;
            mifareApplicationId = null;
            merchantOfferCode = null;
            merchantUniqueId = null;
            isMarketplace = null;
            providerName = null;
            providerLogoUrl = null;
            nfcOfferCode = null;
            progressImageUrl = null;
            progressMessage = null;
            isExploding = null;
            explosionDetails = null;
            isRedeemableFromMobile = null;
            isRedeemableFromDesktop = null;
            isRedeemableFromPrint = null;
            acquisitionSource = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static Offer[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Offer[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private Offer mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L41:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 39: default 328
        //                       0: 337
        //                       10: 339
        //                       18: 368
        //                       26: 379
        //                       34: 390
        //                       42: 401
        //                       50: 412
        //                       58: 423
        //                       66: 434
        //                       74: 445
        //                       82: 474
        //                       90: 503
        //                       98: 532
        //                       128: 543
        //                       136: 557
        //                       144: 571
        //                       152: 585
        //                       160: 642
        //                       168: 702
        //                       176: 716
        //                       186: 778
        //                       194: 789
        //                       200: 818
        //                       210: 832
        //                       218: 843
        //                       225: 872
        //                       232: 886
        //                       242: 900
        //                       250: 911
        //                       258: 922
        //                       266: 933
        //                       274: 944
        //                       280: 973
        //                       290: 987
        //                       298: 998
        //                       304: 1009
        //                       312: 1023
        //                       320: 1037
        //                       330: 1051;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L41; else goto _L2
_L2:
            return this;
_L3:
            if (id == null)
            {
                id = new EntityIdentifier();
            }
            codedinputbytebuffernano.readMessage(id);
              goto _L41
_L4:
            imageUrl = codedinputbytebuffernano.readString();
              goto _L41
_L5:
            title = codedinputbytebuffernano.readString();
              goto _L41
_L6:
            shortDescription = codedinputbytebuffernano.readString();
              goto _L41
_L7:
            discountAmount = codedinputbytebuffernano.readString();
              goto _L41
_L8:
            longDescription = codedinputbytebuffernano.readString();
              goto _L41
_L9:
            termsAndConditions = codedinputbytebuffernano.readString();
              goto _L41
_L10:
            sourceUrl = codedinputbytebuffernano.readString();
              goto _L41
_L11:
            if (destStore == null)
            {
                destStore = new Store();
            }
            codedinputbytebuffernano.readMessage(destStore);
              goto _L41
_L12:
            if (expirationDate == null)
            {
                expirationDate = new DateAndTime();
            }
            codedinputbytebuffernano.readMessage(expirationDate);
              goto _L41
_L13:
            if (startDate == null)
            {
                startDate = new DateAndTime();
            }
            codedinputbytebuffernano.readMessage(startDate);
              goto _L41
_L14:
            merchantSpecifiedData = codedinputbytebuffernano.readString();
              goto _L41
_L15:
            archiveTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L41
_L16:
            clipTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L41
_L17:
            redemptionTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L41
_L18:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
                offerType = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L19:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
                redemptionStrategy = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L20:
            nfcEligible = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L21:
            int l = codedinputbytebuffernano.readInt32();
            switch (l)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                redemptionState = Integer.valueOf(l);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L22:
            redemptionStateMessage = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L23:
            if (googleOfferTemplateId == null)
            {
                googleOfferTemplateId = new GoogleOfferTemplateId();
            }
            codedinputbytebuffernano.readMessage(googleOfferTemplateId);
            continue; /* Loop/switch isn't completed */
_L24:
            mifareApplicationId = Integer.valueOf(codedinputbytebuffernano.readUInt32());
            continue; /* Loop/switch isn't completed */
_L25:
            merchantOfferCode = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L26:
            if (metadata == null)
            {
                metadata = new EntityMetadata();
            }
            codedinputbytebuffernano.readMessage(metadata);
            continue; /* Loop/switch isn't completed */
_L27:
            merchantUniqueId = Long.valueOf(codedinputbytebuffernano.readFixed64());
            continue; /* Loop/switch isn't completed */
_L28:
            isMarketplace = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L29:
            providerName = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L30:
            providerLogoUrl = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L31:
            nfcOfferCode = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L32:
            progressImageUrl = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L33:
            if (explosionDetails == null)
            {
                explosionDetails = new ExplosionDetails();
            }
            codedinputbytebuffernano.readMessage(explosionDetails);
            continue; /* Loop/switch isn't completed */
_L34:
            isExploding = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L35:
            offerTypeCode = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L36:
            progressMessage = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L37:
            isRedeemableFromMobile = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L38:
            isRedeemableFromDesktop = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L39:
            isRedeemableFromPrint = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L40:
            acquisitionSource = codedinputbytebuffernano.readString();
            if (true) goto _L41; else goto _L42
_L42:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (id != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
            }
            j = i;
            if (imageUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, imageUrl);
            }
            i = j;
            if (title != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, title);
            }
            j = i;
            if (shortDescription != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, shortDescription);
            }
            i = j;
            if (discountAmount != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, discountAmount);
            }
            j = i;
            if (longDescription != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, longDescription);
            }
            i = j;
            if (termsAndConditions != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(7, termsAndConditions);
            }
            j = i;
            if (sourceUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(8, sourceUrl);
            }
            i = j;
            if (destStore != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(9, destStore);
            }
            j = i;
            if (expirationDate != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(10, expirationDate);
            }
            i = j;
            if (startDate != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(11, startDate);
            }
            j = i;
            if (merchantSpecifiedData != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(12, merchantSpecifiedData);
            }
            i = j;
            if (archiveTimeMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(16, archiveTimeMillis.longValue());
            }
            j = i;
            if (clipTimeMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(17, clipTimeMillis.longValue());
            }
            i = j;
            if (redemptionTimeMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(18, redemptionTimeMillis.longValue());
            }
            j = i;
            if (offerType != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(19, offerType.intValue());
            }
            i = j;
            if (redemptionStrategy != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(20, redemptionStrategy.intValue());
            }
            j = i;
            if (nfcEligible != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(21, nfcEligible.booleanValue());
            }
            i = j;
            if (redemptionState != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(22, redemptionState.intValue());
            }
            j = i;
            if (redemptionStateMessage != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(23, redemptionStateMessage);
            }
            i = j;
            if (googleOfferTemplateId != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(24, googleOfferTemplateId);
            }
            j = i;
            if (mifareApplicationId != null)
            {
                j = i + CodedOutputByteBufferNano.computeUInt32Size(25, mifareApplicationId.intValue());
            }
            i = j;
            if (merchantOfferCode != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(26, merchantOfferCode);
            }
            j = i;
            if (metadata != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(27, metadata);
            }
            i = j;
            if (merchantUniqueId != null)
            {
                i = j + CodedOutputByteBufferNano.computeFixed64Size(28, merchantUniqueId.longValue());
            }
            j = i;
            if (isMarketplace != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(29, isMarketplace.booleanValue());
            }
            i = j;
            if (providerName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(30, providerName);
            }
            j = i;
            if (providerLogoUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(31, providerLogoUrl);
            }
            i = j;
            if (nfcOfferCode != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(32, nfcOfferCode);
            }
            j = i;
            if (progressImageUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(33, progressImageUrl);
            }
            i = j;
            if (explosionDetails != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(34, explosionDetails);
            }
            j = i;
            if (isExploding != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(35, isExploding.booleanValue());
            }
            i = j;
            if (offerTypeCode != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(36, offerTypeCode);
            }
            j = i;
            if (progressMessage != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(37, progressMessage);
            }
            i = j;
            if (isRedeemableFromMobile != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(38, isRedeemableFromMobile.booleanValue());
            }
            j = i;
            if (isRedeemableFromDesktop != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(39, isRedeemableFromDesktop.booleanValue());
            }
            i = j;
            if (isRedeemableFromPrint != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(40, isRedeemableFromPrint.booleanValue());
            }
            j = i;
            if (acquisitionSource != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(41, acquisitionSource);
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
                codedoutputbytebuffernano.writeMessage(1, id);
            }
            if (imageUrl != null)
            {
                codedoutputbytebuffernano.writeString(2, imageUrl);
            }
            if (title != null)
            {
                codedoutputbytebuffernano.writeString(3, title);
            }
            if (shortDescription != null)
            {
                codedoutputbytebuffernano.writeString(4, shortDescription);
            }
            if (discountAmount != null)
            {
                codedoutputbytebuffernano.writeString(5, discountAmount);
            }
            if (longDescription != null)
            {
                codedoutputbytebuffernano.writeString(6, longDescription);
            }
            if (termsAndConditions != null)
            {
                codedoutputbytebuffernano.writeString(7, termsAndConditions);
            }
            if (sourceUrl != null)
            {
                codedoutputbytebuffernano.writeString(8, sourceUrl);
            }
            if (destStore != null)
            {
                codedoutputbytebuffernano.writeMessage(9, destStore);
            }
            if (expirationDate != null)
            {
                codedoutputbytebuffernano.writeMessage(10, expirationDate);
            }
            if (startDate != null)
            {
                codedoutputbytebuffernano.writeMessage(11, startDate);
            }
            if (merchantSpecifiedData != null)
            {
                codedoutputbytebuffernano.writeString(12, merchantSpecifiedData);
            }
            if (archiveTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(16, archiveTimeMillis.longValue());
            }
            if (clipTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(17, clipTimeMillis.longValue());
            }
            if (redemptionTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(18, redemptionTimeMillis.longValue());
            }
            if (offerType != null)
            {
                codedoutputbytebuffernano.writeInt32(19, offerType.intValue());
            }
            if (redemptionStrategy != null)
            {
                codedoutputbytebuffernano.writeInt32(20, redemptionStrategy.intValue());
            }
            if (nfcEligible != null)
            {
                codedoutputbytebuffernano.writeBool(21, nfcEligible.booleanValue());
            }
            if (redemptionState != null)
            {
                codedoutputbytebuffernano.writeInt32(22, redemptionState.intValue());
            }
            if (redemptionStateMessage != null)
            {
                codedoutputbytebuffernano.writeString(23, redemptionStateMessage);
            }
            if (googleOfferTemplateId != null)
            {
                codedoutputbytebuffernano.writeMessage(24, googleOfferTemplateId);
            }
            if (mifareApplicationId != null)
            {
                codedoutputbytebuffernano.writeUInt32(25, mifareApplicationId.intValue());
            }
            if (merchantOfferCode != null)
            {
                codedoutputbytebuffernano.writeString(26, merchantOfferCode);
            }
            if (metadata != null)
            {
                codedoutputbytebuffernano.writeMessage(27, metadata);
            }
            if (merchantUniqueId != null)
            {
                codedoutputbytebuffernano.writeFixed64(28, merchantUniqueId.longValue());
            }
            if (isMarketplace != null)
            {
                codedoutputbytebuffernano.writeBool(29, isMarketplace.booleanValue());
            }
            if (providerName != null)
            {
                codedoutputbytebuffernano.writeString(30, providerName);
            }
            if (providerLogoUrl != null)
            {
                codedoutputbytebuffernano.writeString(31, providerLogoUrl);
            }
            if (nfcOfferCode != null)
            {
                codedoutputbytebuffernano.writeString(32, nfcOfferCode);
            }
            if (progressImageUrl != null)
            {
                codedoutputbytebuffernano.writeString(33, progressImageUrl);
            }
            if (explosionDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(34, explosionDetails);
            }
            if (isExploding != null)
            {
                codedoutputbytebuffernano.writeBool(35, isExploding.booleanValue());
            }
            if (offerTypeCode != null)
            {
                codedoutputbytebuffernano.writeString(36, offerTypeCode);
            }
            if (progressMessage != null)
            {
                codedoutputbytebuffernano.writeString(37, progressMessage);
            }
            if (isRedeemableFromMobile != null)
            {
                codedoutputbytebuffernano.writeBool(38, isRedeemableFromMobile.booleanValue());
            }
            if (isRedeemableFromDesktop != null)
            {
                codedoutputbytebuffernano.writeBool(39, isRedeemableFromDesktop.booleanValue());
            }
            if (isRedeemableFromPrint != null)
            {
                codedoutputbytebuffernano.writeBool(40, isRedeemableFromPrint.booleanValue());
            }
            if (acquisitionSource != null)
            {
                codedoutputbytebuffernano.writeString(41, acquisitionSource);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Offer()
        {
            clear();
        }
    }

    public static final class Offer.ExplosionDetails extends ExtendableMessageNano
    {

        public Boolean active;
        public Long activeDurationBeforeExplosion;
        public String explosionRedemptionCode;
        public Long explosionTimeMillis;

        private Offer.ExplosionDetails clear()
        {
            active = null;
            explosionTimeMillis = null;
            activeDurationBeforeExplosion = null;
            explosionRedemptionCode = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Offer.ExplosionDetails mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    active = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 16: // '\020'
                    explosionTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 24: // '\030'
                    activeDurationBeforeExplosion = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 34: // '"'
                    explosionRedemptionCode = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (active != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(1, active.booleanValue());
            }
            j = i;
            if (explosionTimeMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, explosionTimeMillis.longValue());
            }
            i = j;
            if (activeDurationBeforeExplosion != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(3, activeDurationBeforeExplosion.longValue());
            }
            j = i;
            if (explosionRedemptionCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, explosionRedemptionCode);
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
            if (active != null)
            {
                codedoutputbytebuffernano.writeBool(1, active.booleanValue());
            }
            if (explosionTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(2, explosionTimeMillis.longValue());
            }
            if (activeDurationBeforeExplosion != null)
            {
                codedoutputbytebuffernano.writeInt64(3, activeDurationBeforeExplosion.longValue());
            }
            if (explosionRedemptionCode != null)
            {
                codedoutputbytebuffernano.writeString(4, explosionRedemptionCode);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Offer.ExplosionDetails()
        {
            clear();
        }
    }

    public static final class P2pCommercialUseSettings extends ExtendableMessageNano
    {

        public Integer p2PCommercialUseType;
        public Boolean recordCommercialUse;

        private P2pCommercialUseSettings clear()
        {
            recordCommercialUse = null;
            p2PCommercialUseType = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private P2pCommercialUseSettings mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
            recordCommercialUse = Boolean.valueOf(codedinputbytebuffernano.readBool());
              goto _L5
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
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
                p2PCommercialUseType = Integer.valueOf(j);
                break;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (recordCommercialUse != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(1, recordCommercialUse.booleanValue());
            }
            j = i;
            if (p2PCommercialUseType != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, p2PCommercialUseType.intValue());
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
            if (recordCommercialUse != null)
            {
                codedoutputbytebuffernano.writeBool(1, recordCommercialUse.booleanValue());
            }
            if (p2PCommercialUseType != null)
            {
                codedoutputbytebuffernano.writeInt32(2, p2PCommercialUseType.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public P2pCommercialUseSettings()
        {
            clear();
        }
    }

    public static final class PhoneNumber extends ExtendableMessageNano
    {

        public EntityIdentifier id;
        public String phoneNumber;

        private PhoneNumber clear()
        {
            id = null;
            phoneNumber = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PhoneNumber mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (id == null)
                    {
                        id = new EntityIdentifier();
                    }
                    codedinputbytebuffernano.readMessage(id);
                    break;

                case 18: // '\022'
                    phoneNumber = codedinputbytebuffernano.readString();
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
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
            }
            j = i;
            if (phoneNumber != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, phoneNumber);
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
                codedoutputbytebuffernano.writeMessage(1, id);
            }
            if (phoneNumber != null)
            {
                codedoutputbytebuffernano.writeString(2, phoneNumber);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PhoneNumber()
        {
            clear();
        }
    }

    public static final class PhysicalLocation extends ExtendableMessageNano
    {

        public Float accuracy;
        public Double latitude;
        public Double longitude;

        private PhysicalLocation clear()
        {
            latitude = null;
            longitude = null;
            accuracy = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PhysicalLocation mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 9: // '\t'
                    latitude = Double.valueOf(codedinputbytebuffernano.readDouble());
                    break;

                case 17: // '\021'
                    longitude = Double.valueOf(codedinputbytebuffernano.readDouble());
                    break;

                case 29: // '\035'
                    accuracy = Float.valueOf(codedinputbytebuffernano.readFloat());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (latitude != null)
            {
                i = j + CodedOutputByteBufferNano.computeDoubleSize(1, latitude.doubleValue());
            }
            j = i;
            if (longitude != null)
            {
                j = i + CodedOutputByteBufferNano.computeDoubleSize(2, longitude.doubleValue());
            }
            i = j;
            if (accuracy != null)
            {
                i = j + CodedOutputByteBufferNano.computeFloatSize(3, accuracy.floatValue());
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
            if (latitude != null)
            {
                codedoutputbytebuffernano.writeDouble(1, latitude.doubleValue());
            }
            if (longitude != null)
            {
                codedoutputbytebuffernano.writeDouble(2, longitude.doubleValue());
            }
            if (accuracy != null)
            {
                codedoutputbytebuffernano.writeFloat(3, accuracy.floatValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PhysicalLocation()
        {
            clear();
        }
    }

    public static final class PinToken extends ExtendableMessageNano
    {

        public Integer backend;
        public Long clientExpirationTime;
        public byte fingerprint[];
        public Long pinGeneration;
        public Long pinTokenTtlMinutes;
        public Long serverIssueTime;
        public Long tokenVersion;

        private PinToken clear()
        {
            clientExpirationTime = null;
            serverIssueTime = null;
            pinGeneration = null;
            tokenVersion = null;
            pinTokenTtlMinutes = null;
            backend = null;
            fingerprint = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PinToken mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L10:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 8: default 80
        //                       0: 89
        //                       8: 91
        //                       16: 105
        //                       32: 119
        //                       40: 133
        //                       50: 147
        //                       56: 158
        //                       64: 172;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L10; else goto _L2
_L2:
            return this;
_L3:
            clientExpirationTime = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L10
_L4:
            serverIssueTime = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L10
_L5:
            pinGeneration = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L10
_L6:
            tokenVersion = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L10
_L7:
            fingerprint = codedinputbytebuffernano.readBytes();
              goto _L10
_L8:
            pinTokenTtlMinutes = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L10
_L9:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
                backend = Integer.valueOf(j);
                break;
            }
            if (true) goto _L10; else goto _L11
_L11:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (clientExpirationTime != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, clientExpirationTime.longValue());
            }
            j = i;
            if (serverIssueTime != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, serverIssueTime.longValue());
            }
            i = j;
            if (pinGeneration != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(4, pinGeneration.longValue());
            }
            j = i;
            if (tokenVersion != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(5, tokenVersion.longValue());
            }
            i = j;
            if (fingerprint != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(6, fingerprint);
            }
            j = i;
            if (pinTokenTtlMinutes != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(7, pinTokenTtlMinutes.longValue());
            }
            i = j;
            if (backend != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(8, backend.intValue());
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
            if (clientExpirationTime != null)
            {
                codedoutputbytebuffernano.writeInt64(1, clientExpirationTime.longValue());
            }
            if (serverIssueTime != null)
            {
                codedoutputbytebuffernano.writeInt64(2, serverIssueTime.longValue());
            }
            if (pinGeneration != null)
            {
                codedoutputbytebuffernano.writeInt64(4, pinGeneration.longValue());
            }
            if (tokenVersion != null)
            {
                codedoutputbytebuffernano.writeInt64(5, tokenVersion.longValue());
            }
            if (fingerprint != null)
            {
                codedoutputbytebuffernano.writeBytes(6, fingerprint);
            }
            if (pinTokenTtlMinutes != null)
            {
                codedoutputbytebuffernano.writeInt64(7, pinTokenTtlMinutes.longValue());
            }
            if (backend != null)
            {
                codedoutputbytebuffernano.writeInt32(8, backend.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PinToken()
        {
            clear();
        }
    }

    public static final class PlasticProxyCardDetails extends ExtendableMessageNano
    {

        private static volatile PlasticProxyCardDetails _emptyArray[];
        public Integer fulfillmentStatus;
        public ProxyCard proxyCard;
        public ShippingInfo shippingInfo;

        private PlasticProxyCardDetails clear()
        {
            proxyCard = null;
            fulfillmentStatus = null;
            shippingInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static PlasticProxyCardDetails[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PlasticProxyCardDetails[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private PlasticProxyCardDetails mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       10: 59
        //                       16: 88
        //                       26: 142;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            if (proxyCard == null)
            {
                proxyCard = new ProxyCard();
            }
            codedinputbytebuffernano.readMessage(proxyCard);
              goto _L6
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                fulfillmentStatus = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            if (shippingInfo == null)
            {
                shippingInfo = new ShippingInfo();
            }
            codedinputbytebuffernano.readMessage(shippingInfo);
            if (true) goto _L6; else goto _L7
_L7:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (proxyCard != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, proxyCard);
            }
            j = i;
            if (fulfillmentStatus != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, fulfillmentStatus.intValue());
            }
            i = j;
            if (shippingInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, shippingInfo);
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
            if (proxyCard != null)
            {
                codedoutputbytebuffernano.writeMessage(1, proxyCard);
            }
            if (fulfillmentStatus != null)
            {
                codedoutputbytebuffernano.writeInt32(2, fulfillmentStatus.intValue());
            }
            if (shippingInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(3, shippingInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlasticProxyCardDetails()
        {
            clear();
        }
    }

    public static final class PlasticProxyCardDetails.ShippingInfo extends ExtendableMessageNano
    {

        public Integer maxCardEtaDays;
        public Integer minCardEtaDays;
        public Address shippingAddress;
        public Long shippingTimestampMillis;

        private PlasticProxyCardDetails.ShippingInfo clear()
        {
            shippingAddress = null;
            shippingTimestampMillis = null;
            minCardEtaDays = null;
            maxCardEtaDays = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PlasticProxyCardDetails.ShippingInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (shippingAddress == null)
                    {
                        shippingAddress = new Address();
                    }
                    codedinputbytebuffernano.readMessage(shippingAddress);
                    break;

                case 16: // '\020'
                    shippingTimestampMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 24: // '\030'
                    minCardEtaDays = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 32: // ' '
                    maxCardEtaDays = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (shippingAddress != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, shippingAddress);
            }
            j = i;
            if (shippingTimestampMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, shippingTimestampMillis.longValue());
            }
            i = j;
            if (minCardEtaDays != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, minCardEtaDays.intValue());
            }
            j = i;
            if (maxCardEtaDays != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, maxCardEtaDays.intValue());
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
            if (shippingAddress != null)
            {
                codedoutputbytebuffernano.writeMessage(1, shippingAddress);
            }
            if (shippingTimestampMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(2, shippingTimestampMillis.longValue());
            }
            if (minCardEtaDays != null)
            {
                codedoutputbytebuffernano.writeInt32(3, minCardEtaDays.intValue());
            }
            if (maxCardEtaDays != null)
            {
                codedoutputbytebuffernano.writeInt32(4, maxCardEtaDays.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlasticProxyCardDetails.ShippingInfo()
        {
            clear();
        }
    }

    public static final class ProvisioningInfo extends ExtendableMessageNano
    {

        private static volatile ProvisioningInfo _emptyArray[];
        public String correlationId;
        public String deprecatedAuthToken;
        public NanoWalletShared.DeviceContext deviceContext;
        public NanoWalletPartnerError.Error error;
        public EntityIdentifier id;
        public InternalProvisioningInfo internalProvisioningInfo;
        public Integer internalProvisioningState;
        public EntityMetadata metadata;
        public String partnerId;
        public Integer provisioningState;
        public String requestorIp;
        public String sessionId;
        public Long startTimeMillis;
        public TypedEntityIdentifier typedEntityIdentifier;
        public String userAgent;
        public NanoWalletShared.WalletContext walletContext;

        private ProvisioningInfo clear()
        {
            id = null;
            metadata = null;
            typedEntityIdentifier = null;
            correlationId = null;
            provisioningState = null;
            userAgent = null;
            internalProvisioningState = null;
            deviceContext = null;
            walletContext = null;
            partnerId = null;
            deprecatedAuthToken = null;
            error = null;
            internalProvisioningInfo = null;
            sessionId = null;
            startTimeMillis = null;
            requestorIp = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static ProvisioningInfo[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new ProvisioningInfo[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private ProvisioningInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L19:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 17: default 152
        //                       0: 161
        //                       10: 163
        //                       18: 192
        //                       26: 221
        //                       34: 250
        //                       40: 261
        //                       48: 318
        //                       58: 398
        //                       66: 427
        //                       74: 438
        //                       82: 449
        //                       90: 478
        //                       98: 507
        //                       104: 518
        //                       114: 532
        //                       122: 543
        //                       130: 572;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L19; else goto _L2
_L2:
            return this;
_L3:
            if (id == null)
            {
                id = new EntityIdentifier();
            }
            codedinputbytebuffernano.readMessage(id);
              goto _L19
_L4:
            if (metadata == null)
            {
                metadata = new EntityMetadata();
            }
            codedinputbytebuffernano.readMessage(metadata);
              goto _L19
_L5:
            if (typedEntityIdentifier == null)
            {
                typedEntityIdentifier = new TypedEntityIdentifier();
            }
            codedinputbytebuffernano.readMessage(typedEntityIdentifier);
              goto _L19
_L6:
            correlationId = codedinputbytebuffernano.readString();
              goto _L19
_L7:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
                provisioningState = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L8:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
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
                internalProvisioningState = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L9:
            if (deviceContext == null)
            {
                deviceContext = new NanoWalletShared.DeviceContext();
            }
            codedinputbytebuffernano.readMessage(deviceContext);
            continue; /* Loop/switch isn't completed */
_L10:
            partnerId = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L11:
            deprecatedAuthToken = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L12:
            if (error == null)
            {
                error = new NanoWalletPartnerError.Error();
            }
            codedinputbytebuffernano.readMessage(error);
            continue; /* Loop/switch isn't completed */
_L13:
            if (internalProvisioningInfo == null)
            {
                internalProvisioningInfo = new InternalProvisioningInfo();
            }
            codedinputbytebuffernano.readMessage(internalProvisioningInfo);
            continue; /* Loop/switch isn't completed */
_L14:
            sessionId = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L15:
            startTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
            continue; /* Loop/switch isn't completed */
_L16:
            userAgent = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L17:
            if (walletContext == null)
            {
                walletContext = new NanoWalletShared.WalletContext();
            }
            codedinputbytebuffernano.readMessage(walletContext);
            continue; /* Loop/switch isn't completed */
_L18:
            requestorIp = codedinputbytebuffernano.readString();
            if (true) goto _L19; else goto _L20
_L20:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (id != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
            }
            j = i;
            if (metadata != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, metadata);
            }
            i = j;
            if (typedEntityIdentifier != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, typedEntityIdentifier);
            }
            j = i;
            if (correlationId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, correlationId);
            }
            i = j;
            if (provisioningState != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(5, provisioningState.intValue());
            }
            j = i;
            if (internalProvisioningState != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(6, internalProvisioningState.intValue());
            }
            i = j;
            if (deviceContext != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, deviceContext);
            }
            j = i;
            if (partnerId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(8, partnerId);
            }
            i = j;
            if (deprecatedAuthToken != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(9, deprecatedAuthToken);
            }
            j = i;
            if (error != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(10, error);
            }
            i = j;
            if (internalProvisioningInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(11, internalProvisioningInfo);
            }
            j = i;
            if (sessionId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(12, sessionId);
            }
            i = j;
            if (startTimeMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(13, startTimeMillis.longValue());
            }
            j = i;
            if (userAgent != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(14, userAgent);
            }
            i = j;
            if (walletContext != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(15, walletContext);
            }
            j = i;
            if (requestorIp != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(16, requestorIp);
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
                codedoutputbytebuffernano.writeMessage(1, id);
            }
            if (metadata != null)
            {
                codedoutputbytebuffernano.writeMessage(2, metadata);
            }
            if (typedEntityIdentifier != null)
            {
                codedoutputbytebuffernano.writeMessage(3, typedEntityIdentifier);
            }
            if (correlationId != null)
            {
                codedoutputbytebuffernano.writeString(4, correlationId);
            }
            if (provisioningState != null)
            {
                codedoutputbytebuffernano.writeInt32(5, provisioningState.intValue());
            }
            if (internalProvisioningState != null)
            {
                codedoutputbytebuffernano.writeInt32(6, internalProvisioningState.intValue());
            }
            if (deviceContext != null)
            {
                codedoutputbytebuffernano.writeMessage(7, deviceContext);
            }
            if (partnerId != null)
            {
                codedoutputbytebuffernano.writeString(8, partnerId);
            }
            if (deprecatedAuthToken != null)
            {
                codedoutputbytebuffernano.writeString(9, deprecatedAuthToken);
            }
            if (error != null)
            {
                codedoutputbytebuffernano.writeMessage(10, error);
            }
            if (internalProvisioningInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(11, internalProvisioningInfo);
            }
            if (sessionId != null)
            {
                codedoutputbytebuffernano.writeString(12, sessionId);
            }
            if (startTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(13, startTimeMillis.longValue());
            }
            if (userAgent != null)
            {
                codedoutputbytebuffernano.writeString(14, userAgent);
            }
            if (walletContext != null)
            {
                codedoutputbytebuffernano.writeMessage(15, walletContext);
            }
            if (requestorIp != null)
            {
                codedoutputbytebuffernano.writeString(16, requestorIp);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ProvisioningInfo()
        {
            clear();
        }
    }

    public static final class ProxyCard extends ExtendableMessageNano
    {

        private static volatile ProxyCard _emptyArray[];
        public EntityIdentifier backingInstrumentId[];
        public Long cancellationTimestampMillis;
        public String cardNumberLast4;
        public CdpIdData cdpProxyId;
        public EntityIdentifier id;
        public LockingInfo lockingInfo;
        public Integer network;
        public Integer status;

        private ProxyCard clear()
        {
            id = null;
            backingInstrumentId = EntityIdentifier.emptyArray();
            cdpProxyId = null;
            network = null;
            cardNumberLast4 = null;
            status = null;
            cancellationTimestampMillis = null;
            lockingInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static ProxyCard[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new ProxyCard[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private ProxyCard mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L11:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 9: default 88
        //                       0: 97
        //                       10: 99
        //                       18: 128
        //                       26: 252
        //                       32: 281
        //                       42: 330
        //                       48: 341
        //                       56: 394
        //                       66: 408;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L11; else goto _L2
_L2:
            return this;
_L3:
            if (id == null)
            {
                id = new EntityIdentifier();
            }
            codedinputbytebuffernano.readMessage(id);
              goto _L11
_L4:
            int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
            EntityIdentifier aentityidentifier[];
            int j;
            if (backingInstrumentId == null)
            {
                j = 0;
            } else
            {
                j = backingInstrumentId.length;
            }
            aentityidentifier = new EntityIdentifier[j + i1];
            i1 = j;
            if (j != 0)
            {
                System.arraycopy(backingInstrumentId, 0, aentityidentifier, 0, j);
                i1 = j;
            }
            for (; i1 < aentityidentifier.length - 1; i1++)
            {
                aentityidentifier[i1] = new EntityIdentifier();
                codedinputbytebuffernano.readMessage(aentityidentifier[i1]);
                codedinputbytebuffernano.readTag();
            }

            aentityidentifier[i1] = new EntityIdentifier();
            codedinputbytebuffernano.readMessage(aentityidentifier[i1]);
            backingInstrumentId = aentityidentifier;
              goto _L11
_L5:
            if (cdpProxyId == null)
            {
                cdpProxyId = new CdpIdData();
            }
            codedinputbytebuffernano.readMessage(cdpProxyId);
              goto _L11
_L6:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                network = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            cardNumberLast4 = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L8:
            int l = codedinputbytebuffernano.readInt32();
            switch (l)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                status = Integer.valueOf(l);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L9:
            cancellationTimestampMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
            continue; /* Loop/switch isn't completed */
_L10:
            if (lockingInfo == null)
            {
                lockingInfo = new LockingInfo();
            }
            codedinputbytebuffernano.readMessage(lockingInfo);
            if (true) goto _L11; else goto _L12
_L12:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (id != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
            }
            j = i;
            if (backingInstrumentId != null)
            {
                j = i;
                if (backingInstrumentId.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= backingInstrumentId.length)
                        {
                            break;
                        }
                        EntityIdentifier entityidentifier = backingInstrumentId[k];
                        j = i;
                        if (entityidentifier != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(2, entityidentifier);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (cdpProxyId != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, cdpProxyId);
            }
            j = i;
            if (network != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, network.intValue());
            }
            i = j;
            if (cardNumberLast4 != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, cardNumberLast4);
            }
            j = i;
            if (status != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(6, status.intValue());
            }
            i = j;
            if (cancellationTimestampMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(7, cancellationTimestampMillis.longValue());
            }
            j = i;
            if (lockingInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(8, lockingInfo);
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
                codedoutputbytebuffernano.writeMessage(1, id);
            }
            if (backingInstrumentId != null && backingInstrumentId.length > 0)
            {
                for (int i = 0; i < backingInstrumentId.length; i++)
                {
                    EntityIdentifier entityidentifier = backingInstrumentId[i];
                    if (entityidentifier != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, entityidentifier);
                    }
                }

            }
            if (cdpProxyId != null)
            {
                codedoutputbytebuffernano.writeMessage(3, cdpProxyId);
            }
            if (network != null)
            {
                codedoutputbytebuffernano.writeInt32(4, network.intValue());
            }
            if (cardNumberLast4 != null)
            {
                codedoutputbytebuffernano.writeString(5, cardNumberLast4);
            }
            if (status != null)
            {
                codedoutputbytebuffernano.writeInt32(6, status.intValue());
            }
            if (cancellationTimestampMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(7, cancellationTimestampMillis.longValue());
            }
            if (lockingInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(8, lockingInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ProxyCard()
        {
            clear();
        }
    }

    public static final class ProxyCard.LockingInfo extends ExtendableMessageNano
    {

        public Integer lockingStatus;
        public Long lockingTimestampMillis;

        private ProxyCard.LockingInfo clear()
        {
            lockingStatus = null;
            lockingTimestampMillis = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ProxyCard.LockingInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       8: 51
        //                       16: 98;
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
            case 2: // '\002'
                lockingStatus = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            lockingTimestampMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (lockingStatus != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, lockingStatus.intValue());
            }
            j = i;
            if (lockingTimestampMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, lockingTimestampMillis.longValue());
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
            if (lockingStatus != null)
            {
                codedoutputbytebuffernano.writeInt32(1, lockingStatus.intValue());
            }
            if (lockingTimestampMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(2, lockingTimestampMillis.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ProxyCard.LockingInfo()
        {
            clear();
        }
    }

    public static final class ProxyDisplayInfo extends ExtendableMessageNano
    {

        public String cardNumberLast4;
        public Integer credentialNetwork;

        private ProxyDisplayInfo clear()
        {
            credentialNetwork = null;
            cardNumberLast4 = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ProxyDisplayInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       8: 51
        //                       18: 102;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                credentialNetwork = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            cardNumberLast4 = codedinputbytebuffernano.readString();
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (credentialNetwork != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, credentialNetwork.intValue());
            }
            j = i;
            if (cardNumberLast4 != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, cardNumberLast4);
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
            if (credentialNetwork != null)
            {
                codedoutputbytebuffernano.writeInt32(1, credentialNetwork.intValue());
            }
            if (cardNumberLast4 != null)
            {
                codedoutputbytebuffernano.writeString(2, cardNumberLast4);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ProxyDisplayInfo()
        {
            clear();
        }
    }

    public static final class RegistrationInfo extends ExtendableMessageNano
    {

        public AndroidIdRegistrationInfo androidIdRegistrationInfo;
        public ApnsRegistrationInfo apnsRegistrationInfo;
        public GcmRegistrationInfo gcmRegistrationInfo;
        public Integer type;

        private RegistrationInfo clear()
        {
            androidIdRegistrationInfo = null;
            gcmRegistrationInfo = null;
            apnsRegistrationInfo = null;
            type = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private RegistrationInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 65
        //                       10: 67
        //                       18: 96
        //                       26: 125
        //                       32: 154;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
            return this;
_L3:
            if (androidIdRegistrationInfo == null)
            {
                androidIdRegistrationInfo = new AndroidIdRegistrationInfo();
            }
            codedinputbytebuffernano.readMessage(androidIdRegistrationInfo);
              goto _L7
_L4:
            if (gcmRegistrationInfo == null)
            {
                gcmRegistrationInfo = new GcmRegistrationInfo();
            }
            codedinputbytebuffernano.readMessage(gcmRegistrationInfo);
              goto _L7
_L5:
            if (apnsRegistrationInfo == null)
            {
                apnsRegistrationInfo = new ApnsRegistrationInfo();
            }
            codedinputbytebuffernano.readMessage(apnsRegistrationInfo);
              goto _L7
_L6:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                type = Integer.valueOf(j);
                break;
            }
            if (true) goto _L7; else goto _L8
_L8:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (androidIdRegistrationInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, androidIdRegistrationInfo);
            }
            j = i;
            if (gcmRegistrationInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, gcmRegistrationInfo);
            }
            i = j;
            if (apnsRegistrationInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, apnsRegistrationInfo);
            }
            j = i;
            if (type != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, type.intValue());
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
            if (androidIdRegistrationInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(1, androidIdRegistrationInfo);
            }
            if (gcmRegistrationInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(2, gcmRegistrationInfo);
            }
            if (apnsRegistrationInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(3, apnsRegistrationInfo);
            }
            if (type != null)
            {
                codedoutputbytebuffernano.writeInt32(4, type.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RegistrationInfo()
        {
            clear();
        }
    }

    public static final class RestrictedInstrumentUse extends ExtendableMessageNano
    {

        private static volatile RestrictedInstrumentUse _emptyArray[];
        public String longMessage;
        public Restriction restriction;
        public String shortMessage;
        public InstrumentUse use;

        private RestrictedInstrumentUse clear()
        {
            use = null;
            restriction = null;
            shortMessage = null;
            longMessage = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static RestrictedInstrumentUse[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new RestrictedInstrumentUse[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private RestrictedInstrumentUse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (use == null)
                    {
                        use = new InstrumentUse();
                    }
                    codedinputbytebuffernano.readMessage(use);
                    break;

                case 18: // '\022'
                    if (restriction == null)
                    {
                        restriction = new Restriction();
                    }
                    codedinputbytebuffernano.readMessage(restriction);
                    break;

                case 26: // '\032'
                    shortMessage = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    longMessage = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (use != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, use);
            }
            j = i;
            if (restriction != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, restriction);
            }
            i = j;
            if (shortMessage != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, shortMessage);
            }
            j = i;
            if (longMessage != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, longMessage);
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
            if (use != null)
            {
                codedoutputbytebuffernano.writeMessage(1, use);
            }
            if (restriction != null)
            {
                codedoutputbytebuffernano.writeMessage(2, restriction);
            }
            if (shortMessage != null)
            {
                codedoutputbytebuffernano.writeString(3, shortMessage);
            }
            if (longMessage != null)
            {
                codedoutputbytebuffernano.writeString(4, longMessage);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RestrictedInstrumentUse()
        {
            clear();
        }
    }

    public static final class Restriction extends ExtendableMessageNano
    {

        public Integer reason;

        private Restriction clear()
        {
            reason = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Restriction mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 41
        //                       8: 43;
               goto _L1 _L2 _L3
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
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
                reason = Integer.valueOf(j);
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (reason != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, reason.intValue());
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
            if (reason != null)
            {
                codedoutputbytebuffernano.writeInt32(1, reason.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Restriction()
        {
            clear();
        }
    }

    public static final class Setting extends ExtendableMessageNano
    {

        public EntityIdentifier id;
        public String stringValue;

        private Setting clear()
        {
            id = null;
            stringValue = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Setting mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (id == null)
                    {
                        id = new EntityIdentifier();
                    }
                    codedinputbytebuffernano.readMessage(id);
                    break;

                case 18: // '\022'
                    stringValue = codedinputbytebuffernano.readString();
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
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
            }
            j = i;
            if (stringValue != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, stringValue);
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
                codedoutputbytebuffernano.writeMessage(1, id);
            }
            if (stringValue != null)
            {
                codedoutputbytebuffernano.writeString(2, stringValue);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Setting()
        {
            clear();
        }
    }

    public static final class Store extends ExtendableMessageNano
    {

        public Address businessAddress;
        public String businessName;
        public String id;
        public PhoneNumber phoneNumber;
        public PhysicalLocation redemptionLocation;
        public DisplayOnlyAddress storeAddress;
        public String websiteUrl;

        private Store clear()
        {
            id = null;
            businessName = null;
            phoneNumber = null;
            websiteUrl = null;
            businessAddress = null;
            redemptionLocation = null;
            storeAddress = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Store mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    id = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    businessName = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    if (phoneNumber == null)
                    {
                        phoneNumber = new PhoneNumber();
                    }
                    codedinputbytebuffernano.readMessage(phoneNumber);
                    break;

                case 34: // '"'
                    websiteUrl = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    if (businessAddress == null)
                    {
                        businessAddress = new Address();
                    }
                    codedinputbytebuffernano.readMessage(businessAddress);
                    break;

                case 50: // '2'
                    if (redemptionLocation == null)
                    {
                        redemptionLocation = new PhysicalLocation();
                    }
                    codedinputbytebuffernano.readMessage(redemptionLocation);
                    break;

                case 58: // ':'
                    if (storeAddress == null)
                    {
                        storeAddress = new DisplayOnlyAddress();
                    }
                    codedinputbytebuffernano.readMessage(storeAddress);
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
                i = j + CodedOutputByteBufferNano.computeStringSize(1, id);
            }
            j = i;
            if (businessName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, businessName);
            }
            i = j;
            if (phoneNumber != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, phoneNumber);
            }
            j = i;
            if (websiteUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, websiteUrl);
            }
            i = j;
            if (businessAddress != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, businessAddress);
            }
            j = i;
            if (redemptionLocation != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, redemptionLocation);
            }
            i = j;
            if (storeAddress != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, storeAddress);
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
            if (id != null)
            {
                codedoutputbytebuffernano.writeString(1, id);
            }
            if (businessName != null)
            {
                codedoutputbytebuffernano.writeString(2, businessName);
            }
            if (phoneNumber != null)
            {
                codedoutputbytebuffernano.writeMessage(3, phoneNumber);
            }
            if (websiteUrl != null)
            {
                codedoutputbytebuffernano.writeString(4, websiteUrl);
            }
            if (businessAddress != null)
            {
                codedoutputbytebuffernano.writeMessage(5, businessAddress);
            }
            if (redemptionLocation != null)
            {
                codedoutputbytebuffernano.writeMessage(6, redemptionLocation);
            }
            if (storeAddress != null)
            {
                codedoutputbytebuffernano.writeMessage(7, storeAddress);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Store()
        {
            clear();
        }
    }

    public static final class StoredValue extends ExtendableMessageNano
    {

        public DisplayableMoney balance;
        public Integer balanceState;
        public CdpIdData id;
        public DisplayableMoney pendingTopUpsTotal;
        public DisplayableMoney requiredTopUpAmount;

        private StoredValue clear()
        {
            id = null;
            balance = null;
            balanceState = null;
            pendingTopUpsTotal = null;
            requiredTopUpAmount = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private StoredValue mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 73
        //                       10: 75
        //                       18: 104
        //                       24: 133
        //                       34: 178
        //                       42: 207;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            if (id == null)
            {
                id = new CdpIdData();
            }
            codedinputbytebuffernano.readMessage(id);
              goto _L8
_L4:
            if (balance == null)
            {
                balance = new DisplayableMoney();
            }
            codedinputbytebuffernano.readMessage(balance);
              goto _L8
_L5:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                balanceState = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            if (pendingTopUpsTotal == null)
            {
                pendingTopUpsTotal = new DisplayableMoney();
            }
            codedinputbytebuffernano.readMessage(pendingTopUpsTotal);
            continue; /* Loop/switch isn't completed */
_L7:
            if (requiredTopUpAmount == null)
            {
                requiredTopUpAmount = new DisplayableMoney();
            }
            codedinputbytebuffernano.readMessage(requiredTopUpAmount);
            if (true) goto _L8; else goto _L9
_L9:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (id != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
            }
            j = i;
            if (balance != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, balance);
            }
            i = j;
            if (balanceState != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, balanceState.intValue());
            }
            j = i;
            if (pendingTopUpsTotal != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, pendingTopUpsTotal);
            }
            i = j;
            if (requiredTopUpAmount != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, requiredTopUpAmount);
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
            if (id != null)
            {
                codedoutputbytebuffernano.writeMessage(1, id);
            }
            if (balance != null)
            {
                codedoutputbytebuffernano.writeMessage(2, balance);
            }
            if (balanceState != null)
            {
                codedoutputbytebuffernano.writeInt32(3, balanceState.intValue());
            }
            if (pendingTopUpsTotal != null)
            {
                codedoutputbytebuffernano.writeMessage(4, pendingTopUpsTotal);
            }
            if (requiredTopUpAmount != null)
            {
                codedoutputbytebuffernano.writeMessage(5, requiredTopUpAmount);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public StoredValue()
        {
            clear();
        }
    }

    public static final class TorinoKeys extends ExtendableMessageNano
    {

        public String publicKey;

        private TorinoKeys clear()
        {
            publicKey = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private TorinoKeys mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    publicKey = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (publicKey != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, publicKey);
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
            if (publicKey != null)
            {
                codedoutputbytebuffernano.writeString(1, publicKey);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TorinoKeys()
        {
            clear();
        }
    }

    public static final class TransactionType extends ExtendableMessageNano
    {

        public Integer type;

        private TransactionType clear()
        {
            type = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private TransactionType mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 41
        //                       8: 43;
               goto _L1 _L2 _L3
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
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
                type = Integer.valueOf(j);
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (type != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, type.intValue());
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
            if (type != null)
            {
                codedoutputbytebuffernano.writeInt32(1, type.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TransactionType()
        {
            clear();
        }
    }

    public static final class TransferFee extends ExtendableMessageNano
    {

        private static volatile TransferFee _emptyArray[];
        public String currencyCode;
        public Long endOfPromotionalPeriodTimestampMillis;
        public DisplayableFee fee;
        public FundingSourceType fundingSourceType;
        public TransactionType transactionType;
        public Boolean waived;
        public DisplayableMoney waivedRemaining;

        private TransferFee clear()
        {
            currencyCode = null;
            transactionType = null;
            fundingSourceType = null;
            waived = null;
            fee = null;
            waivedRemaining = null;
            endOfPromotionalPeriodTimestampMillis = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static TransferFee[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new TransferFee[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private TransferFee mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    currencyCode = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    if (transactionType == null)
                    {
                        transactionType = new TransactionType();
                    }
                    codedinputbytebuffernano.readMessage(transactionType);
                    break;

                case 26: // '\032'
                    if (fundingSourceType == null)
                    {
                        fundingSourceType = new FundingSourceType();
                    }
                    codedinputbytebuffernano.readMessage(fundingSourceType);
                    break;

                case 32: // ' '
                    waived = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 42: // '*'
                    if (fee == null)
                    {
                        fee = new DisplayableFee();
                    }
                    codedinputbytebuffernano.readMessage(fee);
                    break;

                case 50: // '2'
                    if (waivedRemaining == null)
                    {
                        waivedRemaining = new DisplayableMoney();
                    }
                    codedinputbytebuffernano.readMessage(waivedRemaining);
                    break;

                case 64: // '@'
                    endOfPromotionalPeriodTimestampMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (currencyCode != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, currencyCode);
            }
            j = i;
            if (transactionType != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, transactionType);
            }
            i = j;
            if (fundingSourceType != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, fundingSourceType);
            }
            j = i;
            if (waived != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(4, waived.booleanValue());
            }
            i = j;
            if (fee != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, fee);
            }
            j = i;
            if (waivedRemaining != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, waivedRemaining);
            }
            i = j;
            if (endOfPromotionalPeriodTimestampMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(8, endOfPromotionalPeriodTimestampMillis.longValue());
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
            if (currencyCode != null)
            {
                codedoutputbytebuffernano.writeString(1, currencyCode);
            }
            if (transactionType != null)
            {
                codedoutputbytebuffernano.writeMessage(2, transactionType);
            }
            if (fundingSourceType != null)
            {
                codedoutputbytebuffernano.writeMessage(3, fundingSourceType);
            }
            if (waived != null)
            {
                codedoutputbytebuffernano.writeBool(4, waived.booleanValue());
            }
            if (fee != null)
            {
                codedoutputbytebuffernano.writeMessage(5, fee);
            }
            if (waivedRemaining != null)
            {
                codedoutputbytebuffernano.writeMessage(6, waivedRemaining);
            }
            if (endOfPromotionalPeriodTimestampMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(8, endOfPromotionalPeriodTimestampMillis.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TransferFee()
        {
            clear();
        }
    }

    public static final class TransferFee.FundingSourceType extends ExtendableMessageNano
    {

        public Integer type;

        private TransferFee.FundingSourceType clear()
        {
            type = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private TransferFee.FundingSourceType mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 41
        //                       8: 43;
               goto _L1 _L2 _L3
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                type = Integer.valueOf(j);
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (type != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, type.intValue());
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
            if (type != null)
            {
                codedoutputbytebuffernano.writeInt32(1, type.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TransferFee.FundingSourceType()
        {
            clear();
        }
    }

    public static final class TypedEntityIdentifier extends ExtendableMessageNano
    {

        public EntityIdentifier id;
        public Integer type;

        private TypedEntityIdentifier clear()
        {
            type = null;
            id = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private TypedEntityIdentifier mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       8: 51
        //                       18: 126;
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
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
                type = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (id == null)
            {
                id = new EntityIdentifier();
            }
            codedinputbytebuffernano.readMessage(id);
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (type != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, type.intValue());
            }
            j = i;
            if (id != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, id);
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
            if (type != null)
            {
                codedoutputbytebuffernano.writeInt32(1, type.intValue());
            }
            if (id != null)
            {
                codedoutputbytebuffernano.writeMessage(2, id);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TypedEntityIdentifier()
        {
            clear();
        }
    }

    public static final class UserInfo extends ExtendableMessageNano
    {

        public String billingCountry;
        public LatestLegalDocument latestLegalDocument;
        public String obfuscatedGaiaId;
        public Boolean walletAllowedInCountry;

        private UserInfo clear()
        {
            billingCountry = null;
            latestLegalDocument = null;
            walletAllowedInCountry = null;
            obfuscatedGaiaId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UserInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    billingCountry = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    if (latestLegalDocument == null)
                    {
                        latestLegalDocument = new LatestLegalDocument();
                    }
                    codedinputbytebuffernano.readMessage(latestLegalDocument);
                    break;

                case 24: // '\030'
                    walletAllowedInCountry = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 34: // '"'
                    obfuscatedGaiaId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (billingCountry != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, billingCountry);
            }
            j = i;
            if (latestLegalDocument != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, latestLegalDocument);
            }
            i = j;
            if (walletAllowedInCountry != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(3, walletAllowedInCountry.booleanValue());
            }
            j = i;
            if (obfuscatedGaiaId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, obfuscatedGaiaId);
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
            if (billingCountry != null)
            {
                codedoutputbytebuffernano.writeString(1, billingCountry);
            }
            if (latestLegalDocument != null)
            {
                codedoutputbytebuffernano.writeMessage(2, latestLegalDocument);
            }
            if (walletAllowedInCountry != null)
            {
                codedoutputbytebuffernano.writeBool(3, walletAllowedInCountry.booleanValue());
            }
            if (obfuscatedGaiaId != null)
            {
                codedoutputbytebuffernano.writeString(4, obfuscatedGaiaId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UserInfo()
        {
            clear();
        }
    }

}
