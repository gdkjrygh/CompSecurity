// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.view.View;
import com.soundcloud.android.presentation.PlayableItem;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamItemEngagementsPresenter

class val.playable
    implements ntClickListener
{

    final StreamItemEngagementsPresenter this$0;
    final PlayableItem val$playable;

    public void onLikeClick(View view)
    {
        StreamItemEngagementsPresenter.access$000(StreamItemEngagementsPresenter.this, view, val$playable);
    }

    public void onRepostClick(View view)
    {
        StreamItemEngagementsPresenter.access$100(StreamItemEngagementsPresenter.this, view, val$playable);
    }

    ntClickListener()
    {
        this$0 = final_streamitemengagementspresenter;
        val$playable = PlayableItem.this;
        super();
    }
}
