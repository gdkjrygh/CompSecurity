// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import android.content.DialogInterface;

// Referenced classes of package com.facebook.orca.contacts.favorites:
//            EditFavoritesActivity

class q
    implements android.content.DialogInterface.OnClickListener
{

    final EditFavoritesActivity a;

    q(EditFavoritesActivity editfavoritesactivity)
    {
        a = editfavoritesactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.finish();
    }
}
