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

    public  account;
    public  androidAction;
    public  gplusUpgrade;
    public int type;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (account != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, account);
        }
        j = i;
        if (gplusUpgrade != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, gplusUpgrade);
        }
        i = j;
        if (type != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, type);
        }
        j = i;
        if (androidAction != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, androidAction);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof androidAction))
        {
            return false;
        }
        obj = (androidAction)obj;
        if (account == null)
        {
            if (((account) (obj)).account != null)
            {
                return false;
            }
        } else
        if (!account.equals(((.equals) (obj)).account))
        {
            return false;
        }
        if (gplusUpgrade == null)
        {
            if (((gplusUpgrade) (obj)).gplusUpgrade != null)
            {
                return false;
            }
        } else
        if (!gplusUpgrade.equals(((equals) (obj)).gplusUpgrade))
        {
            return false;
        }
        if (type != ((type) (obj)).type)
        {
            return false;
        }
        if (androidAction != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((androidAction) (obj)).androidAction == null) goto _L1; else goto _L3
_L3:
        return false;
        if (androidAction.equals(((.equals) (obj)).androidAction)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int k = 0;
        int l = getClass().getName().hashCode();
        int i;
        int j;
        int i1;
        if (account == null)
        {
            i = 0;
        } else
        {
            i = account.hashCode();
        }
        if (gplusUpgrade == null)
        {
            j = 0;
        } else
        {
            j = gplusUpgrade.hashCode();
        }
        i1 = type;
        if (androidAction != null)
        {
            k = androidAction.hashCode();
        }
        return ((((l + 527) * 31 + i) * 31 + j) * 31 + i1) * 31 + k;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L7:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 64
    //                   10: 66
    //                   18: 95
    //                   24: 124
    //                   34: 171;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        if (account == null)
        {
            account = new ();
        }
        codedinputbytebuffernano.readMessage(account);
          goto _L7
_L4:
        if (gplusUpgrade == null)
        {
            gplusUpgrade = new <init>();
        }
        codedinputbytebuffernano.readMessage(gplusUpgrade);
          goto _L7
_L5:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            type = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (androidAction == null)
        {
            androidAction = new ();
        }
        codedinputbytebuffernano.readMessage(androidAction);
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (account != null)
        {
            codedoutputbytebuffernano.writeMessage(1, account);
        }
        if (gplusUpgrade != null)
        {
            codedoutputbytebuffernano.writeMessage(2, gplusUpgrade);
        }
        if (type != 0)
        {
            codedoutputbytebuffernano.writeInt32(3, type);
        }
        if (androidAction != null)
        {
            codedoutputbytebuffernano.writeMessage(4, androidAction);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        account = null;
        gplusUpgrade = null;
        type = 0;
        androidAction = null;
        cachedSize = -1;
    }
}
