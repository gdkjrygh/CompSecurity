// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//            AppboyInAppMessageImmersiveBaseView, b

public class AppboyInAppMessageModalView extends AppboyInAppMessageImmersiveBaseView
{

    public ImageView b;
    public View c;

    public AppboyInAppMessageModalView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public final View a()
    {
        return findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_modal_close_button);
    }

    public final void a(int k)
    {
        com.appboy.ui.inappmessage.views.b.a(findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_modal), k, getContext().getResources().getColor(com.appboy.ui.n.a.com_appboy_inappmessage_background_light));
    }

    public final List b()
    {
        ArrayList arraylist = new ArrayList();
        if (findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_modal_button_one) != null)
        {
            arraylist.add(findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_modal_button_one));
        }
        if (findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_modal_button_two) != null)
        {
            arraylist.add(findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_modal_button_two));
        }
        return arraylist;
    }

    public final View c()
    {
        return findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_modal);
    }

    public final TextView d()
    {
        return (TextView)findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_modal_message);
    }

    public final ImageView e()
    {
        return b;
    }

    public final TextView f()
    {
        return (TextView)findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_modal_icon);
    }

    public final Object g()
    {
        return findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_modal).getBackground();
    }

    public final View h()
    {
        return c;
    }

    public final View i()
    {
        return findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_modal_button_layout);
    }

    public final TextView j()
    {
        return (TextView)findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_modal_header_text);
    }
}
