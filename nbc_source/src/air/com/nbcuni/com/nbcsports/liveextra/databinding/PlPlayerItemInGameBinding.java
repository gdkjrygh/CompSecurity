// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package air.com.nbcuni.com.nbcsports.liveextra.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nbcsports.liveextra.ui.core.BindingUtils;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerBoxScoreViewModel;

public class PlPlayerItemInGameBinding extends ViewDataBinding
{

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private boolean mIsGoalkeeper;
    private PlayerBoxScoreViewModel mStats;
    private final LinearLayout mboundView0;
    private final TextView mboundView1;
    private final TextView mboundView2;
    private final TextView mboundView3;
    private final TextView mboundView4;

    public PlPlayerItemInGameBinding(View view)
    {
        super(view, 0);
        mDirtyFlags = -1L;
        Object aobj[] = mapBindings(view, 5, sIncludes, sViewsWithIds);
        mboundView0 = (LinearLayout)aobj[0];
        mboundView0.setTag(null);
        mboundView1 = (TextView)aobj[1];
        mboundView1.setTag(null);
        mboundView2 = (TextView)aobj[2];
        mboundView2.setTag(null);
        mboundView3 = (TextView)aobj[3];
        mboundView3.setTag(null);
        mboundView4 = (TextView)aobj[4];
        mboundView4.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public static PlPlayerItemInGameBinding bind(View view)
    {
        if (!"layout/pl_player_item_in_game_0".equals(view.getTag()))
        {
            throw new RuntimeException((new StringBuilder()).append("view tag isn't correct on view:").append(view.getTag()).toString());
        } else
        {
            return new PlPlayerItemInGameBinding(view);
        }
    }

    public static PlPlayerItemInGameBinding inflate(LayoutInflater layoutinflater)
    {
        return bind(layoutinflater.inflate(0x7f040080, null, false));
    }

    public static PlPlayerItemInGameBinding inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag)
    {
        return (PlPlayerItemInGameBinding)DataBindingUtil.inflate(layoutinflater, 0x7f040080, viewgroup, flag);
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
        boolean flag = false;
        int i1 = 0;
        int i = 0;
        PlayerBoxScoreViewModel playerboxscoreviewmodel = mStats;
        double d = 0.0D;
        int k = 0;
        int j = 0;
        boolean flag1 = false;
        boolean flag2 = mIsGoalkeeper;
        int l = ((flag1) ? 1 : 0);
        double d1 = d;
        if ((5L & l2) != 0L)
        {
            if (playerboxscoreviewmodel != null)
            {
                i = playerboxscoreviewmodel.shots;
            }
            if (playerboxscoreviewmodel != null)
            {
                d = playerboxscoreviewmodel.passingPct;
            }
            if (playerboxscoreviewmodel != null)
            {
                j = playerboxscoreviewmodel.assists;
            }
            k = j;
            l = ((flag1) ? 1 : 0);
            i1 = i;
            d1 = d;
            if (playerboxscoreviewmodel != null)
            {
                l = playerboxscoreviewmodel.goals;
                d1 = d;
                i1 = i;
                k = j;
            }
        }
        i = ((flag) ? 1 : 0);
        long l1 = l2;
        if ((6L & l2) != 0L)
        {
            Exception exception;
            if (!flag2)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                l1 = l2 | 16L;
            } else
            {
                l1 = l2 | 8L;
            }
            if (i != 0)
            {
                i = 0;
            } else
            {
                i = 8;
            }
        }
        if ((6L & l1) != 0L)
        {
            mboundView0.setVisibility(i);
        }
        if ((5L & l1) != 0L)
        {
            BindingUtils.setNumber(mboundView1, Integer.valueOf(l));
        }
        if ((5L & l1) != 0L)
        {
            BindingUtils.setNumber(mboundView2, Integer.valueOf(i1));
        }
        if ((5L & l1) != 0L)
        {
            BindingUtils.setNumber(mboundView3, Integer.valueOf(k));
        }
        if ((5L & l1) != 0L)
        {
            BindingUtils.setPercent(mboundView4, Double.valueOf(d1));
        }
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean getIsGoalkeeper()
    {
        return mIsGoalkeeper;
    }

    public PlayerBoxScoreViewModel getStats()
    {
        return mStats;
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
        return false;
    }

    public void setIsGoalkeeper(boolean flag)
    {
        mIsGoalkeeper = flag;
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 2L;
        this;
        JVM INSTR monitorexit ;
        super.requestRebind();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setStats(PlayerBoxScoreViewModel playerboxscoreviewmodel)
    {
        mStats = playerboxscoreviewmodel;
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 1L;
        this;
        JVM INSTR monitorexit ;
        super.requestRebind();
        return;
        playerboxscoreviewmodel;
        this;
        JVM INSTR monitorexit ;
        throw playerboxscoreviewmodel;
    }

    public boolean setVariable(int i, Object obj)
    {
        switch (i)
        {
        default:
            return false;

        case 29: // '\035'
            setStats((PlayerBoxScoreViewModel)obj);
            return true;

        case 18: // '\022'
            setIsGoalkeeper(((Boolean)obj).booleanValue());
            return true;
        }
    }

}
