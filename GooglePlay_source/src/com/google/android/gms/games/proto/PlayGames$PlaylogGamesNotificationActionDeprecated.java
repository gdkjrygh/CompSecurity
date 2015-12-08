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
    public String notificationId[];

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (actionType != 1)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, actionType);
        }
        j = i;
        if (notificationId != null)
        {
            j = i;
            if (notificationId.length > 0)
            {
                int i1 = 0;
                int k = 0;
                for (j = 0; j < notificationId.length;)
                {
                    String s = notificationId[j];
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
        if (displayedCount != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, displayedCount);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof displayedCount))
            {
                return false;
            }
            obj = (displayedCount)obj;
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
        }
        return true;
    }

    public final int hashCode()
    {
        return (((getClass().getName().hashCode() + 527) * 31 + actionType) * 31 + InternalNano.hashCode(notificationId)) * 31 + displayedCount;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 56
    //                   8: 58
    //                   18: 115
    //                   24: 217;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
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
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
        String as[];
        int k;
        if (notificationId == null)
        {
            k = 0;
        } else
        {
            k = notificationId.length;
        }
        as = new String[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(notificationId, 0, as, 0, k);
            l = k;
        }
        for (; l < as.length - 1; l++)
        {
            as[l] = codedinputbytebuffernano.readString();
            codedinputbytebuffernano.readTag();
        }

        as[l] = codedinputbytebuffernano.readString();
        notificationId = as;
        continue; /* Loop/switch isn't completed */
_L5:
        displayedCount = codedinputbytebuffernano.readRawVarint32();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (actionType != 1)
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
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        actionType = 1;
        notificationId = WireFormatNano.EMPTY_STRING_ARRAY;
        displayedCount = 0;
        cachedSize = -1;
    }
}
