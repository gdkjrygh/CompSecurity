// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.android.paste.widget.SpotifyIconView;

public final class fju extends fjr
{

    private int a;
    private int b;
    private View c;
    private TextView d;
    private TextView e;

    public fju()
    {
        a = -1;
        b = -1;
        cvp.a(true, "You must specify a title string resource ID");
        cvp.a(true, "You must specify a body string resource ID");
        a = 0x7f08037f;
        b = 0x7f08037e;
    }

    public final void a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        c = layoutinflater.inflate(0x7f03013d, viewgroup, false);
        d = (TextView)c.findViewById(0x7f1104d0);
        e = (TextView)c.findViewById(0x7f1104d1);
        ((SpotifyIconView)c.findViewById(0x7f1102b9)).setOnClickListener(new android.view.View.OnClickListener() {

            private fju a;

            public final void onClick(View view)
            {
                a.c();
            }

            
            {
                a = fju.this;
                super();
            }
        });
        viewgroup.addView(c);
        if (a > 0)
        {
            d.setText(a);
        } else
        {
            d.setText(null);
        }
        d.setVisibility(0);
        if (b > 0)
        {
            e.setText(b);
        } else
        {
            e.setText(null);
        }
        e.setVisibility(0);
    }

    public final void a(ViewGroup viewgroup)
    {
        viewgroup.removeView(c);
    }
}
