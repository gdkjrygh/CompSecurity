// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import android.support.v7.internal.view.f;
import android.support.v7.internal.view.menu.t;
import android.support.v7.widget.ag;
import android.support.v7.widget.ah;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import com.google.android.libraries.translate.e.o;

// Referenced classes of package com.google.android.apps.translate.e:
//            m, n

public final class l
    implements android.view.View.OnClickListener
{

    private final ag a;

    public l(ag ag1, View view)
    {
        a = ag1;
        if (o.e)
        {
            if (ag1.f == null)
            {
                ag1.f = new ah(ag1, ag1.c);
            }
            view.setOnTouchListener(ag1.f);
        }
    }

    public static Menu a(View view, int i, n n)
    {
        ag ag1 = new ag(view.getContext(), view);
        (new f(ag1.a)).inflate(i, ag1.b);
        ag1.e = new m(n);
        view.setOnClickListener(new l(ag1, view));
        return ag1.b;
    }

    public final void onClick(View view)
    {
        a.d.b();
    }
}
