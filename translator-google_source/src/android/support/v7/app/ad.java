// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.w;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7, q

final class ad
    implements w
{

    final AppCompatDelegateImplV7 a;

    ad(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }

    public final void a(i i, boolean flag)
    {
        a.b(i);
    }

    public final boolean a_(i i)
    {
        android.view.Window.Callback callback = ((q) (a)).b.getCallback();
        if (callback != null)
        {
            callback.onMenuOpened(108, i);
        }
        return true;
    }
}
