// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.media;

import android.graphics.Canvas;
import android.util.LongSparseArray;
import java.util.SortedMap;
import java.util.Vector;

public abstract class SubtitleTrack
{
    public static class Cue
    {

        public long mEndTimeMs;
        public long mInnerTimesMs[];
        public Cue mNextInRun;
        public long mStartTimeMs;
    }

    static class CueList
    {

        private SortedMap mCues;

        private void removeEvent(Cue cue, long l)
        {
            Vector vector = (Vector)mCues.get(Long.valueOf(l));
            if (vector != null)
            {
                vector.remove(cue);
                if (vector.size() == 0)
                {
                    mCues.remove(Long.valueOf(l));
                }
            }
        }

        public void remove(Cue cue)
        {
            removeEvent(cue, cue.mStartTimeMs);
            if (cue.mInnerTimesMs != null)
            {
                long al[] = cue.mInnerTimesMs;
                int j = al.length;
                for (int i = 0; i < j; i++)
                {
                    removeEvent(cue, al[i]);
                }

            }
            removeEvent(cue, cue.mEndTimeMs);
        }
    }

    public static interface RenderingWidget
    {

        public abstract void draw(Canvas canvas);

        public abstract void onAttachedToWindow();

        public abstract void onDetachedFromWindow();

        public abstract void setOnChangedListener(OnChangedListener onchangedlistener);

        public abstract void setSize(int i, int j);
    }

    public static interface RenderingWidget.OnChangedListener
    {
    }

    static class Run
    {

        static final boolean $assertionsDisabled;
        public long mEndTimeMs;
        public Cue mFirstCue;
        public Run mNextRunAtEndTimeMs;
        public Run mPrevRunAtEndTimeMs;
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

        private Run()
        {
            mEndTimeMs = -1L;
            mRunID = 0L;
            mStoredEndTimeMs = -1L;
        }
    }


    protected CueList mCues;
    protected final LongSparseArray mRunsByEndTime;
    protected final LongSparseArray mRunsByID;

    private void removeRunsByEndTimeIndex(int i)
    {
        Run run1;
        for (Run run = (Run)mRunsByEndTime.valueAt(i); run != null; run = run1)
        {
            Cue cue1;
            for (Cue cue = run.mFirstCue; cue != null; cue = cue1)
            {
                mCues.remove(cue);
                cue1 = cue.mNextInRun;
                cue.mNextInRun = null;
            }

            mRunsByID.remove(run.mRunID);
            run1 = run.mNextRunAtEndTimeMs;
            run.mPrevRunAtEndTimeMs = null;
            run.mNextRunAtEndTimeMs = null;
        }

        mRunsByEndTime.removeAt(i);
    }

    protected void finalize()
    {
        for (int i = mRunsByEndTime.size() - 1; i >= 0; i--)
        {
            removeRunsByEndTimeIndex(i);
        }

        super.finalize();
    }
}
