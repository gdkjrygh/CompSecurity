// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.arist.model.skin.ColorProgressBar;

// Referenced classes of package com.arist.activity:
//            MyApplication, MainActivity

final class s extends Handler
{

    final MainActivity a;

    s(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 34
    //                   2 140;
           goto _L1 _L2 _L3
_L1:
        super.handleMessage(message);
        return;
_L2:
        int i = message.getData().getInt("text");
        if (i == 1)
        {
            MainActivity.a(a, MyApplication.a.getCurrentPosition());
        }
        MainActivity mainactivity = a;
        if (MainActivity.b(a) + i * 200 > MyApplication.b())
        {
            i = MyApplication.b();
        } else
        {
            i = i * 200 + MainActivity.b(a);
        }
        MainActivity.a(mainactivity, i);
        MainActivity.c(a).a(((float)MainActivity.b(a) * 1.0F) / (float)MyApplication.b());
        continue; /* Loop/switch isn't completed */
_L3:
        int j = message.getData().getInt("text");
        if (j == 1)
        {
            MainActivity.a(a, MyApplication.a.getCurrentPosition());
        }
        MainActivity mainactivity1 = a;
        if (MainActivity.b(a) - j * 200 < 0)
        {
            j = 0;
        } else
        {
            j = MainActivity.b(a) - j * 200;
        }
        MainActivity.a(mainactivity1, j);
        MainActivity.c(a).a(((float)MainActivity.b(a) * 1.0F) / (float)MyApplication.b());
        if (true) goto _L1; else goto _L4
_L4:
    }
}
