// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.res.Resources;
import android.widget.Toast;
import com.tinder.activities.ActivityVerification;
import com.tinder.e.ar;

// Referenced classes of package com.tinder.fragments:
//            bh

final class a
    implements ar
{

    final bh a;

    public final void a()
    {
        if (a.getActivity() != null)
        {
            ((ActivityVerification)a.getActivity()).f();
            Toast.makeText(a.getActivity(), String.format(a.getResources().getString(0x7f06007b), new Object[] {
                bh.d(a)
            }), 1).show();
        }
    }

    public final void b()
    {
        if (a.getActivity() != null)
        {
            ((ActivityVerification)a.getActivity()).f();
            Toast.makeText(a.getActivity(), 0x7f0600aa, 1).show();
        }
    }

    ces(bh bh1)
    {
        a = bh1;
        super();
    }
}
