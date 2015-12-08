// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import android.content.Context;
import android.os.Looper;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mopub.common.ClientMetadata;
import com.mopub.common.Preconditions;
import com.mopub.common.util.DeviceUtils;
import com.mopub.volley.toolbox.BasicNetwork;
import com.mopub.volley.toolbox.DiskBasedCache;
import com.mopub.volley.toolbox.ImageLoader;
import java.io.File;

// Referenced classes of package com.mopub.network:
//            MaxWidthImageLoader, f, e, PlayServicesUrlRewriter, 
//            CustomSSLSocketFactory, RequestQueueHttpStack, MoPubRequestQueue

public class Networking
{

    private static volatile MoPubRequestQueue a;
    private static volatile String b;
    private static volatile MaxWidthImageLoader c;
    public static boolean sUseHttps = false;

    public Networking()
    {
    }

    public static void clearForTesting()
    {
        com/mopub/network/Networking;
        JVM INSTR monitorenter ;
        a = null;
        c = null;
        b = null;
        com/mopub/network/Networking;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static ImageLoader getImageLoader(Context context)
    {
        MaxWidthImageLoader maxwidthimageloader;
        maxwidthimageloader = c;
        if (maxwidthimageloader != null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        com/mopub/network/Networking;
        JVM INSTR monitorenter ;
        MaxWidthImageLoader maxwidthimageloader1 = c;
        maxwidthimageloader = maxwidthimageloader1;
        if (maxwidthimageloader1 != null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        maxwidthimageloader = new MaxWidthImageLoader(getRequestQueue(context), context, new f(new e(DeviceUtils.memoryCacheSizeBytes(context))));
        c = maxwidthimageloader;
        com/mopub/network/Networking;
        JVM INSTR monitorexit ;
        return maxwidthimageloader;
        context;
        com/mopub/network/Networking;
        JVM INSTR monitorexit ;
        throw context;
        return maxwidthimageloader;
    }

    public static MoPubRequestQueue getRequestQueue()
    {
        return a;
    }

    public static MoPubRequestQueue getRequestQueue(Context context)
    {
        Object obj;
        obj = a;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        com/mopub/network/Networking;
        JVM INSTR monitorenter ;
        MoPubRequestQueue mopubrequestqueue = a;
        obj = mopubrequestqueue;
        if (mopubrequestqueue != null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        obj = new PlayServicesUrlRewriter(ClientMetadata.getInstance(context).getDeviceId(), context);
        CustomSSLSocketFactory customsslsocketfactory = CustomSSLSocketFactory.getDefault(10000);
        obj = new BasicNetwork(new RequestQueueHttpStack(getUserAgent(context.getApplicationContext()), ((com.mopub.volley.toolbox.HurlStack.UrlRewriter) (obj)), customsslsocketfactory));
        context = new File((new StringBuilder()).append(context.getCacheDir().getPath()).append(File.separator).append("mopub-volley-cache").toString());
        obj = new MoPubRequestQueue(new DiskBasedCache(context, (int)DeviceUtils.diskCacheSizeBytes(context, 0xa00000L)), ((com.mopub.volley.Network) (obj)));
        a = ((MoPubRequestQueue) (obj));
        ((MoPubRequestQueue) (obj)).start();
        com/mopub/network/Networking;
        JVM INSTR monitorexit ;
        return ((MoPubRequestQueue) (obj));
        context;
        com/mopub/network/Networking;
        JVM INSTR monitorexit ;
        throw context;
        return ((MoPubRequestQueue) (obj));
    }

    public static String getUserAgent(Context context)
    {
        Object obj;
        String s;
        Preconditions.checkNotNull(context);
        s = b;
        obj = s;
        if (s != null) goto _L2; else goto _L1
_L1:
        com/mopub/network/Networking;
        JVM INSTR monitorenter ;
        s = b;
        obj = s;
        if (s != null) goto _L4; else goto _L3
_L3:
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            break MISSING_BLOCK_LABEL_62;
        }
        context = (new WebView(context)).getSettings().getUserAgentString();
_L5:
        b = context;
        obj = context;
_L4:
        com/mopub/network/Networking;
        JVM INSTR monitorexit ;
_L2:
        return ((String) (obj));
        try
        {
            context = System.getProperty("http.agent");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        finally { }
          goto _L5
        com/mopub/network/Networking;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static void setImageLoaderForTesting(MaxWidthImageLoader maxwidthimageloader)
    {
        com/mopub/network/Networking;
        JVM INSTR monitorenter ;
        c = maxwidthimageloader;
        com/mopub/network/Networking;
        JVM INSTR monitorexit ;
        return;
        maxwidthimageloader;
        throw maxwidthimageloader;
    }

    public static void setRequestQueueForTesting(MoPubRequestQueue mopubrequestqueue)
    {
        com/mopub/network/Networking;
        JVM INSTR monitorenter ;
        a = mopubrequestqueue;
        com/mopub/network/Networking;
        JVM INSTR monitorexit ;
        return;
        mopubrequestqueue;
        throw mopubrequestqueue;
    }

    public static void setUserAgentForTesting(String s)
    {
        com/mopub/network/Networking;
        JVM INSTR monitorenter ;
        b = s;
        com/mopub/network/Networking;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public static void useHttps(boolean flag)
    {
        sUseHttps = flag;
    }

    public static boolean useHttps()
    {
        return sUseHttps;
    }

}
