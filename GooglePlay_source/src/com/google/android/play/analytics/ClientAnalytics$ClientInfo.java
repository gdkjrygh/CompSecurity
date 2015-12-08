// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.analytics;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.play.analytics:
//            ClientAnalytics

public static final class cachedSize extends MessageNano
{

    public ntInfo androidClientInfo;
    public int clientType;
    public ntInfo desktopClientInfo;
    public fo iosClientInfo;
    public tInfo playCeClientInfo;
    public String remoteHost;
    public String remoteHost6;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (clientType != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, clientType);
        }
        j = i;
        if (androidClientInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, androidClientInfo);
        }
        i = j;
        if (desktopClientInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, desktopClientInfo);
        }
        j = i;
        if (iosClientInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, iosClientInfo);
        }
        i = j;
        if (playCeClientInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, playCeClientInfo);
        }
        j = i;
        if (!remoteHost.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, remoteHost);
        }
        i = j;
        if (!remoteHost6.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(7, remoteHost6);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L10:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 88
    //                   8: 90
    //                   18: 151
    //                   26: 180
    //                   34: 209
    //                   42: 238
    //                   50: 267
    //                   58: 278;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L10; else goto _L2
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
            clientType = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (androidClientInfo == null)
        {
            androidClientInfo = new ntInfo();
        }
        codedinputbytebuffernano.readMessage(androidClientInfo);
        continue; /* Loop/switch isn't completed */
_L5:
        if (desktopClientInfo == null)
        {
            desktopClientInfo = new ntInfo();
        }
        codedinputbytebuffernano.readMessage(desktopClientInfo);
        continue; /* Loop/switch isn't completed */
_L6:
        if (iosClientInfo == null)
        {
            iosClientInfo = new fo();
        }
        codedinputbytebuffernano.readMessage(iosClientInfo);
        continue; /* Loop/switch isn't completed */
_L7:
        if (playCeClientInfo == null)
        {
            playCeClientInfo = new tInfo();
        }
        codedinputbytebuffernano.readMessage(playCeClientInfo);
        continue; /* Loop/switch isn't completed */
_L8:
        remoteHost = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L9:
        remoteHost6 = codedinputbytebuffernano.readString();
        if (true) goto _L10; else goto _L11
_L11:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (clientType != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, clientType);
        }
        if (androidClientInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(2, androidClientInfo);
        }
        if (desktopClientInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(3, desktopClientInfo);
        }
        if (iosClientInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(4, iosClientInfo);
        }
        if (playCeClientInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(5, playCeClientInfo);
        }
        if (!remoteHost.equals(""))
        {
            codedoutputbytebuffernano.writeString(6, remoteHost);
        }
        if (!remoteHost6.equals(""))
        {
            codedoutputbytebuffernano.writeString(7, remoteHost6);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public tInfo()
    {
        clientType = 0;
        remoteHost = "";
        remoteHost6 = "";
        androidClientInfo = null;
        desktopClientInfo = null;
        iosClientInfo = null;
        playCeClientInfo = null;
        cachedSize = -1;
    }
}
