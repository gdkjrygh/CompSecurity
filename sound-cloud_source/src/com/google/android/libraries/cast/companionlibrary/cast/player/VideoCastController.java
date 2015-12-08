// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;

import android.graphics.Bitmap;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.player:
//            OnVideoCastControllerListener

public interface VideoCastController
{

    public static final int CC_DISABLED = 2;
    public static final int CC_ENABLED = 1;
    public static final int CC_HIDDEN = 3;
    public static final int NEXT_PREV_VISIBILITY_POLICY_ALWAYS = 3;
    public static final int NEXT_PREV_VISIBILITY_POLICY_DISABLED = 2;
    public static final int NEXT_PREV_VISIBILITY_POLICY_HIDDEN = 1;

    public abstract void adjustControllersForLiveStream(boolean flag);

    public abstract void closeActivity();

    public abstract void onQueueItemsUpdated(int i, int j);

    public abstract void setClosedCaptionState(int i);

    public abstract void setImage(Bitmap bitmap);

    public abstract void setNextPreviousVisibilityPolicy(int i);

    public abstract void setOnVideoCastControllerChangedListener(OnVideoCastControllerListener onvideocastcontrollerlistener);

    public abstract void setPlaybackStatus(int i);

    public abstract void setStreamType(int i);

    public abstract void setSubTitle(String s);

    public abstract void setTitle(String s);

    public abstract void showLoading(boolean flag);

    public abstract void updateControllersStatus(boolean flag);

    public abstract void updateSeekbar(int i, int j);
}
