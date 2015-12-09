// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.base.view.ViewHolder;
import com.google.android.apps.wallet.util.view.Views;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerFragment

static final class divider
    implements ViewHolder
{

    final View divider;
    final ImageView iconView;
    final TextView titleView;
    final TextView valueView;
    private final View view;

    public final View getView()
    {
        return view;
    }

    (View view1)
    {
        view = view1;
        titleView = (TextView)Views.findViewById(view1, com.google.android.apps.walletnfcrel.der.titleView);
        valueView = (TextView)Views.findViewById(view1, com.google.android.apps.walletnfcrel.der.valueView);
        iconView = (ImageView)Views.findViewById(view1, com.google.android.apps.walletnfcrel.der.iconView);
        divider = Views.findViewById(view1, com.google.android.apps.walletnfcrel.der.divider);
    }
}
