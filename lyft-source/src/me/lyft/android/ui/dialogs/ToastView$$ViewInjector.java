// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            ToastView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (ToastView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, ToastView toastview, Object obj)
    {
        toastview.iconImageView = (ImageView)viewinjector.iconImageView((View)viewinjector.iconImageView(obj, 0x7f0d03ff, "field 'iconImageView'"), 0x7f0d03ff, "field 'iconImageView'");
        toastview.titleTextView = (TextView)viewinjector.titleTextView((View)viewinjector.titleTextView(obj, 0x7f0d0400, "field 'titleTextView'"), 0x7f0d0400, "field 'titleTextView'");
    }

    public volatile void reset(Object obj)
    {
        reset((ToastView)obj);
    }

    public void reset(ToastView toastview)
    {
        toastview.iconImageView = null;
        toastview.titleTextView = null;
    }

    public ()
    {
    }
}
