// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.camera;

import android.view.View;
import me.lyft.android.controls.CameraToolbar;
import me.lyft.android.controls.FlashButton;
import me.lyft.android.controls.PreviewFrameLayout;
import me.lyft.android.controls.PreviewSurfaceView;

// Referenced classes of package me.lyft.android.ui.camera:
//            CaptureView

public class _cls9
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (CaptureView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, CaptureView captureview, Object obj)
    {
        captureview.previewSurfaceView = (PreviewSurfaceView)viewinjector.eView((View)viewinjector.eView(obj, 0x7f0d00b8, "field 'previewSurfaceView'"), 0x7f0d00b8, "field 'previewSurfaceView'");
        captureview.previewFrame = (PreviewFrameLayout)viewinjector.ayout((View)viewinjector.ayout(obj, 0x7f0d00b6, "field 'previewFrame'"), 0x7f0d00b6, "field 'previewFrame'");
        captureview.captureButton = (View)viewinjector.captureButton(obj, 0x7f0d0004, "field 'captureButton'");
        captureview.flashButton = (FlashButton)viewinjector.flashButton((View)viewinjector.flashButton(obj, 0x7f0d0015, "field 'flashButton'"), 0x7f0d0015, "field 'flashButton'");
        captureview.flashButtonFrame = (View)viewinjector.flashButtonFrame(obj, 0x7f0d00bb, "field 'flashButtonFrame'");
        captureview.switchCameraButton = (View)viewinjector.switchCameraButton(obj, 0x7f0d002b, "field 'switchCameraButton'");
        captureview.toolbar = (CameraToolbar)viewinjector.((View)viewinjector.(obj, 0x7f0d00b9, "field 'toolbar'"), 0x7f0d00b9, "field 'toolbar'");
    }

    public volatile void reset(Object obj)
    {
        reset((CaptureView)obj);
    }

    public void reset(CaptureView captureview)
    {
        captureview.previewSurfaceView = null;
        captureview.previewFrame = null;
        captureview.captureButton = null;
        captureview.flashButton = null;
        captureview.flashButtonFrame = null;
        captureview.switchCameraButton = null;
        captureview.toolbar = null;
    }

    public _cls9()
    {
    }
}
