// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.view.View;
import java.util.List;

// Referenced classes of package com.android.slyce.report.c:
//            v, u

abstract class an
    implements v
{

    private final List a;
    private final u b = new u();

    protected an(List list)
    {
        a = list;
    }

    public abstract void a();

    public void b(View view)
    {
        b.a(view, a, this);
    }
}
