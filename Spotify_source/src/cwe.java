// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class cwe extends Draft
{

    protected boolean d;
    protected List e;
    protected ByteBuffer f;
    private final Random g = new Random();

    public cwe()
    {
        d = false;
        e = new LinkedList();
    }

    public com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState a(cwk cwk1)
    {
        if (cwk1.c("Origin") && a(((cwp) (cwk1))))
        {
            return com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.a;
        } else
        {
            return com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.b;
        }
    }

    public com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState a(cwk cwk1, cwr cwr1)
    {
        if (cwk1.b("WebSocket-Origin").equals(cwr1.b("Origin")) && a(((cwp) (cwr1))))
        {
            return com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.a;
        } else
        {
            return com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.b;
        }
    }

    public cwl a(cwl cwl1)
    {
        cwl1.a("Upgrade", "WebSocket");
        cwl1.a("Connection", "Upgrade");
        if (!cwl1.c("Origin"))
        {
            cwl1.a("Origin", (new StringBuilder("random")).append(g.nextInt()).toString());
        }
        return cwl1;
    }

    public cwm a(cwk cwk1, cws cws1)
    {
        cws1.a("Web Socket Protocol Handshake");
        cws1.a("Upgrade", "WebSocket");
        cws1.a("Connection", cwk1.b("Connection"));
        cws1.a("WebSocket-Origin", cwk1.b("Origin"));
        cws1.a("WebSocket-Location", (new StringBuilder("ws://")).append(cwk1.b("Host")).append(cwk1.a()).toString());
        return cws1;
    }

    public ByteBuffer a(Framedata framedata)
    {
        if (framedata.f() != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.b)
        {
            throw new RuntimeException("only text frames supported");
        } else
        {
            framedata = framedata.c();
            ByteBuffer bytebuffer = ByteBuffer.allocate(framedata.remaining() + 2);
            bytebuffer.put((byte)0);
            framedata.mark();
            bytebuffer.put(framedata);
            framedata.reset();
            bytebuffer.put((byte)-1);
            bytebuffer.flip();
            return bytebuffer;
        }
    }

    public List a(ByteBuffer bytebuffer)
    {
        bytebuffer = c(bytebuffer);
        if (bytebuffer == null)
        {
            throw new InvalidDataException(1002);
        } else
        {
            return bytebuffer;
        }
    }

    public final void a()
    {
        d = false;
        f = null;
    }

    public com.mixpanel.android.java_websocket.drafts.Draft.CloseHandshakeType b()
    {
        return com.mixpanel.android.java_websocket.drafts.Draft.CloseHandshakeType.a;
    }

    public Draft c()
    {
        return new cwe();
    }

    protected final List c(ByteBuffer bytebuffer)
    {
        Object obj;
label0:
        {
            Object obj1 = null;
            while (bytebuffer.hasRemaining()) 
            {
                byte byte0 = bytebuffer.get();
                if (byte0 == 0)
                {
                    if (d)
                    {
                        throw new InvalidFrameException("unexpected START_OF_FRAME");
                    }
                    d = true;
                } else
                if (byte0 == -1)
                {
                    if (!d)
                    {
                        throw new InvalidFrameException("unexpected END_OF_FRAME");
                    }
                    if (f != null)
                    {
                        f.flip();
                        cwj cwj1 = new cwj();
                        cwj1.a(f);
                        cwj1.a = true;
                        cwj1.b = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.b;
                        e.add(cwj1);
                        f = null;
                        bytebuffer.mark();
                    }
                    d = false;
                } else
                {
                    obj = obj1;
                    if (!d)
                    {
                        break label0;
                    }
                    if (f == null)
                    {
                        f = ByteBuffer.allocate(a);
                    } else
                    if (!f.hasRemaining())
                    {
                        obj = f;
                        ((ByteBuffer) (obj)).flip();
                        ByteBuffer bytebuffer1 = ByteBuffer.allocate(a(((ByteBuffer) (obj)).capacity() << 1));
                        bytebuffer1.put(((ByteBuffer) (obj)));
                        f = bytebuffer1;
                    }
                    f.put(byte0);
                }
            }
            obj = e;
            e = new LinkedList();
        }
        return ((List) (obj));
    }
}
