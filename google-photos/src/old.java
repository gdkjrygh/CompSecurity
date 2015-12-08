// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.Callable;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.impl.DefaultHttpServerConnection;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpService;

final class old
    implements Callable
{

    private final Socket a;
    private olb b;

    public old(olb olb1, Socket socket)
    {
        b = olb1;
        super();
        a = socket;
    }

    private Void a()
    {
        Object obj;
        if (olb.a(b) == null)
        {
            Thread.currentThread().setName("VideoServerRequest");
        }
        obj = new DefaultHttpServerConnection();
        ((DefaultHttpServerConnection) (obj)).bind(a, olb.d(b));
        BasicHttpContext basichttpcontext = new BasicHttpContext();
        for (; !Thread.interrupted() && ((DefaultHttpServerConnection) (obj)).isOpen(); olb.e(b).handleRequest(((org.apache.http.HttpServerConnection) (obj)), basichttpcontext)) { }
        break MISSING_BLOCK_LABEL_84;
        Object obj1;
        obj1;
        boolean flag;
        try
        {
            ((DefaultHttpServerConnection) (obj)).shutdown();
        }
        catch (IOException ioexception1) { }
        return null;
        try
        {
            ((DefaultHttpServerConnection) (obj)).shutdown();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        continue; /* Loop/switch isn't completed */
        obj1;
        if (!(obj1 instanceof SocketException))
        {
            break MISSING_BLOCK_LABEL_140;
        }
        if (((IOException) (obj1)).getMessage().contains("Connection reset by peer"))
        {
            break MISSING_BLOCK_LABEL_129;
        }
        flag = ((IOException) (obj1)).getMessage().contains("Socket closed");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_140;
        }
_L2:
        try
        {
            ((DefaultHttpServerConnection) (obj)).shutdown();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        continue; /* Loop/switch isn't completed */
        Log.e("VideoServer", "IOException when handling a request", ((Throwable) (obj1)));
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        IOException ioexception;
        try
        {
            ((DefaultHttpServerConnection) (obj)).shutdown();
        }
        catch (IOException ioexception2) { }
        throw obj1;
        obj1;
        Log.e("VideoServer", "HTTP protocol violation", ((Throwable) (obj1)));
        try
        {
            ((DefaultHttpServerConnection) (obj)).shutdown();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_179;
_L4:
        break MISSING_BLOCK_LABEL_82;
    }

    public final Object call()
    {
        return a();
    }
}
