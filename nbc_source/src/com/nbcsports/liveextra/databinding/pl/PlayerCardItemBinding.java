// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.databinding.pl;

import air.com.nbcuni.com.nbcsports.liveextra.databinding.PlPlayerItemInGameBinding;
import air.com.nbcuni.com.nbcsports.liveextra.databinding.PlPlayerItemInGameGkBinding;
import air.com.nbcuni.com.nbcsports.liveextra.databinding.PlPlayerItemSeasonBinding;
import air.com.nbcuni.com.nbcsports.liveextra.databinding.PlPlayerItemSeasonGkBinding;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.databinding.ViewDataBinding;
import android.support.design.widget.TabLayout;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.nbcsports.liveextra.ui.core.BindingUtils;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerBoxScoreViewModel;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerSeasonStatsViewModel;
import org.joda.time.DateTime;

public class PlayerCardItemBinding extends ViewDataBinding
{

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView.Binder mBinder;
    private long mDirtyFlags;
    private final PlayerItemView mboundView0;
    private final PlPlayerItemInGameBinding mboundView14;
    private final PlPlayerItemInGameGkBinding mboundView141;
    private final PlPlayerItemSeasonBinding mboundView15;
    private final PlPlayerItemSeasonGkBinding mboundView151;
    public final ImageView plBackdrop;
    public final LinearLayout plPlayerBio;
    public final TextView plPlayerBirth;
    public final TextView plPlayerCountry;
    public final TextView plPlayerFirstName;
    public final TextView plPlayerHeight;
    public final FrameLayout plPlayerInGame;
    public final TextView plPlayerLastName;
    public final TextView plPlayerNumber;
    public final TextView plPlayerPosition;
    public final FrameLayout plPlayerSeason;
    public final TextView plPlayerWeight;
    public final ImageView plRedCard;
    public final TabLayout plStatsTabs;
    public final ImageView plYellowCard;
    public final RelativeLayout playerInfo;
    public final ImageView playerPic;

    public PlayerCardItemBinding(View view)
    {
        super(view, 17);
        mDirtyFlags = -1L;
        Object aobj[] = mapBindings(view, 22, sIncludes, sViewsWithIds);
        mboundView0 = (PlayerItemView)aobj[0];
        mboundView0.setTag(null);
        mboundView14 = (PlPlayerItemInGameBinding)aobj[16];
        mboundView141 = (PlPlayerItemInGameGkBinding)aobj[17];
        mboundView15 = (PlPlayerItemSeasonBinding)aobj[18];
        mboundView151 = (PlPlayerItemSeasonGkBinding)aobj[19];
        plBackdrop = (ImageView)aobj[1];
        plBackdrop.setTag(null);
        plPlayerBio = (LinearLayout)aobj[20];
        plPlayerBirth = (TextView)aobj[5];
        plPlayerBirth.setTag(null);
        plPlayerCountry = (TextView)aobj[6];
        plPlayerCountry.setTag(null);
        plPlayerFirstName = (TextView)aobj[10];
        plPlayerFirstName.setTag(null);
        plPlayerHeight = (TextView)aobj[3];
        plPlayerHeight.setTag(null);
        plPlayerInGame = (FrameLayout)aobj[14];
        plPlayerInGame.setTag(null);
        plPlayerLastName = (TextView)aobj[11];
        plPlayerLastName.setTag(null);
        plPlayerNumber = (TextView)aobj[7];
        plPlayerNumber.setTag(null);
        plPlayerPosition = (TextView)aobj[12];
        plPlayerPosition.setTag(null);
        plPlayerSeason = (FrameLayout)aobj[15];
        plPlayerSeason.setTag(null);
        plPlayerWeight = (TextView)aobj[4];
        plPlayerWeight.setTag(null);
        plRedCard = (ImageView)aobj[9];
        plRedCard.setTag(null);
        plStatsTabs = (TabLayout)aobj[13];
        plStatsTabs.setTag(null);
        plYellowCard = (ImageView)aobj[8];
        plYellowCard.setTag(null);
        playerInfo = (RelativeLayout)aobj[21];
        playerPic = (ImageView)aobj[2];
        playerPic.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public static PlayerCardItemBinding bind(View view)
    {
        if (!"layout/pl_player_item_view_0".equals(view.getTag()))
        {
            throw new RuntimeException((new StringBuilder()).append("view tag isn't correct on view:").append(view.getTag()).toString());
        } else
        {
            return new PlayerCardItemBinding(view);
        }
    }

    public static PlayerCardItemBinding inflate(LayoutInflater layoutinflater)
    {
        return bind(layoutinflater.inflate(0x7f040084, null, false));
    }

    public static PlayerCardItemBinding inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag)
    {
        return (PlayerCardItemBinding)DataBindingUtil.inflate(layoutinflater, 0x7f040084, viewgroup, flag);
    }

    private void log(String s, long l)
    {
        Log.d("BINDER", (new StringBuilder()).append(s).append(":").append(Long.toHexString(l)).toString());
    }

    private boolean onChangeBinder(com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView.Binder binder, int i)
    {
        i;
        JVM INSTR tableswitch 0 38: default 172
    //                   0 540
    //                   1 172
    //                   2 172
    //                   3 172
    //                   4 172
    //                   5 172
    //                   6 172
    //                   7 289
    //                   8 266
    //                   9 172
    //                   10 335
    //                   11 172
    //                   12 172
    //                   13 220
    //                   14 172
    //                   15 172
    //                   16 172
    //                   17 172
    //                   18 427
    //                   19 172
    //                   20 172
    //                   21 172
    //                   22 312
    //                   23 358
    //                   24 197
    //                   25 381
    //                   26 517
    //                   27 471
    //                   28 172
    //                   29 450
    //                   30 172
    //                   31 172
    //                   32 404
    //                   33 172
    //                   34 174
    //                   35 172
    //                   36 172
    //                   37 243
    //                   38 494;
           goto _L1 _L2 _L1 _L1 _L1 _L1 _L1 _L1 _L3 _L4 _L1 _L5 _L1 _L1 _L6 _L1 _L1 _L1 _L1 _L7 _L1 _L1 _L1 _L8 _L9 _L10 _L11 _L12 _L13 _L1 _L14 _L1 _L1 _L15 _L1 _L16 _L1 _L1 _L17 _L18
_L1:
        return false;
_L16:
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
_L10:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 2048L;
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
        mDirtyFlags = mDirtyFlags | 0x10000L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
_L17:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 32768L;
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
        mDirtyFlags = mDirtyFlags | 128L;
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
        mDirtyFlags = mDirtyFlags | 32L;
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
        mDirtyFlags = mDirtyFlags | 1024L;
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
_L11:
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
_L15:
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
_L7:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 8192L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
_L14:
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
_L13:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 16384L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
_L18:
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 4096L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
_L12:
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
        mDirtyFlags = mDirtyFlags | 256L;
        this;
        JVM INSTR monitorexit ;
        return true;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
    }

    private boolean onChangeCountryBinder(ObservableField observablefield, int i)
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

    private boolean onChangeDateOfBirthBinder(ObservableField observablefield, int i)
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
        observablefield;
        this;
        JVM INSTR monitorexit ;
        throw observablefield;
    }

    private boolean onChangeFirstNameBinder(ObservableField observablefield, int i)
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
        mDirtyFlags = mDirtyFlags | 1024L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observablefield;
        this;
        JVM INSTR monitorexit ;
        throw observablefield;
    }

    private boolean onChangeHeightBinder(ObservableInt observableint, int i)
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
        mDirtyFlags = mDirtyFlags | 0x10000L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observableint;
        this;
        JVM INSTR monitorexit ;
        throw observableint;
    }

    private boolean onChangeIsGoalkeeperBinder(ObservableBoolean observableboolean, int i)
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
        mDirtyFlags = mDirtyFlags | 8192L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observableboolean;
        this;
        JVM INSTR monitorexit ;
        throw observableboolean;
    }

    private boolean onChangeJerseyBinder(ObservableInt observableint, int i)
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
        observableint;
        this;
        JVM INSTR monitorexit ;
        throw observableint;
    }

    private boolean onChangeLastNameBinder(ObservableField observablefield, int i)
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

    private boolean onChangePlayerIdBinder(ObservableInt observableint, int i)
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
        mDirtyFlags = mDirtyFlags | 2048L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observableint;
        this;
        JVM INSTR monitorexit ;
        throw observableint;
    }

    private boolean onChangePositionBinder(ObservableField observablefield, int i)
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

    private boolean onChangeRedCardBinder(ObservableBoolean observableboolean, int i)
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
        observableboolean;
        this;
        JVM INSTR monitorexit ;
        throw observableboolean;
    }

    private boolean onChangeSeasonBinder(ObservableField observablefield, int i)
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
        mDirtyFlags = mDirtyFlags | 16384L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observablefield;
        this;
        JVM INSTR monitorexit ;
        throw observablefield;
    }

    private boolean onChangeStatsBinder(ObservableField observablefield, int i)
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
        observablefield;
        this;
        JVM INSTR monitorexit ;
        throw observablefield;
    }

    private boolean onChangeTeamColorBinder(ObservableInt observableint, int i)
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
        observableint;
        this;
        JVM INSTR monitorexit ;
        throw observableint;
    }

    private boolean onChangeTeamIdBinder(ObservableInt observableint, int i)
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
        observableint;
        this;
        JVM INSTR monitorexit ;
        throw observableint;
    }

    private boolean onChangeWeightBinder(ObservableInt observableint, int i)
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
        mDirtyFlags = mDirtyFlags | 32768L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observableint;
        this;
        JVM INSTR monitorexit ;
        throw observableint;
    }

    private boolean onChangeYellowCardBinder(ObservableBoolean observableboolean, int i)
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
        mDirtyFlags = mDirtyFlags | 4096L;
        this;
        JVM INSTR monitorexit ;
        return true;
        observableboolean;
        this;
        JVM INSTR monitorexit ;
        throw observableboolean;
    }

    protected void executeBindings()
    {
        this;
        JVM INSTR monitorenter ;
        long l4;
        l4 = mDirtyFlags;
        mDirtyFlags = 0L;
        this;
        JVM INSTR monitorexit ;
        int j2 = 0;
        int i1 = 0;
        ObservableField observablefield = null;
        int k2 = 0;
        int l = 0;
        int i3 = 0;
        boolean flag1 = false;
        DateTime datetime = null;
        Object obj18 = null;
        int i2 = 0;
        int j = 0;
        Object obj21 = null;
        Object obj1 = null;
        boolean flag3 = false;
        boolean flag4 = false;
        int j1 = 0;
        byte byte0 = 0;
        int k1 = 0;
        byte byte1 = 0;
        Object obj2 = null;
        Object obj3 = null;
        PlayerSeasonStatsViewModel playerseasonstatsviewmodel = null;
        Object obj8 = null;
        Object obj17 = null;
        String s2 = null;
        Object obj20 = null;
        Object obj16 = null;
        Object obj4 = null;
        String s1 = null;
        Object obj19 = null;
        boolean flag = false;
        com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView.Binder binder = mBinder;
        boolean flag2 = false;
        Object obj14 = null;
        Object obj6 = null;
        Object obj15 = null;
        Object obj5 = null;
        int l2 = 0;
        int k = 0;
        Object obj12 = null;
        String s = null;
        Object obj13 = null;
        Object obj11 = null;
        Object obj10 = null;
        Object obj9 = null;
        PlayerBoxScoreViewModel playerboxscoreviewmodel1 = null;
        Object obj22 = null;
        boolean flag5 = false;
        Object obj7 = null;
        ObservableInt observableint = null;
        long l3 = l4;
        int l1 = ((flag) ? 1 : 0);
        if ((0x5ffffL & l4) != 0L)
        {
            PlayerBoxScoreViewModel playerboxscoreviewmodel = obj22;
            if ((0x40101L & l4) != 0L)
            {
                if (binder != null)
                {
                    observablefield = binder.stats;
                }
                updateRegistration(0, observablefield);
                playerboxscoreviewmodel = obj22;
                if (observablefield != null)
                {
                    playerboxscoreviewmodel = (PlayerBoxScoreViewModel)observablefield.get();
                }
            }
            l3 = l4;
            if ((0x40102L & l4) != 0L)
            {
                Object obj = obj21;
                if (binder != null)
                {
                    obj = binder.redCard;
                }
                updateRegistration(1, ((android.databinding.Observable) (obj)));
                if (obj != null)
                {
                    flag2 = ((ObservableBoolean) (obj)).get();
                }
                Exception exception;
                int i;
                if (flag2)
                {
                    l3 = l4 | 0x100000L;
                } else
                {
                    l3 = l4 | 0x80000L;
                }
                if (flag2)
                {
                    byte0 = 0;
                } else
                {
                    byte0 = 4;
                }
            }
            obj = obj20;
            if ((0x40104L & l3) != 0L)
            {
                if (binder != null)
                {
                    obj1 = binder.position;
                }
                updateRegistration(2, ((android.databinding.Observable) (obj1)));
                obj = obj20;
                if (obj1 != null)
                {
                    obj = (String)((ObservableField) (obj1)).get();
                }
            }
            obj1 = obj19;
            if ((0x40108L & l3) != 0L)
            {
                if (binder != null)
                {
                    obj2 = binder.lastName;
                }
                updateRegistration(3, ((android.databinding.Observable) (obj2)));
                obj1 = obj19;
                if (obj2 != null)
                {
                    obj1 = (String)((ObservableField) (obj2)).get();
                }
            }
            obj2 = obj18;
            if ((0x40110L & l3) != 0L)
            {
                if (binder != null)
                {
                    obj3 = binder.dateOfBirth;
                }
                updateRegistration(4, ((android.databinding.Observable) (obj3)));
                obj2 = obj18;
                if (obj3 != null)
                {
                    obj2 = (DateTime)((ObservableField) (obj3)).get();
                }
            }
            i = j;
            if ((0x40120L & l3) != 0L)
            {
                obj3 = obj17;
                if (binder != null)
                {
                    obj3 = binder.jersey;
                }
                updateRegistration(5, ((android.databinding.Observable) (obj3)));
                i = j;
                if (obj3 != null)
                {
                    i = ((ObservableInt) (obj3)).get();
                }
            }
            j = k;
            if ((0x40140L & l3) != 0L)
            {
                obj3 = obj16;
                if (binder != null)
                {
                    obj3 = binder.teamId;
                }
                updateRegistration(6, ((android.databinding.Observable) (obj3)));
                j = k;
                if (obj3 != null)
                {
                    j = ((ObservableInt) (obj3)).get();
                }
            }
            obj3 = obj15;
            if ((0x40180L & l3) != 0L)
            {
                if (binder != null)
                {
                    obj4 = binder.country;
                }
                updateRegistration(7, ((android.databinding.Observable) (obj4)));
                obj3 = obj15;
                if (obj4 != null)
                {
                    obj3 = (String)((ObservableField) (obj4)).get();
                }
            }
            k = l;
            if ((0x40300L & l3) != 0L)
            {
                obj4 = obj14;
                if (binder != null)
                {
                    obj4 = binder.teamColor;
                }
                updateRegistration(9, ((android.databinding.Observable) (obj4)));
                k = l;
                if (obj4 != null)
                {
                    k = ((ObservableInt) (obj4)).get();
                }
            }
            obj4 = obj13;
            if ((0x40500L & l3) != 0L)
            {
                if (binder != null)
                {
                    obj5 = binder.firstName;
                }
                updateRegistration(10, ((android.databinding.Observable) (obj5)));
                obj4 = obj13;
                if (obj5 != null)
                {
                    obj4 = (String)((ObservableField) (obj5)).get();
                }
            }
            l = i1;
            if ((0x40900L & l3) != 0L)
            {
                obj5 = obj12;
                if (binder != null)
                {
                    obj5 = binder.playerId;
                }
                updateRegistration(11, ((android.databinding.Observable) (obj5)));
                l = i1;
                if (obj5 != null)
                {
                    l = ((ObservableInt) (obj5)).get();
                }
            }
            l4 = l3;
            if ((0x41100L & l3) != 0L)
            {
                obj5 = obj11;
                if (binder != null)
                {
                    obj5 = binder.yellowCard;
                }
                updateRegistration(12, ((android.databinding.Observable) (obj5)));
                flag2 = flag5;
                if (obj5 != null)
                {
                    flag2 = ((ObservableBoolean) (obj5)).get();
                }
                if (flag2)
                {
                    l4 = l3 | 0x400000L;
                } else
                {
                    l4 = l3 | 0x200000L;
                }
                if (flag2)
                {
                    byte1 = 0;
                } else
                {
                    byte1 = 4;
                }
            }
            flag2 = flag4;
            if ((0x42100L & l4) != 0L)
            {
                obj5 = obj10;
                if (binder != null)
                {
                    obj5 = binder.isGoalkeeper;
                }
                updateRegistration(13, ((android.databinding.Observable) (obj5)));
                flag2 = flag4;
                if (obj5 != null)
                {
                    flag2 = ((ObservableBoolean) (obj5)).get();
                }
            }
            obj5 = obj8;
            if ((0x44100L & l4) != 0L)
            {
                obj6 = obj9;
                if (binder != null)
                {
                    obj6 = binder.season;
                }
                updateRegistration(14, ((android.databinding.Observable) (obj6)));
                obj5 = obj8;
                if (obj6 != null)
                {
                    obj5 = (PlayerSeasonStatsViewModel)((ObservableField) (obj6)).get();
                }
            }
            i1 = ((flag1) ? 1 : 0);
            if ((0x48100L & l4) != 0L)
            {
                obj6 = obj7;
                if (binder != null)
                {
                    obj6 = binder.weight;
                }
                updateRegistration(15, ((android.databinding.Observable) (obj6)));
                i1 = ((flag1) ? 1 : 0);
                if (obj6 != null)
                {
                    i1 = ((ObservableInt) (obj6)).get();
                }
            }
            j1 = byte0;
            k1 = byte1;
            obj6 = obj3;
            datetime = ((DateTime) (obj2));
            l3 = l4;
            s = ((String) (obj4));
            l1 = ((flag) ? 1 : 0);
            flag3 = flag2;
            i2 = i;
            s1 = ((String) (obj1));
            j2 = l;
            s2 = ((String) (obj));
            playerseasonstatsviewmodel = ((PlayerSeasonStatsViewModel) (obj5));
            playerboxscoreviewmodel1 = playerboxscoreviewmodel;
            k2 = k;
            l2 = j;
            i3 = i1;
            if ((0x50100L & l4) != 0L)
            {
                if (binder != null)
                {
                    observableint = binder.height;
                }
                updateRegistration(16, observableint);
                j1 = byte0;
                k1 = byte1;
                obj6 = obj3;
                datetime = ((DateTime) (obj2));
                l3 = l4;
                s = ((String) (obj4));
                l1 = ((flag) ? 1 : 0);
                flag3 = flag2;
                i2 = i;
                s1 = ((String) (obj1));
                j2 = l;
                s2 = ((String) (obj));
                playerseasonstatsviewmodel = ((PlayerSeasonStatsViewModel) (obj5));
                playerboxscoreviewmodel1 = playerboxscoreviewmodel;
                k2 = k;
                l2 = j;
                i3 = i1;
                if (observableint != null)
                {
                    l1 = observableint.get();
                    i3 = i1;
                    l2 = j;
                    k2 = k;
                    playerboxscoreviewmodel1 = playerboxscoreviewmodel;
                    playerseasonstatsviewmodel = ((PlayerSeasonStatsViewModel) (obj5));
                    s2 = ((String) (obj));
                    j2 = l;
                    s1 = ((String) (obj1));
                    i2 = i;
                    flag3 = flag2;
                    s = ((String) (obj4));
                    l3 = l4;
                    datetime = ((DateTime) (obj2));
                    obj6 = obj3;
                    k1 = byte1;
                    j1 = byte0;
                }
            }
        }
        if ((0x42100L & l3) != 0L)
        {
            mboundView14.setIsGoalkeeper(flag3);
            mboundView141.setIsGoalkeeper(flag3);
            mboundView15.setIsGoalkeeper(flag3);
            mboundView151.setIsGoalkeeper(flag3);
        }
        if ((0x40101L & l3) != 0L)
        {
            mboundView14.setStats(playerboxscoreviewmodel1);
            mboundView141.setStats(playerboxscoreviewmodel1);
        }
        if ((0x44100L & l3) != 0L)
        {
            mboundView15.setSeason(playerseasonstatsviewmodel);
            mboundView151.setSeason(playerseasonstatsviewmodel);
        }
        if ((0x40140L & l3) != 0L)
        {
            com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView.BindingAdapters.setTeamBackdrop(plBackdrop, l2);
        }
        if ((0x40110L & l3) != 0L)
        {
            com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView.BindingAdapters.setDob(plPlayerBirth, datetime);
        }
        if ((0x40180L & l3) != 0L)
        {
            plPlayerCountry.setText(((CharSequence) (obj6)));
        }
        if ((0x40500L & l3) != 0L)
        {
            plPlayerFirstName.setText(s);
        }
        if ((0x50100L & l3) != 0L)
        {
            com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView.BindingAdapters.setHeight(plPlayerHeight, Integer.valueOf(l1));
        }
        if ((0x40108L & l3) != 0L)
        {
            plPlayerLastName.setText(s1);
        }
        if ((0x40120L & l3) != 0L)
        {
            BindingUtils.setNumber(plPlayerNumber, Integer.valueOf(i2));
        }
        if ((0x40104L & l3) != 0L)
        {
            plPlayerPosition.setText(s2);
        }
        if ((0x48100L & l3) != 0L)
        {
            com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView.BindingAdapters.setWeight(plPlayerWeight, Integer.valueOf(i3));
        }
        if ((0x40102L & l3) != 0L)
        {
            plRedCard.setVisibility(j1);
        }
        if ((0x40300L & l3) != 0L)
        {
            BindingUtils.setTabIndicatorColor(plStatsTabs, k2);
        }
        if ((0x41100L & l3) != 0L)
        {
            plYellowCard.setVisibility(k1);
        }
        if ((0x40900L & l3) != 0L)
        {
            com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView.BindingAdapters.setPlayerPic(playerPic, j2);
        }
        mboundView14.executePendingBindings();
        mboundView141.executePendingBindings();
        mboundView15.executePendingBindings();
        mboundView151.executePendingBindings();
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView.Binder getBinder()
    {
        return mBinder;
    }

    public com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView.Handler getHandler()
    {
        return null;
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
        Exception exception;
        return mboundView14.hasPendingBindings() || mboundView141.hasPendingBindings() || mboundView15.hasPendingBindings() || mboundView151.hasPendingBindings();
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void invalidateAll()
    {
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = 0x40000L;
        this;
        JVM INSTR monitorexit ;
        mboundView14.invalidateAll();
        mboundView141.invalidateAll();
        mboundView15.invalidateAll();
        mboundView151.invalidateAll();
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
            return onChangeStatsBinder((ObservableField)obj, j);

        case 1: // '\001'
            return onChangeRedCardBinder((ObservableBoolean)obj, j);

        case 2: // '\002'
            return onChangePositionBinder((ObservableField)obj, j);

        case 3: // '\003'
            return onChangeLastNameBinder((ObservableField)obj, j);

        case 4: // '\004'
            return onChangeDateOfBirthBinder((ObservableField)obj, j);

        case 5: // '\005'
            return onChangeJerseyBinder((ObservableInt)obj, j);

        case 6: // '\006'
            return onChangeTeamIdBinder((ObservableInt)obj, j);

        case 7: // '\007'
            return onChangeCountryBinder((ObservableField)obj, j);

        case 8: // '\b'
            return onChangeBinder((com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView.Binder)obj, j);

        case 9: // '\t'
            return onChangeTeamColorBinder((ObservableInt)obj, j);

        case 10: // '\n'
            return onChangeFirstNameBinder((ObservableField)obj, j);

        case 11: // '\013'
            return onChangePlayerIdBinder((ObservableInt)obj, j);

        case 12: // '\f'
            return onChangeYellowCardBinder((ObservableBoolean)obj, j);

        case 13: // '\r'
            return onChangeIsGoalkeeperBinder((ObservableBoolean)obj, j);

        case 14: // '\016'
            return onChangeSeasonBinder((ObservableField)obj, j);

        case 15: // '\017'
            return onChangeWeightBinder((ObservableInt)obj, j);

        case 16: // '\020'
            return onChangeHeightBinder((ObservableInt)obj, j);
        }
    }

    public void setBinder(com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView.Binder binder)
    {
        updateRegistration(8, binder);
        mBinder = binder;
        this;
        JVM INSTR monitorenter ;
        mDirtyFlags = mDirtyFlags | 256L;
        this;
        JVM INSTR monitorexit ;
        super.requestRebind();
        return;
        binder;
        this;
        JVM INSTR monitorexit ;
        throw binder;
    }

    public void setHandler(com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView.Handler handler)
    {
    }

    public boolean setVariable(int i, Object obj)
    {
        switch (i)
        {
        default:
            return false;

        case 6: // '\006'
            setBinder((com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView.Binder)obj);
            break;
        }
        return true;
    }

    static 
    {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(22);
        sIncludes.setIncludes(15, new String[] {
            "pl_player_item_season", "pl_player_item_season_gk"
        }, new int[] {
            18, 19
        }, new int[] {
            0x7f040082, 0x7f040083
        });
        sIncludes.setIncludes(14, new String[] {
            "pl_player_item_in_game", "pl_player_item_in_game_gk"
        }, new int[] {
            16, 17
        }, new int[] {
            0x7f040080, 0x7f040081
        });
        sViewsWithIds = new SparseIntArray();
        sViewsWithIds.put(0x7f0f017e, 20);
        sViewsWithIds.put(0x7f0f0183, 21);
    }
}
