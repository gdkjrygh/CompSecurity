// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.resfetcher.volley;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.resfetcher.ResourceFetcherCallback;
import com.netflix.mediaclient.util.StringUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDownloadRequest extends Request
{

    private static final float IMAGE_BACKOFF_MULT = 2F;
    private static final int IMAGE_MAX_RETRIES = 2;
    private static final String TAG = "nf_service_filedownloadrequest";
    private ResourceFetcherCallback mCallback;
    private File mDirectory;

    public FileDownloadRequest(String s, ResourceFetcherCallback resourcefetchercallback, com.android.volley.Response.ErrorListener errorlistener, int i, File file)
    {
        super(0, s, errorlistener);
        mCallback = resourcefetchercallback;
        mDirectory = file;
        setShouldCache(false);
        setRetryPolicy(new DefaultRetryPolicy(i, 2, 2.0F));
    }

    protected volatile void deliverResponse(Object obj)
    {
        deliverResponse((String)obj);
    }

    protected void deliverResponse(String s)
    {
        if (mCallback != null)
        {
            mCallback.onResourceFetched(getUrl(), s, 0);
        }
    }

    protected Response parseNetworkResponse(NetworkResponse networkresponse)
    {
        Object obj;
        Object obj2;
        File file;
        obj = StringUtils.getFilenameFromUri(getUrl());
        file = new File(mDirectory, ((String) (obj)));
        if (Log.isLoggable("nf_service_filedownloadrequest", 3))
        {
            Log.d("nf_service_filedownloadrequest", (new StringBuilder("Saving ")).append(networkresponse.data.length).append("bytes to file ").append(file.getAbsolutePath()).toString());
        }
        obj = null;
        obj2 = null;
        Object obj1 = new BufferedOutputStream(new FileOutputStream(file));
        ((BufferedOutputStream) (obj1)).write(networkresponse.data);
        ((BufferedOutputStream) (obj1)).flush();
        networkresponse = Response.success((new StringBuilder()).append("file://").append(file.getAbsolutePath()).toString(), null);
        if (obj1 != null)
        {
            try
            {
                ((BufferedOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w("nf_service_filedownloadrequest", (new StringBuilder()).append("Could not close the stream for ").append(file.getAbsolutePath()).toString(), ((Throwable) (obj)));
            }
        }
        obj1 = networkresponse;
_L2:
        return ((Response) (obj1));
        obj1;
        networkresponse = obj2;
_L5:
        obj = networkresponse;
        obj1 = Response.error(new VolleyError((new StringBuilder()).append("Could not save bytes to ").append(file.getAbsolutePath()).toString(), ((Throwable) (obj1))));
        obj = obj1;
        obj1 = obj;
        if (networkresponse == null) goto _L2; else goto _L1
_L1:
        try
        {
            networkresponse.close();
        }
        // Misplaced declaration of an exception variable
        catch (NetworkResponse networkresponse)
        {
            Log.w("nf_service_filedownloadrequest", (new StringBuilder()).append("Could not close the stream for ").append(file.getAbsolutePath()).toString(), networkresponse);
            return ((Response) (obj));
        }
        return ((Response) (obj));
        networkresponse;
_L4:
        if (obj != null)
        {
            try
            {
                ((BufferedOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w("nf_service_filedownloadrequest", (new StringBuilder()).append("Could not close the stream for ").append(file.getAbsolutePath()).toString(), ((Throwable) (obj)));
            }
        }
        throw networkresponse;
        networkresponse;
        obj = obj1;
        if (true) goto _L4; else goto _L3
_L3:
        IOException ioexception;
        ioexception;
        networkresponse = ((NetworkResponse) (obj1));
        obj1 = ioexception;
          goto _L5
    }
}
