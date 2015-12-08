// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import com.lyft.scoop.Screen;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            InviteToSplitView

class this._cls0
    implements Action1
{

    final InviteToSplitView this$0;

    public void call(Screen screen)
    {
        isShowingSearch = screen instanceof tactsSearchDialog;
        InviteToSplitView.access$200(InviteToSplitView.this, 0);
    }

    public volatile void call(Object obj)
    {
        call((Screen)obj);
    }

    tactsSearchDialog()
    {
        this$0 = InviteToSplitView.this;
        super();
    }
}
