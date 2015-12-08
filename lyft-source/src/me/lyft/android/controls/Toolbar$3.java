// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import rx.functions.Func1;

// Referenced classes of package me.lyft.android.controls:
//            Toolbar

class this._cls0
    implements Func1
{

    final Toolbar this$0;

    public Integer call(olbarItem olbaritem)
    {
        return Integer.valueOf(olbarItem.access._mth000(olbaritem));
    }

    public volatile Object call(Object obj)
    {
        return call((olbarItem)obj);
    }

    olbarItem()
    {
        this$0 = Toolbar.this;
        super();
    }
}
