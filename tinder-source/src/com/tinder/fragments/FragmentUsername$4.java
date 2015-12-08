// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.tinder.managers.z;
import com.tinder.model.User;
import com.tinder.views.CustomTextView;

// Referenced classes of package com.tinder.fragments:
//            FragmentUsername

final class b
    implements Runnable
{

    final int a;
    final String b;
    final FragmentUsername c;

    public final void run()
    {
        User user = c.a.b();
        (new StringBuilder("Response code: ")).append(a);
        switch (a)
        {
        default:
            FragmentUsername.a(c, "Error");
            return;

        case 201: 
        case 204: 
            FragmentUsername.d(c).setImageResource(0x7f020242);
            FragmentUsername.e(c).setEnabled(false);
            FragmentUsername.f(c).setEnabled(false);
            if (user != null)
            {
                user.setUsername(b);
            }
            FragmentUsername.a(c, c.getString(0x7f060213));
            (new Handler()).postDelayed(new Runnable() {

                final FragmentUsername._cls4 a;

                public final void run()
                {
                    a.c.b.onClick(null);
                }

            
            {
                a = FragmentUsername._cls4.this;
                super();
            }
            }, 1000L);
            return;

        case 405: 
        case 409: 
        case 410: 
        case 422: 
            FragmentUsername.d(c).setImageResource(0x7f020243);
            FragmentUsername.g(c).setText(0x7f060214);
            FragmentUsername.g(c).setTextColor(c.getResources().getColor(0x7f0d0018));
            FragmentUsername.g(c).animate().alpha(1.0F);
            return;
        }
    }

    _cls1.a(FragmentUsername fragmentusername, int i, String s)
    {
        c = fragmentusername;
        a = i;
        b = s;
        super();
    }
}
