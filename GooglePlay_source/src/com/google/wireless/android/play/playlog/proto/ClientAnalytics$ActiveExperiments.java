// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wireless.android.play.playlog.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.FieldArray;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wireless.android.play.playlog.proto:
//            ClientAnalytics

public static final class cachedSize extends ExtendableMessageNano
{

    public String clientAlteringExperiment[];
    public int gwsExperiment[];
    public String otherExperiment[];
    public long playExperiment[];

    protected final int computeSerializedSize()
    {
        int l2 = super.computeSerializedSize();
        int i = l2;
        if (clientAlteringExperiment != null)
        {
            i = l2;
            if (clientAlteringExperiment.length > 0)
            {
                int l1 = 0;
                int j = 0;
                for (i = 0; i < clientAlteringExperiment.length;)
                {
                    String s = clientAlteringExperiment[i];
                    int j2 = l1;
                    int l = j;
                    if (s != null)
                    {
                        j2 = l1 + 1;
                        l = j + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    i++;
                    l1 = j2;
                    j = l;
                }

                i = l2 + j + l1 * 1;
            }
        }
        int k = i;
        if (otherExperiment != null)
        {
            k = i;
            if (otherExperiment.length > 0)
            {
                int k2 = 0;
                int i1 = 0;
                for (k = 0; k < otherExperiment.length;)
                {
                    String s1 = otherExperiment[k];
                    int i3 = k2;
                    int i2 = i1;
                    if (s1 != null)
                    {
                        i3 = k2 + 1;
                        i2 = i1 + CodedOutputByteBufferNano.computeStringSizeNoTag(s1);
                    }
                    k++;
                    k2 = i3;
                    i1 = i2;
                }

                k = i + i1 + k2 * 1;
            }
        }
        i = k;
        if (gwsExperiment != null)
        {
            i = k;
            if (gwsExperiment.length > 0)
            {
                int j1 = 0;
                for (i = 0; i < gwsExperiment.length; i++)
                {
                    j1 += CodedOutputByteBufferNano.computeInt32SizeNoTag(gwsExperiment[i]);
                }

                i = k + j1 + gwsExperiment.length * 1;
            }
        }
        k = i;
        if (playExperiment != null)
        {
            k = i;
            if (playExperiment.length > 0)
            {
                int k1 = 0;
                for (k = 0; k < playExperiment.length; k++)
                {
                    k1 += CodedOutputByteBufferNano.computeRawVarint64Size(playExperiment[k]);
                }

                k = i + k1 + playExperiment.length * 1;
            }
        }
        return k;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof playExperiment))
            {
                return false;
            }
            obj = (playExperiment)obj;
            if (!InternalNano.equals(clientAlteringExperiment, ((clientAlteringExperiment) (obj)).clientAlteringExperiment))
            {
                return false;
            }
            if (!InternalNano.equals(otherExperiment, ((otherExperiment) (obj)).otherExperiment))
            {
                return false;
            }
            if (!InternalNano.equals(gwsExperiment, ((gwsExperiment) (obj)).gwsExperiment))
            {
                return false;
            }
            if (!InternalNano.equals(playExperiment, ((playExperiment) (obj)).playExperiment))
            {
                return false;
            }
            if (unknownFieldData == null || unknownFieldData.isEmpty())
            {
                if (((unknownFieldData) (obj)).unknownFieldData != null && !((unknownFieldData) (obj)).unknownFieldData.isEmpty())
                {
                    return false;
                }
            } else
            {
                return unknownFieldData.equals(((unknownFieldData) (obj)).unknownFieldData);
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = getClass().getName().hashCode();
        int k = InternalNano.hashCode(clientAlteringExperiment);
        int l = InternalNano.hashCode(otherExperiment);
        int i1 = InternalNano.hashCode(gwsExperiment);
        int j1 = InternalNano.hashCode(playExperiment);
        int i;
        if (unknownFieldData == null || unknownFieldData.isEmpty())
        {
            i = 0;
        } else
        {
            i = unknownFieldData.hashCode();
        }
        return i + (((((j + 527) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31;
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
                if (storeUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int l1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                String as[];
                int j;
                if (clientAlteringExperiment == null)
                {
                    j = 0;
                } else
                {
                    j = clientAlteringExperiment.length;
                }
                as = new String[l1 + j];
                l1 = j;
                if (j != 0)
                {
                    System.arraycopy(clientAlteringExperiment, 0, as, 0, j);
                    l1 = j;
                }
                for (; l1 < as.length - 1; l1++)
                {
                    as[l1] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[l1] = codedinputbytebuffernano.readString();
                clientAlteringExperiment = as;
                break;

            case 18: // '\022'
                int i2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                String as1[];
                int k;
                if (otherExperiment == null)
                {
                    k = 0;
                } else
                {
                    k = otherExperiment.length;
                }
                as1 = new String[i2 + k];
                i2 = k;
                if (k != 0)
                {
                    System.arraycopy(otherExperiment, 0, as1, 0, k);
                    i2 = k;
                }
                for (; i2 < as1.length - 1; i2++)
                {
                    as1[i2] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as1[i2] = codedinputbytebuffernano.readString();
                otherExperiment = as1;
                break;

            case 24: // '\030'
                int j2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 24);
                int ai[];
                int l;
                if (gwsExperiment == null)
                {
                    l = 0;
                } else
                {
                    l = gwsExperiment.length;
                }
                ai = new int[j2 + l];
                j2 = l;
                if (l != 0)
                {
                    System.arraycopy(gwsExperiment, 0, ai, 0, l);
                    j2 = l;
                }
                for (; j2 < ai.length - 1; j2++)
                {
                    ai[j2] = codedinputbytebuffernano.readRawVarint32();
                    codedinputbytebuffernano.readTag();
                }

                ai[j2] = codedinputbytebuffernano.readRawVarint32();
                gwsExperiment = ai;
                break;

            case 26: // '\032'
                int j3 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                int i1 = codedinputbytebuffernano.getPosition();
                int k2;
                for (k2 = 0; codedinputbytebuffernano.getBytesUntilLimit() > 0; k2++)
                {
                    codedinputbytebuffernano.readRawVarint32();
                }

                codedinputbytebuffernano.rewindToPosition(i1);
                int ai1[];
                if (gwsExperiment == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = gwsExperiment.length;
                }
                ai1 = new int[k2 + i1];
                k2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(gwsExperiment, 0, ai1, 0, i1);
                    k2 = i1;
                }
                for (; k2 < ai1.length; k2++)
                {
                    ai1[k2] = codedinputbytebuffernano.readRawVarint32();
                }

                gwsExperiment = ai1;
                codedinputbytebuffernano.popLimit(j3);
                break;

            case 32: // ' '
                int l2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 32);
                long al[];
                int j1;
                if (playExperiment == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = playExperiment.length;
                }
                al = new long[l2 + j1];
                l2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(playExperiment, 0, al, 0, j1);
                    l2 = j1;
                }
                for (; l2 < al.length - 1; l2++)
                {
                    al[l2] = codedinputbytebuffernano.readRawVarint64();
                    codedinputbytebuffernano.readTag();
                }

                al[l2] = codedinputbytebuffernano.readRawVarint64();
                playExperiment = al;
                break;

            case 34: // '"'
                int k3 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                int k1 = codedinputbytebuffernano.getPosition();
                int i3;
                for (i3 = 0; codedinputbytebuffernano.getBytesUntilLimit() > 0; i3++)
                {
                    codedinputbytebuffernano.readRawVarint64();
                }

                codedinputbytebuffernano.rewindToPosition(k1);
                long al1[];
                if (playExperiment == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = playExperiment.length;
                }
                al1 = new long[i3 + k1];
                i3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(playExperiment, 0, al1, 0, k1);
                    i3 = k1;
                }
                for (; i3 < al1.length; i3++)
                {
                    al1[i3] = codedinputbytebuffernano.readRawVarint64();
                }

                playExperiment = al1;
                codedinputbytebuffernano.popLimit(k3);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (clientAlteringExperiment != null && clientAlteringExperiment.length > 0)
        {
            for (int i = 0; i < clientAlteringExperiment.length; i++)
            {
                String s = clientAlteringExperiment[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(1, s);
                }
            }

        }
        if (otherExperiment != null && otherExperiment.length > 0)
        {
            for (int j = 0; j < otherExperiment.length; j++)
            {
                String s1 = otherExperiment[j];
                if (s1 != null)
                {
                    codedoutputbytebuffernano.writeString(2, s1);
                }
            }

        }
        if (gwsExperiment != null && gwsExperiment.length > 0)
        {
            for (int k = 0; k < gwsExperiment.length; k++)
            {
                codedoutputbytebuffernano.writeInt32(3, gwsExperiment[k]);
            }

        }
        if (playExperiment != null && playExperiment.length > 0)
        {
            for (int l = 0; l < playExperiment.length; l++)
            {
                codedoutputbytebuffernano.writeInt64(4, playExperiment[l]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clientAlteringExperiment = WireFormatNano.EMPTY_STRING_ARRAY;
        otherExperiment = WireFormatNano.EMPTY_STRING_ARRAY;
        gwsExperiment = WireFormatNano.EMPTY_INT_ARRAY;
        playExperiment = WireFormatNano.EMPTY_LONG_ARRAY;
        unknownFieldData = null;
        cachedSize = -1;
    }
}
