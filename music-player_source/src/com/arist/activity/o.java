// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.arist.activity:
//            MainActivity

final class o
    implements android.view.View.OnClickListener
{

    final MainActivity a;
    private final Dialog b;

    o(MainActivity mainactivity, Dialog dialog)
    {
        a = mainactivity;
        b = dialog;
        super();
    }

    public final void onClick(View view)
    {
        b.dismiss();
        a.f();
    }
}
