// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.favorites;

import android.text.TextUtils;
import java.text.Collator;
import java.util.Comparator;

// Referenced classes of package com.skype.android.app.favorites:
//            Favorite

public class FavoriteNameComparator
    implements Comparator
{

    private Collator collator;

    public FavoriteNameComparator()
    {
        collator = Collator.getInstance();
        collator.setStrength(0);
    }

    public int compare(Favorite favorite, Favorite favorite1)
    {
        String s1 = favorite.getDisplayName();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = favorite.getIdentity();
        }
        s1 = favorite1.getDisplayName();
        favorite = s1;
        if (TextUtils.isEmpty(s1))
        {
            favorite = favorite1.getIdentity();
        }
        return collator.compare(s.trim(), favorite.trim());
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((Favorite)obj, (Favorite)obj1);
    }
}
