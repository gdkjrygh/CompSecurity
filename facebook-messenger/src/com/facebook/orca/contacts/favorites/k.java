// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import com.facebook.user.User;

// Referenced classes of package com.facebook.orca.contacts.favorites:
//            d, j, EditFavoritesActivity, ac

class k
    implements d
{

    final j a;

    k(j j1)
    {
        a = j1;
        super();
    }

    public void a(User user)
    {
        EditFavoritesActivity.b(a.a).e();
        EditFavoritesActivity.a(a.a, user);
    }
}
