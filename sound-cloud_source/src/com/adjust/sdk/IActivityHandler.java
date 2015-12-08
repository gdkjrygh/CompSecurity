// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.net.Uri;
import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//            ActivityPackage, AdjustConfig, AdjustEvent, AdjustAttribution

public interface IActivityHandler
{

    public abstract void finishedTrackingActivity(JSONObject jsonobject);

    public abstract ActivityPackage getAttributionPackage();

    public abstract void init(AdjustConfig adjustconfig);

    public abstract boolean isEnabled();

    public abstract void readOpenUrl(Uri uri, long l);

    public abstract void sendReferrer(String s, long l);

    public abstract void setAskingAttribution(boolean flag);

    public abstract void setEnabled(boolean flag);

    public abstract void setOfflineMode(boolean flag);

    public abstract void trackEvent(AdjustEvent adjustevent);

    public abstract void trackSubsessionEnd();

    public abstract void trackSubsessionStart();

    public abstract boolean tryUpdateAttribution(AdjustAttribution adjustattribution);
}
