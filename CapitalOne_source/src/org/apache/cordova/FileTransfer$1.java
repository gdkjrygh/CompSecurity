// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.util.Log;
import android.webkit.CookieManager;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova:
//            FileTransfer, FileUploadResult, FileProgressResult

class val.objectId
    implements Runnable
{

    final FileTransfer this$0;
    final boolean val$chunkedMode;
    final questContext val$context;
    final String val$fileKey;
    final String val$fileName;
    final JSONObject val$headers;
    final String val$mimeType;
    final String val$objectId;
    final JSONObject val$params;
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
        Object obj4;
        Object obj5;
        javax.net.ssl.SSLSocketFactory sslsocketfactory;
        Object obj7;
        Object obj8;
        Object obj9;
        javax.net.ssl.SSLSocketFactory sslsocketfactory1;
        Object obj10;
        javax.net.ssl.SSLSocketFactory sslsocketfactory2;
        Object obj11;
        javax.net.ssl.SSLSocketFactory sslsocketfactory3;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        String s;
        byte abyte1[];
        Object obj20;
        Object obj21;
        Object obj22;
        Object obj23;
        Object obj24;
        Object obj25;
        Object obj26;
        Object obj27;
        Object obj28;
        obj7 = null;
        obj18 = null;
        obj19 = null;
        s = null;
        obj = null;
        abyte1 = null;
        obj20 = null;
        obj21 = null;
        obj22 = null;
        obj23 = null;
        obj5 = null;
        obj24 = null;
        obj25 = null;
        obj26 = null;
        obj27 = null;
        obj28 = null;
        sslsocketfactory = null;
        obj14 = obj;
        obj9 = abyte1;
        sslsocketfactory1 = obj24;
        obj15 = obj7;
        obj10 = obj20;
        sslsocketfactory2 = obj25;
        obj17 = obj18;
        obj12 = obj21;
        obj13 = obj26;
        obj16 = obj19;
        obj11 = obj22;
        sslsocketfactory3 = obj27;
        obj8 = s;
        obj3 = obj23;
        obj4 = obj28;
        FileUploadResult fileuploadresult = new FileUploadResult();
        obj14 = obj;
        obj9 = abyte1;
        sslsocketfactory1 = obj24;
        obj15 = obj7;
        obj10 = obj20;
        sslsocketfactory2 = obj25;
        obj17 = obj18;
        obj12 = obj21;
        obj13 = obj26;
        obj16 = obj19;
        obj11 = obj22;
        sslsocketfactory3 = obj27;
        obj8 = s;
        obj3 = obj23;
        obj4 = obj28;
        FileProgressResult fileprogressresult = new FileProgressResult();
        obj14 = obj;
        obj9 = abyte1;
        sslsocketfactory1 = obj24;
        obj15 = obj7;
        obj10 = obj20;
        sslsocketfactory2 = obj25;
        obj17 = obj18;
        obj12 = obj21;
        obj13 = obj26;
        obj16 = obj19;
        obj11 = obj22;
        sslsocketfactory3 = obj27;
        obj8 = s;
        obj3 = obj23;
        obj4 = obj28;
        if (!val$useHttps) goto _L4; else goto _L3
_L3:
        obj14 = obj;
        obj9 = abyte1;
        sslsocketfactory1 = obj24;
        obj15 = obj7;
        obj10 = obj20;
        sslsocketfactory2 = obj25;
        obj17 = obj18;
        obj12 = obj21;
        obj13 = obj26;
        obj16 = obj19;
        obj11 = obj22;
        sslsocketfactory3 = obj27;
        obj8 = s;
        obj3 = obj23;
        obj4 = obj28;
        if (val$trustEveryone) goto _L6; else goto _L5
_L5:
        obj14 = obj;
        obj9 = abyte1;
        sslsocketfactory1 = obj24;
        obj15 = obj7;
        obj10 = obj20;
        sslsocketfactory2 = obj25;
        obj17 = obj18;
        obj12 = obj21;
        obj13 = obj26;
        obj16 = obj19;
        obj11 = obj22;
        sslsocketfactory3 = obj27;
        obj8 = s;
        obj3 = obj23;
        obj4 = obj28;
        obj = (HttpsURLConnection)val$url.openConnection();
_L11:
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        ((HttpURLConnection) (obj)).setDoInput(true);
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        ((HttpURLConnection) (obj)).setDoOutput(true);
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        ((HttpURLConnection) (obj)).setUseCaches(false);
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        ((HttpURLConnection) (obj)).setRequestMethod("POST");
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        ((HttpURLConnection) (obj)).setRequestProperty("Connection", "Keep-Alive");
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        ((HttpURLConnection) (obj)).setRequestProperty("Content-Type", "multipart/form-data;boundary=+++++");
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        obj7 = CookieManager.getInstance().getCookie(val$target);
        if (obj7 == null)
        {
            break MISSING_BLOCK_LABEL_875;
        }
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        ((HttpURLConnection) (obj)).setRequestProperty("Cookie", ((String) (obj7)));
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        obj7 = val$headers;
        if (obj7 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        obj13 = val$headers.keys();
_L8:
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        if (!((Iterator) (obj13)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        obj17 = ((Iterator) (obj13)).next().toString();
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        obj12 = val$headers.optJSONArray(((String) (obj17)));
        obj7 = obj12;
        if (obj12 != null)
        {
            break MISSING_BLOCK_LABEL_1266;
        }
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        obj7 = new JSONArray();
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        ((JSONArray) (obj7)).put(val$headers.getString(((String) (obj17))));
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        ((HttpURLConnection) (obj)).setRequestProperty(((String) (obj17)), ((JSONArray) (obj7)).getString(0));
        int i = 1;
_L9:
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        if (i >= ((JSONArray) (obj7)).length()) goto _L8; else goto _L7
_L7:
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        ((HttpURLConnection) (obj)).addRequestProperty(((String) (obj17)), ((JSONArray) (obj7)).getString(i));
        i++;
          goto _L9
_L6:
        obj14 = obj;
        obj9 = abyte1;
        sslsocketfactory1 = obj24;
        obj15 = obj7;
        obj10 = obj20;
        sslsocketfactory2 = obj25;
        obj17 = obj18;
        obj12 = obj21;
        obj13 = obj26;
        obj16 = obj19;
        obj11 = obj22;
        sslsocketfactory3 = obj27;
        obj8 = s;
        obj3 = obj23;
        obj4 = obj28;
        HttpsURLConnection httpsurlconnection = (HttpsURLConnection)val$url.openConnection();
        obj14 = obj;
        obj9 = abyte1;
        sslsocketfactory1 = obj24;
        obj15 = obj7;
        obj10 = obj20;
        sslsocketfactory2 = obj25;
        obj17 = obj18;
        obj12 = obj21;
        obj13 = obj26;
        obj16 = obj19;
        obj11 = obj22;
        sslsocketfactory3 = obj27;
        obj8 = s;
        obj3 = obj23;
        obj4 = obj28;
        sslsocketfactory = FileTransfer.access$000(httpsurlconnection);
        obj14 = obj;
        obj9 = abyte1;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj7;
        obj10 = obj20;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj18;
        obj12 = obj21;
        obj13 = sslsocketfactory;
        obj16 = obj19;
        obj11 = obj22;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = s;
        obj3 = obj23;
        obj4 = sslsocketfactory;
        obj5 = httpsurlconnection.getHostnameVerifier();
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj7;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj18;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj19;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = s;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        httpsurlconnection.setHostnameVerifier(FileTransfer.access$100());
        obj = httpsurlconnection;
        continue; /* Loop/switch isn't completed */
_L4:
        obj14 = obj;
        obj9 = abyte1;
        sslsocketfactory1 = obj24;
        obj15 = obj7;
        obj10 = obj20;
        sslsocketfactory2 = obj25;
        obj17 = obj18;
        obj12 = obj21;
        obj13 = obj26;
        obj16 = obj19;
        obj11 = obj22;
        sslsocketfactory3 = obj27;
        obj8 = s;
        obj3 = obj23;
        obj4 = obj28;
        obj = (HttpURLConnection)val$url.openConnection();
        if (true) goto _L11; else goto _L10
_L10:
        obj12 = "";
        obj7 = obj12;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        obj13 = val$params.keys();
_L13:
        obj7 = obj12;
        obj18 = obj12;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        if (!((Iterator) (obj13)).hasNext())
        {
            break MISSING_BLOCK_LABEL_2449;
        }
        obj7 = obj12;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        obj17 = ((Iterator) (obj13)).next();
        obj7 = obj12;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        if (String.valueOf(obj17).equals("headers")) goto _L13; else goto _L12
_L12:
        obj7 = obj12;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        obj12 = (new StringBuilder()).append(((String) (obj12))).append("--+++++\r\n").toString();
        obj7 = obj12;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        obj12 = (new StringBuilder()).append(((String) (obj12))).append("Content-Disposition: form-data; name=\"").append(obj17.toString()).append("\";").toString();
        obj7 = obj12;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        obj12 = (new StringBuilder()).append(((String) (obj12))).append("\r\n\r\n").toString();
        obj7 = obj12;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        obj12 = (new StringBuilder()).append(((String) (obj12))).append(val$params.getString(obj17.toString())).toString();
        obj7 = obj12;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        obj12 = (new StringBuilder()).append(((String) (obj12))).append("\r\n").toString();
          goto _L13
        obj18;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        Log.e("FileTransfer", ((JSONException) (obj18)).getMessage(), ((Throwable) (obj18)));
        obj18 = obj7;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        obj7 = (new StringBuilder()).append(((String) (obj18))).append("--+++++\r\n").toString();
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        byte abyte0[] = (new StringBuilder()).append(((String) (obj7))).append("Content-Disposition: form-data; name=\"").append(val$fileKey).append("\";").append(" filename=\"").toString().getBytes("UTF-8");
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        s = (new StringBuilder()).append("\"\r\nContent-Type: ").append(val$mimeType).append("\r\n").append("\r\n").toString();
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        abyte1 = val$fileName.getBytes("UTF-8");
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        obj19 = FileTransfer.access$200(FileTransfer.this, val$source);
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        int j = abyte0.length + s.length() + "\r\n--+++++--\r\n".length() + abyte1.length;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        Log.d("FileTransfer", (new StringBuilder()).append("String Length: ").append(j).toString());
        i = -1;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        if (!(obj19 instanceof FileInputStream))
        {
            break MISSING_BLOCK_LABEL_3246;
        }
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        i = (int)((FileInputStream)obj19).getChannel().size() + j;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        fileprogressresult.setLengthComputable(true);
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        fileprogressresult.setTotal(i);
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        Log.d("FileTransfer", (new StringBuilder()).append("Content Length: ").append(i).toString());
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        if (!val$chunkedMode) goto _L15; else goto _L14
_L14:
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        if (android.os.DK_INT < 8) goto _L17; else goto _L16
_L16:
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        if (!val$useHttps) goto _L15; else goto _L17
_L23:
        if (j == 0) goto _L19; else goto _L18
_L18:
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        ((HttpURLConnection) (obj)).setChunkedStreamingMode(16384);
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        ((HttpURLConnection) (obj)).setRequestProperty("Transfer-Encoding", "chunked");
_L24:
        obj3 = null;
        obj7 = new DataOutputStream(((HttpURLConnection) (obj)).getOutputStream());
        obj3 = val$context;
        obj3;
        JVM INSTR monitorenter ;
        if (!val$context.aborted) goto _L21; else goto _L20
_L20:
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        FileTransfer.access$300(((java.io.Closeable) (obj19)));
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        FileTransfer.access$300(((java.io.Closeable) (obj7)));
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj != null)
        {
            if (val$trustEveryone && val$useHttps)
            {
                obj3 = (HttpsURLConnection)obj;
                ((HttpsURLConnection) (obj3)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj5)));
                ((HttpsURLConnection) (obj3)).setSSLSocketFactory(sslsocketfactory);
            }
            ((HttpURLConnection) (obj)).disconnect();
            return;
        }
          goto _L1
_L15:
        j = 0;
          goto _L22
_L37:
        j = 0;
          goto _L23
_L19:
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        ((HttpURLConnection) (obj)).setFixedLengthStreamingMode(i);
          goto _L24
        obj;
        obj8 = obj14;
        obj3 = obj9;
        obj4 = sslsocketfactory1;
        obj5 = FileTransfer.access$500(FileTransfer.FILE_NOT_FOUND_ERR, val$source, val$target, ((HttpURLConnection) (obj14)));
        obj8 = obj14;
        obj3 = obj9;
        obj4 = sslsocketfactory1;
        Log.e("FileTransfer", ((JSONObject) (obj5)).toString(), ((Throwable) (obj)));
        obj8 = obj14;
        obj3 = obj9;
        obj4 = sslsocketfactory1;
        val$context.sendPluginResult(new PluginResult(org.apache.cordova.api.atus.IO_EXCEPTION, ((JSONObject) (obj5))));
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj14 == null) goto _L1; else goto _L25
_L25:
        if (val$trustEveryone && val$useHttps)
        {
            obj = (HttpsURLConnection)obj14;
            ((HttpsURLConnection) (obj)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj9)));
            ((HttpsURLConnection) (obj)).setSSLSocketFactory(sslsocketfactory1);
        }
        ((HttpURLConnection) (obj14)).disconnect();
        return;
        obj;
        obj3;
        JVM INSTR monitorexit ;
        throw obj;
_L21:
        val$context.currentOutputStream = ((java.io.OutputStream) (obj7));
        obj3;
        JVM INSTR monitorexit ;
        int k;
        ((DataOutputStream) (obj7)).write(abyte0);
        ((DataOutputStream) (obj7)).write(abyte1);
        ((DataOutputStream) (obj7)).writeBytes(s);
        j = Math.min(((InputStream) (obj19)).available(), 16384);
        obj3 = new byte[j];
        k = ((InputStream) (obj19)).read(((byte []) (obj3)), 0, j);
        long l;
        long l1;
        l1 = 0L;
        l = 0L;
_L27:
        if (k <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 += k;
        fileuploadresult.setBytesSent(l1);
        ((DataOutputStream) (obj7)).write(((byte []) (obj3)), 0, j);
        long l2;
        l2 = l;
        if (l1 <= 0x19000L + l)
        {
            break MISSING_BLOCK_LABEL_4228;
        }
        l2 = l1;
        Log.d("FileTransfer", (new StringBuilder()).append("Uploaded ").append(l1).append(" of ").append(i).append(" bytes").toString());
        j = Math.min(((InputStream) (obj19)).available(), 16384);
        k = ((InputStream) (obj19)).read(((byte []) (obj3)), 0, j);
        fileprogressresult.setLoaded(l1);
        obj4 = new PluginResult(org.apache.cordova.api.atus.OK, fileprogressresult.toJSONObject());
        ((PluginResult) (obj4)).setKeepCallback(true);
        val$context.sendPluginResult(((PluginResult) (obj4)));
        l = l2;
        if (true) goto _L27; else goto _L26
        abyte0;
_L35:
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        FileTransfer.access$300(((java.io.Closeable) (obj19)));
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        FileTransfer.access$300(((java.io.Closeable) (obj7)));
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        throw abyte0;
        obj;
        obj8 = obj15;
        obj3 = obj10;
        obj4 = sslsocketfactory2;
        obj5 = FileTransfer.access$500(FileTransfer.CONNECTION_ERR, val$source, val$target, ((HttpURLConnection) (obj15)));
        obj8 = obj15;
        obj3 = obj10;
        obj4 = sslsocketfactory2;
        Log.e("FileTransfer", ((JSONObject) (obj5)).toString(), ((Throwable) (obj)));
        obj8 = obj15;
        obj3 = obj10;
        obj4 = sslsocketfactory2;
        val$context.sendPluginResult(new PluginResult(org.apache.cordova.api.atus.IO_EXCEPTION, ((JSONObject) (obj5))));
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj15 == null) goto _L1; else goto _L28
_L28:
        if (val$trustEveryone && val$useHttps)
        {
            obj = (HttpsURLConnection)obj15;
            ((HttpsURLConnection) (obj)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj10)));
            ((HttpsURLConnection) (obj)).setSSLSocketFactory(sslsocketfactory2);
        }
        ((HttpURLConnection) (obj15)).disconnect();
        return;
        obj4;
        obj3;
        JVM INSTR monitorexit ;
        throw obj4;
_L26:
        ((DataOutputStream) (obj7)).writeBytes("\r\n--+++++--\r\n");
        ((DataOutputStream) (obj7)).flush();
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        FileTransfer.access$300(((java.io.Closeable) (obj19)));
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        FileTransfer.access$300(((java.io.Closeable) (obj7)));
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        val$context.currentOutputStream = null;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        i = ((HttpURLConnection) (obj)).getResponseCode();
        obj7 = null;
        abyte0 = FileTransfer.access$400(((HttpURLConnection) (obj)));
        obj7 = abyte0;
        obj3 = val$context;
        obj7 = abyte0;
        obj3;
        JVM INSTR monitorenter ;
        if (!val$context.aborted)
        {
            break MISSING_BLOCK_LABEL_5083;
        }
        obj3;
        JVM INSTR monitorexit ;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        val$context.currentInputStream = null;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        FileTransfer.access$300(abyte0);
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj == null) goto _L1; else goto _L29
_L29:
        if (val$trustEveryone && val$useHttps)
        {
            obj3 = (HttpsURLConnection)obj;
            ((HttpsURLConnection) (obj3)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj5)));
            ((HttpsURLConnection) (obj3)).setSSLSocketFactory(sslsocketfactory);
        }
        ((HttpURLConnection) (obj)).disconnect();
        return;
        obj;
        obj3;
        JVM INSTR monitorexit ;
        throw obj;
        val$context.currentInputStream = abyte0;
        obj3;
        JVM INSTR monitorexit ;
        obj7 = abyte0;
        obj3 = new ByteArrayOutputStream();
        obj7 = abyte0;
        obj4 = new byte[1024];
_L31:
        obj7 = abyte0;
        j = abyte0.read(((byte []) (obj4)));
        if (j <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj7 = abyte0;
        ((ByteArrayOutputStream) (obj3)).write(((byte []) (obj4)), 0, j);
        if (true) goto _L31; else goto _L30
        abyte0;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        val$context.currentInputStream = null;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        FileTransfer.access$300(((java.io.Closeable) (obj7)));
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        throw abyte0;
        obj;
        obj8 = obj17;
        obj3 = obj12;
        obj4 = obj13;
        Log.e("FileTransfer", ((JSONException) (obj)).getMessage(), ((Throwable) (obj)));
        obj8 = obj17;
        obj3 = obj12;
        obj4 = obj13;
        val$context.sendPluginResult(new PluginResult(org.apache.cordova.api.atus.JSON_EXCEPTION));
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj17 == null) goto _L1; else goto _L32
_L32:
        if (val$trustEveryone && val$useHttps)
        {
            obj = (HttpsURLConnection)obj17;
            ((HttpsURLConnection) (obj)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj12)));
            ((HttpsURLConnection) (obj)).setSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (obj13)));
        }
        ((HttpURLConnection) (obj17)).disconnect();
        return;
        obj4;
        obj3;
        JVM INSTR monitorexit ;
        obj7 = abyte0;
        throw obj4;
_L30:
        obj7 = abyte0;
        obj19 = ((ByteArrayOutputStream) (obj3)).toString("UTF-8");
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        val$context.currentInputStream = null;
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        FileTransfer.access$300(abyte0);
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        Log.d("FileTransfer", "got response from server");
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        Log.d("FileTransfer", ((String) (obj19)).substring(0, Math.min(256, ((String) (obj19)).length())));
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        fileuploadresult.setResponseCode(i);
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        fileuploadresult.setResponse(((String) (obj19)));
        obj14 = obj;
        obj9 = obj5;
        sslsocketfactory1 = sslsocketfactory;
        obj15 = obj;
        obj10 = obj5;
        sslsocketfactory2 = sslsocketfactory;
        obj17 = obj;
        obj12 = obj5;
        obj13 = sslsocketfactory;
        obj16 = obj;
        obj11 = obj5;
        sslsocketfactory3 = sslsocketfactory;
        obj8 = obj;
        obj3 = obj5;
        obj4 = sslsocketfactory;
        val$context.sendPluginResult(new PluginResult(org.apache.cordova.api.atus.OK, fileuploadresult.toJSONObject()));
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj == null) goto _L1; else goto _L33
_L33:
        if (val$trustEveryone && val$useHttps)
        {
            obj3 = (HttpsURLConnection)obj;
            ((HttpsURLConnection) (obj3)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj5)));
            ((HttpsURLConnection) (obj3)).setSSLSocketFactory(sslsocketfactory);
        }
        ((HttpURLConnection) (obj)).disconnect();
        return;
        obj;
        obj3;
        JVM INSTR monitorexit ;
        throw obj;
        obj3;
        obj;
        JVM INSTR monitorexit ;
        throw obj3;
        obj3;
        obj;
        JVM INSTR monitorexit ;
        throw obj3;
        obj3;
        obj;
        JVM INSTR monitorexit ;
        throw obj3;
        Object obj1;
        obj1;
        obj8 = obj16;
        obj3 = obj11;
        obj4 = sslsocketfactory3;
        obj5 = FileTransfer.access$500(FileTransfer.CONNECTION_ERR, val$source, val$target, ((HttpURLConnection) (obj16)));
        obj8 = obj16;
        obj3 = obj11;
        obj4 = sslsocketfactory3;
        Log.e("FileTransfer", ((JSONObject) (obj5)).toString(), ((Throwable) (obj1)));
        obj8 = obj16;
        obj3 = obj11;
        obj4 = sslsocketfactory3;
        val$context.sendPluginResult(new PluginResult(org.apache.cordova.api.atus.IO_EXCEPTION, ((JSONObject) (obj5))));
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj16 == null) goto _L1; else goto _L34
_L34:
        if (val$trustEveryone && val$useHttps)
        {
            obj2 = (HttpsURLConnection)obj16;
            ((HttpsURLConnection) (obj2)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj11)));
            ((HttpsURLConnection) (obj2)).setSSLSocketFactory(sslsocketfactory3);
        }
        ((HttpURLConnection) (obj16)).disconnect();
        return;
        obj3;
        obj2;
        JVM INSTR monitorexit ;
        throw obj3;
        obj2;
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj8 != null)
        {
            if (val$trustEveryone && val$useHttps)
            {
                obj6 = (HttpsURLConnection)obj8;
                ((HttpsURLConnection) (obj6)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj3)));
                ((HttpsURLConnection) (obj6)).setSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (obj4)));
            }
            ((HttpURLConnection) (obj8)).disconnect();
        }
        throw obj2;
        exception;
        obj6;
        JVM INSTR monitorexit ;
        throw exception;
        abyte0;
        obj7 = obj3;
          goto _L35
        JSONException jsonexception;
        jsonexception;
          goto _L10
_L17:
        j = 1;
_L22:
        if (j == 0 && i != -1) goto _L37; else goto _L36
_L36:
        j = 1;
          goto _L23
    }

    questContext()
    {
        this$0 = final_filetransfer;
        val$context = questcontext;
        val$useHttps = flag;
        val$trustEveryone = flag1;
        val$url = url1;
        val$target = s;
        val$headers = jsonobject;
        val$params = jsonobject1;
        val$fileKey = s1;
        val$mimeType = s2;
        val$fileName = s3;
        val$source = s4;
        val$chunkedMode = flag2;
        val$objectId = String.this;
        super();
    }
}
