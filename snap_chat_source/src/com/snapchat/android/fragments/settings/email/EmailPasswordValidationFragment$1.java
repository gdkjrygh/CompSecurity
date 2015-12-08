// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.email;

import CU;
import CZ;
import Dh;
import Eh;
import Ei;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.settings.email:
//            EmailPasswordValidationFragment

final class a
    implements Eh
{

    private EmailPasswordValidationFragment a;

    public final void a(CU cu)
    {
        int i = Ei.a(cu);
        if (EmailPasswordValidationFragment.a(a).contains(Integer.valueOf(i)))
        {
            EmailPasswordValidationFragment.a(a).remove(Integer.valueOf(i));
            if (cu instanceof Dh)
            {
                EmailPasswordValidationFragment.a(a, (Dh)cu);
            } else
            if (cu instanceof CZ)
            {
                EmailPasswordValidationFragment.a(a, (CZ)cu);
                return;
            }
        }
    }

    (EmailPasswordValidationFragment emailpasswordvalidationfragment)
    {
        a = emailpasswordvalidationfragment;
        super();
    }
}
