// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.support.v4.app.FragmentManager;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            qi

final class qm
    implements android.view.View.OnClickListener
{

    final qi a;

    qm(qi qi1)
    {
        a = qi1;
        super();
    }

    public final void onClick(View view)
    {
        if (!a.isAdded() || a.getFragmentManager() == null || a.getFragmentManager().isDestroyed())
        {
            return;
        } else
        {
            a.dismissAllowingStateLoss();
            return;
        }
    }
}
