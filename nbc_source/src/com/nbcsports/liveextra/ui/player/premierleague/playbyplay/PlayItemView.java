// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.playbyplay;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.nbcsports.liveextra.databinding.pl.PlayItemBinding;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueComponent;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.playbyplay:
//            PlayItemPresenter, PlayViewModel

public class PlayItemView extends FrameLayout
{
    public static class Binder extends BaseObservable
    {

        public ObservableField detail;
        public ObservableBoolean isSeekEnabled;
        public ObservableBoolean playButtonVisible;
        public ObservableField time;

        public Binder()
        {
            time = new ObservableField();
            detail = new ObservableField();
            isSeekEnabled = new ObservableBoolean();
            playButtonVisible = new ObservableBoolean();
        }
    }

    public static class Handler
        implements android.view.View.OnClickListener
    {

        private final PlayItemPresenter presenter;

        public void onClick(View view)
        {
            presenter.seek();
        }

        public Handler(PlayItemPresenter playitempresenter)
        {
            presenter = playitempresenter;
        }
    }


    private PlayItemBinding binding;
    PlayItemPresenter presenter;

    public PlayItemView(Context context)
    {
        this(context, null);
    }

    public PlayItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlayItemView(Context context, AttributeSet attributeset, int i)
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

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        binding = (PlayItemBinding)DataBindingUtil.getBinding(this);
        if (binding == null)
        {
            binding = (PlayItemBinding)DataBindingUtil.bind(this);
        }
        Binder binder = new Binder();
        Handler handler = new Handler(presenter);
        binding.setBinder(binder);
        binding.setHandler(handler);
        presenter.takeView(binder);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        presenter.release();
        binding.unbind();
    }

    public void setPlayItem(PlayViewModel playviewmodel)
    {
        if (presenter == null)
        {
            return;
        } else
        {
            presenter.setViewModel(playviewmodel);
            return;
        }
    }
}
