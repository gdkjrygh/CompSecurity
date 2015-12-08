// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.widget.ViewSwitcher;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            ab, kz, db, kr, 
//            d, dv, do, dp, 
//            m, dt

public final class ll
{

    public final ViewSwitcher a;
    public final String b;
    public final Context c;
    public final kz d;
    public final db e;
    public d f;
    public dv g;
    public ab h;
    public do i;
    public dp j;
    public m k;
    public dt l;
    private HashSet m;

    public ll(Context context, ab ab1, String s, db db1)
    {
        l = null;
        m = null;
        if (ab1.f)
        {
            a = null;
        } else
        {
            a = new ViewSwitcher(context);
            a.setMinimumWidth(ab1.h);
            a.setMinimumHeight(ab1.e);
            a.setVisibility(4);
        }
        h = ab1;
        b = s;
        c = context;
        d = new kz(kr.a(db1.c, context));
        e = db1;
    }

    public final HashSet a()
    {
        return m;
    }

    public final void a(HashSet hashset)
    {
        m = hashset;
    }
}
