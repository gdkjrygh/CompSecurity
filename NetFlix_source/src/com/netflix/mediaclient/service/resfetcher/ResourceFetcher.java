// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.resfetcher;

import android.content.Context;
import android.os.Handler;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HttpStack;
import com.android.volley.toolbox.HurlStack;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.ServiceAgent;
import com.netflix.mediaclient.service.resfetcher.volley.FileDownloadRequest;
import com.netflix.mediaclient.service.resfetcher.volley.ImageLoader;
import com.netflix.mediaclient.service.resfetcher.volley.PrefetchResourceRequest;
import com.netflix.mediaclient.service.webclient.NetflixWebClientInitParameters;
import com.netflix.mediaclient.service.webclient.WebClient;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClient;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.gfx.BitmapLruCache;
import java.io.File;

// Referenced classes of package com.netflix.mediaclient.service.resfetcher:
//            ResourceFetcherCallback

public class ResourceFetcher extends ServiceAgent
{
    private class ResourceFetcherCallbackWrapper
        implements ResourceFetcherCallback
    {

        private ResourceFetcherCallback mCallback;
        final ResourceFetcher this$0;

        public void onResourceFetched(String s, String s1, int i)
        {
            LogUtils.reportAssetRequestResult(s, i, getService().getClientLogging().getApplicationPerformanceMetricsLogging());
            mCallback.onResourceFetched(s, s1, i);
        }

        public void onResourcePrefetched(String s, int i, int j)
        {
            LogUtils.reportAssetRequestResult(s, j, getService().getClientLogging().getApplicationPerformanceMetricsLogging());
            mCallback.onResourcePrefetched(s, i, j);
        }

        private ResourceFetcherCallbackWrapper(ResourceFetcherCallback resourcefetchercallback)
        {
            this$0 = ResourceFetcher.this;
            super();
            if (resourcefetchercallback == null)
            {
                throw new IllegalArgumentException("Callback can not be null");
            } else
            {
                mCallback = resourcefetchercallback;
                return;
            }
        }

    }

    private static class VolleyImageCache extends BitmapLruCache
        implements com.netflix.mediaclient.service.resfetcher.volley.ImageLoader.ImageCache
    {

        public VolleyImageCache(int i)
        {
            super(i);
        }
    }


    private static final String DOWNLOADS_CACHE_DIR = "downloads";
    private static final long MINIMUM_IMAGE_CACHE_TTL = 0x48190800L;
    private static final int RESOURCE_REQUEST_TIMEOUT_MS = 1000;
    private static final String SELECTED_WEBCLIENT = "volley";
    private static final String TAG = "nf_service_resourcefetcher";
    private static final String VOLLEY_CACHE_DIR = "volley";
    private static final String VOLLEY_WEBCLIENT_NAME = "volley";
    private File mDownloadsDir;
    private ImageLoader mImageLoader;
    private RequestQueue mRequestQueue;
    private final FalcorVolleyWebClient mWebClient = createWebClient();

    public ResourceFetcher()
    {
    }

    private DiskBasedCache createDiskCache()
    {
        File file = new File(getContext().getCacheDir(), "volley");
        int i = getConfigurationAgent().getDiskCacheSizeBytes();
        if (Log.isLoggable("nf_service_resourcefetcher", 4))
        {
            Log.i("nf_service_resourcefetcher", String.format("Creating new Volley DiskBasedCache, location: %s,  max size: %d bytes", new Object[] {
                file.getAbsolutePath(), Integer.valueOf(i)
            }));
        }
        return new DiskBasedCache(file, i);
    }

    private HttpStack createHttpStack()
    {
        Log.d("nf_service_resourcefetcher", "Using HttpURLConnection for Volley");
        return new HurlStack();
    }

    private ImageLoader createImageLoader()
    {
        Log.d("nf_service_resourcefetcher", "ResourceFetcher creating ImageLoader");
        com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface = getConfigurationAgent();
        long l = 0x48190800L;
        int i = 1000;
        if (configurationagentinterface != null)
        {
            i = configurationagentinterface.getResourceRequestTimeout();
            l = configurationagentinterface.getImageCacheMinimumTtl();
        }
        if (Log.isLoggable("nf_service_resourcefetcher", 3))
        {
            Log.d("nf_service_resourcefetcher", (new StringBuilder()).append("Received request to create new ImageLoader with socketTimeout = ").append(i).append(" and minimumTtl = ").append(l).append("ms").toString());
        }
        Object obj = null;
        com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging applicationperformancemetricslogging = obj;
        if (getService() != null)
        {
            applicationperformancemetricslogging = obj;
            if (getService().getClientLogging() != null)
            {
                applicationperformancemetricslogging = getService().getClientLogging().getApplicationPerformanceMetricsLogging();
            }
        }
        return new ImageLoader(mRequestQueue, getImageCache(), i, l, applicationperformancemetricslogging, configurationagentinterface);
    }

    private static FalcorVolleyWebClient createWebClient()
    {
        Log.i("nf_service_resourcefetcher", "WebClient of type volley");
        if ("volley".equals("volley"))
        {
            return new FalcorVolleyWebClient();
        } else
        {
            throw new IllegalStateException("Webclient not implemented");
        }
    }

    private com.netflix.mediaclient.service.resfetcher.volley.ImageLoader.ImageCache getImageCache()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        NetflixApplication netflixapplication;
        netflixapplication = getApplication();
        obj = netflixapplication.getImageCache();
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!(obj instanceof com.netflix.mediaclient.service.resfetcher.volley.ImageLoader.ImageCache)) goto _L2; else goto _L3
_L3:
        obj = (com.netflix.mediaclient.service.resfetcher.volley.ImageLoader.ImageCache)obj;
_L5:
        this;
        JVM INSTR monitorexit ;
        return ((com.netflix.mediaclient.service.resfetcher.volley.ImageLoader.ImageCache) (obj));
_L2:
        int i = getConfigurationAgent().getImageCacheSizeBytes();
        Log.i("nf_service_resourcefetcher", (new StringBuilder()).append("Creating new BitmapLruCache of size ").append(i).append(" bytes").toString());
        obj = new VolleyImageCache(i);
        netflixapplication.setImageCache(((BitmapLruCache) (obj)));
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    private ResourceFetcherCallback getResourceFetcherCallback(ResourceFetcherCallback resourcefetchercallback)
    {
        if (resourcefetchercallback == null)
        {
            Log.w("nf_service_resourcefetcher", "Resource fetcher callback is null!");
            return null;
        } else
        {
            return new ResourceFetcherCallbackWrapper(resourcefetchercallback);
        }
    }

    public void destroy()
    {
        super.destroy();
        if (mRequestQueue != null)
        {
            Log.i("nf_service_resourcefetcher", "Stopping Volley RequestQueue");
            mRequestQueue.stop();
            mRequestQueue = null;
        }
    }

    protected void doInit()
    {
        Log.d("nf_service_resourcefetcher", "ResourceFetcher starting doInit.");
        int i = getConfigurationAgent().getResFetcherThreadPoolSize();
        if (Log.isLoggable("nf_service_resourcefetcher", 3))
        {
            Log.d("nf_service_resourcefetcher", String.format("Creating Volley RequestQueue with threadPoolsize of %d", new Object[] {
                Integer.valueOf(i)
            }));
        }
        mRequestQueue = new RequestQueue(createDiskCache(), new BasicNetwork(createHttpStack()), i);
        mRequestQueue.start();
        mDownloadsDir = new File(getContext().getCacheDir(), "downloads");
        if (!mDownloadsDir.isDirectory())
        {
            mDownloadsDir.mkdirs();
        }
        NetflixWebClientInitParameters netflixwebclientinitparameters = new NetflixWebClientInitParameters(getConfigurationAgent().getApiEndpointRegistry(), getUserAgent().getUserCredentialRegistry(), getService().getClientLogging().getErrorLogging(), mRequestQueue);
        mWebClient.init(netflixwebclientinitparameters);
        i = getConfigurationAgent().getDataRequestTimeout();
        if (Log.isLoggable("nf_service_resourcefetcher", 4))
        {
            Log.i("nf_service_resourcefetcher", (new StringBuilder()).append("Setting default timeout value for data request to ").append(i).append("ms").toString());
        }
        mWebClient.setTimeout(i);
        initCompleted(0);
    }

    public void fetchResource(final String resourceUrl, final com.netflix.mediaclient.servicemgr.IClientLogging.AssetType realCallback, ResourceFetcherCallback resourcefetchercallback)
    {
        if (Log.isLoggable("nf_service_resourcefetcher", 4))
        {
            Log.i("nf_service_resourcefetcher", (new StringBuilder()).append("Received request to fetch resource at ").append(resourceUrl).toString());
        }
        LogUtils.reportAssetRequest(resourceUrl, realCallback, getService().getClientLogging().getApplicationPerformanceMetricsLogging());
        realCallback = getResourceFetcherCallback(resourcefetchercallback);
        resourceUrl = new FileDownloadRequest(resourceUrl, realCallback, new com.android.volley.Response.ErrorListener() {

            final ResourceFetcher this$0;
            final ResourceFetcherCallback val$realCallback;
            final String val$resourceUrl;

            public void onErrorResponse(VolleyError volleyerror)
            {
                Log.e("nf_service_resourcefetcher", "FileDownloadRequest failed: ", volleyerror);
                if (realCallback != null)
                {
                    realCallback.onResourceFetched(resourceUrl, null, -3);
                }
            }

            
            {
                this$0 = ResourceFetcher.this;
                realCallback = resourcefetchercallback;
                resourceUrl = s;
                super();
            }
        }, getConfigurationAgent().getResourceRequestTimeout(), mDownloadsDir);
        mRequestQueue.add(resourceUrl);
    }

    public WebClient getApiNextWebClient()
    {
        return mWebClient;
    }

    public ImageLoader getImageLoader()
    {
        if (mImageLoader != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (mImageLoader == null)
        {
            mImageLoader = createImageLoader();
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return mImageLoader;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void prefetchResource(final String resourceUrl, final com.netflix.mediaclient.servicemgr.IClientLogging.AssetType realCallback, final ResourceFetcherCallback callback)
    {
        if (resourceUrl == null)
        {
            Log.w("nf_service_resourcefetcher", String.format("Request to prefetch resource with null URL", new Object[0]));
            getMainHandler().post(new Runnable() {

                final ResourceFetcher this$0;
                final ResourceFetcherCallback val$callback;
                final String val$resourceUrl;

                public void run()
                {
                    callback.onResourcePrefetched(resourceUrl, 0, -2);
                }

            
            {
                this$0 = ResourceFetcher.this;
                callback = resourcefetchercallback;
                resourceUrl = s;
                super();
            }
            });
            return;
        }
        if (Log.isLoggable("nf_service_resourcefetcher", 3))
        {
            Log.d("nf_service_resourcefetcher", (new StringBuilder()).append("Request to prefetch resource at URL ").append(resourceUrl).toString());
        }
        LogUtils.reportAssetRequest(resourceUrl, realCallback, getService().getClientLogging().getApplicationPerformanceMetricsLogging());
        realCallback = getResourceFetcherCallback(callback);
        resourceUrl = new PrefetchResourceRequest(resourceUrl, realCallback, new com.android.volley.Response.ErrorListener() {

            final ResourceFetcher this$0;
            final ResourceFetcherCallback val$realCallback;
            final String val$resourceUrl;

            public void onErrorResponse(VolleyError volleyerror)
            {
                Log.e("nf_service_resourcefetcher", "PrefetchRequest failed: ", volleyerror);
                if (realCallback != null)
                {
                    realCallback.onResourcePrefetched(resourceUrl, 0, -3);
                }
            }

            
            {
                this$0 = ResourceFetcher.this;
                realCallback = resourcefetchercallback;
                resourceUrl = s;
                super();
            }
        }, getConfigurationAgent().getResourceRequestTimeout());
        mRequestQueue.add(resourceUrl);
    }


}
