// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.user;

import an;
import android.database.Cursor;
import android.os.Bundle;
import cu;
import da;
import dtw;

// Referenced classes of package com.spotify.mobile.android.spotlets.user:
//            ProfilesListFragment

final class b
    implements an
{

    private final String a[] = {
        "current_user"
    };
    private ProfilesListFragment b;

    public final da a(Bundle bundle)
    {
        return new cu(b.k(), dtw.a, a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        boolean flag = false;
        obj = (Cursor)obj;
        if (((Cursor) (obj)).moveToFirst())
        {
            obj = ((Cursor) (obj)).getString(0);
            if (!((String) (obj)).equals(ProfilesListFragment.g(b)))
            {
                flag = true;
            }
            ProfilesListFragment.a(b, ((String) (obj)));
            if (flag)
            {
                b.H();
            }
        }
    }

    (ProfilesListFragment profileslistfragment)
    {
        b = profileslistfragment;
        super();
    }
}
