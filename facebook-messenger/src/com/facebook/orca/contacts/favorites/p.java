// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import com.facebook.user.User;

// Referenced classes of package com.facebook.orca.contacts.favorites:
//            v, EditFavoritesActivity

class p
    implements v
{

    final EditFavoritesActivity a;

    p(EditFavoritesActivity editfavoritesactivity)
    {
        a = editfavoritesactivity;
        super();
    }

    public void a(User user)
    {
        EditFavoritesActivity.b(a, user);
    }
}
