// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.view.menu.f;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7, f

private final class <init>
    implements android.support.v7.internal.view.menu.b
{

    final AppCompatDelegateImplV7 a;

    public final void onCloseMenu(f f1, boolean flag)
    {
        AppCompatDelegateImplV7.a(a, f1);
    }

    public final boolean onOpenSubMenu(f f1)
    {
        android.view.  = ((android.support.v7.app.f) (a)).b.getCallback();
        if ( != null)
        {
            .ed(108, f1);
        }
        return true;
    }

    private (AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }

    a(AppCompatDelegateImplV7 appcompatdelegateimplv7, byte byte0)
    {
        this(appcompatdelegateimplv7);
    }
}
