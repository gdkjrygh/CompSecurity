// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;

import com.adobe.mediacore.metadata.AdBreakAsWatched;
import java.util.List;

// Referenced classes of package com.adobe.mediacore.timeline.advertising:
//            AdPolicyInfo, AdBreakPolicy, AdPolicy

public interface AdPolicySelector
{

    public abstract List selectAdBreaksToPlay(AdPolicyInfo adpolicyinfo);

    public abstract AdBreakPolicy selectPolicyForAdBreak(AdPolicyInfo adpolicyinfo);

    public abstract AdPolicy selectPolicyForSeekIntoAd(AdPolicyInfo adpolicyinfo);

    public abstract AdBreakAsWatched selectWatchedPolicyForAdBreak(AdPolicyInfo adpolicyinfo);
}
