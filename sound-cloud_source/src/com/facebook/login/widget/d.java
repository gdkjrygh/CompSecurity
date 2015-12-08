// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import android.content.DialogInterface;
import com.facebook.login.o;

// Referenced classes of package com.facebook.login.widget:
//            LoginButton

final class d
    implements android.content.DialogInterface.OnClickListener
{

    final LoginButton.b a;

    d(LoginButton.b b)
    {
        a = b;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a.d();
        o.b();
    }
}
