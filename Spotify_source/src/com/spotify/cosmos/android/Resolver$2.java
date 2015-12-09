// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;


// Referenced classes of package com.spotify.cosmos.android:
//            Resolver

class ate
{

    static final int $SwitchMap$com$spotify$cosmos$android$Resolver$State[];

    static 
    {
        $SwitchMap$com$spotify$cosmos$android$Resolver$State = new int[ate.values().length];
        try
        {
            $SwitchMap$com$spotify$cosmos$android$Resolver$State[ate.DISCONNECTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$spotify$cosmos$android$Resolver$State[ate.CONNECTED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$spotify$cosmos$android$Resolver$State[ate.CONNECTING.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
