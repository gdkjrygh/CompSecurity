// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push.adm;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.device.messaging.ADM;
import com.amazon.device.messaging.development.ADMManifest;
import com.skype.android.push.PushConfiguration;
import com.skype.android.push.PushRegistration;
import com.skype.android.push.PushRegistrationException;
import com.skype.android.push.PushServiceType;

public class ADMPushRegistration
    implements PushRegistration
{

    private static final String ADM_CLASS = "com.amazon.device.messaging.ADM";
    private ADM adm;
    private Context context;

    public ADMPushRegistration(Context context1)
    {
        context = context1;
    }

    public String getRegistrationToken()
    {
        if (isSupported())
        {
            return adm.getRegistrationId();
        } else
        {
            return null;
        }
    }

    public PushServiceType getServiceType()
    {
        return PushServiceType.AMAZON_ADM;
    }

    public boolean isRegistered()
    {
        return isSupported() && adm != null && !TextUtils.isEmpty(adm.getRegistrationId());
    }

    public boolean isSupported()
    {
        boolean flag;
        try
        {
            Class.forName("com.amazon.device.messaging.ADM");
        }
        catch (Exception exception1)
        {
            return false;
        }
        try
        {
            if (adm == null)
            {
                adm = new ADM(context);
            }
            flag = adm.isSupported();
        }
        catch (Exception exception)
        {
            return false;
        }
        return flag;
    }

    public void register(PushConfiguration pushconfiguration)
        throws PushRegistrationException
    {
        if (isSupported())
        {
            ADMManifest.checkManifestAuthoredProperly(context);
            if (adm.getRegistrationId() == null)
            {
                adm.startRegister();
            }
        }
    }

    public void unregister()
    {
        if (isRegistered())
        {
            adm.startUnregister();
        }
    }
}
