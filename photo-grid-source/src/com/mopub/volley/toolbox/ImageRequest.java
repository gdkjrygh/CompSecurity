// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.mopub.volley.DefaultRetryPolicy;
import com.mopub.volley.NetworkResponse;
import com.mopub.volley.ParseError;
import com.mopub.volley.Request;
import com.mopub.volley.Response;
import com.mopub.volley.VolleyLog;

// Referenced classes of package com.mopub.volley.toolbox:
//            HttpHeaderParser

public class ImageRequest extends Request
{

    private static final Object e = new Object();
    private final com.mopub.volley.Response.Listener a;
    private final android.graphics.Bitmap.Config b;
    private final int c;
    private final int d;

    public ImageRequest(String s, com.mopub.volley.Response.Listener listener, int i, int j, android.graphics.Bitmap.Config config, com.mopub.volley.Response.ErrorListener errorlistener)
    {
        super(0, s, errorlistener);
        setRetryPolicy(new DefaultRetryPolicy(1000, 2, 2.0F));
        a = listener;
        b = config;
        c = i;
        d = j;
    }

    private static int a(int i, int j, int k, int l)
    {
        int i1;
        if (i == 0 && j == 0)
        {
            i1 = k;
        } else
        {
            if (i == 0)
            {
                return (int)(((double)j / (double)l) * (double)k);
            }
            i1 = i;
            if (j != 0)
            {
                double d1 = (double)l / (double)k;
                i1 = i;
                if ((double)i * d1 > (double)j)
                {
                    return (int)((double)j / d1);
                }
            }
        }
        return i1;
    }

    private static int b(int i, int j, int k, int l)
    {
        double d1 = Math.min((double)i / (double)k, (double)j / (double)l);
        float f;
        for (f = 1.0F; (double)(f * 2.0F) <= d1; f *= 2.0F) { }
        return (int)f;
    }

    protected final Response a(NetworkResponse networkresponse)
    {
        Object obj2 = e;
        obj2;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        obj = networkresponse.data;
        obj1 = new android.graphics.BitmapFactory.Options();
        if (c != 0 || d != 0) goto _L2; else goto _L1
_L1:
        obj1.inPreferredConfig = b;
        obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, ((android.graphics.BitmapFactory.Options) (obj1)));
_L6:
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = Response.error(new ParseError(networkresponse));
        networkresponse = ((NetworkResponse) (obj));
_L8:
        obj2;
        JVM INSTR monitorexit ;
        return networkresponse;
_L2:
        int k;
        int l;
        obj1.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, ((android.graphics.BitmapFactory.Options) (obj1)));
        int i = ((android.graphics.BitmapFactory.Options) (obj1)).outWidth;
        int j = ((android.graphics.BitmapFactory.Options) (obj1)).outHeight;
        k = a(c, d, i, j);
        l = a(d, c, j, i);
        obj1.inJustDecodeBounds = false;
        obj1.inSampleSize = b(i, j, k, l);
        obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, ((android.graphics.BitmapFactory.Options) (obj1)));
        if (obj == null) goto _L6; else goto _L5
_L5:
        if (((Bitmap) (obj)).getWidth() <= k && ((Bitmap) (obj)).getHeight() <= l) goto _L6; else goto _L7
_L7:
        obj1 = Bitmap.createScaledBitmap(((Bitmap) (obj)), k, l, true);
        ((Bitmap) (obj)).recycle();
        obj = obj1;
          goto _L6
        obj;
        VolleyLog.e("Caught OOM for %d byte image, url=%s", new Object[] {
            Integer.valueOf(networkresponse.data.length), getUrl()
        });
        networkresponse = Response.error(new ParseError(((Throwable) (obj))));
        obj2;
        JVM INSTR monitorexit ;
        return networkresponse;
        networkresponse;
        obj2;
        JVM INSTR monitorexit ;
        throw networkresponse;
_L4:
        obj = Response.success(obj, HttpHeaderParser.parseCacheHeaders(networkresponse));
        networkresponse = ((NetworkResponse) (obj));
          goto _L8
    }

    protected void deliverResponse(Object obj)
    {
        obj = (Bitmap)obj;
        a.onResponse(obj);
    }

    public com.mopub.volley.Request.Priority getPriority()
    {
        return com.mopub.volley.Request.Priority.LOW;
    }

}
