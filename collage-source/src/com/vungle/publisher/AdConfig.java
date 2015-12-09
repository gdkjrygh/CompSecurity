// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import java.util.Map;

// Referenced classes of package com.vungle.publisher:
//            a, b, Orientation

public class AdConfig
    implements a
{

    final b a = new b();

    public AdConfig()
    {
    }

    private String a(int i)
    {
        String s = (new StringBuilder("extra")).append(i).toString();
        return a.a(s);
    }

    private void a(int i, String s)
    {
        String s1 = (new StringBuilder("extra")).append(i).toString();
        a.a(s1, s);
    }

    public boolean equals(Object obj)
    {
        return a.equals(obj);
    }

    public String getExtra1()
    {
        return a(1);
    }

    public String getExtra2()
    {
        return a(2);
    }

    public String getExtra3()
    {
        return a(3);
    }

    public String getExtra4()
    {
        return a(4);
    }

    public String getExtra5()
    {
        return a(5);
    }

    public String getExtra6()
    {
        return a(6);
    }

    public String getExtra7()
    {
        return a(7);
    }

    public String getExtra8()
    {
        return a(8);
    }

    public Map getExtras()
    {
        return a.getExtras();
    }

    public String getIncentivizedCancelDialogBodyText()
    {
        return a.getIncentivizedCancelDialogBodyText();
    }

    public String getIncentivizedCancelDialogCloseButtonText()
    {
        return a.getIncentivizedCancelDialogCloseButtonText();
    }

    public String getIncentivizedCancelDialogKeepWatchingButtonText()
    {
        return a.getIncentivizedCancelDialogKeepWatchingButtonText();
    }

    public String getIncentivizedCancelDialogTitle()
    {
        return a.getIncentivizedCancelDialogTitle();
    }

    public String getIncentivizedUserId()
    {
        return a.getIncentivizedUserId();
    }

    public Orientation getOrientation()
    {
        return a.getOrientation();
    }

    public String getPlacement()
    {
        return a.getPlacement();
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public boolean isBackButtonImmediatelyEnabled()
    {
        return a.isBackButtonImmediatelyEnabled();
    }

    public boolean isImmersiveMode()
    {
        return a.isImmersiveMode();
    }

    public boolean isIncentivized()
    {
        return a.isIncentivized();
    }

    public boolean isSoundEnabled()
    {
        return a.isSoundEnabled();
    }

    public void setBackButtonImmediatelyEnabled(boolean flag)
    {
        a.a(flag);
    }

    public void setExtra1(String s)
    {
        a(1, s);
    }

    public void setExtra2(String s)
    {
        a(2, s);
    }

    public void setExtra3(String s)
    {
        a(3, s);
    }

    public void setExtra4(String s)
    {
        a(4, s);
    }

    public void setExtra5(String s)
    {
        a(5, s);
    }

    public void setExtra6(String s)
    {
        a(6, s);
    }

    public void setExtra7(String s)
    {
        a(7, s);
    }

    public void setExtra8(String s)
    {
        a(8, s);
    }

    public void setImmersiveMode(boolean flag)
    {
        a.b(flag);
    }

    public void setIncentivized(boolean flag)
    {
        a.c(flag);
    }

    public void setIncentivizedCancelDialogBodyText(String s)
    {
        a.b(s);
    }

    public void setIncentivizedCancelDialogCloseButtonText(String s)
    {
        a.c(s);
    }

    public void setIncentivizedCancelDialogKeepWatchingButtonText(String s)
    {
        a.d(s);
    }

    public void setIncentivizedCancelDialogTitle(String s)
    {
        a.e(s);
    }

    public void setIncentivizedUserId(String s)
    {
        a.f(s);
    }

    public void setOrientation(Orientation orientation)
    {
        a.a(orientation);
    }

    public void setPlacement(String s)
    {
        a.g(s);
    }

    public void setSoundEnabled(boolean flag)
    {
        a.d(flag);
    }

    public String toString()
    {
        return a.toString();
    }
}
