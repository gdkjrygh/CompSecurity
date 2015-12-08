// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import com.skype.android.inject.EventThread;
import com.skype.android.inject.LifecycleState;
import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyEventListener;
import com.skype.android.mediacontent.OnMediaContentReady;

// Referenced classes of package com.skype.android.app.chat.picker.Search:
//            MediaPickerSearchResultsViewPagerAdapter

public class onEventOnMediaContentReady extends Proxy
{

    private ProxyEventListener onEventOnMediaContentReady;

    public void clearViews()
    {
        super.clearViews();
    }

    public void injectViews()
    {
        super.injectViews();
    }

    public _cls1.this._cls0(MediaPickerSearchResultsViewPagerAdapter mediapickersearchresultsviewpageradapter)
    {
        super(mediapickersearchresultsviewpageradapter);
        onEventOnMediaContentReady = new ProxyEventListener(this, com/skype/android/mediacontent/OnMediaContentReady, null, EventThread.MAIN) {

            final MediaPickerSearchResultsViewPagerAdapter..Proxy this$0;

            public final void onEvent(OnMediaContentReady onmediacontentready)
            {
                ((MediaPickerSearchResultsViewPagerAdapter)getTarget()).onEvent(onmediacontentready);
            }

            public final volatile void onEvent(Object obj)
            {
                onEvent((OnMediaContentReady)obj);
            }

            
            {
                this$0 = MediaPickerSearchResultsViewPagerAdapter..Proxy.this;
                super(proxy1, class1, lifecyclestate, eventthread);
            }
        };
        addListener(onEventOnMediaContentReady);
    }
}
