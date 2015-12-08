// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import java.util.List;

final class mwe extends aen
{

    final mwb c;
    private List d;
    private android.view.View.OnClickListener e;

    public mwe(mwb mwb1, List list)
    {
        c = mwb1;
        super();
        e = new mwf(this);
        d = list;
    }

    public final int a()
    {
        return d.size();
    }

    public final afn a(ViewGroup viewgroup, int i)
    {
        viewgroup = LayoutInflater.from(viewgroup.getContext()).inflate(b.Ey, viewgroup, false);
        viewgroup.setOnClickListener(e);
        return new mwd(c, viewgroup);
    }

    public final void a(afn afn, int i)
    {
        afn = (mwd)afn;
        mvx mvx1 = (mvx)d.get(i);
        boolean flag = mwb.b(c).getBoolean(mvx1.a(), false);
        ((mwd) (afn)).r.setTag(mvx1.a());
        ((mwd) (afn)).o.setText(mvx1.a());
        ((mwd) (afn)).p.setText(mvx1.b());
        ((mwd) (afn)).q.setChecked(flag);
    }
}
