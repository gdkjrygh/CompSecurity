// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.View;
import me.lyft.android.ui.camera.CaptureView;

// Referenced classes of package me.lyft.android.ui.landing:
//            CaptureUserPhotoView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (CaptureUserPhotoView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, CaptureUserPhotoView captureuserphotoview, Object obj)
    {
        captureuserphotoview.captureView = (CaptureView)viewinjector.captureView((View)viewinjector.captureView(obj, 0x7f0d00b3, "field 'captureView'"), 0x7f0d00b3, "field 'captureView'");
    }

    public volatile void reset(Object obj)
    {
        reset((CaptureUserPhotoView)obj);
    }

    public void reset(CaptureUserPhotoView captureuserphotoview)
    {
        captureuserphotoview.captureView = null;
    }

    public ()
    {
    }
}
