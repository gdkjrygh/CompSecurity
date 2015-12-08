// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.appboy.f;
import com.appboy.f.a;
import com.appboy.ui.d.b;
import com.appboy.ui.d.d;
import com.appboy.ui.q;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage:
//            AppboyInAppMessageBaseView, o, v, a

public abstract class AppboyInAppMessageImmersiveBaseView extends AppboyInAppMessageBaseView
    implements o
{

    private static final String a;

    public AppboyInAppMessageImmersiveBaseView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public final void a()
    {
        super.a();
        if (com.appboy.ui.d.b.a(c().getText().toString()))
        {
            com.appboy.ui.d.d.a(c());
        }
        if (com.appboy.ui.d.b.a(i().getText().toString()))
        {
            com.appboy.ui.d.d.a(i());
        }
        com.appboy.ui.inappmessage.v.a(c(), i());
    }

    public final void a(List list)
    {
        View view = h();
        int j = getContext().getResources().getColor(q.b);
        com.appboy.ui.inappmessage.v.a(g(), view, j, list);
        com.appboy.ui.inappmessage.v.a(g(), list);
    }

    public final void b(String s)
    {
        i().setText(s);
    }

    public abstract TextView c();

    public final void c(int j)
    {
        com.appboy.ui.inappmessage.v.a(j(), j, getContext().getResources().getColor(q.c));
    }

    public final void d(int j)
    {
        com.appboy.ui.inappmessage.v.a(i(), j);
    }

    public abstract List g();

    public abstract View h();

    public abstract TextView i();

    public boolean onKeyDown(int j, KeyEvent keyevent)
    {
        if (j == 4)
        {
            com.appboy.f.a.a(a, "Back button intercepted by in-app message view, closing in-app message.");
            com.appboy.ui.inappmessage.a.a().b();
            return true;
        } else
        {
            return super.onKeyDown(j, keyevent);
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, com/appboy/ui/inappmessage/AppboyInAppMessageImmersiveBaseView.getName()
        });
    }
}
