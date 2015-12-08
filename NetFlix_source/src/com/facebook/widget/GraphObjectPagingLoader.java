// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.os.Handler;
import android.support.v4.content.Loader;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.Request;
import com.facebook.RequestBatch;
import com.facebook.Response;
import com.facebook.internal.CacheableRequestBatch;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;

// Referenced classes of package com.facebook.widget:
//            SimpleGraphObjectCursor

class GraphObjectPagingLoader extends Loader
{
    public static interface OnErrorListener
    {

        public abstract void onError(FacebookException facebookexception, GraphObjectPagingLoader graphobjectpagingloader);
    }

    static interface PagedResults
        extends GraphObject
    {

        public abstract GraphObjectList getData();
    }


    private boolean appendResults;
    private Request currentRequest;
    private SimpleGraphObjectCursor cursor;
    private final Class graphObjectClass;
    private boolean loading;
    private Request nextRequest;
    private OnErrorListener onErrorListener;
    private Request originalRequest;
    private boolean skipRoundtripIfCached;

    public GraphObjectPagingLoader(Context context, Class class1)
    {
        super(context);
        appendResults = false;
        loading = false;
        graphObjectClass = class1;
    }

    private void addResults(Response response)
    {
        SimpleGraphObjectCursor simplegraphobjectcursor;
        Object obj;
        boolean flag;
        boolean flag1;
        if (cursor == null || !appendResults)
        {
            simplegraphobjectcursor = new SimpleGraphObjectCursor();
        } else
        {
            simplegraphobjectcursor = new SimpleGraphObjectCursor(cursor);
        }
        obj = (PagedResults)response.getGraphObjectAs(com/facebook/widget/GraphObjectPagingLoader$PagedResults);
        flag1 = response.getIsFromCache();
        obj = ((PagedResults) (obj)).getData().castToListOf(graphObjectClass);
        if (((GraphObjectList) (obj)).size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            nextRequest = response.getRequestForPagedResults(com.facebook.Response.PagingDirection.NEXT);
            simplegraphobjectcursor.addGraphObjects(((java.util.Collection) (obj)), flag1);
            simplegraphobjectcursor.setMoreObjectsAvailable(true);
        }
        if (!flag)
        {
            simplegraphobjectcursor.setMoreObjectsAvailable(false);
            simplegraphobjectcursor.setFromCache(flag1);
            nextRequest = null;
        }
        if (!flag1)
        {
            skipRoundtripIfCached = false;
        }
        deliverResult(simplegraphobjectcursor);
    }

    private CacheableRequestBatch putRequestIntoBatch(Request request, boolean flag)
    {
        boolean flag1 = true;
        request = new CacheableRequestBatch(new Request[] {
            request
        });
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        request.setForceRoundTrip(flag);
        return request;
    }

    private void requestCompleted(Response response)
    {
        if (response.getRequest() == currentRequest)
        {
            loading = false;
            currentRequest = null;
            Object obj = response.getError();
            Object obj1;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((FacebookRequestError) (obj)).getException();
            }
            obj1 = obj;
            if (response.getGraphObject() == null)
            {
                obj1 = obj;
                if (obj == null)
                {
                    obj1 = new FacebookException("GraphObjectPagingLoader received neither a result nor an error.");
                }
            }
            if (obj1 != null)
            {
                nextRequest = null;
                if (onErrorListener != null)
                {
                    onErrorListener.onError(((FacebookException) (obj1)), this);
                    return;
                }
            } else
            {
                addResults(response);
                return;
            }
        }
    }

    private void startLoading(Request request, boolean flag, long l)
    {
        skipRoundtripIfCached = flag;
        appendResults = false;
        nextRequest = null;
        currentRequest = request;
        currentRequest.setCallback(new com.facebook.Request.Callback() {

            final GraphObjectPagingLoader this$0;

            public void onCompleted(Response response)
            {
                requestCompleted(response);
            }

            
            {
                this$0 = GraphObjectPagingLoader.this;
                super();
            }
        });
        loading = true;
        request = new Runnable() {

            final GraphObjectPagingLoader this$0;
            final RequestBatch val$batch;

            public void run()
            {
                Request.executeBatchAsync(batch);
            }

            
            {
                this$0 = GraphObjectPagingLoader.this;
                batch = requestbatch;
                super();
            }
        };
        if (l == 0L)
        {
            request.run();
            return;
        } else
        {
            (new Handler()).postDelayed(request, l);
            return;
        }
    }

    public void clearResults()
    {
        nextRequest = null;
        originalRequest = null;
        currentRequest = null;
        deliverResult(((SimpleGraphObjectCursor) (null)));
    }

    public void deliverResult(SimpleGraphObjectCursor simplegraphobjectcursor)
    {
        SimpleGraphObjectCursor simplegraphobjectcursor1 = cursor;
        cursor = simplegraphobjectcursor;
        if (isStarted())
        {
            super.deliverResult(simplegraphobjectcursor);
            if (simplegraphobjectcursor1 != null && simplegraphobjectcursor1 != simplegraphobjectcursor && !simplegraphobjectcursor1.isClosed())
            {
                simplegraphobjectcursor1.close();
            }
        }
    }

    public volatile void deliverResult(Object obj)
    {
        deliverResult((SimpleGraphObjectCursor)obj);
    }

    public void followNextLink()
    {
        if (nextRequest != null)
        {
            appendResults = true;
            currentRequest = nextRequest;
            currentRequest.setCallback(new com.facebook.Request.Callback() {

                final GraphObjectPagingLoader this$0;

                public void onCompleted(Response response)
                {
                    requestCompleted(response);
                }

            
            {
                this$0 = GraphObjectPagingLoader.this;
                super();
            }
            });
            loading = true;
            Request.executeBatchAsync(putRequestIntoBatch(currentRequest, skipRoundtripIfCached));
        }
    }

    public SimpleGraphObjectCursor getCursor()
    {
        return cursor;
    }

    public OnErrorListener getOnErrorListener()
    {
        return onErrorListener;
    }

    public boolean isLoading()
    {
        return loading;
    }

    protected void onStartLoading()
    {
        super.onStartLoading();
        if (cursor != null)
        {
            deliverResult(cursor);
        }
    }

    public void refreshOriginalRequest(long l)
    {
        if (originalRequest == null)
        {
            throw new FacebookException("refreshOriginalRequest may not be called until after startLoading has been called.");
        } else
        {
            startLoading(originalRequest, false, l);
            return;
        }
    }

    public void setOnErrorListener(OnErrorListener onerrorlistener)
    {
        onErrorListener = onerrorlistener;
    }

    public void startLoading(Request request, boolean flag)
    {
        originalRequest = request;
        startLoading(request, flag, 0L);
    }

}
