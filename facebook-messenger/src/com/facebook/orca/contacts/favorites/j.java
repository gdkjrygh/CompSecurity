// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import com.facebook.contacts.picker.ad;
import com.facebook.contacts.picker.v;
import com.facebook.debug.log.b;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.user.UserWithIdentifier;

// Referenced classes of package com.facebook.orca.contacts.favorites:
//            c, k, g, l, 
//            EditFavoritesActivity

class j
    implements v
{

    final EditFavoritesActivity a;

    j(EditFavoritesActivity editfavoritesactivity)
    {
        a = editfavoritesactivity;
        super();
    }

    public ad a(Object obj)
    {
        if (obj instanceof UserWithIdentifier)
        {
            obj = new c(((UserWithIdentifier)obj).a());
            ((c) (obj)).a(new k(this));
            return ((ad) (obj));
        }
        if (obj instanceof ThreadSummary)
        {
            obj = new g((ThreadSummary)obj);
            ((g) (obj)).a(new l(this));
            return ((ad) (obj));
        } else
        {
            b.d(EditFavoritesActivity.j(), (new StringBuilder()).append("unexpected rowData of type: ").append(obj.getClass()).toString());
            throw new IllegalArgumentException();
        }
    }
}
