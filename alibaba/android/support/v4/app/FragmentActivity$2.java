// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import android.view.Window;
import l;

// Referenced classes of package android.support.v4.app:
//            FragmentActivity

class a
    implements l
{

    final FragmentActivity a;

    public View a(int i)
    {
        return a.findViewById(i);
    }

    public boolean a()
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
