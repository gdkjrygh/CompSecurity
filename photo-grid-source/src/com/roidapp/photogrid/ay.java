// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.roidapp.cloudlib.sns.af;

// Referenced classes of package com.roidapp.photogrid:
//            ax, MainPage

final class ay
    implements android.view.View.OnClickListener
{

    final ax a;

    ay(ax ax1)
    {
        a = ax1;
        super();
    }

    public final void onClick(View view)
    {
        if (a.isAdded() && (a.getActivity() instanceof MainPage) && !a.getActivity().isFinishing())
        {
            MainPage.b((MainPage)a.getActivity(), true);
            af.a(a.getActivity(), "QuickPic", 0x7f0d0117);
            a.dismissAllowingStateLoss();
        }
    }
}
