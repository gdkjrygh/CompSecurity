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
//            DocDetails

public static final class cachedSize extends MessageNano
{

    public Links externalLinks;
    public boolean hasPrimaryRoleId;
    public int primaryRoleId;

    protected final int computeSerializedSize()
    {
        int j;
label0:
        {
            j = super.computeSerializedSize();
            int i = j;
            if (externalLinks != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, externalLinks);
            }
            if (primaryRoleId == 0)
            {
                j = i;
                if (!hasPrimaryRoleId)
                {
                    break label0;
                }
            }
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, primaryRoleId);
        }
        return j;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L5:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 48
    //                   10: 50
    //                   16: 79;
           goto _L1 _L2 _L3 _L4
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        if (externalLinks == null)
        {
            externalLinks = new Links();
        }
        codedinputbytebuffernano.readMessage(externalLinks);
          goto _L5
_L4:
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
            primaryRoleId = j;
            hasPrimaryRoleId = true;
            break;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (externalLinks != null)
        {
            codedoutputbytebuffernano.writeMessage(1, externalLinks);
        }
        if (primaryRoleId != 0 || hasPrimaryRoleId)
        {
            codedoutputbytebuffernano.writeInt32(2, primaryRoleId);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Links()
    {
        externalLinks = null;
        primaryRoleId = 0;
        hasPrimaryRoleId = false;
        cachedSize = -1;
    }
}
