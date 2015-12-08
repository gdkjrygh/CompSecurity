// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.w;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7, q

final class ah
    implements w
{

    final AppCompatDelegateImplV7 a;

    ah(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }

    public final void a(i j, boolean flag)
    {
label0:
        {
            i k = j.k();
            AppCompatDelegateImplV7 appcompatdelegateimplv7;
            boolean flag1;
            if (k != j)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            appcompatdelegateimplv7 = a;
            if (flag1)
            {
                j = k;
            }
            j = appcompatdelegateimplv7.a(j);
            if (j != null)
            {
                if (!flag1)
                {
                    break label0;
                }
                a.a(((AppCompatDelegateImplV7.PanelFeatureState) (j)).a, j, k);
                a.a(j, true);
            }
            return;
        }
        a.a(j, flag);
    }

    public final boolean a_(i j)
    {
        if (j == null && a.h)
        {
            android.view.Window.Callback callback = ((q) (a)).b.getCallback();
            if (callback != null && !((q) (a)).n)
            {
                callback.onMenuOpened(108, j);
            }
        }
        return true;
    }
}
