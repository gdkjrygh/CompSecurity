// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal:
//            cb

final class cc
    implements android.view.View.OnClickListener
{

    final cb a;

    cc(cb cb1)
    {
        a = cb1;
        super();
    }

    public final void onClick(View view)
    {
        a.a(true);
    }
}
