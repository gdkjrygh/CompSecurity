// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.ui.s;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage:
//            AppboyInAppMessageImmersiveBaseView

public class AppboyInAppMessageFullView extends AppboyInAppMessageImmersiveBaseView
{

    public AppboyInAppMessageFullView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public final TextView c()
    {
        return (TextView)findViewById(s.E);
    }

    public final ImageView d()
    {
        return (ImageView)findViewById(s.D);
    }

    public final TextView e()
    {
        return null;
    }

    public final Object f()
    {
        return findViewById(s.x);
    }

    public final List g()
    {
        ArrayList arraylist = new ArrayList();
        if (findViewById(s.z) != null)
        {
            arraylist.add(findViewById(s.z));
        }
        if (findViewById(s.A) != null)
        {
            arraylist.add(findViewById(s.A));
        }
        return arraylist;
    }

    public final View h()
    {
        return findViewById(s.y);
    }

    public final TextView i()
    {
        return (TextView)findViewById(s.C);
    }

    public final View j()
    {
        return findViewById(s.B);
    }
}
