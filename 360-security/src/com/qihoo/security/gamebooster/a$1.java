// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.view.View;
import com.qihoo.security.c.a;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleButton;
import com.qihoo.security.support.b;
import java.util.ArrayList;

// Referenced classes of package com.qihoo.security.gamebooster:
//            a, b

class b
    implements android.view..OnClickListener
{

    final a a;
    final LocaleButton b;
    final com.qihoo.security.gamebooster.a c;

    public void onClick(View view)
    {
        if (a.g)
        {
            return;
        }
        a.g = true;
        com.qihoo.security.gamebooster.a.a(c).add(a);
        b.setText(d.a().a(0x7f0c0091));
        b.setTextColor(com.qihoo.security.gamebooster.a.b(c).getResources().getColor(0x7f080055));
        b.setEnabled(false);
        if (com.qihoo.security.gamebooster.a.c(c))
        {
            com.qihoo.security.support.b.a(11111, a.a.packageName, "1");
        } else
        {
            com.qihoo.security.support.b.a(11111, a.a.packageName, "0");
        }
        com.qihoo.security.gamebooster.b.a().c(a.a.packageName);
    }

    caleButton(com.qihoo.security.gamebooster.a a1, a a2, LocaleButton localebutton)
    {
        c = a1;
        a = a2;
        b = localebutton;
        super();
    }
}
