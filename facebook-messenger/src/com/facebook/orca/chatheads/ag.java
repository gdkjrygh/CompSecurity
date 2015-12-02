// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.facebook.common.hardware.q;
import com.facebook.d;
import com.facebook.f;
import com.facebook.g;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.f.k;
import com.facebook.orca.photos.a.b;
import com.facebook.orca.photos.a.e;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threadview.cb;
import com.facebook.orca.threadview.ci;
import com.facebook.orca.threadview.co;
import com.facebook.orca.threadview.cp;
import com.facebook.user.User;
import com.facebook.widget.tiles.ThreadTileView;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.chatheads:
//            e, ah, ai, aj, 
//            d

public class ag extends com.facebook.orca.chatheads.e
{

    private static final int a[];
    private final ci b;
    private final k c;
    private final cb d = new ai(this, getContext());
    private final e e;
    private final q f;
    private final b g;
    private final com.facebook.common.hardware.t h = new ah(this);
    private final ThreadTileView i;
    private final TextView j;
    private ThreadViewSpec k;
    private ThreadViewSpec l;
    private com.facebook.orca.chatheads.d m;
    private boolean n;
    private int o;
    private boolean p;
    private ThreadSummary q;
    private boolean r;

    public ag(Context context)
    {
        super(context);
        context = getInjector();
        b = (ci)context.a(com/facebook/orca/threadview/ci);
        c = (k)context.a(com/facebook/orca/f/k);
        e = (e)context.a(com/facebook/orca/photos/a/e);
        f = (q)context.a(com/facebook/common/hardware/q);
        g = (b)context.a(com/facebook/orca/photos/a/b);
        setContentView(com.facebook.k.orca_chat_head);
        i = (ThreadTileView)c(i.thread_tile_img);
        j = (TextView)c(i.unread_message_count);
        context = getResources();
        j.setShadowLayer(context.getDimension(g.chat_head_badge_shadow_radius), context.getDimension(g.chat_head_badge_shadow_dx), context.getDimension(g.chat_head_badge_shadow_dy), context.getColor(f.chat_heads_badge_shadow));
        r();
        p();
    }

    private void a(ThreadViewSpec threadviewspec)
    {
        i.setThreadTileViewData(e.a(g.a(threadviewspec)));
    }

    static void a(ag ag1)
    {
        ag1.o();
    }

    static void a(ag ag1, ThreadSummary threadsummary)
    {
        ag1.a(threadsummary);
    }

    static void a(ag ag1, cp cp1)
    {
        ag1.a(cp1);
    }

    static void a(ag ag1, User user)
    {
        ag1.a(user);
    }

    private void a(ThreadSummary threadsummary)
    {
        b(threadsummary);
    }

    private void a(cp cp1)
    {
        if (l.c())
        {
            return;
        } else
        {
            b(cp1.a);
            return;
        }
    }

    private void a(User user)
    {
        i.setThreadTileViewData(e.a(user));
    }

    private void b(ThreadSummary threadsummary)
    {
        if (!q())
        {
            q = threadsummary;
        } else
        if (threadsummary != null)
        {
            i.setThreadTileViewData(e.a(threadsummary));
            invalidate();
            return;
        }
    }

    private void o()
    {
        if (q != null)
        {
            b(q);
            q = null;
        }
    }

    private void p()
    {
        b.a(new aj(this));
    }

    private boolean q()
    {
        return f.a();
    }

    private void r()
    {
        if (r && o > 0)
        {
            j.setVisibility(0);
            j.setText(String.valueOf(o));
            return;
        } else
        {
            j.setVisibility(8);
            return;
        }
    }

    public com.facebook.orca.chatheads.d getActionState()
    {
        return m;
    }

    public ThreadViewSpec getPendingThreadViewSpec()
    {
        return k;
    }

    public ThreadViewSpec getThreadViewSpec()
    {
        return l;
    }

    public int getUnreadCount()
    {
        return o;
    }

    public ag i()
    {
        ag ag1 = new ag(getContext());
        ag1.setPendingThreadViewSpec(getThreadViewSpec());
        ag1.setThreadViewSpec(getThreadViewSpec());
        ag1.setUnreadCount(o);
        ag1.m = m;
        ag1.n = n;
        ag1.p = p;
        return ag1;
    }

    public boolean j()
    {
        return p;
    }

    public void k()
    {
        p = true;
    }

    public void l()
    {
        co co1 = new co(false, false);
        b.a(co1);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        d.a();
        d.a(true);
        f.a(h);
    }

    protected int[] onCreateDrawableState(int i1)
    {
        int ai1[] = super.onCreateDrawableState(i1 + 1);
        if (m == d.CLOSE)
        {
            mergeDrawableStates(ai1, a);
        }
        return ai1;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        d.a(false);
        d.b();
        f.b(h);
    }

    public void setActionState(com.facebook.orca.chatheads.d d1)
    {
        if (m == d1)
        {
            return;
        } else
        {
            m = d1;
            refreshDrawableState();
            return;
        }
    }

    public void setPendingThreadViewSpec(ThreadViewSpec threadviewspec)
    {
        k = threadviewspec;
    }

    public void setShouldShowUnreadCount(boolean flag)
    {
        if (flag == r)
        {
            return;
        } else
        {
            r = flag;
            r();
            return;
        }
    }

    public void setThreadViewSpec(ThreadViewSpec threadviewspec)
    {
        boolean flag;
        if (threadviewspec == k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        k = null;
        if (ThreadViewSpec.a(threadviewspec, l))
        {
            return;
        }
        a(threadviewspec);
        l = threadviewspec;
        b.a(threadviewspec);
        d.a(threadviewspec);
        if (threadviewspec.a())
        {
            threadviewspec = c.b(threadviewspec.d());
            if (threadviewspec == null)
            {
                l();
                return;
            } else
            {
                b(threadviewspec);
                return;
            }
        } else
        {
            l();
            return;
        }
    }

    public void setUnreadCount(int i1)
    {
        if (o == i1)
        {
            return;
        } else
        {
            o = i1;
            r();
            return;
        }
    }

    public void setUnreadCountOnLeftSide(boolean flag)
    {
        if (n == flag)
        {
            return;
        }
        n = flag;
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)j.getLayoutParams();
        if (n)
        {
            layoutparams.gravity = 51;
        } else
        {
            layoutparams.gravity = 53;
        }
        j.setLayoutParams(layoutparams);
    }

    static 
    {
        a = (new int[] {
            d.state_deleting
        });
    }
}
