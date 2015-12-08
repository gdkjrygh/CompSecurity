// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            ChatServiceMonitor

static final class 
{

    static final int $SwitchMap$com$skype$SkyLib$CONNECTION_STATUS[];

    static 
    {
        $SwitchMap$com$skype$SkyLib$CONNECTION_STATUS = new int[com.skype.TUS.values().length];
        try
        {
            $SwitchMap$com$skype$SkyLib$CONNECTION_STATUS[com.skype.TUS.MSNP_NO_NETWORK.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$CONNECTION_STATUS[com.skype.TUS.MSNP_DISCONNECTED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$CONNECTION_STATUS[com.skype.TUS.MSNP_CONNECTING.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$CONNECTION_STATUS[com.skype.TUS.MSNP_CONNECTED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
