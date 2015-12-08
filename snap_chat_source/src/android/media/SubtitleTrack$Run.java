// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.media;


// Referenced classes of package android.media:
//            SubtitleTrack

static class mStoredEndTimeMs
{

    static final boolean $assertionsDisabled;
    public long mEndTimeMs;
    public .assertionsDisabled mFirstCue;
    public .assertionsDisabled mNextRunAtEndTimeMs;
    public .assertionsDisabled mPrevRunAtEndTimeMs;
    public long mRunID;
    private long mStoredEndTimeMs;

    static 
    {
        boolean flag;
        if (!android/media/SubtitleTrack.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    private ()
    {
        mEndTimeMs = -1L;
        mRunID = 0L;
        mStoredEndTimeMs = -1L;
    }
}
