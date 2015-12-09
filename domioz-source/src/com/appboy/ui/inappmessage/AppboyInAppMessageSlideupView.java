// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.ui.s;

// Referenced classes of package com.appboy.ui.inappmessage:
//            AppboyInAppMessageBaseView

public class AppboyInAppMessageSlideupView extends AppboyInAppMessageBaseView
{

    public AppboyInAppMessageSlideupView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public final TextView c()
    {
        return (TextView)findViewById(s.S);
    }

    public final ImageView d()
    {
        return (ImageView)findViewById(s.R);
    }

    public final TextView e()
    {
        return (TextView)findViewById(s.Q);
    }

    public final Object f()
    {
        return findViewById(s.O);
    }
}
