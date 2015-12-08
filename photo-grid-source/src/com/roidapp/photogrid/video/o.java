// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import com.roidapp.baselib.c.c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;

// Referenced classes of package com.roidapp.photogrid.video:
//            m, p

public final class o extends c
{

    private p a;
    private int b;

    public o(int i)
    {
        b = i;
    }

    private transient Boolean a(m am[])
    {
        if (!isCancelled()) goto _L2; else goto _L1
_L1:
        Object obj1 = Boolean.valueOf(false);
_L4:
        return ((Boolean) (obj1));
_L2:
        Object obj;
        int i;
        if (am == null || am.length <= 0)
        {
            return Boolean.valueOf(false);
        }
        i = 0;
        obj = Boolean.valueOf(true);
_L16:
        obj1 = obj;
        if (i >= am.length) goto _L4; else goto _L3
_L3:
        Object obj2;
        if (isCancelled())
        {
            return Boolean.valueOf(false);
        }
        obj2 = obj;
        if (am[i] == null) goto _L6; else goto _L5
_L5:
        obj2 = obj;
        if (am[i].b == null) goto _L6; else goto _L7
_L7:
        obj2 = obj;
        if (am[i].b.length() == 0) goto _L6; else goto _L8
_L8:
        obj2 = new String();
        (new StringBuilder("doInBackground url[")).append(i).append("]").append(am[i].b);
        if (!am[i].b.toLowerCase(Locale.ENGLISH).startsWith("http")) goto _L10; else goto _L9
_L9:
        Object obj4;
        new URL(am[i].b);
        obj4 = (HttpURLConnection)(new URL(am[i].b)).openConnection();
        Object obj3 = obj4;
        ((HttpURLConnection) (obj4)).setConnectTimeout(15000);
        obj3 = obj4;
        ((HttpURLConnection) (obj4)).setReadTimeout(15000);
        obj3 = obj4;
        ((HttpURLConnection) (obj4)).setDoInput(true);
        obj3 = obj4;
        ((HttpURLConnection) (obj4)).setDoOutput(false);
        obj3 = obj4;
        ((HttpURLConnection) (obj4)).connect();
        obj1 = obj4;
        obj3 = obj4;
        if (((HttpURLConnection) (obj4)).getResponseCode() != 400)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        obj3 = obj4;
        ((HttpURLConnection) (obj4)).disconnect();
        obj1 = (HttpURLConnection)(new URL(am[i].b)).openConnection();
        obj3 = obj1;
        ((HttpURLConnection) (obj1)).setConnectTimeout(15000);
        obj3 = obj1;
        ((HttpURLConnection) (obj1)).setReadTimeout(15000);
        obj3 = obj1;
        ((HttpURLConnection) (obj1)).setDoInput(true);
        obj3 = obj1;
        ((HttpURLConnection) (obj1)).setDoOutput(false);
        obj3 = obj1;
        ((HttpURLConnection) (obj1)).connect();
        obj4 = ((HttpURLConnection) (obj1)).getInputStream();
        obj3 = obj1;
        obj1 = obj4;
        break MISSING_BLOCK_LABEL_349;
_L10:
        obj1 = new FileInputStream(new File(am[i].b));
        obj3 = null;
          goto _L11
        obj3;
        obj1 = null;
_L20:
        ((Exception) (obj3)).printStackTrace();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_403;
        }
        ((HttpURLConnection) (obj1)).disconnect();
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj3)
            {
                ((IOException) (obj3)).printStackTrace();
            }
        } else
        {
            obj1 = null;
        }
        obj3 = obj1;
        obj1 = null;
_L11:
        StringBuilder stringbuilder;
        if (obj1 == null)
        {
            return Boolean.valueOf(false);
        }
        if (isCancelled())
        {
            return Boolean.valueOf(false);
        }
        obj4 = new BufferedReader(new InputStreamReader(((java.io.InputStream) (obj1))));
        stringbuilder = new StringBuilder();
_L15:
        obj1 = ((BufferedReader) (obj4)).readLine();
        if (obj1 == null) goto _L13; else goto _L12
_L12:
        if (isCancelled()) goto _L13; else goto _L14
_L14:
        stringbuilder.append((new StringBuilder()).append(((String) (obj1))).append("\n").toString());
          goto _L15
        obj;
        ((IOException) (obj)).printStackTrace();
        obj = Boolean.valueOf(false);
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_538;
        }
        ((HttpURLConnection) (obj3)).disconnect();
        ((BufferedReader) (obj4)).close();
        obj1 = obj2;
_L17:
        obj2 = obj;
        if (obj1 != null)
        {
            obj2 = obj;
            if (a != null)
            {
                a.a(am[i].a, ((String) (obj1)));
                obj2 = obj;
            }
        }
_L6:
        i++;
        obj = obj2;
          goto _L16
_L13:
        if (isCancelled())
        {
            break MISSING_BLOCK_LABEL_690;
        }
        obj1 = stringbuilder.toString();
_L21:
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_618;
        }
        ((HttpURLConnection) (obj3)).disconnect();
        ((BufferedReader) (obj4)).close();
          goto _L17
        obj2;
        ((IOException) (obj2)).printStackTrace();
          goto _L17
        obj1;
        ((IOException) (obj1)).printStackTrace();
        obj1 = obj2;
          goto _L17
        am;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_658;
        }
        ((HttpURLConnection) (obj3)).disconnect();
        ((BufferedReader) (obj4)).close();
_L19:
        throw am;
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
        if (true) goto _L19; else goto _L18
_L18:
        Exception exception;
        exception;
        obj1 = obj3;
        obj3 = exception;
          goto _L20
        obj3;
          goto _L20
        obj1 = obj2;
          goto _L21
    }

    public final void a(p p1)
    {
        a = p1;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((m[])aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Boolean)obj;
        super.onPostExecute(obj);
        if (!isCancelled() && a != null)
        {
            a.a(b, ((Boolean) (obj)).booleanValue());
        }
    }

    protected final void onPreExecute()
    {
        super.onPreExecute();
        if (a != null)
        {
            a.a(b);
        }
    }
}
