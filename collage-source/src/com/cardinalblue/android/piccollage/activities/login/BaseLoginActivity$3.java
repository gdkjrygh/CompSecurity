// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.login;

import android.content.DialogInterface;
import com.cardinalblue.android.piccollage.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.activities.login:
//            BaseLoginActivity

class a
    implements android.content.ncelListener
{

    final BaseLoginActivity a;

    public void onCancel(DialogInterface dialoginterface)
    {
        a.setResult(0);
        b.aZ();
        a.finish();
    }

    (BaseLoginActivity baseloginactivity)
    {
        a = baseloginactivity;
        super();
    }
}
