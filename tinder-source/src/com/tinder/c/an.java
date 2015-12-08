// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.e.ap;
import com.tinder.enums.ReportCause;

// Referenced classes of package com.tinder.c:
//            ag

public final class an extends ag
    implements android.view.View.OnTouchListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private final float F = 0.25F;
    private ap G;

    public an(Context context, ap ap)
    {
        super(context, 0x7f0b0166);
        G = ap;
    }

    static ap a(an an1)
    {
        return an1.G;
    }

    private void a(CompoundButton compoundbutton, boolean flag)
    {
        int j = 0x7f0d0101;
        boolean flag2 = false;
        boolean flag1;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        if (compoundbutton.getId() == 0x7f0e01d6 && flag)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (compoundbutton.getId() == 0x7f0e01d9 && flag)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (compoundbutton.getId() == 0x7f0e01dc && flag)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        if (compoundbutton.getId() == 0x7f0e01df && flag)
        {
            flag6 = true;
        } else
        {
            flag6 = false;
        }
        if (compoundbutton.getId() == 0x7f0e01e2 && flag)
        {
            flag7 = true;
        } else
        {
            flag7 = false;
        }
        if (compoundbutton.getId() == 0x7f0e01e5 && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag3 || flag4 || flag5 || flag6 || flag7 || flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            compoundbutton.setOnCheckedChangeListener(null);
            compoundbutton.setChecked(true);
            compoundbutton.getCompoundDrawables()[0].setColorFilter(a.getResources().getColor(0x7f0d0101), android.graphics.PorterDuff.Mode.SRC_ATOP);
            compoundbutton.setOnCheckedChangeListener(this);
            return;
        }
        o.setOnCheckedChangeListener(null);
        p.setOnCheckedChangeListener(null);
        q.setOnCheckedChangeListener(null);
        r.setOnCheckedChangeListener(null);
        s.setOnCheckedChangeListener(null);
        t.setOnCheckedChangeListener(null);
        o.setChecked(flag3);
        p.setChecked(flag4);
        q.setChecked(flag5);
        r.setChecked(flag6);
        s.setChecked(flag7);
        t.setChecked(flag);
        o.setOnCheckedChangeListener(this);
        p.setOnCheckedChangeListener(this);
        q.setOnCheckedChangeListener(this);
        r.setOnCheckedChangeListener(this);
        s.setOnCheckedChangeListener(this);
        t.setOnCheckedChangeListener(this);
        compoundbutton = o.getCompoundDrawables()[0];
        Resources resources = a.getResources();
        int i;
        if (flag3)
        {
            i = 0x7f0d0101;
        } else
        {
            i = 0x7f0d00de;
        }
        compoundbutton.setColorFilter(resources.getColor(i), android.graphics.PorterDuff.Mode.SRC_ATOP);
        compoundbutton = p.getCompoundDrawables()[0];
        resources = a.getResources();
        if (flag4)
        {
            i = 0x7f0d0101;
        } else
        {
            i = 0x7f0d00de;
        }
        compoundbutton.setColorFilter(resources.getColor(i), android.graphics.PorterDuff.Mode.SRC_ATOP);
        compoundbutton = q.getCompoundDrawables()[0];
        resources = a.getResources();
        if (flag5)
        {
            i = 0x7f0d0101;
        } else
        {
            i = 0x7f0d00de;
        }
        compoundbutton.setColorFilter(resources.getColor(i), android.graphics.PorterDuff.Mode.SRC_ATOP);
        compoundbutton = r.getCompoundDrawables()[0];
        resources = a.getResources();
        if (flag6)
        {
            i = 0x7f0d0101;
        } else
        {
            i = 0x7f0d00de;
        }
        compoundbutton.setColorFilter(resources.getColor(i), android.graphics.PorterDuff.Mode.SRC_ATOP);
        compoundbutton = s.getCompoundDrawables()[0];
        resources = a.getResources();
        if (flag7)
        {
            i = 0x7f0d0101;
        } else
        {
            i = 0x7f0d00de;
        }
        compoundbutton.setColorFilter(resources.getColor(i), android.graphics.PorterDuff.Mode.SRC_ATOP);
        compoundbutton = t.getCompoundDrawables()[0];
        resources = a.getResources();
        if (flag)
        {
            i = j;
        } else
        {
            i = 0x7f0d00de;
        }
        compoundbutton.setColorFilter(resources.getColor(i), android.graphics.PorterDuff.Mode.SRC_ATOP);
        compoundbutton = u;
        if (flag3)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        compoundbutton.setVisibility(i);
        compoundbutton = v;
        if (flag4)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        compoundbutton.setVisibility(i);
        compoundbutton = w;
        if (flag5)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        compoundbutton.setVisibility(i);
        compoundbutton = x;
        if (flag6)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        compoundbutton.setVisibility(i);
        compoundbutton = y;
        if (flag7)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        compoundbutton.setVisibility(i);
        compoundbutton = z;
        if (flag)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 8;
        }
        compoundbutton.setVisibility(i);
    }

    public final void dismiss()
    {
        o.getCompoundDrawables()[0].clearColorFilter();
        p.getCompoundDrawables()[0].clearColorFilter();
        q.getCompoundDrawables()[0].clearColorFilter();
        r.getCompoundDrawables()[0].clearColorFilter();
        s.getCompoundDrawables()[0].clearColorFilter();
        t.getCompoundDrawables()[0].clearColorFilter();
        super.dismiss();
    }

    public final void k()
    {
        findViewById(0x7f0e015a).setVisibility(8);
        findViewById(0x7f0e0158).setVisibility(8);
        a();
        c();
        d();
        f();
        i();
        b.setText(0x7f0601ba);
        c.setText(0x7f0601b9);
        f.setText(0x7f0601b8);
        f.setOnClickListener(new android.view.View.OnClickListener() {

            final an a;

            public final void onClick(View view)
            {
                String s = null;
                String s1;
                ap ap1;
                if (a.p.isChecked())
                {
                    view = ReportCause.ABUSIVE_CONTENT;
                } else
                if (a.q.isChecked())
                {
                    view = ReportCause.INAPPROPRIATE_PHOTOS;
                } else
                if (a.r.isChecked())
                {
                    view = ReportCause.OFFLINE_BEHAVIOR;
                } else
                if (a.s.isChecked())
                {
                    view = ReportCause.SPAM;
                } else
                if (a.t.isChecked())
                {
                    view = ReportCause.OTHER;
                } else
                {
                    view = null;
                }
                s1 = a.e.getText().toString();
                ap1 = an.a(a);
                if (a.t.isChecked())
                {
                    s = s1;
                }
                ap1.a(view, s);
                a.dismiss();
            }

            
            {
                a = an.this;
                super();
            }
        });
        o.setOnCheckedChangeListener(this);
        p.setOnCheckedChangeListener(this);
        r.setOnCheckedChangeListener(this);
        q.setOnCheckedChangeListener(this);
        s.setOnCheckedChangeListener(this);
        t.setOnCheckedChangeListener(this);
        o.setOnTouchListener(this);
        p.setOnTouchListener(this);
        r.setOnTouchListener(this);
        q.setOnTouchListener(this);
        s.setOnTouchListener(this);
        t.setOnTouchListener(this);
        o.setChecked(true);
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        switch (compoundbutton.getId())
        {
        default:
            return;

        case 2131624406: 
            a(o, flag);
            return;

        case 2131624409: 
            a(p, flag);
            return;

        case 2131624412: 
            a(q, flag);
            return;

        case 2131624415: 
            a(r, flag);
            return;

        case 2131624418: 
            a(s, flag);
            return;

        case 2131624421: 
            a(t, flag);
            break;
        }
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        (new StringBuilder("motionEvent: ")).append(motionevent.getAction());
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 52
    //                   0 54
    //                   1 63
    //                   2 71
    //                   3 80;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L2:
        view.setAlpha(0.25F);
        continue; /* Loop/switch isn't completed */
_L3:
        view.setAlpha(1.0F);
        continue; /* Loop/switch isn't completed */
_L4:
        view.setAlpha(0.25F);
        continue; /* Loop/switch isn't completed */
_L5:
        view.setAlpha(1.0F);
        if (true) goto _L1; else goto _L6
_L6:
    }
}
