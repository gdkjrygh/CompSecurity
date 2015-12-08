// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.os.AsyncTask;
import android.util.Log;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpException;
import org.json.JSONException;

// Referenced classes of package com.leanplum:
//            T, g, Util, Z, 
//            ab

final class X extends AsyncTask
{

    private T a;
    private final List b;
    private final List c;
    private final Map d;

    X(T t, List list, List list1, Map map)
    {
        a = t;
        b = list;
        c = list1;
        d = map;
        super();
    }

    private transient Void a()
    {
        Object obj3 = T.j();
        obj3;
        JVM INSTR monitorenter ;
        Object obj1 = Util.a("file", b, c, g.a, g.q, d, T.a(a), g.d, 60);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        Object obj = obj1;
        Object obj2 = Util.a(((HttpURLConnection) (obj1)));
        obj = obj1;
        int i = ((HttpURLConnection) (obj1)).getResponseCode();
        if (i == 200) goto _L4; else goto _L3
_L3:
        obj = obj1;
        throw new HttpException((new StringBuilder("Leanplum: Error sending request: ")).append(i).toString());
        obj2;
_L26:
        obj = obj1;
        Log.e("Leanplum", "Unable to connect", ((Throwable) (obj2)));
        obj = obj1;
        if (T.b(a) == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        obj = obj1;
        T.b(a).a();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        ((HttpURLConnection) (obj1)).disconnect();
_L10:
        obj = b.iterator();
_L21:
        if (((Iterator) (obj)).hasNext()) goto _L6; else goto _L5
_L5:
        T.l();
        obj3;
        JVM INSTR monitorexit ;
        return null;
_L4:
        obj = obj1;
        if (T.c(a) == null) goto _L8; else goto _L7
_L7:
        obj = obj1;
        T.c(a).a(((org.json.JSONObject) (obj2)));
_L8:
        if (obj1 == null) goto _L10; else goto _L9
_L9:
        ((HttpURLConnection) (obj1)).disconnect();
          goto _L10
        obj;
        throw obj;
_L2:
        obj = obj1;
        if (T.b(a) == null) goto _L8; else goto _L11
_L11:
        obj = obj1;
        obj2 = T.b(a);
        obj = obj1;
        new HttpException("Leanplum: Unable to read file");
        obj = obj1;
        ((Z) (obj2)).a();
          goto _L8
        obj2;
_L25:
        obj = obj1;
        Log.e("Leanplum", "Unable to convert to JSON", ((Throwable) (obj2)));
        obj = obj1;
        if (T.b(a) == null) goto _L13; else goto _L12
_L12:
        obj = obj1;
        T.b(a).a();
_L13:
        if (obj1 == null) goto _L10; else goto _L14
_L14:
        ((HttpURLConnection) (obj1)).disconnect();
          goto _L10
        obj;
        obj1 = null;
_L24:
        obj = obj1;
        Log.e("Leanplum", "Timeout uploading files. Try again or limit the number of files to upload with parameters to syncResourcesAsync");
        obj = obj1;
        if (T.b(a) == null) goto _L16; else goto _L15
_L15:
        obj = obj1;
        T.b(a).a();
_L16:
        if (obj1 == null) goto _L10; else goto _L17
_L17:
        ((HttpURLConnection) (obj1)).disconnect();
          goto _L10
        obj2;
        obj1 = null;
_L23:
        obj = obj1;
        Log.e("Leanplum", "Unable to send file", ((Throwable) (obj2)));
        obj = obj1;
        if (T.b(a) == null) goto _L19; else goto _L18
_L18:
        obj = obj1;
        T.b(a).a();
_L19:
        if (obj1 == null) goto _L10; else goto _L20
_L20:
        ((HttpURLConnection) (obj1)).disconnect();
          goto _L10
_L22:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_418;
        }
        ((HttpURLConnection) (obj)).disconnect();
        throw obj1;
_L6:
        obj1 = (File)((Iterator) (obj)).next();
        T.k().put(obj1, Double.valueOf(1.0D));
          goto _L21
        obj1;
          goto _L22
        obj2;
          goto _L23
        obj;
          goto _L24
        obj2;
        obj1 = null;
          goto _L25
        obj2;
        obj1 = null;
          goto _L26
        obj1;
        obj = null;
          goto _L22
    }

    protected final transient Object doInBackground(Object aobj[])
    {
        return a();
    }
}
