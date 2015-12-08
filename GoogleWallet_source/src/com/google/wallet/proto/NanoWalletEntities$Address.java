// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    private static volatile eTo _emptyArray[];
    public a cdpAddressId;
    public String city;
    public String countryCode;
    public String dependentLocalityName;
    public entifier id;
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

    private clear clear()
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
                    id = new entifier();
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
                    cdpAddressId = new a();
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

    public entifier()
    {
        clear();
    }
}
