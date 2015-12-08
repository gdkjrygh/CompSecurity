// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.view.View;

// Referenced classes of package me.lyft.android.controls:
//            CameraToolbar, Toolbar

public class  extends 
{

    public volatile void inject(butterknife.ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (CameraToolbar)obj, obj1);
    }

    public void inject(butterknife.ViewInjector viewinjector, CameraToolbar cameratoolbar, Object obj)
    {
        super.(viewinjector, cameratoolbar, obj);
        cameratoolbar.toolbarContainer = (View)viewinjector.oolbarContainer(obj, 0x7f0d0404, "field 'toolbarContainer'");
    }

    public volatile void inject(butterknife.ViewInjector viewinjector, Toolbar toolbar, Object obj)
    {
        inject(viewinjector, (CameraToolbar)toolbar, obj);
    }

    public volatile void reset(Object obj)
    {
        reset((CameraToolbar)obj);
    }

    public void reset(CameraToolbar cameratoolbar)
    {
        super.reset(cameratoolbar);
        cameratoolbar.toolbarContainer = null;
    }

    public volatile void reset(Toolbar toolbar)
    {
        reset((CameraToolbar)toolbar);
    }

    public ()
    {
    }
}
