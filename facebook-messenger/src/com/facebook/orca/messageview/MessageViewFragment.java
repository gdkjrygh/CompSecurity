// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.messageview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.base.fragment.FbFragment;
import com.facebook.c.s;
import com.facebook.common.j.a;
import com.facebook.common.w.j;
import com.facebook.contacts.contactcard.entry.LabelValueRowView;
import com.facebook.h;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.location.Coordinates;
import com.facebook.maps.MapImage;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.o;
import com.facebook.orca.common.ui.a.b;
import com.facebook.orca.mutators.DeleteMessagesDialogFragment;
import com.facebook.orca.photos.a.f;
import com.facebook.orca.share.ShareView;
import com.facebook.orca.stickers.i;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.n;
import com.facebook.orca.threadview.dm;
import com.facebook.user.UserKey;
import com.facebook.user.tiles.UserTileView;
import com.facebook.widget.text.BetterTextView;
import com.facebook.zero.a.c;
import com.facebook.zero.ui.l;
import com.google.common.a.hq;

// Referenced classes of package com.facebook.orca.messageview:
//            MessageViewActivity, k, a, MessageReaderListView, 
//            h, i, MessageViewOtherAttachmentsView, j, 
//            f, g, e, d, 
//            c

public class MessageViewFragment extends FbFragment
{

    private static final Class a = com/facebook/orca/messageview/MessageViewActivity;
    private s Z;
    private com.facebook.orca.share.a aa;
    private TextView ab;
    private TextView ac;
    private TextView ad;
    private UserTileView ae;
    private ShareView af;
    private ViewStub ag;
    private ViewGroup ah;
    private LabelValueRowView ai;
    private MapImage aj;
    private LinearLayout ak;
    private BetterTextView al;
    private MessageViewOtherAttachmentsView am;
    private MessageReaderListView an;
    private com.facebook.orca.messageview.k ao;
    private boolean ap;
    private boolean aq;
    private com.google.common.d.a.s ar;
    private com.facebook.zero.ui.o as;
    private l at;
    private com.facebook.common.executors.a b;
    private com.facebook.orca.f.k c;
    private b d;
    private com.facebook.orca.attachments.a e;
    private n f;
    private com.facebook.orca.threads.s g;
    private com.facebook.orca.k.b h;
    private av i;

    public MessageViewFragment()
    {
    }

    private void O()
    {
        Object obj = ao.a.i().e().b();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("fb://profile/").append(Uri.encode(((String) (obj)))).toString()));
        if (com.facebook.common.j.a.a(n(), intent))
        {
            Z.a(intent, n());
            return;
        } else
        {
            obj = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("https://m.facebook.com/profile.php?id=").append(Uri.encode(((String) (obj)))).toString()));
            Z.b(((Intent) (obj)), n());
            return;
        }
    }

    private void P()
    {
        aq = false;
        ah.setVisibility(8);
        a();
    }

    static com.google.common.d.a.s a(MessageViewFragment messageviewfragment, com.google.common.d.a.s s1)
    {
        messageviewfragment.ar = s1;
        return s1;
    }

    private void a()
    {
        Object obj = new com.facebook.orca.messageview.a();
        ((com.facebook.orca.messageview.a) (obj)).a(ao.b);
        ((com.facebook.orca.messageview.a) (obj)).b(ao.c);
        Message message = ao.a;
        ((com.facebook.orca.messageview.a) (obj)).a(message);
        ((com.facebook.orca.messageview.a) (obj)).a(ao.d);
        an.setParameters(((com.facebook.orca.messageview.a) (obj)));
        obj = message.i();
        com.facebook.orca.threads.ThreadParticipant threadparticipant = ao.d.a(((ParticipantInfo) (obj)));
        if (threadparticipant != null)
        {
            ae.setParams(com.facebook.orca.photos.a.f.a(threadparticipant));
        } else
        {
            ae.setParams(null);
        }
        ab.setText(((ParticipantInfo) (obj)).d());
        if (((ParticipantInfo) (obj)).b())
        {
            ab.setClickable(true);
            ab.setOnClickListener(new com.facebook.orca.messageview.h(this));
        }
        ac.setText(f.d(message.f()));
        ad.setText(g.a(message));
        a(message.n());
        if (message.r() && !aq)
        {
            aj.setVisibility(0);
            aj.setCenter(message.n().a());
            aj.setOnClickListener(new com.facebook.orca.messageview.i(this, message));
        } else
        if (!message.r())
        {
            ah.setVisibility(8);
        }
        obj = aa.a(message);
        if (obj != null && com.facebook.orca.stickers.i.a(message, ((com.facebook.messages.model.share.Share) (obj))))
        {
            b();
            if (ag != null)
            {
                af = (ShareView)ag.inflate();
                ag = null;
            }
            af.getLayoutParams().width = -2;
            af.setVisibility(0);
            af.a(((com.facebook.messages.model.share.Share) (obj)), true);
        } else
        if (af != null)
        {
            af.setVisibility(8);
        }
        al.setVisibility(0);
        ak.setVisibility(0);
        if (com.facebook.common.w.n.c(message.k()))
        {
            al.setVisibility(8);
            if (obj == null || !com.facebook.orca.stickers.i.a(message, ((com.facebook.messages.model.share.Share) (obj))))
            {
                ak.setVisibility(8);
                ad.setVisibility(8);
            } else
            {
                c();
            }
        } else
        {
            Object obj1 = d.a(message);
            obj1 = android.text.Spannable.Factory.getInstance().newSpannable(((CharSequence) (obj1)));
            Linkify.addLinks(((android.text.Spannable) (obj1)), 15);
            al.setText(((CharSequence) (obj1)));
            c();
        }
        if (e.f(message))
        {
            am.setMessage(message);
            am.setVisibility(0);
            return;
        } else
        {
            am.setVisibility(8);
            return;
        }
    }

    private void a(android.widget.RelativeLayout.LayoutParams layoutparams, android.widget.RelativeLayout.LayoutParams layoutparams1, android.widget.LinearLayout.LayoutParams layoutparams2)
    {
        layoutparams.addRule(9, -1);
        layoutparams1.addRule(1, com.facebook.i.message_user_img);
        layoutparams1.leftMargin = j.a(o(), 5F);
        layoutparams2.leftMargin = j.a(o(), 46F);
    }

    private void a(android.widget.RelativeLayout.LayoutParams layoutparams, android.widget.RelativeLayout.LayoutParams layoutparams1, android.widget.LinearLayout.LayoutParams layoutparams2, android.widget.LinearLayout.LayoutParams layoutparams3, android.widget.LinearLayout.LayoutParams layoutparams4)
    {
        Message message = ao.a;
        layoutparams.addRule(11, -1);
        layoutparams1.addRule(0, com.facebook.i.message_user_img);
        layoutparams1.rightMargin = j.a(o(), 5F);
        if (dm.a(dm.a(message)))
        {
            ak.setBackgroundResource(h.orca_convo_bubble_green_normal);
        } else
        {
            ak.setBackgroundResource(h.orca_convo_bubble_blue_normal);
        }
        layoutparams2.rightMargin = j.a(o(), 46F);
        layoutparams2.gravity = 5;
        layoutparams3.gravity = 5;
        layoutparams4.gravity = 5;
    }

    private void a(Coordinates coordinates)
    {
        if (coordinates == null)
        {
            return;
        } else
        {
            coordinates = ao.a;
            ar = h.a(coordinates.n());
            b.a(ar, new com.facebook.orca.messageview.j(this));
            return;
        }
    }

    static void a(MessageViewFragment messageviewfragment)
    {
        messageviewfragment.O();
    }

    static void a(MessageViewFragment messageviewfragment, Intent intent)
    {
        messageviewfragment.b(intent);
    }

    private void b()
    {
        if (ag != null || af != null)
        {
            return;
        } else
        {
            ag = (ViewStub)LayoutInflater.from(n()).inflate(k.orca_message_item_attachment_share, ak, false);
            ak.addView(ag);
            return;
        }
    }

    private void b(Intent intent)
    {
        Z.b(intent, n());
    }

    static void b(MessageViewFragment messageviewfragment)
    {
        messageviewfragment.P();
    }

    static l c(MessageViewFragment messageviewfragment)
    {
        return messageviewfragment.at;
    }

    private void c()
    {
        Object obj = (android.widget.RelativeLayout.LayoutParams)ae.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)ak.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutparams1 = (android.widget.LinearLayout.LayoutParams)ad.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutparams2 = (android.widget.LinearLayout.LayoutParams)ab.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutparams3 = (android.widget.LinearLayout.LayoutParams)ac.getLayoutParams();
        ak.setBackgroundResource(h.orca_convo_bubble_white_normal);
        Message message = ao.a;
        if (message.i().e().equals(c.b()))
        {
            a(((android.widget.RelativeLayout.LayoutParams) (obj)), layoutparams, layoutparams1, layoutparams2, layoutparams3);
        } else
        {
            a(((android.widget.RelativeLayout.LayoutParams) (obj)), layoutparams, layoutparams1);
        }
        obj = aa.a(message);
        if (obj != null && com.facebook.orca.stickers.i.a(message, ((com.facebook.messages.model.share.Share) (obj))))
        {
            ak.setBackgroundResource(0x106000d);
        }
    }

    static b d(MessageViewFragment messageviewfragment)
    {
        return messageviewfragment.d;
    }

    private void d()
    {
        if (ar != null)
        {
            ar.cancel(false);
            ar = null;
        }
    }

    static TextView e(MessageViewFragment messageviewfragment)
    {
        return messageviewfragment.ad;
    }

    public void C()
    {
        super.C();
        d();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(k.orca_message_view_fragment, viewgroup, false);
        ab = (TextView)a(((View) (layoutinflater)), com.facebook.i.message_name);
        ac = (TextView)a(((View) (layoutinflater)), com.facebook.i.message_date);
        ad = (TextView)a(((View) (layoutinflater)), com.facebook.i.message_via);
        ae = (UserTileView)a(((View) (layoutinflater)), com.facebook.i.message_user_img);
        ah = (ViewGroup)a(((View) (layoutinflater)), com.facebook.i.show_map_section);
        ai = (LabelValueRowView)a(((View) (layoutinflater)), com.facebook.i.show_map_row);
        ai.setLabelText(o.zero_show_map_button_title);
        aj = (MapImage)a(((View) (layoutinflater)), com.facebook.i.message_map_image);
        ak = (LinearLayout)a(((View) (layoutinflater)), com.facebook.i.message_bubble_container);
        al = (BetterTextView)a(((View) (layoutinflater)), com.facebook.i.message_text);
        viewgroup = new com.facebook.widget.text.j(al);
        viewgroup.a(new com.facebook.orca.messageview.f(this));
        al.a(viewgroup);
        ai.setOnClickListener(new g(this));
        am = (MessageViewOtherAttachmentsView)a(((View) (layoutinflater)), com.facebook.i.message_other_attachments);
        an = (MessageReaderListView)a(((View) (layoutinflater)), com.facebook.i.message_reader_list);
        if (aq)
        {
            ah.setVisibility(0);
        }
        return layoutinflater;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = S();
        b = (com.facebook.common.executors.a)bundle.a(com/facebook/common/executors/a);
        c = (com.facebook.orca.f.k)bundle.a(com/facebook/orca/f/k);
        d = (b)bundle.a(com/facebook/orca/common/ui/a/b);
        e = (com.facebook.orca.attachments.a)bundle.a(com/facebook/orca/attachments/a);
        f = (n)bundle.a(com/facebook/orca/threads/n);
        g = (com.facebook.orca.threads.s)bundle.a(com/facebook/orca/threads/s);
        i = (av)bundle.a(com/facebook/analytics/av);
        h = (com.facebook.orca.k.b)bundle.a(com/facebook/orca/k/b);
        Z = (s)bundle.a(com/facebook/c/s);
        aa = (com.facebook.orca.share.a)bundle.a(com/facebook/orca/share/a);
        as = (com.facebook.zero.ui.o)bundle.a(com/facebook/zero/ui/o);
        at = (l)bundle.a(com/facebook/zero/ui/l);
        at.a(c.k, a(o.zero_external_url_dialog_content), new e(this)).a(c.i, a(o.zero_show_map_dialog_content), new d(this)).a(c.g, a(o.zero_view_timeline_dialog_content), new com.facebook.orca.messageview.c(this));
        aq = as.a(c.i);
    }

    public void a(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(com.facebook.l.message_view_menu, menu);
    }

    public void a(com.facebook.orca.messageview.k k1)
    {
        ao = k1;
        if (ap)
        {
            a();
        }
    }

    public boolean a(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.facebook.i.delete)
        {
            i.a((new cb("click")).f("opt_menu_item").g("delete"));
            Object obj = ao.a;
            menuitem = new Bundle();
            menuitem.putString("thread_id", ((Message) (obj)).e());
            menuitem.putStringArrayList("message_ids", hq.a(new String[] {
                ((Message) (obj)).d()
            }));
            obj = new DeleteMessagesDialogFragment();
            ((DeleteMessagesDialogFragment) (obj)).g(menuitem);
            ((DeleteMessagesDialogFragment) (obj)).a(p(), "delete_message_dialog_tag");
            return true;
        } else
        {
            return super.a(menuitem);
        }
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        ap = true;
        if (ao != null)
        {
            a();
        }
        d(true);
        at.a(p());
    }

}
