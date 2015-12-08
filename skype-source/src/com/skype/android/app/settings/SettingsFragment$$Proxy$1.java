// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import com.skype.android.app.shortcircuit.OnAutoBuddyPreferenceResult;
import com.skype.android.inject.EventThread;
import com.skype.android.inject.LifecycleState;
import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyEventListener;

// Referenced classes of package com.skype.android.app.settings:
//            SettingsFragment

final class this._cls0 extends ProxyEventListener
{

    final esult this$0;

    public final void onEvent(OnAutoBuddyPreferenceResult onautobuddypreferenceresult)
    {
        ((SettingsFragment)tTarget()).onEvent(onautobuddypreferenceresult);
    }

    public final volatile void onEvent(Object obj)
    {
        onEvent((OnAutoBuddyPreferenceResult)obj);
    }

    esult(Proxy proxy, Class class1, LifecycleState lifecyclestate, EventThread eventthread)
    {
        this$0 = this._cls0.this;
        super(proxy, class1, lifecyclestate, eventthread);
    }
}
