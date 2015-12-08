// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.kik.view.adapters:
//            au

final class aw
    implements au.b
{

    final int a;
    final au b;

    aw(au au1, int i)
    {
        b = au1;
        a = i;
        super();
    }

    public final void a()
    {
        if (au.a(b) != null)
        {
            au.a(b).a();
        }
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (au.a(b) != null)
        {
            au.a(b).onItemClick(adapterview, view, a + 1, l);
        }
    }
}
