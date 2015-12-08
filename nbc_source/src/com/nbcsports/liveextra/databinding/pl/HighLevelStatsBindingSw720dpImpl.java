// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.databinding.pl;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableInt;
import android.databinding.adapters.Converters;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nbcsports.liveextra.ui.core.BindingUtils;
import com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView;

// Referenced classes of package com.nbcsports.liveextra.databinding.pl:
//            HighLevelStatsBinding

public class HighLevelStatsBindingSw720dpImpl extends HighLevelStatsBinding
{

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView.Binder mBinder;
    private long mDirtyFlags;
    private final StatsView mboundView0;
    private final View mboundView1;
    private final View mboundView10;
    private final View mboundView11;
    private final TextView mboundView2;
    private final View mboundView3;
    private final View mboundView4;
    private final TextView mboundView5;
    private final View mboundView6;
    private final View mboundView7;
    private final TextView mboundView8;
    private final View mboundView9;

    public HighLevelStatsBindingSw720dpImpl(View view)
    {
        this(view, mapBindings(view, 18, sIncludes, sViewsWithIds));
    }

    private HighLevelStatsBindingSw720dpImpl(View view, Object aobj[])
    {
        super(view, 5, (ImageView)aobj[17], (TextView)aobj[13], (ImageView)aobj[16], (LinearLayout)aobj[14], (ImageView)aobj[15], (RecyclerView)aobj[12]);
        mDirtyFlags = -1L;
        mboundView0 = (StatsView)aobj[0];
        mboundView0.setTag(null);
        mboundView1 = (View)aobj[1];
        mboundView1.setTag(null);
        mboundView10 = (View)aobj[10];
        mboundView10.setTag(null);
        mboundView11 = (View)aobj[11];
        mboundView11.setTag(null);
        mboundView2 = (TextView)aobj[2];
        mboundView2.setTag(null);
        mboundView3 = (View)aobj[3];
        mboundView3.setTag(null);
        mboundView4 = (View)aobj[4];
        mboundView4.setTag(null);
        mboundView5 = (TextView)aobj[5];
        mboundView5.setTag(null);
        mboundView6 = (View)aobj[6];
        mboundView6.setTag(null);
        mboundView7 = (View)aobj[7];
        mboundView7.setTag(null);
        mboundView8 = (TextView)aobj[8];
        mboundView8.setTag(null);
        mboundView9 = (View)aobj[9];
        mboundView9.setTag(null);
        statsList.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    private void log(String s, long l)
    {
        Log.d("BINDER", (new StringBuilder()).append(s).append(":").append(Long.toHexString(l)).toString());
    }

    private boolean onChangeAwayColorBinder(ObservableInt observableint, int i)
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
        observableint;
        this;
        JVM INSTR monitorexit ;
        throw observableint;
    }

    private boolean onChangeBallLocationsBinder(ObservableArrayList observablearraylist, int i)
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
        mDirtyFlags = mDirtyFlags | 16L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observablearraylist;
        this;
        JVM INSTR monitorexit ;
        throw observablearraylist;
    }

    private boolean onChangeBinder(com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView.Binder binder, int i)
    {
        i;
        JVM INSTR lookupswitch 5: default 52
    //                   0: 144
    //                   2: 100
    //                   5: 77
    //                   15: 54
    //                   30: 121;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return false;
_L5:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 8L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
_L4:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 16L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
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
_L6:
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
_L2:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 4L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
    }

    private boolean onChangeHomeColorBinder(ObservableInt observableint, int i)
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
        mDirtyFlags = mDirtyFlags | 8L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observableint;
        this;
        JVM INSTR monitorexit ;
        throw observableint;
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
        mDirtyFlags = mDirtyFlags | 2L;
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
        long l2;
        l2 = mDirtyFlags;
        mDirtyFlags = 0L;
        this;
        JVM INSTR monitorexit ;
        Object obj = null;
        boolean flag2 = false;
        int k = 0;
        int j = 0;
        boolean flag3 = false;
        Object obj9 = null;
        Object obj2 = null;
        Object obj8 = null;
        Object obj3 = null;
        boolean flag4 = false;
        com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView.Binder binder = mBinder;
        boolean flag6 = false;
        boolean flag5 = false;
        Object obj7 = null;
        Object obj4 = null;
        boolean flag7 = false;
        boolean flag1 = false;
        boolean flag8 = false;
        boolean flag = false;
        int l1 = 0;
        boolean flag9 = false;
        Object obj5 = null;
        Object obj6 = null;
        Double double2 = obj3;
        int j2 = ((flag6) ? 1 : 0);
        Double double1 = obj4;
        int l = ((flag7) ? 1 : 0);
        Object obj1 = obj5;
        int i1 = ((flag8) ? 1 : 0);
        int i2 = ((flag2) ? 1 : 0);
        int k1 = ((flag4) ? 1 : 0);
        int j1 = ((flag3) ? 1 : 0);
        if ((63L & l2) != 0L)
        {
            int i = j;
            if ((37L & l2) != 0L)
            {
                if (binder != null)
                {
                    obj = binder.awayColor;
                }
                updateRegistration(0, ((android.databinding.Observable) (obj)));
                i = j;
                if (obj != null)
                {
                    i = ((ObservableInt) (obj)).get();
                }
            }
            obj = obj9;
            if ((38L & l2) != 0L)
            {
                obj = obj8;
                if (binder != null)
                {
                    obj = binder.statsList;
                }
                updateRegistration(1, ((android.databinding.ObservableList) (obj)));
            }
            j = ((flag9) ? 1 : 0);
            if ((44L & l2) != 0L)
            {
                obj1 = obj7;
                if (binder != null)
                {
                    obj1 = binder.homeColor;
                }
                updateRegistration(3, ((android.databinding.Observable) (obj1)));
                j = ((flag9) ? 1 : 0);
                if (obj1 != null)
                {
                    j = ((ObservableInt) (obj1)).get();
                }
            }
            k = i;
            double2 = obj3;
            j2 = ((flag6) ? 1 : 0);
            double1 = obj4;
            l = ((flag7) ? 1 : 0);
            obj1 = obj5;
            i1 = ((flag8) ? 1 : 0);
            l1 = j;
            i2 = ((flag2) ? 1 : 0);
            k1 = ((flag4) ? 1 : 0);
            j1 = ((flag3) ? 1 : 0);
            obj2 = obj;
            if ((52L & l2) != 0L)
            {
                obj1 = obj6;
                if (binder != null)
                {
                    obj1 = binder.ballLocations;
                }
                updateRegistration(4, ((android.databinding.ObservableList) (obj1)));
                double2 = (Double)((ObservableArrayList) (obj1)).get(0);
                obj2 = Double.valueOf(double2.doubleValue() * 100D);
                k = ((flag5) ? 1 : 0);
                if (obj2 != null)
                {
                    k = ((Number) (obj2)).intValue();
                }
                i2 = 100 - k;
                double1 = (Double)((ObservableArrayList) (obj1)).get(1);
                obj2 = Double.valueOf(double1.doubleValue() * 100D);
                l = ((flag1) ? 1 : 0);
                if (obj2 != null)
                {
                    l = ((Number) (obj2)).intValue();
                }
                k1 = 100 - l;
                obj1 = (Double)((ObservableArrayList) (obj1)).get(2);
                obj2 = Double.valueOf(((Double) (obj1)).doubleValue() * 100D);
                i1 = ((flag) ? 1 : 0);
                if (obj2 != null)
                {
                    i1 = ((Number) (obj2)).intValue();
                }
                j1 = 100 - i1;
                obj2 = obj;
                l1 = j;
                j2 = k;
                k = i;
            }
        }
        if ((44L & l2) != 0L && getBuildSdkInt() >= 16)
        {
            mboundView1.setBackground(Converters.convertColorToDrawable(l1));
        }
        if ((52L & l2) != 0L)
        {
            BindingUtils.setLayoutWeight(mboundView10, i1);
        }
        if ((37L & l2) != 0L && getBuildSdkInt() >= 16)
        {
            mboundView11.setBackground(Converters.convertColorToDrawable(k));
        }
        if ((52L & l2) != 0L)
        {
            BindingUtils.setPercent(mboundView2, double2);
        }
        if ((52L & l2) != 0L)
        {
            BindingUtils.setLayoutWeight(mboundView3, i2);
        }
        if ((52L & l2) != 0L)
        {
            BindingUtils.setLayoutWeight(mboundView4, j2);
        }
        if ((52L & l2) != 0L)
        {
            BindingUtils.setPercent(mboundView5, double1);
        }
        if ((52L & l2) != 0L)
        {
            BindingUtils.setLayoutWeight(mboundView6, k1);
        }
        if ((52L & l2) != 0L)
        {
            BindingUtils.setLayoutWeight(mboundView7, l);
        }
        if ((52L & l2) != 0L)
        {
            BindingUtils.setPercent(mboundView8, ((Double) (obj1)));
        }
        if ((52L & l2) != 0L)
        {
            BindingUtils.setLayoutWeight(mboundView9, j1);
        }
        if ((38L & l2) != 0L)
        {
            StatsView.bindStats(statsList, ((java.util.List) (obj2)));
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
        mDirtyFlags = 32L;
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
            return onChangeAwayColorBinder((ObservableInt)obj, j);

        case 1: // '\001'
            return onChangeStatsListBinder((ObservableArrayList)obj, j);

        case 2: // '\002'
            return onChangeBinder((com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView.Binder)obj, j);

        case 3: // '\003'
            return onChangeHomeColorBinder((ObservableInt)obj, j);

        case 4: // '\004'
            return onChangeBallLocationsBinder((ObservableArrayList)obj, j);
        }
    }

    public void setBinder(com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView.Binder binder)
    {
        updateRegistration(2, binder);
        mBinder = binder;
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 4L;
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

    static 
    {
        sViewsWithIds = new SparseIntArray();
        sViewsWithIds.put(0x7f0f014c, 13);
        sViewsWithIds.put(0x7f0f0142, 14);
        sViewsWithIds.put(0x7f0f014d, 15);
        sViewsWithIds.put(0x7f0f014e, 16);
        sViewsWithIds.put(0x7f0f014f, 17);
    }
}
