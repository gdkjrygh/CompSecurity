// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.view.View;
import com.arist.PopMenu.PopupWindowSearch;
import com.yong.slidemenu.SlideHolder;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

class this._cls0
    implements android.view.tener
{

    final MainActivity this$0;

    public void onClick(View view)
    {
        MainActivity.access$30(MainActivity.this).toggle();
        MainActivity.access$33(MainActivity.this).showAtLocation(MainActivity.access$34(MainActivity.this), 48, 0, 35);
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
