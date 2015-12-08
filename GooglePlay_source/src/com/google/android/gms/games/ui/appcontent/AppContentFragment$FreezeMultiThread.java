// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.support.v4.app.Fragment;
import com.google.android.gms.games.appcontent.AppContentSection;
import com.google.android.gms.games.appcontent.AppContentSectionBuffer;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentFragment

private static final class SectionFreezer
{
    final class _cls1CpuFilter
        implements FileFilter
    {

        final AppContentFragment.FreezeMultiThread this$0;

        public final boolean accept(File file)
        {
            return Pattern.matches("cpu[0-9]+", file.getName());
        }

        _cls1CpuFilter()
        {
            this$0 = AppContentFragment.FreezeMultiThread.this;
            super();
        }
    }

    private final class SectionFreezer
        implements Runnable
    {

        private final int mIdx;
        final AppContentFragment.FreezeMultiThread this$0;

        public final void run()
        {
            if (mShouldAbort) goto _L2; else goto _L1
_L1:
            int i = mIdx;
            AppContentSection appcontentsection = (AppContentSection)((AppContentSection)mSectionBuffer.get(mIdx)).freeze();
            mPendingSections.put(Integer.valueOf(i), appcontentsection);
            Object obj = mLock;
            obj;
            JVM INSTR monitorenter ;
_L4:
            final AppContentSection section;
            if (mShouldAbort || mPendingSections.isEmpty() || ((Integer)mPendingSections.firstKey()).intValue() != mNextSectionToDisplay)
            {
                break MISSING_BLOCK_LABEL_251;
            }
            int j = ((Integer)mPendingSections.firstKey()).intValue();
            section = (AppContentSection)mPendingSections.remove(Integer.valueOf(j));
            AppContentFragment.FreezeMultiThread freezemultithread = AppContentFragment.FreezeMultiThread.this;
            freezemultithread.mNextSectionToDisplay = freezemultithread.mNextSectionToDisplay + 1;
            Exception exception;
            boolean flag;
            if (mNextSectionToDisplay == mSectionBuffer.getCount())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mActivity.runOnUiThread(flag. new Runnable() {

                final SectionFreezer this$1;
                final boolean val$isLast;
                final AppContentSection val$section;

                public final void run()
                {
                    if (!mShouldAbort && ((Fragment) (mFragment)).mActivity != null)
                    {
                        AppContentFragment.access$1000(mFragment, section, isLast);
                    }
                }

            
            {
                this$1 = final_sectionfreezer;
                section = appcontentsection;
                isLast = Z.this;
                super();
            }
            });
            if (!flag) goto _L4; else goto _L3
_L3:
            mSectionBuffer.release();
            mNextSectionToDisplay = -1;
              goto _L4
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            obj;
            JVM INSTR monitorexit ;
_L2:
        }

        public SectionFreezer(int i)
        {
            this$0 = AppContentFragment.FreezeMultiThread.this;
            super();
            mIdx = i;
        }
    }


    final GamesFragmentActivity mActivity;
    private final ThreadPoolExecutor mExecutor;
    final AppContentFragment mFragment;
    final Object mLock = new Object();
    int mNextSectionToDisplay;
    final ConcurrentSkipListMap mPendingSections = new ConcurrentSkipListMap();
    final AppContentSectionBuffer mSectionBuffer;
    boolean mShouldAbort;
    private final long mStartTimestamp = System.currentTimeMillis();

    private int getNumCores()
    {
        int i;
        try
        {
            i = (new File("/sys/devices/system/cpu/")).listFiles(new _cls1CpuFilter()).length;
        }
        catch (Exception exception)
        {
            return 1;
        }
        return i;
    }

    public SectionFreezer.mIdx(GamesFragmentActivity gamesfragmentactivity, AppContentFragment appcontentfragment, AppContentSectionBuffer appcontentsectionbuffer)
    {
        int i = 1;
        super();
        mShouldAbort = false;
        int j = Math.max(getNumCores(), 1);
        if (j != 1)
        {
            i = j - 1;
        }
        mActivity = gamesfragmentactivity;
        mFragment = appcontentfragment;
        mSectionBuffer = appcontentsectionbuffer;
        mNextSectionToDisplay = 0;
        mExecutor = new ThreadPoolExecutor(i, j, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        i = 0;
        for (j = mSectionBuffer.getCount(); i < j; i++)
        {
            mExecutor.execute(new SectionFreezer(i));
        }

    }
}
