// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.app;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.android.app:
//            UserInputManager, ApplicationStateListener

class this._cls0
    implements Runnable
{

    final UserInputManager this$0;

    public void run()
    {
        for (Iterator iterator = UserInputManager.access$000(UserInputManager.this).iterator(); iterator.hasNext(); ((ApplicationStateListener)iterator.next()).onBackground(UserInputManager.this)) { }
    }

    tener()
    {
        this$0 = UserInputManager.this;
        super();
    }
}
