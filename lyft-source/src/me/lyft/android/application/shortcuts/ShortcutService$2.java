// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.shortcuts;

import me.lyft.android.domain.shortcuts.Shortcut;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.shortcuts:
//            ShortcutService

class this._cls0
    implements Func1
{

    final ShortcutService this$0;

    public Boolean call(Shortcut shortcut)
    {
        return Boolean.valueOf(shortcut.isHome());
    }

    public volatile Object call(Object obj)
    {
        return call((Shortcut)obj);
    }

    ()
    {
        this$0 = ShortcutService.this;
        super();
    }
}
