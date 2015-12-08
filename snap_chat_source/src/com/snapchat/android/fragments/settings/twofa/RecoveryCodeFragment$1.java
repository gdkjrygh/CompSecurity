// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.twofa;

import CU;
import Df;
import Eh;
import Ei;
import Mf;
import Oi;
import android.widget.Button;
import android.widget.ProgressBar;
import com.squareup.otto.Bus;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.settings.twofa:
//            RecoveryCodeFragment, RecoveryCodePasswordValidationFragment

final class a
    implements Eh
{

    private RecoveryCodeFragment a;

    public final void a(CU cu)
    {
label0:
        {
            int i = Ei.a(cu);
            if (RecoveryCodeFragment.a(a).contains(Integer.valueOf(i)))
            {
                RecoveryCodeFragment.a(a).remove(Integer.valueOf(i));
                if (cu instanceof Df)
                {
                    a.b.setVisibility(8);
                    a.a.setText(0x7f0802fd);
                    a.a.setClickable(true);
                    cu = (Df)cu;
                    if (!((Df) (cu)).b)
                    {
                        break label0;
                    }
                    Mf.a().a(new Oi(new RecoveryCodePasswordValidationFragment()));
                }
            }
            return;
        }
        cu = ((Df) (cu)).a;
        RecoveryCodeFragment.a(a, cu);
    }

    idationFragment(RecoveryCodeFragment recoverycodefragment)
    {
        a = recoverycodefragment;
        super();
    }
}
