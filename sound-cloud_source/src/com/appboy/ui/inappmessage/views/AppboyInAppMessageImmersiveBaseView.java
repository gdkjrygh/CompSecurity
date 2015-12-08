// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.appboy.ui.d.d;
import com.appboy.ui.d.f;
import com.appboy.ui.inappmessage.q;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//            AppboyInAppMessageBaseView, b

public abstract class AppboyInAppMessageImmersiveBaseView extends AppboyInAppMessageBaseView
    implements q
{

    public AppboyInAppMessageImmersiveBaseView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public final void a(List list)
    {
        View view = i();
        int k = getContext().getResources().getColor(com.appboy.ui.n.a.com_appboy_inappmessage_button_bg_light);
        com.appboy.ui.inappmessage.views.b.a(b(), view, k, list);
        com.appboy.ui.inappmessage.views.b.a(b(), list);
    }

    public final void a(boolean flag)
    {
        super.a(flag);
        if (com.appboy.ui.d.d.a(d().getText().toString()))
        {
            f.a(d());
        }
        if (com.appboy.ui.d.d.a(j().getText().toString()))
        {
            f.a(j());
        }
        com.appboy.ui.inappmessage.views.b.a(d(), j());
    }

    public abstract List b();

    public final void c(String s)
    {
        j().setText(s);
    }

    public abstract TextView d();

    public final void d(int k)
    {
        com.appboy.ui.inappmessage.views.b.a(a(), k, getContext().getResources().getColor(com.appboy.ui.n.a.com_appboy_inappmessage_button_close_light));
    }

    public final void e(int k)
    {
        com.appboy.ui.inappmessage.views.b.a(j(), k);
    }

    public abstract View i();

    public abstract TextView j();

    public boolean onKeyDown(int k, KeyEvent keyevent)
    {
        if (k == 4)
        {
            com.appboy.ui.inappmessage.views.b.a();
            return true;
        } else
        {
            return super.onKeyDown(k, keyevent);
        }
    }
}
