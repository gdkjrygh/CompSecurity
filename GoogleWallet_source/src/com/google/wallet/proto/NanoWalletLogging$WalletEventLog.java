// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletLogging

public static final class clear extends ExtendableMessageNano
{

    private static volatile logMessage _emptyArray[];
    public logMessage actionOutcome;
    public logMessage eventContext;
    public logMessage logMessage;
    public logMessage physicalTapLog;
    public logMessage rpcTimingLog;
    public logMessage userEventInfo;
    public logMessage utmCampaignInfo;

    private clear clear()
    {
        eventContext = null;
        actionOutcome = null;
        userEventInfo = null;
        physicalTapLog = null;
        rpcTimingLog = null;
        utmCampaignInfo = null;
        logMessage = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

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

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

            case 10: // '\n'
                if (eventContext == null)
                {
                    eventContext = new nit>();
                }
                codedinputbytebuffernano.readMessage(eventContext);
                break;

            case 18: // '\022'
                if (actionOutcome == null)
                {
                    actionOutcome = new init>();
                }
                codedinputbytebuffernano.readMessage(actionOutcome);
                break;

            case 26: // '\032'
                if (userEventInfo == null)
                {
                    userEventInfo = new init>();
                }
                codedinputbytebuffernano.readMessage(userEventInfo);
                break;

            case 34: // '"'
                if (physicalTapLog == null)
                {
                    physicalTapLog = new <init>();
                }
                codedinputbytebuffernano.readMessage(physicalTapLog);
                break;

            case 42: // '*'
                if (rpcTimingLog == null)
                {
                    rpcTimingLog = new nit>();
                }
                codedinputbytebuffernano.readMessage(rpcTimingLog);
                break;

            case 50: // '2'
                if (utmCampaignInfo == null)
                {
                    utmCampaignInfo = new <init>();
                }
                codedinputbytebuffernano.readMessage(utmCampaignInfo);
                break;

            case 58: // ':'
                if (logMessage == null)
                {
                    logMessage = new t>();
                }
                codedinputbytebuffernano.readMessage(logMessage);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (eventContext != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, eventContext);
        }
        j = i;
        if (actionOutcome != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, actionOutcome);
        }
        i = j;
        if (userEventInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, userEventInfo);
        }
        j = i;
        if (physicalTapLog != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, physicalTapLog);
        }
        i = j;
        if (rpcTimingLog != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, rpcTimingLog);
        }
        j = i;
        if (utmCampaignInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, utmCampaignInfo);
        }
        i = j;
        if (logMessage != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(7, logMessage);
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
        if (eventContext != null)
        {
            codedoutputbytebuffernano.writeMessage(1, eventContext);
        }
        if (actionOutcome != null)
        {
            codedoutputbytebuffernano.writeMessage(2, actionOutcome);
        }
        if (userEventInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(3, userEventInfo);
        }
        if (physicalTapLog != null)
        {
            codedoutputbytebuffernano.writeMessage(4, physicalTapLog);
        }
        if (rpcTimingLog != null)
        {
            codedoutputbytebuffernano.writeMessage(5, rpcTimingLog);
        }
        if (utmCampaignInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(6, utmCampaignInfo);
        }
        if (logMessage != null)
        {
            codedoutputbytebuffernano.writeMessage(7, logMessage);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
