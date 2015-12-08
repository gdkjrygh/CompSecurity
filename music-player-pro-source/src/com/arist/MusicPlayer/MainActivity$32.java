// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.content.DialogInterface;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

class this._cls0
    implements android.content.OnClickListener
{

    final MainActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dismissDialog(4);
        removeDialog(4);
    }

    kListener()
    {
        this$0 = MainActivity.this;
        super();
    }
}
