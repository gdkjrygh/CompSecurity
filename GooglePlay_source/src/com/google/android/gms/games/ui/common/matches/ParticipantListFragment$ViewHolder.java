// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;

// Referenced classes of package com.google.android.gms.games.ui.common.matches:
//            ParticipantListFragment

private final class mContentView
{

    final MetagameAvatarView mAvatarView;
    final View mContentView;
    final ImageView mInCirclesImageView;
    final TextView mParticipantNameView;
    final ParticipantListFragment this$0;

    public (View view)
    {
        this$0 = ParticipantListFragment.this;
        super();
        mParticipantNameView = (TextView)view.findViewById(0x7f0d022f);
        mAvatarView = (MetagameAvatarView)view.findViewById(0x7f0d01ba);
        mAvatarView.setOutlineStrokeWidth(0);
        mAvatarView.setShadowStrokeWidth(0);
        mInCirclesImageView = (ImageView)view.findViewById(0x7f0d022e);
        mContentView = view;
    }
}
