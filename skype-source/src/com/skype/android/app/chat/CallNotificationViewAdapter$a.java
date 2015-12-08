// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.android.widget.SymbolView;

// Referenced classes of package com.skype.android.app.chat:
//            j, CallNotificationViewAdapter

private static final class ratingBar extends j
{

    TextView contents;
    RelativeLayout contentsContainer;
    TextView duration;
    SymbolView icon;
    boolean isUpsellCandidate;
    String overrideText;
    RatingBar ratingBar;
    View ratingContainer;
    TextView ratingText;
    boolean shouldHideItem;
    TextView videoMessageUpsell;

    public (View view)
    {
        super(view);
        icon = (SymbolView)view.findViewById(0x7f1002a8);
        contentsContainer = (RelativeLayout)view.findViewById(0x7f1002a9);
        contents = (TextView)view.findViewById(0x7f1002aa);
        duration = (TextView)view.findViewById(0x7f1002ab);
        videoMessageUpsell = (TextView)view.findViewById(0x7f1002ac);
        ratingContainer = view.findViewById(0x7f1002ad);
        ratingText = (TextView)view.findViewById(0x7f1002af);
        ratingBar = (RatingBar)view.findViewById(0x7f1002b0);
    }
}
