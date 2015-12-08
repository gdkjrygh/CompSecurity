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

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{
    public static final class AccountStatus extends ExtendableMessageNano
    {

        public Integer status;

        private AccountStatus clear()
        {
            status = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private AccountStatus mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public AccountStatus()
        {
            clear();
        }
    }

    public static final class ChallengeDepositStatus extends ExtendableMessageNano
    {

        public Integer status;

        private ChallengeDepositStatus clear()
        {
            status = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ChallengeDepositStatus mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public ChallengeDepositStatus()
        {
            clear();
        }
    }

    public static final class YodleeIavStatus extends ExtendableMessageNano
    {

        public Integer status;

        private YodleeIavStatus clear()
        {
            status = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private YodleeIavStatus mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public YodleeIavStatus()
        {
            clear();
        }
    }


    private static volatile eMessage _emptyArray[];
    public String accountHolderName;
    public String accountNumberTrailingDigits;
    public AccountStatus accountStatus;
    public Integer accountType;
    public ChallengeDepositStatus challengeStatus;
    public YodleeIavStatus iavStatus;
    public YodleeIavStatus id;
    public String nickname;
    public strumentUse restrictedUses[];

    private YodleeIavStatus.status clear()
    {
        id = null;
        accountHolderName = null;
        accountType = null;
        accountNumberTrailingDigits = null;
        nickname = null;
        accountStatus = null;
        challengeStatus = null;
        iavStatus = null;
        restrictedUses = strumentUse.emptyArray();
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    public static cachedSize[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L12:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   10: 107
    //                   18: 136
    //                   24: 147
    //                   34: 194
    //                   42: 205
    //                   50: 216
    //                   58: 245
    //                   66: 274
    //                   74: 303;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        if (id == null)
        {
            id = new nit>();
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
        strumentUse astrumentuse[];
        int k;
        if (restrictedUses == null)
        {
            k = 0;
        } else
        {
            k = restrictedUses.length;
        }
        astrumentuse = new strumentUse[k + l];
        l = k;
        if (k != 0)
        {
            System.arraycopy(restrictedUses, 0, astrumentuse, 0, k);
            l = k;
        }
        for (; l < astrumentuse.length - 1; l++)
        {
            astrumentuse[l] = new strumentUse();
            codedinputbytebuffernano.readMessage(astrumentuse[l]);
            codedinputbytebuffernano.readTag();
        }

        astrumentuse[l] = new strumentUse();
        codedinputbytebuffernano.readMessage(astrumentuse[l]);
        restrictedUses = astrumentuse;
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
                    strumentUse strumentuse = restrictedUses[k];
                    l = i;
                    if (strumentuse != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(9, strumentuse);
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
                strumentUse strumentuse = restrictedUses[i];
                if (strumentuse != null)
                {
                    codedoutputbytebuffernano.writeMessage(9, strumentuse);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public YodleeIavStatus.clear()
    {
        clear();
    }
}
