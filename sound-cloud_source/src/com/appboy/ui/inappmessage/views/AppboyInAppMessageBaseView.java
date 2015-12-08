// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.ui.d.b;
import com.appboy.ui.d.d;
import com.appboy.ui.d.f;
import com.appboy.ui.inappmessage.r;
import com.facebook.drawee.view.SimpleDraweeView;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//            b

public abstract class AppboyInAppMessageBaseView extends RelativeLayout
    implements r
{

    public final boolean a;

    public AppboyInAppMessageBaseView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = com.appboy.ui.d.b.a(context);
    }

    public void a(int i)
    {
        com.appboy.ui.inappmessage.views.b.a((View)g(), i);
    }

    public final void a(Bitmap bitmap)
    {
        com.appboy.ui.inappmessage.views.b.a(bitmap, e());
    }

    public final void a(String s)
    {
        d().setText(s);
    }

    public final void a(String s, int i, int j)
    {
        com.appboy.ui.inappmessage.views.b.a(getContext(), s, i, j, f());
    }

    public void a(boolean flag)
    {
        RelativeLayout relativelayout;
        Object obj;
        if (a)
        {
            obj = h();
            relativelayout = (RelativeLayout)findViewById(com.appboy.ui.n.c.com_appboy_stubbed_inappmessage_drawee_view_parent);
        } else
        {
            obj = e();
            relativelayout = (RelativeLayout)findViewById(com.appboy.ui.n.c.com_appboy_stubbed_inappmessage_image_view_parent);
        }
        if (obj != null)
        {
            if (!flag)
            {
                com.appboy.ui.d.f.a(((View) (obj)));
                if (relativelayout != null)
                {
                    com.appboy.ui.d.f.a(relativelayout);
                }
            } else
            {
                com.appboy.ui.d.f.a(f());
            }
        }
        if (f() != null && com.appboy.ui.d.d.a((String)f().getText()))
        {
            com.appboy.ui.d.f.a(f());
        }
    }

    public final void b(int i)
    {
        com.appboy.ui.inappmessage.views.b.a(d(), i);
    }

    public final void b(String s)
    {
        com.appboy.ui.d.b.a((SimpleDraweeView)h(), s, 0.0F, false);
    }

    public View c()
    {
        return this;
    }

    public final View c(int i)
    {
        ((ViewStub)findViewById(i)).inflate();
        if (a)
        {
            return findViewById(com.appboy.ui.n.c.com_appboy_stubbed_inappmessage_drawee_view);
        } else
        {
            return findViewById(com.appboy.ui.n.c.com_appboy_stubbed_inappmessage_image_view);
        }
    }

    public abstract TextView d();

    public abstract ImageView e();

    public abstract TextView f();

    public abstract Object g();

    public abstract View h();
}
