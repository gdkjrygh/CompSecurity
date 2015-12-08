// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.filetransfer;

import android.net.Uri;
import android.util.Log;
import android.webkit.CookieManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.PluginManager;
import org.apache.cordova.PluginResult;
import org.apache.cordova.file.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova.filetransfer:
//            FileTransfer, FileProgressResult

class val.objectId
    implements Runnable
{

    final FileTransfer this$0;
    final questContext val$context;
    final JSONObject val$headers;
    final boolean val$isLocalTransfer;
    final String val$objectId;
    final CordovaResourceApi val$resourceApi;
    final String val$source;
    final Uri val$sourceUri;
    final String val$target;
    final Uri val$targetUri;
    final boolean val$trustEveryone;
    final boolean val$useHttps;

    public void run()
    {
        Object obj3;
        Object obj6;
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
        Object obj17;
        Object obj18;
        File file;
        Object obj19;
        Object obj20;
        Object obj21;
        File file1;
        Object obj22;
        Object obj23;
        Object obj24;
        Object obj25;
        Object obj26;
        Object obj27;
        Object obj28;
        Object obj29;
        Object obj30;
        HttpsURLConnection httpsurlconnection;
        Object obj31;
        Object obj32;
        Object obj33;
        Object obj34;
        Object obj35;
        Object obj36;
        Object obj37;
        Object obj38;
        Object obj39;
        Object obj40;
        Object obj41;
        int i;
        int j;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        if (val$context.aborted)
        {
            return;
        }
        obj1 = null;
        obj38 = null;
        obj39 = null;
        obj40 = null;
        obj41 = null;
        obj3 = null;
        obj36 = null;
        obj26 = null;
        obj27 = null;
        obj28 = null;
        obj29 = null;
        obj30 = null;
        obj2 = null;
        obj37 = null;
        obj31 = null;
        obj32 = null;
        obj33 = null;
        obj34 = null;
        obj35 = null;
        httpsurlconnection = null;
        obj17 = null;
        file = null;
        obj20 = null;
        file1 = null;
        obj16 = null;
        obj24 = null;
        obj25 = null;
        flag4 = false;
        flag5 = false;
        flag6 = false;
        flag7 = false;
        flag8 = false;
        flag3 = false;
        obj23 = null;
        i = ((flag4) ? 1 : 0);
        obj15 = obj1;
        obj6 = obj26;
        obj9 = obj31;
        j = ((flag5) ? 1 : 0);
        obj18 = obj38;
        obj7 = obj27;
        obj4 = obj32;
        flag = flag6;
        obj19 = obj39;
        obj10 = obj28;
        obj8 = obj33;
        flag1 = flag7;
        obj21 = obj40;
        obj12 = obj29;
        obj11 = obj34;
        flag2 = flag8;
        obj22 = obj41;
        obj14 = obj30;
        obj13 = obj35;
        obj = val$resourceApi.mapUriToFile(val$targetUri);
        i = ((flag4) ? 1 : 0);
        obj15 = obj1;
        obj16 = obj;
        obj6 = obj26;
        obj9 = obj31;
        j = ((flag5) ? 1 : 0);
        obj18 = obj38;
        obj17 = obj;
        obj7 = obj27;
        obj4 = obj32;
        flag = flag6;
        obj19 = obj39;
        file = ((File) (obj));
        obj10 = obj28;
        obj8 = obj33;
        flag1 = flag7;
        obj21 = obj40;
        obj20 = obj;
        obj12 = obj29;
        obj11 = obj34;
        flag2 = flag8;
        obj22 = obj41;
        file1 = ((File) (obj));
        obj14 = obj30;
        obj13 = obj35;
        val$context.targetFile = ((File) (obj));
        i = ((flag4) ? 1 : 0);
        obj15 = obj1;
        obj16 = obj;
        obj6 = obj26;
        obj9 = obj31;
        j = ((flag5) ? 1 : 0);
        obj18 = obj38;
        obj17 = obj;
        obj7 = obj27;
        obj4 = obj32;
        flag = flag6;
        obj19 = obj39;
        file = ((File) (obj));
        obj10 = obj28;
        obj8 = obj33;
        flag1 = flag7;
        obj21 = obj40;
        obj20 = obj;
        obj12 = obj29;
        obj11 = obj34;
        flag2 = flag8;
        obj22 = obj41;
        file1 = ((File) (obj));
        obj14 = obj30;
        obj13 = obj35;
        Log.d("FileTransfer", (new StringBuilder()).append("Download file:").append(val$sourceUri).toString());
        i = ((flag4) ? 1 : 0);
        obj15 = obj1;
        obj16 = obj;
        obj6 = obj26;
        obj9 = obj31;
        j = ((flag5) ? 1 : 0);
        obj18 = obj38;
        obj17 = obj;
        obj7 = obj27;
        obj4 = obj32;
        flag = flag6;
        obj19 = obj39;
        file = ((File) (obj));
        obj10 = obj28;
        obj8 = obj33;
        flag1 = flag7;
        obj21 = obj40;
        obj20 = obj;
        obj12 = obj29;
        obj11 = obj34;
        flag2 = flag8;
        obj22 = obj41;
        file1 = ((File) (obj));
        obj14 = obj30;
        obj13 = obj35;
        FileProgressResult fileprogressresult = new FileProgressResult();
        i = ((flag4) ? 1 : 0);
        obj15 = obj1;
        obj16 = obj;
        obj6 = obj26;
        obj9 = obj31;
        j = ((flag5) ? 1 : 0);
        obj18 = obj38;
        obj17 = obj;
        obj7 = obj27;
        obj4 = obj32;
        flag = flag6;
        obj19 = obj39;
        file = ((File) (obj));
        obj10 = obj28;
        obj8 = obj33;
        flag1 = flag7;
        obj21 = obj40;
        obj20 = obj;
        obj12 = obj29;
        obj11 = obj34;
        flag2 = flag8;
        obj22 = obj41;
        file1 = ((File) (obj));
        obj14 = obj30;
        obj13 = obj35;
        if (!val$isLocalTransfer) goto _L2; else goto _L1
_L1:
        i = ((flag4) ? 1 : 0);
        obj15 = obj1;
        obj16 = obj;
        obj6 = obj26;
        obj9 = obj31;
        j = ((flag5) ? 1 : 0);
        obj18 = obj38;
        obj17 = obj;
        obj7 = obj27;
        obj4 = obj32;
        flag = flag6;
        obj19 = obj39;
        file = ((File) (obj));
        obj10 = obj28;
        obj8 = obj33;
        flag1 = flag7;
        obj21 = obj40;
        obj20 = obj;
        obj12 = obj29;
        obj11 = obj34;
        flag2 = flag8;
        obj22 = obj41;
        file1 = ((File) (obj));
        obj14 = obj30;
        obj13 = obj35;
        obj25 = val$resourceApi.openForRead(val$sourceUri);
        i = ((flag4) ? 1 : 0);
        obj15 = obj1;
        obj16 = obj;
        obj6 = obj26;
        obj9 = obj31;
        j = ((flag5) ? 1 : 0);
        obj18 = obj38;
        obj17 = obj;
        obj7 = obj27;
        obj4 = obj32;
        flag = flag6;
        obj19 = obj39;
        file = ((File) (obj));
        obj10 = obj28;
        obj8 = obj33;
        flag1 = flag7;
        obj21 = obj40;
        obj20 = obj;
        obj12 = obj29;
        obj11 = obj34;
        flag2 = flag8;
        obj22 = obj41;
        file1 = ((File) (obj));
        obj14 = obj30;
        obj13 = obj35;
        if (((org.apache.cordova.Api.OpenForReadResult) (obj25)).length == -1L)
        {
            break MISSING_BLOCK_LABEL_1047;
        }
        i = ((flag4) ? 1 : 0);
        obj15 = obj1;
        obj16 = obj;
        obj6 = obj26;
        obj9 = obj31;
        j = ((flag5) ? 1 : 0);
        obj18 = obj38;
        obj17 = obj;
        obj7 = obj27;
        obj4 = obj32;
        flag = flag6;
        obj19 = obj39;
        file = ((File) (obj));
        obj10 = obj28;
        obj8 = obj33;
        flag1 = flag7;
        obj21 = obj40;
        obj20 = obj;
        obj12 = obj29;
        obj11 = obj34;
        flag2 = flag8;
        obj22 = obj41;
        file1 = ((File) (obj));
        obj14 = obj30;
        obj13 = obj35;
        fileprogressresult.setLengthComputable(true);
        i = ((flag4) ? 1 : 0);
        obj15 = obj1;
        obj16 = obj;
        obj6 = obj26;
        obj9 = obj31;
        j = ((flag5) ? 1 : 0);
        obj18 = obj38;
        obj17 = obj;
        obj7 = obj27;
        obj4 = obj32;
        flag = flag6;
        obj19 = obj39;
        file = ((File) (obj));
        obj10 = obj28;
        obj8 = obj33;
        flag1 = flag7;
        obj21 = obj40;
        obj20 = obj;
        obj12 = obj29;
        obj11 = obj34;
        flag2 = flag8;
        obj22 = obj41;
        file1 = ((File) (obj));
        obj14 = obj30;
        obj13 = obj35;
        fileprogressresult.setTotal(((org.apache.cordova.Api.OpenForReadResult) (obj25)).length);
        i = ((flag4) ? 1 : 0);
        obj15 = obj1;
        obj16 = obj;
        obj6 = obj26;
        obj9 = obj31;
        j = ((flag5) ? 1 : 0);
        obj18 = obj38;
        obj17 = obj;
        obj7 = obj27;
        obj4 = obj32;
        flag = flag6;
        obj19 = obj39;
        file = ((File) (obj));
        obj10 = obj28;
        obj8 = obj33;
        flag1 = flag7;
        obj21 = obj40;
        obj20 = obj;
        obj12 = obj29;
        obj11 = obj34;
        flag2 = flag8;
        obj22 = obj41;
        file1 = ((File) (obj));
        obj14 = obj30;
        obj13 = obj35;
        obj1 = new mpleTrackingInputStream(((org.apache.cordova.Api.OpenForReadResult) (obj25)).inputStream);
        obj15 = obj1;
        obj1 = null;
        obj6 = httpsurlconnection;
        i = ((flag3) ? 1 : 0);
_L7:
        if (i != 0) goto _L4; else goto _L3
_L3:
        obj16 = obj23;
        obj4 = val$context;
        obj16 = obj23;
        obj4;
        JVM INSTR monitorenter ;
        if (!val$context.aborted) goto _L6; else goto _L5
_L5:
        obj4;
        JVM INSTR monitorexit ;
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj16 = val$context;
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj16;
        JVM INSTR monitorenter ;
        val$context.connection = null;
        obj16;
        JVM INSTR monitorexit ;
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        FileTransfer.access$300(((java.io.Closeable) (obj15)));
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        FileTransfer.access$300(null);
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj3 != null && val$trustEveryone && val$useHttps)
        {
            obj4 = (HttpsURLConnection)obj3;
            ((HttpsURLConnection) (obj4)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj2)));
            ((HttpsURLConnection) (obj4)).setSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (obj6)));
        }
        if (obj1 == null)
        {
            obj1 = new PluginResult(org.apache.cordova.atus.ERROR, FileTransfer.access$500(FileTransfer.CONNECTION_ERR, val$source, val$target, ((java.net.URLConnection) (obj3)), null));
        }
        if (i == 0 && ((PluginResult) (obj1)).getStatus() != org.apache.cordova.atus.OK.ordinal() && obj != null)
        {
            ((File) (obj)).delete();
        }
        val$context.sendPluginResult(((PluginResult) (obj1)));
        return;
_L2:
        i = ((flag4) ? 1 : 0);
        obj15 = obj1;
        obj16 = obj;
        obj6 = obj26;
        obj9 = obj31;
        j = ((flag5) ? 1 : 0);
        obj18 = obj38;
        obj17 = obj;
        obj7 = obj27;
        obj4 = obj32;
        flag = flag6;
        obj19 = obj39;
        file = ((File) (obj));
        obj10 = obj28;
        obj8 = obj33;
        flag1 = flag7;
        obj21 = obj40;
        obj20 = obj;
        obj12 = obj29;
        obj11 = obj34;
        flag2 = flag8;
        obj22 = obj41;
        file1 = ((File) (obj));
        obj14 = obj30;
        obj13 = obj35;
        obj3 = val$resourceApi.createHttpConnection(val$sourceUri);
        obj2 = obj36;
        obj1 = obj37;
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj26;
        obj9 = obj31;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj27;
        obj4 = obj32;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj28;
        obj8 = obj33;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj29;
        obj11 = obj34;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj30;
        obj13 = obj35;
        if (!val$useHttps)
        {
            break MISSING_BLOCK_LABEL_2207;
        }
        obj2 = obj36;
        obj1 = obj37;
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj26;
        obj9 = obj31;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj27;
        obj4 = obj32;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj28;
        obj8 = obj33;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj29;
        obj11 = obj34;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj30;
        obj13 = obj35;
        if (!val$trustEveryone)
        {
            break MISSING_BLOCK_LABEL_2207;
        }
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj26;
        obj9 = obj31;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj27;
        obj4 = obj32;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj28;
        obj8 = obj33;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj29;
        obj11 = obj34;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj30;
        obj13 = obj35;
        httpsurlconnection = (HttpsURLConnection)obj3;
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj26;
        obj9 = obj31;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj27;
        obj4 = obj32;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj28;
        obj8 = obj33;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj29;
        obj11 = obj34;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj30;
        obj13 = obj35;
        obj1 = FileTransfer.access$000(httpsurlconnection);
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj26;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj27;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj28;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj29;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj30;
        obj13 = obj1;
        obj2 = httpsurlconnection.getHostnameVerifier();
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        httpsurlconnection.setHostnameVerifier(FileTransfer.access$100());
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        ((HttpURLConnection) (obj3)).setRequestMethod("GET");
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        obj26 = CookieManager.getInstance().getCookie(val$sourceUri.toString());
        if (obj26 == null)
        {
            break MISSING_BLOCK_LABEL_2498;
        }
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        ((HttpURLConnection) (obj3)).setRequestProperty("cookie", ((String) (obj26)));
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        ((HttpURLConnection) (obj3)).setRequestProperty("Accept-Encoding", "gzip");
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        if (val$headers == null)
        {
            break MISSING_BLOCK_LABEL_2780;
        }
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        FileTransfer.access$200(((java.net.URLConnection) (obj3)), val$headers);
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        ((HttpURLConnection) (obj3)).connect();
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        if (((HttpURLConnection) (obj3)).getResponseCode() != 304)
        {
            break MISSING_BLOCK_LABEL_3408;
        }
        flag4 = true;
        flag5 = true;
        flag6 = true;
        flag7 = true;
        flag8 = true;
        flag3 = true;
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        ((HttpURLConnection) (obj3)).disconnect();
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        Log.d("FileTransfer", (new StringBuilder()).append("Resource not modified: ").append(val$source).toString());
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        obj26 = FileTransfer.access$500(FileTransfer.NOT_MODIFIED_ERR, val$source, val$target, ((java.net.URLConnection) (obj3)), null);
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        obj26 = new PluginResult(org.apache.cordova.atus.ERROR, ((JSONObject) (obj26)));
        i = ((flag3) ? 1 : 0);
        obj15 = obj25;
        obj6 = obj1;
        obj1 = obj26;
          goto _L7
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        if (((HttpURLConnection) (obj3)).getContentEncoding() == null)
        {
            break MISSING_BLOCK_LABEL_3600;
        }
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        if (!((HttpURLConnection) (obj3)).getContentEncoding().equalsIgnoreCase("gzip"))
        {
            break MISSING_BLOCK_LABEL_3881;
        }
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        if (((HttpURLConnection) (obj3)).getContentLength() == -1)
        {
            break MISSING_BLOCK_LABEL_3881;
        }
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        fileprogressresult.setLengthComputable(true);
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        fileprogressresult.setTotal(((HttpURLConnection) (obj3)).getContentLength());
        i = ((flag4) ? 1 : 0);
        obj15 = obj3;
        obj16 = obj;
        obj6 = obj2;
        obj9 = obj1;
        j = ((flag5) ? 1 : 0);
        obj18 = obj3;
        obj17 = obj;
        obj7 = obj2;
        obj4 = obj1;
        flag = flag6;
        obj19 = obj3;
        file = ((File) (obj));
        obj10 = obj2;
        obj8 = obj1;
        flag1 = flag7;
        obj21 = obj3;
        obj20 = obj;
        obj12 = obj2;
        obj11 = obj1;
        flag2 = flag8;
        obj22 = obj3;
        file1 = ((File) (obj));
        obj14 = obj2;
        obj13 = obj1;
        obj25 = FileTransfer.access$400(((java.net.URLConnection) (obj3)));
        obj15 = obj25;
        obj4 = null;
        i = ((flag3) ? 1 : 0);
        obj6 = obj1;
        obj1 = obj4;
          goto _L7
        obj15;
        obj16;
        JVM INSTR monitorexit ;
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        throw obj15;
        obj;
_L19:
        j = i;
        obj9 = obj3;
        obj4 = obj11;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj12 = FileTransfer.access$500(FileTransfer.FILE_NOT_FOUND_ERR, val$source, val$target, ((java.net.URLConnection) (obj3)), ((Throwable) (obj)));
        j = i;
        obj9 = obj3;
        obj4 = obj11;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        Log.e("FileTransfer", ((JSONObject) (obj12)).toString(), ((Throwable) (obj)));
        j = i;
        obj9 = obj3;
        obj4 = obj11;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj1 = new PluginResult(org.apache.cordova.atus.IO_EXCEPTION, ((JSONObject) (obj12)));
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj3 != null && val$trustEveryone && val$useHttps)
        {
            obj = (HttpsURLConnection)obj3;
            ((HttpsURLConnection) (obj)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj2)));
            ((HttpsURLConnection) (obj)).setSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (obj6)));
        }
        obj = obj1;
        if (obj1 == null)
        {
            obj = new PluginResult(org.apache.cordova.atus.ERROR, FileTransfer.access$500(FileTransfer.CONNECTION_ERR, val$source, val$target, ((java.net.URLConnection) (obj3)), null));
        }
        if (i == 0 && ((PluginResult) (obj)).getStatus() != org.apache.cordova.atus.OK.ordinal() && obj11 != null)
        {
            ((File) (obj11)).delete();
        }
        val$context.sendPluginResult(((PluginResult) (obj)));
        return;
        obj;
        obj4;
        JVM INSTR monitorexit ;
        throw obj;
_L6:
        val$context.connection = ((HttpURLConnection) (obj3));
        obj4;
        JVM INSTR monitorexit ;
        obj16 = obj23;
        obj4 = new byte[16384];
        obj16 = obj23;
        obj17 = val$resourceApi.openOutputStream(val$targetUri);
_L9:
        obj16 = obj17;
        j = ((ackingInputStream) (obj15)).read(((byte []) (obj4)));
        if (j <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj16 = obj17;
        ((OutputStream) (obj17)).write(((byte []) (obj4)), 0, j);
        obj16 = obj17;
        fileprogressresult.setLoaded(((ackingInputStream) (obj15)).getTotalRawBytesRead());
        obj16 = obj17;
        obj7 = new PluginResult(org.apache.cordova.atus.OK, fileprogressresult.toJSONObject());
        obj16 = obj17;
        ((PluginResult) (obj7)).setKeepCallback(true);
        obj16 = obj17;
        val$context.sendPluginResult(((PluginResult) (obj7)));
        if (true) goto _L9; else goto _L8
        obj18;
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj17 = val$context;
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj17;
        JVM INSTR monitorenter ;
        val$context.connection = null;
        obj17;
        JVM INSTR monitorexit ;
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        FileTransfer.access$300(((java.io.Closeable) (obj15)));
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        FileTransfer.access$300(((java.io.Closeable) (obj16)));
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        throw obj18;
        obj;
        obj20 = obj12;
_L18:
        j = i;
        obj9 = obj3;
        obj4 = obj20;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj11 = FileTransfer.access$500(FileTransfer.CONNECTION_ERR, val$source, val$target, ((java.net.URLConnection) (obj3)), ((Throwable) (obj)));
        j = i;
        obj9 = obj3;
        obj4 = obj20;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        Log.e("FileTransfer", ((JSONObject) (obj11)).toString(), ((Throwable) (obj)));
        j = i;
        obj9 = obj3;
        obj4 = obj20;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj1 = new PluginResult(org.apache.cordova.atus.IO_EXCEPTION, ((JSONObject) (obj11)));
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj3 != null && val$trustEveryone && val$useHttps)
        {
            obj = (HttpsURLConnection)obj3;
            ((HttpsURLConnection) (obj)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj2)));
            ((HttpsURLConnection) (obj)).setSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (obj6)));
        }
        obj = obj1;
        if (obj1 == null)
        {
            obj = new PluginResult(org.apache.cordova.atus.ERROR, FileTransfer.access$500(FileTransfer.CONNECTION_ERR, val$source, val$target, ((java.net.URLConnection) (obj3)), null));
        }
        if (i == 0 && ((PluginResult) (obj)).getStatus() != org.apache.cordova.atus.OK.ordinal() && obj20 != null)
        {
            ((File) (obj20)).delete();
        }
        val$context.sendPluginResult(((PluginResult) (obj)));
        return;
        obj7;
        obj4;
        JVM INSTR monitorexit ;
        obj16 = obj23;
        throw obj7;
_L8:
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj16 = val$context;
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj16;
        JVM INSTR monitorenter ;
        val$context.connection = null;
        obj16;
        JVM INSTR monitorexit ;
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        FileTransfer.access$300(((java.io.Closeable) (obj15)));
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        FileTransfer.access$300(((java.io.Closeable) (obj17)));
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        Log.d("FileTransfer", (new StringBuilder()).append("Saved file: ").append(val$target).toString());
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj17 = webView.getClass();
        obj15 = null;
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj16 = (PluginManager)((Class) (obj17)).getMethod("getPluginManager", new Class[0]).invoke(webView, new Object[0]);
        obj15 = obj16;
_L21:
        obj16 = obj15;
        if (obj15 != null)
        {
            break MISSING_BLOCK_LABEL_5270;
        }
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj16 = (PluginManager)((Class) (obj17)).getField("pluginManager").get(webView);
_L20:
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj = val$resourceApi.mapUriToFile(val$targetUri);
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        val$context.targetFile = ((File) (obj));
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj15 = (FileUtils)((PluginManager) (obj16)).getPlugin("File");
        if (obj15 == null) goto _L11; else goto _L10
_L10:
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj15 = ((FileUtils) (obj15)).getEntryForFile(((File) (obj)));
        if (obj15 == null) goto _L13; else goto _L12
_L12:
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj15 = new PluginResult(org.apache.cordova.atus.OK, ((JSONObject) (obj15)));
        obj1 = obj15;
_L4:
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj3 != null && val$trustEveryone && val$useHttps)
        {
            obj4 = (HttpsURLConnection)obj3;
            ((HttpsURLConnection) (obj4)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj2)));
            ((HttpsURLConnection) (obj4)).setSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (obj6)));
        }
        obj2 = obj1;
        if (obj1 == null)
        {
            obj2 = new PluginResult(org.apache.cordova.atus.ERROR, FileTransfer.access$500(FileTransfer.CONNECTION_ERR, val$source, val$target, ((java.net.URLConnection) (obj3)), null));
        }
        if (i == 0 && ((PluginResult) (obj2)).getStatus() != org.apache.cordova.atus.OK.ordinal() && obj != null)
        {
            ((File) (obj)).delete();
        }
        val$context.sendPluginResult(((PluginResult) (obj2)));
        return;
        obj15;
        obj16;
        JVM INSTR monitorexit ;
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        throw obj15;
        obj;
_L17:
        j = i;
        obj9 = obj3;
        obj4 = obj13;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        Log.e("FileTransfer", ((JSONException) (obj)).getMessage(), ((Throwable) (obj)));
        j = i;
        obj9 = obj3;
        obj4 = obj13;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj1 = new PluginResult(org.apache.cordova.atus.JSON_EXCEPTION);
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj3 != null && val$trustEveryone && val$useHttps)
        {
            obj = (HttpsURLConnection)obj3;
            ((HttpsURLConnection) (obj)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj2)));
            ((HttpsURLConnection) (obj)).setSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (obj6)));
        }
        obj = obj1;
        if (obj1 == null)
        {
            obj = new PluginResult(org.apache.cordova.atus.ERROR, FileTransfer.access$500(FileTransfer.CONNECTION_ERR, val$source, val$target, ((java.net.URLConnection) (obj3)), null));
        }
        if (i == 0 && ((PluginResult) (obj)).getStatus() != org.apache.cordova.atus.OK.ordinal() && obj13 != null)
        {
            ((File) (obj13)).delete();
        }
        val$context.sendPluginResult(((PluginResult) (obj)));
        return;
        obj15;
        obj17;
        JVM INSTR monitorexit ;
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        throw obj15;
        obj;
_L16:
        j = i;
        obj9 = obj3;
        obj4 = obj14;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj11 = FileTransfer.access$500(FileTransfer.CONNECTION_ERR, val$source, val$target, ((java.net.URLConnection) (obj3)), ((Throwable) (obj)));
        j = i;
        obj9 = obj3;
        obj4 = obj14;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        Log.e("FileTransfer", ((JSONObject) (obj11)).toString(), ((Throwable) (obj)));
        j = i;
        obj9 = obj3;
        obj4 = obj14;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj1 = new PluginResult(org.apache.cordova.atus.IO_EXCEPTION, ((JSONObject) (obj11)));
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj3 != null && val$trustEveryone && val$useHttps)
        {
            obj = (HttpsURLConnection)obj3;
            ((HttpsURLConnection) (obj)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj2)));
            ((HttpsURLConnection) (obj)).setSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (obj6)));
        }
        obj = obj1;
        if (obj1 == null)
        {
            obj = new PluginResult(org.apache.cordova.atus.ERROR, FileTransfer.access$500(FileTransfer.CONNECTION_ERR, val$source, val$target, ((java.net.URLConnection) (obj3)), null));
        }
        if (i == 0 && ((PluginResult) (obj)).getStatus() != org.apache.cordova.atus.OK.ordinal() && obj14 != null)
        {
            ((File) (obj14)).delete();
        }
        val$context.sendPluginResult(((PluginResult) (obj)));
        return;
_L13:
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj15 = FileTransfer.access$500(FileTransfer.CONNECTION_ERR, val$source, val$target, ((java.net.URLConnection) (obj3)), null);
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        Log.e("FileTransfer", "File plugin cannot represent download path");
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj15 = new PluginResult(org.apache.cordova.atus.IO_EXCEPTION, ((JSONObject) (obj15)));
        obj1 = obj15;
          goto _L4
_L11:
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        Log.e("FileTransfer", "File plugin not found; cannot save downloaded file");
        obj11 = obj;
        obj12 = obj;
        obj13 = obj;
        obj14 = obj;
        j = i;
        obj9 = obj3;
        obj4 = obj;
        obj8 = obj2;
        obj7 = obj6;
        obj10 = obj1;
        obj15 = new PluginResult(org.apache.cordova.atus.ERROR, "File plugin not found; cannot save downloaded file");
        obj1 = obj15;
          goto _L4
        obj;
        obj4;
        JVM INSTR monitorexit ;
        throw obj;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        obj = obj24;
        obj7 = obj9;
        obj4 = obj16;
        obj9 = obj15;
_L15:
        synchronized (FileTransfer.access$600())
        {
            FileTransfer.access$600().remove(val$objectId);
        }
        if (obj9 != null && val$trustEveryone && val$useHttps)
        {
            obj2 = (HttpsURLConnection)obj9;
            ((HttpsURLConnection) (obj2)).setHostnameVerifier(((javax.net.ssl.HostnameVerifier) (obj6)));
            ((HttpsURLConnection) (obj2)).setSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (obj7)));
        }
        obj2 = obj;
        if (obj == null)
        {
            obj2 = new PluginResult(org.apache.cordova.atus.ERROR, FileTransfer.access$500(FileTransfer.CONNECTION_ERR, val$source, val$target, ((java.net.URLConnection) (obj9)), null));
        }
        if (i == 0 && ((PluginResult) (obj2)).getStatus() != org.apache.cordova.atus.OK.ordinal() && obj4 != null)
        {
            ((File) (obj4)).delete();
        }
        val$context.sendPluginResult(((PluginResult) (obj2)));
        throw obj1;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        obj1;
        obj = obj10;
        i = j;
        obj6 = obj8;
        if (true) goto _L15; else goto _L14
_L14:
        obj;
        obj1 = null;
        i = j;
        obj3 = obj18;
        obj14 = obj17;
        obj2 = obj7;
        obj6 = obj4;
          goto _L16
        obj;
        obj1 = null;
        i = ((flag) ? 1 : 0);
        obj3 = obj19;
        obj13 = file;
        obj2 = obj10;
        obj6 = obj8;
          goto _L17
        obj;
        obj1 = null;
        i = ((flag1) ? 1 : 0);
        obj3 = obj21;
        obj2 = obj12;
        obj6 = obj11;
          goto _L18
        obj;
        obj1 = null;
        i = ((flag2) ? 1 : 0);
        obj3 = obj22;
        obj11 = file1;
        obj2 = obj14;
        obj6 = obj13;
          goto _L19
        Object obj5;
        obj5;
        obj16 = obj15;
          goto _L20
        obj5;
        obj16 = obj15;
          goto _L20
        obj5;
          goto _L21
        obj5;
          goto _L21
        obj5;
          goto _L21
    }

    questContext()
    {
        this$0 = final_filetransfer;
        val$context = questcontext;
        val$resourceApi = cordovaresourceapi;
        val$targetUri = uri;
        val$sourceUri = uri1;
        val$isLocalTransfer = flag;
        val$useHttps = flag1;
        val$trustEveryone = flag2;
        val$headers = jsonobject;
        val$source = s;
        val$target = s1;
        val$objectId = String.this;
        super();
    }
}
