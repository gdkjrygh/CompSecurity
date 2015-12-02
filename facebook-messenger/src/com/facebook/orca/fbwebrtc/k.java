// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.facebook.c.s;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            i, ay, ae

class k
    implements android.content.DialogInterface.OnClickListener
{

    final Intent a;
    final Context b;
    final i c;

    k(i j, Intent intent, Context context)
    {
        c = j;
        a = intent;
        b = context;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int j)
    {
        dialoginterface.dismiss();
        i.b(c).b().a(ay.c, true).a();
        i.a(c).a(true);
        i.c(c).a(a, b);
    }
}
