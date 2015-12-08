// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PartySizePickerDialogView

public class 
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PartySizePickerDialogView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, PartySizePickerDialogView partysizepickerdialogview, Object obj)
    {
        partysizepickerdialogview.titleTextView = (TextView)viewinjector.titleTextView((View)viewinjector.titleTextView(obj, 0x7f0d0061, "field 'titleTextView'"), 0x7f0d0061, "field 'titleTextView'");
        partysizepickerdialogview.messageTextView = (TextView)viewinjector.messageTextView((View)viewinjector.messageTextView(obj, 0x7f0d01ec, "field 'messageTextView'"), 0x7f0d01ec, "field 'messageTextView'");
        partysizepickerdialogview.onePartySizeButton = (Button)viewinjector.onePartySizeButton((View)viewinjector.onePartySizeButton(obj, 0x7f0d029c, "field 'onePartySizeButton'"), 0x7f0d029c, "field 'onePartySizeButton'");
        partysizepickerdialogview.twoPartySizeButton = (Button)viewinjector.twoPartySizeButton((View)viewinjector.twoPartySizeButton(obj, 0x7f0d029d, "field 'twoPartySizeButton'"), 0x7f0d029d, "field 'twoPartySizeButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((PartySizePickerDialogView)obj);
    }

    public void reset(PartySizePickerDialogView partysizepickerdialogview)
    {
        partysizepickerdialogview.titleTextView = null;
        partysizepickerdialogview.messageTextView = null;
        partysizepickerdialogview.onePartySizeButton = null;
        partysizepickerdialogview.twoPartySizeButton = null;
    }

    public ()
    {
    }
}
