// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.arist.activity.base.BaseActivity;
import com.arist.b.a;
import com.arist.model.equize.RotatView;
import com.arist.model.equize.l;
import com.arist.model.skin.ColorProgressBar;

// Referenced classes of package com.arist.activity:
//            f, g

public class EqualizerActivity extends BaseActivity
    implements android.widget.CompoundButton.OnCheckedChangeListener, l, com.arist.model.skin.l
{

    private ColorProgressBar a[];
    private com.arist.model.equize.a b;
    private CheckBox c;
    private View d;
    private RotatView e;
    private RotatView g;
    private TextView h;
    private TextView i;
    private Handler j;

    public EqualizerActivity()
    {
        a = new ColorProgressBar[6];
    }

    static com.arist.model.equize.a a(EqualizerActivity equalizeractivity)
    {
        return equalizeractivity.b;
    }

    private void a(boolean flag)
    {
        View view = d;
        int k;
        if (!flag)
        {
            k = 0;
        } else
        {
            k = 8;
        }
        view.setVisibility(k);
    }

    public final void a(float f1)
    {
        a[0].a(f1);
    }

    public final void a(a a1, float f1)
    {
        Log.i("setAudioEffectProgress", (new StringBuilder("max:")).append(f1).toString());
        a[1].a(((float)a1.b + f1) / (2.0F * f1));
        a[2].a(((float)a1.c + f1) / (2.0F * f1));
        a[3].a(((float)a1.d + f1) / (2.0F * f1));
        a[4].a(((float)a1.e + f1) / (2.0F * f1));
        a[5].a(((float)a1.f + f1) / (2.0F * f1));
    }

    public final void a(RotatView rotatview, float f1)
    {
        if (rotatview.getId() == 0x7f060016)
        {
            b.a(f1);
        } else
        if (rotatview.getId() == 0x7f060017)
        {
            b.b(f1);
            return;
        }
    }

    public final void a(ColorProgressBar colorprogressbar, boolean flag, float f1)
    {
        if (!flag)
        {
            return;
        }
        int k = ((Integer)colorprogressbar.getTag()).intValue();
        if (k == 0)
        {
            b.a(f1);
            return;
        } else
        {
            b.a(k, f1);
            a(getString(0x7f0900ab));
            b.d();
            return;
        }
    }

    public final void a(String s)
    {
        h.setText(s);
    }

    public final void b(String s)
    {
        i.setText(s);
    }

    public void handleClicked(View view)
    {
        switch (view.getId())
        {
        case 2131099665: 
        case 2131099670: 
        case 2131099671: 
        case 2131099672: 
        default:
            return;

        case 2131099664: 
            onBackPressed();
            return;

        case 2131099666: 
            b.k();
            return;

        case 2131099667: 
            b.i();
            return;

        case 2131099668: 
            view = b;
            a a1 = new a();
            a1.b = b.b(a[1].a());
            a1.c = b.b(a[2].a());
            a1.d = b.b(a[3].a());
            a1.e = b.b(a[4].a());
            a1.f = b.b(a[5].a());
            view.b(a1);
            return;

        case 2131099669: 
            b.j();
            return;

        case 2131099673: 
            b.l();
            break;
        }
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        b.a(flag);
        a(flag);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030001);
        b = new com.arist.model.equize.a(this);
        j = new Handler();
        bundle = (LinearLayout)findViewById(0x7f060082);
        int k = 0;
        do
        {
            if (k >= a.length)
            {
                c = (CheckBox)findViewById(0x7f060011);
                c.setChecked(b.b());
                c.setOnCheckedChangeListener(this);
                d = findViewById(0x7f06001a);
                d.setOnTouchListener(new f(this));
                e = (RotatView)findViewById(0x7f060016);
                g = (RotatView)findViewById(0x7f060017);
                h = (TextView)findViewById(0x7f060012);
                i = (TextView)findViewById(0x7f060015);
                bundle = b.c();
                a(((a) (bundle)).a);
                b(b.e());
                a(bundle, b.f() / 2);
                a(b.a());
                e.a(b.g());
                g.a(b.h());
                e.a(this);
                g.a(this);
                a(b.b());
                return;
            }
            a[k] = (ColorProgressBar)bundle.getChildAt(k).findViewById(0x7f060083);
            a[k].a(this);
            a[k].setTag(Integer.valueOf(k));
            k++;
        } while (true);
    }

    public boolean onKeyDown(int k, KeyEvent keyevent)
    {
        boolean flag = super.onKeyDown(k, keyevent);
        if (k == 25 || k == 24)
        {
            j.postDelayed(new g(this), 100L);
        }
        return flag;
    }
}
