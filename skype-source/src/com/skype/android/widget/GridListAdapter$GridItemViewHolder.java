// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.view.View;
import android.widget.TextView;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.widget:
//            GridListAdapter, SkypeAvatarView, SymbolView

public static abstract class presenceIcon extends com.skype.android.app.data.esenceIcon
{

    public SkypeAvatarView avatar;
    public Future bitmapFuture;
    public TextView displayName;
    public View displayNameContainer;
    public SymbolView presenceIcon;

    public void onViewRecycled()
    {
        super.cycled();
        if (bitmapFuture != null)
        {
            bitmapFuture.cancel(true);
        }
    }

    public A(View view)
    {
        super(view);
        avatar = (SkypeAvatarView)view.findViewById(0x7f100326);
        displayName = (TextView)view.findViewById(0x7f100327);
        displayNameContainer = view.findViewById(0x7f100328);
        presenceIcon = (SymbolView)view.findViewById(0x7f100329);
    }
}
