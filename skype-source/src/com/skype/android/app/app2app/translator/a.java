// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.app2app.translator;

import com.skype.android.app.app2app.Protocol;
import com.skype.android.util.Charsets;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.app2app.translator:
//            MessageType, TranscribedMessage

final class a
    implements Protocol
{

    private static final int APP2APP_DATA_VERSION = 1;
    private static final int INT_FIELD_SIZE = 8;
    private static final int KEY_VALUE_HEADER_SIZE = 4;
    private static final int NUMBER_FAILED_PING_PACKETS = 10;
    private static final int NUMBER_PING_PACKETS = 5;
    private static final long PING_INTERVAL;
    public static final byte PING_PACKET[] = {
        0, 1, -51, -17
    };
    private static final int SHORT_FIELD_SIZE = 6;
    private static final int VERSION_HEADER_SIZE = 4;
    private static final Logger log = Logger.getLogger("Translator");

    a()
    {
    }

    private int calculatePackageLength(byte abyte0[], byte abyte1[])
    {
        return stringFieldSize(abyte0) + 18 + stringFieldSize(abyte1);
    }

    private void packTextBuffer(ByteBuffer bytebuffer, MessageType messagetype, byte abyte0[])
    {
        bytebuffer.putShort((short)messagetype.ordinal());
        bytebuffer.putShort((short)abyte0.length);
        int j = paddingToWord(abyte0.length);
        bytebuffer.put(abyte0);
        for (int i = 0; i < j; i++)
        {
            bytebuffer.put((byte)0);
        }

    }

    private int paddingToWord(int i)
    {
        return i % 2 != 0 ? 1 : 0;
    }

    private int readLength(ByteBuffer bytebuffer)
    {
        return 0xffff & bytebuffer.getShort();
    }

    private String readString(ByteBuffer bytebuffer, MessageType messagetype)
    {
        String s = null;
        short word0 = bytebuffer.getShort();
        int i = readLength(bytebuffer);
        if (word0 == messagetype.ordinal())
        {
            messagetype = new byte[i];
            bytebuffer.get(messagetype);
            s = new String(messagetype);
            skipPadding(bytebuffer, paddingToWord(i));
        }
        return s;
    }

    private void skipPadding(ByteBuffer bytebuffer, int i)
    {
        for (int j = 0; j < i; j++)
        {
            bytebuffer.get();
        }

    }

    private int stringFieldSize(byte abyte0[])
    {
        return paddingToWord(abyte0.length) + 4 + abyte0.length;
    }

    public final int getNumberFailedPingPackets()
    {
        return 10;
    }

    public final int getNumberPingPackets()
    {
        return 5;
    }

    public final long getPingInterval()
    {
        return PING_INTERVAL;
    }

    public final byte[] getPingPacket()
    {
        return PING_PACKET;
    }

    public final boolean isPingPacket(byte abyte0[])
    {
        boolean flag = false;
        if (abyte0.length != PING_PACKET.length) goto _L2; else goto _L1
_L1:
        int i;
        boolean flag1;
        flag1 = true;
        i = 0;
_L7:
        flag = flag1;
        if (i >= PING_PACKET.length) goto _L2; else goto _L3
_L3:
        if (abyte0[i] == PING_PACKET[i]) goto _L5; else goto _L4
_L4:
        flag = false;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final byte[] packPacket(int i, String s, String s1, com.skype.Translator.TRANSLATOR_RECO_TYPE translator_reco_type)
    {
        s1 = s1.getBytes(Charsets.a);
        s = s.getBytes(Charsets.a);
        ByteBuffer bytebuffer = ByteBuffer.allocate(calculatePackageLength(s, s1));
        bytebuffer.putShort((short)1);
        bytebuffer.putShort((short)0);
        bytebuffer.putShort((short)MessageType.MESSAGE_ID.ordinal());
        bytebuffer.putShort((short)4);
        bytebuffer.putInt(i);
        bytebuffer.putShort((short)MessageType.TRANSLATOR_TYPE.ordinal());
        bytebuffer.putShort((short)2);
        bytebuffer.putShort((short)translator_reco_type.toInt());
        packTextBuffer(bytebuffer, MessageType.PARTNER_ID, s);
        packTextBuffer(bytebuffer, MessageType.TRANSCRIBED_TEXT, s1);
        return bytebuffer.array();
    }

    final int readMessageId(ByteBuffer bytebuffer)
    {
        int i = bytebuffer.getShort();
        int j = readLength(bytebuffer);
        if (i == MessageType.MESSAGE_ID.ordinal() && j == 4)
        {
            i = bytebuffer.getInt();
            log.info((new StringBuilder("MessageId read: ")).append(i).toString());
            return i;
        } else
        {
            log.info((new StringBuilder("Expected messageId type with length 4. Got: type: ")).append(i).append(" length: ").append(j).toString());
            return 0;
        }
    }

    final com.skype.Translator.TRANSLATOR_RECO_TYPE readRecordType(ByteBuffer bytebuffer)
    {
        short word0 = bytebuffer.getShort();
        readLength(bytebuffer);
        com.skype.Translator.TRANSLATOR_RECO_TYPE translator_reco_type = com.skype.Translator.TRANSLATOR_RECO_TYPE.WRAPPER_UNKNOWN_VALUE;
        if (word0 == MessageType.TRANSLATOR_TYPE.ordinal())
        {
            bytebuffer = com.skype.Translator.TRANSLATOR_RECO_TYPE.fromInt(bytebuffer.getShort());
            log.info((new StringBuilder("Record type is: ")).append(bytebuffer).toString());
            return bytebuffer;
        } else
        {
            log.info((new StringBuilder("Expected Translator type. Got: ")).append(word0).toString());
            return translator_reco_type;
        }
    }

    public final TranscribedMessage unpackPacket(byte abyte0[])
    {
        TranscribedMessage transcribedmessage = new TranscribedMessage();
        try
        {
            abyte0 = ByteBuffer.wrap(abyte0);
            short word0 = abyte0.getShort();
            short word1 = abyte0.getShort();
            log.info((new StringBuilder("Version: ")).append(word0).append(" reserved: ").append(word1).toString());
            transcribedmessage.setMessageId(readMessageId(abyte0));
            transcribedmessage.setRecordType(readRecordType(abyte0));
            transcribedmessage.setPartnerId(readString(abyte0, MessageType.PARTNER_ID));
            transcribedmessage.setText(readString(abyte0, MessageType.TRANSCRIBED_TEXT));
            transcribedmessage.setValid(true);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            log.log(Level.WARNING, "Packet is malformed", abyte0);
            return transcribedmessage;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            log.log(Level.WARNING, "Can't parse incomming data", abyte0);
            return transcribedmessage;
        }
        return transcribedmessage;
    }

    static 
    {
        PING_INTERVAL = TimeUnit.SECONDS.toMillis(1L);
    }
}
