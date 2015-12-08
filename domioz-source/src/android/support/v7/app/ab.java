// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.y;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7, o

final class ab
    implements y
{

    final AppCompatDelegateImplV7 a;

    private ab(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }

    ab(AppCompatDelegateImplV7 appcompatdelegateimplv7, byte byte0)
    {
        this(appcompatdelegateimplv7);
    }

    public final void a(i j, boolean flag)
    {
label0:
        {
            i k = j.o();
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
            j = AppCompatDelegateImplV7.a(appcompatdelegateimplv7, j);
            if (j != null)
            {
                if (!flag1)
                {
                    break label0;
                }
                AppCompatDelegateImplV7.a(a, ((AppCompatDelegateImplV7.PanelFeatureState) (j)).a, j, k);
                AppCompatDelegateImplV7.a(a, j, true);
            }
            return;
        }
        AppCompatDelegateImplV7.a(a, j, flag);
    }

    public final boolean a(i j)
    {
        if (j == null && a.e)
        {
            android.view.Window.Callback callback = ((o) (a)).b.getCallback();
            if (callback != null && !a.n())
            {
                callback.onMenuOpened(8, j);
            }
        }
        return true;
    }
}
