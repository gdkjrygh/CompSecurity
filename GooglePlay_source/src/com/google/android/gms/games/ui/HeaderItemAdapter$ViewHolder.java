// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesViewHolder, HeaderItemAdapter, GamesBaseAdapter

private final class mButtonTextView extends GamesViewHolder
{

    final View mButton;
    final TextView mButtonTextView;
    final View mContentView;
    final TextView mSubtitleTextView;
    final TextView mTitleTextView;
    final HeaderItemAdapter this$0;

    public (GamesBaseAdapter gamesbaseadapter, View view)
    {
        this$0 = HeaderItemAdapter.this;
        super(gamesbaseadapter);
        mContentView = view.findViewById(0x7f0d0123);
        mTitleTextView = (TextView)view.findViewById(0x7f0d02a9);
        mSubtitleTextView = (TextView)view.findViewById(0x7f0d02aa);
        mButton = view.findViewById(0x7f0d02ab);
        mButtonTextView = (TextView)view.findViewById(0x7f0d02ac);
    }
}
