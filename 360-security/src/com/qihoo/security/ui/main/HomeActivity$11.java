// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.view.MenuItem;
import android.view.View;

// Referenced classes of package com.qihoo.security.ui.main:
//            HomeActivity

class a
    implements android.view.ener
{

    final MenuItem a;
    final HomeActivity b;

    public void onClick(View view)
    {
        b.onOptionsItemSelected(a);
    }

    (HomeActivity homeactivity, MenuItem menuitem)
    {
        b = homeactivity;
        a = menuitem;
        super();
    }
}
