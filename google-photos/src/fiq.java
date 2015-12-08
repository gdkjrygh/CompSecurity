// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class fiq extends afn
{

    private ImageView o;
    private TextView p;
    private TextView q;

    public fiq(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.pv, viewgroup, false));
        o = (ImageView)a.findViewById(q.W);
        p = (TextView)a.findViewById(q.X);
        q = (TextView)a.findViewById(q.aa);
    }

    static ImageView a(fiq fiq1)
    {
        return fiq1.o;
    }

    static TextView b(fiq fiq1)
    {
        return fiq1.p;
    }

    static TextView c(fiq fiq1)
    {
        return fiq1.q;
    }
}
