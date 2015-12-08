// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.mixpanel.android.mpmetrics.g;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.apache.http.client.entity.UrlEncodedFormEntity;

// Referenced classes of package com.mixpanel.android.util:
//            RemoteService

public class c
    implements RemoteService
{

    private static final String a = "MixpanelAPI.Message";

    public c()
    {
    }

    private static byte[] a(InputStream inputstream)
        throws IOException
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
        if (!g.b)
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
        Log.v("MixpanelAPI.Message", stringbuilder.append(context).append(" online").toString());
        return flag;
        context;
        if (g.b)
        {
            Log.v("MixpanelAPI.Message", "Don't have permission to check connectivity, will assume we are online");
        }
        flag1 = true;
        return flag1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public byte[] a(String s, List list)
        throws RemoteService.ServiceUnavailableException, IOException
    {
        byte abyte0[];
        Object obj4;
        Object obj5;
        int i;
        int j;
        j = 0;
        obj4 = null;
        obj5 = null;
        if (g.b)
        {
            Log.v("MixpanelAPI.Message", (new StringBuilder()).append("Attempting request to ").append(s).toString());
        }
        i = 0;
        abyte0 = null;
_L2:
        if (i >= 3 || j != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = (HttpURLConnection)(new URL(s)).openConnection();
        Object obj1;
        Object obj2;
        UrlEncodedFormEntity urlencodedformentity;
        Object obj6;
        int k;
        try
        {
            ((HttpURLConnection) (obj)).setConnectTimeout(2000);
            ((HttpURLConnection) (obj)).setReadTimeout(10000);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj1 = obj;
            obj2 = null;
            obj3 = null;
            obj = abyte0;
            Object obj7 = null;
            abyte0 = ((byte []) (obj1));
            obj1 = obj7;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            obj2 = null;
            obj1 = null;
            list = null;
            abyte0 = ((byte []) (obj));
            obj = obj2;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj2 = null;
            obj1 = null;
            list = null;
            abyte0 = ((byte []) (obj));
            obj = obj2;
            continue; /* Loop/switch isn't completed */
        }
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        ((HttpURLConnection) (obj)).setDoOutput(true);
        urlencodedformentity = new UrlEncodedFormEntity(list, "UTF-8");
        ((HttpURLConnection) (obj)).setRequestMethod("POST");
        ((HttpURLConnection) (obj)).setFixedLengthStreamingMode((int)urlencodedformentity.getContentLength());
        obj1 = ((HttpURLConnection) (obj)).getOutputStream();
        try
        {
            obj2 = new BufferedOutputStream(((OutputStream) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            obj2 = obj1;
            obj3 = null;
            obj1 = abyte0;
            Object obj8 = null;
            abyte0 = ((byte []) (obj));
            obj = obj1;
            obj1 = obj8;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            obj2 = null;
            list = null;
            abyte0 = ((byte []) (obj));
            obj = obj2;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj2 = null;
            list = null;
            abyte0 = ((byte []) (obj));
            obj = obj2;
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            urlencodedformentity.writeTo(((OutputStream) (obj2)));
            ((BufferedOutputStream) (obj2)).close();
        }
        catch (EOFException eofexception1)
        {
            eofexception1 = ((EOFException) (obj1));
            Object obj9 = null;
            obj1 = obj;
            obj = abyte0;
            abyte0 = ((byte []) (obj1));
            obj1 = obj2;
            obj2 = eofexception1;
            eofexception1 = obj9;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            list = null;
            abyte0 = ((byte []) (obj));
            obj = obj2;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            list = null;
            abyte0 = ((byte []) (obj));
            obj = obj2;
            continue; /* Loop/switch isn't completed */
        }
        ((OutputStream) (obj1)).close();
        obj1 = ((HttpURLConnection) (obj)).getInputStream();
        obj2 = a(((InputStream) (obj1)));
        abyte0 = ((byte []) (obj2));
        ((InputStream) (obj1)).close();
        Object obj3;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        EOFException eofexception;
        Object obj10;
        int l;
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
            k = 1;
            obj = abyte0;
            j = i;
            i = k;
        } else
        {
            boolean flag = true;
            j = i;
            obj = abyte0;
            i = ((flag) ? 1 : 0);
        }
        k = j;
        j = i;
        i = k;
        abyte0 = ((byte []) (obj));
        if (true) goto _L2; else goto _L1
        obj;
        obj6 = null;
        obj2 = null;
        obj3 = null;
        obj = abyte0;
        obj1 = null;
        abyte0 = obj6;
_L8:
        if (g.b)
        {
            Log.d("MixpanelAPI.Message", "Failure to connect, likely caused by a known issue with Android lib. Retrying.");
        }
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
        if (obj2 != null)
        {
            try
            {
                ((OutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj3 != null)
        {
            try
            {
                ((InputStream) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (abyte0 != null)
        {
            abyte0.disconnect();
            k = i;
            i = j;
            j = k;
        } else
        {
            l = i;
            i = j;
            j = l;
        }
        break MISSING_BLOCK_LABEL_237;
        s;
        obj = null;
        obj1 = null;
        list = null;
        abyte0 = obj5;
_L6:
        if (503 == abyte0.getResponseCode())
        {
            throw new RemoteService.ServiceUnavailableException("Service Unavailable", abyte0.getHeaderField("Retry-After"));
        }
          goto _L3
        s;
_L5:
        if (obj != null)
        {
            try
            {
                ((BufferedOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((OutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (list != null)
        {
            try
            {
                list.close();
            }
            // Misplaced declaration of an exception variable
            catch (List list) { }
        }
        if (abyte0 != null)
        {
            abyte0.disconnect();
        }
        throw s;
_L3:
        throw s;
_L1:
        if (g.b && i >= 3)
        {
            Log.v("MixpanelAPI.Message", "Could not connect to Mixpanel service after three retries.");
        }
        return abyte0;
        s;
        obj = obj1;
        list = ((List) (obj3));
        obj1 = obj2;
        continue; /* Loop/switch isn't completed */
        s;
        obj = null;
        obj1 = null;
        list = null;
        abyte0 = obj4;
        continue; /* Loop/switch isn't completed */
        s;
        obj2 = null;
        list = ((List) (obj1));
        obj1 = null;
        abyte0 = ((byte []) (obj));
        obj = obj2;
        if (true) goto _L5; else goto _L4
        s;
        obj2 = null;
        list = ((List) (obj1));
        obj1 = null;
        abyte0 = ((byte []) (obj));
        obj = obj2;
        if (true) goto _L6; else goto _L4
        eofexception;
        eofexception = null;
        eofexception1 = ((EOFException) (obj1));
        obj1 = abyte0;
        obj10 = null;
        abyte0 = ((byte []) (obj));
        obj = obj1;
        obj1 = obj10;
        continue; /* Loop/switch isn't completed */
        eofexception;
        obj10 = null;
        eofexception = null;
        eofexception1 = ((EOFException) (obj1));
        obj1 = obj;
        obj = abyte0;
        abyte0 = ((byte []) (obj1));
        obj1 = obj10;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
