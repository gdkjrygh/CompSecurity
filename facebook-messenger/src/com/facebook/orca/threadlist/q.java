// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.common.w.j;
import com.facebook.common.w.o;
import com.facebook.h;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.l.x;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.messages.threads.ui.name.ThreadNameView;
import com.facebook.orca.annotations.IsThreadlistOnlineAndMobilePresenceEnabled;
import com.facebook.orca.annotations.IsThreadlistOnlinePresenceEnabled;
import com.facebook.orca.common.ui.widgets.text.MultilineEllipsizeTextView;
import com.facebook.orca.common.ui.widgets.text.a;
import com.facebook.orca.f.k;
import com.facebook.orca.f.z;
import com.facebook.orca.p.b;
import com.facebook.orca.p.d;
import com.facebook.orca.photos.a.e;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.n;
import com.facebook.orca.threadview.v;
import com.facebook.widget.CustomRelativeLayout;
import com.facebook.widget.tiles.ThreadTileView;
import com.google.common.a.es;
import com.google.common.base.Objects;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.orca.threadlist:
//            r, al

public class q extends CustomRelativeLayout
{

    private static final Class a = com/facebook/orca/threadlist/q;
    private static final Pattern b = Pattern.compile("\\n+");
    private k c;
    private z d;
    private n e;
    private com.facebook.orca.threads.q f;
    private com.facebook.orca.emoji.z g;
    private a h;
    private e i;
    private ThreadNameView j;
    private ImageView k;
    private ThreadTileView l;
    private MultilineEllipsizeTextView m;
    private TextView n;
    private ImageView o;
    private ThreadSummary p;
    private al q;
    private javax.inject.a r;
    private javax.inject.a s;
    private b t;
    private d u;
    private x v;

    public q(Context context)
    {
        super(context);
        v = x.a;
        a(context);
    }

    private static String a(ThreadSummary threadsummary)
    {
        if (threadsummary != null)
        {
            return threadsummary.a();
        } else
        {
            return "<null>";
        }
    }

    private void a(Context context)
    {
        context = getInjector();
        c = (k)context.a(com/facebook/orca/f/k);
        d = (z)context.a(com/facebook/orca/f/z);
        e = (n)context.a(com/facebook/orca/threads/n);
        f = (com.facebook.orca.threads.q)context.a(com/facebook/orca/threads/q);
        g = (com.facebook.orca.emoji.z)context.a(com/facebook/orca/emoji/z);
        h = (a)context.a(com/facebook/orca/common/ui/widgets/text/a);
        i = (e)context.a(com/facebook/orca/photos/a/e);
        setContentView(com.facebook.k.orca_thread_list_item);
        j = (ThreadNameView)a(i.thread_name);
        k = (ImageView)a(i.thread_presence_indicator);
        l = (ThreadTileView)a(i.thread_tile_img);
        m = (MultilineEllipsizeTextView)a(i.thread_last_msg);
        n = (TextView)a(i.thread_time);
        o = (ImageView)a(i.thread_failed_icon);
        r = context.b(java/lang/Boolean, com/facebook/orca/annotations/IsThreadlistOnlinePresenceEnabled);
        s = context.b(java/lang/Boolean, com/facebook/orca/annotations/IsThreadlistOnlineAndMobilePresenceEnabled);
        t = (b)context.a(com/facebook/orca/p/b);
        u = new r(this);
        t.a(u);
    }

    private void a(x x1)
    {
        if (v == x1)
        {
            return;
        } else
        {
            b(x1);
            return;
        }
    }

    private void a(x x1, boolean flag)
    {
        if (x1.a() == com.facebook.l.a.AVAILABLE)
        {
            k.setImageResource(h.orca_online_icon_thread);
            k.setVisibility(0);
            return;
        }
        if (x1.b() && flag)
        {
            k.setImageResource(h.orca_mobile_icon_thread);
            k.setVisibility(0);
            return;
        } else
        {
            k.setVisibility(8);
            return;
        }
    }

    static void a(q q1, x x1)
    {
        q1.a(x1);
    }

    private void a(v v1)
    {
        t.a(v1);
        b(t.c());
    }

    private void a(boolean flag)
    {
        if (q == al.NORMAL)
        {
            int i1;
            if (flag)
            {
                i1 = h.orca_thread_list_item_unread_background;
            } else
            {
                i1 = h.orca_thread_list_read_item_background;
            }
            setBackgroundResource(i1);
            return;
        } else
        {
            setBackgroundResource(0x106000d);
            return;
        }
    }

    private CharSequence b(ThreadSummary threadsummary)
    {
        String s1;
        Object obj;
        Object obj1;
        Resources resources;
        s1 = threadsummary.o();
        if (!com.facebook.common.w.n.a(s1))
        {
            return s1;
        }
        s1 = threadsummary.n();
        obj = threadsummary.p();
        if (s1 == null || obj == null)
        {
            return "";
        }
        obj1 = b.matcher(s1);
        if (((Matcher) (obj1)).find())
        {
            s1 = ((Matcher) (obj1)).replaceAll(" ");
        }
        resources = getContext().getResources();
        obj1 = new o(getResources());
        if (!Objects.equal(((ParticipantInfo) (obj)).e(), c.b())) goto _L2; else goto _L1
_L1:
        obj = resources.getDrawable(h.orca_reply_arrow);
        if (!threadsummary.h()) goto _L4; else goto _L3
_L3:
        ThreadParticipant threadparticipant = f.b(threadsummary);
        if (threadparticipant == null || threadsummary.l() >= threadparticipant.i()) goto _L6; else goto _L5
_L5:
        threadsummary = resources.getDrawable(h.orca_inbox_seen);
_L8:
        threadsummary.setBounds(0, 0, threadsummary.getIntrinsicWidth(), threadsummary.getIntrinsicHeight());
        ((o) (obj1)).a(new ImageSpan(threadsummary), 33);
        ((o) (obj1)).a("\240");
        ((o) (obj1)).a();
        ((o) (obj1)).a("\240");
        ((o) (obj1)).a(s1);
_L9:
        threadsummary = ((o) (obj1)).b();
        int i1 = com.facebook.common.w.j.b(getContext(), 12F);
        g.a(threadsummary, i1);
        return threadsummary;
_L4:
        boolean flag;
        Iterator iterator = threadsummary.j().iterator();
        ThreadParticipant threadparticipant1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_427;
            }
            threadparticipant1 = (ThreadParticipant)iterator.next();
        } while (Objects.equal(c.b(), threadparticipant1.d()) || threadsummary.l() < threadparticipant1.i());
        flag = false;
_L10:
        if (!flag) goto _L6; else goto _L7
_L7:
        threadsummary = resources.getDrawable(h.orca_inbox_seen);
          goto _L8
_L2:
        if (d.c(threadsummary) == 2)
        {
            ((o) (obj1)).a(s1);
        } else
        if (threadsummary.f())
        {
            threadsummary = c.b(((ParticipantInfo) (obj)));
            if (threadsummary != null)
            {
                ((o) (obj1)).a((new StringBuilder()).append(threadsummary).append(": ").append(s1).toString());
            } else
            {
                ((o) (obj1)).a(s1);
            }
        } else
        {
            ((o) (obj1)).a(s1);
        }
          goto _L9
_L6:
        threadsummary = ((ThreadSummary) (obj));
          goto _L8
        flag = true;
          goto _L10
    }

    private void b(x x1)
    {
        if (!((Boolean)r.b()).booleanValue() && !((Boolean)s.b()).booleanValue())
        {
            return;
        } else
        {
            v = x1;
            a(v, ((Boolean)s.b()).booleanValue());
            return;
        }
    }

    private void d()
    {
        v v1 = h.a(p);
        j.setData(v1);
        a(v1);
        l.setThreadTileViewData(i.a(p));
        m.setText(b(p));
        n.setText(e.a(p.l()));
        boolean flag;
        if (c.a(p.a()) < p.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        if (p.x())
        {
            o.setVisibility(0);
            return;
        } else
        {
            o.setVisibility(8);
            return;
        }
    }

    void a()
    {
        if (q == al.NORMAL)
        {
            boolean flag;
            if (c.a(p.a()) < p.c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag);
        }
    }

    void a(ThreadSummary threadsummary, al al1)
    {
        if (threadsummary != p || al1 != q)
        {
            com.facebook.debug.log.b.a(a, "addThreadToThreadList (%s to %s)", new Object[] {
                a(p), a(threadsummary)
            });
            p = threadsummary;
            q = al1;
            d();
            return;
        } else
        {
            a();
            return;
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.widget.RelativeLayout.LayoutParams(-1, -2);
    }

    String getThreadId()
    {
        if (p != null)
        {
            return p.a();
        } else
        {
            return null;
        }
    }

    ThreadSummary getThreadSummary()
    {
        return p;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        t.a(true);
        b(t.c());
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        t.a(false);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        Object obj;
        if (p != null)
        {
            obj = p.a();
        } else
        {
            obj = "<none>";
        }
        obj = com.facebook.debug.d.e.a((new StringBuilder()).append("ThreadItemView.onLayout (").append(((String) (obj))).append(")").toString());
        super.onLayout(flag, i1, j1, k1, l1);
        ((com.facebook.debug.d.e) (obj)).a();
    }

    protected void onMeasure(int i1, int j1)
    {
        Object obj;
        if (p != null)
        {
            obj = p.a();
        } else
        {
            obj = "<none>";
        }
        obj = com.facebook.debug.d.e.a((new StringBuilder()).append("ThreadItemView.onMeasure (").append(((String) (obj))).append(")").toString());
        super.onMeasure(i1, j1);
        ((com.facebook.debug.d.e) (obj)).a();
    }

    public void setThreadIconSize(int i1)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)l.getLayoutParams();
        layoutparams.width = i1;
        layoutparams.height = i1;
        l.setTileSizePx(i1);
        l.setLayoutParams(layoutparams);
    }

    public void setThreadNameColor(int i1)
    {
        j.setTextColor(i1);
    }

    public void setThreadNameSize(int i1)
    {
        j.a(i1, i1);
    }

    public void setTimeTextColor(int i1)
    {
        n.setTextColor(i1);
    }

}
