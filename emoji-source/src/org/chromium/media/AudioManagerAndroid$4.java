// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

// Referenced classes of package org.chromium.media:
//            AudioManagerAndroid

class this._cls0 extends ContentObserver
{

    final AudioManagerAndroid this$0;

    public void onChange(boolean flag)
    {
        boolean flag1 = false;
        super.onChange(flag);
        if (AudioManagerAndroid.access$800(AudioManagerAndroid.this).getMode() != 3)
        {
            throw new IllegalStateException("Only enable SettingsObserver in COMM mode");
        }
        int i = AudioManagerAndroid.access$800(AudioManagerAndroid.this).getStreamVolume(0);
        AudioManagerAndroid audiomanagerandroid = AudioManagerAndroid.this;
        long l = AudioManagerAndroid.access$900(AudioManagerAndroid.this);
        flag = flag1;
        if (i == 0)
        {
            flag = true;
        }
        AudioManagerAndroid.access$1000(audiomanagerandroid, l, flag);
    }

    (Handler handler)
    {
        this$0 = AudioManagerAndroid.this;
        super(handler);
    }
}
