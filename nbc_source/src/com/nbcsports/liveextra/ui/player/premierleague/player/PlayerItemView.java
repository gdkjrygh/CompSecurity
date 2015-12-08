// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import android.content.Context;
import android.content.res.Resources;
import android.databinding.BaseObservable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.design.widget.TabLayout;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.databinding.pl.PlayerCardItemBinding;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueComponent;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import org.joda.time.DateTime;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerItemPresenter

public class PlayerItemView extends ScrollView
    implements android.support.design.widget.TabLayout.OnTabSelectedListener
{
    public static class Binder extends BaseObservable
    {

        public ObservableField country;
        public ObservableField dateOfBirth;
        public ObservableField firstName;
        public ObservableInt height;
        public ObservableBoolean isGoalkeeper;
        public ObservableInt jersey;
        public ObservableField lastName;
        public ObservableInt playerId;
        public ObservableField position;
        public ObservableBoolean redCard;
        public ObservableField season;
        public ObservableField stats;
        public ObservableInt teamColor;
        public ObservableInt teamId;
        public ObservableInt weight;
        public ObservableBoolean yellowCard;

        public Binder()
        {
            playerId = new ObservableInt();
            height = new ObservableInt();
            weight = new ObservableInt();
            jersey = new ObservableInt();
            firstName = new ObservableField();
            lastName = new ObservableField();
            position = new ObservableField();
            country = new ObservableField();
            dateOfBirth = new ObservableField();
            isGoalkeeper = new ObservableBoolean();
            teamId = new ObservableInt();
            teamColor = new ObservableInt();
            stats = new ObservableField();
            season = new ObservableField();
            yellowCard = new ObservableBoolean();
            redCard = new ObservableBoolean();
        }
    }

    public static class BindingAdapters
    {

        public static void setDob(TextView textview, DateTime datetime)
        {
            if (datetime == null)
            {
                return;
            }
            if (datetime == null)
            {
                datetime = "--";
            } else
            {
                datetime = datetime.toString("dd MMM YYYY");
            }
            textview.setText(datetime);
        }

        public static void setHeight(TextView textview, Integer integer)
        {
            if (integer == null)
            {
                textview.setText("--");
                return;
            } else
            {
                Resources resources = textview.getContext().getResources();
                integer = Double.valueOf((double)integer.intValue() / 100D);
                double d = integer.doubleValue() * 39.370078700000001D;
                textview.setText(resources.getString(0x7f070149, new Object[] {
                    Integer.valueOf((int)(d / 12D)), Integer.valueOf((int)(d % 12D)), integer
                }));
                return;
            }
        }

        public static void setPlayerPic(ImageView imageview, int i)
        {
            if (i == 0)
            {
                return;
            } else
            {
                NBCSportsApplication.component().picasso().load(String.format("http://stream.nbcsports.com/static/img/premier-league/mobile/players2015/%s.png", new Object[] {
                    Integer.valueOf(i)
                })).error(0x7f02012d).into(imageview);
                return;
            }
        }

        public static void setTeamBackdrop(ImageView imageview, int i)
        {
            if (i == 0)
            {
                return;
            } else
            {
                NBCSportsApplication.component().picasso().load(String.format("http://stream.nbcsports.com/static/img/premier-league/mobile/teams2015/%s-bkgd.png", new Object[] {
                    Integer.valueOf(i)
                })).error(0x7f02012d).into(imageview);
                return;
            }
        }

        public static void setWeight(TextView textview, Integer integer)
        {
            if (integer == null)
            {
                textview.setText("--");
                return;
            } else
            {
                textview.setText(textview.getContext().getResources().getString(0x7f07015b, new Object[] {
                    Integer.valueOf((int)((double)integer.intValue() * 2.2046226199999999D)), integer
                }));
                return;
            }
        }

        public BindingAdapters()
        {
        }
    }

    public static class Handler
    {

        public Handler()
        {
        }
    }


    private Binder binder;
    private PlayerCardItemBinding binding;
    private android.support.design.widget.TabLayout.Tab inGameTab;
    PlayerItemPresenter presenter;
    private android.support.design.widget.TabLayout.Tab seasonTab;

    public PlayerItemView(Context context)
    {
        this(context, null);
    }

    public PlayerItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlayerItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (isInEditMode())
        {
            return;
        } else
        {
            PremierLeagueEngine.component().inject(this);
            return;
        }
    }

    private void setBinding()
    {
        binding = PlayerCardItemBinding.bind(this);
        binder = new Binder();
        binding.setBinder(binder);
        binding.setHandler(new Handler());
    }

    private void setupView()
    {
        TabLayout tablayout = binding.plStatsTabs;
        tablayout.setOnTabSelectedListener(this);
        inGameTab = tablayout.newTab().setText(0x7f07014b);
        seasonTab = tablayout.newTab().setText(0x7f070153);
        tablayout.addTab(inGameTab);
        tablayout.addTab(seasonTab);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        setBinding();
        setupView();
        presenter.takeView(binder);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        presenter.release();
        binding.unbind();
    }

    public void onTabReselected(android.support.design.widget.TabLayout.Tab tab)
    {
    }

    public void onTabSelected(android.support.design.widget.TabLayout.Tab tab)
    {
        if (tab.equals(inGameTab))
        {
            binding.plPlayerInGame.setVisibility(0);
        } else
        if (tab.equals(seasonTab))
        {
            binding.plPlayerSeason.setVisibility(0);
            return;
        }
    }

    public void onTabUnselected(android.support.design.widget.TabLayout.Tab tab)
    {
        if (tab.equals(inGameTab))
        {
            binding.plPlayerInGame.setVisibility(8);
        } else
        if (tab.equals(seasonTab))
        {
            binding.plPlayerSeason.setVisibility(8);
            return;
        }
    }

    public void setPlayer(com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo.Player player)
    {
        presenter.setPlayer(player);
    }
}
