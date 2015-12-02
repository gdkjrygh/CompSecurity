// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.mutators;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.os.Bundle;
import com.facebook.analytics.cn;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.ops.aa;
import com.facebook.fbservice.ops.j;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.inject.t;
import com.facebook.m;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.SendError;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.o;
import com.facebook.orca.activity.i;
import com.facebook.orca.annotations.IsNewPhotoUploadEnabled;
import com.facebook.orca.dialog.ConfirmActionDialogFragment;
import com.facebook.orca.f.r;
import com.facebook.orca.photos.b.k;
import com.facebook.orca.server.DeleteMessagesParams;
import com.facebook.orca.server.aq;
import com.facebook.ui.d.a;
import com.facebook.ui.d.d;
import com.google.common.a.fi;

// Referenced classes of package com.facebook.orca.mutators:
//            j

public class ResendMessageDialogFragment extends ConfirmActionDialogFragment
{

    private r Z;
    private d aa;
    private BlueServiceFragment ab;
    private cn ac;
    private k ad;
    private javax.inject.a ae;
    private Message af;
    private AlertDialog ag;

    public ResendMessageDialogFragment()
    {
    }

    private void R()
    {
        if (ab.b() != j.INIT)
        {
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable("deleteMessagesParams", new DeleteMessagesParams(af.e(), fi.b(af.d())));
            ab.a(aq.h, bundle);
            return;
        }
    }

    private void S()
    {
        if (ab != null)
        {
            return;
        } else
        {
            ab = BlueServiceFragment.a(p(), "deleteMessagesOperation");
            ab.a(new com.facebook.orca.mutators.j(this));
            String s = o().getQuantityString(m.message_delete_progress, 1);
            ab.a(new aa(n(), s));
            return;
        }
    }

    public static ResendMessageDialogFragment a(Message message)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("message", message);
        message = new ResendMessageDialogFragment();
        message.g(bundle);
        return message;
    }

    private void a(OperationResult operationresult)
    {
        a();
    }

    private void a(ServiceException serviceexception)
    {
        android.content.Context context = n();
        if (context == null || !v() || !u())
        {
            return;
        } else
        {
            ag = com.facebook.ui.d.a.a(context).a(o.app_error_dialog_title).a(serviceexception).a(this).a();
            return;
        }
    }

    static void a(ResendMessageDialogFragment resendmessagedialogfragment, OperationResult operationresult)
    {
        resendmessagedialogfragment.a(operationresult);
    }

    static void a(ResendMessageDialogFragment resendmessagedialogfragment, ServiceException serviceexception)
    {
        resendmessagedialogfragment.a(serviceexception);
    }

    protected void O()
    {
        if (((Boolean)ae.b()).booleanValue())
        {
            ad.a(af);
        }
        Z.a(af);
        ac.b(af.w(), af.K().a());
        a();
    }

    protected void P()
    {
        R();
    }

    public void a()
    {
        if (ab != null)
        {
            ab.a(null);
        }
        if (ag != null)
        {
            ag.dismiss();
            ag = null;
        }
        super.b();
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = t.a(n());
        Z = (r)bundle.a(com/facebook/orca/f/r);
        aa = (d)bundle.a(com/facebook/ui/d/d);
        ac = (cn)bundle.a(com/facebook/analytics/cn);
        ad = (k)bundle.a(com/facebook/orca/photos/b/k);
        ae = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/IsNewPhotoUploadEnabled);
        af = (Message)k().getParcelable("message");
        if (af == null)
        {
            throw new IllegalArgumentException("ResendMessageDialogFragment needs a message in its arguments Bundle");
        }
        i l;
        if (af.e() != null)
        {
            bundle = ThreadViewSpec.a(af.e());
        } else
        {
            bundle = ThreadViewSpec.a(af.G());
        }
        bundle = Z.b(bundle);
        if (bundle != null)
        {
            bundle = aa.a(bundle, false, false);
        } else
        {
            bundle = null;
        }
        l = new i();
        l.a(a(o.retry_send_heading));
        l.b(bundle);
        l.c(a(o.retry_send_positive_button));
        l.b(com.facebook.orca.activity.j.DELETE);
        l.d(a(o.retry_send_delete_button));
        a(l);
        S();
    }
}
