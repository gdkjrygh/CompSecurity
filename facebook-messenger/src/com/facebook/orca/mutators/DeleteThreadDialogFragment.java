// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.mutators;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.d;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.aa;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.orca.prefs.n;
import com.facebook.orca.server.DeleteThreadParams;
import com.facebook.orca.server.aq;
import com.facebook.prefs.shared.e;
import com.facebook.ui.d.a;
import com.google.common.d.a.i;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.orca.mutators:
//            d, e, c, b

public class DeleteThreadDialogFragment extends DialogFragment
{

    private static final Class Z = com/facebook/orca/mutators/DeleteThreadDialogFragment;
    private s aa;
    private String ab;
    private k ac;
    private com.facebook.prefs.shared.d ad;
    private av ae;
    private Context af;

    public DeleteThreadDialogFragment()
    {
    }

    private void O()
    {
        if (aa != null)
        {
            return;
        } else
        {
            Object obj = new Bundle();
            ((Bundle) (obj)).putParcelable("deleteThreadParams", new DeleteThreadParams(ab));
            obj = ac.a(aq.g, ((Bundle) (obj)));
            ((m) (obj)).a(new aa(n(), o.thread_delete_progress));
            aa = ((m) (obj)).a();
            P();
            i.a(aa, new com.facebook.orca.mutators.d(this));
            return;
        }
    }

    private void P()
    {
        cb cb1 = new cb("delete_thread");
        if (r() instanceof d)
        {
            cb1.a(((d)r()).g_());
        }
        cb1.b("thread_id", ab);
        ae.a(cb1);
    }

    public static DeleteThreadDialogFragment a(String s)
    {
        DeleteThreadDialogFragment deletethreaddialogfragment = new DeleteThreadDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("threadId", s);
        deletethreaddialogfragment.g(bundle);
        return deletethreaddialogfragment;
    }

    static s a(DeleteThreadDialogFragment deletethreaddialogfragment, s s)
    {
        deletethreaddialogfragment.aa = s;
        return s;
    }

    private void a(ServiceException serviceexception)
    {
        if (af == null)
        {
            return;
        } else
        {
            com.facebook.ui.d.a.a(af).a(o.app_error_dialog_title).a(serviceexception).a(new com.facebook.orca.mutators.e(this)).a();
            return;
        }
    }

    static void a(DeleteThreadDialogFragment deletethreaddialogfragment)
    {
        deletethreaddialogfragment.O();
    }

    static void a(DeleteThreadDialogFragment deletethreaddialogfragment, ServiceException serviceexception)
    {
        deletethreaddialogfragment.a(serviceexception);
    }

    static void a(DeleteThreadDialogFragment deletethreaddialogfragment, String s)
    {
        deletethreaddialogfragment.b(s);
    }

    static String b(DeleteThreadDialogFragment deletethreaddialogfragment)
    {
        return deletethreaddialogfragment.ab;
    }

    private void b(String s)
    {
        com.facebook.debug.log.b.b(Z, "Delete some shared preferences for deleted thread");
        s = n.d(s);
        ad.b().a(s).a();
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        ab = k().getString("threadId");
        af = n();
        bundle = t.a(af);
        ac = (k)bundle.a(com/facebook/fbservice/ops/k);
        ae = (av)bundle.a(com/facebook/analytics/av);
        ad = (com.facebook.prefs.shared.d)bundle.a(com/facebook/prefs/shared/d);
    }

    public Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(n())).setTitle(o.thread_delete_confirm_title).setMessage(o.thread_delete_confirm_msg).setPositiveButton(o.thread_delete_confirm_ok_button, new c(this)).setNegativeButton(o.dialog_cancel, new com.facebook.orca.mutators.b(this)).create();
    }

}
