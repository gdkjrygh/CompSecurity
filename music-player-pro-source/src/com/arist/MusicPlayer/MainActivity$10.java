// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity, SettingScreen

class this._cls0
    implements android.view.ener
{

    final MainActivity this$0;

    public void onClick(View view)
    {
        startActivity(new Intent(MainActivity.this, com/arist/MusicPlayer/SettingScreen));
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
