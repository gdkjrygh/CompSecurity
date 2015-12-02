// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.i;
import com.facebook.k;
import com.facebook.orca.common.ui.widgets.e;
import com.facebook.user.User;
import com.facebook.user.tiles.UserTileView;

// Referenced classes of package com.facebook.orca.contacts.favorites:
//            u, t

public class s extends e
{

    private u b;
    private TextView c;
    private View d;
    private UserTileView e;

    public s(Context context)
    {
        super(context);
        a(context);
    }

    static u a(s s1)
    {
        return s1.b;
    }

    private void a(Context context)
    {
        setContentView(k.orca_favorites_list_row);
        c = (TextView)getView(i.contact_name);
        e = (UserTileView)getView(i.contact_user_tile_image);
        d = getView(i.delete_button);
        d.setClickable(true);
    }

    private void b()
    {
        User user = b.a();
        e.setParams(com.facebook.user.tiles.e.a(user));
        c.setText(user.g());
        d.setOnClickListener(new t(this));
    }

    public u getContactRow()
    {
        return b;
    }

    public View getInnerRow()
    {
        return getChildAt(0);
    }

    public void setContactRow(u u1)
    {
        b = u1;
        b();
    }
}
