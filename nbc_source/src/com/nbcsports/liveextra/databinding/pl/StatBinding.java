// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.databinding.pl;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.nbcsports.liveextra.ui.core.BindingUtils;
import com.nbcsports.liveextra.ui.player.premierleague.stats.StatsItemViewModel;

public class StatBinding extends ViewDataBinding
{

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    public final TextView awayStat;
    public final TextView homeStat;
    private long mDirtyFlags;
    private StatsItemViewModel mStat;
    private final LinearLayout mboundView0;
    private final TextView mboundView1;
    private final ProgressBar mboundView4;

    public StatBinding(View view)
    {
        super(view, 0);
        mDirtyFlags = -1L;
        Object aobj[] = mapBindings(view, 5, sIncludes, sViewsWithIds);
        awayStat = (TextView)aobj[3];
        awayStat.setTag(null);
        homeStat = (TextView)aobj[2];
        homeStat.setTag(null);
        mboundView0 = (LinearLayout)aobj[0];
        mboundView0.setTag(null);
        mboundView1 = (TextView)aobj[1];
        mboundView1.setTag(null);
        mboundView4 = (ProgressBar)aobj[4];
        mboundView4.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public static StatBinding bind(View view)
    {
        if (!"layout/pl_stats_item_view_0".equals(view.getTag()))
        {
            throw new RuntimeException((new StringBuilder()).append("view tag isn't correct on view:").append(view.getTag()).toString());
        } else
        {
            return new StatBinding(view);
        }
    }

    public static StatBinding inflate(LayoutInflater layoutinflater)
    {
        return bind(layoutinflater.inflate(0x7f04008a, null, false));
    }

    public static StatBinding inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag)
    {
        return (StatBinding)DataBindingUtil.inflate(layoutinflater, 0x7f04008a, viewgroup, flag);
    }

    private void log(String s, long l)
    {
        Log.d("BINDER", (new StringBuilder()).append(s).append(":").append(Long.toHexString(l)).toString());
    }

    protected void executeBindings()
    {
        this;
        JVM INSTR monitorenter ;
        long l2;
        l2 = mDirtyFlags;
        mDirtyFlags = 0L;
        this;
        JVM INSTR monitorexit ;
        StatsItemViewModel statsitemviewmodel = mStat;
        String s3 = null;
        String s = null;
        int k1 = 0;
        int i = 0;
        int l1 = 0;
        int j = 0;
        String s2 = null;
        String s1 = null;
        int j1 = 0;
        int k = 0;
        int i1 = 0;
        int l = 0;
        boolean flag = false;
        int i2 = ((flag) ? 1 : 0);
        if ((3L & l2) != 0L)
        {
            if (statsitemviewmodel != null)
            {
                s = statsitemviewmodel.homeColor;
            }
            if (statsitemviewmodel != null)
            {
                i = statsitemviewmodel.getHomeLength();
            }
            if (statsitemviewmodel != null)
            {
                j = statsitemviewmodel.home;
            }
            if (statsitemviewmodel != null)
            {
                s1 = statsitemviewmodel.awayColor;
            }
            if (statsitemviewmodel != null)
            {
                k = statsitemviewmodel.getBarLength();
            }
            if (statsitemviewmodel != null)
            {
                l = statsitemviewmodel.away;
            }
            s2 = s1;
            i1 = l;
            j1 = k;
            s3 = s;
            k1 = i;
            l1 = j;
            i2 = ((flag) ? 1 : 0);
            if (statsitemviewmodel != null)
            {
                i2 = statsitemviewmodel.name;
                l1 = j;
                k1 = i;
                s3 = s;
                j1 = k;
                i1 = l;
                s2 = s1;
            }
        }
        if ((3L & l2) != 0L)
        {
            BindingUtils.setNumber(awayStat, Integer.valueOf(i1));
        }
        if ((3L & l2) != 0L)
        {
            BindingUtils.setNumber(homeStat, Integer.valueOf(l1));
        }
        if ((3L & l2) != 0L)
        {
            mboundView1.setText(i2);
        }
        if ((3L & l2) != 0L)
        {
            mboundView4.setMax(j1);
            mboundView4.setSecondaryProgress(j1);
        }
        if ((3L & l2) != 0L)
        {
            mboundView4.setProgress(k1);
        }
        if ((3L & l2) != 0L)
        {
            BindingUtils.setProgressDrawableTint(mboundView4, s3);
        }
        if ((3L & l2) != 0L)
        {
            BindingUtils.setProgressBackgroundTint(mboundView4, s2);
        }
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public StatsItemViewModel getStat()
    {
        return mStat;
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
        mDirtyFlags = 2L;
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
        return false;
    }

    public void setStat(StatsItemViewModel statsitemviewmodel)
    {
        mStat = statsitemviewmodel;
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 1L;
        this;
        JVM INSTR monitorexit ;
        super.requestRebind();
        return;
        statsitemviewmodel;
        this;
        JVM INSTR monitorexit ;
        throw statsitemviewmodel;
    }

    public boolean setVariable(int i, Object obj)
    {
        switch (i)
        {
        default:
            return false;

        case 28: // '\034'
            setStat((StatsItemViewModel)obj);
            break;
        }
        return true;
    }

}
