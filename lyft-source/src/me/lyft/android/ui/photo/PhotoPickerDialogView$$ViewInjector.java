// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.photo;

import android.view.View;
import android.widget.TextView;
import me.lyft.android.ui.dialogs.DialogButton;

// Referenced classes of package me.lyft.android.ui.photo:
//            PhotoPickerDialogView

public class 
    implements butterknife.ViewInjector
{

    public volatile void inject(butterknife.ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PhotoPickerDialogView)obj, obj1);
    }

    public void inject(butterknife.ViewInjector viewinjector, PhotoPickerDialogView photopickerdialogview, Object obj)
    {
        photopickerdialogview.titleTextView = (TextView)viewinjector.itleTextView((View)viewinjector.itleTextView(obj, 0x7f0d0061, "field 'titleTextView'"), 0x7f0d0061, "field 'titleTextView'");
        photopickerdialogview.takePhotoButton = (DialogButton)viewinjector.akePhotoButton((View)viewinjector.akePhotoButton(obj, 0x7f0d0341, "field 'takePhotoButton'"), 0x7f0d0341, "field 'takePhotoButton'");
        photopickerdialogview.openGalleryButton = (DialogButton)viewinjector.penGalleryButton((View)viewinjector.penGalleryButton(obj, 0x7f0d0342, "field 'openGalleryButton'"), 0x7f0d0342, "field 'openGalleryButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((PhotoPickerDialogView)obj);
    }

    public void reset(PhotoPickerDialogView photopickerdialogview)
    {
        photopickerdialogview.titleTextView = null;
        photopickerdialogview.takePhotoButton = null;
        photopickerdialogview.openGalleryButton = null;
    }

    public ()
    {
    }
}
