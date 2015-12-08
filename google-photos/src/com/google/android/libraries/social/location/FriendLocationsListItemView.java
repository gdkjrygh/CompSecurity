// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.location;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import ney;
import oiz;
import u;

public final class FriendLocationsListItemView extends LinearLayout
    implements android.view.View.OnClickListener, android.widget.PopupMenu.OnMenuItemClickListener, oiz
{

    private AvatarView a;
    private TextView b;

    public FriendLocationsListItemView(Context context)
    {
        super(context);
    }

    public FriendLocationsListItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FriendLocationsListItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void ax_()
    {
        a.a();
    }

    public final void onClick(View view)
    {
    }

    protected final void onFinishInflate()
    {
        super.onFinishInflate();
        if (a == null)
        {
            a = (AvatarView)findViewById(u.x);
            findViewById(u.B);
            findViewById(u.y);
            b = (TextView)findViewById(u.C);
            b.setHorizontallyScrolling(false);
            findViewById(u.D);
            ney ney1 = new ney(this);
            a.setOnClickListener(this);
            findViewById(u.z).setOnClickListener(this);
            findViewById(u.A).setOnClickListener(ney1);
        }
    }

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        return false;
    }
}
