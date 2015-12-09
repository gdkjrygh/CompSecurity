// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.ui.d.b;
import com.appboy.ui.d.d;

// Referenced classes of package com.appboy.ui.inappmessage:
//            q, v

public abstract class AppboyInAppMessageBaseView extends RelativeLayout
    implements q
{

    public AppboyInAppMessageBaseView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a()
    {
        if (d() != null)
        {
            if (d().getDrawable() == null)
            {
                com.appboy.ui.d.d.a(d());
            } else
            {
                com.appboy.ui.d.d.a(e());
            }
        }
        if (e() != null && com.appboy.ui.d.b.a((String)e().getText()))
        {
            com.appboy.ui.d.d.a(e());
        }
    }

    public void a(int i)
    {
        v.a((View)f(), i);
    }

    public final void a(Bitmap bitmap)
    {
        v.a(bitmap, d());
    }

    public final void a(String s)
    {
        c().setText(s);
    }

    public final void a(String s, int i, int j)
    {
        v.a(getContext(), s, i, j, e());
    }

    public View b()
    {
        return this;
    }

    public final void b(int i)
    {
        v.a(c(), i);
    }

    public abstract TextView c();

    public abstract ImageView d();

    public abstract TextView e();

    public abstract Object f();
}
