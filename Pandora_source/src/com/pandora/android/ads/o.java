// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.pandora.android.util.ae;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.pandora.android.ads:
//            n

public class o
    implements n
{

    protected p.ca.bf.l a;
    private ProgressBar b;
    private TextView c;
    private ImageButton d;
    private n.a e;

    public o(n.a a1, p.ca.bf.l l)
    {
        e = a1;
        a = l;
    }

    static void a(o o1)
    {
        o1.e();
    }

    private void e()
    {
        if (e.isPlaying())
        {
            ae.a(true, d, 0x7f020236, 0x7f020233);
            e.pause();
            return;
        } else
        {
            ae.a(false, d, 0x7f020236, 0x7f020233);
            e.start();
            return;
        }
    }

    private void f()
    {
        if (e.isPlaying())
        {
            ae.a(false, d, 0x7f020236, 0x7f020233);
            return;
        } else
        {
            ae.a(true, d, 0x7f020236, 0x7f020233);
            return;
        }
    }

    public void a()
    {
    }

    public void a(int i)
    {
        a.a();
        if (i > 0)
        {
            a.a(i * 1000);
        }
    }

    public void a(int i, int j)
    {
        b.setProgress(i);
        SimpleDateFormat simpledateformat = new SimpleDateFormat("m:ss", Locale.US);
        c.setText(simpledateformat.format(new Date(j - i)));
    }

    public void a(View view, MediaPlayer mediaplayer)
    {
        b = (ProgressBar)view.findViewById(0x7f1002f7);
        c = (TextView)view.findViewById(0x7f1002f6);
        d = (ImageButton)view.findViewById(0x7f1002f5);
        d.setOnClickListener(new android.view.View.OnClickListener() {

            final o a;

            public void onClick(View view1)
            {
                o.a(a);
            }

            
            {
                a = o.this;
                super();
            }
        });
    }

    public void b(int i, int j)
    {
        b.setMax(i);
        b.setProgress(j);
        d.setImageResource(0x7f020233);
    }

    public void b(View view, MediaPlayer mediaplayer)
    {
        a(view, mediaplayer);
        b(mediaplayer.getDuration(), mediaplayer.getCurrentPosition());
        f();
    }

    public boolean b()
    {
        return b != null && c != null;
    }

    public void c()
    {
    }

    public void d()
    {
        e();
    }
}
