// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Future;

// Referenced classes of package com.google.ads:
//            f

public class h
{

    public static final a a = new _cls1();

    public h()
    {
    }

    public static byte[] a(InputStream inputstream)
    {
        Object obj;
        byte abyte1[];
        obj = new ByteArrayOutputStream();
        abyte1 = new byte[1024];
_L1:
        int i;
        try
        {
            i = inputstream.read(abyte1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            byte abyte0[];
            Exception exception;
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
            return null;
        }
        finally { }
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        ((ByteArrayOutputStream) (obj)).write(abyte1, 0, i);
          goto _L1
        ((ByteArrayOutputStream) (obj)).close();
        abyte0 = ((ByteArrayOutputStream) (obj)).toByteArray();
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return abyte0;
        }
        return abyte0;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        throw exception;
    }

    public Future a(String s, a a1)
    {
        return f.a(new _cls2(s, a1));
    }


    private class _cls2
        implements Callable
    {

        final String a;
        final a b;
        final h c;

        public Object call()
        {
            Object obj;
            Object obj2;
            Object obj4;
            obj4 = null;
            obj = null;
            obj2 = null;
            Object obj1 = (HttpURLConnection)(new URL(a)).openConnection();
            int i;
            ((HttpURLConnection) (obj1)).connect();
            i = ((HttpURLConnection) (obj1)).getResponseCode();
            if (i < 200 || i > 299)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            obj = b.b(((HttpURLConnection) (obj1)).getInputStream());
            if (obj1 != null)
            {
                ((HttpURLConnection) (obj1)).disconnect();
            }
            return obj;
            if (obj1 != null)
            {
                ((HttpURLConnection) (obj1)).disconnect();
            }
_L1:
            return b.b();
            obj;
            obj1 = obj2;
            obj2 = obj;
_L5:
            obj = obj1;
            Log.w("Ads", "Error making request.", ((Throwable) (obj2)));
            if (obj1 != null)
            {
                ((HttpURLConnection) (obj1)).disconnect();
            }
              goto _L1
            Object obj3;
            obj3;
            obj1 = obj4;
_L4:
            obj = obj1;
            Log.w("Ads", "Error making request.", ((Throwable) (obj3)));
            if (obj1 != null)
            {
                ((HttpURLConnection) (obj1)).disconnect();
            }
              goto _L1
            obj3;
            obj1 = obj;
            obj = obj3;
_L3:
            if (obj1 != null)
            {
                ((HttpURLConnection) (obj1)).disconnect();
            }
            throw obj;
            obj;
            if (true) goto _L3; else goto _L2
_L2:
            obj3;
              goto _L4
            obj3;
              goto _L5
        }

        _cls2(String s, a a1)
        {
            c = h.this;
            a = s;
            b = a1;
            super();
        }

        private class a
        {

            public abstract Object b();

            public abstract Object b(InputStream inputstream);
        }

    }


    private class _cls1
        implements a
    {

        public final Void a()
        {
            return null;
        }

        public final Void a(InputStream inputstream)
        {
            return null;
        }

        public final Object b()
        {
            return a();
        }

        public final Object b(InputStream inputstream)
        {
            return a(inputstream);
        }

        _cls1()
        {
        }
    }

}
