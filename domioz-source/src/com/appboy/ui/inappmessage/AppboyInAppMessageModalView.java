// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.ui.q;
import com.appboy.ui.s;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage:
//            AppboyInAppMessageImmersiveBaseView, v

public class AppboyInAppMessageModalView extends AppboyInAppMessageImmersiveBaseView
{

    public AppboyInAppMessageModalView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public final void a(int k)
    {
        v.a(findViewById(s.F), k, getContext().getResources().getColor(q.a));
    }

    public final View b()
    {
        return findViewById(s.F);
    }

    public final TextView c()
    {
        return (TextView)findViewById(s.N);
    }

    public final ImageView d()
    {
        return (ImageView)findViewById(s.M);
    }

    public final TextView e()
    {
        return (TextView)findViewById(s.L);
    }

    public final Object f()
    {
        return findViewById(s.F).getBackground();
    }

    public final List g()
    {
        ArrayList arraylist = new ArrayList();
        if (findViewById(s.H) != null)
        {
            arraylist.add(findViewById(s.H));
        }
        if (findViewById(s.I) != null)
        {
            arraylist.add(findViewById(s.I));
        }
        return arraylist;
    }

    public final View h()
    {
        return findViewById(s.G);
    }

    public final TextView i()
    {
        return (TextView)findViewById(s.K);
    }

    public final View j()
    {
        return findViewById(s.J);
    }
}
