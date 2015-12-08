// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.pandora.android.activity.c;

// Referenced classes of package com.pandora.android.util:
//            s

static final class d
    implements android.content.gInterface.OnClickListener
{

    final Activity a;
    final Class b;
    final int c;
    final Bundle d;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        com.pandora.android.activity.c.a().a(a, b, c, d);
        dialoginterface.cancel();
    }

    e(Activity activity, Class class1, int i, Bundle bundle)
    {
        a = activity;
        b = class1;
        c = i;
        d = bundle;
        super();
    }
}
