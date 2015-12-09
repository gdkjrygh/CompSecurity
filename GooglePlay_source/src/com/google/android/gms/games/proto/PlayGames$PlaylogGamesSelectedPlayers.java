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

    public int numAutomatch;
    public int source[];

    protected final int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int i = l;
        if (source != null)
        {
            i = l;
            if (source.length > 0)
            {
                int j = 0;
                for (i = 0; i < source.length; i++)
                {
                    j += CodedOutputByteBufferNano.computeInt32SizeNoTag(source[i]);
                }

                i = l + j + source.length * 1;
            }
        }
        int k = i;
        if (numAutomatch != 0)
        {
            k = i + CodedOutputByteBufferNano.computeInt32Size(2, numAutomatch);
        }
        return k;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof numAutomatch))
            {
                return false;
            }
            obj = (numAutomatch)obj;
            if (!InternalNano.equals(source, ((source) (obj)).source))
            {
                return false;
            }
            if (numAutomatch != ((numAutomatch) (obj)).numAutomatch)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return ((getClass().getName().hashCode() + 527) * 31 + InternalNano.hashCode(source)) * 31 + numAutomatch;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L20:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 52
    //                   0: 61
    //                   8: 63
    //                   10: 264
    //                   16: 502;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        int ai[];
        int j;
        int i1;
        i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 8);
        ai = new int[i1];
        j = 0;
        i = 0;
_L12:
        if (j >= i1) goto _L7; else goto _L6
_L6:
        int j1;
        if (j != 0)
        {
            codedinputbytebuffernano.readTag();
        }
        j1 = codedinputbytebuffernano.readRawVarint32();
        j1;
        JVM INSTR tableswitch 0 6: default 148
    //                   0 157
    //                   1 157
    //                   2 157
    //                   3 157
    //                   4 157
    //                   5 157
    //                   6 157;
           goto _L8 _L9 _L9 _L9 _L9 _L9 _L9 _L9
_L8:
        j++;
          goto _L10
_L9:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L8; else goto _L10
_L10:
        if (true) goto _L12; else goto _L11
_L11:
_L7:
        if (i != 0)
        {
            if (source == null)
            {
                j = 0;
            } else
            {
                j = source.length;
            }
            if (j == 0 && i == ai.length)
            {
                source = ai;
            } else
            {
                int ai1[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(source, 0, ai1, 0, j);
                }
                System.arraycopy(ai, 0, ai1, j, i);
                source = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l;
        l = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
        i = codedinputbytebuffernano.getPosition();
        j = 0;
_L18:
        if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
        {
            switch (codedinputbytebuffernano.readRawVarint32())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L14; else goto _L13
_L13:
        codedinputbytebuffernano.rewindToPosition(i);
        if (source == null)
        {
            i = 0;
        } else
        {
            i = source.length;
        }
        ai = new int[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(source, 0, ai, 0, i);
            j = i;
        }
_L16:
        if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
        {
            i = codedinputbytebuffernano.readRawVarint32();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        source = ai;
          goto _L14
        if (true) goto _L16; else goto _L15
_L15:
        if (true) goto _L18; else goto _L17
_L17:
_L14:
        codedinputbytebuffernano.popLimit(l);
        continue; /* Loop/switch isn't completed */
_L5:
        numAutomatch = codedinputbytebuffernano.readRawVarint32();
        if (true) goto _L20; else goto _L19
_L19:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (source != null && source.length > 0)
        {
            for (int i = 0; i < source.length; i++)
            {
                codedoutputbytebuffernano.writeInt32(1, source[i]);
            }

        }
        if (numAutomatch != 0)
        {
            codedoutputbytebuffernano.writeInt32(2, numAutomatch);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        source = WireFormatNano.EMPTY_INT_ARRAY;
        numAutomatch = 0;
        cachedSize = -1;
    }
}
