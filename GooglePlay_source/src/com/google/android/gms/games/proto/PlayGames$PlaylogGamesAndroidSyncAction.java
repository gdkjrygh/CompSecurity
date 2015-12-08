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

    public String authority;
    public long durationMillis;
    public String feed;
    public boolean newSyncPending;
    public int numErrors;
    public boolean periodic;
    public boolean success;
    public int syncOps[];

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (!authority.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, authority);
        }
        j = i;
        if (!feed.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, feed);
        }
        i = j;
        if (durationMillis != 0L)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(3, durationMillis);
        }
        j = i;
        if (success)
        {
            j = i + (CodedOutputByteBufferNano.computeTagSize(4) + 1);
        }
        i = j;
        if (numErrors != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(5, numErrors);
        }
        j = i;
        if (newSyncPending)
        {
            j = i + (CodedOutputByteBufferNano.computeTagSize(6) + 1);
        }
        i = j;
        if (periodic)
        {
            i = j + (CodedOutputByteBufferNano.computeTagSize(7) + 1);
        }
        j = i;
        if (syncOps != null)
        {
            j = i;
            if (syncOps.length > 0)
            {
                int k = 0;
                for (j = 0; j < syncOps.length; j++)
                {
                    k += CodedOutputByteBufferNano.computeInt32SizeNoTag(syncOps[j]);
                }

                j = i + k + syncOps.length * 1;
            }
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof syncOps))
            {
                return false;
            }
            obj = (syncOps)obj;
            if (authority == null)
            {
                if (((authority) (obj)).authority != null)
                {
                    return false;
                }
            } else
            if (!authority.equals(((authority) (obj)).authority))
            {
                return false;
            }
            if (feed == null)
            {
                if (((feed) (obj)).feed != null)
                {
                    return false;
                }
            } else
            if (!feed.equals(((feed) (obj)).feed))
            {
                return false;
            }
            if (durationMillis != ((durationMillis) (obj)).durationMillis)
            {
                return false;
            }
            if (success != ((success) (obj)).success)
            {
                return false;
            }
            if (numErrors != ((numErrors) (obj)).numErrors)
            {
                return false;
            }
            if (newSyncPending != ((newSyncPending) (obj)).newSyncPending)
            {
                return false;
            }
            if (periodic != ((periodic) (obj)).periodic)
            {
                return false;
            }
            if (!InternalNano.equals(syncOps, ((syncOps) (obj)).syncOps))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        char c2 = '\u04CF';
        int k = getClass().getName().hashCode();
        int i;
        char c;
        char c1;
        int l;
        int i1;
        if (authority == null)
        {
            i = 0;
        } else
        {
            i = authority.hashCode();
        }
        if (feed != null)
        {
            j = feed.hashCode();
        }
        l = (int)(durationMillis ^ durationMillis >>> 32);
        if (success)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        i1 = numErrors;
        if (newSyncPending)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (!periodic)
        {
            c2 = '\u04D5';
        }
        return ((((((((k + 527) * 31 + i) * 31 + j) * 31 + l) * 31 + c) * 31 + i1) * 31 + c1) * 31 + c2) * 31 + InternalNano.hashCode(syncOps);
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L26:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 10: default 100
    //                   0: 109
    //                   10: 111
    //                   18: 122
    //                   24: 133
    //                   32: 144
    //                   40: 155
    //                   48: 166
    //                   56: 177
    //                   64: 188
    //                   66: 464;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        authority = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L4:
        feed = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L5:
        durationMillis = codedinputbytebuffernano.readRawVarint64();
        continue; /* Loop/switch isn't completed */
_L6:
        success = codedinputbytebuffernano.readBool();
        continue; /* Loop/switch isn't completed */
_L7:
        numErrors = codedinputbytebuffernano.readRawVarint32();
        continue; /* Loop/switch isn't completed */
_L8:
        newSyncPending = codedinputbytebuffernano.readBool();
        continue; /* Loop/switch isn't completed */
_L9:
        periodic = codedinputbytebuffernano.readBool();
        continue; /* Loop/switch isn't completed */
_L10:
        int ai[];
        int j;
        int i1;
        i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 64);
        ai = new int[i1];
        j = 0;
        i = 0;
_L18:
        if (j >= i1) goto _L13; else goto _L12
_L12:
        int j1;
        if (j != 0)
        {
            codedinputbytebuffernano.readTag();
        }
        j1 = codedinputbytebuffernano.readRawVarint32();
        j1;
        JVM INSTR tableswitch 0 24: default 348
    //                   0 357
    //                   1 357
    //                   2 357
    //                   3 357
    //                   4 357
    //                   5 357
    //                   6 357
    //                   7 357
    //                   8 357
    //                   9 357
    //                   10 357
    //                   11 357
    //                   12 357
    //                   13 357
    //                   14 357
    //                   15 357
    //                   16 357
    //                   17 357
    //                   18 357
    //                   19 357
    //                   20 357
    //                   21 357
    //                   22 357
    //                   23 357
    //                   24 357;
           goto _L14 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15
_L14:
        j++;
          goto _L16
_L15:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L14; else goto _L16
_L16:
        if (true) goto _L18; else goto _L17
_L17:
_L13:
        if (i != 0)
        {
            if (syncOps == null)
            {
                j = 0;
            } else
            {
                j = syncOps.length;
            }
            if (j == 0 && i == ai.length)
            {
                syncOps = ai;
            } else
            {
                int ai1[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(syncOps, 0, ai1, 0, j);
                }
                System.arraycopy(ai, 0, ai1, j, i);
                syncOps = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L11:
        int l;
        l = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
        i = codedinputbytebuffernano.getPosition();
        j = 0;
_L24:
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
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
            case 24: // '\030'
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L20; else goto _L19
_L19:
        codedinputbytebuffernano.rewindToPosition(i);
        if (syncOps == null)
        {
            i = 0;
        } else
        {
            i = syncOps.length;
        }
        ai = new int[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(syncOps, 0, ai, 0, i);
            j = i;
        }
_L22:
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
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
            case 24: // '\030'
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        syncOps = ai;
          goto _L20
        if (true) goto _L22; else goto _L21
_L21:
        if (true) goto _L24; else goto _L23
_L23:
_L20:
        codedinputbytebuffernano.popLimit(l);
        if (true) goto _L26; else goto _L25
_L25:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (!authority.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, authority);
        }
        if (!feed.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, feed);
        }
        if (durationMillis != 0L)
        {
            codedoutputbytebuffernano.writeInt64(3, durationMillis);
        }
        if (success)
        {
            codedoutputbytebuffernano.writeBool(4, success);
        }
        if (numErrors != 0)
        {
            codedoutputbytebuffernano.writeInt32(5, numErrors);
        }
        if (newSyncPending)
        {
            codedoutputbytebuffernano.writeBool(6, newSyncPending);
        }
        if (periodic)
        {
            codedoutputbytebuffernano.writeBool(7, periodic);
        }
        if (syncOps != null && syncOps.length > 0)
        {
            for (int i = 0; i < syncOps.length; i++)
            {
                codedoutputbytebuffernano.writeInt32(8, syncOps[i]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        authority = "";
        feed = "";
        durationMillis = 0L;
        success = false;
        numErrors = 0;
        newSyncPending = false;
        periodic = false;
        syncOps = WireFormatNano.EMPTY_INT_ARRAY;
        cachedSize = -1;
    }
}
