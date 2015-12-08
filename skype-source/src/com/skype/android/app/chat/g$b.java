// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.b;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.BubbleRelativeLayout;
import com.skype.android.widget.bubbles.BubbleTextView;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.app.chat:
//            f, g

private final class View.a extends f
{

    TextView addressView;
    b googleMap;
    BubbleRelativeLayout locationBubble;
    MapView mapView;
    ImageView pinView;
    BubbleTextView removedTextView;
    Future staticMapFuture;
    View staticMapOverlay;
    SymbolView staticMapPlaceholder;
    final g this$0;

    public View(View view)
    {
        this$0 = g.this;
        super(view);
        removedTextView = (BubbleTextView)ViewUtil.a(view, 0x7f1002b6);
        locationBubble = (BubbleRelativeLayout)ViewUtil.a(getInlineContent(), 0x7f100291);
        staticMapOverlay = ViewUtil.a(getInlineContent(), 0x7f100294);
        addressView = (TextView)ViewUtil.a(getInlineContent(), 0x7f100290);
        staticMapPlaceholder = (SymbolView)ViewUtil.a(getInlineContent(), 0x7f100297);
        pinView = (ImageView)ViewUtil.a(getInlineContent(), 0x7f100296);
        mapView = (MapView)ViewUtil.a(getInlineContent(), 0x7f100293);
        mapView.a();
    }
}
