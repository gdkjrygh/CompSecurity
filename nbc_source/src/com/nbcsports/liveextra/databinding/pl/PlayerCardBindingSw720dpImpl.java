// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.databinding.pl;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.databinding.adapters.Converters;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.nbcsports.liveextra.ui.core.BindingUtils;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView;

// Referenced classes of package com.nbcsports.liveextra.databinding.pl:
//            PlayerCardBinding

public class PlayerCardBindingSw720dpImpl extends PlayerCardBinding
{
    public static class OnAwayClickHandlersImpl
        implements android.view.View.OnClickListener
    {

        private com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Handlers value;

        public void onClick(View view)
        {
            value.onAwayClick(view);
        }

        public OnAwayClickHandlersImpl setValue(com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Handlers handlers)
        {
            value = handlers;
            OnAwayClickHandlersImpl onawayclickhandlersimpl = this;
            if (handlers == null)
            {
                onawayclickhandlersimpl = null;
            }
            return onawayclickhandlersimpl;
        }

        public OnAwayClickHandlersImpl()
        {
        }
    }

    public static class OnHomeClickHandlersImpl
        implements android.view.View.OnClickListener
    {

        private com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Handlers value;

        public void onClick(View view)
        {
            value.onHomeClick(view);
        }

        public OnHomeClickHandlersImpl setValue(com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Handlers handlers)
        {
            value = handlers;
            OnHomeClickHandlersImpl onhomeclickhandlersimpl = this;
            if (handlers == null)
            {
                onhomeclickhandlersimpl = null;
            }
            return onhomeclickhandlersimpl;
        }

        public OnHomeClickHandlersImpl()
        {
        }
    }


    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Handlers mHandlers;
    private OnAwayClickHandlersImpl mOnAwayClickHandlers;
    private OnHomeClickHandlersImpl mOnHomeClickHandlers;
    private com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Binder mViewModel;
    private final PlayerCardsView mboundView0;
    private final FrameLayout mboundView1;
    private final View mboundView10;
    private final TextView mboundView3;
    private final FrameLayout mboundView4;
    private final TextView mboundView6;
    private final TextView mboundView7;
    private final View mboundView8;
    private final TextView mboundView9;

    public PlayerCardBindingSw720dpImpl(View view)
    {
        this(view, mapBindings(view, 15, sIncludes, sViewsWithIds));
    }

    private PlayerCardBindingSw720dpImpl(View view, Object aobj[])
    {
        super(view, 10, (ImageView)aobj[5], (ViewPager)aobj[12], (RelativeLayout)aobj[13], (FrameLayout)aobj[14], (ImageView)aobj[2], (ViewPager)aobj[11]);
        mDirtyFlags = -1L;
        awayFormation.setTag(null);
        awayPlayers.setTag(null);
        homeFormation.setTag(null);
        homePlayers.setTag(null);
        mboundView0 = (PlayerCardsView)aobj[0];
        mboundView0.setTag(null);
        mboundView1 = (FrameLayout)aobj[1];
        mboundView1.setTag(null);
        mboundView10 = (View)aobj[10];
        mboundView10.setTag(null);
        mboundView3 = (TextView)aobj[3];
        mboundView3.setTag(null);
        mboundView4 = (FrameLayout)aobj[4];
        mboundView4.setTag(null);
        mboundView6 = (TextView)aobj[6];
        mboundView6.setTag(null);
        mboundView7 = (TextView)aobj[7];
        mboundView7.setTag(null);
        mboundView8 = (View)aobj[8];
        mboundView8.setTag(null);
        mboundView9 = (TextView)aobj[9];
        mboundView9.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    private void log(String s, long l)
    {
        Log.d("BINDER", (new StringBuilder()).append(s).append(":").append(Long.toHexString(l)).toString());
    }

    private boolean onChangeAwayAbbrViewModel(ObservableField observablefield, int i)
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
        observablefield;
        this;
        JVM INSTR monitorexit ;
        throw observablefield;
    }

    private boolean onChangeAwayColorViewModel(ObservableInt observableint, int i)
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
        mDirtyFlags = mDirtyFlags | 256L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observableint;
        this;
        JVM INSTR monitorexit ;
        throw observableint;
    }

    private boolean onChangeAwayFormationViewModel(ObservableField observablefield, int i)
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
        mDirtyFlags = mDirtyFlags | 128L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observablefield;
        this;
        JVM INSTR monitorexit ;
        throw observablefield;
    }

    private boolean onChangeAwayPlayersViewModel(ObservableArrayList observablearraylist, int i)
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
        mDirtyFlags = mDirtyFlags | 4L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observablearraylist;
        this;
        JVM INSTR monitorexit ;
        throw observablearraylist;
    }

    private boolean onChangeHomeAbbrViewModel(ObservableField observablefield, int i)
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
        mDirtyFlags = mDirtyFlags | 64L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observablefield;
        this;
        JVM INSTR monitorexit ;
        throw observablefield;
    }

    private boolean onChangeHomeColorViewModel(ObservableInt observableint, int i)
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
        observableint;
        this;
        JVM INSTR monitorexit ;
        throw observableint;
    }

    private boolean onChangeHomeFormationViewModel(ObservableField observablefield, int i)
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
        observablefield;
        this;
        JVM INSTR monitorexit ;
        throw observablefield;
    }

    private boolean onChangeHomePlayersViewModel(ObservableArrayList observablearraylist, int i)
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
        mDirtyFlags = mDirtyFlags | 512L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observablearraylist;
        this;
        JVM INSTR monitorexit ;
        throw observablearraylist;
    }

    private boolean onChangeIsHomeTeamViewModel(ObservableBoolean observableboolean, int i)
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
        mDirtyFlags = mDirtyFlags | 32L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observableboolean;
        this;
        JVM INSTR monitorexit ;
        throw observableboolean;
    }

    private boolean onChangeViewModel(com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Binder binder, int i)
    {
        i;
        JVM INSTR tableswitch 0 19: default 96
    //                   0 305
    //                   1 236
    //                   2 144
    //                   3 167
    //                   4 282
    //                   5 96
    //                   6 96
    //                   7 96
    //                   8 96
    //                   9 96
    //                   10 96
    //                   11 96
    //                   12 96
    //                   13 96
    //                   14 190
    //                   15 98
    //                   16 121
    //                   17 259
    //                   18 96
    //                   19 213;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L7 _L8 _L9 _L10 _L1 _L11
_L1:
        return false;
_L8:
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
_L9:
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
        mDirtyFlags = mDirtyFlags | 256L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
_L5:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 128L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
_L7:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 64L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
_L11:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 32L;
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
        mDirtyFlags = mDirtyFlags | 2L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
_L10:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 512L;
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
        mDirtyFlags = mDirtyFlags | 4L;
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
        mDirtyFlags = mDirtyFlags | 1L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
    }

    protected void executeBindings()
    {
        this;
        JVM INSTR monitorenter ;
        long l3;
        l3 = mDirtyFlags;
        mDirtyFlags = 0L;
        this;
        JVM INSTR monitorexit ;
        com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Binder binder = mViewModel;
        int i1 = 0;
        byte byte3 = 0;
        Object obj1 = null;
        int k1 = 0;
        boolean flag1 = false;
        Object obj15 = null;
        ObservableArrayList observablearraylist = null;
        String s = null;
        String s3 = null;
        Object obj14 = null;
        ObservableField observablefield = null;
        int k = 0;
        byte byte1 = 0;
        int l = 0;
        byte byte2 = 0;
        Object obj13 = null;
        Object obj12 = null;
        boolean flag2 = false;
        boolean flag4 = false;
        boolean flag6 = false;
        Object obj3 = null;
        int l1 = 0;
        boolean flag = false;
        Object obj10 = null;
        Object obj8 = null;
        boolean flag5 = false;
        boolean flag3 = false;
        String s2 = null;
        Object obj9 = null;
        String s1 = null;
        Object obj11 = null;
        Object obj7 = null;
        Object obj6 = null;
        int j1 = 0;
        byte byte0 = 0;
        com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Handlers handlers = mHandlers;
        Object obj4 = null;
        Object obj16 = null;
        long l4 = l3;
        Object obj5 = obj7;
        Object obj;
        if ((3071L & l3) != 0L)
        {
            obj = obj16;
            if ((2051L & l3) != 0L)
            {
                if (binder != null)
                {
                    obj1 = binder.awayAbbr;
                }
                updateRegistration(1, ((android.databinding.Observable) (obj1)));
                obj = obj16;
                if (obj1 != null)
                {
                    obj = (String)((ObservableField) (obj1)).get();
                }
            }
            obj1 = obj15;
            if ((2053L & l3) != 0L)
            {
                obj1 = s;
                if (binder != null)
                {
                    obj1 = binder.awayPlayers;
                }
                updateRegistration(2, ((android.databinding.ObservableList) (obj1)));
            }
            s = obj14;
            if ((2057L & l3) != 0L)
            {
                if (binder != null)
                {
                    observablefield = binder.homeFormation;
                }
                updateRegistration(3, observablefield);
                s = obj14;
                if (observablefield != null)
                {
                    s = (String)observablefield.get();
                }
            }
            int i = ((flag) ? 1 : 0);
            if ((2065L & l3) != 0L)
            {
                ObservableInt observableint = obj13;
                if (binder != null)
                {
                    observableint = binder.homeColor;
                }
                updateRegistration(4, observableint);
                i = ((flag) ? 1 : 0);
                if (observableint != null)
                {
                    i = observableint.get();
                }
            }
            long l2 = l3;
            if ((2081L & l3) != 0L)
            {
                Object obj2 = obj12;
                if (binder != null)
                {
                    obj2 = binder.isHomeTeam;
                }
                updateRegistration(5, ((android.databinding.Observable) (obj2)));
                flag2 = flag6;
                if (obj2 != null)
                {
                    flag2 = ((ObservableBoolean) (obj2)).get();
                }
                int j;
                if (flag2)
                {
                    l2 = l3 | 32768L | 0x20000L;
                } else
                {
                    l2 = l3 | 16384L | 0x10000L;
                }
                if (flag2)
                {
                    byte1 = 0;
                } else
                {
                    byte1 = 8;
                }
                if (flag2)
                {
                    byte2 = 0;
                } else
                {
                    byte2 = 4;
                }
                if (!flag2)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                if (flag3)
                {
                    l2 = l2 | 8192L | 0x80000L;
                } else
                {
                    l2 = l2 | 4096L | 0x40000L;
                }
                if (flag3)
                {
                    byte3 = 0;
                } else
                {
                    byte3 = 8;
                }
                if (flag3)
                {
                    byte0 = 0;
                } else
                {
                    byte0 = 4;
                }
            }
            obj2 = obj11;
            if ((2113L & l2) != 0L)
            {
                if (binder != null)
                {
                    obj3 = binder.homeAbbr;
                }
                updateRegistration(6, ((android.databinding.Observable) (obj3)));
                obj2 = obj11;
                if (obj3 != null)
                {
                    obj2 = (String)((ObservableField) (obj3)).get();
                }
            }
            obj3 = obj9;
            if ((2177L & l2) != 0L)
            {
                obj4 = obj10;
                if (binder != null)
                {
                    obj4 = binder.awayFormation;
                }
                updateRegistration(7, ((android.databinding.Observable) (obj4)));
                obj3 = obj9;
                if (obj4 != null)
                {
                    obj3 = (String)((ObservableField) (obj4)).get();
                }
            }
            j = ((flag1) ? 1 : 0);
            if ((2305L & l2) != 0L)
            {
                obj4 = obj8;
                if (binder != null)
                {
                    obj4 = binder.awayColor;
                }
                updateRegistration(8, ((android.databinding.Observable) (obj4)));
                j = ((flag1) ? 1 : 0);
                if (obj4 != null)
                {
                    j = ((ObservableInt) (obj4)).get();
                }
            }
            k = byte1;
            l = byte2;
            i1 = byte3;
            j1 = byte0;
            obj4 = obj;
            k1 = j;
            s2 = ((String) (obj3));
            observablearraylist = ((ObservableArrayList) (obj1));
            l4 = l2;
            s1 = ((String) (obj2));
            l1 = i;
            s3 = s;
            obj5 = obj7;
            flag4 = flag2;
            flag5 = flag3;
            if ((2561L & l2) != 0L)
            {
                obj4 = obj6;
                if (binder != null)
                {
                    obj4 = binder.homePlayers;
                }
                updateRegistration(9, ((android.databinding.ObservableList) (obj4)));
                flag5 = flag3;
                flag4 = flag2;
                obj5 = obj4;
                s3 = s;
                l1 = i;
                s1 = ((String) (obj2));
                l4 = l2;
                observablearraylist = ((ObservableArrayList) (obj1));
                s2 = ((String) (obj3));
                k1 = j;
                obj4 = obj;
                j1 = byte0;
                i1 = byte3;
                l = byte2;
                k = byte1;
            }
        }
        if ((3072L & l4) == 0L);
        if ((2305L & l4) != 0L)
        {
            if (getBuildSdkInt() >= 16)
            {
                awayFormation.setBackground(Converters.convertColorToDrawable(k1));
            }
            if (getBuildSdkInt() >= 16)
            {
                mboundView10.setBackground(Converters.convertColorToDrawable(k1));
            }
        }
        if ((2177L & l4) != 0L)
        {
            PlayerCardsView.bindFormation(awayFormation, s2);
            PlayerCardsView.bindFormation(mboundView6, s2);
        }
        if ((2053L & l4) != 0L)
        {
            PlayerCardsView.bindPlayerList(awayPlayers, observablearraylist);
        }
        if ((2081L & l4) != 0L)
        {
            awayPlayers.setVisibility(i1);
        }
        if ((2065L & l4) != 0L)
        {
            if (getBuildSdkInt() >= 16)
            {
                homeFormation.setBackground(Converters.convertColorToDrawable(l1));
            }
            if (getBuildSdkInt() >= 16)
            {
                mboundView8.setBackground(Converters.convertColorToDrawable(l1));
            }
        }
        if ((2057L & l4) != 0L)
        {
            PlayerCardsView.bindFormation(homeFormation, s3);
            PlayerCardsView.bindFormation(mboundView3, s3);
        }
        if ((2561L & l4) != 0L)
        {
            PlayerCardsView.bindPlayerList(homePlayers, ((java.util.List) (obj5)));
        }
        if ((2081L & l4) != 0L)
        {
            homePlayers.setVisibility(k);
        }
        if ((2081L & l4) != 0L)
        {
            mboundView1.setVisibility(l);
            mboundView8.setVisibility(l);
        }
        if ((2081L & l4) != 0L)
        {
            mboundView10.setVisibility(j1);
            mboundView4.setVisibility(j1);
        }
        if ((3072L & l4) != 0L)
        {
            obj1 = mboundView7;
            if (mOnHomeClickHandlers == null)
            {
                obj = (new OnHomeClickHandlersImpl()).setValue(handlers);
                mOnHomeClickHandlers = ((OnHomeClickHandlersImpl) (obj));
            } else
            {
                obj = mOnHomeClickHandlers.setValue(handlers);
            }
            ((TextView) (obj1)).setOnClickListener(((android.view.View.OnClickListener) (obj)));
        }
        if ((2113L & l4) != 0L)
        {
            mboundView7.setText(s1);
        }
        if ((2081L & l4) != 0L)
        {
            BindingUtils.setSelected(mboundView7, flag4);
        }
        if ((3072L & l4) != 0L)
        {
            obj1 = mboundView9;
            if (mOnAwayClickHandlers == null)
            {
                obj = (new OnAwayClickHandlersImpl()).setValue(handlers);
                mOnAwayClickHandlers = ((OnAwayClickHandlersImpl) (obj));
            } else
            {
                obj = mOnAwayClickHandlers.setValue(handlers);
            }
            ((TextView) (obj1)).setOnClickListener(((android.view.View.OnClickListener) (obj)));
        }
        if ((2051L & l4) != 0L)
        {
            mboundView9.setText(((CharSequence) (obj4)));
        }
        if ((2081L & l4) != 0L)
        {
            BindingUtils.setSelected(mboundView9, flag5);
        }
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Handlers getHandlers()
    {
        return mHandlers;
    }

    public com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Binder getViewModel()
    {
        return mViewModel;
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
        mDirtyFlags = 2048L;
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
            return onChangeViewModel((com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Binder)obj, j);

        case 1: // '\001'
            return onChangeAwayAbbrViewModel((ObservableField)obj, j);

        case 2: // '\002'
            return onChangeAwayPlayersViewModel((ObservableArrayList)obj, j);

        case 3: // '\003'
            return onChangeHomeFormationViewModel((ObservableField)obj, j);

        case 4: // '\004'
            return onChangeHomeColorViewModel((ObservableInt)obj, j);

        case 5: // '\005'
            return onChangeIsHomeTeamViewModel((ObservableBoolean)obj, j);

        case 6: // '\006'
            return onChangeHomeAbbrViewModel((ObservableField)obj, j);

        case 7: // '\007'
            return onChangeAwayFormationViewModel((ObservableField)obj, j);

        case 8: // '\b'
            return onChangeAwayColorViewModel((ObservableInt)obj, j);

        case 9: // '\t'
            return onChangeHomePlayersViewModel((ObservableArrayList)obj, j);
        }
    }

    public void setHandlers(com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Handlers handlers)
    {
        mHandlers = handlers;
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 1024L;
        this;
        JVM INSTR monitorexit ;
        super.requestRebind();
        return;
        handlers;
        this;
        JVM INSTR monitorexit ;
        throw handlers;
    }

    public boolean setVariable(int i, Object obj)
    {
        switch (i)
        {
        default:
            return false;

        case 36: // '$'
            setViewModel((com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Binder)obj);
            return true;

        case 12: // '\f'
            setHandlers((com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Handlers)obj);
            return true;
        }
    }

    public void setViewModel(com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Binder binder)
    {
        updateRegistration(0, binder);
        mViewModel = binder;
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 1L;
        this;
        JVM INSTR monitorexit ;
        super.requestRebind();
        return;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
    }

    static 
    {
        sViewsWithIds = new SparseIntArray();
        sViewsWithIds.put(0x7f0f0141, 13);
        sViewsWithIds.put(0x7f0f0142, 14);
    }
}
