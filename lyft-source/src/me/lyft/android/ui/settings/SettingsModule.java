// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.res.Resources;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.driver.expresspay.ExpressPayErrorHandler;
import me.lyft.android.ui.driver.expresspay.IExpressPayErrorHandler;

public class SettingsModule
{

    public SettingsModule()
    {
    }

    public IExpressPayErrorHandler provideExpressPayErrorHandler(IViewErrorHandler iviewerrorhandler, Resources resources, DialogFlow dialogflow, IConstantsProvider iconstantsprovider)
    {
        return new ExpressPayErrorHandler(iviewerrorhandler, resources, dialogflow, iconstantsprovider);
    }
}
