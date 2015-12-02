// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import android.content.DialogInterface;
import com.facebook.user.User;
import java.util.List;

// Referenced classes of package com.facebook.orca.contacts.favorites:
//            EditFavoritesActivity

class o
    implements android.content.DialogInterface.OnClickListener
{

    final User a;
    final EditFavoritesActivity b;

    o(EditFavoritesActivity editfavoritesactivity, User user)
    {
        b = editfavoritesactivity;
        a = user;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            EditFavoritesActivity.d(b).remove(a);
            break;
        }
        EditFavoritesActivity.e(b);
        EditFavoritesActivity.f(b);
    }
}
