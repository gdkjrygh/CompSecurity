// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.location.country;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.Extension;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.location.country:
//            NanoPostaladdress

public static final class clear extends ExtendableMessageNano
{

    private static final isDisputed EMPTY_ARRAY[] = new isDisputed[0];
    public static final Extension messageSetExtension = Extension.createMessageTyped(11, com/google/location/country/NanoPostaladdress$PostalAddress, 0x1ad079aL);
    public String addressLine[];
    public String administrativeAreaName;
    public String countryName;
    public String countryNameCode;
    public String dependentLocalityName;
    public String dependentThoroughfareLeadingType;
    public String dependentThoroughfareName;
    public String dependentThoroughfarePostDirection;
    public String dependentThoroughfarePreDirection;
    public String dependentThoroughfareTrailingType;
    public String dependentThoroughfaresConnector;
    public String dependentThoroughfaresIndicator;
    public String dependentThoroughfaresType;
    public String firmName;
    public Boolean isDisputed;
    public String languageCode;
    public String localityName;
    public String postBoxNumber;
    public String postalCodeNumber;
    public String postalCodeNumberExtension;
    public String premiseName;
    public String recipientName;
    public String sortingCode;
    public String subAdministrativeAreaName;
    public String subPremiseName;
    public String thoroughfareLeadingType;
    public String thoroughfareName;
    public String thoroughfareNumber;
    public String thoroughfarePostDirection;
    public String thoroughfarePreDirection;
    public String thoroughfareTrailingType;

    private clear clear()
    {
        countryNameCode = null;
        countryName = null;
        isDisputed = null;
        languageCode = null;
        administrativeAreaName = null;
        subAdministrativeAreaName = null;
        localityName = null;
        dependentLocalityName = null;
        thoroughfareName = null;
        thoroughfarePreDirection = null;
        thoroughfareLeadingType = null;
        thoroughfareTrailingType = null;
        thoroughfarePostDirection = null;
        thoroughfareNumber = null;
        dependentThoroughfareName = null;
        dependentThoroughfaresIndicator = null;
        dependentThoroughfaresConnector = null;
        dependentThoroughfaresType = null;
        dependentThoroughfarePreDirection = null;
        dependentThoroughfareLeadingType = null;
        dependentThoroughfareTrailingType = null;
        dependentThoroughfarePostDirection = null;
        postalCodeNumber = null;
        postalCodeNumberExtension = null;
        sortingCode = null;
        postBoxNumber = null;
        premiseName = null;
        subPremiseName = null;
        addressLine = WireFormatNano.EMPTY_STRING_ARRAY;
        firmName = null;
        recipientName = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                countryNameCode = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                countryName = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                administrativeAreaName = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                subAdministrativeAreaName = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                localityName = codedinputbytebuffernano.readString();
                break;

            case 50: // '2'
                thoroughfareName = codedinputbytebuffernano.readString();
                break;

            case 58: // ':'
                thoroughfarePreDirection = codedinputbytebuffernano.readString();
                break;

            case 66: // 'B'
                thoroughfareLeadingType = codedinputbytebuffernano.readString();
                break;

            case 74: // 'J'
                thoroughfareTrailingType = codedinputbytebuffernano.readString();
                break;

            case 82: // 'R'
                thoroughfarePostDirection = codedinputbytebuffernano.readString();
                break;

            case 90: // 'Z'
                thoroughfareNumber = codedinputbytebuffernano.readString();
                break;

            case 98: // 'b'
                postalCodeNumber = codedinputbytebuffernano.readString();
                break;

            case 106: // 'j'
                postalCodeNumberExtension = codedinputbytebuffernano.readString();
                break;

            case 114: // 'r'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 114);
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

            case 122: // 'z'
                premiseName = codedinputbytebuffernano.readString();
                break;

            case 130: 
                subPremiseName = codedinputbytebuffernano.readString();
                break;

            case 138: 
                dependentLocalityName = codedinputbytebuffernano.readString();
                break;

            case 146: 
                dependentThoroughfaresIndicator = codedinputbytebuffernano.readString();
                break;

            case 154: 
                dependentThoroughfaresConnector = codedinputbytebuffernano.readString();
                break;

            case 162: 
                dependentThoroughfaresType = codedinputbytebuffernano.readString();
                break;

            case 170: 
                dependentThoroughfareName = codedinputbytebuffernano.readString();
                break;

            case 178: 
                dependentThoroughfarePreDirection = codedinputbytebuffernano.readString();
                break;

            case 186: 
                dependentThoroughfareLeadingType = codedinputbytebuffernano.readString();
                break;

            case 194: 
                dependentThoroughfareTrailingType = codedinputbytebuffernano.readString();
                break;

            case 202: 
                dependentThoroughfarePostDirection = codedinputbytebuffernano.readString();
                break;

            case 210: 
                languageCode = codedinputbytebuffernano.readString();
                break;

            case 218: 
                firmName = codedinputbytebuffernano.readString();
                break;

            case 226: 
                recipientName = codedinputbytebuffernano.readString();
                break;

            case 234: 
                sortingCode = codedinputbytebuffernano.readString();
                break;

            case 242: 
                postBoxNumber = codedinputbytebuffernano.readString();
                break;

            case 248: 
                isDisputed = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (countryNameCode != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, countryNameCode);
        }
        j = i;
        if (countryName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, countryName);
        }
        i = j;
        if (administrativeAreaName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, administrativeAreaName);
        }
        j = i;
        if (subAdministrativeAreaName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, subAdministrativeAreaName);
        }
        i = j;
        if (localityName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, localityName);
        }
        j = i;
        if (thoroughfareName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, thoroughfareName);
        }
        i = j;
        if (thoroughfarePreDirection != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(7, thoroughfarePreDirection);
        }
        j = i;
        if (thoroughfareLeadingType != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(8, thoroughfareLeadingType);
        }
        i = j;
        if (thoroughfareTrailingType != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(9, thoroughfareTrailingType);
        }
        j = i;
        if (thoroughfarePostDirection != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(10, thoroughfarePostDirection);
        }
        i = j;
        if (thoroughfareNumber != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(11, thoroughfareNumber);
        }
        j = i;
        if (postalCodeNumber != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(12, postalCodeNumber);
        }
        i = j;
        if (postalCodeNumberExtension != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(13, postalCodeNumberExtension);
        }
        j = i;
        if (addressLine != null)
        {
            j = i;
            if (addressLine.length > 0)
            {
                int i1 = 0;
                int k = 0;
                for (j = 0; j < addressLine.length;)
                {
                    String s = addressLine[j];
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
        if (premiseName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(15, premiseName);
        }
        j = i;
        if (subPremiseName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(16, subPremiseName);
        }
        i = j;
        if (dependentLocalityName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(17, dependentLocalityName);
        }
        j = i;
        if (dependentThoroughfaresIndicator != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(18, dependentThoroughfaresIndicator);
        }
        i = j;
        if (dependentThoroughfaresConnector != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(19, dependentThoroughfaresConnector);
        }
        j = i;
        if (dependentThoroughfaresType != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(20, dependentThoroughfaresType);
        }
        i = j;
        if (dependentThoroughfareName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(21, dependentThoroughfareName);
        }
        j = i;
        if (dependentThoroughfarePreDirection != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(22, dependentThoroughfarePreDirection);
        }
        i = j;
        if (dependentThoroughfareLeadingType != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(23, dependentThoroughfareLeadingType);
        }
        j = i;
        if (dependentThoroughfareTrailingType != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(24, dependentThoroughfareTrailingType);
        }
        i = j;
        if (dependentThoroughfarePostDirection != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(25, dependentThoroughfarePostDirection);
        }
        j = i;
        if (languageCode != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(26, languageCode);
        }
        i = j;
        if (firmName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(27, firmName);
        }
        j = i;
        if (recipientName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(28, recipientName);
        }
        i = j;
        if (sortingCode != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(29, sortingCode);
        }
        j = i;
        if (postBoxNumber != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(30, postBoxNumber);
        }
        i = j;
        if (isDisputed != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(31, isDisputed.booleanValue());
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
        if (countryNameCode != null)
        {
            codedoutputbytebuffernano.writeString(1, countryNameCode);
        }
        if (countryName != null)
        {
            codedoutputbytebuffernano.writeString(2, countryName);
        }
        if (administrativeAreaName != null)
        {
            codedoutputbytebuffernano.writeString(3, administrativeAreaName);
        }
        if (subAdministrativeAreaName != null)
        {
            codedoutputbytebuffernano.writeString(4, subAdministrativeAreaName);
        }
        if (localityName != null)
        {
            codedoutputbytebuffernano.writeString(5, localityName);
        }
        if (thoroughfareName != null)
        {
            codedoutputbytebuffernano.writeString(6, thoroughfareName);
        }
        if (thoroughfarePreDirection != null)
        {
            codedoutputbytebuffernano.writeString(7, thoroughfarePreDirection);
        }
        if (thoroughfareLeadingType != null)
        {
            codedoutputbytebuffernano.writeString(8, thoroughfareLeadingType);
        }
        if (thoroughfareTrailingType != null)
        {
            codedoutputbytebuffernano.writeString(9, thoroughfareTrailingType);
        }
        if (thoroughfarePostDirection != null)
        {
            codedoutputbytebuffernano.writeString(10, thoroughfarePostDirection);
        }
        if (thoroughfareNumber != null)
        {
            codedoutputbytebuffernano.writeString(11, thoroughfareNumber);
        }
        if (postalCodeNumber != null)
        {
            codedoutputbytebuffernano.writeString(12, postalCodeNumber);
        }
        if (postalCodeNumberExtension != null)
        {
            codedoutputbytebuffernano.writeString(13, postalCodeNumberExtension);
        }
        if (addressLine != null && addressLine.length > 0)
        {
            for (int i = 0; i < addressLine.length; i++)
            {
                String s = addressLine[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(14, s);
                }
            }

        }
        if (premiseName != null)
        {
            codedoutputbytebuffernano.writeString(15, premiseName);
        }
        if (subPremiseName != null)
        {
            codedoutputbytebuffernano.writeString(16, subPremiseName);
        }
        if (dependentLocalityName != null)
        {
            codedoutputbytebuffernano.writeString(17, dependentLocalityName);
        }
        if (dependentThoroughfaresIndicator != null)
        {
            codedoutputbytebuffernano.writeString(18, dependentThoroughfaresIndicator);
        }
        if (dependentThoroughfaresConnector != null)
        {
            codedoutputbytebuffernano.writeString(19, dependentThoroughfaresConnector);
        }
        if (dependentThoroughfaresType != null)
        {
            codedoutputbytebuffernano.writeString(20, dependentThoroughfaresType);
        }
        if (dependentThoroughfareName != null)
        {
            codedoutputbytebuffernano.writeString(21, dependentThoroughfareName);
        }
        if (dependentThoroughfarePreDirection != null)
        {
            codedoutputbytebuffernano.writeString(22, dependentThoroughfarePreDirection);
        }
        if (dependentThoroughfareLeadingType != null)
        {
            codedoutputbytebuffernano.writeString(23, dependentThoroughfareLeadingType);
        }
        if (dependentThoroughfareTrailingType != null)
        {
            codedoutputbytebuffernano.writeString(24, dependentThoroughfareTrailingType);
        }
        if (dependentThoroughfarePostDirection != null)
        {
            codedoutputbytebuffernano.writeString(25, dependentThoroughfarePostDirection);
        }
        if (languageCode != null)
        {
            codedoutputbytebuffernano.writeString(26, languageCode);
        }
        if (firmName != null)
        {
            codedoutputbytebuffernano.writeString(27, firmName);
        }
        if (recipientName != null)
        {
            codedoutputbytebuffernano.writeString(28, recipientName);
        }
        if (sortingCode != null)
        {
            codedoutputbytebuffernano.writeString(29, sortingCode);
        }
        if (postBoxNumber != null)
        {
            codedoutputbytebuffernano.writeString(30, postBoxNumber);
        }
        if (isDisputed != null)
        {
            codedoutputbytebuffernano.writeBool(31, isDisputed.booleanValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }


    public A()
    {
        clear();
    }
}
