// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lang.Object
    implements Runnable
{

    final JY this$0;

    public final void run()
    {
        if (mCacheInitializedFromDatabaseCallback != null)
        {
            mCacheInitializedFromDatabaseCallback.a();
        }
    }

    >()
    {
        this$0 = JY.this;
        super();
    }
}
