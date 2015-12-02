// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.l.a;
import com.facebook.l.x;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.messages.threads.ui.name.ThreadNameView;
import com.facebook.orca.p.b;
import com.facebook.orca.presence.PresenceIndicatorView;
import com.facebook.q;
import com.facebook.user.UserKey;
import com.facebook.user.i;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.orca.threadview:
//            ba, v

public class ThreadTitleView extends f
{

    private final b a;
    private final i b;
    private final boolean c;
    private final ThreadNameView d;
    private final TextView e;
    private final PresenceIndicatorView f;
    private final ProgressBar g;
    private x h;
    private v i;

    public ThreadTitleView(Context context)
    {
        this(context, null);
    }

    public ThreadTitleView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ThreadTitleView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        h = x.a;
        t t1 = getInjector();
        a = (b)t1.a(com/facebook/orca/p/b);
        b = (i)t1.a(com/facebook/user/i);
        c = context.obtainStyledAttributes(attributeset, q.ThreadTitleView).getBoolean(q.ThreadTitleView_chatStyle, false);
        if (c)
        {
            setContentView(k.orca_chat_heads_thread_view_title);
        } else
        {
            setContentView(k.orca_thread_title);
        }
        d = (ThreadNameView)getView(com.facebook.i.thread_title_name);
        e = (TextView)getView(com.facebook.i.thread_title_status);
        f = (PresenceIndicatorView)getView(com.facebook.i.thread_title_presence_indicator);
        g = (ProgressBar)getView(com.facebook.i.thread_title_progress);
        context = new ba(this);
        a.a(context);
    }

    private void a()
    {
        if (a.b())
        {
            b(true);
            b(a.c());
            b();
            return;
        }
        if (i != null && i.f())
        {
            b(true);
            b();
            return;
        } else
        {
            b(false);
            return;
        }
    }

    private void a(x x1)
    {
        if (h == x1)
        {
            return;
        } else
        {
            b(x1);
            return;
        }
    }

    static void a(ThreadTitleView threadtitleview, x x1)
    {
        threadtitleview.a(x1);
    }

    private void b()
    {
        if (e != null)
        {
            c();
        }
        if (f != null)
        {
            d();
        }
    }

    private void b(x x1)
    {
        h = x1;
        b();
    }

    private void b(boolean flag)
    {
        if (flag || c)
        {
            d.setMaxLines(1);
            d.getLayoutParams().height = -2;
        } else
        {
            d.setMaxLines(2);
            d.getLayoutParams().height = -1;
        }
        if (e != null)
        {
            e.setVisibility(8);
        }
        if (f != null)
        {
            f.setVisibility(8);
        }
    }

    private void c()
    {
        if (i == null || !i.f()) goto _L2; else goto _L1
_L1:
        ParticipantInfo participantinfo = i.d();
        if (participantinfo == null) goto _L4; else goto _L3
_L3:
        String s = b.c(participantinfo.e().b());
        if (participantinfo.d().equals(s)) goto _L4; else goto _L5
_L5:
        if (s != null)
        {
            e.setVisibility(0);
            e.setText(s);
            return;
        } else
        {
            e.setVisibility(8);
            e.setText("");
            return;
        }
_L2:
        s = a.d();
        continue; /* Loop/switch isn't completed */
_L4:
        s = null;
        if (true) goto _L5; else goto _L6
_L6:
    }

    private void d()
    {
        if (f == null)
        {
            return;
        }
        x x1 = a.c();
        if (x1.a() == a.AVAILABLE)
        {
            f.a(com.facebook.orca.presence.i.ONLINE, null);
            f.setVisibility(0);
            return;
        }
        if (x1.b())
        {
            String s = a.e();
            f.a(com.facebook.orca.presence.i.PUSHABLE, s);
            f.setVisibility(0);
            return;
        } else
        {
            f.setVisibility(8);
            return;
        }
    }

    public void a(boolean flag)
    {
        ProgressBar progressbar = g;
        int j;
        if (flag)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        progressbar.setVisibility(j);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a.a(true);
        a();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        a.a(false);
        b(false);
    }

    public void setThreadNameViewData(v v1)
    {
        i = v1;
        d.setData(v1);
        a.a(v1);
        a();
    }
}
