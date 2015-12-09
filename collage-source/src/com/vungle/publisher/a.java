// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import java.util.Map;

// Referenced classes of package com.vungle.publisher:
//            Orientation

public interface a
{

    public abstract Map getExtras();

    public abstract String getIncentivizedCancelDialogBodyText();

    public abstract String getIncentivizedCancelDialogCloseButtonText();

    public abstract String getIncentivizedCancelDialogKeepWatchingButtonText();

    public abstract String getIncentivizedCancelDialogTitle();

    public abstract String getIncentivizedUserId();

    public abstract Orientation getOrientation();

    public abstract String getPlacement();

    public abstract boolean isBackButtonImmediatelyEnabled();

    public abstract boolean isImmersiveMode();

    public abstract boolean isIncentivized();

    public abstract boolean isSoundEnabled();
}
