// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package retrofit:
//            RetrofitError, ErrorHandler, RequestInterceptor, RestMethodInfo

class val.args
    implements Func1
{

    final this._cls0 this$0;
    final Object val$args[];
    final RequestInterceptor val$interceptor;
    final RestMethodInfo val$methodInfo;
    final this._cls0 val$mockHandler;

    public volatile Object call(Object obj)
    {
        return call((String)obj);
    }

    public Observable call(String s)
    {
        try
        {
            s = (Observable)ss._mth500(val$mockHandler, val$methodInfo, val$interceptor, val$args);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return Observable.error(cess._mth600(this._cls0.this).handleError(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return Observable.error(s);
        }
        return s;
    }

    ()
    {
        this$0 = final_;
        val$mockHandler = 1;
        val$methodInfo = restmethodinfo;
        val$interceptor = requestinterceptor;
        val$args = _5B_Ljava.lang.Object_3B_.this;
        super();
    }
}
