// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;


// Referenced classes of package com.worklight.wlclient:
//            WLRequest, RequestMethod

static class d
{

    static final int $SwitchMap$com$worklight$wlclient$RequestMethod[];

    static 
    {
        $SwitchMap$com$worklight$wlclient$RequestMethod = new int[RequestMethod.values().length];
        try
        {
            $SwitchMap$com$worklight$wlclient$RequestMethod[RequestMethod.POST.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$worklight$wlclient$RequestMethod[RequestMethod.GET.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$worklight$wlclient$RequestMethod[RequestMethod.DELETE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$worklight$wlclient$RequestMethod[RequestMethod.PUT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
