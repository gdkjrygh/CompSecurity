// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public final class dvl extends afn
{

    public final TextView o;
    public final TextView p;
    public final ProgressBar q;
    public final ViewSwitcher r;
    public final ImageView s;

    public dvl(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.jI, viewgroup, false));
        o = (TextView)a.findViewById(b.jG);
        p = (TextView)a.findViewById(b.jD);
        q = (ProgressBar)a.findViewById(b.jE);
        r = (ViewSwitcher)a.findViewById(b.jC);
        s = (ImageView)a.findViewById(b.jF);
    }
}
