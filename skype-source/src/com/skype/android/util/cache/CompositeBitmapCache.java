// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.cache;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.util.e;
import com.a.a.a;
import com.skype.android.util.Charsets;
import com.skype.android.util.HttpUtil;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.logging.Logger;

public class CompositeBitmapCache
    implements Closeable
{
    private static final class a
    {

        long a;
        Bitmap b;

        public a(Bitmap bitmap, long l)
        {
            b = bitmap;
            a = l;
        }
    }


    private static final Logger a = Logger.getLogger("CompositeBitmapCache");
    private e b;
    private com.a.a.a c;
    private android.graphics.BitmapFactory.Options d;
    private HttpUtil e;
    private Comparator f;

    public CompositeBitmapCache(int i, HttpUtil httputil)
    {
        f = new Comparator() {

            final CompositeBitmapCache a;

            public final int compare(Object obj, Object obj1)
            {
                obj = (java.util.Map.Entry)obj;
                obj1 = (java.util.Map.Entry)obj1;
                int j = com.skype.android.util.cache.CompositeBitmapCache.a(((a)((java.util.Map.Entry) (obj)).getValue()).b);
                return com.skype.android.util.cache.CompositeBitmapCache.a(((a)((java.util.Map.Entry) (obj1)).getValue()).b) - j;
            }

            
            {
                a = CompositeBitmapCache.this;
                super();
            }
        };
        b = new e(i) {

            final CompositeBitmapCache a;

            protected final int c(Object obj)
            {
                return com.skype.android.util.cache.CompositeBitmapCache.a(((a)obj).b);
            }

            
            {
                a = CompositeBitmapCache.this;
                super(i);
            }
        };
        d = new android.graphics.BitmapFactory.Options();
        d.inPurgeable = false;
        e = httputil;
    }

    static int a(Bitmap bitmap)
    {
        return bitmap.getByteCount();
    }

    private Bitmap a(String s, long l, InputStream inputstream)
    {
        Bitmap bitmap;
        bitmap = BitmapFactory.decodeStream(inputstream, null, d);
        a(s, bitmap, inputstream, l, true);
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return bitmap;
            }
        }
        return bitmap;
        s;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        throw s;
    }

    private a d(String s)
    {
        Object obj;
        InputStream inputstream;
        Object obj1;
        a a1;
        Object obj2;
        obj2 = String.valueOf(s.hashCode());
        a1 = (a)b.a(obj2);
        obj = a1;
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        obj = a1;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        obj1 = null;
        inputstream = null;
        s = inputstream;
        obj = obj1;
        Object obj3 = c.a(((String) (obj2)));
        obj = a1;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        s = inputstream;
        obj = obj1;
        inputstream = ((com.a.a.a.c) (obj3)).a(0);
        s = inputstream;
        obj = inputstream;
        obj2 = BitmapFactory.decodeStream(inputstream, null, d);
        s = inputstream;
        obj = inputstream;
        inputstream.close();
        s = inputstream;
        obj = inputstream;
        inputstream = ((com.a.a.a.c) (obj3)).a(1);
        s = inputstream;
        obj = inputstream;
        obj3 = new StringBuilder();
        s = inputstream;
        obj = inputstream;
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream, Charsets.a));
        s = inputstream;
        obj = inputstream;
        obj1 = bufferedreader.readLine();
_L2:
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s = inputstream;
        obj = inputstream;
        ((StringBuilder) (obj3)).append(((String) (obj1)));
        s = inputstream;
        obj = inputstream;
        obj1 = bufferedreader.readLine();
        if (true) goto _L2; else goto _L1
_L1:
        s = inputstream;
        obj = inputstream;
        inputstream.close();
        s = inputstream;
        obj = inputstream;
        bufferedreader.close();
        s = inputstream;
        obj = inputstream;
        obj1 = new a(((Bitmap) (obj2)), Long.valueOf(((StringBuilder) (obj3)).toString()).longValue());
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        obj = obj1;
_L4:
        return ((a) (obj));
        Exception exception;
        exception;
        obj = s;
        exception.printStackTrace();
        obj = a1;
        if (s == null) goto _L4; else goto _L3
_L3:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return a1;
        }
        return a1;
        s;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        throw s;
    }

    private Bitmap e(String s)
        throws IOException
    {
        Object obj;
        HttpURLConnection httpurlconnection;
        Object obj1;
        Object obj2;
        HttpURLConnection httpurlconnection1;
        HttpURLConnection httpurlconnection2;
        Object obj3;
        FileInputStream fileinputstream;
        Bitmap bitmap;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        long l;
        if (s == null)
        {
            throw new IllegalArgumentException("null url");
        }
        l = System.currentTimeMillis();
        bitmap = null;
        obj4 = null;
        obj1 = null;
        obj5 = null;
        obj6 = null;
        obj7 = null;
        httpurlconnection = null;
        httpurlconnection1 = obj5;
        obj3 = obj1;
        obj = obj6;
        obj2 = bitmap;
        httpurlconnection2 = obj7;
        fileinputstream = obj4;
        if (!s.startsWith("/")) goto _L2; else goto _L1
_L1:
        httpurlconnection1 = obj5;
        obj3 = obj1;
        obj = obj6;
        obj2 = bitmap;
        httpurlconnection2 = obj7;
        fileinputstream = obj4;
        obj1 = new FileInputStream(s);
_L4:
        httpurlconnection1 = httpurlconnection;
        obj3 = obj1;
        obj = httpurlconnection;
        obj2 = obj1;
        httpurlconnection2 = httpurlconnection;
        fileinputstream = ((FileInputStream) (obj1));
        bitmap = a(s, l, ((InputStream) (obj1)));
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        return bitmap;
_L2:
        httpurlconnection1 = obj5;
        obj3 = obj1;
        obj = obj6;
        obj2 = bitmap;
        httpurlconnection2 = obj7;
        fileinputstream = obj4;
        httpurlconnection = e.a(s);
        httpurlconnection1 = httpurlconnection;
        obj3 = obj1;
        obj = httpurlconnection;
        obj2 = bitmap;
        httpurlconnection2 = httpurlconnection;
        fileinputstream = obj4;
        l = httpurlconnection.getHeaderFieldDate("last-modified", l);
        httpurlconnection1 = httpurlconnection;
        obj3 = obj1;
        obj = httpurlconnection;
        obj2 = bitmap;
        httpurlconnection2 = httpurlconnection;
        fileinputstream = obj4;
        obj1 = httpurlconnection.getInputStream();
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        obj = httpurlconnection1;
        obj2 = obj3;
        throw new MalformedURLException((new StringBuilder("MalformedURLException url: ")).append(s).toString());
        s;
        IOException ioexception;
        if (obj2 != null)
        {
            try
            {
                ((InputStream) (obj2)).close();
            }
            catch (IOException ioexception1)
            {
                ioexception1.printStackTrace();
            }
        }
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw s;
        ioexception;
        obj = httpurlconnection2;
        obj2 = fileinputstream;
        ioexception.printStackTrace();
        obj = httpurlconnection2;
        obj2 = fileinputstream;
        throw new IOException((new StringBuilder("IOException reading from url ")).append(s).toString(), ioexception);
    }

    public final Bitmap a(String s)
    {
        s = d(s);
        if (s == null)
        {
            return null;
        } else
        {
            return ((a) (s)).b;
        }
    }

    public final Bitmap a(String s, long l)
    {
        s = d(s);
        if (s != null && ((a) (s)).a == l)
        {
            return ((a) (s)).b;
        } else
        {
            return null;
        }
    }

    public final Bitmap a(String s, long l, byte abyte0[], int i)
    {
        if (abyte0 == null || abyte0.length == 0)
        {
            return null;
        } else
        {
            Bitmap bitmap = BitmapFactory.decodeByteArray(abyte0, i, abyte0.length - i, d);
            a(s, bitmap, ((InputStream) (new ByteArrayInputStream(abyte0))), l, false);
            return bitmap;
        }
    }

    public final void a(File file, int i)
    {
        long l = i;
        try
        {
            c = com.a.a.a.a(file, l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            file.printStackTrace();
        }
    }

    public final void a(String s, Bitmap bitmap, InputStream inputstream, long l, boolean flag)
    {
        OutputStream outputstream;
        InputStream inputstream1;
        OutputStream outputstream1;
        Object obj2;
        Object obj3;
        byte abyte0[];
        Object obj4;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_450;
        }
        obj4 = String.valueOf(s.hashCode());
        s = new a(bitmap, l);
        bitmap = new java.util.AbstractMap.SimpleImmutableEntry(obj4, s);
        do
        {
            if (((a) (s)).b.getByteCount() <= b.c() - b.b())
            {
                break;
            }
            Object obj = b.d();
            Object obj1 = new PriorityQueue(((Map) (obj)).size() + 1, f);
            ((PriorityQueue) (obj1)).addAll(((Map) (obj)).entrySet());
            ((PriorityQueue) (obj1)).add(bitmap);
            obj = (java.util.Map.Entry)((PriorityQueue) (obj1)).peek();
            if (obj != bitmap)
            {
                b.b(((java.util.Map.Entry) (obj)).getKey());
            }
            obj1 = (a)((java.util.Map.Entry) (obj)).getValue();
            Bitmap bitmap1 = ((a) (obj1)).b;
            obj1.b = Bitmap.createScaledBitmap(bitmap1, bitmap1.getWidth() / 2, bitmap1.getHeight() / 2, false);
            if (obj != bitmap)
            {
                b.a(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
            }
        } while (true);
        b.a(obj4, s);
        if (c == null || inputstream == null || !flag)
        {
            break MISSING_BLOCK_LABEL_450;
        }
        abyte0 = null;
        outputstream1 = null;
        obj3 = null;
        obj2 = null;
        outputstream = outputstream1;
        inputstream1 = obj2;
        s = abyte0;
        bitmap = obj3;
        obj4 = c.b(((String) (obj4)));
        outputstream = outputstream1;
        inputstream1 = obj2;
        s = abyte0;
        bitmap = obj3;
        outputstream1 = ((com.a.a.a.a) (obj4)).a(0);
        outputstream = outputstream1;
        inputstream1 = obj2;
        s = outputstream1;
        bitmap = obj3;
        abyte0 = new byte[2048];
        outputstream = outputstream1;
        inputstream1 = obj2;
        s = outputstream1;
        bitmap = obj3;
        if (!inputstream.markSupported())
        {
            break MISSING_BLOCK_LABEL_363;
        }
        outputstream = outputstream1;
        inputstream1 = obj2;
        s = outputstream1;
        bitmap = obj3;
        inputstream.reset();
_L2:
        outputstream = outputstream1;
        inputstream1 = obj2;
        s = outputstream1;
        bitmap = obj3;
        int i = inputstream.read(abyte0);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_451;
        }
        outputstream = outputstream1;
        inputstream1 = obj2;
        s = outputstream1;
        bitmap = obj3;
        outputstream1.write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
_L1:
        inputstream;
        s = outputstream;
        bitmap = inputstream1;
        inputstream.printStackTrace();
        e.a(outputstream);
        e.a(inputstream1);
        return;
        outputstream = outputstream1;
        inputstream1 = obj2;
        s = outputstream1;
        bitmap = obj3;
        inputstream = ((com.a.a.a.a) (obj4)).a(1);
        outputstream = outputstream1;
        inputstream1 = inputstream;
        s = outputstream1;
        bitmap = inputstream;
        inputstream.write(String.valueOf(l).getBytes(Charsets.a));
        outputstream = outputstream1;
        inputstream1 = inputstream;
        s = outputstream1;
        bitmap = inputstream;
        ((com.a.a.a.a) (obj4)).a();
        e.a(outputstream1);
        e.a(inputstream);
        return;
        inputstream;
        e.a(s);
        e.a(bitmap);
        throw inputstream;
    }

    public final void b(String s)
    {
        s = String.valueOf(s.hashCode());
        b.b(s);
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        c.c(s);
        return;
        s;
        s.printStackTrace();
        return;
    }

    public final boolean b(String s, long l)
    {
        s = d(s);
        return s != null && ((a) (s)).a == l;
    }

    public final Bitmap c(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null url");
        }
        String s1 = String.valueOf(s.hashCode());
        Object obj1 = (a)b.a(s1);
        Object obj = null;
        if (obj1 == null)
        {
            Object obj2 = null;
            obj1 = obj2;
            if (c != null)
            {
                try
                {
                    obj1 = c.a(s1);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    ((IOException) (obj1)).printStackTrace();
                    obj1 = obj2;
                }
            }
            if (obj1 != null)
            {
                obj = ((com.a.a.a.c) (obj1)).a(0);
                obj = a(s1, System.currentTimeMillis(), ((InputStream) (obj)));
            }
            obj1 = obj;
            if (obj == null)
            {
                try
                {
                    obj1 = e(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    a.severe((new StringBuilder()).append(s.getClass().getSimpleName()).append(": ").append(s.getMessage()).toString());
                    return ((Bitmap) (obj));
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s.printStackTrace();
                    return ((Bitmap) (obj));
                }
            }
            return ((Bitmap) (obj1));
        } else
        {
            return ((a) (obj1)).b;
        }
    }

    public void close()
        throws IOException
    {
        b.a();
        if (c != null)
        {
            c.close();
            c = null;
        }
    }

}
