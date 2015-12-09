// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.matches;

import android.database.CharArrayBuffer;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.games.ui.GamesBaseAdapter;
import com.google.android.gms.games.ui.GamesViewHolder;

// Referenced classes of package com.google.android.gms.games.ui.client.matches:
//            RealTimeWaitingRoomActivity

private final class mStatusView extends GamesViewHolder
{

    final LoadingImageView mPlayerImageView;
    final TextView mPlayerNameMeView;
    final TextView mPlayerNameView;
    final CharArrayBuffer mPlayerNameViewBuffer = new CharArrayBuffer(64);
    final TextView mStatusView;
    final mStatusView this$0;

    public (GamesBaseAdapter gamesbaseadapter, View view)
    {
        this$0 = this._cls0.this;
        super(gamesbaseadapter);
        mPlayerImageView = (LoadingImageView)view.findViewById(0x7f0d01d4);
        mPlayerNameMeView = (TextView)view.findViewById(0x7f0d02c5);
        mPlayerNameView = (TextView)view.findViewById(0x7f0d01d5);
        mStatusView = (TextView)view.findViewById(0x7f0d02c6);
    }
}
