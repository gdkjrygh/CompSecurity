// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.media.MediaPlayer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.millennialmedia.android:
//            BridgeMMMedia, MMSDK

class this._cls0
    implements Runnable
{

    final ayed this$0;

    public void run()
    {
        if (cess._mth100(this._cls0.this) != null)
        {
            if (cess._mth100(this._cls0.this).isPlaying())
            {
                int i = cess._mth100(this._cls0.this).getCurrentPosition();
                if (riodicListeners != null)
                {
                    for (Iterator iterator = riodicListeners.iterator(); iterator.hasNext(); ((riodicListener)iterator.next()).onUpdate(i)) { }
                }
            }
            MMSDK.runOnUiThreadDelayed(this, 500L);
        }
    }

    riodicListener()
    {
        this$0 = this._cls0.this;
        super();
    }
}
