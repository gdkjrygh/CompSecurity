// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class dwk extends afn
{

    public final ViewGroup o;
    public final LinearLayout p;
    public final ViewGroup q;
    public final ViewGroup r;
    public final TextView s;
    public final TextView t;
    public final ImageView u;
    public final LinearLayout v;
    public final Button w[] = new Button[2];
    public final ImageButton x[];
    public final Button y;
    public final dwl z;

    private dwk(ViewGroup viewgroup, int i, int j)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(i, viewgroup, false));
        o = viewgroup;
        if (j >= 0)
        {
            ViewGroup viewgroup1 = (ViewGroup)a.findViewById(q.t);
            LayoutInflater.from(viewgroup.getContext()).inflate(j, viewgroup1, true);
        }
        q = (ViewGroup)a.findViewById(q.I);
        r = (ViewGroup)a.findViewById(q.J);
        if (r != null)
        {
            viewgroup = r;
        } else
        {
            viewgroup = a;
        }
        s = (TextView)viewgroup.findViewById(q.H);
        t = (TextView)viewgroup.findViewById(q.q);
        u = (ImageView)a.findViewById(q.s);
        p = (LinearLayout)a.findViewById(q.r);
        v = (LinearLayout)a.findViewById(q.n);
        w[0] = (Button)a.findViewById(q.F);
        w[1] = (Button)a.findViewById(q.G);
        if (q == null)
        {
            x = new ImageButton[1];
        } else
        {
            x = new ImageButton[2];
            x[1] = (ImageButton)q.findViewById(q.o);
        }
        x[0] = (ImageButton)viewgroup.findViewById(q.o);
        y = (Button)a.findViewById(q.u);
        z = new dwl(a);
    }

    public static dwk a(ViewGroup viewgroup, int i)
    {
        return new dwk(viewgroup, i, -1);
    }

    public static dwk a(ViewGroup viewgroup, int i, int j)
    {
        return new dwk(viewgroup, i, j);
    }
}
