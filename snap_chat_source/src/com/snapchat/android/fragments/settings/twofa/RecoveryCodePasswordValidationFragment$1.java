// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.twofa;

import CU;
import Df;
import Dh;
import Eh;
import Ei;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.settings.twofa:
//            RecoveryCodePasswordValidationFragment

final class a
    implements Eh
{

    private RecoveryCodePasswordValidationFragment a;

    public final void a(CU cu)
    {
        int i = Ei.a(cu);
        if (RecoveryCodePasswordValidationFragment.a(a).contains(Integer.valueOf(i)))
        {
            RecoveryCodePasswordValidationFragment.a(a).remove(Integer.valueOf(i));
            if (cu instanceof Dh)
            {
                RecoveryCodePasswordValidationFragment.a(a, (Dh)cu);
            } else
            if (cu instanceof Df)
            {
                RecoveryCodePasswordValidationFragment.a(a, (Df)cu);
                return;
            }
        }
    }

    (RecoveryCodePasswordValidationFragment recoverycodepasswordvalidationfragment)
    {
        a = recoverycodepasswordvalidationfragment;
        super();
    }
}
