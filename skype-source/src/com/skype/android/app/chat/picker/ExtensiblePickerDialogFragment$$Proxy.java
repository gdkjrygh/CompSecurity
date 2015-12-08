// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.inject.EventThread;
import com.skype.android.inject.LifecycleState;
import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyEventListener;
import com.skype.android.mediacontent.OnPackInfoReady;

// Referenced classes of package com.skype.android.app.chat.picker:
//            ExtensiblePickerDialogFragment

public class onEventOnPackInfoReady extends onEventOnPackInfoReady
{

    private ProxyEventListener onEventOnPackInfoReady;

    public void clearViews()
    {
        super.();
    }

    public void injectViews()
    {
        super.s();
    }

    public _cls1.this._cls0(ExtensiblePickerDialogFragment extensiblepickerdialogfragment)
    {
        super(extensiblepickerdialogfragment);
        onEventOnPackInfoReady = new ProxyEventListener(this, com/skype/android/mediacontent/OnPackInfoReady, LifecycleState.CREATED, null) {

            final ExtensiblePickerDialogFragment..Proxy this$0;

            public final void onEvent(OnPackInfoReady onpackinfoready)
            {
                ((ExtensiblePickerDialogFragment)getTarget()).onEvent(onpackinfoready);
            }

            public final volatile void onEvent(Object obj)
            {
                onEvent((OnPackInfoReady)obj);
            }

            
            {
                this$0 = ExtensiblePickerDialogFragment..Proxy.this;
                super(proxy1, class1, lifecyclestate, eventthread);
            }
        };
        addListener(onEventOnPackInfoReady);
    }
}
