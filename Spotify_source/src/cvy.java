// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.net.InetSocketAddress;

public abstract class cvy
    implements cwa
{

    public cvy()
    {
    }

    public final String a(WebSocket websocket)
    {
        websocket = websocket.a();
        if (websocket == null)
        {
            throw new InvalidHandshakeException("socket not bound");
        } else
        {
            StringBuffer stringbuffer = new StringBuffer(90);
            stringbuffer.append("<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"");
            stringbuffer.append(websocket.getPort());
            stringbuffer.append("\" /></cross-domain-policy>\0");
            return stringbuffer.toString();
        }
    }

    public final void a(WebSocket websocket, Framedata framedata)
    {
        framedata = new cwj(framedata);
        framedata.b = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.e;
        websocket.a(framedata);
    }

    public final cws b()
    {
        return new cwo();
    }
}
