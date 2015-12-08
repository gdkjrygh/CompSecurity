// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import android.view.View;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.events:
//            EventItemView, EventItemPresenter

public static class presenter
{

    private final EventItemPresenter presenter;

    public void onClick(View view)
    {
        presenter.seek();
    }

    public (EventItemPresenter eventitempresenter)
    {
        presenter = eventitempresenter;
    }
}
