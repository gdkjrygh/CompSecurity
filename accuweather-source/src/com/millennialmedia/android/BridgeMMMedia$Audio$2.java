// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            BridgeMMMedia

class LoadCompleteListener extends LoadCompleteListener
{

    final this._cls0 this$0;

    public void onLoadComplete(SoundPool soundpool, int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        if (soundpool == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        Object obj = (Context)cess._mth200(this._cls0.this).get();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = (AudioManager)((Context) (obj)).getSystemService("audio");
        float f = ((float)((AudioManager) (obj)).getStreamVolume(3) + 0.0F) / (float)((AudioManager) (obj)).getStreamMaxVolume(3);
        soundpool.play(i, f, f, 1, 0, 1.0F);
        this;
        JVM INSTR monitorexit ;
        return;
        soundpool;
        throw soundpool;
    }

    LoadCompleteListener(SoundPool soundpool)
    {
        this$0 = this._cls0.this;
        super(LoadCompleteListener.this, soundpool);
    }
}
