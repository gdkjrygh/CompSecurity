// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.text.util.Linkify;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.analytics.cn;
import com.facebook.auth.annotations.ViewerContextUserKey;
import com.facebook.g;
import com.facebook.h;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.messages.model.threads.SendError;
import com.facebook.orca.annotations.IsAudioPlayerEnabled;
import com.facebook.orca.common.a.c;
import com.facebook.orca.common.ui.a.b;
import com.facebook.orca.f.k;
import com.facebook.orca.share.ShareView;
import com.facebook.orca.share.a;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.n;
import com.facebook.user.UserKey;
import com.facebook.user.tiles.UserTileView;
import com.facebook.widget.e;
import com.facebook.widget.text.BetterTextView;
import com.facebook.widget.text.j;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewAudioAttachmentView, m, n, o, 
//            dm, p, ThreadViewOtherAttachmentsView, ThreadViewImageAttachmentView, 
//            ad, ReceiptItemView, r, q

public class l extends e
{

    private r A;
    private ad B;
    private Message C;
    private boolean D;
    private k a;
    private b b;
    private n c;
    private a d;
    private com.facebook.orca.attachments.a e;
    private javax.inject.a f;
    private cn g;
    private UserKey h;
    private FrameLayout i;
    private LinearLayout j;
    private BetterTextView k;
    private TextView l;
    private UserTileView m;
    private ShareView n;
    private ViewStub o;
    private ViewStub p;
    private ViewStub q;
    private ViewStub r;
    private ThreadViewImageAttachmentView s;
    private ThreadViewAudioAttachmentView t;
    private ThreadViewOtherAttachmentsView u;
    private ImageButton v;
    private ReceiptItemView w;
    private LinearLayout x;
    private TextView y;
    private View z;

    public l(Context context, AttributeSet attributeset, boolean flag)
    {
        super(context, attributeset);
        D = flag;
        setOrientation(1);
        context = getInjector();
        a = (k)context.a(com/facebook/orca/f/k);
        b = (b)context.a(com/facebook/orca/common/ui/a/b);
        c = (n)context.a(com/facebook/orca/threads/n);
        d = (a)context.a(com/facebook/orca/share/a);
        e = (com.facebook.orca.attachments.a)context.a(com/facebook/orca/attachments/a);
        f = context.b(java/lang/Boolean, com/facebook/orca/annotations/IsAudioPlayerEnabled);
        g = (cn)context.a(com/facebook/analytics/cn);
        h = (UserKey)context.a(com/facebook/user/UserKey, com/facebook/auth/annotations/ViewerContextUserKey);
        int i1;
        if (D)
        {
            i1 = com.facebook.k.orca_message_me_user_item;
        } else
        {
            i1 = com.facebook.k.orca_message_item;
        }
        setContentView(i1);
        i = (FrameLayout)a(i.message_container);
        j = (LinearLayout)a(i.message_bubble_container);
        k = (BetterTextView)a(i.message_text);
        m = (UserTileView)a(i.message_user_tile);
        t = (ThreadViewAudioAttachmentView)a(i.message_audio);
        l = (TextView)a(i.message_left_bubble_sender_name);
        context = new j(k);
        context.a(new m(this));
        k.a(context);
        i1 = com.facebook.common.w.j.a(getContext(), 6F);
        setPadding(0, i1, 0, i1);
        setClickable(true);
    }

    public l(Context context, boolean flag)
    {
        this(context, null, flag);
    }

    static r a(l l1)
    {
        return l1.A;
    }

    private void a()
    {
        if (m())
        {
            k.setVisibility(0);
            Object obj = b.a(C);
            obj = android.text.Spannable.Factory.getInstance().newSpannable(((CharSequence) (obj)));
            Linkify.addLinks(((android.text.Spannable) (obj)), 15);
            k.setText(((CharSequence) (obj)));
        } else
        {
            k.setVisibility(8);
        }
        if (j.isClickable())
        {
            j.setOnClickListener(new com.facebook.orca.threadview.n(this));
        }
        j.setOnLongClickListener(new o(this));
        if (D)
        {
            Object obj1;
            int i1;
            boolean flag;
            if (com.facebook.orca.threadview.dm.a(com.facebook.orca.threadview.dm.a(C)))
            {
                i1 = h.orca_convo_bubble_green_button;
            } else
            {
                i1 = h.orca_convo_bubble_blue_button;
            }
            j.setBackgroundDrawable(getResources().getDrawable(i1));
        } else
        {
            j.setBackgroundResource(h.orca_convo_bubble_white_button);
            m.setParams(com.facebook.user.tiles.e.a(C.i().e()));
            m.setVisibility(0);
            obj2 = a.b(C.e());
            if (obj2 == null || ((ThreadSummary) (obj2)).h())
            {
                l.setVisibility(8);
            } else
            {
                l.setVisibility(0);
                l.setText(a.a(C.i()));
            }
        }
        if (z != null)
        {
            z.setVisibility(8);
        }
        if (((Boolean)f.b()).booleanValue() && (e.c(C) || e.d(C)))
        {
            obj1 = e.e(C);
            e();
            if (q != null)
            {
                t = (ThreadViewAudioAttachmentView)q.inflate();
                t.setForMeUser(D);
                q = null;
            }
            t.setVisibility(0);
            t.setAudioAttachmentData(((com.facebook.orca.attachments.AudioAttachmentData) (obj1)));
            t.a(this);
        } else
        {
            if (t != null)
            {
                t.setVisibility(8);
            }
            j.setVisibility(0);
        }
        obj1 = d.a(C);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        f();
        flag = com.facebook.orca.stickers.i.a(C, ((com.facebook.messages.model.share.Share) (obj1)));
        if (o != null)
        {
            n = (ShareView)o.inflate();
            n.setListener(new p(this, flag));
            o = null;
        }
        n.getLayoutParams().width = -2;
        n.setVisibility(0);
        n.a(((com.facebook.messages.model.share.Share) (obj1)), flag);
        if (flag)
        {
            j.setBackgroundResource(0x106000d);
        }
_L8:
        if (Boolean.valueOf(e.f(C)).booleanValue())
        {
            g();
            if (r != null)
            {
                u = (ThreadViewOtherAttachmentsView)r.inflate();
                r = null;
            }
            u.setVisibility(0);
            u.setMessage(C);
        } else
        if (u != null)
        {
            u.setVisibility(8);
        }
        if (e.a(C))
        {
            h();
            if (p != null)
            {
                s = (ThreadViewImageAttachmentView)p.inflate();
                p = null;
            }
            s.setVisibility(0);
            s.setMessage(C);
            s.a(this);
        } else
        if (s != null)
        {
            s.setVisibility(8);
        }
        if (C.u() == 901)
        {
            i();
            v.setVisibility(0);
            g.a(C.w(), C.K().a());
        } else
        if (v != null)
        {
            v.setVisibility(8);
        }
        if (B.d() != null)
        {
            j();
            w.setRowReceiptItem(B.d());
            w.setVisibility(0);
            Object obj2 = (android.widget.FrameLayout.LayoutParams)w.getLayoutParams();
            if (Objects.equal(h, C.i().e()))
            {
                obj2.leftMargin = 0;
                obj2.rightMargin = com.facebook.common.w.j.a(getContext(), 6F);
                obj2.gravity = 5;
            } else
            {
                obj2.leftMargin = com.facebook.common.w.j.a(getContext(), 50.5F);
                obj2.rightMargin = 0;
                obj2.gravity = 3;
            }
        } else
        if (w != null)
        {
            w.setVisibility(8);
        }
        if (!B.c()) goto _L4; else goto _L3
_L3:
        k();
        if (C.g() && C.h() < C.f())
        {
            y.setText(c.c(C.h()));
        } else
        {
            y.setText(c.c(C.f()));
        }
        x.setVisibility(0);
_L6:
        return;
_L2:
        if (n != null)
        {
            n.setVisibility(8);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (x == null) goto _L6; else goto _L5
_L5:
        x.setVisibility(8);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(ViewStub viewstub, int i1)
    {
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if (!a(viewstub, r, ((View) (u))) && !a(viewstub, p, ((View) (s))))
        {
            j.addView(viewstub);
        }
_L4:
        return;
_L2:
        if (i1 != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a(viewstub, p, ((View) (s)))) goto _L4; else goto _L3
_L3:
        j.addView(viewstub);
        return;
        if (i1 != 2) goto _L4; else goto _L5
_L5:
        j.addView(viewstub);
        return;
    }

    private boolean a(ViewStub viewstub, ViewStub viewstub1, View view)
    {
        if (viewstub1 != null || view != null)
        {
            LinearLayout linearlayout = j;
            int i1;
            if (viewstub1 == null)
            {
                viewstub1 = view;
            }
            i1 = linearlayout.indexOfChild(viewstub1);
            j.addView(viewstub, i1);
            return true;
        } else
        {
            return false;
        }
    }

    static ad b(l l1)
    {
        return l1.B;
    }

    static void c(l l1)
    {
        l1.d();
    }

    private void d()
    {
        if (A != null)
        {
            A.c(B);
        }
    }

    private void e()
    {
        l();
        if (q != null || t != null)
        {
            return;
        }
        LayoutInflater layoutinflater = LayoutInflater.from(getContext());
        int i1;
        if (D)
        {
            i1 = com.facebook.k.orca_message_item_attachment_audio_me_user;
        } else
        {
            i1 = com.facebook.k.orca_message_item_attachment_audio;
        }
        q = (ViewStub)layoutinflater.inflate(i1, i, false);
        i.addView(q);
        j.setVisibility(8);
    }

    private void f()
    {
        l();
        if (o != null || n != null)
        {
            return;
        } else
        {
            o = (ViewStub)LayoutInflater.from(getContext()).inflate(com.facebook.k.orca_message_item_attachment_share, i, false);
            a(o, 0);
            return;
        }
    }

    private void g()
    {
        l();
        if (r != null || u != null)
        {
            return;
        } else
        {
            r = (ViewStub)LayoutInflater.from(getContext()).inflate(com.facebook.k.orca_message_item_attachment_other_attachments, i, false);
            a(r, 1);
            return;
        }
    }

    private void h()
    {
        l();
        if (p != null || s != null)
        {
            return;
        } else
        {
            p = (ViewStub)LayoutInflater.from(getContext()).inflate(com.facebook.k.orca_message_item_attachment_image, i, false);
            a(p, 2);
            return;
        }
    }

    private void i()
    {
        if (v != null)
        {
            return;
        } else
        {
            v = (ImageButton)LayoutInflater.from(getContext()).inflate(com.facebook.k.orca_message_item_retry_button, i, false);
            i.addView(v, 0);
            v.setFocusable(false);
            v.setOnClickListener(new q(this));
            return;
        }
    }

    private void j()
    {
        if (w != null)
        {
            return;
        } else
        {
            View view = LayoutInflater.from(getContext()).inflate(com.facebook.k.orca_message_item_receipt_item, this, false);
            addView(view);
            w = (ReceiptItemView)view.findViewById(i.row_receipt_container);
            return;
        }
    }

    private void k()
    {
        if (x != null)
        {
            return;
        } else
        {
            x = (LinearLayout)LayoutInflater.from(getContext()).inflate(com.facebook.k.orca_message_divider, this, false);
            y = (TextView)x.findViewById(i.message_divider_text);
            addView(x, 0);
            return;
        }
    }

    private void l()
    {
        if (!m())
        {
            return;
        }
        if (z != null)
        {
            z.setVisibility(0);
            return;
        }
        z = new View(getContext());
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(g.divider_width));
        int i1 = com.facebook.common.w.j.a(getContext(), 5F);
        layoutparams.setMargins(0, i1, 0, i1);
        z.setLayoutParams(layoutparams);
        z.setBackgroundDrawable(getResources().getDrawable(h.default_separator_color));
        i1 = j.indexOfChild(k);
        if (i1 >= 0 && getChildCount() > i1 + 1)
        {
            j.addView(z, i1 + 1);
            return;
        } else
        {
            j.addView(z);
            return;
        }
    }

    private boolean m()
    {
        return !com.facebook.common.w.n.c(C.k());
    }

    public void a(Parcelable parcelable)
    {
        if (A != null)
        {
            A.a(B, parcelable);
        }
    }

    protected void dispatchSetPressed(boolean flag)
    {
    }

    public ad getRowMessageItem()
    {
        return B;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (v != null && C.u() == 901)
        {
            Rect rect = new Rect();
            com.facebook.orca.common.a.c.a(v, this, rect);
            i1 = com.facebook.common.w.j.a(getContext(), 15F);
            rect.left = rect.left - i1;
            rect.top = rect.top - i1;
            rect.right = rect.right + i1;
            rect.bottom = i1 + rect.bottom;
            setTouchDelegate(new TouchDelegate(rect, v));
        }
    }

    public void setCanOpenMessagePermalink(boolean flag)
    {
        j.setClickable(flag);
    }

    public void setListener(r r1)
    {
        A = r1;
    }

    public void setRowMessageItem(ad ad1)
    {
        B = ad1;
        C = B.b();
        a();
    }
}
