// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.databinding.pl;

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

public class PlayerCardBindingImpl extends PlayerCardBinding
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

    public PlayerCardBindingImpl(View view)
    {
        this(view, mapBindings(view, 15, sIncludes, sViewsWithIds));
    }

    private PlayerCardBindingImpl(View view, Object aobj[])
    {
        super(view, 8, (ImageView)aobj[5], (ViewPager)aobj[12], (RelativeLayout)aobj[13], (FrameLayout)aobj[14], (ImageView)aobj[2], (ViewPager)aobj[11]);
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
        mDirtyFlags = mDirtyFlags | 128L;
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
        mDirtyFlags = mDirtyFlags | 64L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observablefield;
        this;
        JVM INSTR monitorexit ;
        throw observablefield;
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
        mDirtyFlags = mDirtyFlags | 32L;
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
        mDirtyFlags = mDirtyFlags | 8L;
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
        mDirtyFlags = mDirtyFlags | 4L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observablefield;
        this;
        JVM INSTR monitorexit ;
        throw observablefield;
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
        mDirtyFlags = mDirtyFlags | 16L;
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
        JVM INSTR lookupswitch 8: default 76
    //                   0: 239
    //                   1: 216
    //                   2: 124
    //                   3: 147
    //                   14: 170
    //                   15: 78
    //                   16: 101
    //                   19: 193;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        return false;
_L7:
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
_L8:
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
_L4:
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
_L5:
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
_L6:
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
_L9:
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
        long l2;
        l2 = mDirtyFlags;
        mDirtyFlags = 0L;
        this;
        JVM INSTR monitorexit ;
        com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Binder binder = mViewModel;
        int l = 0;
        byte byte3 = 0;
        Object obj1 = null;
        boolean flag = false;
        String s2 = null;
        Object obj10 = null;
        ObservableField observablefield = null;
        int j = 0;
        byte byte1 = 0;
        int k = 0;
        byte byte2 = 0;
        Object obj9 = null;
        Object obj8 = null;
        boolean flag2 = false;
        boolean flag4 = false;
        boolean flag6 = false;
        Object obj3 = null;
        int k1 = 0;
        boolean flag1 = false;
        Object obj6 = null;
        ObservableInt observableint1 = null;
        boolean flag5 = false;
        boolean flag3 = false;
        String s1 = null;
        Object obj5 = null;
        String s = null;
        Object obj7 = null;
        int i1 = 0;
        byte byte0 = 0;
        com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Handlers handlers = mHandlers;
        Object obj4 = null;
        Object obj11 = null;
        int j1 = ((flag) ? 1 : 0);
        long l3 = l2;
        Object obj;
        if ((767L & l2) != 0L)
        {
            obj = obj11;
            if ((515L & l2) != 0L)
            {
                if (binder != null)
                {
                    obj1 = binder.awayAbbr;
                }
                updateRegistration(1, ((android.databinding.Observable) (obj1)));
                obj = obj11;
                if (obj1 != null)
                {
                    obj = (String)((ObservableField) (obj1)).get();
                }
            }
            obj1 = obj10;
            if ((517L & l2) != 0L)
            {
                if (binder != null)
                {
                    observablefield = binder.homeFormation;
                }
                updateRegistration(2, observablefield);
                obj1 = obj10;
                if (observablefield != null)
                {
                    obj1 = (String)observablefield.get();
                }
            }
            int i = ((flag1) ? 1 : 0);
            if ((521L & l2) != 0L)
            {
                ObservableInt observableint = obj9;
                if (binder != null)
                {
                    observableint = binder.homeColor;
                }
                updateRegistration(3, observableint);
                i = ((flag1) ? 1 : 0);
                if (observableint != null)
                {
                    i = observableint.get();
                }
            }
            long l1 = l2;
            if ((529L & l2) != 0L)
            {
                Object obj2 = obj8;
                if (binder != null)
                {
                    obj2 = binder.isHomeTeam;
                }
                updateRegistration(4, ((android.databinding.Observable) (obj2)));
                flag2 = flag6;
                if (obj2 != null)
                {
                    flag2 = ((ObservableBoolean) (obj2)).get();
                }
                if (flag2)
                {
                    l1 = l2 | 8192L | 32768L;
                } else
                {
                    l1 = l2 | 4096L | 16384L;
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
                    l1 = l1 | 2048L | 0x20000L;
                } else
                {
                    l1 = l1 | 1024L | 0x10000L;
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
            obj2 = obj7;
            if ((545L & l1) != 0L)
            {
                if (binder != null)
                {
                    obj3 = binder.homeAbbr;
                }
                updateRegistration(5, ((android.databinding.Observable) (obj3)));
                obj2 = obj7;
                if (obj3 != null)
                {
                    obj2 = (String)((ObservableField) (obj3)).get();
                }
            }
            obj3 = obj5;
            if ((577L & l1) != 0L)
            {
                obj4 = obj6;
                if (binder != null)
                {
                    obj4 = binder.awayFormation;
                }
                updateRegistration(6, ((android.databinding.Observable) (obj4)));
                obj3 = obj5;
                if (obj4 != null)
                {
                    obj3 = (String)((ObservableField) (obj4)).get();
                }
            }
            j = byte1;
            k = byte2;
            l = byte3;
            i1 = byte0;
            obj4 = obj;
            j1 = ((flag) ? 1 : 0);
            s1 = ((String) (obj3));
            l3 = l1;
            s = ((String) (obj2));
            k1 = i;
            s2 = ((String) (obj1));
            flag4 = flag2;
            flag5 = flag3;
            if ((641L & l1) != 0L)
            {
                if (binder != null)
                {
                    observableint1 = binder.awayColor;
                }
                updateRegistration(7, observableint1);
                j = byte1;
                k = byte2;
                l = byte3;
                i1 = byte0;
                obj4 = obj;
                j1 = ((flag) ? 1 : 0);
                s1 = ((String) (obj3));
                l3 = l1;
                s = ((String) (obj2));
                k1 = i;
                s2 = ((String) (obj1));
                flag4 = flag2;
                flag5 = flag3;
                if (observableint1 != null)
                {
                    j1 = observableint1.get();
                    flag5 = flag3;
                    flag4 = flag2;
                    s2 = ((String) (obj1));
                    k1 = i;
                    s = ((String) (obj2));
                    l3 = l1;
                    s1 = ((String) (obj3));
                    obj4 = obj;
                    i1 = byte0;
                    l = byte3;
                    k = byte2;
                    j = byte1;
                }
            }
        }
        if ((768L & l3) == 0L);
        if ((641L & l3) != 0L)
        {
            if (getBuildSdkInt() >= 16)
            {
                awayFormation.setBackground(Converters.convertColorToDrawable(j1));
            }
            if (getBuildSdkInt() >= 16)
            {
                mboundView10.setBackground(Converters.convertColorToDrawable(j1));
            }
        }
        if ((529L & l3) != 0L)
        {
            awayPlayers.setVisibility(l);
        }
        if ((521L & l3) != 0L)
        {
            if (getBuildSdkInt() >= 16)
            {
                homeFormation.setBackground(Converters.convertColorToDrawable(k1));
            }
            if (getBuildSdkInt() >= 16)
            {
                mboundView8.setBackground(Converters.convertColorToDrawable(k1));
            }
        }
        if ((529L & l3) != 0L)
        {
            homePlayers.setVisibility(j);
        }
        if ((529L & l3) != 0L)
        {
            mboundView1.setVisibility(k);
            mboundView8.setVisibility(k);
        }
        if ((529L & l3) != 0L)
        {
            mboundView10.setVisibility(i1);
            mboundView4.setVisibility(i1);
        }
        if ((517L & l3) != 0L)
        {
            PlayerCardsView.bindFormation(mboundView3, s2);
        }
        if ((577L & l3) != 0L)
        {
            PlayerCardsView.bindFormation(mboundView6, s1);
        }
        if ((768L & l3) != 0L)
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
        if ((545L & l3) != 0L)
        {
            mboundView7.setText(s);
        }
        if ((529L & l3) != 0L)
        {
            BindingUtils.setSelected(mboundView7, flag4);
        }
        if ((768L & l3) != 0L)
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
        if ((515L & l3) != 0L)
        {
            mboundView9.setText(((CharSequence) (obj4)));
        }
        if ((529L & l3) != 0L)
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
        mDirtyFlags = 512L;
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
            return onChangeHomeFormationViewModel((ObservableField)obj, j);

        case 3: // '\003'
            return onChangeHomeColorViewModel((ObservableInt)obj, j);

        case 4: // '\004'
            return onChangeIsHomeTeamViewModel((ObservableBoolean)obj, j);

        case 5: // '\005'
            return onChangeHomeAbbrViewModel((ObservableField)obj, j);

        case 6: // '\006'
            return onChangeAwayFormationViewModel((ObservableField)obj, j);

        case 7: // '\007'
            return onChangeAwayColorViewModel((ObservableInt)obj, j);
        }
    }

    public void setHandlers(com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Handlers handlers)
    {
        mHandlers = handlers;
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 256L;
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
