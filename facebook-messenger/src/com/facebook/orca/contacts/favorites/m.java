// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import android.os.Bundle;
import android.support.v4.a.c;
import android.support.v4.app.ah;
import com.facebook.orca.contacts.divebar.an;
import com.facebook.orca.contacts.divebar.ao;

// Referenced classes of package com.facebook.orca.contacts.favorites:
//            EditFavoritesActivity

class m
    implements ah
{

    final EditFavoritesActivity a;

    m(EditFavoritesActivity editfavoritesactivity)
    {
        a = editfavoritesactivity;
        super();
    }

    public c a(int i, Bundle bundle)
    {
        return com.facebook.orca.contacts.favorites.EditFavoritesActivity.c(a).c();
    }

    public void a(c c)
    {
    }

    public void a(c c, an an1)
    {
        EditFavoritesActivity.a(a, an1);
    }

    public volatile void a(c c, Object obj)
    {
        a(c, (an)obj);
    }
}
