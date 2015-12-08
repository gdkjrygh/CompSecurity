// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bu;

import android.net.Uri;
import com.crashlytics.android.d;
import com.pandora.android.data.t;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.ExecutorService;

// Referenced classes of package p.bu:
//            b, c, e, d

public class a
    implements Runnable
{

    private final String a;
    private final String b;
    private final Map c;
    private final ExecutorService d;
    private c e;
    private Socket f;
    private t g;

    private a(String s, String s1, Map map, c c1, t t1, ExecutorService executorservice)
    {
        a = s;
        b = s1;
        c = map;
        e = c1;
        g = t1;
        d = executorservice;
    }

    private long a(b b1, OutputStream outputstream, RandomAccessFile randomaccessfile, byte abyte0[])
        throws IOException, InterruptedException
    {
        long l = 0L;
        do
        {
            int i = randomaccessfile.read(abyte0);
            if (i == -1)
            {
                break;
            }
            outputstream.write(abyte0, 0, i);
            l += i;
        } while (true);
        long l1 = l;
        if (b1.c() == b.a.b)
        {
            p.df.a.d("PlayVideoRequest", (new StringBuilder()).append("Prefetching in progress, sleeping").append(l).toString());
            Thread.sleep(250L);
            l1 = l + a(b1, outputstream, randomaccessfile, abyte0);
        }
        return l1;
    }

    public static a a(Socket socket, Hashtable hashtable, ExecutorService executorservice)
    {
        String s2;
        HashMap hashmap;
        BufferedReader bufferedreader;
        String s1;
        t t1;
        int i;
        try
        {
            bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()), 8192);
            socket = bufferedreader.readLine();
        }
        // Misplaced declaration of an exception variable
        catch (Socket socket)
        {
            p.df.a.a("PlayVideoRequest", "Error parsing request", socket);
            return null;
        }
        if (socket != null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        p.df.a.b("PlayVideoRequest", "Got empty Request-Line");
        com.crashlytics.android.d.a(new IllegalArgumentException("Unable to prepare request - got an empty request from MediaPlayer"));
        return null;
        socket = new StringTokenizer(socket);
        s1 = socket.nextToken();
        socket = socket.nextToken().substring(1);
        i = socket.lastIndexOf("&id=");
        t1 = (t)hashtable.get(Integer.valueOf(Integer.parseInt(socket.substring("&id=".length() + i))));
        if (t1 != null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        p.df.a.b("PlayVideoRequest", (new StringBuilder()).append("Received unknown PlayVideoRequest - ").append(socket).toString());
        com.crashlytics.android.d.a(new IllegalArgumentException((new StringBuilder()).append("Unknown PlayVideoRequest - ").append(socket).toString()));
        return null;
        s2 = socket.substring(0, i);
        hashmap = new HashMap();
        socket = null;
_L8:
        hashtable = bufferedreader.readLine();
        if (hashtable == null) goto _L2; else goto _L1
_L1:
        if (hashtable.length() != 0 && hashtable.trim().length() != 0) goto _L3; else goto _L2
_L2:
        socket = new a(s1, s2, hashmap, socket, t1, executorservice);
        return socket;
_L3:
        if ((hashtable = hashtable.split(":", 2)).length < 2) goto _L2; else goto _L4
_L4:
        String s3 = hashtable[0];
        String s;
        boolean flag;
        s = hashtable[1].trim();
        flag = "Range".equalsIgnoreCase(s3);
        if (!flag) goto _L6; else goto _L5
_L5:
        hashtable = p.bu.c.a(s);
_L11:
        socket = hashtable;
        if (s3 == null) goto _L8; else goto _L7
_L7:
        socket = hashtable;
        if (s3.length() <= 0) goto _L8; else goto _L9
_L9:
        p.df.a.a("PlayVideoRequest", (new StringBuilder()).append("header name  = ").append(s3).append(" value = ").append(s).toString());
        hashmap.put(s3, s);
        socket = hashtable;
          goto _L8
_L6:
        hashtable = socket;
        if (!"Host".equalsIgnoreCase(s3)) goto _L11; else goto _L10
_L10:
        s = Uri.parse(s2).getHost();
        hashtable = socket;
          goto _L11
        hashtable;
        hashtable = socket;
          goto _L11
    }

    private void b(Socket socket)
        throws IOException, InterruptedException
    {
        b b1 = p.bu.e.a().a(g, e);
        if (b1 == null)
        {
            p.df.a.a("PlayVideoRequest", "No pre-cached video, fetching from network");
            c(socket);
        } else
        {
            p.df.a.a("PlayVideoRequest", "Serving cached video");
            URL url = new URL(b);
            Object obj1 = b1.b();
            long l = ((p.bu.d) (obj1)).a();
            if (e != null)
            {
                e.a(l);
            }
            RandomAccessFile randomaccessfile = new RandomAccessFile(b1.a(), "r");
            if (e != null && e.a() > 0L)
            {
                randomaccessfile.seek(e.a());
            }
            obj1 = ((p.bu.d) (obj1)).a(e);
            socket.getOutputStream().write(((String) (obj1)).getBytes(), 0, ((String) (obj1)).length());
            byte abyte0[] = new byte[4096];
            long l1 = a(b1, socket.getOutputStream(), randomaccessfile, abyte0);
            if (l > l1)
            {
                p.df.a.a("PlayVideoRequest", (new StringBuilder()).append("Fetching rest of the file from the server (").append(l1).append("-)").toString());
                Object obj = (HttpURLConnection)url.openConnection();
                ((HttpURLConnection) (obj)).setRequestMethod("GET");
                ((HttpURLConnection) (obj)).addRequestProperty("Range", (new StringBuilder()).append("bytes=").append(l1).append("-").toString());
                ((HttpURLConnection) (obj)).connect();
                if (((HttpURLConnection) (obj)).getResponseCode() == 206)
                {
                    obj = new BufferedInputStream(((HttpURLConnection) (obj)).getInputStream());
                    do
                    {
                        int i = ((InputStream) (obj)).read(abyte0);
                        if (i == -1)
                        {
                            break;
                        }
                        socket.getOutputStream().write(abyte0, 0, i);
                    } while (true);
                    p.df.a.a("PlayVideoRequest", "Done writing response ");
                    ((InputStream) (obj)).close();
                }
            }
            socket.getOutputStream().flush();
            socket.getOutputStream().close();
            if (randomaccessfile != null)
            {
                randomaccessfile.close();
                return;
            }
        }
    }

    private void c(Socket socket)
        throws IOException
    {
        Object obj;
        int i;
        obj = (HttpURLConnection)(new URL(b)).openConnection();
        ((HttpURLConnection) (obj)).setRequestMethod("GET");
        java.util.Map.Entry entry;
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext(); ((HttpURLConnection) (obj)).addRequestProperty((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        ((HttpURLConnection) (obj)).connect();
        i = ((HttpURLConnection) (obj)).getResponseCode();
        if (i != 200 && i != 206) goto _L2; else goto _L1
_L1:
        String s = (new p.bu.d(((HttpURLConnection) (obj)).getHeaderFields())).toString();
        socket.getOutputStream().write(s.getBytes(), 0, s.length());
        obj = new BufferedInputStream(((HttpURLConnection) (obj)).getInputStream());
        byte abyte0[] = new byte[4096];
_L5:
        i = ((InputStream) (obj)).read(abyte0);
        if (i == -1) goto _L4; else goto _L3
_L3:
        socket.getOutputStream().write(abyte0, 0, i);
          goto _L5
        socket;
_L7:
        if (obj != null)
        {
            ((InputStream) (obj)).close();
        }
        throw socket;
_L4:
        if (obj != null)
        {
            ((InputStream) (obj)).close();
        }
_L2:
        return;
        socket;
        obj = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a(Socket socket)
    {
        f = socket;
        d.submit(this);
    }

    public void run()
    {
        if (f == null)
        {
            p.df.a.a("PlayVideoRequest", "There's no media player socket, cannot download Video");
            return;
        }
        f.setSoTimeout(30000);
        b(f);
        try
        {
            f.close();
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
        Object obj;
        obj;
        p.df.a.a("PlayVideoRequest", "Error processing request", ((Throwable) (obj)));
        try
        {
            f.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj;
        try
        {
            f.close();
        }
        catch (IOException ioexception1) { }
        throw obj;
    }
}
