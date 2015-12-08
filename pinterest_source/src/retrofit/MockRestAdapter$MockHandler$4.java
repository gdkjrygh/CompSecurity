// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.lang.reflect.Method;

// Referenced classes of package retrofit:
//            MockRestAdapter, RestAdapter, RestMethodInfo, MockHttpException, 
//            MockHttpRetrofitError, ErrorHandler, Callback, RetrofitError

class val.callback
    implements Runnable
{

    final val.callback this$1;
    final Object val$args[];
    final int val$callDelay;
    final Callback val$callback;
    final RestMethodInfo val$methodInfo;
    final String val$url;

    public void run()
    {
        Object obj = MockRestAdapter.access$000(_fld0).logLevel;
        Object obj1 = MockRestAdapter.access$000(_fld0).log;
        Object obj2;
        try
        {
            val$methodInfo.method.invoke(cess._mth400(this._cls1.this), val$args);
            if (((val.args) (obj)).args())
            {
                ((val.args) (obj1)).args(String.format("<--- MOCK 200 %s (%sms)", new Object[] {
                    val$url, Integer.valueOf(val$callDelay)
                }));
            }
            return;
        }
        catch (Throwable throwable)
        {
            obj2 = throwable.getCause();
        }
        if (!(obj2 instanceof MockHttpException))
        {
            if (obj2 instanceof RuntimeException)
            {
                throw (RuntimeException)obj2;
            } else
            {
                throw new RuntimeException(((Throwable) (obj2)));
            }
        }
        obj2 = (MockHttpException)obj2;
        retrofit.client.Response response = ((MockHttpException) (obj2)).toResponse(MockRestAdapter.access$000(_fld0).converter);
        if (((is._cls0) (obj))._mth0())
        {
            ((is._cls0) (obj1))._mth0(String.format("<---- MOCK %s %s (%sms)", new Object[] {
                Integer.valueOf(((MockHttpException) (obj2)).code), val$url, Integer.valueOf(val$callDelay)
            }));
            if (((val.callDelay) (obj)).callDelay() >= val.callDelay.callDelay())
            {
                ((val.callDelay) (obj1)).callDelay(String.valueOf(((MockHttpException) (obj2)).responseBody));
                (() (obj1)).("<--- END MOCK");
            }
        }
        obj = new MockHttpRetrofitError(((MockHttpException) (obj2)).getMessage(), val$url, response, ((MockHttpException) (obj2)).responseBody, val$methodInfo.responseObjectType);
        obj1 = MockRestAdapter.access$000(_fld0).errorHandler.handleError(((RetrofitError) (obj)));
        if (obj1 != obj)
        {
            obj = RetrofitError.unexpectedError(((RetrofitError) (obj)).getUrl(), ((Throwable) (obj1)));
        }
        val$callback.failure(((RetrofitError) (obj)));
    }

    ()
    {
        this$1 = final_;
        val$methodInfo = restmethodinfo;
        val$args = aobj;
        val$url = s;
        val$callDelay = i;
        val$callback = Callback.this;
        super();
    }
}
