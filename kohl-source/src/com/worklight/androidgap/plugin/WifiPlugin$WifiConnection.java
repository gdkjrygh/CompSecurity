// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;


// Referenced classes of package com.worklight.androidgap.plugin:
//            WifiPlugin

private class MAC
{

    private String MAC;
    private String SSID;
    final WifiPlugin this$0;

    public String getMAC()
    {
        return MAC;
    }

    public String getSSID()
    {
        return SSID;
    }

    public (String s, String s1)
    {
        this$0 = WifiPlugin.this;
        super();
        SSID = null;
        MAC = null;
        SSID = s;
        MAC = s1;
    }
}
