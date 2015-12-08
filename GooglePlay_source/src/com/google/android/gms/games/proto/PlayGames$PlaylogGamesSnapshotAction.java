// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.proto:
//            PlayGames

public static final class cachedSize extends MessageNano
{

    public int actionStatus;
    public int actionType;
    public long contentSizeBytes;
    public String coverImageFingerprintMd5;
    public String snapshotId;
    public int source;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (actionType != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, actionType);
        }
        j = i;
        if (!snapshotId.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, snapshotId);
        }
        i = j;
        if (source != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, source);
        }
        j = i;
        if (!coverImageFingerprintMd5.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, coverImageFingerprintMd5);
        }
        i = j;
        if (actionStatus != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(5, actionStatus);
        }
        j = i;
        if (contentSizeBytes != 0L)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(6, contentSizeBytes);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof contentSizeBytes))
            {
                return false;
            }
            obj = (contentSizeBytes)obj;
            if (actionType != ((actionType) (obj)).actionType)
            {
                return false;
            }
            if (snapshotId == null)
            {
                if (((snapshotId) (obj)).snapshotId != null)
                {
                    return false;
                }
            } else
            if (!snapshotId.equals(((snapshotId) (obj)).snapshotId))
            {
                return false;
            }
            if (source != ((source) (obj)).source)
            {
                return false;
            }
            if (coverImageFingerprintMd5 == null)
            {
                if (((coverImageFingerprintMd5) (obj)).coverImageFingerprintMd5 != null)
                {
                    return false;
                }
            } else
            if (!coverImageFingerprintMd5.equals(((coverImageFingerprintMd5) (obj)).coverImageFingerprintMd5))
            {
                return false;
            }
            if (actionStatus != ((actionStatus) (obj)).actionStatus)
            {
                return false;
            }
            if (contentSizeBytes != ((contentSizeBytes) (obj)).contentSizeBytes)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        int k = getClass().getName().hashCode();
        int l = actionType;
        int i;
        int i1;
        if (snapshotId == null)
        {
            i = 0;
        } else
        {
            i = snapshotId.hashCode();
        }
        i1 = source;
        if (coverImageFingerprintMd5 != null)
        {
            j = coverImageFingerprintMd5.hashCode();
        }
        return ((((((k + 527) * 31 + l) * 31 + i) * 31 + i1) * 31 + j) * 31 + actionStatus) * 31 + (int)(contentSizeBytes ^ contentSizeBytes >>> 32);
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L9:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 80
    //                   8: 82
    //                   18: 143
    //                   24: 154
    //                   34: 195
    //                   40: 206
    //                   48: 259;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
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
        snapshotId = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L5:
        int k = codedinputbytebuffernano.readRawVarint32();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
            source = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        coverImageFingerprintMd5 = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L7:
        int l = codedinputbytebuffernano.readRawVarint32();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            actionStatus = l;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        contentSizeBytes = codedinputbytebuffernano.readRawVarint64();
        if (true) goto _L9; else goto _L10
_L10:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (actionType != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, actionType);
        }
        if (!snapshotId.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, snapshotId);
        }
        if (source != 0)
        {
            codedoutputbytebuffernano.writeInt32(3, source);
        }
        if (!coverImageFingerprintMd5.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, coverImageFingerprintMd5);
        }
        if (actionStatus != 0)
        {
            codedoutputbytebuffernano.writeInt32(5, actionStatus);
        }
        if (contentSizeBytes != 0L)
        {
            codedoutputbytebuffernano.writeInt64(6, contentSizeBytes);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        actionType = 0;
        snapshotId = "";
        source = 0;
        coverImageFingerprintMd5 = "";
        actionStatus = 0;
        contentSizeBytes = 0L;
        cachedSize = -1;
    }
}
