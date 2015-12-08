// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpService;

public final class olb
{

    public static final InetAddress a;
    public final Uri b;
    public final olg c;
    public ServerSocket d;
    public ExecutorService e;
    public HttpParams f;
    public HttpService g;
    public Executor h;
    public Future i;
    public Future j;

    private olb(Uri uri, olg olg1, Executor executor)
    {
        c = olg1;
        b = uri;
        h = executor;
    }

    static Executor a(olb olb1)
    {
        return olb1.h;
    }

    static Future a(olb olb1, Future future)
    {
        olb1.j = future;
        return future;
    }

    public static olb a(Context context, String s, Uri uri)
    {
        return new olb(uri, new olg(context, null), null);
    }

    static ServerSocket b(olb olb1)
    {
        return olb1.d;
    }

    static Future c(olb olb1)
    {
        return olb1.j;
    }

    static HttpParams d(olb olb1)
    {
        return olb1.f;
    }

    static HttpService e(olb olb1)
    {
        return olb1.g;
    }

    static 
    {
        InetAddress inetaddress = null;
        InetAddress inetaddress1 = InetAddress.getByAddress("localhost", new byte[] {
            127, 0, 0, 1
        });
        inetaddress = inetaddress1;
_L2:
        a = inetaddress;
        return;
        UnknownHostException unknownhostexception;
        unknownhostexception;
        Log.e("VideoServer", "Cannot find localhost", unknownhostexception);
        if (true) goto _L2; else goto _L1
_L1:
    }
}
