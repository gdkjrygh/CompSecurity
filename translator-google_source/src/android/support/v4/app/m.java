// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            q, FragmentActivity

final class m extends q
{

    final FragmentActivity a;

    public m(FragmentActivity fragmentactivity)
    {
        a = fragmentactivity;
        super(fragmentactivity);
    }

    public final View a(int i)
    {
        return a.findViewById(i);
    }

    public final void a(String s, PrintWriter printwriter, String as[])
    {
        a.dump(s, null, printwriter, as);
    }

    public final boolean a()
    {
        Window window = a.getWindow();
        return window != null && window.peekDecorView() != null;
    }

    public final boolean b()
    {
        return !a.isFinishing();
    }

    public final LayoutInflater c()
    {
        return a.getLayoutInflater().cloneInContext(a);
    }

    public final void d()
    {
        a.b();
    }

    public final boolean e()
    {
        return a.getWindow() != null;
    }

    public final int f()
    {
        Window window = a.getWindow();
        if (window == null)
        {
            return 0;
        } else
        {
            return window.getAttributes().windowAnimations;
        }
    }
}
