// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.speech;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.dominos.android.sdk.common.ConfigProvider_;
import com.dominos.android.sdk.core.prompt.PromptManager_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.nina.speech:
//            SpeechManager

public final class SpeechManager_ extends SpeechManager
{

    private static SpeechManager_ instance_;
    private Context context_;
    private Handler handler_;

    private SpeechManager_(Context context)
    {
        handler_ = new Handler(Looper.getMainLooper());
        context_ = context;
    }

    public static SpeechManager_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new SpeechManager_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mPromptManager = PromptManager_.getInstance_(context_);
        mConfigProvider = ConfigProvider_.getInstance_(context_);
    }

    public final void hideNinaButton()
    {
        handler_.post(new _cls1());
    }

    public final void onActivityBackButton(com.dominos.bus.events.ActivityLifecycleEvents.BackButtonEvent backbuttonevent)
    {
        onActivityBackButton(backbuttonevent);
    }

    public final void onActivityCreate(com.dominos.bus.events.ActivityLifecycleEvents.CreateEvent createevent)
    {
        onActivityCreate(createevent);
    }

    public final void onActivityDestroy(com.dominos.bus.events.ActivityLifecycleEvents.DestroyEvent destroyevent)
    {
        onActivityDestroy(destroyevent);
    }

    public final void onActivityPause(com.dominos.bus.events.ActivityLifecycleEvents.PauseEvent pauseevent)
    {
        onActivityPause(pauseevent);
    }

    public final void onActivityResume(com.dominos.bus.events.ActivityLifecycleEvents.ResumeEvent resumeevent)
    {
        onActivityResume(resumeevent);
    }

    public final void onActivitySetContent(com.dominos.bus.events.ActivityLifecycleEvents.SetContentEvent setcontentevent)
    {
        onActivitySetContent(setcontentevent);
    }

    public final void onShowSpeechBar(com.dominos.bus.events.SpeechEvents.ShowSpeechBarEvent showspeechbarevent)
    {
        onShowSpeechBar(showspeechbarevent);
    }

    public final void removeInvokeButtonEvent(com.dominos.bus.events.SpeechEvents.RemoveInvokeButton removeinvokebutton)
    {
        removeInvokeButtonEvent(removeinvokebutton);
    }

    public final void setActivityFilter(com.dominos.bus.events.SpeechEvents.FilterModification filtermodification)
    {
        setActivityFilter(filtermodification);
    }

    public final void showNinaButton()
    {
        handler_.post(new _cls2());
    }

    public final void startActivityRequest(com.dominos.bus.events.ActivityNavEvents.StartActivityRequest startactivityrequest)
    {
        startActivityRequest(startactivityrequest);
    }

    public final void stopNina(com.dominos.bus.events.SpeechEvents.StopNinaRequest stopninarequest)
    {
        stopNina(stopninarequest);
    }

    public final void updateServerState(com.dominos.bus.events.SpeechEvents.UpdateServerState updateserverstate)
    {
        updateServerState(updateserverstate);
    }















    private class _cls1
        implements Runnable
    {

        final SpeechManager_ this$0;

        public void run()
        {
            hideNinaButton();
        }

        _cls1()
        {
            this$0 = SpeechManager_.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final SpeechManager_ this$0;

        public void run()
        {
            showNinaButton();
        }

        _cls2()
        {
            this$0 = SpeechManager_.this;
            super();
        }
    }

}
