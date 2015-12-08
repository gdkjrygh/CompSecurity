// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.playbyplay;

import android.support.v7.widget.LinearLayoutManager;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.playbyplay:
//            PlayByPlayView, PlayByPlayAdapter

class this._cls0 extends android.support.v7.widget.terDataObserver
{

    final PlayByPlayView this$0;

    public void onChanged()
    {
        super.onChanged();
        while (PlayByPlayView.access$000(PlayByPlayView.this) == null || PlayByPlayView.access$000(PlayByPlayView.this).getItemCount() == 0) 
        {
            return;
        }
        PlayByPlayView.access$100(PlayByPlayView.this).scrollToPosition(0);
    }

    public void onItemRangeInserted(int i, int j)
    {
        super.onItemRangeInserted(i, j);
        while (PlayByPlayView.access$000(PlayByPlayView.this) == null || PlayByPlayView.access$000(PlayByPlayView.this).getItemCount() == 0) 
        {
            return;
        }
        PlayByPlayView.access$100(PlayByPlayView.this).scrollToPosition(0);
    }

    ()
    {
        this$0 = PlayByPlayView.this;
        super();
    }
}
