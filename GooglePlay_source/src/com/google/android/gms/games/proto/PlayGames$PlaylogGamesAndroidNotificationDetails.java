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

    private static volatile notificationType _emptyArray[];
    public String applicationId;
    public String notificationId;
    public int notificationType;

    public static cachedSize[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (!applicationId.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, applicationId);
        }
        j = i;
        if (!notificationId.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, notificationId);
        }
        i = j;
        if (notificationType != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, notificationType);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof notificationType))
            {
                return false;
            }
            obj = (notificationType)obj;
            if (applicationId == null)
            {
                if (((applicationId) (obj)).applicationId != null)
                {
                    return false;
                }
            } else
            if (!applicationId.equals(((applicationId) (obj)).applicationId))
            {
                return false;
            }
            if (notificationId == null)
            {
                if (((notificationId) (obj)).notificationId != null)
                {
                    return false;
                }
            } else
            if (!notificationId.equals(((notificationId) (obj)).notificationId))
            {
                return false;
            }
            if (notificationType != ((notificationType) (obj)).notificationType)
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
        int i;
        if (applicationId == null)
        {
            i = 0;
        } else
        {
            i = applicationId.hashCode();
        }
        if (notificationId != null)
        {
            j = notificationId.hashCode();
        }
        return (((k + 527) * 31 + i) * 31 + j) * 31 + notificationType;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 56
    //                   10: 58
    //                   18: 69
    //                   24: 80;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        applicationId = codedinputbytebuffernano.readString();
          goto _L6
_L4:
        notificationId = codedinputbytebuffernano.readString();
          goto _L6
_L5:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            notificationType = j;
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (!applicationId.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, applicationId);
        }
        if (!notificationId.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, notificationId);
        }
        if (notificationType != 0)
        {
            codedoutputbytebuffernano.writeInt32(3, notificationType);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Y()
    {
        applicationId = "";
        notificationId = "";
        notificationType = 0;
        cachedSize = -1;
    }
}
