// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android.advanced;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Pair;
import com.moodstocks.android.core.Loader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class Tools
{

    public Tools()
    {
    }

    public static Bitmap convertNV21ToBitmap(byte abyte0[], int i, int j, int k)
    {
        abyte0 = nv21ToARGB(abyte0, i, j, i, k);
        int l;
        if (k == 0 || k == 180)
        {
            l = i;
        } else
        {
            l = j;
        }
        if (k == 0 || k == 180)
        {
            i = j;
        }
        return Bitmap.createBitmap(abyte0, l, i, android.graphics.Bitmap.Config.ARGB_8888);
    }

    public static native byte[] dataFromBase64URLString(String s);

    public static Pair detectProxySettings()
    {
        Object obj;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            return null;
        }
        ProxySelector proxyselector;
        try
        {
            obj = new URI("http://api.moodstocks.com");
            proxyselector = ProxySelector.getDefault();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        if (proxyselector == null) goto _L2; else goto _L1
_L1:
        obj = (Proxy)proxyselector.select(((URI) (obj))).get(0);
        if (((Proxy) (obj)).type() != java.net.Proxy.Type.HTTP) goto _L2; else goto _L3
_L3:
        obj = ((Proxy) (obj)).address();
        if (!(obj instanceof InetSocketAddress)) goto _L2; else goto _L4
_L4:
        obj = (InetSocketAddress)obj;
        obj = new Pair(((InetSocketAddress) (obj)).getHostName(), Integer.valueOf(((InetSocketAddress) (obj)).getPort()));
_L6:
        return ((Pair) (obj));
_L2:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static native int[] nv21ToARGB(byte abyte0[], int i, int j, int k, int l);

    public static Bitmap warpBitmap(Bitmap bitmap, Matrix matrix, int i, int j)
    {
        return warpBitmap(bitmap, matrix, i, j, -1F);
    }

    public static Bitmap warpBitmap(Bitmap bitmap, Matrix matrix, int i, int j, float f)
    {
        float af[] = new float[9];
        matrix.getValues(af);
        return warp_native(bitmap, af, i, j, f);
    }

    private static native Bitmap warp_native(Bitmap bitmap, float af[], int i, int j, float f);

    static 
    {
        Loader.load();
    }
}
