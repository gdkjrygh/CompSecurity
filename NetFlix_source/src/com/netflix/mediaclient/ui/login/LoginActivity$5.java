// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.login;

import com.netflix.mediaclient.android.widget.AlertDialogFactory;

// Referenced classes of package com.netflix.mediaclient.ui.login:
//            LoginActivity

class this._cls0
    implements Runnable
{

    final LoginActivity this$0;

    public void run()
    {
        Object obj = new com.netflix.mediaclient.android.widget.ry.AlertDialogDescriptor(null, getString(0x7f0c0192), getString(0x104000a), null);
        obj = AlertDialogFactory.createDialog(LoginActivity.this, LoginActivity.access$200(LoginActivity.this), ((com.netflix.mediaclient.android.widget.ry.AlertDialogDescriptor) (obj)));
        displayDialog(((com.netflix.mediaclient.android.widget.lder) (obj)));
    }

    gFactory()
    {
        this$0 = LoginActivity.this;
        super();
    }
}
