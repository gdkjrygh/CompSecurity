// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.util.concurrent.Executor;

// Referenced classes of package retrofit:
//            CallbackRunnable, ResponseWrapper, RequestInterceptorTape, RestMethodInfo, 
//            Callback, ErrorHandler

class val.args extends CallbackRunnable
{

    final val.args this$1;
    final Object val$args[];
    final RequestInterceptorTape val$interceptorTape;
    final RestMethodInfo val$methodInfo;

    public ResponseWrapper obtainResponse()
    {
        return (ResponseWrapper)cess._mth100(this._cls1.this, val$interceptorTape, val$methodInfo, val$args);
    }

    (RequestInterceptorTape requestinterceptortape, RestMethodInfo restmethodinfo, Object aobj[])
    {
        this$1 = final_;
        val$interceptorTape = requestinterceptortape;
        val$methodInfo = restmethodinfo;
        val$args = aobj;
        super(final_callback, final_executor, ErrorHandler.this);
    }
}
