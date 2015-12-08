// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl.constants;


// Referenced classes of package javax.jmdns.impl.constants:
//            DNSState

static class 
{

    static final int $SwitchMap$javax$jmdns$impl$constants$DNSState[];

    static 
    {
        $SwitchMap$javax$jmdns$impl$constants$DNSState = new int[DNSState.values().length];
        try
        {
            $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.PROBING_1.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.PROBING_2.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.PROBING_3.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.ANNOUNCING_1.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.ANNOUNCING_2.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.ANNOUNCED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.CANCELING_1.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.CANCELING_2.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.CANCELING_3.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.CANCELED.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.CLOSING.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.CLOSED.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
