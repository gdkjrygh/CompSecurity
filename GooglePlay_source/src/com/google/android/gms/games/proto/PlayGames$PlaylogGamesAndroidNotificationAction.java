// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.proto:
//            PlayGames

public static final class cachedSize extends MessageNano
{

    public int actionType;
    public int displayedCount;
    public  notificationDetails[];
    public String notificationId[];

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (actionType != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, actionType);
        }
        j = i;
        if (notificationId != null)
        {
            j = i;
            if (notificationId.length > 0)
            {
                int k1 = 0;
                int l = 0;
                for (j = 0; j < notificationId.length;)
                {
                    String s = notificationId[j];
                    int l1 = k1;
                    int j1 = l;
                    if (s != null)
                    {
                        l1 = k1 + 1;
                        j1 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    j++;
                    k1 = l1;
                    l = j1;
                }

                j = i + l + k1 * 1;
            }
        }
        i = j;
        if (displayedCount != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, displayedCount);
        }
        int i1 = i;
        if (notificationDetails != null)
        {
            i1 = i;
            if (notificationDetails.length > 0)
            {
                int k = 0;
                do
                {
                    i1 = i;
                    if (k >= notificationDetails.length)
                    {
                        break;
                    }
                      = notificationDetails[k];
                    i1 = i;
                    if ( != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.computeMessageSize(4, );
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof notificationDetails))
            {
                return false;
            }
            obj = (notificationDetails)obj;
            if (actionType != ((actionType) (obj)).actionType)
            {
                return false;
            }
            if (!InternalNano.equals(notificationId, ((notificationId) (obj)).notificationId))
            {
                return false;
            }
            if (displayedCount != ((displayedCount) (obj)).displayedCount)
            {
                return false;
            }
            if (!InternalNano.equals(notificationDetails, ((notificationDetails) (obj)).notificationDetails))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return ((((getClass().getName().hashCode() + 527) * 31 + actionType) * 31 + InternalNano.hashCode(notificationId)) * 31 + displayedCount) * 31 + InternalNano.hashCode(notificationDetails);
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L7:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 64
    //                   8: 66
    //                   18: 127
    //                   24: 229
    //                   34: 240;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            actionType = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
        String as[];
        int k;
        if (notificationId == null)
        {
            k = 0;
        } else
        {
            k = notificationId.length;
        }
        as = new String[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(notificationId, 0, as, 0, k);
            i1 = k;
        }
        for (; i1 < as.length - 1; i1++)
        {
            as[i1] = codedinputbytebuffernano.readString();
            codedinputbytebuffernano.readTag();
        }

        as[i1] = codedinputbytebuffernano.readString();
        notificationId = as;
        continue; /* Loop/switch isn't completed */
_L5:
        displayedCount = codedinputbytebuffernano.readRawVarint32();
        continue; /* Loop/switch isn't completed */
_L6:
        int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
         a[];
        int l;
        if (notificationDetails == null)
        {
            l = 0;
        } else
        {
            l = notificationDetails.length;
        }
        a = new [j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(notificationDetails, 0, a, 0, l);
            j1 = l;
        }
        for (; j1 < a.length - 1; j1++)
        {
            a[j1] = new ();
            codedinputbytebuffernano.readMessage(a[j1]);
            codedinputbytebuffernano.readTag();
        }

        a[j1] = new ();
        codedinputbytebuffernano.readMessage(a[j1]);
        notificationDetails = a;
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (actionType != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, actionType);
        }
        if (notificationId != null && notificationId.length > 0)
        {
            for (int i = 0; i < notificationId.length; i++)
            {
                String s = notificationId[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(2, s);
                }
            }

        }
        if (displayedCount != 0)
        {
            codedoutputbytebuffernano.writeInt32(3, displayedCount);
        }
        if (notificationDetails != null && notificationDetails.length > 0)
        {
            for (int j = 0; j < notificationDetails.length; j++)
            {
                  = notificationDetails[j];
                if ( != null)
                {
                    codedoutputbytebuffernano.writeMessage(4, );
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        actionType = 0;
        notificationId = WireFormatNano.EMPTY_STRING_ARRAY;
        displayedCount = 0;
        notificationDetails = .emptyArray();
        cachedSize = -1;
    }
}
