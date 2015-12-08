// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.sunset;

import android.widget.Toast;
import com.tinder.e.ah;
import com.tinder.managers.ManagerApp;

// Referenced classes of package com.tinder.sunset:
//            ActivityMomentViewer

final class a
    implements ah
{

    final ActivityMomentViewer a;

    public final void a()
    {
        Toast.makeText(ManagerApp.c(), 0x7f060121, 0).show();
    }

    public final void b()
    {
        Toast.makeText(ManagerApp.c(), 0x7f060120, 0).show();
    }

    (ActivityMomentViewer activitymomentviewer)
    {
        a = activitymomentviewer;
        super();
    }
}
