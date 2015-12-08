// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import com.skype.android.app.Navigation;
import java.util.TimerTask;

// Referenced classes of package com.skype.android.app.shortcircuit:
//            StallNewUserActivity

final class this._cls0 extends TimerTask
{

    final StallNewUserActivity this$0;

    public final void run()
    {
        navigation.people();
        finish();
    }

    ()
    {
        this$0 = StallNewUserActivity.this;
        super();
    }
}
