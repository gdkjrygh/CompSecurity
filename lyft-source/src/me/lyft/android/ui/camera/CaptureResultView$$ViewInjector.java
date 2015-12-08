// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.camera;

import android.view.View;
import android.widget.ImageView;
import me.lyft.android.controls.CameraToolbar;

// Referenced classes of package me.lyft.android.ui.camera:
//            CaptureResultView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (CaptureResultView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, CaptureResultView captureresultview, Object obj)
    {
        captureresultview.imageView = (ImageView)viewinjector.imageView((View)viewinjector.imageView(obj, 0x7f0d00c6, "field 'imageView'"), 0x7f0d00c6, "field 'imageView'");
        captureresultview.retakeButton = (View)viewinjector.retakeButton(obj, 0x7f0d00c7, "field 'retakeButton'");
        captureresultview.saveButton = (View)viewinjector.saveButton(obj, 0x7f0d00c8, "field 'saveButton'");
        captureresultview.cameraToolbar = (CameraToolbar)viewinjector.cameraToolbar((View)viewinjector.cameraToolbar(obj, 0x7f0d00b9, "field 'cameraToolbar'"), 0x7f0d00b9, "field 'cameraToolbar'");
    }

    public volatile void reset(Object obj)
    {
        reset((CaptureResultView)obj);
    }

    public void reset(CaptureResultView captureresultview)
    {
        captureresultview.imageView = null;
        captureresultview.retakeButton = null;
        captureresultview.saveButton = null;
        captureresultview.cameraToolbar = null;
    }

    public ()
    {
    }
}
