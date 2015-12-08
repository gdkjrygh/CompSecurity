// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import com.mixpanel.android.mpmetrics.InAppNotification;
import org.json.JSONObject;

public interface cxm
{

    public abstract String a();

    public abstract void a(Activity activity);

    public abstract void a(String s);

    public abstract void a(String s, InAppNotification inappnotification);

    public abstract void a(String s, Object obj);

    public abstract void a(String s, JSONObject jsonobject);

    public abstract void a(JSONObject jsonobject);

    public abstract void b();

    public abstract void b(Activity activity);

    public abstract void b(String s);

    public abstract void b(String s, Object obj);

    public abstract cxm c(String s);
}
