// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Date;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            d, e

public class l extends d
    implements android.view.View.OnClickListener
{

    public l()
    {
    }

    public void O_()
    {
    }

    public View a(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(i()).inflate(0x7f04019d, viewgroup, false);
        viewgroup.findViewById(0x7f110444).setOnClickListener(this);
        return viewgroup;
    }

    public void a(Date date)
    {
    }

    public void b(e e)
    {
    }

    public CharSequence f()
    {
        return "";
    }

    public void onClick(View view)
    {
        com.fitbit.ui.k.a.a(i(), "dashboard-layout", com/fitbit/home/ui/DashboardFragment$Tile).a();
    }
}
