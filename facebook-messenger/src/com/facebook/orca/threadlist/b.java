// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.orca.p.h;
import com.facebook.user.User;
import com.facebook.user.tiles.UserTileView;
import com.facebook.user.tiles.e;
import com.facebook.widget.f;

class b extends f
{

    private UserTileView a;
    private TextView b;
    private User c;
    private h d;

    public b(Context context)
    {
        this(context, null);
    }

    public b(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public b(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        d = (h)getInjector().a(com/facebook/orca/p/h);
        setContentView(k.contacts_grid_row);
        a = (UserTileView)getView(i.contact_user_tile_image);
        b = (TextView)getView(i.contact_user_name);
    }

    public void a(User user)
    {
        c = user;
        com.facebook.user.PicCropInfo piccropinfo = c.t();
        user = piccropinfo;
        if (piccropinfo == null)
        {
            user = c.s();
        }
        a.setParams(e.a(user));
        b.setText(d.a(getResources(), c));
    }
}
