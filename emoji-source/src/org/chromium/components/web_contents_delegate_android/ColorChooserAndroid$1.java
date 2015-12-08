// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.components.web_contents_delegate_android;

import org.chromium.ui.ColorPickerDialog;
import org.chromium.ui.OnColorChangedListener;

// Referenced classes of package org.chromium.components.web_contents_delegate_android:
//            ColorChooserAndroid

class this._cls0
    implements OnColorChangedListener
{

    final ColorChooserAndroid this$0;

    public void onColorChanged(int i)
    {
        ColorChooserAndroid.access$000(ColorChooserAndroid.this).dismiss();
        ColorChooserAndroid.access$200(ColorChooserAndroid.this, ColorChooserAndroid.access$100(ColorChooserAndroid.this), i);
    }

    Q()
    {
        this$0 = ColorChooserAndroid.this;
        super();
    }
}
