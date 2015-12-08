// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.app;


// Referenced classes of package com.netflix.mediaclient.android.app:
//            UserInputManager

public interface ApplicationStateListener
{

    public abstract void onBackground(UserInputManager userinputmanager);

    public abstract void onForeground(UserInputManager userinputmanager);

    public abstract void onUiGone(UserInputManager userinputmanager);

    public abstract void onUiStarted(UserInputManager userinputmanager);
}
