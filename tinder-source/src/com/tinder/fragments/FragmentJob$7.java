// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.widget.Toast;
import com.tinder.e.ax;

// Referenced classes of package com.tinder.fragments:
//            FragmentJob

final class a
    implements ax
{

    final FragmentJob a;

    public final void a(int i)
    {
        if (i != 204)
        {
            Toast.makeText(a.getActivity(), 0x7f060249, 0).show();
        }
    }

    (FragmentJob fragmentjob)
    {
        a = fragmentjob;
        super();
    }
}
