// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.f;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import com.facebook.base.activity.a;

// Referenced classes of package com.facebook.ui.f:
//            a

public class b extends a
{

    private final Activity a;
    private final com.facebook.ui.f.a b;

    public b(Activity activity, com.facebook.ui.f.a a1)
    {
        a = activity;
        b = a1;
    }

    public void a(Menu menu)
    {
        android.view.MenuInflater menuinflater = a.getMenuInflater();
        b.a(menu, menuinflater);
    }

    public boolean a(MenuItem menuitem)
    {
        return b.a(menuitem);
    }
}
