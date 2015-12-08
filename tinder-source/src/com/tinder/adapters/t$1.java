// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.view.View;
import java.util.List;

// Referenced classes of package com.tinder.adapters:
//            t

final class a
    implements android.view..OnClickListener
{

    final t a;

    public final void onClick(View view)
    {
        int j = a.f.size();
        int i = j;
        if (j > a.c)
        {
            i = a.c;
        }
        a.l.a(view, i);
    }

    kListener(t t1)
    {
        a = t1;
        super();
    }
}
