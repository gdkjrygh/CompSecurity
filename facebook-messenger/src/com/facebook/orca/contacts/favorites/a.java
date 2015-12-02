// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.i;
import com.facebook.k;
import com.facebook.user.User;
import com.facebook.user.tiles.UserTileView;
import com.facebook.user.tiles.e;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.orca.contacts.favorites:
//            c, b

public class a extends f
{

    private final TextView a;
    private final View b;
    private final UserTileView c;
    private c d;

    public a(Context context)
    {
        this(context, null, 0);
    }

    public a(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        setContentView(k.orca_add_favorite_row);
        a = (TextView)getView(i.contact_name);
        c = (UserTileView)getView(i.contact_user_tile_image);
        b = getView(i.add_button);
    }

    static c a(a a1)
    {
        return a1.d;
    }

    private void a()
    {
        User user = d.a();
        c.setParams(e.a(user));
        a.setText(user.g());
        b.setOnClickListener(new b(this));
    }

    public c getContactRow()
    {
        return d;
    }

    public void setContactRow(c c1)
    {
        d = c1;
        a();
    }
}
