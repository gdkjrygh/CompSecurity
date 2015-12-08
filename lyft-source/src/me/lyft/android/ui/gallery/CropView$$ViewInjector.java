// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.gallery;

import android.view.View;
import me.lyft.android.controls.CameraToolbar;

// Referenced classes of package me.lyft.android.ui.gallery:
//            CropView, Cropper

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (CropView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, CropView cropview, Object obj)
    {
        cropview.cropperView = (Cropper)viewinjector.cropperView((View)viewinjector.cropperView(obj, 0x7f0d022b, "field 'cropperView'"), 0x7f0d022b, "field 'cropperView'");
        cropview.saveButton = (View)viewinjector.saveButton(obj, 0x7f0d00c8, "field 'saveButton'");
        cropview.retakeButton = (View)viewinjector.retakeButton(obj, 0x7f0d00c7, "field 'retakeButton'");
        cropview.toolbar = (CameraToolbar)viewinjector.bar((View)viewinjector.bar(obj, 0x7f0d00b9, "field 'toolbar'"), 0x7f0d00b9, "field 'toolbar'");
    }

    public volatile void reset(Object obj)
    {
        reset((CropView)obj);
    }

    public void reset(CropView cropview)
    {
        cropview.cropperView = null;
        cropview.saveButton = null;
        cropview.retakeButton = null;
        cropview.toolbar = null;
    }

    public ()
    {
    }
}
