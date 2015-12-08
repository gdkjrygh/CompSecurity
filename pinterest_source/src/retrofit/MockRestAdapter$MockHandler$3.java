// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


// Referenced classes of package retrofit:
//            Callback, RetrofitError

class val.e
    implements Runnable
{

    final val.e this$1;
    final Callback val$callback;
    final RetrofitError val$e;

    public void run()
    {
        val$callback.failure(val$e);
    }

    ()
    {
        this$1 = final_;
        val$callback = callback1;
        val$e = RetrofitError.this;
        super();
    }
}
