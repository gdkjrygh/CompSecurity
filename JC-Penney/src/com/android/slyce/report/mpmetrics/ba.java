// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

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

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            ab

class ba
{

    ba()
    {
    }

    private byte[] a(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[8192];
        do
        {
            int i = inputstream.read(abyte0, 0, abyte0.length);
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

    public boolean a(Context context)
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
        if (!ab.a)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        stringbuilder = (new StringBuilder()).append("ConnectivityManager says we ");
        if (flag)
        {
            context = "are";
        } else
        {
            context = "are not";
        }
        Log.v("MixpanelAPI.ServerMessage", stringbuilder.append(context).append(" online").toString());
        return flag;
        context;
        if (ab.a)
        {
            Log.v("MixpanelAPI.ServerMessage", "Don't have permission to check connectivity, will assume we are online");
        }
        flag1 = true;
        return flag1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public byte[] a(Context context, String as[])
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
        byte abyte0[] = a(((String) (context)), ((List) (null)));
        return abyte0;
        Object obj;
        obj;
        Log.e("MixpanelAPI.ServerMessage", (new StringBuilder()).append("Cannot interpret ").append(context).append(" as a URL.").toString(), ((Throwable) (obj)));
_L5:
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        continue; /* Loop/switch isn't completed */
        obj;
        if (ab.a)
        {
            Log.v("MixpanelAPI.ServerMessage", (new StringBuilder()).append("Cannot get ").append(context).append(".").toString(), ((Throwable) (obj)));
        }
          goto _L5
        as;
        Log.e("MixpanelAPI.ServerMessage", (new StringBuilder()).append("Out of memory when getting to ").append(context).append(".").toString(), as);
        return null;
        if (true) goto _L1; else goto _L6
_L6:
    }

    public byte[] a(String s, List list)
    {
        Object obj1;
        Object obj5;
        int i;
        int j;
        j = 0;
        obj5 = null;
        if (ab.a)
        {
            Log.v("MixpanelAPI.ServerMessage", (new StringBuilder()).append("Attempting request to ").append(s).toString());
        }
        i = 0;
        obj1 = null;
_L2:
        if (i >= 3 || j != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = (HttpURLConnection)(new URL(s)).openConnection();
        Object obj2;
        Object obj3;
        UrlEncodedFormEntity urlencodedformentity;
        Object obj6;
        int k;
        try
        {
            ((HttpURLConnection) (obj)).setConnectTimeout(2000);
            ((HttpURLConnection) (obj)).setReadTimeout(10000);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            obj2 = obj;
            obj3 = null;
            obj4 = null;
            obj = obj1;
            Object obj7 = null;
            obj1 = obj2;
            obj2 = obj7;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj2 = null;
            obj1 = null;
            obj4 = null;
            list = ((List) (obj));
            obj = obj1;
            continue; /* Loop/switch isn't completed */
        }
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        ((HttpURLConnection) (obj)).setDoOutput(true);
        urlencodedformentity = new UrlEncodedFormEntity(list, "UTF-8");
        ((HttpURLConnection) (obj)).setRequestMethod("POST");
        ((HttpURLConnection) (obj)).setFixedLengthStreamingMode((int)urlencodedformentity.getContentLength());
        obj2 = ((HttpURLConnection) (obj)).getOutputStream();
        try
        {
            obj3 = new BufferedOutputStream(((OutputStream) (obj2)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            obj3 = obj2;
            obj4 = null;
            Object obj8 = null;
            obj2 = obj;
            obj = obj1;
            obj1 = obj2;
            obj2 = obj8;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj1 = null;
            obj4 = null;
            list = ((List) (obj));
            obj = obj2;
            obj2 = obj1;
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            urlencodedformentity.writeTo(((OutputStream) (obj3)));
            ((BufferedOutputStream) (obj3)).close();
        }
        catch (EOFException eofexception2)
        {
            eofexception2 = ((EOFException) (obj2));
            Object obj9 = null;
            obj2 = obj;
            obj = obj1;
            obj1 = obj2;
            obj2 = obj3;
            obj3 = eofexception2;
            eofexception2 = obj9;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj4 = null;
            list = ((List) (obj));
            obj = obj2;
            obj2 = obj3;
            continue; /* Loop/switch isn't completed */
        }
        ((OutputStream) (obj2)).close();
        obj2 = ((HttpURLConnection) (obj)).getInputStream();
        try
        {
            obj3 = a(((InputStream) (obj2)));
        }
        catch (EOFException eofexception)
        {
            eofexception = null;
            eofexception2 = ((EOFException) (obj2));
            obj2 = obj1;
            Object obj10 = null;
            obj1 = obj;
            obj = obj2;
            obj2 = obj10;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj1 = null;
            obj4 = obj2;
            obj2 = null;
            list = ((List) (obj));
            obj = obj2;
            obj2 = obj1;
        }
        obj1 = obj3;
        ((InputStream) (obj2)).close();
        Object obj4;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
        }
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
        }
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
        }
        EOFException eofexception1;
        Object obj11;
        int l;
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
            k = 1;
            obj = obj1;
            j = i;
            i = k;
        } else
        {
            boolean flag = true;
            j = i;
            obj = obj1;
            i = ((flag) ? 1 : 0);
        }
        k = j;
        j = i;
        i = k;
        obj1 = obj;
        if (true) goto _L2; else goto _L1
        obj;
        obj6 = null;
        obj3 = null;
        obj4 = null;
        obj = obj1;
        obj2 = null;
        obj1 = obj6;
_L6:
        if (ab.a)
        {
            Log.d("MixpanelAPI.ServerMessage", "Failure to connect, likely caused by a known issue with Android lib. Retrying.");
        }
        i++;
        if (obj2 != null)
        {
            try
            {
                ((BufferedOutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
        }
        if (obj3 != null)
        {
            try
            {
                ((OutputStream) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
        }
        if (obj4 != null)
        {
            try
            {
                ((InputStream) (obj4)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
        }
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
            k = i;
            i = j;
            j = k;
        } else
        {
            l = i;
            i = j;
            j = l;
        }
        break MISSING_BLOCK_LABEL_235;
        s;
        list = ((List) (obj1));
        obj = obj3;
_L4:
        if (obj2 != null)
        {
            try
            {
                ((BufferedOutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj4 != null)
        {
            try
            {
                ((InputStream) (obj4)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (list != null)
        {
            list.disconnect();
        }
        throw s;
_L1:
        if (ab.a && i >= 3)
        {
            Log.v("MixpanelAPI.ServerMessage", "Could not connect to Mixpanel service after three retries.");
        }
        return ((byte []) (obj1));
        s;
        obj2 = null;
        obj = null;
        obj4 = null;
        list = obj5;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
        eofexception1;
        obj11 = null;
        eofexception1 = null;
        eofexception2 = ((EOFException) (obj2));
        obj2 = obj;
        obj = obj1;
        obj1 = obj2;
        obj2 = obj11;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
