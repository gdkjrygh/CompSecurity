// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface NewsstandDocDetails
{
    public static final class MagazineDetails extends MessageNano
    {

        public String deliveryFrequencyDescription;
        public String deviceAvailabilityDescriptionHtml;
        public boolean hasDeliveryFrequencyDescription;
        public boolean hasDeviceAvailabilityDescriptionHtml;
        public boolean hasParentDetailsUrl;
        public boolean hasPsvDescription;
        public String parentDetailsUrl;
        public String psvDescription;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasParentDetailsUrl)
                {
                    i = j;
                    if (parentDetailsUrl.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, parentDetailsUrl);
            }
            int k;
label1:
            {
                if (!hasDeviceAvailabilityDescriptionHtml)
                {
                    k = i;
                    if (deviceAvailabilityDescriptionHtml.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, deviceAvailabilityDescriptionHtml);
            }
label2:
            {
                if (!hasPsvDescription)
                {
                    i = k;
                    if (psvDescription.equals(""))
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(3, psvDescription);
            }
label3:
            {
                if (!hasDeliveryFrequencyDescription)
                {
                    k = i;
                    if (deliveryFrequencyDescription.equals(""))
                    {
                        break label3;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(4, deliveryFrequencyDescription);
            }
            return k;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    parentDetailsUrl = codedinputbytebuffernano.readString();
                    hasParentDetailsUrl = true;
                    break;

                case 18: // '\022'
                    deviceAvailabilityDescriptionHtml = codedinputbytebuffernano.readString();
                    hasDeviceAvailabilityDescriptionHtml = true;
                    break;

                case 26: // '\032'
                    psvDescription = codedinputbytebuffernano.readString();
                    hasPsvDescription = true;
                    break;

                case 34: // '"'
                    deliveryFrequencyDescription = codedinputbytebuffernano.readString();
                    hasDeliveryFrequencyDescription = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasParentDetailsUrl || !parentDetailsUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, parentDetailsUrl);
            }
            if (hasDeviceAvailabilityDescriptionHtml || !deviceAvailabilityDescriptionHtml.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, deviceAvailabilityDescriptionHtml);
            }
            if (hasPsvDescription || !psvDescription.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, psvDescription);
            }
            if (hasDeliveryFrequencyDescription || !deliveryFrequencyDescription.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, deliveryFrequencyDescription);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public MagazineDetails()
        {
            parentDetailsUrl = "";
            hasParentDetailsUrl = false;
            deviceAvailabilityDescriptionHtml = "";
            hasDeviceAvailabilityDescriptionHtml = false;
            psvDescription = "";
            hasPsvDescription = false;
            deliveryFrequencyDescription = "";
            hasDeliveryFrequencyDescription = false;
            cachedSize = -1;
        }
    }

}
