// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.e;

final class g
    implements android.view.View.OnClickListener
{

    final Context a;
    final int b;

    g(Context context, int i)
    {
        a = context;
        b = i;
        super();
    }

    public final void onClick(View view)
    {
        a.startActivity(e.a(b));
    }
}
