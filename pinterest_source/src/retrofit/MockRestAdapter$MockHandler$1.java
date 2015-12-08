// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


// Referenced classes of package retrofit:
//            RequestInterceptorTape, RestMethodInfo

class val.args
    implements Runnable
{

    final val.args this$1;
    final Object val$args[];
    final RequestInterceptorTape val$interceptorTape;
    final RestMethodInfo val$methodInfo;

    public void run()
    {
        cess._mth200(this._cls1.this, val$methodInfo, val$interceptorTape, val$args);
    }

    ()
    {
        this$1 = final_;
        val$methodInfo = restmethodinfo;
        val$interceptorTape = requestinterceptortape;
        val$args = _5B_Ljava.lang.Object_3B_.this;
        super();
    }
}
