// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            ErrorManager

class this._cls0
    implements Runnable
{

    final ErrorManager this$0;

    public void run()
    {
        try
        {
            Log.d("ErrorManager", "Waiting 1.5 second to exit app");
            wait(1500L);
        }
        catch (Exception exception)
        {
            Log.w("ErrorManager", "Wait is interrupted", exception);
        }
        Log.d("ErrorManager", "Kill app");
        forceStop();
    }

    ()
    {
        this$0 = ErrorManager.this;
        super();
    }
}
