// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.content.Intent;
import android.view.View;
import yong.powerfull.equalizer.Equize;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

class this._cls0
    implements android.view.tener
{

    final MainActivity this$0;

    public void onClick(View view)
    {
        if (android.os.DK_INT >= 9)
        {
            startActivity(new Intent(MainActivity.this, yong/powerfull/equalizer/Equize));
        }
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
