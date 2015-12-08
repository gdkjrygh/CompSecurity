// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//            AppboyInAppMessageImmersiveBaseView

public class AppboyInAppMessageFullView extends AppboyInAppMessageImmersiveBaseView
{

    public ImageView b;
    public View c;

    public AppboyInAppMessageFullView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public final View a()
    {
        return findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_full_close_button);
    }

    public final List b()
    {
        ArrayList arraylist = new ArrayList();
        if (findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_full_button_one) != null)
        {
            arraylist.add(findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_full_button_one));
        }
        if (findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_full_button_two) != null)
        {
            arraylist.add(findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_full_button_two));
        }
        return arraylist;
    }

    public final TextView d()
    {
        return (TextView)findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_full_message);
    }

    public final ImageView e()
    {
        return b;
    }

    public final TextView f()
    {
        return null;
    }

    public final Object g()
    {
        return findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_full);
    }

    public final View h()
    {
        return c;
    }

    public final View i()
    {
        return findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_full_button_layout);
    }

    public final TextView j()
    {
        return (TextView)findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_full_header_text);
    }
}
