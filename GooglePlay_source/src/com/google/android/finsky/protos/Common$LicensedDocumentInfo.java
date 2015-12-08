// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            Common

public static final class cachedSize extends MessageNano
{

    public long assignedByGaiaId;
    public String dEPRECATEDAssignmentId;
    public long gaiaGroupId[];
    public String groupLicenseCheckoutOrderId;
    public dEPRECATEDAssignmentId groupLicenseKey;
    public boolean hasAssignedByGaiaId;
    public boolean hasDEPRECATEDAssignmentId;
    public boolean hasGroupLicenseCheckoutOrderId;

    protected final int computeSerializedSize()
    {
        int l;
label0:
        {
            l = super.computeSerializedSize();
            int i = l;
            if (gaiaGroupId != null)
            {
                i = l;
                if (gaiaGroupId.length > 0)
                {
                    i = l + gaiaGroupId.length * 8 + gaiaGroupId.length * 1;
                }
            }
            if (!hasGroupLicenseCheckoutOrderId)
            {
                l = i;
                if (groupLicenseCheckoutOrderId.equals(""))
                {
                    break label0;
                }
            }
            l = i + CodedOutputByteBufferNano.computeStringSize(2, groupLicenseCheckoutOrderId);
        }
label1:
        {
            int j = l;
            if (groupLicenseKey != null)
            {
                j = l + CodedOutputByteBufferNano.computeMessageSize(3, groupLicenseKey);
            }
            if (!hasAssignedByGaiaId)
            {
                l = j;
                if (assignedByGaiaId == 0L)
                {
                    break label1;
                }
            }
            l = j + (CodedOutputByteBufferNano.computeTagSize(4) + 8);
        }
        int k;
label2:
        {
            if (!hasDEPRECATEDAssignmentId)
            {
                k = l;
                if (dEPRECATEDAssignmentId.equals(""))
                {
                    break label2;
                }
            }
            k = l + CodedOutputByteBufferNano.computeStringSize(5, dEPRECATEDAssignmentId);
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

            case 9: // '\t'
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 9);
                long al[];
                int j;
                if (gaiaGroupId == null)
                {
                    j = 0;
                } else
                {
                    j = gaiaGroupId.length;
                }
                al = new long[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(gaiaGroupId, 0, al, 0, j);
                    l = j;
                }
                for (; l < al.length - 1; l++)
                {
                    al[l] = codedinputbytebuffernano.readRawLittleEndian64();
                    codedinputbytebuffernano.readTag();
                }

                al[l] = codedinputbytebuffernano.readRawLittleEndian64();
                gaiaGroupId = al;
                break;

            case 10: // '\n'
                int k = codedinputbytebuffernano.readRawVarint32();
                int j1 = codedinputbytebuffernano.pushLimit(k);
                int i1 = k / 8;
                long al1[];
                if (gaiaGroupId == null)
                {
                    k = 0;
                } else
                {
                    k = gaiaGroupId.length;
                }
                al1 = new long[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(gaiaGroupId, 0, al1, 0, k);
                    i1 = k;
                }
                for (; i1 < al1.length; i1++)
                {
                    al1[i1] = codedinputbytebuffernano.readRawLittleEndian64();
                }

                gaiaGroupId = al1;
                codedinputbytebuffernano.popLimit(j1);
                break;

            case 18: // '\022'
                groupLicenseCheckoutOrderId = codedinputbytebuffernano.readString();
                hasGroupLicenseCheckoutOrderId = true;
                break;

            case 26: // '\032'
                if (groupLicenseKey == null)
                {
                    groupLicenseKey = new >();
                }
                codedinputbytebuffernano.readMessage(groupLicenseKey);
                break;

            case 33: // '!'
                assignedByGaiaId = codedinputbytebuffernano.readRawLittleEndian64();
                hasAssignedByGaiaId = true;
                break;

            case 42: // '*'
                dEPRECATEDAssignmentId = codedinputbytebuffernano.readString();
                hasDEPRECATEDAssignmentId = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (gaiaGroupId != null && gaiaGroupId.length > 0)
        {
            for (int i = 0; i < gaiaGroupId.length; i++)
            {
                codedoutputbytebuffernano.writeFixed64(1, gaiaGroupId[i]);
            }

        }
        if (hasGroupLicenseCheckoutOrderId || !groupLicenseCheckoutOrderId.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, groupLicenseCheckoutOrderId);
        }
        if (groupLicenseKey != null)
        {
            codedoutputbytebuffernano.writeMessage(3, groupLicenseKey);
        }
        if (hasAssignedByGaiaId || assignedByGaiaId != 0L)
        {
            codedoutputbytebuffernano.writeFixed64(4, assignedByGaiaId);
        }
        if (hasDEPRECATEDAssignmentId || !dEPRECATEDAssignmentId.equals(""))
        {
            codedoutputbytebuffernano.writeString(5, dEPRECATEDAssignmentId);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        gaiaGroupId = WireFormatNano.EMPTY_LONG_ARRAY;
        groupLicenseCheckoutOrderId = "";
        hasGroupLicenseCheckoutOrderId = false;
        groupLicenseKey = null;
        assignedByGaiaId = 0L;
        hasAssignedByGaiaId = false;
        dEPRECATEDAssignmentId = "";
        hasDEPRECATEDAssignmentId = false;
        cachedSize = -1;
    }
}
