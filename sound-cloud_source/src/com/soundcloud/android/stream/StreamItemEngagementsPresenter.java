// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.view.View;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.associations.RepostOperations;
import com.soundcloud.android.likes.LikeOperations;
import com.soundcloud.android.likes.LikeToggleSubscriber;
import com.soundcloud.android.playlists.RepostResultSubscriber;
import com.soundcloud.android.presentation.PlayableItem;
import com.soundcloud.android.util.CondensedNumberFormatter;
import rx.a.b.a;
import rx.b;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamItemViewHolder

class StreamItemEngagementsPresenter
{

    private final AccountOperations accountOperations;
    private final LikeOperations likeOperations;
    private final CondensedNumberFormatter numberFormatter;
    private final RepostOperations repostOperations;

    StreamItemEngagementsPresenter(CondensedNumberFormatter condensednumberformatter, LikeOperations likeoperations, RepostOperations repostoperations, AccountOperations accountoperations)
    {
        numberFormatter = condensednumberformatter;
        likeOperations = likeoperations;
        repostOperations = repostoperations;
        accountOperations = accountoperations;
    }

    private String getCountString(int i)
    {
        if (i > 0)
        {
            return numberFormatter.format(i);
        } else
        {
            return "";
        }
    }

    private void handleLike(View view, PlayableItem playableitem)
    {
        com.soundcloud.android.model.Urn urn = playableitem.getEntityUrn();
        boolean flag;
        if (!playableitem.isLiked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        likeOperations.toggleLike(urn, flag).observeOn(a.a()).subscribe(new LikeToggleSubscriber(view.getContext(), flag));
    }

    private void handleRepost(View view, PlayableItem playableitem)
    {
        com.soundcloud.android.model.Urn urn = playableitem.getEntityUrn();
        boolean flag;
        if (!playableitem.isReposted())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        repostOperations.toggleRepost(urn, flag).observeOn(a.a()).subscribe(new RepostResultSubscriber(view.getContext(), flag));
    }

    private void showRepostStats(StreamItemViewHolder streamitemviewholder, PlayableItem playableitem)
    {
        if (!accountOperations.isLoggedInUser(playableitem.getCreatorUrn()))
        {
            streamitemviewholder.showRepostStats(getCountString(playableitem.getRepostCount()), playableitem.isReposted());
        }
    }

    void bind(StreamItemViewHolder streamitemviewholder, final PlayableItem playable)
    {
        streamitemviewholder.resetAdditionalInformation();
        streamitemviewholder.showLikeStats(getCountString(playable.getLikesCount()), playable.isLiked());
        showRepostStats(streamitemviewholder, playable);
        streamitemviewholder.setEngagementClickListener(new _cls1());
    }



    private class _cls1
        implements StreamItemViewHolder.CardEngagementClickListener
    {

        final StreamItemEngagementsPresenter this$0;
        final PlayableItem val$playable;

        public void onLikeClick(View view)
        {
            handleLike(view, playable);
        }

        public void onRepostClick(View view)
        {
            handleRepost(view, playable);
        }

        _cls1()
        {
            this$0 = StreamItemEngagementsPresenter.this;
            playable = playableitem;
            super();
        }
    }

}
