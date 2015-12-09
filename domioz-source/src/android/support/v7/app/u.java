// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.bi;
import android.support.v4.view.bp;
import android.support.v4.view.dr;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

final class u
    implements bi
{

    final AppCompatDelegateImplV7 a;

    u(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }

    public final dr a(View view, dr dr1)
    {
        int i = dr1.b();
        int j = AppCompatDelegateImplV7.b(a, i);
        dr dr2 = dr1;
        if (i != j)
        {
            dr2 = dr1.a(dr1.a(), j, dr1.c(), dr1.d());
        }
        return bp.a(view, dr2);
    }
}
