// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            CachedVideoPlayerActivity, MMLog

private static class activityRef extends activityRef
{

    WeakReference activityRef;

    public void onPageFinished(String s)
    {
        MMLog.d("CachedVideoPlayerActivity", (new StringBuilder()).append("@@ ON PAGE FINISHED").append(s).toString());
        CachedVideoPlayerActivity cachedvideoplayeractivity = (CachedVideoPlayerActivity)activityRef.get();
        if (cachedvideoplayeractivity != null)
        {
            CachedVideoPlayerActivity.access$000(cachedvideoplayeractivity, s);
        }
    }

    (CachedVideoPlayerActivity cachedvideoplayeractivity)
    {
        activityRef = new WeakReference(cachedvideoplayeractivity);
    }
}
