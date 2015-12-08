// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import R;
import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v4.app:
//            FragmentActivity

final class a
    implements R
{

    private FragmentActivity a;

    public final View a(int i)
    {
        return a.findViewById(i);
    }

    public final boolean a()
    {
        Window window = a.getWindow();
        return window != null && window.peekDecorView() != null;
    }

    (FragmentActivity fragmentactivity)
    {
        a = fragmentactivity;
        super();
    }
}
