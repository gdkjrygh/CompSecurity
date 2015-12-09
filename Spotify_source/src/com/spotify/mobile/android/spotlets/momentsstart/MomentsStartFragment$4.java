// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart;

import abf;
import android.support.v7.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentHeaderView;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentMenuView;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentView;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentsVerticalView;
import euz;

// Referenced classes of package com.spotify.mobile.android.spotlets.momentsstart:
//            MomentsStartFragment

final class a extends abf
{

    private MomentsStartFragment a;

    public final void a(RecyclerView recyclerview, int i)
    {
        if (i == 1)
        {
            MomentsStartFragment.i(a);
        }
        recyclerview = (MomentView)recyclerview;
        int j = recyclerview.u();
        if (recyclerview.w())
        {
            if (j == 1 && i == 0 || j > 1 && i == 2)
            {
                a.a(recyclerview);
            }
        } else
        if (i == 2)
        {
            a.a.d(a.a.u(), j);
        }
        if (i == 0 && !recyclerview.w())
        {
            a.Z.b();
            a.aa.a();
            a.d(false);
            return;
        } else
        {
            MomentsStartFragment.j(a).c();
            return;
        }
    }

    w(MomentsStartFragment momentsstartfragment)
    {
        a = momentsstartfragment;
        super();
    }
}
