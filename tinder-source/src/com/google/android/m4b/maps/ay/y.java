// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.m4b.maps.a.k;
import com.google.android.m4b.maps.am.e;
import com.google.android.m4b.maps.dc.a;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            j, k, ab

public class y extends j
    implements e
{

    private static final String a = com/google/android/m4b/maps/ay/y.getSimpleName();

    public y(Context context, String s)
    {
        super(context, s, "com.google.android.gms.maps.service.HttpProxyService", Executors.newScheduledThreadPool(0), com.google.android.m4b.maps.ay.k.a());
    }

    private Bundle a(Bundle bundle)
    {
        bundle = a(((i.b) (new i.b(bundle) {

            private Bundle a;
            private y b;

            public final Object a(IInterface iinterface)
            {
                return ((a)iinterface).a(a);
            }

            
            {
                b = y.this;
                a = bundle;
                super(y.this);
            }
        })));
        try
        {
            bundle = (Bundle)bundle.get();
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            if (com.google.android.m4b.maps.ay.ab.a(a, 6))
            {
                Log.e(a, "Error while executing http request through proxy.", bundle.getCause());
            }
            return null;
        }
        return bundle;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return com.google.android.m4b.maps.dc.a.a.a(ibinder);
    }

    public final HttpResponse a(k k1, Map map)
    {
        int i = k1.a;
        i;
        JVM INSTR tableswitch 0 1: default 32
    //                   0 188
    //                   1 194;
           goto _L1 _L2 _L3
_L1:
        Object obj;
        if (com.google.android.m4b.maps.ay.ab.a(a, 6))
        {
            Log.e(a, (new StringBuilder(34)).append("Unexpected URL method: ").append(i).toString());
        }
        obj = "";
_L5:
        HashMap hashmap = new HashMap(k1.a());
        hashmap.putAll(map);
        map = k1.b;
        k1 = k1.c();
        Bundle bundle = new Bundle();
        bundle.putString("REQUEST_METHOD", ((String) (obj)));
        bundle.putString("REQUEST_URL", map);
        bundle.putSerializable("REQUEST_HEADERS", hashmap);
        bundle.putSerializable("REQUEST_DATA", k1);
        obj = a(bundle);
        if (obj == null)
        {
            return new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), 500, "Internal Server Error"));
        }
        break; /* Loop/switch isn't completed */
_L2:
        obj = "GET";
        continue; /* Loop/switch isn't completed */
_L3:
        obj = "POST";
        if (true) goto _L5; else goto _L4
_L4:
        map = (ProtocolVersion)((Bundle) (obj)).getSerializable("RESPONSE_PROTOCOL_VERSION");
        k1 = map;
        if (map == null)
        {
            k1 = new ProtocolVersion("HTTP", 1, 1);
        }
        k1 = new BasicHttpResponse(k1, ((Bundle) (obj)).getInt("RESPONSE_STATUS_CODE"), ((Bundle) (obj)).getString("RESPONSE_STATUS_REASON"));
        map = (byte[])((Bundle) (obj)).getSerializable("RESPONSE_DATA");
        if (map != null)
        {
            BasicHttpEntity basichttpentity = new BasicHttpEntity();
            String s = ((Bundle) (obj)).getString("RESPONSE_CONTENT_TYPE");
            obj = ((Bundle) (obj)).getString("RESPONSE_CONTENT_ENCODING");
            basichttpentity.setContent(new ByteArrayInputStream(map));
            basichttpentity.setContentLength(map.length);
            basichttpentity.setContentType(s);
            if (obj != null)
            {
                basichttpentity.setContentEncoding(((String) (obj)));
            }
            k1.setEntity(basichttpentity);
            k1.addHeader("Content-Type", s);
        }
        return k1;
    }

}
