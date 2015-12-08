// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.util.Log;
import com.mixpanel.android.util.RemoteService;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class cym
    implements RemoteService
{

    public cym()
    {
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

    public final boolean a(Context context)
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
        if (!cxi.a)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        stringbuilder = new StringBuilder("ConnectivityManager says we ");
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
        if (cxi.a)
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

    public final byte[] a(String s, Map map, SSLSocketFactory sslsocketfactory)
    {
        byte abyte0[];
        int i;
        int j;
        if (cxi.a)
        {
            Log.v("MixpanelAPI.Message", (new StringBuilder("Attempting request to ")).append(s).toString());
        }
        j = 0;
        i = 0;
        abyte0 = null;
_L8:
        if (j >= 3 || i != 0) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        obj8 = null;
        obj3 = null;
        obj9 = null;
        obj7 = null;
        obj14 = null;
        obj1 = null;
        obj15 = null;
        obj12 = null;
        obj11 = null;
        obj2 = null;
        obj13 = null;
        obj10 = null;
        obj4 = null;
        obj16 = null;
        Object obj = (HttpURLConnection)(new URL(s)).openConnection();
        if (sslsocketfactory == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        if (obj instanceof HttpsURLConnection)
        {
            ((HttpsURLConnection)obj).setSSLSocketFactory(sslsocketfactory);
        }
        ((HttpURLConnection) (obj)).setConnectTimeout(2000);
        ((HttpURLConnection) (obj)).setReadTimeout(10000);
        if (map == null) goto _L4; else goto _L3
_L3:
        obj1 = new android.net.Uri.Builder();
        for (obj2 = map.entrySet().iterator(); ((Iterator) (obj2)).hasNext(); ((android.net.Uri.Builder) (obj1)).appendQueryParameter((String)((java.util.Map.Entry) (obj3)).getKey(), ((java.util.Map.Entry) (obj3)).getValue().toString()))
        {
            obj3 = (java.util.Map.Entry)((Iterator) (obj2)).next();
        }

          goto _L5
        obj1;
        obj4 = abyte0;
        obj3 = obj7;
        obj1 = obj12;
        obj2 = obj10;
        abyte0 = ((byte []) (obj));
        obj = obj4;
_L13:
        if (cxi.a)
        {
            Log.d("MixpanelAPI.Message", "Failure to connect, likely caused by a known issue with Android lib. Retrying.");
        }
        j++;
        int k;
        if (obj2 != null)
        {
            try
            {
                ((BufferedOutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((OutputStream) (obj1)).close();
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
        if (abyte0 == null) goto _L7; else goto _L6
_L6:
        abyte0.disconnect();
        abyte0 = ((byte []) (obj));
          goto _L8
_L5:
        obj3 = ((android.net.Uri.Builder) (obj1)).build().getEncodedQuery();
        ((HttpURLConnection) (obj)).setFixedLengthStreamingMode(((String) (obj3)).getBytes().length);
        ((HttpURLConnection) (obj)).setDoOutput(true);
        ((HttpURLConnection) (obj)).setRequestMethod("POST");
        obj1 = ((HttpURLConnection) (obj)).getOutputStream();
        obj2 = new BufferedOutputStream(((OutputStream) (obj1)));
        ((BufferedOutputStream) (obj2)).write(((String) (obj3)).getBytes("UTF-8"));
        ((BufferedOutputStream) (obj2)).flush();
        ((BufferedOutputStream) (obj2)).close();
        ((OutputStream) (obj1)).close();
_L4:
        obj1 = ((HttpURLConnection) (obj)).getInputStream();
        obj2 = a(((InputStream) (obj1)));
        abyte0 = ((byte []) (obj2));
        ((InputStream) (obj1)).close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1054;
        }
        ((HttpURLConnection) (obj)).disconnect();
        i = 1;
          goto _L8
        map;
        abyte0 = obj8;
        sslsocketfactory = obj14;
        obj = obj11;
        s = obj16;
_L12:
        obj4 = s;
        obj2 = obj;
        obj1 = sslsocketfactory;
        obj3 = abyte0;
        if (503 != s.getResponseCode()) goto _L10; else goto _L9
_L9:
        obj4 = s;
        obj2 = obj;
        obj1 = sslsocketfactory;
        obj3 = abyte0;
        throw new com.mixpanel.android.util.RemoteService.ServiceUnavailableException("Service Unavailable", s.getHeaderField("Retry-After"));
        s;
        map = ((Map) (obj4));
_L11:
        if (obj2 != null)
        {
            try
            {
                ((BufferedOutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (SSLSocketFactory sslsocketfactory) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((OutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (SSLSocketFactory sslsocketfactory) { }
        }
        if (obj3 != null)
        {
            try
            {
                ((InputStream) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (SSLSocketFactory sslsocketfactory) { }
        }
        if (map != null)
        {
            map.disconnect();
        }
        throw s;
_L10:
        obj4 = s;
        obj2 = obj;
        obj1 = sslsocketfactory;
        obj3 = abyte0;
        throw map;
_L7:
        k = i;
        abyte0 = ((byte []) (obj));
        i = j;
        j = k;
_L14:
        k = i;
        i = j;
        j = k;
          goto _L8
_L2:
        if (cxi.a && j >= 3)
        {
            Log.v("MixpanelAPI.Message", "Could not connect to Mixpanel service after three retries.");
        }
        return abyte0;
        s;
        map = ((Map) (obj));
        obj2 = obj13;
        obj1 = obj15;
        obj3 = obj9;
          goto _L11
        s;
        map = ((Map) (obj));
        obj2 = obj13;
        obj3 = obj9;
          goto _L11
        s;
        map = ((Map) (obj));
        obj3 = obj9;
          goto _L11
        s;
        obj2 = null;
        map = ((Map) (obj));
        obj3 = obj9;
          goto _L11
        s;
        obj1 = null;
        obj2 = null;
        map = ((Map) (obj));
        obj3 = obj9;
          goto _L11
        s;
        obj3 = obj1;
        obj1 = null;
        obj2 = null;
        map = ((Map) (obj));
          goto _L11
        s;
        map = abyte0;
          goto _L11
        map;
        s = ((String) (obj));
        obj = obj11;
        sslsocketfactory = obj14;
        abyte0 = obj8;
          goto _L12
        map;
        sslsocketfactory = ((SSLSocketFactory) (obj1));
        s = ((String) (obj));
        obj = obj11;
        abyte0 = obj8;
          goto _L12
        map;
        sslsocketfactory = ((SSLSocketFactory) (obj1));
        s = ((String) (obj));
        obj = obj2;
        abyte0 = obj8;
          goto _L12
        map;
        abyte0 = null;
        sslsocketfactory = ((SSLSocketFactory) (obj1));
        s = ((String) (obj));
        obj = abyte0;
        abyte0 = obj8;
          goto _L12
        map;
        sslsocketfactory = null;
        abyte0 = null;
        s = ((String) (obj));
        obj = abyte0;
        abyte0 = obj8;
          goto _L12
        map;
        abyte0 = ((byte []) (obj1));
        sslsocketfactory = null;
        obj1 = null;
        s = ((String) (obj));
        obj = obj1;
          goto _L12
        obj;
        obj1 = null;
        obj = abyte0;
        abyte0 = ((byte []) (obj1));
        obj2 = obj10;
        obj1 = obj12;
        obj3 = obj7;
          goto _L13
        EOFException eofexception;
        eofexception;
        eofexception = ((EOFException) (obj));
        obj = abyte0;
        abyte0 = eofexception;
        eofexception = obj10;
        obj3 = obj7;
          goto _L13
        EOFException eofexception1;
        eofexception1;
        eofexception1 = ((EOFException) (obj));
        obj = abyte0;
        abyte0 = eofexception1;
        eofexception1 = obj7;
          goto _L13
        eofexception;
        eofexception1 = null;
        eofexception = ((EOFException) (obj));
        obj = abyte0;
        abyte0 = eofexception;
        eofexception = eofexception1;
        eofexception1 = obj7;
          goto _L13
        obj1;
        obj1 = obj;
        eofexception1 = null;
        eofexception = null;
        obj = abyte0;
        abyte0 = ((byte []) (obj1));
        obj1 = eofexception1;
        eofexception1 = obj7;
          goto _L13
        eofexception;
        eofexception = ((EOFException) (obj));
        eofexception1 = ((EOFException) (obj1));
        obj1 = null;
        Object obj5 = null;
        obj = abyte0;
        abyte0 = eofexception;
        eofexception = obj5;
          goto _L13
        eofexception;
        eofexception1 = ((EOFException) (obj1));
        Object obj6 = null;
        eofexception = null;
        obj1 = obj;
        obj = abyte0;
        abyte0 = ((byte []) (obj1));
        obj1 = obj6;
          goto _L13
        boolean flag = true;
        i = j;
        j = ((flag) ? 1 : 0);
          goto _L14
    }
}
