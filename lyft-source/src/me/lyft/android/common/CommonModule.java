// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import me.lyft.android.application.ILogoutService;
import me.lyft.android.errorhandling.DefaultErrorHandler;
import me.lyft.android.errorhandling.IDefaultErrorHandler;

// Referenced classes of package me.lyft.android.common:
//            ActivityController, AppFlow, DialogFlow

public class CommonModule
{

    public CommonModule()
    {
    }

    public ActivityController provideActivityController()
    {
        return new ActivityController();
    }

    public AppFlow provideAppFlow()
    {
        return new AppFlow();
    }

    public IDefaultErrorHandler provideDefaultErrorHandler(AppFlow appflow, DialogFlow dialogflow, ILogoutService ilogoutservice)
    {
        return new DefaultErrorHandler(appflow, dialogflow, ilogoutservice);
    }

    public DialogFlow provideDialogFlow()
    {
        return new DialogFlow();
    }
}
