// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push.nna;

import android.content.Context;
import android.text.TextUtils;
import com.nokia.push.c;
import com.skype.android.push.PushConfiguration;
import com.skype.android.push.PushRegistration;
import com.skype.android.push.PushRegistrationException;
import com.skype.android.push.PushServiceType;

public class NokiaPushRegistration
    implements PushRegistration
{

    private Context context;

    public NokiaPushRegistration(Context context1)
    {
        context = context1;
    }

    public String getRegistrationToken()
    {
        return c.f(context);
    }

    public PushServiceType getServiceType()
    {
        return PushServiceType.NOKIA_NNA;
    }

    public boolean isRegistered()
    {
        return !TextUtils.isEmpty(c.f(context));
    }

    public boolean isSupported()
    {
        try
        {
            c.a(context);
            c.b(context);
        }
        catch (Exception exception)
        {
            return false;
        }
        return true;
    }

    public void register(PushConfiguration pushconfiguration)
    {
        try
        {
            c.a(context, new String[] {
                pushconfiguration.getSenderToken(getServiceType())
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PushConfiguration pushconfiguration)
        {
            throw new PushRegistrationException(pushconfiguration);
        }
    }

    public void unregister()
    {
        if (isRegistered())
        {
            c.c(context);
        }
    }
}
