// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import android.content.Context;
import android.content.res.Resources;
import android.databinding.BaseObservable;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.databinding.pl.PlayerCardBinding;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueComponent;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerCardAdapter, PlayerCardsPresenter

public class PlayerCardsView extends RelativeLayout
{
    public static class Binder extends BaseObservable
    {

        public final ObservableField awayAbbr = new ObservableField();
        public final ObservableInt awayColor = new ObservableInt();
        public final ObservableField awayFormation = new ObservableField();
        public final ObservableArrayList awayPlayers = new ObservableArrayList();
        public final ObservableField homeAbbr = new ObservableField();
        public final ObservableInt homeColor = new ObservableInt();
        public final ObservableField homeFormation = new ObservableField();
        public final ObservableArrayList homePlayers = new ObservableArrayList();
        public final ObservableBoolean isHomeTeam = new ObservableBoolean();

        public Binder()
        {
            isHomeTeam.set(true);
        }
    }

    public static class Handlers
    {

        private final Binder vm;

        public void onAwayClick(View view)
        {
            vm.isHomeTeam.set(false);
        }

        public void onHomeClick(View view)
        {
            vm.isHomeTeam.set(true);
        }

        public Handlers(Binder binder1)
        {
            vm = binder1;
        }
    }


    private Binder binder;
    private PlayerCardBinding binding;
    PlayerCardsPresenter presenter;

    public PlayerCardsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (isInEditMode())
        {
            return;
        } else
        {
            PremierLeagueEngine.component().inject(this);
            return;
        }
    }

    public static void bindFormation(ImageView imageview, String s)
    {
        Picasso picasso = NBCSportsApplication.component().picasso();
        int i = imageview.getResources().getIdentifier((new StringBuilder()).append("pl_formation_").append(s).toString(), "drawable", imageview.getContext().getPackageName());
        if (i == 0)
        {
            picasso.load(0x7f020122).into(imageview);
            return;
        } else
        {
            picasso.load(i).placeholder(0x7f020122).error(0x7f020122).into(imageview);
            return;
        }
    }

    public static void bindFormation(TextView textview, String s)
    {
        if (s == null)
        {
            return;
        } else
        {
            s = s.split("");
            textview.setText(TextUtils.join(" - ", Arrays.copyOfRange(s, 1, s.length)));
            return;
        }
    }

    public static void bindPlayerList(ViewPager viewpager, List list)
    {
        PlayerCardAdapter playercardadapter1 = (PlayerCardAdapter)viewpager.getAdapter();
        PlayerCardAdapter playercardadapter = playercardadapter1;
        if (playercardadapter1 == null)
        {
            playercardadapter = new PlayerCardAdapter(viewpager.getContext());
            viewpager.setAdapter(playercardadapter);
        }
        playercardadapter.update(list);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        presenter.takeView(binder);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        presenter.release();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        }
        binding = (PlayerCardBinding)DataBindingUtil.getBinding(this);
        if (binding == null)
        {
            binding = PlayerCardBinding.bind(this);
        }
        binder = new Binder();
        binding.setViewModel(binder);
        binding.setHandlers(new Handlers(binder));
    }
}
