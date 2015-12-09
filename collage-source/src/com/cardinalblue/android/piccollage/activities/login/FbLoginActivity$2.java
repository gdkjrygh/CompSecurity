// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.login;

import android.content.DialogInterface;

// Referenced classes of package com.cardinalblue.android.piccollage.activities.login:
//            FbLoginActivity

class a
    implements android.content.ClickListener
{

    final FbLoginActivity a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.finish();
    }

    (FbLoginActivity fbloginactivity)
    {
        a = fbloginactivity;
        super();
    }
}
