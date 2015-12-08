// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.google.userfeedback.android.api:
//            m

final class p
    implements android.content.DialogInterface.OnClickListener
{

    final boolean a;
    final boolean b;
    final String c;
    final Activity d;
    final m e;

    p(m m1, boolean flag, boolean flag1, String s, Activity activity)
    {
        e = m1;
        a = flag;
        b = flag1;
        c = s;
        d = activity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        e.a(a, b, c);
        d.setResult(-1);
        d.finish();
    }
}
