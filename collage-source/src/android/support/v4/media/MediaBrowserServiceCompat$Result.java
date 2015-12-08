// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//            MediaBrowserServiceCompat

public class mDebug
{

    private Object mDebug;
    private boolean mDetachCalled;
    private boolean mSendResultCalled;
    final MediaBrowserServiceCompat this$0;

    public void detach()
    {
        if (mDetachCalled)
        {
            throw new IllegalStateException((new StringBuilder()).append("detach() called when detach() had already been called for: ").append(mDebug).toString());
        }
        if (mSendResultCalled)
        {
            throw new IllegalStateException((new StringBuilder()).append("detach() called when sendResult() had already been called for: ").append(mDebug).toString());
        } else
        {
            mDetachCalled = true;
            return;
        }
    }

    boolean isDone()
    {
        return mDetachCalled || mSendResultCalled;
    }

    void onResultSent(Object obj)
    {
    }

    public void sendResult(Object obj)
    {
        if (mSendResultCalled)
        {
            throw new IllegalStateException((new StringBuilder()).append("sendResult() called twice for: ").append(mDebug).toString());
        } else
        {
            mSendResultCalled = true;
            onResultSent(obj);
            return;
        }
    }

    (Object obj)
    {
        this$0 = MediaBrowserServiceCompat.this;
        super();
        mDebug = obj;
    }
}
