// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.CardView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueComponent;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.events:
//            EventItemPresenter

public class EventItemView extends CardView
{
    public class Binder extends BaseObservable
    {

        public ObservableField firstName;
        public ObservableBoolean isSeekEnabled;
        public ObservableBoolean isStart;
        public ObservableField lastName;
        public ObservableField position;
        public ObservableField teamAbbr;
        public ObservableField teamIcon;
        final EventItemView this$0;
        public ObservableField time;

        public Binder()
        {
            this$0 = EventItemView.this;
            super();
            teamAbbr = new ObservableField();
            teamIcon = new ObservableField();
            time = new ObservableField();
            firstName = new ObservableField();
            lastName = new ObservableField();
            position = new ObservableField();
            isStart = new ObservableBoolean();
            isSeekEnabled = new ObservableBoolean();
        }
    }

    public static class Handlers
    {

        private final EventItemPresenter presenter;

        public void onClick(View view)
        {
            presenter.seek();
        }

        public Handlers(EventItemPresenter eventitempresenter)
        {
            presenter = eventitempresenter;
        }
    }


    private Binder binder;
    private ViewDataBinding binding;
    EventItemPresenter presenter;

    public EventItemView(Context context)
    {
        this(context, null);
    }

    public EventItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EventItemView(Context context, AttributeSet attributeset, int i)
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

    public static void setTeamIcon(ImageView imageview, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            NBCSportsApplication.component().picasso().load(s).into(imageview);
            return;
        }
    }

    public void loadEvent(com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent)
    {
        presenter.setEvent(timelineevent);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        binding = DataBindingUtil.getBinding(this);
        if (binding == null)
        {
            binding = DataBindingUtil.bind(this);
        }
        binder = new Binder();
        binding.setVariable(6, binder);
        binding.setVariable(12, new Handlers(presenter));
        presenter.takeView(binder);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        presenter.release();
        binding.unbind();
    }
}
