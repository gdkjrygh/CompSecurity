// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.photos.videoplayer.slomo.ui.RangeSeekBar;
import java.util.ArrayList;
import java.util.List;

public class jem extends omp
    implements android.widget.SeekBar.OnSeekBarChangeListener, fph, grc, jel, jes, jgs, nug
{

    private jgc a;
    private jes ag;
    private jej ah;
    private View ai;
    private View aj;
    private View ak;
    private View al;
    private jek am;
    private gqz an;
    private jfz b;
    private SeekBar c;
    private RangeSeekBar d;
    private TextView e;
    private TextView f;
    private ImageButton g;
    private ImageButton h;

    public jem()
    {
        (new ghb(af, new jen(this), null)).a = true;
        (new ghb(af, new jeo(this), null)).a = true;
        new jeg(af, this);
        new fpi(this, af, ad);
    }

    static void a(jem jem1)
    {
        jem1.r();
    }

    private String b(int i)
    {
        int k = i / 1000;
        i = k % 60;
        int j = (k / 60) % 60;
        k /= 3600;
        if (k > 0)
        {
            return a(c.fB, new Object[] {
                Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(i)
            });
        } else
        {
            return a(c.fA, new Object[] {
                Integer.valueOf(j), Integer.valueOf(i)
            });
        }
    }

    private void b(jek jek1)
    {
        if (am == jek1)
        {
            return;
        }
        am = jek1;
        switch (jer.a[jek1.ordinal()])
        {
        default:
            h.setVisibility(4);
            g.setVisibility(4);
            ai.setVisibility(4);
            return;

        case 1: // '\001'
            h.setVisibility(4);
            g.setVisibility(0);
            ai.setVisibility(0);
            return;

        case 2: // '\002'
            h.setVisibility(0);
            break;
        }
        g.setVisibility(4);
        ai.setVisibility(0);
    }

    static void b(jem jem1)
    {
        boolean flag = false;
        RangeSeekBar rangeseekbar;
        int i;
        boolean flag1;
        if (jem1.a.b && jem1.b.c && jem1.b.d)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        jem1.d.setEnabled(flag1);
        rangeseekbar = jem1.d;
        if (flag1)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        rangeseekbar.setVisibility(i);
        jem1 = jem1.aj;
        if (flag1)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        jem1.setVisibility(i);
    }

    static void c(jem jem1)
    {
        int j = jem1.d.b;
        int i = (int)(jga.a(jem1.b.b) * (float)j);
        float f1 = jga.b(jem1.b.b);
        j = (int)((float)j * f1);
        if (!jga.c(jem1.b.b) || i != jem1.d.c || j != jem1.d.d)
        {
            jem1.d.a(i, j);
        }
    }

    static jej d(jem jem1)
    {
        return jem1.ah;
    }

    private void r()
    {
        SeekBar seekbar = c;
        int i;
        int j;
        boolean flag;
        if (a.d > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        seekbar.setEnabled(flag);
        i = a.c;
        j = a.d;
        e.setText(b(i));
        f.setText(b(j));
        c.setMax(j);
        if (!a.e || i != c.getProgress())
        {
            c.setProgress(i);
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        View view = layoutinflater.inflate(b.CA, null);
        ai = view.findViewById(b.Cy);
        aj = view.findViewById(b.Cr);
        c = (SeekBar)view.findViewById(b.Cx);
        d = (RangeSeekBar)view.findViewById(b.Cv);
        e = (TextView)view.findViewById(b.Cw);
        f = (TextView)view.findViewById(b.Cz);
        c.setOnSeekBarChangeListener(this);
        d.a = this;
        ak = view.findViewById(b.Cp);
        g = (ImageButton)view.findViewById(b.Co);
        g.setOnClickListener(new jep(this));
        al = view.findViewById(b.Cn);
        h = (ImageButton)view.findViewById(b.Cm);
        h.setOnClickListener(new jeq(this));
        viewgroup = jek.c;
        layoutinflater = viewgroup;
        if (bundle != null)
        {
            bundle = bundle.getString("playback_control_state");
            layoutinflater = viewgroup;
            if (bundle != null)
            {
                layoutinflater = jek.valueOf(bundle);
                r();
            }
        }
        b(layoutinflater);
        return view;
    }

    public final nud a()
    {
        throw new UnsupportedOperationException();
    }

    public final void a(int i, int j)
    {
        ak.setPadding(ak.getPaddingLeft(), j, ak.getPaddingRight(), ak.getPaddingBottom());
        al.setPadding(al.getPaddingLeft(), j, al.getPaddingRight(), al.getPaddingBottom());
    }

    public final void a(MotionEvent motionevent)
    {
        c.onTouchEvent(motionevent);
    }

    public final void a(RangeSeekBar rangeseekbar, int i, int j, boolean flag)
    {
        if (!flag)
        {
            return;
        } else
        {
            int k = rangeseekbar.b;
            b.a((float)i / (float)k, (float)j / (float)k, true);
            return;
        }
    }

    public final void a(jej jej1)
    {
        throw new UnsupportedOperationException();
    }

    public final void a(jek jek1)
    {
        b(jek1);
    }

    public final void aj_()
    {
        super.aj_();
        ag.a().a(this);
        if (ah != null)
        {
            ah.a(null);
        }
        ah = null;
    }

    public final void au_()
    {
        super.au_();
        ag.a().a(this, true);
    }

    public final jej b()
    {
        return ah;
    }

    public final void b_(Object obj)
    {
        obj = (jes)obj;
        if (ah != ((jes) (obj)).b())
        {
            if (ah != null)
            {
                ah.a(null);
                b(jek.c);
            }
            ah = ((jes) (obj)).b();
            if (ah != null)
            {
                ah.a(this);
            }
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        ag = (jes)ae.a(jes);
        a = (jgc)ae.a(jgc);
        b = (jfz)ae.a(jfz);
        an = (gqz)ae.b(gqz);
        if (an != null)
        {
            an.a(this);
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (am != null)
        {
            bundle.putString("playback_control_state", am.name());
        }
    }

    public final void n()
    {
        super.n();
        if (an != null)
        {
            an.b(this);
        }
    }

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (flag)
        {
            a.a(i, true);
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        a.b(true);
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        a.b(false);
    }

    public final void s_()
    {
        super.s_();
        am = jek.c;
    }

    public final List t()
    {
        ArrayList arraylist = new ArrayList();
        if (super.R != null)
        {
            View view = super.R.findViewById(b.Cn);
            if (view != null)
            {
                arraylist.add(view);
            }
            view = super.R.findViewById(b.Cq);
            if (view != null)
            {
                arraylist.add(view);
            }
        }
        return arraylist;
    }
}
