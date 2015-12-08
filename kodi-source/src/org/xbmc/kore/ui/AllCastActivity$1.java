// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import android.widget.AdapterView;
import org.xbmc.kore.utils.Utils;

// Referenced classes of package org.xbmc.kore.ui:
//            AllCastActivity

class this._cls0
    implements android.widget.ClickListener
{

    final AllCastActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        Utils.openImdbForPerson(AllCastActivity.this, ((ewHolder)view.getTag()).castName);
    }

    ewHolder()
    {
        this$0 = AllCastActivity.this;
        super();
    }
}
