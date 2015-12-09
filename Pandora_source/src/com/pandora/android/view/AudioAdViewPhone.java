// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.pandora.android.activity.j;
import com.pandora.android.eureka.a;
import com.pandora.android.provider.b;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.y;
import com.pandora.radio.util.k;
import p.cw.c;
import p.dd.bh;
import p.l.d;
import p.l.g;
import p.l.i;

// Referenced classes of package com.pandora.android.view:
//            NowPlayingView

public class AudioAdViewPhone extends NowPlayingView
{

    private ImageView a;
    private aa b;
    private j c;

    public AudioAdViewPhone(Context context)
    {
        super(context);
        a();
    }

    public static AudioAdViewPhone a(Context context, aa aa1)
    {
        context = new AudioAdViewPhone(context);
        context.a(aa1, null, null);
        return context;
    }

    static aa a(AudioAdViewPhone audioadviewphone)
    {
        return audioadviewphone.b;
    }

    protected void a()
    {
        LayoutInflater.from(getContext()).inflate(getLayoutResId(), this, true);
        a = (ImageView)findViewById(0x7f1000d8);
    }

    public void a(aa aa1, String s, String s1)
    {
        a.setOnClickListener(new android.view.View.OnClickListener() {

            final AudioAdViewPhone a;

            public void onClick(View view)
            {
                com.pandora.android.activity.a.a((FragmentActivity)a.getContext(), com.pandora.android.view.AudioAdViewPhone.a(a));
            }

            
            {
                a = AudioAdViewPhone.this;
                super();
            }
        });
        boolean flag = b.a.b().d().t().A();
        s = findViewById(0x7f1000b0);
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        s.setVisibility(byte0);
        findViewById(0x7f1000b0).setOnClickListener(new android.view.View.OnClickListener() {

            final AudioAdViewPhone a;

            public void onClick(View view)
            {
                b.a.b().o().a(com.pandora.radio.util.k.a.c, com.pandora.android.ads.h.a.a.name(), null, new com.pandora.radio.data.b());
                com.pandora.android.activity.a.a((FragmentActivity)a.getContext());
            }

            
            {
                a = AudioAdViewPhone.this;
                super();
            }
        });
        c = (j)getContext();
        c.setDisplayMode(com.pandora.android.activity.j.a.c);
        if (aa1 != null && a != null)
        {
            g.b(getContext()).a(aa1.v()).a(p.s.b.c).a(i.b).a(0x7f0200e9).a(a);
        }
        setTag("viewExcludedFromHistory");
    }

    public void b()
    {
    }

    public boolean c()
    {
        return false;
    }

    protected boolean d()
    {
        return false;
    }

    public void e()
    {
    }

    protected int getLayoutResId()
    {
        return 0x7f040029;
    }

    public aa getTrackData()
    {
        return b;
    }

    public String getTrackKey()
    {
        return null;
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            b.a.b().b(this);
            b.a.e().c(this);
            return;
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            b.a.b().c(this);
            b.a.e().b(this);
            b.a.c().e();
            return;
        }
    }

    public void onTrackState(bh bh1)
    {
        if (bh1.b != null && bh1.b.M())
        {
            b = bh1.b;
        }
    }
}
