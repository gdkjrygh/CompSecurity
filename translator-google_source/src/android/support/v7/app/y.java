// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.bd;
import android.support.v4.view.bt;
import android.support.v4.view.ej;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

final class y
    implements bd
{

    final AppCompatDelegateImplV7 a;

    y(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }

    public final ej a(View view, ej ej1)
    {
        int i = ej1.b();
        int j = AppCompatDelegateImplV7.b(a, i);
        ej ej2 = ej1;
        if (i != j)
        {
            ej2 = ej1.a(ej1.a(), j, ej1.c(), ej1.d());
        }
        return bt.a(view, ej2);
    }
}
