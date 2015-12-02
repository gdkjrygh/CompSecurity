// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import com.facebook.user.User;
import com.facebook.widget.listview.g;
import java.util.List;

// Referenced classes of package com.facebook.orca.contacts.favorites:
//            EditFavoritesActivity

class n
    implements g
{

    final EditFavoritesActivity a;

    n(EditFavoritesActivity editfavoritesactivity)
    {
        a = editfavoritesactivity;
        super();
    }

    public void a(int i, int j)
    {
        if (j >= 0 && j < EditFavoritesActivity.d(a).size())
        {
            User user = (User)EditFavoritesActivity.d(a).get(i);
            EditFavoritesActivity.d(a).remove(user);
            EditFavoritesActivity.d(a).add(j, user);
            EditFavoritesActivity.e(a);
            EditFavoritesActivity.f(a);
        }
    }
}
