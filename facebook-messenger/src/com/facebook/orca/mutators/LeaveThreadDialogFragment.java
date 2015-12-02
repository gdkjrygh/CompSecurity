// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.mutators;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.facebook.o;

// Referenced classes of package com.facebook.orca.mutators:
//            g, f, h

public class LeaveThreadDialogFragment extends DialogFragment
{

    private h Z;

    public LeaveThreadDialogFragment()
    {
    }

    static h a(LeaveThreadDialogFragment leavethreaddialogfragment)
    {
        return leavethreaddialogfragment.Z;
    }

    public void a(h h)
    {
        Z = h;
    }

    public Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(n())).setTitle(o.thread_leave_confirm_title).setMessage(o.thread_leave_confirm_msg).setPositiveButton(o.thread_leave_confirm_ok_button, new g(this)).setNegativeButton(o.dialog_cancel, new f(this)).create();
    }
}
