// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;


// Referenced classes of package rx:
//            SingleSubscriber, Single

class riber extends SingleSubscriber
{

    final val.child this$0;
    final SingleSubscriber val$child;

    public void onError(Throwable throwable)
    {
        val$child.onError(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Single)obj);
    }

    public void onSuccess(Single single)
    {
        single.subscribe(val$child);
    }

    riber()
    {
        this$0 = final_riber;
        val$child = SingleSubscriber.this;
        super();
    }

    // Unreferenced inner class rx/Single$5

/* anonymous class */
    final class Single._cls5
        implements Single.OnSubscribe
    {

        final Single val$source;

        public volatile void call(Object obj)
        {
            call((SingleSubscriber)obj);
        }

        public void call(SingleSubscriber singlesubscriber)
        {
            source.subscribe(singlesubscriber. new Single._cls5._cls1());
        }

            
            {
                source = single;
                super();
            }
    }

}
