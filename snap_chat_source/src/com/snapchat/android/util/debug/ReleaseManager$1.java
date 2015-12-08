// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;


// Referenced classes of package com.snapchat.android.util.debug:
//            ReleaseManager

static final class leaseMode
{

    static final int $SwitchMap$com$snapchat$android$util$debug$ReleaseManager$ReleaseMode[];

    static 
    {
        $SwitchMap$com$snapchat$android$util$debug$ReleaseManager$ReleaseMode = new int[leaseMode.values().length];
        try
        {
            $SwitchMap$com$snapchat$android$util$debug$ReleaseManager$ReleaseMode[leaseMode.DEBUG.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$snapchat$android$util$debug$ReleaseManager$ReleaseMode[leaseMode.PERF.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$snapchat$android$util$debug$ReleaseManager$ReleaseMode[leaseMode.ALPHA.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$snapchat$android$util$debug$ReleaseManager$ReleaseMode[leaseMode.BETA.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
