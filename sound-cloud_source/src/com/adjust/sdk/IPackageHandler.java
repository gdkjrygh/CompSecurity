// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.content.Context;
import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//            ActivityPackage, IActivityHandler

public interface IPackageHandler
{

    public abstract void addPackage(ActivityPackage activitypackage);

    public abstract void closeFirstPackage();

    public abstract void finishedTrackingActivity(JSONObject jsonobject);

    public abstract void init(IActivityHandler iactivityhandler, Context context, boolean flag);

    public abstract void pauseSending();

    public abstract void resumeSending();

    public abstract void sendFirstPackage();

    public abstract void sendNextPackage();
}
