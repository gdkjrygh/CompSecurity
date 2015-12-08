// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class hus extends afn
{

    public final ImageView o;
    public final TextView p;
    public final TextView q;
    public boolean r;
    private View s;
    private final hyy t;
    private final nug u = new hut(this);

    public hus(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.xQ, viewgroup, false));
        r = true;
        o = (ImageView)a.findViewById(au.s);
        p = (TextView)a.findViewById(au.H);
        q = (TextView)a.findViewById(au.G);
        s = a.findViewById(au.z);
        t = (hyy)olm.a(viewgroup.getContext(), hyy);
        a.addOnAttachStateChangeListener(new huu(this));
    }

    public static int a(Context context)
    {
        return context.getResources().getDimensionPixelSize(b.xI);
    }

    static void a(hus hus1)
    {
        byte byte0 = 0;
        View view;
        boolean flag;
        if (!hus1.t.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hus1.r = flag;
        view = hus1.s;
        if (hus1.r)
        {
            byte0 = 4;
        }
        view.setVisibility(byte0);
    }

    static nug b(hus hus1)
    {
        return hus1.u;
    }

    static hyy c(hus hus1)
    {
        return hus1.t;
    }
}
