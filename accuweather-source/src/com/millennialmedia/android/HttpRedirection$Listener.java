// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.net.Uri;

// Referenced classes of package com.millennialmedia.android:
//            HttpRedirection, OverlaySettings

private static interface 
{

    public abstract boolean canOpenOverlay();

    public abstract OverlaySettings getOverlaySettings();

    public abstract boolean isActivityStartable(Uri uri);

    public abstract boolean isExpandingToUrl();

    public abstract boolean isHandlingMMVideo(Uri uri);

    public abstract void startingActivity(Uri uri);

    public abstract void startingVideo();

    public abstract void updateLastVideoViewedTime();
}
