// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.support.v4.app.Fragment;
import com.google.android.gms.games.appcontent.AppContentSection;
import com.google.android.gms.games.appcontent.AppContentSectionBuffer;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import java.util.concurrent.ConcurrentSkipListMap;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentFragment

private final class mIdx
    implements Runnable
{

    private final int mIdx;
    final isplay this$0;

    public final void run()
    {
        if (this._cls0.this.mIdx) goto _L2; else goto _L1
_L1:
        int i = mIdx;
        AppContentSection appcontentsection = (AppContentSection)((AppContentSection)this._cls0.this.mIdx.get(mIdx)).freeze();
        s.put(Integer.valueOf(i), appcontentsection);
        Object obj = s;
        obj;
        JVM INSTR monitorenter ;
_L4:
        final AppContentSection section;
        if (s || s.isEmpty() || ((Integer)s.firstKey()).intValue() != isplay)
        {
            break MISSING_BLOCK_LABEL_251;
        }
        int j = ((Integer)s.firstKey()).intValue();
        section = (AppContentSection)s.remove(Integer.valueOf(j));
        mIdx midx = this._cls0.this;
        midx.isplay = midx.isplay + 1;
        Exception exception;
        final boolean isLast;
        if (isplay == isplay.getCount())
        {
            isLast = true;
        } else
        {
            isLast = false;
        }
        isplay.runOnUiThread(new Runnable() {

            final AppContentFragment.FreezeMultiThread.SectionFreezer this$1;
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
                this$1 = AppContentFragment.FreezeMultiThread.SectionFreezer.this;
                section = appcontentsection;
                isLast = flag;
                super();
            }
        });
        if (!isLast) goto _L4; else goto _L3
_L3:
        this._cls0.this.isLast.release();
        isplay = -1;
          goto _L4
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
_L2:
    }

    public _cls1.val.isLast(int i)
    {
        this$0 = this._cls0.this;
        super();
        mIdx = i;
    }
}
