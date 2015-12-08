// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.preferences;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

// Referenced classes of package com.accuweather.android.preferences:
//            SettingsActivity

class this._cls0 extends Handler
{

    final SettingsActivity this$0;

    public void handleMessage(Message message)
    {
        message = (TextView)message.obj;
        message.setTextSize(1, ((Float)message.getTag()).floatValue());
    }

    ()
    {
        this$0 = SettingsActivity.this;
        super();
    }
}
