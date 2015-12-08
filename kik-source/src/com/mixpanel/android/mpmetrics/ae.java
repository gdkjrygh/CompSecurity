// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.apache.http.client.entity.UrlEncodedFormEntity;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            t

final class ae
{

    ae()
    {
    }

    public static boolean a(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context == null) goto _L2; else goto _L1
_L1:
        if (!context.isConnectedOrConnecting()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        boolean flag1 = flag;
        StringBuilder stringbuilder;
        if (!t.a)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        stringbuilder = new StringBuilder("ConnectivityManager says we ");
        if (flag)
        {
            context = "are";
        } else
        {
            context = "are not";
        }
        stringbuilder.append(context).append(" online");
        return flag;
        context;
        flag = t.a;
        flag1 = true;
        return flag1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static byte[] a(Context context, String as[])
    {
        if (a(context)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        int i;
        int j;
        j = as.length;
        i = 0;
_L4:
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        context = as[i];
        byte abyte0[] = a(((String) (context)), null, null);
        return abyte0;
        Object obj;
        obj;
        Log.e("MixpanelAPI", (new StringBuilder("Cannot interpret ")).append(context).append(" as a URL.").toString(), ((Throwable) (obj)));
_L5:
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        continue; /* Loop/switch isn't completed */
        obj;
        if (t.a)
        {
            (new StringBuilder("Cannot get ")).append(context).append(".");
        }
          goto _L5
        as;
        Log.e("MixpanelAPI", (new StringBuilder("Out of memory when getting to ")).append(context).append(".").toString(), as);
        return null;
        if (true) goto _L1; else goto _L6
_L6:
    }

    private static byte[] a(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[8192];
        do
        {
            int i = inputstream.read(abyte0, 0, 8192);
            if (i != -1)
            {
                bytearrayoutputstream.write(abyte0, 0, i);
            } else
            {
                bytearrayoutputstream.flush();
                return bytearrayoutputstream.toByteArray();
            }
        } while (true);
    }

    public static byte[] a(String s, List list, String s1)
    {
        byte abyte0[];
        Object obj4;
        boolean flag;
        int i;
        flag = false;
        obj4 = null;
        boolean flag1 = t.a;
        i = 0;
        abyte0 = null;
_L3:
        if (i >= 3 || flag) goto _L2; else goto _L1
_L1:
        Object obj = (HttpURLConnection)(new URL(s)).openConnection();
        ((HttpURLConnection) (obj)).setConnectTimeout(2000);
        ((HttpURLConnection) (obj)).setReadTimeout(10000);
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        String s2 = System.getProperty("http.agent");
        ((HttpURLConnection) (obj)).addRequestProperty("User-Agent", (new StringBuilder("Kik/")).append(s1).append(" ").append(s2).toString());
        Object obj1;
        Object obj3;
        ((HttpURLConnection) (obj)).setDoOutput(true);
        obj3 = new UrlEncodedFormEntity(list, "UTF-8");
        ((HttpURLConnection) (obj)).setRequestMethod("POST");
        ((HttpURLConnection) (obj)).setFixedLengthStreamingMode((int)((UrlEncodedFormEntity) (obj3)).getContentLength());
        obj1 = ((HttpURLConnection) (obj)).getOutputStream();
        Object obj2 = new BufferedOutputStream(((OutputStream) (obj1)));
        ((UrlEncodedFormEntity) (obj3)).writeTo(((OutputStream) (obj2)));
        ((BufferedOutputStream) (obj2)).close();
        ((OutputStream) (obj1)).close();
        obj1 = ((HttpURLConnection) (obj)).getInputStream();
        obj2 = a(((InputStream) (obj1)));
        abyte0 = ((byte []) (obj2));
        ((InputStream) (obj1)).close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_593;
        }
        ((HttpURLConnection) (obj)).disconnect();
        flag = true;
          goto _L3
        obj;
        Object obj5 = null;
        obj3 = null;
        obj2 = null;
        obj = abyte0;
        obj1 = null;
        abyte0 = obj5;
_L7:
        boolean flag2 = t.a;
        i++;
        if (obj1 != null)
        {
            try
            {
                ((BufferedOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj3 != null)
        {
            try
            {
                ((OutputStream) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj2 != null)
        {
            try
            {
                ((InputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (abyte0 == null) goto _L5; else goto _L4
_L4:
        abyte0.disconnect();
        abyte0 = ((byte []) (obj));
          goto _L3
        s;
        list = null;
        obj = null;
        obj2 = null;
        s1 = obj4;
_L6:
        if (list != null)
        {
            try
            {
                list.close();
            }
            // Misplaced declaration of an exception variable
            catch (List list) { }
        }
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (List list) { }
        }
        if (obj2 != null)
        {
            try
            {
                ((InputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (List list) { }
        }
        if (s1 != null)
        {
            s1.disconnect();
        }
        throw s;
_L5:
        abyte0 = ((byte []) (obj));
          goto _L3
_L2:
        return abyte0;
        s;
        list = null;
        abyte0 = null;
        obj2 = null;
        s1 = ((String) (obj));
        obj = abyte0;
          goto _L6
        s;
        list = null;
        obj2 = null;
        s1 = ((String) (obj));
        obj = obj1;
          goto _L6
        s;
        abyte0 = null;
        s1 = ((String) (obj));
        list = ((List) (obj2));
        obj = obj1;
        obj2 = abyte0;
          goto _L6
        s;
        list = null;
        abyte0 = null;
        s1 = ((String) (obj));
        obj = abyte0;
        obj2 = obj1;
          goto _L6
        s;
        s1 = abyte0;
        list = ((List) (obj1));
        obj = obj3;
          goto _L6
        obj1;
        obj1 = obj;
        obj3 = null;
        obj2 = null;
        obj = abyte0;
        Object obj6 = null;
        abyte0 = ((byte []) (obj1));
        obj1 = obj6;
          goto _L7
        obj2;
        obj3 = obj1;
        obj2 = null;
        Object obj7 = null;
        obj1 = obj;
        obj = abyte0;
        abyte0 = ((byte []) (obj1));
        obj1 = obj7;
          goto _L7
        EOFException eofexception1;
        eofexception1;
        eofexception1 = ((EOFException) (obj1));
        Object obj8 = null;
        obj1 = obj;
        obj = abyte0;
        abyte0 = ((byte []) (obj1));
        obj1 = obj2;
        obj2 = obj8;
          goto _L7
        EOFException eofexception;
        eofexception;
        eofexception1 = null;
        eofexception = ((EOFException) (obj1));
        Object obj9 = null;
        obj1 = obj;
        obj = abyte0;
        abyte0 = ((byte []) (obj1));
        obj1 = obj9;
          goto _L7
        eofexception;
        Object obj10 = null;
        eofexception1 = null;
        eofexception = ((EOFException) (obj1));
        obj1 = obj;
        obj = abyte0;
        abyte0 = ((byte []) (obj1));
        obj1 = obj10;
          goto _L7
        flag = true;
        obj = abyte0;
          goto _L5
    }
}
