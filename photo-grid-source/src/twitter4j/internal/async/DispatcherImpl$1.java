// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.async;


// Referenced classes of package twitter4j.internal.async:
//            DispatcherImpl

class this._cls0 extends Thread
{

    final DispatcherImpl this$0;

    public void run()
    {
        if (DispatcherImpl.access$000(DispatcherImpl.this))
        {
            shutdown();
        }
    }

    ()
    {
        this$0 = DispatcherImpl.this;
        super();
    }
}
