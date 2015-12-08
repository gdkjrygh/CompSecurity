// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services.drag;

import android.view.View;
import android.view.WindowManager;

// Referenced classes of package com.aviary.android.feather.library.services.drag:
//            DragView

class a
    implements Runnable
{

    final View a;
    final DragView b;

    public void run()
    {
        b.j.removeView(a);
    }

    A(DragView dragview, View view)
    {
        b = dragview;
        a = view;
        super();
    }
}
