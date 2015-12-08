// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            ErrorManager, PlayerActivity

class this._cls0
    implements Runnable
{

    final ErrorManager this$0;

    public void run()
    {
        Log.e("ErrorManager", "Exit");
        ErrorManager.access$100(ErrorManager.this).finish();
    }

    ()
    {
        this$0 = ErrorManager.this;
        super();
    }
}
