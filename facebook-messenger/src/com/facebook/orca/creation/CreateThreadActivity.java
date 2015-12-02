// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.creation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.q;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.d;
import com.facebook.analytics.f.a;
import com.facebook.base.activity.i;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.ops.aa;
import com.facebook.fbservice.ops.j;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.s;
import com.facebook.inject.t;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.e;
import com.facebook.o;
import com.facebook.orca.activity.c;
import com.facebook.orca.annotations.IsClientSmsEnabled;
import com.facebook.orca.annotations.IsMmsSendPermitted;
import com.facebook.orca.annotations.IsSmsReadPermitted;
import com.facebook.orca.annotations.IsSmsSendPermitted;
import com.facebook.orca.annotations.IsSuggestionsEnabled;
import com.facebook.orca.common.ui.widgets.CreateThreadCustomLayout;
import com.facebook.orca.compose.ComposeFragment;
import com.facebook.orca.compose.LocationDisabledNuxView;
import com.facebook.orca.compose.LocationNuxView;
import com.facebook.orca.compose.ap;
import com.facebook.orca.contacts.picker.ContactMultipickerFragment;
import com.facebook.orca.contacts.picker.ContactPickerFragment;
import com.facebook.orca.contacts.picker.x;
import com.facebook.orca.d.af;
import com.facebook.orca.f.k;
import com.facebook.orca.f.r;
import com.facebook.orca.photos.b.m;
import com.facebook.orca.photos.b.n;
import com.facebook.orca.prefs.az;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.server.SendMessageByRecipientsParams;
import com.facebook.orca.server.ThreadCriteria;
import com.facebook.orca.server.ac;
import com.facebook.orca.server.aq;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threadview.ThreadViewActivity;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.user.RecipientInfo;
import com.facebook.user.User;
import com.facebook.user.UserIdentifier;
import com.facebook.user.UserWithIdentifier;
import com.facebook.widget.OverlayLayout;
import com.google.common.a.es;
import com.google.common.a.hq;
import com.google.common.base.Optional;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.creation:
//            e, f, g, h, 
//            a, b, c, d, 
//            i

public class CreateThreadActivity extends i
    implements d, c
{

    public static String r;
    private static final Class s = com/facebook/orca/creation/CreateThreadActivity;
    private javax.inject.a A;
    private av B;
    private com.facebook.orca.photos.b.k C;
    private OverlayLayout D;
    private CreateThreadCustomLayout E;
    private com.facebook.orca.compose.av F;
    private LocationNuxView G;
    private LocationDisabledNuxView H;
    private BlueServiceFragment I;
    private BlueServiceFragment J;
    private ContactPickerFragment K;
    private ComposeFragment L;
    private af M;
    private InputMethodManager N;
    private Message O;
    private es P;
    private String Q;
    private boolean R;
    private boolean S;
    private com.facebook.messages.a.a.a T;
    private ContactMultipickerFragment U;
    boolean p;
    boolean q;
    private q t;
    private r u;
    private k v;
    private javax.inject.a w;
    private javax.inject.a x;
    private javax.inject.a y;
    private javax.inject.a z;

    public CreateThreadActivity()
    {
    }

    private void a(View view, View view1)
    {
        com.facebook.debug.log.b.a(s, "onContactPickerFocusChanged");
        if (view1 != null)
        {
            view = view1.getParent();
        } else
        {
            view = null;
        }
        do
        {
label0:
            {
                if (view != null)
                {
                    if (view != U.z())
                    {
                        break label0;
                    }
                    p();
                }
                return;
            }
            if (view == L.z())
            {
                r();
                U.b();
                return;
            }
            view = view.getParent();
        } while (true);
    }

    private void a(OperationResult operationresult)
    {
        operationresult = ((FetchThreadResult)operationresult.i()).a();
        if (operationresult != null)
        {
            a(((ThreadSummary) (operationresult)));
            return;
        } else
        {
            t();
            return;
        }
    }

    private void a(ServiceException serviceexception)
    {
        t();
    }

    private void a(Message message, int i1)
    {
        message = (new cb("create_thread")).g(message.d()).a(g_()).b("thread", message.e()).a("is_multipicker_clicked", U.Q()).a("participant_count", i1).b("trigger", Q);
        B.a(message);
    }

    static void a(CreateThreadActivity createthreadactivity)
    {
        createthreadactivity.s();
    }

    static void a(CreateThreadActivity createthreadactivity, View view, View view1)
    {
        createthreadactivity.a(view, view1);
    }

    static void a(CreateThreadActivity createthreadactivity, OperationResult operationresult)
    {
        createthreadactivity.a(operationresult);
    }

    static void a(CreateThreadActivity createthreadactivity, ServiceException serviceexception)
    {
        createthreadactivity.a(serviceexception);
    }

    private void a(ThreadSummary threadsummary)
    {
        String s1 = threadsummary.a();
        L.a(s1);
        L.b(s1);
        threadsummary = (new e()).a(O).b(threadsummary.a()).B();
        u.a(threadsummary, g_().toString(), Q);
        if (!R)
        {
            threadsummary = new Intent(this, com/facebook/orca/threadview/ThreadViewActivity);
            threadsummary.putExtra("thread_id", s1);
            startActivity(threadsummary);
        }
        setResult(-1);
        finish();
    }

    private void b(OperationResult operationresult)
    {
        setResult(-1);
        finish();
        operationresult = ((FetchThreadResult)operationresult.i()).a().a();
        L.a(operationresult);
        L.b(operationresult);
        if (!R)
        {
            Intent intent = new Intent(this, com/facebook/orca/threadview/ThreadViewActivity);
            intent.putExtra("thread_id", operationresult);
            startActivity(intent);
            overridePendingTransition(com.facebook.b.activity_close_enter, com.facebook.b.activity_close_exit);
        }
    }

    private void b(ServiceException serviceexception)
    {
        com.facebook.ui.d.a.a(this).a(o.app_error_dialog_title).b(o.send_failed_error).a(serviceexception).a();
    }

    static void b(CreateThreadActivity createthreadactivity, OperationResult operationresult)
    {
        createthreadactivity.b(operationresult);
    }

    static void b(CreateThreadActivity createthreadactivity, ServiceException serviceexception)
    {
        createthreadactivity.b(serviceexception);
    }

    static boolean b(CreateThreadActivity createthreadactivity)
    {
        return createthreadactivity.k();
    }

    static ContactMultipickerFragment c(CreateThreadActivity createthreadactivity)
    {
        return createthreadactivity.U;
    }

    static void d(CreateThreadActivity createthreadactivity)
    {
        createthreadactivity.n();
    }

    static ComposeFragment e(CreateThreadActivity createthreadactivity)
    {
        return createthreadactivity.L;
    }

    private boolean k()
    {
        return ((Boolean)A.b()).booleanValue() && !S;
    }

    private boolean l()
    {
        return getIntent().getBooleanExtra(r, false) && ((Boolean)w.b()).booleanValue() && ((Boolean)y.b()).booleanValue();
    }

    private void m()
    {
        K.a(new com.facebook.orca.creation.e(this));
    }

    private void n()
    {
        int i1 = 1;
        Object obj;
        x x1;
        ContactPickerFragment contactpickerfragment;
        boolean flag;
        if (l() && K.c() == null)
        {
            x1 = x.MERGED;
            obj = getString(o.name_or_phone_search_hint);
            flag = true;
        } else
        if (q)
        {
            x1 = x.ADDRESS_BOOK;
            obj = getString(o.name_or_phone_search_hint);
            flag = false;
        } else
        {
            x1 = x.FACEBOOK_LIST;
            obj = T.c();
            if (((Optional) (obj)).isPresent())
            {
                obj = (String)((Optional) (obj)).get();
            } else
            {
                obj = getString(o.name_search_hint);
            }
            flag = true;
        }
        contactpickerfragment = K;
        if (!q || ((Boolean)z.b()).booleanValue())
        {
            i1 = 0x7fffffff;
        }
        contactpickerfragment.e(i1);
        K.a(x1);
        K.P();
        K.a(((String) (obj)));
        if (flag && k())
        {
            U.d();
            return;
        } else
        {
            U.O();
            return;
        }
    }

    private void o()
    {
        K.a(new f(this));
    }

    private void p()
    {
        if (!p)
        {
            return;
        } else
        {
            L.a(ap.SHRUNK);
            F.a(ap.SHRUNK);
            E.setComposeMode(ap.SHRUNK);
            p = false;
            D.requestLayout();
            return;
        }
    }

    private void q()
    {
        if (q)
        {
            return;
        } else
        {
            q = true;
            L.a(q);
            return;
        }
    }

    private void r()
    {
        if (p)
        {
            return;
        } else
        {
            L.a(ap.EXPANDED);
            F.a(ap.EXPANDED);
            E.setComposeMode(ap.EXPANDED);
            p = true;
            D.requestLayout();
            return;
        }
    }

    private void s()
    {
        if (J.b() != j.INIT || I.b() != j.INIT)
        {
            return;
        }
        P = K.a();
        if (P.isEmpty())
        {
            int i1;
            if (((Boolean)w.b()).booleanValue() && ((Boolean)x.b()).booleanValue())
            {
                i1 = o.create_thread_no_recipients_name_and_number;
            } else
            {
                i1 = o.create_thread_no_recipients_name;
            }
            com.facebook.ui.d.a.a(this).a(o.app_error_dialog_title).b(i1).a();
            return;
        }
        if (L.Q())
        {
            com.facebook.ui.d.a.a(this).a(o.app_error_dialog_title).b(o.send_empty_message).a();
            return;
        }
        if (q && !L.P())
        {
            com.facebook.ui.d.a.a(this).a(o.app_error_dialog_title).b(o.send_attachments_too_large).a();
            return;
        }
        O = L.O();
        F.a();
        if (P.size() != 1) goto _L2; else goto _L1
_L1:
        Object obj = ((UserWithIdentifier)P.get(0)).a();
        if (((User) (obj)).i() == null) goto _L2; else goto _L3
_L3:
        obj = ((User) (obj)).c();
_L5:
        boolean flag;
        if (!R)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj != null && flag)
        {
            ThreadSummary threadsummary = v.c(((com.facebook.user.UserKey) (obj)));
            if (threadsummary != null)
            {
                a(threadsummary);
                return;
            } else
            {
                obj = (new ac()).a(s.STALE_DATA_OKAY).a(ThreadCriteria.a(((com.facebook.user.UserKey) (obj)))).h();
                Bundle bundle = new Bundle();
                bundle.putParcelable("fetchThreadParams", ((android.os.Parcelable) (obj)));
                I.a(aq.k, bundle);
                return;
            }
        } else
        {
            t();
            return;
        }
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void t()
    {
label0:
        {
            if (O.C())
            {
                break label0;
            }
            Iterator iterator = O.B().iterator();
            MediaResource mediaresource;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                mediaresource = (MediaResource)iterator.next();
            } while (C.a(mediaresource.j()).a == n.SUCCESS);
            Toast.makeText(this, o.attachment_upload_not_complete, 0).show();
            return;
        }
        SendMessageByRecipientsParams sendmessagebyrecipientsparams = new SendMessageByRecipientsParams(null, O, RecipientInfo.a(P));
        Bundle bundle = new Bundle();
        bundle.putParcelable("createThreadParams", sendmessagebyrecipientsparams);
        J.a(aq.e, bundle);
        a(O, P.size() + 1);
    }

    public void a(com.facebook.orca.activity.d d1)
    {
        if (L.Q())
        {
            d1.a(true);
            return;
        } else
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
            builder.setTitle(o.compose_discard_dialog_title);
            builder.setMessage(o.compose_discard_dialog_message);
            builder.setNegativeButton(o.compose_discard_dialog_no_button, new g(this, d1));
            builder.setPositiveButton(o.compose_discard_dialog_discard_button, new h(this, d1));
            builder.show();
            return;
        }
    }

    public void b(Bundle bundle)
    {
        Object obj;
        super.b(bundle);
        setContentView(com.facebook.k.orca_create_thread);
        obj = i();
        t = (q)((t) (obj)).a(android/support/v4/app/q);
        u = (r)((t) (obj)).a(com/facebook/orca/f/r);
        v = (k)((t) (obj)).a(com/facebook/orca/f/k);
        w = ((t) (obj)).b(java/lang/Boolean, com/facebook/orca/annotations/IsClientSmsEnabled);
        x = ((t) (obj)).b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsReadPermitted);
        y = ((t) (obj)).b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsSendPermitted);
        z = ((t) (obj)).b(java/lang/Boolean, com/facebook/orca/annotations/IsMmsSendPermitted);
        A = ((t) (obj)).b(java/lang/Boolean, com/facebook/orca/annotations/IsSuggestionsEnabled);
        C = (com.facebook.orca.photos.b.k)((t) (obj)).a(com/facebook/orca/photos/b/k);
        B = (av)((t) (obj)).a(com/facebook/analytics/av);
        M = (af)((t) (obj)).a(com/facebook/orca/d/af);
        N = (InputMethodManager)((t) (obj)).a(android/view/inputmethod/InputMethodManager);
        D = (OverlayLayout)b(com.facebook.i.create_thread_overlay_container);
        G = (LocationNuxView)b(com.facebook.i.compose_location_nux);
        H = (LocationDisabledNuxView)b(com.facebook.i.compose_location_disabled_nux);
        E = (CreateThreadCustomLayout)b(com.facebook.i.create_thread_layout);
        T = (com.facebook.messages.a.a.a)((t) (obj)).a(com/facebook/messages/a/a/a);
        com.facebook.widget.titlebar.c.a(this);
        F = new com.facebook.orca.compose.av((az)((t) (obj)).a(com/facebook/orca/prefs/az));
        F.a(G, H);
        obj = getIntent();
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_722;
        }
        bundle = ((Intent) (obj)).getParcelableExtra("to");
        if (bundle == null) goto _L2; else goto _L1
_L1:
        if (!(bundle instanceof UserWithIdentifier)) goto _L4; else goto _L3
_L3:
        bundle = (UserWithIdentifier)bundle;
_L5:
        int i1 = ((Intent) (obj)).getIntExtra("threadType", 0);
_L6:
        R = ((Intent) (obj)).getBooleanExtra("disable_redirect_to_thread_view", false);
        S = ((Intent) (obj)).getBooleanExtra("disable_create_thread_suggestions", false);
        getWindow().getDecorView().getViewTreeObserver().addOnGlobalFocusChangeListener(new com.facebook.orca.creation.a(this));
        I = BlueServiceFragment.a(this, "fetchCanonicalThread");
        I.a(new com.facebook.orca.creation.b(this));
        I.a(new aa(this, o.create_thread_progress));
        J = BlueServiceFragment.a(this, "createThreadUiOperation");
        J.a(new com.facebook.orca.creation.c(this));
        J.a(new aa(this, o.create_thread_progress));
        U = (ContactMultipickerFragment)t.a(com.facebook.i.suggestions_multipicker_fragment);
        U.a(k());
        K = U.a();
        L = (ComposeFragment)t.a(com.facebook.i.create_thread_compose);
        if (bundle != null)
        {
            if (((Intent) (obj)).getBooleanExtra("disableContactPicker", false))
            {
                K.d();
            }
            obj = bundle.c().e();
            if (obj == com.facebook.user.s.PHONE)
            {
                q();
            } else
            if (obj == com.facebook.user.s.FBID)
            {
                L.e(true);
            }
        } else
        {
            L.e(false);
            if (i1 == 2)
            {
                q();
            }
        }
        o();
        U.a(g_().toString());
        n();
        if (k())
        {
            m();
        } else
        {
            U.O();
        }
        L.a(F);
        L.a(new com.facebook.orca.creation.d(this));
        if (bundle != null)
        {
            K.a(bundle);
        }
        L.a(com.facebook.orca.intents.e.a(getIntent()));
        getWindow().setBackgroundDrawable(null);
        return;
_L4:
        com.facebook.debug.log.b.d(s, "\"to\" extra is not of expected type, ignoring");
_L2:
        bundle = null;
          goto _L5
        bundle = null;
        i1 = 0;
          goto _L6
    }

    public a g_()
    {
        return a.CREATE_THREAD_ACTIVITY_NAME;
    }

    public boolean j()
    {
        return (K.c() == null || K.c() == com.facebook.user.s.FBID) && !q;
    }

    public void onBackPressed()
    {
        N.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
        if (L.Q())
        {
            L.a();
            finish();
        }
        a(new com.facebook.orca.creation.i(this));
    }

    public void onPause()
    {
        super.onPause();
        M.b();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean("composingSmsThread"))
        {
            q();
        }
        if (bundle.getBoolean("composeExpanded"))
        {
            r();
        }
        O = (Message)bundle.getParcelable("outgoingMessage");
        java.util.ArrayList arraylist = bundle.getParcelableArrayList("pickedUsers");
        if (arraylist != null)
        {
            P = es.a(arraylist);
        }
        bundle = bundle.getString("trigger");
        if (bundle != null)
        {
            Q = bundle;
        }
    }

    protected void onResume()
    {
        boolean flag1 = false;
        boolean flag = false;
        super.onResume();
        Object obj = getIntent();
        if (obj != null)
        {
            if (com.facebook.orca.intents.e.a(((Intent) (obj)), "focus_compose", false))
            {
                flag = true;
            }
            obj = com.facebook.orca.intents.e.a(((Intent) (obj)), "trigger");
            flag1 = flag;
            if (obj != null)
            {
                B.a((new cb("show_module")).a(g_()).h(h()).b("trigger", ((String) (obj))));
                Q = ((String) (obj));
                flag1 = flag;
            }
        }
        if (flag1)
        {
            r();
            L.z().requestFocus();
        } else
        if (!j() || !k())
        {
            K.z().requestFocus();
        }
        if (j() && k())
        {
            U.d();
        } else
        {
            U.O();
        }
        if (L.z().hasFocus())
        {
            U.b();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("composeExpanded", p);
        bundle.putBoolean("composingSmsThread", q);
        bundle.putParcelable("outgoingMessage", O);
        if (P != null)
        {
            bundle.putParcelableArrayList("pickedUsers", hq.a(P));
        }
        if (Q != null)
        {
            bundle.putString("trigger", Q);
        }
    }

}
