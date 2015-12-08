// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import android.app.AlertDialog;
import com.leanplum.ActionContext;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.VariablesChangedCallback;

// Referenced classes of package com.leanplum.messagetemplates:
//            p, q, n

final class o extends VariablesChangedCallback
{

    private final ActionContext a;

    o(n n, ActionContext actioncontext)
    {
        a = actioncontext;
        super();
    }

    public final void variablesChanged()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(LeanplumActivityHelper.getCurrentActivity());
        builder.setTitle(a.stringNamed("Title")).setMessage(a.stringNamed("Message")).setCancelable(false).setPositiveButton(a.stringNamed("Accept text"), new p(this, a)).setNegativeButton(a.stringNamed("Cancel text"), new q(this, a));
        builder.create().show();
    }
}
