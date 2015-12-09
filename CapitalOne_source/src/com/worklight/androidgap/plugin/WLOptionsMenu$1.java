// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import java.util.Comparator;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WLOptionsMenu, WLMenuItem

class this._cls0
    implements Comparator
{

    final WLOptionsMenu this$0;

    public int compare(WLMenuItem wlmenuitem, WLMenuItem wlmenuitem1)
    {
        return wlmenuitem.getId() - wlmenuitem1.getId();
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((WLMenuItem)obj, (WLMenuItem)obj1);
    }

    ()
    {
        this$0 = WLOptionsMenu.this;
        super();
    }
}
