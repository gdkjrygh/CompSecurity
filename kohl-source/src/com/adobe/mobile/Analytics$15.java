// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;


// Referenced classes of package com.adobe.mobile:
//            Analytics

static class CON_PROXIMITY
{

    static final int $SwitchMap$com$adobe$mobile$Analytics$BEACON_PROXIMITY[];

    static 
    {
        $SwitchMap$com$adobe$mobile$Analytics$BEACON_PROXIMITY = new int[CON_PROXIMITY.values().length];
        try
        {
            $SwitchMap$com$adobe$mobile$Analytics$BEACON_PROXIMITY[CON_PROXIMITY.PROXIMITY_IMMEDIATE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$adobe$mobile$Analytics$BEACON_PROXIMITY[CON_PROXIMITY.PROXIMITY_NEAR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$adobe$mobile$Analytics$BEACON_PROXIMITY[CON_PROXIMITY.PROXIMITY_FAR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$adobe$mobile$Analytics$BEACON_PROXIMITY[CON_PROXIMITY.PROXIMITY_UNKNOWN.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
