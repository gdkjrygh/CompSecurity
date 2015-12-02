// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.app;

import android.view.MenuItem;
import android.view.View;

// Referenced classes of package com.qihoo.security.app:
//            BaseActivity

class a
    implements android.view.tener
{

    final MenuItem a;
    final BaseActivity b;

    public void onClick(View view)
    {
        b.onOptionsItemSelected(a);
    }

    (BaseActivity baseactivity, MenuItem menuitem)
    {
        b = baseactivity;
        a = menuitem;
        super();
    }
}
