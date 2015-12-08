// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//            AppboyInAppMessageBaseView

public class AppboyInAppMessageSlideupView extends AppboyInAppMessageBaseView
{

    public ImageView b;
    public View c;

    public AppboyInAppMessageSlideupView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public final TextView d()
    {
        return (TextView)findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_slideup_message);
    }

    public final ImageView e()
    {
        return b;
    }

    public final TextView f()
    {
        return (TextView)findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_slideup_icon);
    }

    public final Object g()
    {
        return findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_slideup);
    }

    public final View h()
    {
        return c;
    }
}
