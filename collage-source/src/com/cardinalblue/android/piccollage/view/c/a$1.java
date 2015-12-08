// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.c;

import android.widget.CompoundButton;
import com.cardinalblue.android.piccollage.auth.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.view.c:
//            a

class a
    implements android.widget.oundButton.OnCheckedChangeListener
{

    final a a;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag)
        {
            com.cardinalblue.android.piccollage.a.b.d(a.a.c(), "login");
            a.a.a(a.d, a.c, "account");
            a.b();
            return;
        } else
        {
            com.cardinalblue.android.piccollage.a.b.d(a.a.c(), "logout");
            a.a.a();
            a.d();
            a.a();
            return;
        }
    }

    stener(a a1)
    {
        a = a1;
        super();
    }
}
