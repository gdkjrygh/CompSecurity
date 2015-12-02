// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import com.facebook.webrtc.a;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            ad

class u
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[ad.values().length];
        try
        {
            b[ad.CONNECTING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror21) { }
        try
        {
            b[ad.IN_CALL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror20) { }
        try
        {
            b[ad.NONE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror19) { }
        a = new int[com.facebook.webrtc.a.values().length];
        try
        {
            a[a.CallEndIgnoreCall.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            a[a.CallEndHangupCall.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            a[a.CallEndAcceptAfterHangUp.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            a[a.CallEndClientInterrupted.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            a[a.CallEndNoAnswerTimeout.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            a[a.CallEndIncomingTimeout.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            a[a.CallEndNoPermission.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            a[a.CallEndOtherNotCapable.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            a[a.CallEndOtherCarrierBlocked.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            a[a.CallEndSignalingMessageFailed.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            a[a.CallEndWebRTCError.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            a[a.CallEndClientError.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[a.CallEndNoUIError.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[a.CallEndUnsupportedVersion.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[a.CallEndCallerNotVisible.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[a.CallEndConnectionDropped.ordinal()] = 16;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[a.CallEndInAnotherCall.ordinal()] = 17;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[a.CallEndCarrierBlocked.ordinal()] = 18;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[a.CallEndOtherInstanceHandled.ordinal()] = 19;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
