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
//            DocumentV2

public static final class cachedSize extends MessageNano
{

    public Message circlePerson[];
    public long circlesTotal;
    public boolean hasCirclesTotal;
    public boolean hasSetByUser;
    public boolean hasTotal;
    public rofile oBSOLETECirclesProfiles[];
    public boolean setByUser;
    public long total;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasSetByUser)
            {
                i = j;
                if (!setByUser)
                {
                    break label0;
                }
            }
            i = j + (CodedOutputByteBufferNano.computeTagSize(1) + 1);
        }
        int i1;
label1:
        {
            if (!hasTotal)
            {
                i1 = i;
                if (total == 0L)
                {
                    break label1;
                }
            }
            i1 = i + CodedOutputByteBufferNano.computeInt64Size(2, total);
        }
        int k;
label2:
        {
            if (!hasCirclesTotal)
            {
                k = i1;
                if (circlesTotal == 0L)
                {
                    break label2;
                }
            }
            k = i1 + CodedOutputByteBufferNano.computeInt64Size(3, circlesTotal);
        }
        i = k;
        if (oBSOLETECirclesProfiles != null)
        {
            i = k;
            if (oBSOLETECirclesProfiles.length > 0)
            {
                i1 = 0;
                do
                {
                    i = k;
                    if (i1 >= oBSOLETECirclesProfiles.length)
                    {
                        break;
                    }
                    rofile rofile = oBSOLETECirclesProfiles[i1];
                    i = k;
                    if (rofile != null)
                    {
                        i = k + CodedOutputByteBufferNano.computeMessageSize(4, rofile);
                    }
                    i1++;
                    k = i;
                } while (true);
            }
        }
        i1 = i;
        if (circlePerson != null)
        {
            i1 = i;
            if (circlePerson.length > 0)
            {
                int l = 0;
                do
                {
                    i1 = i;
                    if (l >= circlePerson.length)
                    {
                        break;
                    }
                    rofile rofile1 = circlePerson[l];
                    i1 = i;
                    if (rofile1 != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.computeMessageSize(5, rofile1);
                    }
                    l++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
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

            case 8: // '\b'
                setByUser = codedinputbytebuffernano.readBool();
                hasSetByUser = true;
                break;

            case 16: // '\020'
                total = codedinputbytebuffernano.readRawVarint64();
                hasTotal = true;
                break;

            case 24: // '\030'
                circlesTotal = codedinputbytebuffernano.readRawVarint64();
                hasCirclesTotal = true;
                break;

            case 34: // '"'
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                rofile arofile[];
                int j;
                if (oBSOLETECirclesProfiles == null)
                {
                    j = 0;
                } else
                {
                    j = oBSOLETECirclesProfiles.length;
                }
                arofile = new rofile[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(oBSOLETECirclesProfiles, 0, arofile, 0, j);
                    l = j;
                }
                for (; l < arofile.length - 1; l++)
                {
                    arofile[l] = new rofile();
                    codedinputbytebuffernano.readMessage(arofile[l]);
                    codedinputbytebuffernano.readTag();
                }

                arofile[l] = new rofile();
                codedinputbytebuffernano.readMessage(arofile[l]);
                oBSOLETECirclesProfiles = arofile;
                break;

            case 42: // '*'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                rofile arofile1[];
                int k;
                if (circlePerson == null)
                {
                    k = 0;
                } else
                {
                    k = circlePerson.length;
                }
                arofile1 = new circlePerson[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(circlePerson, 0, arofile1, 0, k);
                    i1 = k;
                }
                for (; i1 < arofile1.length - 1; i1++)
                {
                    arofile1[i1] = new ();
                    codedinputbytebuffernano.readMessage(arofile1[i1]);
                    codedinputbytebuffernano.readTag();
                }

                arofile1[i1] = new ();
                codedinputbytebuffernano.readMessage(arofile1[i1]);
                circlePerson = arofile1;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasSetByUser || setByUser)
        {
            codedoutputbytebuffernano.writeBool(1, setByUser);
        }
        if (hasTotal || total != 0L)
        {
            codedoutputbytebuffernano.writeInt64(2, total);
        }
        if (hasCirclesTotal || circlesTotal != 0L)
        {
            codedoutputbytebuffernano.writeInt64(3, circlesTotal);
        }
        if (oBSOLETECirclesProfiles != null && oBSOLETECirclesProfiles.length > 0)
        {
            for (int i = 0; i < oBSOLETECirclesProfiles.length; i++)
            {
                rofile rofile = oBSOLETECirclesProfiles[i];
                if (rofile != null)
                {
                    codedoutputbytebuffernano.writeMessage(4, rofile);
                }
            }

        }
        if (circlePerson != null && circlePerson.length > 0)
        {
            for (int j = 0; j < circlePerson.length; j++)
            {
                rofile rofile1 = circlePerson[j];
                if (rofile1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(5, rofile1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public rofile()
    {
        setByUser = false;
        hasSetByUser = false;
        total = 0L;
        hasTotal = false;
        circlesTotal = 0L;
        hasCirclesTotal = false;
        circlePerson = rray();
        oBSOLETECirclesProfiles = rofile.emptyArray();
        cachedSize = -1;
    }
}
