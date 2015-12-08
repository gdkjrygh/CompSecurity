// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.view.View;
import android.widget.ImageView;
import com.tinder.views.BadgeView;
import com.tinder.views.CustomTextView;
import com.tinder.views.RoundImageView;

// Referenced classes of package com.tinder.adapters:
//            ab

static final class wById extends android.support.v7.widget.lerView.ViewHolder
{

    android.support.v7.widget.lerView.LayoutParams a;
    int b;
    View c;
    RoundImageView d;
    ImageView e;
    ImageView f;
    BadgeView g;
    CustomTextView h;

    public xtView(View view)
    {
        super(view);
        a = (android.support.v7.widget.lerView.LayoutParams)view.getLayoutParams();
        b = a.rightMargin;
        c = view;
        h = (CustomTextView)view.findViewById(0x7f0e01ea);
        d = (RoundImageView)view.findViewById(0x7f0e01ec);
        e = (ImageView)view.findViewById(0x7f0e01ed);
        f = (ImageView)view.findViewById(0x7f0e01ee);
        g = (BadgeView)view.findViewById(0x7f0e01eb);
    }
}
