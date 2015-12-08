// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.am;
import android.support.v4.view.r;
import android.support.v4.view.x;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

final class a
    implements r
{

    final AppCompatDelegateImplV7 a;

    public final am a(View view, am am1)
    {
        int i = am1.b();
        int j = AppCompatDelegateImplV7.b(a, i);
        am am2 = am1;
        if (i != j)
        {
            am2 = am1.a(am1.a(), j, am1.c(), am1.d());
        }
        return x.a(view, am2);
    }

    (AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }
}
