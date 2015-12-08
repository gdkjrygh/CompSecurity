// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.app.Activity;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            InAppNotification

public interface ak
{

    public abstract void a(Activity activity);

    public abstract void a(String s);

    public abstract void a(String s, InAppNotification inappnotification);

    public abstract void a(String s, Object obj);

    public abstract void a(JSONObject jsonobject);

    public abstract void b(Activity activity);

    public abstract void b(String s);

    public abstract ak c(String s);
}
