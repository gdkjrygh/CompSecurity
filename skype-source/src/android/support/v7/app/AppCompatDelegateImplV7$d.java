// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.view.menu.f;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7, f

private final class <init>
    implements android.support.v7.internal.view.menu.
{

    final AppCompatDelegateImplV7 a;

    public final void onCloseMenu(f f1, boolean flag)
    {
label0:
        {
            f f2 = f1.o();
            AppCompatDelegateImplV7 appcompatdelegateimplv7;
            boolean flag1;
            if (f2 != f1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            appcompatdelegateimplv7 = a;
            if (flag1)
            {
                f1 = f2;
            }
            f1 = AppCompatDelegateImplV7.a(appcompatdelegateimplv7, f1);
            if (f1 != null)
            {
                if (!flag1)
                {
                    break label0;
                }
                AppCompatDelegateImplV7.a(a, ((nelFeatureState) (f1)).a, f1, f2);
                AppCompatDelegateImplV7.a(a, f1, true);
            }
            return;
        }
        AppCompatDelegateImplV7.a(a, f1, flag);
    }

    public final boolean onOpenSubMenu(f f1)
    {
        if (f1 == null && a.h)
        {
            android.view.  = ((android.support.v7.app.f) (a)).b.getCallback();
            if ( != null && !a.n())
            {
                .ed(108, f1);
            }
        }
        return true;
    }

    private nelFeatureState(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }

    a(AppCompatDelegateImplV7 appcompatdelegateimplv7, byte byte0)
    {
        this(appcompatdelegateimplv7);
    }
}
