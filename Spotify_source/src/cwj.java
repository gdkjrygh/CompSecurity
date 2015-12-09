// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.mixpanel.android.java_websocket.framing.Framedata;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class cwj
    implements cwi
{

    private static byte c[] = new byte[0];
    public boolean a;
    public com.mixpanel.android.java_websocket.framing.Framedata.Opcode b;
    private ByteBuffer d;
    private boolean e;

    public cwj()
    {
    }

    public cwj(com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode)
    {
        b = opcode;
        d = ByteBuffer.wrap(c);
    }

    public cwj(Framedata framedata)
    {
        a = framedata.d();
        b = framedata.f();
        d = framedata.c();
        e = framedata.e();
    }

    public final void a(com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode)
    {
        b = opcode;
    }

    public void a(ByteBuffer bytebuffer)
    {
        d = bytebuffer;
    }

    public final void a(boolean flag)
    {
        a = flag;
    }

    public ByteBuffer c()
    {
        return d;
    }

    public final boolean d()
    {
        return a;
    }

    public final boolean e()
    {
        return e;
    }

    public final com.mixpanel.android.java_websocket.framing.Framedata.Opcode f()
    {
        return b;
    }

    public String toString()
    {
        return (new StringBuilder("Framedata{ optcode:")).append(b).append(", fin:").append(a).append(", payloadlength:[pos:").append(d.position()).append(", len:").append(d.remaining()).append("], payload:").append(Arrays.toString(cwu.a(new String(d.array())))).append("}").toString();
    }

}
