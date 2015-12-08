// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.a;

import android.view.View;
import com.arist.activity.MainActivity;

// Referenced classes of package com.arist.a:
//            e

final class f
    implements android.view.View.OnClickListener
{

    final e a;
    private final int b;

    f(e e1, int i)
    {
        a = e1;
        b = i;
        super();
    }

    public final void onClick(View view)
    {
        ((MainActivity)e.a(a)).a(1, b);
    }
}
