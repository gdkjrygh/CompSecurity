// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


class val.throwable
    implements Runnable
{

    final val.throwable this$1;
    final Throwable val$throwable;

    public void run()
    {
        throw new RuntimeException(val$throwable);
    }

    ()
    {
        this$1 = final_;
        val$throwable = Throwable.this;
        super();
    }
}
