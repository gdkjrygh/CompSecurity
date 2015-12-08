// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import android.databinding.ObservableBoolean;
import com.nbcsports.liveextra.ui.player.AbstractPresenterListener;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.events:
//            EventItemPresenter

class this._cls0 extends AbstractPresenterListener
{

    final EventItemPresenter this$0;

    public void onAdBreakComplete()
    {
        super.onAdBreakComplete();
        if (!hasBinder())
        {
            return;
        } else
        {
            ((sBinder)EventItemPresenter.access$1000(EventItemPresenter.this)).isSeekEnabled.set(true);
            return;
        }
    }

    public void onAdBreakStart()
    {
        super.onAdBreakStart();
        if (!hasBinder())
        {
            return;
        } else
        {
            ((sBinder)EventItemPresenter.access$900(EventItemPresenter.this)).isSeekEnabled.set(false);
            return;
        }
    }

    public void onPlayComplete()
    {
        super.onPlayComplete();
        if (!hasBinder())
        {
            return;
        } else
        {
            ((sBinder)EventItemPresenter.access$1100(EventItemPresenter.this)).isSeekEnabled.set(false);
            return;
        }
    }

    Q()
    {
        this$0 = EventItemPresenter.this;
        super();
    }
}
