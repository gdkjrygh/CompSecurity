// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.verification;

import CU;
import Dm;
import Eh;
import Ei;
import IJ;
import UV;
import com.snapchat.android.util.AlertDialogUtils;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.verification:
//            PhoneVerificationFragment

final class a
    implements Eh
{

    private PhoneVerificationFragment a;

    public final void a(CU cu)
    {
        UV uv;
label0:
        {
            int i = Ei.a(cu);
            if (PhoneVerificationFragment.a(a).contains(Integer.valueOf(i)))
            {
                PhoneVerificationFragment.a(a).remove(Integer.valueOf(i));
                if (cu instanceof Dm)
                {
                    cu = (Dm)cu;
                    uv = ((Dm) (cu)).b;
                    if (((Dm) (cu)).a)
                    {
                        AlertDialogUtils.b(a.getActivity(), a.getString(0x7f0802f8), a.getString(0x7f0802f7));
                    }
                    if (!IJ.a(uv.a()))
                    {
                        break label0;
                    }
                    a.a(uv);
                }
            }
            return;
        }
        a.b(uv.b());
    }

    (PhoneVerificationFragment phoneverificationfragment)
    {
        a = phoneverificationfragment;
        super();
    }
}
