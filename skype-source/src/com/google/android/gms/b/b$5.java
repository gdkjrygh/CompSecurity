// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.e;

// Referenced classes of package com.google.android.gms.b:
//            b

static final class b
    implements android.view..OnClickListener
{

    final Context a;
    final int b;

    public final void onClick(View view)
    {
        a.startActivity(e.a(b));
    }

    .e(Context context, int i)
    {
        a = context;
        b = i;
        super();
    }
}
