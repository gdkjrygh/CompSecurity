// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.Assertion;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

final class ang.Object
    implements Runnable
{

    private ehr a;

    public final void run()
    {
        if (!a.e) goto _L2; else goto _L1
_L1:
        return;
_L2:
        byte byte4;
        byte byte5;
        Object obj;
        ByteBuffer bytebuffer;
        Object obj1;
        eho eho1;
        obj = a;
        bytebuffer = ByteBuffer.wrap(((ehr) (obj)).c);
        obj1 = ((ehr) (obj)).a;
        eho1 = new eho();
        ehp.a(((DataInputStream) (obj1)));
        byte4 = eho1.a(((DataInputStream) (obj1)).readByte());
        byte5 = eho1.a(((DataInputStream) (obj1)).readByte());
        int i = 0;
_L10:
        byte byte3 = ((DataInputStream) (obj1)).readByte();
        byte byte0;
        if (byte3 == 124)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        byte0 = byte3;
        if (byte3 != 125)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        byte0 = (byte)(((DataInputStream) (obj1)).readByte() + 32);
        if (i >= 4)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        eho1.a(byte0);
        break MISSING_BLOCK_LABEL_491;
        if (bytebuffer.position() > 1)
        {
            eho1.a(bytebuffer.get(bytebuffer.position() - 2));
        }
        bytebuffer.put(byte0);
        break MISSING_BLOCK_LABEL_491;
        short word0;
        i = bytebuffer.getShort(bytebuffer.position() - 2);
        word0 = (short)eho1.a;
        if (word0 == i) goto _L4; else goto _L3
_L3:
        try
        {
            throw new IOException((new StringBuilder("Wrong checksum. calculated = ")).append(Integer.toHexString(word0)).append(" received = ").append(Integer.toHexString(i)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ehr.a(new IOException("EoF detected, session will close", ((Throwable) (obj))));
            a.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ehr.a(((IOException) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Assertion.a("ProtocolFraming Error", ((Throwable) (obj)));
        }
_L8:
        if (a.e) goto _L1; else goto _L5
_L5:
        a.b.execute(a.f);
        return;
_L4:
        bytebuffer.position(bytebuffer.position() - 2);
        obj1 = new ehq(byte4, byte5);
        if (((ehq) (obj1)).a != 0) goto _L7; else goto _L6
_L6:
        (new StringBuilder("Received FRAMED DATA s:")).append(((ehq) (obj1)).b);
        bytebuffer.array();
        bytebuffer.position();
        byte byte1 = ((ehq) (obj1)).b;
        if (((ehr) (obj)).d != null)
        {
            bytebuffer = ByteBuffer.allocate(bytebuffer.position());
            bytebuffer.put(((ehr) (obj)).c, 0, bytebuffer.limit());
            ((ehr) (obj)).d.a(byte1, bytebuffer.array());
        }
          goto _L8
_L7:
        if (((ehq) (obj1)).a != 1) goto _L8; else goto _L9
_L9:
        (new StringBuilder("Received FRAMED ACK s:")).append(((ehq) (obj1)).b);
        bytebuffer.array();
        bytebuffer.position();
        byte byte2 = ((ehq) (obj1)).b;
        if (((ehr) (obj)).d != null)
        {
            ((ehr) (obj)).d.a(byte2);
        }
          goto _L8
          goto _L1
        i++;
          goto _L10
    }

    (ehr ehr1)
    {
        a = ehr1;
        super();
    }
}
