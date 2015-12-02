// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.broadcast;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.q;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.d;
import com.facebook.base.activity.i;
import com.facebook.common.e.h;
import com.facebook.common.w.j;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.ops.aa;
import com.facebook.inject.t;
import com.facebook.location.Coordinates;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.o;
import com.facebook.orca.activity.c;
import com.facebook.orca.annotations.IsNewPhotoUploadEnabled;
import com.facebook.orca.contacts.picker.ContactMultipickerFragment;
import com.facebook.orca.contacts.picker.ContactPickerFragment;
import com.facebook.orca.contacts.picker.y;
import com.facebook.orca.f.k;
import com.facebook.orca.photos.b.m;
import com.facebook.orca.server.SendBroadcastResult;
import com.facebook.orca.server.SendMessageByRecipientsParams;
import com.facebook.orca.server.aq;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.user.RecipientInfo;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.facebook.widget.titlebar.a;
import com.facebook.widget.titlebar.e;
import com.google.common.a.es;
import com.google.common.a.ev;
import com.google.common.a.fi;
import com.google.common.a.hq;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.broadcast:
//            h, i, j, d, 
//            ComposeBroadcastFragment, b, c, f, 
//            g, a, e

public class BroadcastActivity extends i
    implements d, c
{

    private static final Class p = com/facebook/orca/broadcast/BroadcastActivity;
    private com.facebook.orca.broadcast.i A;
    private BlueServiceFragment B;
    private q q;
    private InputMethodManager r;
    private com.facebook.orca.f.n s;
    private k t;
    private h u;
    private com.facebook.orca.photos.b.k v;
    private javax.inject.a w;
    private av x;
    private com.facebook.orca.common.a.b y;
    private a z;

    public BroadcastActivity()
    {
    }

    static List a(BroadcastActivity broadcastactivity, SendBroadcastResult sendbroadcastresult)
    {
        return broadcastactivity.a(sendbroadcastresult);
    }

    private List a(SendBroadcastResult sendbroadcastresult)
    {
        java.util.ArrayList arraylist = hq.a();
        Iterator iterator = sendbroadcastresult.a().i_().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (((com.facebook.orca.protocol.methods.SendBroadcastMethod.SingleBroadcastResult)sendbroadcastresult.a().get(s1)).a != 0)
            {
                arraylist.add(s1);
            }
        } while (true);
        return arraylist;
    }

    static void a(BroadcastActivity broadcastactivity)
    {
        broadcastactivity.z();
    }

    static void a(BroadcastActivity broadcastactivity, com.facebook.orca.broadcast.i i1)
    {
        broadcastactivity.a(i1);
    }

    static void a(BroadcastActivity broadcastactivity, String s1, String s2, int i1)
    {
        broadcastactivity.a(s1, s2, i1);
    }

    static void a(BroadcastActivity broadcastactivity, List list)
    {
        broadcastactivity.a(list);
    }

    private void a(com.facebook.orca.broadcast.i i1)
    {
        boolean flag;
        flag = false;
        Preconditions.checkNotNull(i1);
        if (A != i1 && q.c()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (com.facebook.orca.broadcast.h.a[i1.ordinal()])
        {
        default:
            com.facebook.debug.log.b.d(p, "Unknown DynamicFragmentType: %s", new Object[] {
                i1.name()
            });
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_93;
        }
_L4:
        if (flag)
        {
            A = i1;
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = l();
          goto _L4
        flag = m();
          goto _L4
    }

    private void a(String s1, String s2, int i1)
    {
        s1 = (new cb(s1)).g(s2).a(g_()).a("participant_count", i1);
        x.b(s1);
    }

    private void a(List list)
    {
        java.util.ArrayList arraylist = hq.a();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (String)list.next();
            obj = new UserKey(n.FACEBOOK, ((String) (obj)));
            obj = t.a(((UserKey) (obj)));
            if (obj != null)
            {
                arraylist.add(obj);
            }
        } while (true);
        list = (ContactMultipickerFragment)q.a(i.CONTACT_MULTIPICKER.fragmentTag);
        if (list == null)
        {
            return;
        } else
        {
            list.a(arraylist);
            u();
            return;
        }
    }

    private boolean a(com.facebook.orca.broadcast.i i1, com.facebook.orca.broadcast.j j1)
    {
        Fragment fragment = q.a(i1.fragmentTag);
        if (fragment == null)
        {
            com.facebook.debug.log.b.d(p, "Can't find fragment to show. Tag %s.", new Object[] {
                i1.fragmentTag
            });
        } else
        if (q.c())
        {
            i1 = q.a();
            if (j1 == j.FROM_RIGHT)
            {
                y();
                i1.a(com.facebook.b.in_from_right, com.facebook.b.out_to_left);
            } else
            if (j1 == j.FROM_LEFT)
            {
                y();
            }
            if (A != null)
            {
                j1 = q.a(A.fragmentTag);
                if (j1 != null)
                {
                    i1.b(j1);
                } else
                {
                    com.facebook.debug.log.b.e(p, "Can't find old fragment to hide. Tag: %s.", new Object[] {
                        A.name()
                    });
                }
            }
            i1.c(fragment);
            i1.a();
            q.b();
            return true;
        }
        return false;
    }

    static h b(BroadcastActivity broadcastactivity)
    {
        return broadcastactivity.u;
    }

    static com.facebook.orca.broadcast.i c(BroadcastActivity broadcastactivity)
    {
        return broadcastactivity.A;
    }

    static void d(BroadcastActivity broadcastactivity)
    {
        broadcastactivity.w();
    }

    static void e(BroadcastActivity broadcastactivity)
    {
        broadcastactivity.u();
    }

    static void f(BroadcastActivity broadcastactivity)
    {
        broadcastactivity.y();
    }

    static void g(BroadcastActivity broadcastactivity)
    {
        broadcastactivity.i.onBackPressed();
    }

    static Class j()
    {
        return p;
    }

    private void k()
    {
        com.facebook.orca.broadcast.i i1 = A;
        A = null;
        a(i1);
    }

    private boolean l()
    {
        u();
        boolean flag = a(i.COMPOSE_BROADCAST, j.FROM_LEFT);
        if (flag)
        {
            s();
        }
        return flag;
    }

    private boolean m()
    {
        boolean flag;
        if (!n())
        {
            flag = false;
        } else
        {
            o();
            boolean flag1 = a(i.CONTACT_MULTIPICKER, j.FROM_RIGHT);
            flag = flag1;
            if (flag1)
            {
                t();
                return flag1;
            }
        }
        return flag;
    }

    private boolean n()
    {
        if (p() != null)
        {
            return true;
        }
        if (!q.c())
        {
            return false;
        } else
        {
            ContactMultipickerFragment contactmultipickerfragment = new ContactMultipickerFragment();
            ad ad1 = q.a();
            ad1.a(com.facebook.i.broadcast_content_container, contactmultipickerfragment, i.CONTACT_MULTIPICKER.fragmentTag);
            ad1.b(contactmultipickerfragment);
            ad1.a();
            q.b();
            return true;
        }
    }

    private void o()
    {
        Object obj = p();
        if (obj == null)
        {
            com.facebook.debug.log.b.d(p, "setupContactMultipickerFragment: fragment not found");
            return;
        } else
        {
            ((ContactMultipickerFragment) (obj)).d();
            obj = ((ContactMultipickerFragment) (obj)).a();
            ((ContactPickerFragment) (obj)).e(20);
            ((ContactPickerFragment) (obj)).f(o.broadcast_max_recipients_title);
            ((ContactPickerFragment) (obj)).g(o.broadcast_max_recipients_message);
            ((ContactPickerFragment) (obj)).P();
            ((ContactPickerFragment) (obj)).a(y.CREATE_THREAD);
            ((ContactPickerFragment) (obj)).a(getString(o.name_search_hint));
            return;
        }
    }

    private ContactMultipickerFragment p()
    {
        return (ContactMultipickerFragment)q.a(i.CONTACT_MULTIPICKER.fragmentTag);
    }

    private void q()
    {
        ad ad1 = q.a();
        com.facebook.orca.broadcast.i ai[] = i.values();
        int j1 = ai.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            Object obj = ai[i1];
            if (obj != A)
            {
                obj = q.a(((com.facebook.orca.broadcast.i) (obj)).fragmentTag);
                if (obj != null && !((Fragment) (obj)).w())
                {
                    ad1.b(((Fragment) (obj)));
                }
            }
            i1++;
        }
        if (!ad1.d())
        {
            ad1.a();
            q.b();
        }
    }

    private void r()
    {
        com.facebook.widget.titlebar.c.a(this);
        z = (a)b(com.facebook.i.titlebar);
        z.setOnToolbarButtonListener(new com.facebook.orca.broadcast.d(this));
        z.setHasProgressBar(true);
        z.setCustomTitleView(null);
    }

    private void s()
    {
        z.setTitle(o.broadcast_title);
        com.facebook.widget.titlebar.d d1 = com.facebook.widget.titlebar.d.newBuilder().a(1).b(getResources().getString(o.send_broadcast)).a("broadcast_send").b(-2).k();
        z.setButtonSpecs(es.a(d1));
    }

    private void t()
    {
        z.setTitle(o.choose_friends_title);
        com.facebook.widget.titlebar.d d1 = com.facebook.widget.titlebar.d.newBuilder().a(2).b(getResources().getString(o.done_add_friends_to_broadcast)).a("edit_done_contact_button").b(-2).k();
        z.setButtonSpecs(es.a(d1));
    }

    private void u()
    {
        es es1 = v();
        if (es1.isEmpty())
        {
            x().a();
            return;
        } else
        {
            x().a(es1);
            return;
        }
    }

    private es v()
    {
        Object obj = (ContactMultipickerFragment)q.a(i.CONTACT_MULTIPICKER.fragmentTag);
        if (obj == null)
        {
            return es.d();
        }
        obj = ((ContactMultipickerFragment) (obj)).a();
        if (obj == null)
        {
            return es.d();
        } else
        {
            return ((ContactPickerFragment) (obj)).a();
        }
    }

    private void w()
    {
        Object obj;
label0:
        {
            obj = x();
            if (((ComposeBroadcastFragment) (obj)).b() || v().size() == 0)
            {
                return;
            }
            if (!((Boolean)w.b()).booleanValue() || ((ComposeBroadcastFragment) (obj)).d().isEmpty())
            {
                break label0;
            }
            Iterator iterator = ((ComposeBroadcastFragment) (obj)).d().iterator();
            MediaResource mediaresource;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                mediaresource = (MediaResource)iterator.next();
            } while (v.a(mediaresource.j()).a == com.facebook.orca.photos.b.n.SUCCESS);
            Toast.makeText(this, o.attachment_upload_not_complete, 0).show();
            return;
        }
        obj = s.a(900, ThreadViewSpec.a, null, ((ComposeBroadcastFragment) (obj)).c().toString(), null, -1L, -1L, Coordinates.a(null), ((ComposeBroadcastFragment) (obj)).d(), null, ev.a("broadcast_id", Long.toString(y.a())));
        SendMessageByRecipientsParams sendmessagebyrecipientsparams = new SendMessageByRecipientsParams(null, ((Message) (obj)), RecipientInfo.a(v()));
        Bundle bundle = new Bundle();
        bundle.putParcelable("broadcastMessageParams", sendmessagebyrecipientsparams);
        a("broadcast_created", (String)((Message) (obj)).J().get("broadcast_id"), sendmessagebyrecipientsparams.d().size());
        B.a(aq.f, bundle);
    }

    private ComposeBroadcastFragment x()
    {
        return (ComposeBroadcastFragment)q.a(i.COMPOSE_BROADCAST.fragmentTag);
    }

    private void y()
    {
        r.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
    }

    private void z()
    {
        y();
        finish();
    }

    public void a(Fragment fragment)
    {
        super.a(fragment);
        if (fragment instanceof ComposeBroadcastFragment)
        {
            fragment = (ComposeBroadcastFragment)fragment;
            fragment.a(new com.facebook.orca.broadcast.b(this));
            fragment.a(new com.facebook.orca.broadcast.c(this));
        } else
        if (fragment instanceof ContactMultipickerFragment)
        {
            ((ContactMultipickerFragment)fragment).e(com.facebook.common.w.j.a(this, 60F));
            return;
        }
    }

    public void a(com.facebook.orca.activity.d d1)
    {
        if (x().b())
        {
            d1.a(true);
            return;
        } else
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
            builder.setTitle(o.compose_discard_dialog_title);
            builder.setMessage(o.compose_discard_dialog_message);
            builder.setNegativeButton(o.compose_discard_dialog_no_button, new f(this, d1));
            builder.setPositiveButton(o.compose_discard_dialog_discard_button, new g(this, d1));
            builder.show();
            return;
        }
    }

    protected void b(Bundle bundle)
    {
        super.b(bundle);
        Object obj = i();
        q = (q)((t) (obj)).a(android/support/v4/app/q);
        r = (InputMethodManager)((t) (obj)).a(android/view/inputmethod/InputMethodManager);
        s = (com.facebook.orca.f.n)((t) (obj)).a(com/facebook/orca/f/n);
        t = (k)((t) (obj)).a(com/facebook/orca/f/k);
        u = (h)((t) (obj)).a(com/facebook/common/e/h);
        v = (com.facebook.orca.photos.b.k)((t) (obj)).a(com/facebook/orca/photos/b/k);
        w = ((t) (obj)).b(java/lang/Boolean, com/facebook/orca/annotations/IsNewPhotoUploadEnabled);
        x = (av)((t) (obj)).a(com/facebook/analytics/av);
        y = (com.facebook.orca.common.a.b)((t) (obj)).a(com/facebook/orca/common/a/b);
        setContentView(com.facebook.k.broadcast_activity);
        r();
        obj = null;
        if (bundle != null)
        {
            obj = bundle.getString("dynamic_fragment_type");
        }
        if (obj != null)
        {
            bundle = i.valueOf(((String) (obj)));
        } else
        {
            bundle = i.COMPOSE_BROADCAST;
        }
        A = bundle;
        B = BlueServiceFragment.a(this, "createThreadUiOperation");
        B.a(new aa(this, o.create_thread_progress));
        B.a(new com.facebook.orca.broadcast.a(this));
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.CREATE_BROADCAST_ACTIVITY_NAME;
    }

    public void onBackPressed()
    {
        if (A == i.CONTACT_MULTIPICKER)
        {
            a(i.COMPOSE_BROADCAST);
            return;
        } else
        {
            a(new com.facebook.orca.broadcast.e(this));
            return;
        }
    }

    protected void onPause()
    {
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (A == null)
        {
            com.facebook.debug.log.b.d(p, "state should not be null, defaulting to %s", new Object[] {
                i.COMPOSE_BROADCAST.name()
            });
            A = i.COMPOSE_BROADCAST;
        }
        bundle.putString("dynamic_fragment_type", A.name());
    }

    protected void onStart()
    {
        super.onStart();
        q();
        k();
    }

}
