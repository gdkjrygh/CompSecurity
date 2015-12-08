// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;


// Referenced classes of package rx:
//            Single, SingleSubscriber

final class ject
    implements Subscribe
{

    final Single val$source;

    public volatile void call(Object obj)
    {
        call((SingleSubscriber)obj);
    }

    public void call(final SingleSubscriber child)
    {
        val$source.subscribe(new SingleSubscriber() {

            final Single._cls5 this$0;
            final SingleSubscriber val$child;

            public void onError(Throwable throwable)
            {
                child.onError(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Single)obj);
            }

            public void onSuccess(Single single)
            {
                single.subscribe(child);
            }

            
            {
                this$0 = Single._cls5.this;
                child = singlesubscriber;
                super();
            }
        });
    }

    scriber()
    {
        val$source = single;
        super();
    }
}
