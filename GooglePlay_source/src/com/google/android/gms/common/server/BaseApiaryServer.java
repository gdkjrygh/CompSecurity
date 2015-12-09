// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import android.content.Context;
import android.net.Uri;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.app.GmsApplicationContext;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.common.server:
//            AbstractApiaryServer, BaseApiaryRequest, VolleyInterruptedError, NoResponseRequest, 
//            ApiaryRequest, ImageRequest

public class BaseApiaryServer extends AbstractApiaryServer
{
    private static final class Batch
    {

        final ArrayList mRequests = new ArrayList();

        private Batch()
        {
        }
    }


    protected final ThreadLocal mBatchStack;
    protected final RequestQueue mRequestQueue;

    public BaseApiaryServer(Context context, String s, String s1, boolean flag, boolean flag1, String s2, String s3)
    {
        this(context, s, s1, flag, flag1, s2, s3, (byte)0);
    }

    private BaseApiaryServer(Context context, String s, String s1, boolean flag, boolean flag1, String s2, String s3, 
            byte byte0)
    {
        super(context, s, s1, flag, flag1, s2, s3, null);
        mBatchStack = new ThreadLocal() {

            final BaseApiaryServer this$0;

            protected final volatile Object initialValue()
            {
                return new Stack();
            }

            
            {
                this$0 = BaseApiaryServer.this;
                super();
            }
        };
        mRequestQueue = GmsApplicationContext.getInstance().getRequestQueue();
        super.setNetworkClientTag(152);
    }

    private void enqueue$4554d575(Request request, String s)
    {
        setRetryPolicy(request, s);
        boolean flag;
        if (((Stack)mBatchStack.get()).size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Asserts.checkState(false, "Non-batchable request in batch");
            Asserts.checkState(request instanceof BaseApiaryRequest, "Non-batchable request in batch");
            s = (Batch)((Stack)mBatchStack.get()).peek();
            request = (BaseApiaryRequest)request;
            ((Batch) (s)).mRequests.add(request);
            return;
        } else
        {
            mRequestQueue.add(request);
            return;
        }
    }

    public static BaseApiaryServer getPathlessServer(Context context)
    {
        return new BaseApiaryServer(context, null, null, false, true, null, null);
    }

    private FastJsonResponse getResponseBlocking$fdbd10f(ClientContext clientcontext, int i, String s, Object obj, Class class1)
        throws GoogleAuthException, VolleyError
    {
        FastJsonResponse fastjsonresponse;
        try
        {
            fastjsonresponse = getResponseBlockingInternal(clientcontext, i, s, obj, class1, null);
        }
        catch (VolleyError volleyerror)
        {
            if (isInvalidTokenError(volleyerror))
            {
                return getResponseBlockingInternal(clientcontext, i, s, obj, class1, null);
            } else
            {
                throw volleyerror;
            }
        }
        return fastjsonresponse;
    }

    private FastJsonResponse getResponseBlockingInternal(ClientContext clientcontext, int i, String s, Object obj, Class class1, FieldMappingDictionary fieldmappingdictionary)
        throws GoogleAuthException, VolleyError
    {
        fieldmappingdictionary = getAuthTokenOrThrow(clientcontext);
        String s1 = getAppCert(clientcontext);
        RequestFuture requestfuture = RequestFuture.newFuture();
        HashMap hashmap = createHeaders(mContext, clientcontext, fieldmappingdictionary);
        i = overrideHttpMethod(i, hashmap);
        super.setUid(clientcontext.mCallingUid);
        enqueue$4554d575(buildRequest(clientcontext, i, toUrl(getBaseUri(), s), obj, class1, null, fieldmappingdictionary, s1, requestfuture, requestfuture, hashmap), fieldmappingdictionary);
        try
        {
            clientcontext = (FastJsonResponse)requestfuture.get();
        }
        // Misplaced declaration of an exception variable
        catch (ClientContext clientcontext)
        {
            Thread.currentThread().interrupt();
            throw new VolleyInterruptedError();
        }
        // Misplaced declaration of an exception variable
        catch (ClientContext clientcontext)
        {
            checkVolleyError(clientcontext, fieldmappingdictionary);
            throw new VolleyError((new StringBuilder("Error executing network request for ")).append(s).toString(), clientcontext);
        }
        return clientcontext;
    }

    private void performNoResponseRequestBlockingInternal(ClientContext clientcontext, int i, String s, Object obj)
        throws GoogleAuthException, VolleyError
    {
        String s1 = getAuthTokenOrThrow(clientcontext);
        RequestFuture requestfuture = RequestFuture.newFuture();
        clientcontext = createHeaders(mContext, clientcontext, s1);
        enqueue$4554d575(new NoResponseRequest(overrideHttpMethod(i, clientcontext), toUrl(getBaseUri(), s), obj, requestfuture, requestfuture, s1, clientcontext, super.getNetworkClientTag(), super.getUid()), s1);
        try
        {
            requestfuture.get();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ClientContext clientcontext)
        {
            Thread.currentThread().interrupt();
            throw new VolleyInterruptedError();
        }
        // Misplaced declaration of an exception variable
        catch (ClientContext clientcontext)
        {
            checkVolleyError(clientcontext, s1);
        }
        throw new VolleyError((new StringBuilder("Error executing network request for ")).append(s).toString(), clientcontext);
    }

    public ApiaryRequest buildRequest(ClientContext clientcontext, int i, String s, Object obj, Class class1, FieldMappingDictionary fieldmappingdictionary, String s1, 
            String s2, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener, HashMap hashmap)
    {
        return new ApiaryRequest(i, s, obj, class1, fieldmappingdictionary, listener, errorlistener, s1, s2, mEnableCache, hashmap, super.getNetworkClientTag(), super.getUid());
    }

    public final byte[] fetchImageBlocking(Context context, Uri uri, String s)
        throws VolleyError
    {
        RequestFuture requestfuture = RequestFuture.newFuture();
        enqueue$4554d575(new ImageRequest(context, uri, s, mEnableCache, requestfuture, requestfuture, super.getNetworkClientTag(), super.getUid()), null);
        try
        {
            context = (byte[])requestfuture.get();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Thread.currentThread().interrupt();
            throw new VolleyInterruptedError();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new VolleyError((new StringBuilder("Error executing network request for ")).append(s).toString(), context);
        }
        return context;
    }

    public final void fetchImageNonBlocking(Context context, Uri uri, String s)
    {
        RequestFuture requestfuture = RequestFuture.newFuture();
        enqueue$4554d575(new ImageRequest(context, uri, s, false, requestfuture, requestfuture, super.getNetworkClientTag(), super.getUid()), null);
    }

    public final volatile String getAppCert(ClientContext clientcontext)
    {
        return super.getAppCert(clientcontext);
    }

    public volatile String getAuthTokenOrThrow(ClientContext clientcontext)
        throws GoogleAuthException, VolleyError
    {
        return super.getAuthTokenOrThrow(clientcontext);
    }

    public final volatile int getNetworkClientTag()
    {
        return super.getNetworkClientTag();
    }

    public FastJsonResponse getResponseBlocking(ClientContext clientcontext, int i, String s, Object obj, Class class1)
        throws GoogleAuthException, VolleyError
    {
        return getResponseBlocking$fdbd10f(clientcontext, i, s, obj, class1);
    }

    public final volatile int getUid()
    {
        return super.getUid();
    }

    public final void performNoResponseRequestBlocking(ClientContext clientcontext, int i, String s, Object obj)
        throws GoogleAuthException, VolleyError
    {
        try
        {
            performNoResponseRequestBlockingInternal(clientcontext, i, s, obj);
            return;
        }
        catch (VolleyError volleyerror)
        {
            if (isInvalidTokenError(volleyerror))
            {
                performNoResponseRequestBlockingInternal(clientcontext, i, s, obj);
                return;
            } else
            {
                throw volleyerror;
            }
        }
    }

    public final volatile void setNetworkClientTag(int i)
    {
        super.setNetworkClientTag(i);
    }

    public final volatile void setUid(int i)
    {
        super.setUid(i);
    }
}
