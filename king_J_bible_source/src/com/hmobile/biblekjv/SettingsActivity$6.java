// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.widget.SeekBar;

// Referenced classes of package com.hmobile.biblekjv:
//            SettingsActivity

class this._cls0
    implements android.widget.angeListener
{

    final SettingsActivity this$0;

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        editor.putInt("speech_pitch", i);
        editor.commit();
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
    }

    ()
    {
        this$0 = SettingsActivity.this;
        super();
    }
}
