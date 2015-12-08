// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public final class eh extends Enum
{

    public static final eh a;
    public static final eh b;
    public static final eh c;
    public static final eh d;
    public static final eh e;
    public static final eh f;
    public static final eh g;
    public static final eh h;
    public static final eh i;
    public static final eh j;
    public static final eh k;
    public static final eh l;
    private static final eh n[];
    private String m;

    private eh(String s, int i1, String s1)
    {
        super(s, i1);
        m = s1;
    }

    public static eh valueOf(String s)
    {
        return (eh)Enum.valueOf(b/a/eh, s);
    }

    public static eh[] values()
    {
        return (eh[])n.clone();
    }

    public final String toString()
    {
        return m;
    }

    static 
    {
        a = new eh("NOT_LOGGED_YET", 0, "Not logged");
        b = new eh("INPUT_STREAM_READ", 1, "InputStream.read()");
        c = new eh("INPUT_STREAM_CLOSE", 2, "InputStream.close()");
        d = new eh("SOCKET_CLOSE", 3, "Socket.close()");
        e = new eh("LEGACY_JAVANET", 4, "Legacy java.net");
        f = new eh("HTTP_CONTENT_LENGTH_PARSER", 5, "parse()");
        g = new eh("INPUT_STREAM_FINISHED", 6, "finishedMessage()");
        h = new eh("PARSING_INPUT_STREAM_LOG_ERROR", 7, "logError()");
        i = new eh("SOCKET_IMPL_CONNECT", 8, "MonitoredSocketImpl.connect()");
        j = new eh("SSL_SOCKET_START_HANDSHAKE", 9, "MonitoredSSLSocket.startHandshake");
        k = new eh("UNIT_TEST", 10, "Unit test");
        l = new eh("LOG_ENDPOINT", 11, "logEndpoint");
        n = (new eh[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }
}
