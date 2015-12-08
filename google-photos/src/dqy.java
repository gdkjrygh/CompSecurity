// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.photos.allphotos.fragment.month.MonthView;

public final class dqy extends afn
{

    final TextView o;
    final MonthView p;
    private final drl q;

    public dqy(ViewGroup viewgroup, drl drl)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.iW, viewgroup, false));
        o = (TextView)a.findViewById(c.cb);
        p = (MonthView)a.findViewById(c.cc);
        q = drl;
    }

    static drl a(dqy dqy1)
    {
        return dqy1.q;
    }
}
