// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.ui.view.LoadingView;

public final class fhh
{

    public final View a;
    public final RecyclerView b;
    public final dos c;
    public final LoadingView d;
    private final aay e;

    public fhh(Context context, LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        c = new dos(context);
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f03009d, viewgroup, false);
        b = (RecyclerView)viewgroup.findViewById(0x7f1103cb);
        b.a(c);
        e = b.o();
        d = LoadingView.a(layoutinflater, context, b);
        viewgroup.addView(d);
        a = viewgroup;
    }

    public final void a(boolean flag)
    {
        RecyclerView recyclerview = b;
        aay aay;
        if (flag)
        {
            aay = e;
        } else
        {
            aay = null;
        }
        ggp.a(recyclerview, aay);
    }

    public final boolean a(gbr gbr1)
    {
        return gbr1.a(b);
    }
}
