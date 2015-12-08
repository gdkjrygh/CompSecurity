// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tinder.e.ag;
import com.tinder.enums.ReportCause;
import com.tinder.model.Match;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.c:
//            ag

public final class ah extends com.tinder.c.ag
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener
{

    private TextView F;
    private TextView G;
    private TextView H;
    private TextView I;
    private TextView J;
    private View K;
    private View L;
    private View M;
    private View N;
    private View O;
    private View P;
    private ag Q;

    public ah(Context context, ag ag1, Match match)
    {
        super(context, 0x7f0b0166);
        Q = ag1;
        if (match == null)
        {
            F.setVisibility(8);
            L.setVisibility(8);
            H.setVisibility(8);
            N.setVisibility(8);
        }
    }

    private void a(int i)
    {
        boolean flag = false;
        b.setText(0x7f0601b6);
        a(false);
        c(false);
        g();
        b(true);
        ProgressBar progressbar = this.j;
        int j;
        if (i == 0x7f0e01c7)
        {
            j = 0;
        } else
        {
            j = 4;
        }
        progressbar.setVisibility(j);
        progressbar = k;
        if (i == 0x7f0e01ca)
        {
            j = 0;
        } else
        {
            j = 4;
        }
        progressbar.setVisibility(j);
        progressbar = l;
        if (i == 0x7f0e01cd)
        {
            j = 0;
        } else
        {
            j = 4;
        }
        progressbar.setVisibility(j);
        progressbar = m;
        if (i == 0x7f0e01d0)
        {
            j = 0;
        } else
        {
            j = 4;
        }
        progressbar.setVisibility(j);
        progressbar = n;
        if (i == 0x7f0e01d3)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 4;
        }
        progressbar.setVisibility(i);
        K.setAlpha(0.25F);
        L.setAlpha(0.25F);
        M.setAlpha(0.25F);
        N.setAlpha(0.25F);
        O.setAlpha(0.25F);
        P.setAlpha(0.25F);
    }

    static void a(ah ah1)
    {
        ah1.b.setText(0x7f0601b6);
        ah1.n.setVisibility(0);
        ah1.e.setAlpha(0.5F);
    }

    static ag b(ah ah1)
    {
        return ah1.Q;
    }

    private void b(boolean flag)
    {
        float f1 = 0.25F;
        TextView textview = F;
        float f;
        if (flag)
        {
            f = 0.25F;
        } else
        {
            f = 1.0F;
        }
        textview.setAlpha(f);
        textview = G;
        if (flag)
        {
            f = 0.25F;
        } else
        {
            f = 1.0F;
        }
        textview.setAlpha(f);
        textview = H;
        if (flag)
        {
            f = 0.25F;
        } else
        {
            f = 1.0F;
        }
        textview.setAlpha(f);
        textview = I;
        if (flag)
        {
            f = 0.25F;
        } else
        {
            f = 1.0F;
        }
        textview.setAlpha(f);
        textview = J;
        if (flag)
        {
            f = f1;
        } else
        {
            f = 1.0F;
        }
        textview.setAlpha(f);
    }

    private void c(boolean flag)
    {
        F.setEnabled(flag);
        G.setEnabled(flag);
        H.setEnabled(flag);
        I.setEnabled(flag);
        J.setEnabled(flag);
    }

    public final void k()
    {
        F = (TextView)findViewById(0x7f0e01c7);
        G = (TextView)findViewById(0x7f0e01ca);
        H = (TextView)findViewById(0x7f0e01cd);
        I = (TextView)findViewById(0x7f0e01d0);
        J = (TextView)findViewById(0x7f0e01d3);
        F.setOnClickListener(this);
        G.setOnClickListener(this);
        H.setOnClickListener(this);
        I.setOnClickListener(this);
        J.setOnClickListener(this);
        F.setOnTouchListener(this);
        G.setOnTouchListener(this);
        H.setOnTouchListener(this);
        I.setOnTouchListener(this);
        J.setOnTouchListener(this);
        K = findViewById(0x7f0e01c6);
        L = findViewById(0x7f0e01c9);
        M = findViewById(0x7f0e01cc);
        N = findViewById(0x7f0e01cf);
        O = findViewById(0x7f0e01d2);
        P = findViewById(0x7f0e01d4);
        h();
        b.setText(0x7f0601b7);
        c.setText(0x7f0601b4);
        e.setVisibility(8);
        f.setVisibility(8);
        d.setVisibility(8);
        c();
        g();
        c(true);
    }

    public final void l()
    {
        b.setText(0x7f0601b2);
        c.setText("");
        c.setPadding(c.getPaddingLeft(), 0, c.getPaddingRight(), c.getPaddingBottom());
        f.setText(0x7f0601b0);
        e.setVisibility(8);
        n.setVisibility(8);
        f.setVisibility(0);
        f();
        a(true);
        f.setOnClickListener(new android.view.View.OnClickListener() {

            final ah a;

            public final void onClick(View view)
            {
                a.dismiss();
            }

            
            {
                a = ah.this;
                super();
            }
        });
    }

    public final void m()
    {
        c();
        a(true);
        c(true);
        b(false);
    }

    public final void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131624391: 
            a(view.getId());
            Q.a(ReportCause.ABUSIVE_CONTENT, null);
            return;

        case 2131624394: 
            a(view.getId());
            Q.a(ReportCause.INAPPROPRIATE_PHOTOS, null);
            return;

        case 2131624397: 
            a(view.getId());
            Q.a(ReportCause.OFFLINE_BEHAVIOR, null);
            return;

        case 2131624400: 
            a(view.getId());
            Q.a(ReportCause.SPAM, null);
            return;

        case 2131624403: 
            f();
            break;
        }
        e();
        a(true);
        n.setVisibility(8);
        f.setVisibility(0);
        f.setText(0x7f0601b7);
        f.setOnClickListener(new android.view.View.OnClickListener() {

            final ah a;

            public final void onClick(View view1)
            {
                ad.a(a.f.getWindowToken(), (Activity)a.a);
                ah.a(a);
                ah.b(a).a(ReportCause.OTHER, a.e.getText().toString());
            }

            
            {
                a = ah.this;
                super();
            }
        });
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        (new StringBuilder("motionEvent: ")).append(motionevent.getAction());
        switch (motionevent.getAction())
        {
        default:
            return false;

        case 0: // '\0'
            view.setAlpha(0.25F);
            return false;

        case 1: // '\001'
            view.setAlpha(1.0F);
            break;
        }
        return false;
    }
}
