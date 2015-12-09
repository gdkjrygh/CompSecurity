// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.signup;

import com.netflix.mediaclient.android.widget.AlertDialogFactory;

// Referenced classes of package com.netflix.mediaclient.ui.signup:
//            SignupActivity

class this._cls0
    implements Runnable
{

    final SignupActivity this$0;

    public void run()
    {
        Object obj = new com.netflix.mediaclient.android.widget.y.AlertDialogDescriptor(null, getString(0x7f0c010e), getString(0x104000a), null);
        obj = AlertDialogFactory.createDialog(SignupActivity.this, SignupActivity.access$1700(SignupActivity.this), ((com.netflix.mediaclient.android.widget.y.AlertDialogDescriptor) (obj)));
        displayDialog(((com.netflix.mediaclient.android.widget.der) (obj)));
    }

    actory()
    {
        this$0 = SignupActivity.this;
        super();
    }
}
