// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package org.xbmc.kore.ui:
//            NavigationDrawerFragment

class this._cls0
    implements android.widget.ener
{

    final NavigationDrawerFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (awerItem)adapterview.getItemAtPosition(i);
        NavigationDrawerFragment.access$000(NavigationDrawerFragment.this, adapterview, i);
    }

    awerItem()
    {
        this$0 = NavigationDrawerFragment.this;
        super();
    }
}
