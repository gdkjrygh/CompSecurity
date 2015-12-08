// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;

import android.util.Log;

// Referenced classes of package com.microsoft.applications.telemetry:
//            ISemanticContext, PiiKind

public class SemanticContext
    implements ISemanticContext
{

    private static final String LOG_TAG = com/microsoft/applications/telemetry/SemanticContext.getSimpleName();
    private final long instancePtr;

    protected SemanticContext(long l)
    {
        if (l == 0L)
        {
            Log.wtf(LOG_TAG, "Cannot instantiate a null SemanticContext");
            throw new IllegalArgumentException("Cannot instantiate a null SemanticContext");
        } else
        {
            instancePtr = l;
            return;
        }
    }

    private native void setAppIdNative(long l, String s);

    private native void setAppVersionNative(long l, String s);

    private native void setDeviceIdNative(long l, String s);

    private native void setDeviceMakeNative(long l, String s);

    private native void setDeviceModelNative(long l, String s);

    private native void setNetworkCostNative(long l, String s);

    private native void setNetworkProviderNative(long l, String s);

    private native void setNetworkTypeNative(long l, String s);

    private native void setOsBuildNative(long l, String s);

    private native void setUserANIDNative(long l, String s);

    private native void setUserAdvertisingIdNative(long l, String s);

    private native void setUserIdNative(long l, String s, int i);

    private native void setUserLanguageNative(long l, String s);

    private native void setUserMsaIdNative(long l, String s);

    private native void setUserTimeZoneNative(long l, String s);

    public void setAppId(String s)
    {
        String.format("setAppId|appId: %s", new Object[] {
            s
        });
        setAppIdNative(instancePtr, s);
    }

    public void setAppVersion(String s)
    {
        String.format("setAppVersion|appVersion: %s", new Object[] {
            s
        });
        setAppVersionNative(instancePtr, s);
    }

    public void setDeviceId(String s)
    {
        String.format("setDeviceId|deviceId: %s", new Object[] {
            s
        });
        setDeviceIdNative(instancePtr, s);
    }

    public void setDeviceMake(String s)
    {
        String.format("setDeviceMake|deviceMake: %s", new Object[] {
            s
        });
        setDeviceMakeNative(instancePtr, s);
    }

    public void setDeviceModel(String s)
    {
        String.format("setDeviceModel|deviceModel: %s", new Object[] {
            s
        });
        setDeviceModelNative(instancePtr, s);
    }

    public void setNetworkProvider(String s)
    {
        String.format("setNetworkProvider|networkProvider: %s", new Object[] {
            s
        });
        setNetworkProviderNative(instancePtr, s);
    }

    protected void setOsBuild(String s)
    {
        String.format("setOsBuild|deviceModel: %s", new Object[] {
            s
        });
        setOsBuildNative(instancePtr, s);
    }

    public void setUserANID(String s)
    {
        String.format("setUserANID|userANID: %s", new Object[] {
            s
        });
        setUserANIDNative(instancePtr, s);
    }

    public void setUserAdvertisingId(String s)
    {
        String.format("setUserAdvertisingId|userAdvertisingId: %s", new Object[] {
            s
        });
        setUserAdvertisingIdNative(instancePtr, s);
    }

    public void setUserId(String s)
    {
        String.format("setUserId|userId: %s", new Object[] {
            s
        });
        setUserId(s, PiiKind.IDENTITY);
    }

    public void setUserId(String s, PiiKind piikind)
    {
        String.format("setUserId|userId: %s|piiKind: %s", new Object[] {
            s, piikind
        });
        setUserIdNative(instancePtr, s, piikind.getValue());
    }

    public void setUserLanguage(String s)
    {
        String.format("setUserLanguage|language: %s", new Object[] {
            s
        });
        setUserLanguageNative(instancePtr, s);
    }

    public void setUserMsaId(String s)
    {
        String.format("setUserMsaId|userMsaId: %s", new Object[] {
            s
        });
        setUserMsaIdNative(instancePtr, s);
    }

    public void setUserTimeZone(String s)
    {
        String.format("setUserTimeZone|timeZone: %s", new Object[] {
            s
        });
        setUserTimeZoneNative(instancePtr, s);
    }

}
