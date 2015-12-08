// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;


// Referenced classes of package android.support.v7.internal.widget:
//            ProgressBarICS

private class mFromUser
    implements Runnable
{

    private boolean mFromUser;
    private int mId;
    private int mProgress;
    final ProgressBarICS this$0;

    public void run()
    {
        ProgressBarICS.access$000(ProgressBarICS.this, mId, mProgress, mFromUser, true);
        ProgressBarICS.access$102(ProgressBarICS.this, this);
    }

    public void setup(int i, int j, boolean flag)
    {
        mId = i;
        mProgress = j;
        mFromUser = flag;
    }

    (int i, int j, boolean flag)
    {
        this$0 = ProgressBarICS.this;
        super();
        mId = i;
        mProgress = j;
        mFromUser = flag;
    }
}
