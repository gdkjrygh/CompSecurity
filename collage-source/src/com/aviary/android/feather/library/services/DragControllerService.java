// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services;

import android.view.View;
import com.aviary.android.feather.library.services.drag.a;

// Referenced classes of package com.aviary.android.feather.library.services:
//            BaseContextService, a, IAviaryController

public class DragControllerService extends BaseContextService
{
    public static interface a
    {

        public abstract void a(b b1, Object obj, int i);

        public abstract boolean a();
    }

    public static interface b
    {

        public abstract void a(com.aviary.android.feather.library.services.drag.a a1, boolean flag);
    }


    public static int d = 0;
    public static int e = 1;
    private com.aviary.android.feather.library.services.a f;

    public DragControllerService(IAviaryController iaviarycontroller)
    {
        super(iaviarycontroller);
        f = new com.aviary.android.feather.library.services.a(iaviarycontroller.a(), iaviarycontroller.g());
    }

    public com.aviary.android.feather.library.services.a a()
    {
        return f;
    }

    public void a(View view)
    {
        f.a(view);
    }

    public void a(a a1)
    {
        f.a(a1);
    }

    public void a(com.aviary.android.feather.library.services.drag.a a1)
    {
        f.a(a1);
    }

    public void b()
    {
        f.f();
    }

}
