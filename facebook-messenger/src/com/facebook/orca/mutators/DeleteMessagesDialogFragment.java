// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.mutators;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.os.Bundle;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.ops.aa;
import com.facebook.fbservice.ops.j;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.m;
import com.facebook.o;
import com.facebook.orca.activity.i;
import com.facebook.orca.dialog.ConfirmActionDialogFragment;
import com.facebook.orca.server.DeleteMessagesParams;
import com.facebook.orca.server.aq;
import com.facebook.ui.d.a;
import com.google.common.a.fi;

// Referenced classes of package com.facebook.orca.mutators:
//            a

public class DeleteMessagesDialogFragment extends ConfirmActionDialogFragment
{

    private BlueServiceFragment Z;
    private AlertDialog aa;
    private String ab;
    private fi ac;

    public DeleteMessagesDialogFragment()
    {
    }

    private void R()
    {
        if (Z != null)
        {
            return;
        } else
        {
            Z = BlueServiceFragment.a(p(), "deleteMessagesOperation");
            Z.a(new com.facebook.orca.mutators.a(this));
            String s = o().getQuantityString(m.message_delete_progress, 1);
            Z.a(new aa(n(), s));
            return;
        }
    }

    private void S()
    {
        if (Z.b() != j.INIT)
        {
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable("deleteMessagesParams", new DeleteMessagesParams(ab, ac));
            Z.a(aq.h, bundle);
            return;
        }
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
            aa = com.facebook.ui.d.a.a(context).a(o.app_error_dialog_title).a(serviceexception).a(this).a();
            return;
        }
    }

    static void a(DeleteMessagesDialogFragment deletemessagesdialogfragment, OperationResult operationresult)
    {
        deletemessagesdialogfragment.a(operationresult);
    }

    static void a(DeleteMessagesDialogFragment deletemessagesdialogfragment, ServiceException serviceexception)
    {
        deletemessagesdialogfragment.a(serviceexception);
    }

    private i d(int k)
    {
        i l = new i();
        Resources resources = o();
        l.a(resources.getQuantityString(m.message_delete_confirm_title, k));
        l.b(resources.getQuantityString(m.message_delete_confirm_msg, k));
        l.c(resources.getQuantityString(m.message_delete_confirm_ok_button, k));
        l.a(com.facebook.orca.activity.j.DELETE);
        return l;
    }

    protected void O()
    {
        S();
    }

    public void a()
    {
        if (Z != null)
        {
            Z.a(null);
        }
        if (aa != null)
        {
            aa.dismiss();
            aa = null;
        }
        super.b();
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = k();
        ab = bundle.getString("thread_id");
        ac = fi.a(bundle.getStringArrayList("message_ids"));
        a(d(ac.size()));
        R();
    }
}
