// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


// Referenced classes of package retrofit:
//            CallbackRunnable, Callback, RetrofitError

class val.handled
    implements Runnable
{

    final CallbackRunnable this$0;
    final RetrofitError val$handled;

    public void run()
    {
        CallbackRunnable.access$000(CallbackRunnable.this).failure(val$handled);
    }

    ()
    {
        this$0 = final_callbackrunnable;
        val$handled = RetrofitError.this;
        super();
    }
}
