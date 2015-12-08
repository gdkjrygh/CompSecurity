// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.help;

import android.view.MenuItem;
import android.view.View;

// Referenced classes of package com.google.android.apps.translate.help:
//            HelpActivity

final class b
    implements android.view.View.OnClickListener
{

    final MenuItem a;
    final HelpActivity b;

    b(HelpActivity helpactivity, MenuItem menuitem)
    {
        b = helpactivity;
        a = menuitem;
        super();
    }

    public final void onClick(View view)
    {
        b.onOptionsItemSelected(a);
    }
}
