// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import CU;
import Dk;
import Eh;
import Ei;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            PickUsernameFragment

final class a
    implements Eh
{

    private PickUsernameFragment a;

    public final void a(CU cu)
    {
        int i = Ei.a(cu);
        if (PickUsernameFragment.a(a).contains(Integer.valueOf(i)))
        {
            PickUsernameFragment.a(a).remove(Integer.valueOf(i));
            if (cu instanceof Dk)
            {
                PickUsernameFragment.a(a, (Dk)cu);
            }
        }
    }

    (PickUsernameFragment pickusernamefragment)
    {
        a = pickusernamefragment;
        super();
    }
}
