// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.widget.SpotifyIconView;

public final class fjq extends fjr
{

    public android.view.View.OnClickListener a;
    public boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    private String g;
    private String h;
    private View i;
    private TextView j;
    private TextView k;
    private ImageView l;
    private Button m;

    public fjq()
    {
        this((byte)0);
    }

    private fjq(byte byte0)
    {
        this('\0');
    }

    private fjq(char c1)
    {
        c = -1;
        d = -1;
        e = -1;
        f = -1;
        c = -1;
        d = -1;
        e = 0x7f0801d6;
        f = 0x7f0801d5;
    }

    public fjq(int i1, String s, String s1)
    {
        this(i1, s, s1, (byte)0);
    }

    private fjq(int i1, String s, String s1, byte byte0)
    {
        c = -1;
        d = -1;
        e = -1;
        f = -1;
        c = i1;
        g = s;
        h = s1;
    }

    public fjq(String s)
    {
        c = -1;
        d = -1;
        e = -1;
        f = -1;
        d = 0x7f080544;
        e = 0x7f080543;
        h = s;
    }

    private static void a(TextView textview, int i1, String s)
    {
        if (i1 > 0)
        {
            textview.setText(i1);
            textview.setVisibility(0);
            return;
        }
        if (!TextUtils.isEmpty(s))
        {
            textview.setText(s);
            textview.setVisibility(0);
            return;
        } else
        {
            textview.setVisibility(8);
            return;
        }
    }

    public final void a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        i = layoutinflater.inflate(0x7f03013b, viewgroup, false);
        j = (TextView)i.findViewById(0x7f1104d0);
        k = (TextView)i.findViewById(0x7f1104d1);
        m = (Button)i.findViewById(0x7f1104d2);
        l = (ImageView)i.findViewById(0x7f1104cf);
        ((SpotifyIconView)i.findViewById(0x7f1102b9)).setOnClickListener(new android.view.View.OnClickListener() {

            private fjq a;

            public final void onClick(View view)
            {
                a.c();
            }

            
            {
                a = fjq.this;
                super();
            }
        });
        m.setOnClickListener(new android.view.View.OnClickListener() {

            private fjq a;

            public final void onClick(View view)
            {
                if (a.a != null)
                {
                    a.a.onClick(view);
                }
                if (a.b)
                {
                    a.c();
                }
            }

            
            {
                a = fjq.this;
                super();
            }
        });
        viewgroup.addView(i);
        a(j, d, null);
        a(k, e, g);
        a(((TextView) (m)), f, h);
        layoutinflater = l;
        int i1;
        if (c > 0)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        layoutinflater.setVisibility(i1);
        if (c > 0)
        {
            l.setImageResource(c);
        }
    }

    public final void a(ViewGroup viewgroup)
    {
        viewgroup.removeView(i);
    }
}
