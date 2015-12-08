// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services.drag;

import android.graphics.Rect;

// Referenced classes of package com.aviary.android.feather.library.services.drag:
//            DragView

public interface com.aviary.android.feather.library.services.drag.a
{
    public static interface a
    {

        public abstract boolean a(com.aviary.android.feather.library.services.DragControllerService.b b1, int i, int j, int k, int l, DragView dragview, Object obj);

        public abstract void b(com.aviary.android.feather.library.services.DragControllerService.b b1, int i, int j, int k, int l, DragView dragview, Object obj);
    }


    public abstract void a(com.aviary.android.feather.library.services.DragControllerService.b b1, int i, int j, int k, int l, DragView dragview, Object obj);

    public abstract void b(com.aviary.android.feather.library.services.DragControllerService.b b1, int i, int j, int k, int l, DragView dragview, Object obj);

    public abstract void c(com.aviary.android.feather.library.services.DragControllerService.b b1, int i, int j, int k, int l, DragView dragview, Object obj);

    public abstract void d(com.aviary.android.feather.library.services.DragControllerService.b b1, int i, int j, int k, int l, DragView dragview, Object obj);

    public abstract boolean e(com.aviary.android.feather.library.services.DragControllerService.b b1, int i, int j, int k, int l, DragView dragview, Object obj);

    public abstract void getHitRect(Rect rect);

    public abstract int getLeft();

    public abstract void getLocationOnScreen(int ai[]);

    public abstract int getTop();
}
