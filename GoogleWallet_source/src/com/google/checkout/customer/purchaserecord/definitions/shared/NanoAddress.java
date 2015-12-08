// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.customer.purchaserecord.definitions.shared;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

public interface NanoAddress
{
    public static final class Address extends ExtendableMessageNano
    {

        public String address1;
        public String address2;
        public String address3;
        public String city;
        public String countryCode;
        public String postalCode;
        public String state;

        private Address clear()
        {
            address1 = null;
            address2 = null;
            address3 = null;
            city = null;
            state = null;
            countryCode = null;
            postalCode = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
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
                    address1 = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    address2 = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    address3 = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    city = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    state = codedinputbytebuffernano.readString();
                    break;

                case 50: // '2'
                    countryCode = codedinputbytebuffernano.readString();
                    break;

                case 58: // ':'
                    postalCode = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (address1 != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, address1);
            }
            j = i;
            if (address2 != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, address2);
            }
            i = j;
            if (address3 != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, address3);
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
            if (countryCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, countryCode);
            }
            i = j;
            if (postalCode != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(7, postalCode);
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
            if (address1 != null)
            {
                codedoutputbytebuffernano.writeString(1, address1);
            }
            if (address2 != null)
            {
                codedoutputbytebuffernano.writeString(2, address2);
            }
            if (address3 != null)
            {
                codedoutputbytebuffernano.writeString(3, address3);
            }
            if (city != null)
            {
                codedoutputbytebuffernano.writeString(4, city);
            }
            if (state != null)
            {
                codedoutputbytebuffernano.writeString(5, state);
            }
            if (countryCode != null)
            {
                codedoutputbytebuffernano.writeString(6, countryCode);
            }
            if (postalCode != null)
            {
                codedoutputbytebuffernano.writeString(7, postalCode);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Address()
        {
            clear();
        }
    }

}
