// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.views.BadgeView;
import com.tinder.views.RoundImageView;

// Referenced classes of package com.tinder.adapters:
//            x

static final class ewById extends android.support.v7.widget.clerView.ViewHolder
{

    View a;
    RoundImageView b;
    ImageView c;
    ImageView d;
    TextView e;
    TextView f;
    ImageView g;
    BadgeView h;

    public ew(View view)
    {
        super(view);
        a = view;
        d = (ImageView)view.findViewById(0x7f0e01fc);
        b = (RoundImageView)view.findViewById(0x7f0e01ec);
        c = (ImageView)view.findViewById(0x7f0e01ed);
        e = (TextView)view.findViewById(0x7f0e01f3);
        f = (TextView)view.findViewById(0x7f0e01f7);
        g = (ImageView)view.findViewById(0x7f0e01f8);
        h = (BadgeView)view.findViewById(0x7f0e01f6);
    }
}
