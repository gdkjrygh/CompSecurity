// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;

import me.lyft.android.analytics.definitions.UiElement;
import me.lyft.android.analytics.definitions.UxEvent;

// Referenced classes of package me.lyft.android.analytics:
//            Analytics

public class UxAnalytics
{

    private final UxEvent uxEvent;

    private UxAnalytics(me.lyft.android.analytics.definitions.UxEvent.Type type, UiElement uielement)
    {
        uxEvent = new UxEvent(type, uielement);
    }

    public static UxAnalytics dismiss(UiElement uielement)
    {
        return new UxAnalytics(me.lyft.android.analytics.definitions.UxEvent.Type.DISMISS, uielement);
    }

    public static UxAnalytics display(UiElement uielement)
    {
        return new UxAnalytics(me.lyft.android.analytics.definitions.UxEvent.Type.DISPLAY, uielement);
    }

    public static UxAnalytics tap(UiElement uielement)
    {
        return new UxAnalytics(me.lyft.android.analytics.definitions.UxEvent.Type.TAP, uielement);
    }

    public UxAnalytics setParameter(String s)
    {
        uxEvent.setParameter(s);
        return this;
    }

    public UxAnalytics setParent(String s)
    {
        uxEvent.setParent(s);
        return this;
    }

    public UxAnalytics setSampleRate(float f)
    {
        uxEvent.setSampleRate(f);
        return this;
    }

    public UxAnalytics setScreenX(int i)
    {
        uxEvent.setScreenX(i);
        return this;
    }

    public UxAnalytics setScreenY(int i)
    {
        uxEvent.setScreenX(i);
        return this;
    }

    public UxAnalytics setTag(String s)
    {
        uxEvent.setTag(s);
        return this;
    }

    public UxAnalytics setValue(long l)
    {
        uxEvent.setValue(l);
        return this;
    }

    public void track()
    {
        Analytics.track(uxEvent);
    }
}
