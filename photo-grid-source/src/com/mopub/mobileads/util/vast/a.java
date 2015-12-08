// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.util.vast;


// Referenced classes of package com.mopub.mobileads.util.vast:
//            VastManager, VastVideoConfiguration

final class a
    implements com.mopub.mobileads.VastVideoDownloadTask.VastVideoDownloadTaskListener
{

    final VastVideoConfiguration a;
    final VastManager b;

    a(VastManager vastmanager, VastVideoConfiguration vastvideoconfiguration)
    {
        b = vastmanager;
        a = vastvideoconfiguration;
        super();
    }

    public final void onComplete(boolean flag)
    {
        if (flag && VastManager.a(a))
        {
            VastManager.a(b).onVastVideoConfigurationPrepared(a);
            return;
        } else
        {
            VastManager.a(b).onVastVideoConfigurationPrepared(null);
            return;
        }
    }
}
