// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.speech;

import com.dominos.android.sdk.common.LogUtil;
import com.nuance.b.e.l;

// Referenced classes of package com.dominos.nina.speech:
//            SpeechManager

class this._cls0
    implements l
{

    final SpeechManager this$0;

    public void completed(boolean flag)
    {
        SpeechManager.access$002(SpeechManager.this, flag);
        if (flag)
        {
            LogUtil.d(SpeechManager.TAG, (new StringBuilder("Nina connected successfully, SESSION ID: ")).append(getNuanceSessionId()).toString(), new Object[0]);
            showNinaButton();
        }
    }

    ()
    {
        this$0 = SpeechManager.this;
        super();
    }
}
