// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import java.nio.ByteBuffer;

public final class cwh extends cwj
    implements cwg
{

    private static ByteBuffer c = ByteBuffer.allocate(0);
    private int d;
    private String e;

    public cwh()
    {
        super(com.mixpanel.android.java_websocket.framing.Framedata.Opcode.f);
        super.a = true;
    }

    public cwh(byte byte0)
    {
        super(com.mixpanel.android.java_websocket.framing.Framedata.Opcode.f);
        super.a = true;
        a(1000, "");
    }

    public cwh(int i, String s)
    {
        super(com.mixpanel.android.java_websocket.framing.Framedata.Opcode.f);
        super.a = true;
        a(i, s);
    }

    private void a(int i, String s)
    {
        if (s == null)
        {
            s = "";
        }
        int j = i;
        if (i == 1015)
        {
            s = "";
            j = 1005;
        }
        if (j == 1005)
        {
            if (s.length() > 0)
            {
                throw new InvalidDataException(1002, "A close frame must have a closecode if it has a reason");
            }
        } else
        {
            s = cwu.a(s);
            ByteBuffer bytebuffer = ByteBuffer.allocate(4);
            bytebuffer.putInt(j);
            bytebuffer.position(2);
            ByteBuffer bytebuffer1 = ByteBuffer.allocate(s.length + 2);
            bytebuffer1.put(bytebuffer);
            bytebuffer1.put(s);
            bytebuffer1.rewind();
            a(bytebuffer1);
        }
    }

    public final int a()
    {
        return d;
    }

    public final void a(ByteBuffer bytebuffer)
    {
        int i;
        super.a(bytebuffer);
        d = 1005;
        bytebuffer = super.c();
        bytebuffer.mark();
        if (bytebuffer.remaining() >= 2)
        {
            ByteBuffer bytebuffer1 = ByteBuffer.allocate(4);
            bytebuffer1.position(2);
            bytebuffer1.putShort(bytebuffer.getShort());
            bytebuffer1.position(0);
            d = bytebuffer1.getInt();
            if (d == 1006 || d == 1015 || d == 1005 || d > 4999 || d < 1000 || d == 1004)
            {
                throw new InvalidFrameException((new StringBuilder("closecode must not be sent over the wire: ")).append(d).toString());
            }
        }
        bytebuffer.reset();
        if (d == 1005)
        {
            e = cwu.a(super.c());
            return;
        }
        bytebuffer = super.c();
        i = bytebuffer.position();
        bytebuffer.position(bytebuffer.position() + 2);
        e = cwu.a(bytebuffer);
        bytebuffer.position(i);
        return;
        Object obj;
        obj;
        throw new InvalidFrameException(((Throwable) (obj)));
        obj;
        bytebuffer.position(i);
        throw obj;
    }

    public final String b()
    {
        return e;
    }

    public final ByteBuffer c()
    {
        if (d == 1005)
        {
            return c;
        } else
        {
            return super.c();
        }
    }

    public final String toString()
    {
        return (new StringBuilder()).append(super.toString()).append("code: ").append(d).toString();
    }

}
