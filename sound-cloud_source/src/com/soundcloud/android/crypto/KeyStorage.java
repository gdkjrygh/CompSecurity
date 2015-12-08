// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crypto;

import android.content.SharedPreferences;
import android.util.Base64;

// Referenced classes of package com.soundcloud.android.crypto:
//            DeviceSecret

class KeyStorage
{

    private final String ENCODED_EMPTY_VALUE;
    private final SharedPreferences preferences;

    public KeyStorage(SharedPreferences sharedpreferences)
    {
        ENCODED_EMPTY_VALUE = encodeForPrefs(DeviceSecret.EMPTY.getKey());
        preferences = sharedpreferences;
    }

    private byte[] decodeFromPrefs(String s)
    {
        return Base64.decode(s, 0);
    }

    private byte[] decodeKeyFromPrefs(String s)
    {
        return decodeFromPrefs(preferences.getString(s, ENCODED_EMPTY_VALUE));
    }

    private String encodeForPrefs(byte abyte0[])
    {
        return Base64.encodeToString(abyte0, 0);
    }

    private String getIvKeyName(String s)
    {
        return (new StringBuilder()).append(s).append(".iv").toString();
    }

    public boolean contains(String s)
    {
        return preferences.contains(s);
    }

    public void delete(String s)
    {
        preferences.edit().remove(s).apply();
    }

    public DeviceSecret get(String s)
    {
        if (preferences.contains(s))
        {
            return new DeviceSecret(s, decodeKeyFromPrefs(s), decodeKeyFromPrefs(getIvKeyName(s)));
        } else
        {
            return DeviceSecret.EMPTY;
        }
    }

    public void put(DeviceSecret devicesecret)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        String s = encodeForPrefs(devicesecret.getKey());
        editor.putString(devicesecret.getName(), s);
        if (devicesecret.hasInitVector())
        {
            String s1 = encodeForPrefs(devicesecret.getInitVector());
            editor.putString(getIvKeyName(devicesecret.getName()), s1);
        }
        editor.apply();
    }
}
