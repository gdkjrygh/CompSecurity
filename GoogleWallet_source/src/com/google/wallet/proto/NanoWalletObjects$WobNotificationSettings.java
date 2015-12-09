// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletObjects

public static final class clear extends ExtendableMessageNano
{

    public Boolean geofencedNotificationsEnabled;
    public int geofencingControlledBy[];
    public int updatesControlledBy[];
    public Boolean updatesEnabled;

    private clear clear()
    {
        geofencedNotificationsEnabled = null;
        updatesEnabled = null;
        geofencingControlledBy = WireFormatNano.EMPTY_INT_ARRAY;
        updatesControlledBy = WireFormatNano.EMPTY_INT_ARRAY;
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

            case 8: // '\b'
                geofencedNotificationsEnabled = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 16: // '\020'
                updatesEnabled = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 24: // '\030'
                int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 24);
                int ai[];
                int j;
                if (geofencingControlledBy == null)
                {
                    j = 0;
                } else
                {
                    j = geofencingControlledBy.length;
                }
                ai = new int[j + j1];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(geofencingControlledBy, 0, ai, 0, j);
                    j1 = j;
                }
                for (; j1 < ai.length - 1; j1++)
                {
                    ai[j1] = codedinputbytebuffernano.readInt32();
                    codedinputbytebuffernano.readTag();
                }

                ai[j1] = codedinputbytebuffernano.readInt32();
                geofencingControlledBy = ai;
                break;

            case 26: // '\032'
                int j2 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                int k1 = 0;
                int k = codedinputbytebuffernano.getPosition();
                while (codedinputbytebuffernano.getBytesUntilLimit() > 0) 
                {
                    codedinputbytebuffernano.readInt32();
                    k1++;
                }
                codedinputbytebuffernano.rewindToPosition(k);
                int ai1[];
                if (geofencingControlledBy == null)
                {
                    k = 0;
                } else
                {
                    k = geofencingControlledBy.length;
                }
                ai1 = new int[k + k1];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(geofencingControlledBy, 0, ai1, 0, k);
                    k1 = k;
                }
                for (; k1 < ai1.length; k1++)
                {
                    ai1[k1] = codedinputbytebuffernano.readInt32();
                }

                geofencingControlledBy = ai1;
                codedinputbytebuffernano.popLimit(j2);
                break;

            case 32: // ' '
                int l1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 32);
                int ai2[];
                int l;
                if (updatesControlledBy == null)
                {
                    l = 0;
                } else
                {
                    l = updatesControlledBy.length;
                }
                ai2 = new int[l + l1];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(updatesControlledBy, 0, ai2, 0, l);
                    l1 = l;
                }
                for (; l1 < ai2.length - 1; l1++)
                {
                    ai2[l1] = codedinputbytebuffernano.readInt32();
                    codedinputbytebuffernano.readTag();
                }

                ai2[l1] = codedinputbytebuffernano.readInt32();
                updatesControlledBy = ai2;
                break;

            case 34: // '"'
                int k2 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                int i2 = 0;
                int i1 = codedinputbytebuffernano.getPosition();
                while (codedinputbytebuffernano.getBytesUntilLimit() > 0) 
                {
                    codedinputbytebuffernano.readInt32();
                    i2++;
                }
                codedinputbytebuffernano.rewindToPosition(i1);
                int ai3[];
                if (updatesControlledBy == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = updatesControlledBy.length;
                }
                ai3 = new int[i1 + i2];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(updatesControlledBy, 0, ai3, 0, i1);
                    i2 = i1;
                }
                for (; i2 < ai3.length; i2++)
                {
                    ai3[i2] = codedinputbytebuffernano.readInt32();
                }

                updatesControlledBy = ai3;
                codedinputbytebuffernano.popLimit(k2);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (geofencedNotificationsEnabled != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(1, geofencedNotificationsEnabled.booleanValue());
        }
        i = j;
        if (updatesEnabled != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(2, updatesEnabled.booleanValue());
        }
        j = i;
        if (geofencingControlledBy != null)
        {
            j = i;
            if (geofencingControlledBy.length > 0)
            {
                int k = 0;
                for (j = 0; j < geofencingControlledBy.length; j++)
                {
                    k += CodedOutputByteBufferNano.computeInt32SizeNoTag(geofencingControlledBy[j]);
                }

                j = i + k + geofencingControlledBy.length * 1;
            }
        }
        i = j;
        if (updatesControlledBy != null)
        {
            i = j;
            if (updatesControlledBy.length > 0)
            {
                int l = 0;
                for (i = 0; i < updatesControlledBy.length; i++)
                {
                    l += CodedOutputByteBufferNano.computeInt32SizeNoTag(updatesControlledBy[i]);
                }

                i = j + l + updatesControlledBy.length * 1;
            }
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
        if (geofencedNotificationsEnabled != null)
        {
            codedoutputbytebuffernano.writeBool(1, geofencedNotificationsEnabled.booleanValue());
        }
        if (updatesEnabled != null)
        {
            codedoutputbytebuffernano.writeBool(2, updatesEnabled.booleanValue());
        }
        if (geofencingControlledBy != null && geofencingControlledBy.length > 0)
        {
            for (int i = 0; i < geofencingControlledBy.length; i++)
            {
                codedoutputbytebuffernano.writeInt32(3, geofencingControlledBy[i]);
            }

        }
        if (updatesControlledBy != null && updatesControlledBy.length > 0)
        {
            for (int j = 0; j < updatesControlledBy.length; j++)
            {
                codedoutputbytebuffernano.writeInt32(4, updatesControlledBy[j]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
