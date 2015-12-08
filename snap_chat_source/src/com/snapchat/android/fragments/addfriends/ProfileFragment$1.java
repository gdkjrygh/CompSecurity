// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Bt;
import CU;
import Db;
import Eh;
import Ei;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            ProfileFragment

final class a
    implements Eh
{

    private ProfileFragment a;

    public final void a(CU cu)
    {
        int i = Ei.a(cu);
        if (ProfileFragment.a(a).contains(Integer.valueOf(i)))
        {
            ProfileFragment.a(a).remove(Integer.valueOf(i));
            if (cu instanceof Db)
            {
                cu = (Db)cu;
                if (((Db) (cu)).b)
                {
                    long l = ((Db) (cu)).a;
                    ProfileFragment.b(a);
                    if (l > Bt.L())
                    {
                        a.a.clear();
                    }
                } else
                {
                    long l1 = ((Db) (cu)).a;
                    ProfileFragment.b(a);
                    if (l1 > Bt.L())
                    {
                        a.a(a.a);
                        return;
                    }
                }
            }
        }
    }

    A(ProfileFragment profilefragment)
    {
        a = profilefragment;
        super();
    }
}
