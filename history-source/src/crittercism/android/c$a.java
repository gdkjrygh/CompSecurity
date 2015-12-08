// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            c

public static final class m extends Enum
{

    public static final l a;
    public static final l b;
    public static final l c;
    public static final l d;
    public static final l e;
    public static final l f;
    public static final l g;
    public static final l h;
    public static final l i;
    public static final l j;
    public static final l k;
    public static final l l;
    private static final l n[];
    private String m;

    public static m valueOf(String s)
    {
        return (m)Enum.valueOf(crittercism/android/c$a, s);
    }

    public static m[] values()
    {
        return (m[])n.clone();
    }

    public final String toString()
    {
        return m;
    }

    static 
    {
        a = new <init>("NOT_LOGGED_YET", 0, "Not logged");
        b = new <init>("INPUT_STREAM_READ", 1, "InputStream.read()");
        c = new <init>("INPUT_STREAM_CLOSE", 2, "InputStream.close()");
        d = new <init>("SOCKET_CLOSE", 3, "Socket.close()");
        e = new <init>("LEGACY_JAVANET", 4, "Legacy java.net");
        f = new <init>("HTTP_CONTENT_LENGTH_PARSER", 5, "parse()");
        g = new <init>("INPUT_STREAM_FINISHED", 6, "finishedMessage()");
        h = new <init>("PARSING_INPUT_STREAM_LOG_ERROR", 7, "logError()");
        i = new <init>("SOCKET_IMPL_CONNECT", 8, "MonitoredSocketImpl.connect()");
        j = new <init>("SSL_SOCKET_START_HANDSHAKE", 9, "MonitoredSSLSocket.startHandshake");
        k = new <init>("UNIT_TEST", 10, "Unit test");
        l = new <init>("LOG_ENDPOINT", 11, "logEndpoint");
        n = (new n[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }

    private (String s, int i1, String s1)
    {
        super(s, i1);
        m = s1;
    }
}
