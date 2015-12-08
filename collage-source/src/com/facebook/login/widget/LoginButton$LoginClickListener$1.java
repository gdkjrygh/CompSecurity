// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import android.content.DialogInterface;
import com.facebook.login.LoginManager;

// Referenced classes of package com.facebook.login.widget:
//            LoginButton

class this._cls1
    implements android.content.istener._cls1
{

    final this._cls1 this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        getLoginManager().logOut();
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
