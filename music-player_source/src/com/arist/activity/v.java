// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.view.View;

// Referenced classes of package com.arist.activity:
//            MainActivity

final class v
    implements android.view.View.OnClickListener
{

    final MainActivity a;

    v(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public final void onClick(View view)
    {
        a.b(true);
    }
}
