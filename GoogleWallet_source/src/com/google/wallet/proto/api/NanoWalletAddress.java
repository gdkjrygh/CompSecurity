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

public interface NanoWalletAddress
{
    public static final class FetchAddressesRequest extends ExtendableMessageNano
    {

        private FetchAddressesRequest clear()
        {
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchAddressesRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public FetchAddressesRequest()
        {
            clear();
        }
    }

    public static final class FetchAddressesResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.Address addresses[];
        public com.google.wallet.proto.NanoWalletEntities.CdpIdData legalAddressId;

        private FetchAddressesResponse clear()
        {
            addresses = com.google.wallet.proto.NanoWalletEntities.Address.emptyArray();
            legalAddressId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchAddressesResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    com.google.wallet.proto.NanoWalletEntities.Address aaddress[];
                    int j;
                    if (addresses == null)
                    {
                        j = 0;
                    } else
                    {
                        j = addresses.length;
                    }
                    aaddress = new com.google.wallet.proto.NanoWalletEntities.Address[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(addresses, 0, aaddress, 0, j);
                        k = j;
                    }
                    for (; k < aaddress.length - 1; k++)
                    {
                        aaddress[k] = new com.google.wallet.proto.NanoWalletEntities.Address();
                        codedinputbytebuffernano.readMessage(aaddress[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    aaddress[k] = new com.google.wallet.proto.NanoWalletEntities.Address();
                    codedinputbytebuffernano.readMessage(aaddress[k]);
                    addresses = aaddress;
                    break;

                case 18: // '\022'
                    if (legalAddressId == null)
                    {
                        legalAddressId = new com.google.wallet.proto.NanoWalletEntities.CdpIdData();
                    }
                    codedinputbytebuffernano.readMessage(legalAddressId);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (addresses != null)
            {
                j = i;
                if (addresses.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= addresses.length)
                        {
                            break;
                        }
                        com.google.wallet.proto.NanoWalletEntities.Address address = addresses[k];
                        j = i;
                        if (address != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, address);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (legalAddressId != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, legalAddressId);
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
            if (addresses != null && addresses.length > 0)
            {
                for (int i = 0; i < addresses.length; i++)
                {
                    com.google.wallet.proto.NanoWalletEntities.Address address = addresses[i];
                    if (address != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, address);
                    }
                }

            }
            if (legalAddressId != null)
            {
                codedoutputbytebuffernano.writeMessage(2, legalAddressId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchAddressesResponse()
        {
            clear();
        }
    }

}
