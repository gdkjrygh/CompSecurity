// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push.gcm;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.e;
import com.google.android.gms.gcm.a;
import com.skype.android.push.PushConfiguration;
import com.skype.android.push.PushManager;
import com.skype.android.push.PushRegistration;
import com.skype.android.push.PushRegistrationException;
import com.skype.android.push.PushServiceType;
import java.io.IOException;

public class GCMRegistration
    implements PushRegistration
{

    private static final String KEY_REGISTRATION_ID = "registrationId";
    private static final String PREFS_NAME = "skype_gcm";
    private Context context;
    private SharedPreferences preferences;

    public GCMRegistration(Context context1)
    {
        context = context1;
        preferences = context1.getSharedPreferences("skype_gcm", 0);
    }

    private void setRegistrationToken(String s)
    {
        preferences.edit().putString("registrationId", s).commit();
    }

    public String getRegistrationToken()
    {
        return preferences.getString("registrationId", null);
    }

    public PushServiceType getServiceType()
    {
        return PushServiceType.GOOGLE_GCM;
    }

    public boolean isRegistered()
    {
        return !TextUtils.isEmpty(getRegistrationToken());
    }

    public boolean isSupported()
    {
        return e.a(context) == 0;
    }

    public void register(PushConfiguration pushconfiguration)
        throws PushRegistrationException
    {
        try
        {
            pushconfiguration = a.a(context).a(new String[] {
                pushconfiguration.getSenderToken(getServiceType())
            });
            setRegistrationToken(pushconfiguration);
            if (!TextUtils.isEmpty(pushconfiguration))
            {
                PushManager.getInstance(context).onRegistered(getServiceType());
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (PushConfiguration pushconfiguration)
        {
            throw new PushRegistrationException(pushconfiguration);
        }
        throw new PushRegistrationException("empty token");
    }

    public void unregister()
    {
        a a1 = a.a(context);
        try
        {
            a1.a();
            setRegistrationToken(null);
            return;
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
    }
}
