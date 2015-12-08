// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class m extends Enum
{

    public static final l a;
    public static final l b;
    public static final l c;
    public static final l d;
    public static final l e;
    private static l f;
    private static l g;
    private static l h;
    private static l i;
    private static l j;
    private static l k;
    private static l l;
    private static final l n[];
    private String m;

    public static ang.String valueOf(String s)
    {
        return (f)Enum.valueOf(abb$a, s);
    }

    public static ang.String[] values()
    {
        return ([])n.clone();
    }

    public final String toString()
    {
        return m;
    }

    static 
    {
        a = new <init>("NOT_LOGGED_YET", 0, "Not logged");
        f = new <init>("INPUT_STREAM_READ", 1, "InputStream.read()");
        g = new <init>("INPUT_STREAM_CLOSE", 2, "InputStream.close()");
        h = new <init>("SOCKET_CLOSE", 3, "Socket.close()");
        i = new <init>("LEGACY_JAVANET", 4, "Legacy java.net");
        j = new <init>("HTTP_CONTENT_LENGTH_PARSER", 5, "parse()");
        b = new <init>("INPUT_STREAM_FINISHED", 6, "finishedMessage()");
        c = new <init>("PARSING_INPUT_STREAM_LOG_ERROR", 7, "logError()");
        d = new <init>("SOCKET_IMPL_CONNECT", 8, "MonitoredSocketImpl.connect()");
        e = new <init>("SSL_SOCKET_START_HANDSHAKE", 9, "MonitoredSSLSocket.startHandshake");
        k = new <init>("UNIT_TEST", 10, "Unit test");
        l = new <init>("LOG_ENDPOINT", 11, "logEndpoint");
        n = (new n[] {
            a, f, g, h, i, j, b, c, d, e, 
            k, l
        });
    }

    private (String s, int i1, String s1)
    {
        super(s, i1);
        m = s1;
    }
}
