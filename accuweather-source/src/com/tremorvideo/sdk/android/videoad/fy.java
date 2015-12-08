// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.text.SimpleDateFormat;
import java.util.Hashtable;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TimeZone;

public class fy
{

    protected static PrintStream a;
    private static Hashtable d;
    private static int e = 16384;
    private static SimpleDateFormat f;
    private final ServerSocket b;
    private Thread c;

    public void a()
    {
        try
        {
            b.close();
            c.join();
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    static 
    {
        d = new Hashtable();
        for (StringTokenizer stringtokenizer = new StringTokenizer("css\t\ttext/css htm\t\ttext/html html\t\ttext/html xml\t\ttext/xml txt\t\ttext/plain asc\t\ttext/plain gif\t\timage/gif jpg\t\timage/jpeg jpeg\t\timage/jpeg png\t\timage/png mp3\t\taudio/mpeg m3u\t\taudio/mpeg-url mp4\t\tvideo/mp4 ogv\t\tvideo/ogg flv\t\tvideo/x-flv mov\t\tvideo/quicktime swf\t\tapplication/x-shockwave-flash js\t\t\tapplication/javascript pdf\t\tapplication/pdf doc\t\tapplication/msword ogg\t\tapplication/x-ogg zip\t\tapplication/octet-stream exe\t\tapplication/octet-stream class\t\tapplication/octet-stream "); stringtokenizer.hasMoreTokens(); d.put(stringtokenizer.nextToken(), stringtokenizer.nextToken())) { }
        a = System.out;
        f = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        f.setTimeZone(TimeZone.getTimeZone("GMT"));
    }
}
