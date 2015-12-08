// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.util.Log;
import android.webkit.CookieManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;
import org.apache.cordova.api.PluginResult;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova:
//            FileTransfer, FileProgressResult, FileUtils

class val.objectId
    implements Runnable
{

    final FileTransfer this$0;
    final questContext val$context;
    final String val$objectId;
    final String val$source;
    final String val$target;
    final boolean val$trustEveryone;
    final URL val$url;
    final boolean val$useHttps;

    public void run()
    {
        if (!val$context.aborted) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj6;
        Object obj7;
        javax.net.ssl.SSLSocketFactory sslsocketfactory;
        Object obj9;
        Object obj10;
        javax.net.ssl.SSLSocketFactory sslsocketfactory1;
        Object obj11;
        javax.net.ssl.SSLSocketFactory sslsocketfactory2;
        Object obj12;
        javax.net.ssl.SSLSocketFactory sslsocketfactory3;
        Object obj13;
        javax.net.ssl.SSLSocketFactory sslsocketfactory4;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        FileOutputStream fileoutputstream;
        FileProgressResult fileprogressresult;
        Object obj20;
        Object obj21;
        Object obj22;
        Object obj23;
        Object obj24;
        Object obj25;
        Object obj26;
        Object obj27;
        Object obj28;
        Object obj29;
        obj18 = null;
        obj19 = null;
        fileoutputstream = null;
        fileprogressresult = null;
        obj = null;
        obj20 = null;
        obj21 = null;
        obj22 = null;
        obj23 = null;
        obj24 = null;
        obj7 = null;
        obj25 = null;
        obj26 = null;
        obj27 = null;
        obj28 = null;
        obj29 = null;
        sslsocketfactory = null;
        obj14 = obj;
        obj10 = obj20;
        sslsocketfactory1 = obj25;
        obj15 = obj18;
        obj11 = obj21;
        sslsocketfactory2 = obj26;
        obj17 = obj19;
        obj13 = obj22;
        sslsocketfactory4 = obj27;
        obj16 = fileoutputstream;
        obj12 = obj23;
        sslsocketfactory3 = obj28;
        obj9 = fileprogressresult;
        obj5 = obj24;
        obj6 = obj29;
        File file = FileTransfer.access$700(FileTransfer.this, val$target);
        obj14 = obj;
        obj10 = obj20;
        sslsocketfactory1 = obj25;
        obj15 = obj18;
        obj11 = obj21;
        sslsocketfactory2 = obj26;
        obj17 = obj19;
        obj13 = obj22;
        sslsocketfactory4 = obj27;
        obj16 = fileoutputstream;
        obj12 = obj23;
        sslsocketfactory3 = obj28;
        obj9 = fileprogressresult;
        obj5 = obj24;
        obj6 = obj29;
        file.getParentFile().mkdirs();
        obj14 = obj;
        obj10 = obj20;
        sslsocketfactory1 = obj25;
        obj15 = obj18;
        obj11 = obj21;
        sslsocketfactory2 = obj26;
        obj17 = obj19;
        obj13 = obj22;
        sslsocketfactory4 = obj27;
        obj16 = fileoutputstream;
        obj12 = obj23;
        sslsocketfactory3 = obj28;
        obj9 = fileprogressresult;
        obj5 = obj24;
        obj6 = obj29;
        if (!val$useHttps) goto _L4; else goto _L3
_L3:
        obj14 = obj;
        obj10 = obj20;
        sslsocketfactory1 = obj25;
        obj15 = obj18;
        obj11 = obj21;
        sslsocketfactory2 = obj26;
        obj17 = obj19;
        obj13 = obj22;
        sslsocketfactory4 = obj27;
        obj16 = fileoutputstream;
        obj12 = obj23;
        sslsocketfactory3 = obj28;
        obj9 = fileprogressresult;
        obj5 = obj24;
        obj6 = obj29;
        if (val$trustEveryone) goto _L6; else goto _L5
_L5:
        obj14 = obj;
        obj10 = obj20;
        sslsocketfactory1 = obj25;
        obj15 = obj18;
        obj11 = obj21;
        sslsocketfactory2 = obj26;
        obj17 = obj19;
        obj13 = obj22;
        sslsocketfactory4 = obj27;
        obj16 = fileoutputstream;
        obj12 = obj23;
        sslsocketfactory3 = obj28;
        obj9 = fileprogressresult;
        obj5 = obj24;
        obj6 = obj29;
        obj = (HttpsURLConnection)val$url.openConnection();
_L7:
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        ((HttpURLConnection) (obj)).setRequestMethod("GET");
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        obj18 = CookieManager.getInstance().getCookie(val$source);
        if (obj18 == null)
        {
            break MISSING_BLOCK_LABEL_583;
        }
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        ((HttpURLConnection) (obj)).setRequestProperty("cookie", ((String) (obj18)));
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        ((HttpURLConnection) (obj)).connect();
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        Log.d("FileTransfer", (new StringBuilder()).append("Download file:").append(val$url).toString());
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        fileprogressresult = new FileProgressResult();
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        if (((HttpURLConnection) (obj)).getContentEncoding() != null)
        {
            break MISSING_BLOCK_LABEL_965;
        }
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        fileprogressresult.setLengthComputable(true);
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        fileprogressresult.setTotal(((HttpURLConnection) (obj)).getContentLength());
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        fileoutputstream = new FileOutputStream(file);
        obj18 = null;
        obj19 = FileTransfer.access$400(((HttpURLConnection) (obj)));
        obj18 = obj19;
        obj5 = val$context;
        obj18 = obj19;
        obj5;
        JVM INSTR monitorenter ;
        if (!val$context.aborted)
        {
            break MISSING_BLOCK_LABEL_1645;
        }
        obj5;
        JVM INSTR monitorexit ;
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        val$context.currentInputStream = null;
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        FileTransfer.access$300(((java.io.Closeable) (obj19)));
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        FileTransfer.access$300(fileoutputstream);
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj != null)
        {
            if (val$trustEveryone && val$useHttps)
            {
                obj5 = (HttpsURLConnection)obj;
                ((HttpsURLConnection) (obj5)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj7)));
                ((HttpsURLConnection) (obj5)).setSSLSocketFactory(sslsocketfactory);
            }
            ((HttpURLConnection) (obj)).disconnect();
            return;
        }
          goto _L1
_L6:
        obj14 = obj;
        obj10 = obj20;
        sslsocketfactory1 = obj25;
        obj15 = obj18;
        obj11 = obj21;
        sslsocketfactory2 = obj26;
        obj17 = obj19;
        obj13 = obj22;
        sslsocketfactory4 = obj27;
        obj16 = fileoutputstream;
        obj12 = obj23;
        sslsocketfactory3 = obj28;
        obj9 = fileprogressresult;
        obj5 = obj24;
        obj6 = obj29;
        HttpsURLConnection httpsurlconnection = (HttpsURLConnection)val$url.openConnection();
        obj14 = obj;
        obj10 = obj20;
        sslsocketfactory1 = obj25;
        obj15 = obj18;
        obj11 = obj21;
        sslsocketfactory2 = obj26;
        obj17 = obj19;
        obj13 = obj22;
        sslsocketfactory4 = obj27;
        obj16 = fileoutputstream;
        obj12 = obj23;
        sslsocketfactory3 = obj28;
        obj9 = fileprogressresult;
        obj5 = obj24;
        obj6 = obj29;
        sslsocketfactory = FileTransfer.access$000(httpsurlconnection);
        obj14 = obj;
        obj10 = obj20;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj18;
        obj11 = obj21;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj19;
        obj13 = obj22;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = fileoutputstream;
        obj12 = obj23;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = fileprogressresult;
        obj5 = obj24;
        obj6 = sslsocketfactory;
        obj7 = httpsurlconnection.getHostnameVerifier();
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj18;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj19;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = fileoutputstream;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = fileprogressresult;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        httpsurlconnection.setHostnameVerifier(FileTransfer.access$100());
        obj = httpsurlconnection;
          goto _L7
_L4:
        obj14 = obj;
        obj10 = obj20;
        sslsocketfactory1 = obj25;
        obj15 = obj18;
        obj11 = obj21;
        sslsocketfactory2 = obj26;
        obj17 = obj19;
        obj13 = obj22;
        sslsocketfactory4 = obj27;
        obj16 = fileoutputstream;
        obj12 = obj23;
        sslsocketfactory3 = obj28;
        obj9 = fileprogressresult;
        obj5 = obj24;
        obj6 = obj29;
        obj = (HttpURLConnection)val$url.openConnection();
          goto _L7
        obj;
        obj5;
        JVM INSTR monitorexit ;
        throw obj;
        val$context.currentInputStream = ((InputStream) (obj19));
        obj5;
        JVM INSTR monitorexit ;
        obj18 = obj19;
        obj5 = new byte[16384];
        long l = 0L;
_L9:
        obj18 = obj19;
        int i = ((InputStream) (obj19)).read(((byte []) (obj5)));
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj18 = obj19;
        fileoutputstream.write(((byte []) (obj5)), 0, i);
        l += i;
        obj18 = obj19;
        fileprogressresult.setLoaded(l);
        obj18 = obj19;
        obj6 = new PluginResult(org.apache.cordova.api.atus.OK, fileprogressresult.toJSONObject());
        obj18 = obj19;
        ((PluginResult) (obj6)).setKeepCallback(true);
        obj18 = obj19;
        val$context.sendPluginResult(((PluginResult) (obj6)));
        if (true) goto _L9; else goto _L8
        obj19;
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        val$context.currentInputStream = null;
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        FileTransfer.access$300(((java.io.Closeable) (obj18)));
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        FileTransfer.access$300(fileoutputstream);
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        throw obj19;
        obj;
        obj9 = obj14;
        obj5 = obj10;
        obj6 = sslsocketfactory1;
        obj7 = FileTransfer.access$500(FileTransfer.FILE_NOT_FOUND_ERR, val$source, val$target, ((HttpURLConnection) (obj14)));
        obj9 = obj14;
        obj5 = obj10;
        obj6 = sslsocketfactory1;
        Log.e("FileTransfer", ((JSONObject) (obj7)).toString(), ((Throwable) (obj)));
        obj9 = obj14;
        obj5 = obj10;
        obj6 = sslsocketfactory1;
        val$context.sendPluginResult(new PluginResult(org.apache.cordova.api.atus.IO_EXCEPTION, ((JSONObject) (obj7))));
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj14 == null) goto _L1; else goto _L10
_L10:
        if (val$trustEveryone && val$useHttps)
        {
            obj = (HttpsURLConnection)obj14;
            ((HttpsURLConnection) (obj)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj10)));
            ((HttpsURLConnection) (obj)).setSSLSocketFactory(sslsocketfactory1);
        }
        ((HttpURLConnection) (obj14)).disconnect();
        return;
        obj6;
        obj5;
        JVM INSTR monitorexit ;
        obj18 = obj19;
        throw obj6;
_L8:
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        val$context.currentInputStream = null;
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        FileTransfer.access$300(((java.io.Closeable) (obj19)));
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        FileTransfer.access$300(fileoutputstream);
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        Log.d("FileTransfer", (new StringBuilder()).append("Saved file: ").append(val$target).toString());
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        obj18 = (new FileUtils()).getEntry(file);
        obj14 = obj;
        obj10 = obj7;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj11 = obj7;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj13 = obj7;
        sslsocketfactory4 = sslsocketfactory;
        obj16 = obj;
        obj12 = obj7;
        sslsocketfactory3 = sslsocketfactory;
        obj9 = obj;
        obj5 = obj7;
        obj6 = sslsocketfactory;
        val$context.sendPluginResult(new PluginResult(org.apache.cordova.api.atus.OK, ((JSONObject) (obj18))));
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj == null) goto _L1; else goto _L11
_L11:
        if (val$trustEveryone && val$useHttps)
        {
            obj5 = (HttpsURLConnection)obj;
            ((HttpsURLConnection) (obj5)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj7)));
            ((HttpsURLConnection) (obj5)).setSSLSocketFactory(sslsocketfactory);
        }
        ((HttpURLConnection) (obj)).disconnect();
        return;
        obj;
        obj5;
        JVM INSTR monitorexit ;
        throw obj;
        obj5;
        obj;
        JVM INSTR monitorexit ;
        throw obj5;
        Object obj1;
        obj1;
        obj9 = obj15;
        obj5 = obj11;
        obj6 = sslsocketfactory2;
        obj7 = FileTransfer.access$500(FileTransfer.CONNECTION_ERR, val$source, val$target, ((HttpURLConnection) (obj15)));
        obj9 = obj15;
        obj5 = obj11;
        obj6 = sslsocketfactory2;
        Log.e("FileTransfer", ((JSONObject) (obj7)).toString(), ((Throwable) (obj1)));
        obj9 = obj15;
        obj5 = obj11;
        obj6 = sslsocketfactory2;
        val$context.sendPluginResult(new PluginResult(org.apache.cordova.api.atus.IO_EXCEPTION, ((JSONObject) (obj7))));
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj15 == null) goto _L1; else goto _L12
_L12:
        if (val$trustEveryone && val$useHttps)
        {
            obj2 = (HttpsURLConnection)obj15;
            ((HttpsURLConnection) (obj2)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj11)));
            ((HttpsURLConnection) (obj2)).setSSLSocketFactory(sslsocketfactory2);
        }
        ((HttpURLConnection) (obj15)).disconnect();
        return;
        obj5;
        obj2;
        JVM INSTR monitorexit ;
        throw obj5;
        obj2;
        obj9 = obj17;
        obj5 = obj13;
        obj6 = sslsocketfactory4;
        Log.e("FileTransfer", ((JSONException) (obj2)).getMessage(), ((Throwable) (obj2)));
        obj9 = obj17;
        obj5 = obj13;
        obj6 = sslsocketfactory4;
        val$context.sendPluginResult(new PluginResult(org.apache.cordova.api.atus.JSON_EXCEPTION));
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj17 == null) goto _L1; else goto _L13
_L13:
        if (val$trustEveryone && val$useHttps)
        {
            obj3 = (HttpsURLConnection)obj17;
            ((HttpsURLConnection) (obj3)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj13)));
            ((HttpsURLConnection) (obj3)).setSSLSocketFactory(sslsocketfactory4);
        }
        ((HttpURLConnection) (obj17)).disconnect();
        return;
        obj5;
        obj3;
        JVM INSTR monitorexit ;
        throw obj5;
        obj3;
        obj9 = obj16;
        obj5 = obj12;
        obj6 = sslsocketfactory3;
        obj7 = FileTransfer.access$500(FileTransfer.CONNECTION_ERR, val$source, val$target, ((HttpURLConnection) (obj16)));
        obj9 = obj16;
        obj5 = obj12;
        obj6 = sslsocketfactory3;
        Log.e("FileTransfer", ((JSONObject) (obj7)).toString(), ((Throwable) (obj3)));
        obj9 = obj16;
        obj5 = obj12;
        obj6 = sslsocketfactory3;
        val$context.sendPluginResult(new PluginResult(org.apache.cordova.api.atus.IO_EXCEPTION, ((JSONObject) (obj7))));
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj16 == null) goto _L1; else goto _L14
_L14:
        if (val$trustEveryone && val$useHttps)
        {
            obj4 = (HttpsURLConnection)obj16;
            ((HttpsURLConnection) (obj4)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj12)));
            ((HttpsURLConnection) (obj4)).setSSLSocketFactory(sslsocketfactory3);
        }
        ((HttpURLConnection) (obj16)).disconnect();
        return;
        obj5;
        obj4;
        JVM INSTR monitorexit ;
        throw obj5;
        obj4;
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj9 != null)
        {
            if (val$trustEveryone && val$useHttps)
            {
                obj8 = (HttpsURLConnection)obj9;
                ((HttpsURLConnection) (obj8)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj5)));
                ((HttpsURLConnection) (obj8)).setSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (obj6)));
            }
            ((HttpURLConnection) (obj9)).disconnect();
        }
        throw obj4;
        exception;
        obj8;
        JVM INSTR monitorexit ;
        throw exception;
    }

    questContext()
    {
        this$0 = final_filetransfer;
        val$context = questcontext;
        val$target = s;
        val$useHttps = flag;
        val$trustEveryone = flag1;
        val$url = url1;
        val$source = s1;
        val$objectId = String.this;
        super();
    }
}
