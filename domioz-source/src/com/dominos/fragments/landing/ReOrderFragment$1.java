// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.landing;

import com.dominos.nina.speech.SpeechManager;

// Referenced classes of package com.dominos.fragments.landing:
//            ReOrderFragment

class back extends com.dominos.utils.rtActionCallback
{

    final ReOrderFragment this$0;

    public void onAlertDismissed()
    {
        mSpeechManager.resetDialogModel();
    }

    back()
    {
        this$0 = ReOrderFragment.this;
        super();
    }
}
