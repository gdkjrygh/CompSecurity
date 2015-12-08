// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.TextView;
import me.lyft.android.ui.UserImageView;

// Referenced classes of package me.lyft.android.ui.driver:
//            QueuedRidePassengerItemView

public class I
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (QueuedRidePassengerItemView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, QueuedRidePassengerItemView queuedridepassengeritemview, Object obj)
    {
        queuedridepassengeritemview.userImageView = (UserImageView)viewinjector.userImageView((View)viewinjector.userImageView(obj, 0x7f0d0388, "field 'userImageView'"), 0x7f0d0388, "field 'userImageView'");
        queuedridepassengeritemview.userNameTextView = (TextView)viewinjector.userNameTextView((View)viewinjector.userNameTextView(obj, 0x7f0d0389, "field 'userNameTextView'"), 0x7f0d0389, "field 'userNameTextView'");
    }

    public volatile void reset(Object obj)
    {
        reset((QueuedRidePassengerItemView)obj);
    }

    public void reset(QueuedRidePassengerItemView queuedridepassengeritemview)
    {
        queuedridepassengeritemview.userImageView = null;
        queuedridepassengeritemview.userNameTextView = null;
    }

    public I()
    {
    }
}
