// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;


// Referenced classes of package rx:
//            Single, SingleSubscriber

static final class ject
    implements Subscribe
{

    final Object val$value;

    public volatile void call(Object obj)
    {
        call((SingleSubscriber)obj);
    }

    public void call(SingleSubscriber singlesubscriber)
    {
        singlesubscriber.onSuccess(val$value);
    }

    ject(Object obj)
    {
        val$value = obj;
        super();
    }
}
