// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.support.v7.internal.view.menu.f;

// Referenced classes of package com.skype.android.app.calling:
//            CallControlsView

final class this._cls0
    implements android.support.v7.internal.view.menu.
{

    final CallControlsView this$0;

    public final void onCloseMenu(f f, boolean flag)
    {
        refreshCallControls();
    }

    public final boolean onOpenSubMenu(f f)
    {
        return false;
    }

    ()
    {
        this$0 = CallControlsView.this;
        super();
    }
}
