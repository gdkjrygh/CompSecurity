// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.databinding.pl;

import android.databinding.ObservableArrayList;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView;

// Referenced classes of package com.nbcsports.liveextra.databinding.pl:
//            HighLevelStatsBinding

public class HighLevelStatsBindingSw600dpImpl extends HighLevelStatsBinding
{

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView.Binder mBinder;
    private long mDirtyFlags;
    private final StatsView mboundView0;

    public HighLevelStatsBindingSw600dpImpl(View view)
    {
        this(view, mapBindings(view, 2, sIncludes, sViewsWithIds));
    }

    private HighLevelStatsBindingSw600dpImpl(View view, Object aobj[])
    {
        super(view, 2, null, null, null, null, null, (RecyclerView)aobj[1]);
        mDirtyFlags = -1L;
        mboundView0 = (StatsView)aobj[0];
        mboundView0.setTag(null);
        statsList.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    private void log(String s, long l)
    {
        Log.d("BINDER", (new StringBuilder()).append(s).append(":").append(Long.toHexString(l)).toString());
    }

    private boolean onChangeBinder(com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView.Binder binder, int i)
    {
        i;
        JVM INSTR lookupswitch 2: default 28
    //                   0: 51
    //                   30: 30;
           goto _L1 _L2 _L3
_L1:
        return false;
_L3:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 1L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
_L2:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 2L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
    }

    private boolean onChangeStatsListBinder(ObservableArrayList observablearraylist, int i)
    {
        i;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 22;
           goto _L1 _L2
_L1:
        return false;
_L2:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 1L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observablearraylist;
        this;
        JVM INSTR monitorexit ;
        throw observablearraylist;
    }

    protected void executeBindings()
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        l = mDirtyFlags;
        mDirtyFlags = 0L;
        this;
        JVM INSTR monitorexit ;
        ObservableArrayList observablearraylist = null;
        Object obj = null;
        com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView.Binder binder = mBinder;
        if ((l & 7L) != 0L)
        {
            observablearraylist = obj;
            if (binder != null)
            {
                observablearraylist = binder.statsList;
            }
            updateRegistration(0, observablearraylist);
        }
        if ((l & 7L) != 0L)
        {
            StatsView.bindStats(statsList, observablearraylist);
        }
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView.Binder getBinder()
    {
        return mBinder;
    }

    public boolean hasPendingBindings()
    {
        this;
        JVM INSTR monitorenter ;
        if (mDirtyFlags != 0L)
        {
            return true;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void invalidateAll()
    {
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = 4L;
        this;
        JVM INSTR monitorexit ;
        requestRebind();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected boolean onFieldChange(int i, Object obj, int j)
    {
        switch (i)
        {
        default:
            return false;

        case 0: // '\0'
            return onChangeStatsListBinder((ObservableArrayList)obj, j);

        case 1: // '\001'
            return onChangeBinder((com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView.Binder)obj, j);
        }
    }

    public void setBinder(com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView.Binder binder)
    {
        updateRegistration(1, binder);
        mBinder = binder;
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 2L;
        this;
        JVM INSTR monitorexit ;
        super.requestRebind();
        return;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
    }

    public boolean setVariable(int i, Object obj)
    {
        switch (i)
        {
        default:
            return false;

        case 6: // '\006'
            setBinder((com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView.Binder)obj);
            break;
        }
        return true;
    }

}
