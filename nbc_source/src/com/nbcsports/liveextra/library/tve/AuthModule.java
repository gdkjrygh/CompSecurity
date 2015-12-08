// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.app.Application;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.adobe.adobepass.accessenabler.api.AccessEnablerException;

public class AuthModule
{

    public AuthModule()
    {
    }

    AccessEnabler accessEnabler(Application application)
    {
        try
        {
            application = com.adobe.adobepass.accessenabler.api.AccessEnabler.Factory.getInstance(application);
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            return null;
        }
        return application;
    }
}
