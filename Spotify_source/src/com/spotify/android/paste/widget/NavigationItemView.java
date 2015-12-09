// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import dfh;
import dft;
import dfz;
import dgn;
import dgo;

// Referenced classes of package com.spotify.android.paste.widget:
//            NotificationBadgeView

public class NavigationItemView extends FrameLayout
{

    private static final int f[] = {
        0x10100a2
    };
    private TextView a;
    private NotificationBadgeView b;
    private boolean c;
    private int d;
    private dfz e;

    public NavigationItemView(Context context)
    {
        this(context, null);
    }

    public NavigationItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f0101f0);
    }

    public NavigationItemView(Context context, AttributeSet attributeset, int i)
    {
        this(context, attributeset, context.obtainStyledAttributes(attributeset, dfh.aj, i, 0));
    }

    private NavigationItemView(Context context, AttributeSet attributeset, TypedArray typedarray)
    {
        super(context, attributeset);
        dgn.a(com/spotify/android/paste/widget/NavigationItemView, this);
        attributeset = typedarray.getDrawable(dfh.ak);
        int i = typedarray.getDimensionPixelSize(dfh.al, 0);
        int j = typedarray.getDimensionPixelOffset(dfh.ap, 0);
        int k = typedarray.getDimensionPixelSize(dfh.an, 0);
        int l = typedarray.getDimensionPixelSize(dfh.ao, -1);
        android.content.res.ColorStateList colorstatelist = typedarray.getColorStateList(dfh.am);
        int i1 = typedarray.getResourceId(dfh.aq, 0);
        typedarray.recycle();
        dgo.a(this, attributeset);
        setMinimumHeight(i);
        setPadding(j, 0, j, 0);
        inflate(context, 0x7f030106, this);
        a = (TextView)findViewById(0x7f11026e);
        b = (NotificationBadgeView)findViewById(0x7f110476);
        dgo.a(context, a, i1);
        a.setCompoundDrawablePadding(k);
        a.setDuplicateParentStateEnabled(true);
        if (l < 0)
        {
            e = new dfz(context, SpotifyIcon.b);
        } else
        {
            e = new dfz(context, SpotifyIcon.b, l);
        }
        e.a(colorstatelist);
        context = (android.widget.FrameLayout.LayoutParams)b.getLayoutParams();
        context.setMargins(e.getIntrinsicWidth() - dft.b(5F, getResources()), ((android.widget.FrameLayout.LayoutParams) (context)).topMargin + dft.b(5F, getResources()), ((android.widget.FrameLayout.LayoutParams) (context)).rightMargin, e.getIntrinsicHeight() / 2);
    }

    public static NavigationItemView a(Context context)
    {
        return new NavigationItemView(context, null, context.obtainStyledAttributes(null, dfh.aj, 0, 0x7f0b00e5));
    }

    public final void a()
    {
        a(((String) (null)));
        a(((SpotifyIcon) (null)));
        a(false);
        a(0);
    }

    public final void a(int i)
    {
        NotificationBadgeView notificationbadgeview = b;
        String s;
        if (i > notificationbadgeview.a)
        {
            s = (new StringBuilder()).append(Integer.toString(notificationbadgeview.a)).append("+").toString();
        } else
        {
            s = Integer.toString(i);
        }
        notificationbadgeview.setText(s);
        if (i > 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        notificationbadgeview.setVisibility(i);
    }

    public final void a(SpotifyIcon spotifyicon)
    {
        if (spotifyicon == null)
        {
            a.setCompoundDrawables(null, null, null, null);
            return;
        } else
        {
            e.a(spotifyicon);
            a.setCompoundDrawablesWithIntrinsicBounds(e, null, null, null);
            return;
        }
    }

    public final void a(String s)
    {
        a.setText(s);
    }

    public final void a(boolean flag)
    {
        c = flag;
        refreshDrawableState();
    }

    public final int b()
    {
        return d;
    }

    public final NavigationItemView b(int i)
    {
        d = i;
        return this;
    }

    protected int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 1);
        if (c)
        {
            mergeDrawableStates(ai, f);
        }
        return ai;
    }

}
