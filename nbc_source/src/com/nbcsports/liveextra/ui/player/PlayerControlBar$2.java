// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;


// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerControlBar

class this._cls0
    implements android.view.bilityChangeListener
{

    final PlayerControlBar this$0;

    public void onSystemUiVisibilityChange(int i)
    {
        if (i == 1024)
        {
            hide();
        } else
        if (i == 0)
        {
            show();
            return;
        }
    }

    ()
    {
        this$0 = PlayerControlBar.this;
        super();
    }
}
