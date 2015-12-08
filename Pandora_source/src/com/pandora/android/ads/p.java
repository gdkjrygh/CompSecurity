// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.MediaController;
import com.pandora.android.util.s;
import p.df.a;

// Referenced classes of package com.pandora.android.ads:
//            n

public class p
    implements n
{

    private MediaController a;
    private Context b;
    private n.a c;
    private p.ca.bf.l d;
    private Handler e;

    public p(Context context, n.a a1, p.ca.bf.l l)
    {
        a = null;
        b = null;
        b = context;
        c = a1;
        d = l;
        e = new Handler(Looper.getMainLooper());
    }

    public void a()
    {
        d.a(0L);
        if (a == null || !a.isEnabled())
        {
            return;
        }
        try
        {
            a.hide();
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            return;
        }
    }

    public void a(int i)
    {
        if (a == null || !a.isEnabled())
        {
            return;
        }
        a((new StringBuilder()).append("showMediaController scrubber: ").append(i).toString());
        d.a();
        i *= 1000;
        if (!c.isPlaying() || !a.isShowing())
        {
            a.show(i);
        }
        e.postDelayed(new Runnable() {

            final p a;

            public void run()
            {
                a.a();
            }

            
            {
                a = p.this;
                super();
            }
        }, i);
    }

    public void a(int i, int j)
    {
    }

    public void a(View view, MediaPlayer mediaplayer)
    {
        a = new MediaController(b, false);
        a.setMediaPlayer(c);
        a.setAnchorView(view);
        view.findViewById(0x7f1002f4).setVisibility(8);
    }

    protected void a(String s1)
    {
        if (!s.p())
        {
            p.df.a.a("VIDEO AD", (new StringBuilder()).append("VIDEO AD - ").append(s1).toString());
        }
    }

    public void b(int i, int j)
    {
    }

    public void b(View view, MediaPlayer mediaplayer)
    {
    }

    public boolean b()
    {
        return a != null;
    }

    public void c()
    {
        if (a == null)
        {
            return;
        } else
        {
            a.hide();
            a.setEnabled(false);
            a.setAnchorView(null);
            a = null;
            return;
        }
    }

    public void d()
    {
    }
}
