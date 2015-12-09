// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.mixpanel.android.java_websocket.exceptions.NotSendableException;
import com.mixpanel.android.java_websocket.exceptions.WebsocketNotConnectedException;
import com.mixpanel.android.viewcrawler.EditorConnection;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public final class cyy extends OutputStream
{

    private EditorConnection a;

    private cyy(EditorConnection editorconnection)
    {
        a = editorconnection;
        super();
    }

    public cyy(EditorConnection editorconnection, byte byte0)
    {
        this(editorconnection);
    }

    public final void close()
    {
        try
        {
            EditorConnection.c(a).a(com.mixpanel.android.java_websocket.framing.Framedata.Opcode.b, EditorConnection.b(), true);
            return;
        }
        catch (WebsocketNotConnectedException websocketnotconnectedexception)
        {
            throw new com.mixpanel.android.viewcrawler.EditorConnection.EditorConnectionException(a, websocketnotconnectedexception);
        }
        catch (NotSendableException notsendableexception)
        {
            throw new com.mixpanel.android.viewcrawler.EditorConnection.EditorConnectionException(a, notsendableexception);
        }
    }

    public final void write(int i)
    {
        write(new byte[] {
            (byte)i
        }, 0, 1);
    }

    public final void write(byte abyte0[])
    {
        write(abyte0, 0, abyte0.length);
    }

    public final void write(byte abyte0[], int i, int j)
    {
        abyte0 = ByteBuffer.wrap(abyte0, i, j);
        try
        {
            EditorConnection.c(a).a(com.mixpanel.android.java_websocket.framing.Framedata.Opcode.b, abyte0, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new com.mixpanel.android.viewcrawler.EditorConnection.EditorConnectionException(a, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new com.mixpanel.android.viewcrawler.EditorConnection.EditorConnectionException(a, abyte0);
        }
    }
}
