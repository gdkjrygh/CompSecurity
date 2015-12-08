// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.view.View;
import com.addlive.service.listener.UserStateChangedEvent;
import com.addlive.service.listener.VideoFrameSizeChangedEvent;

public static interface id.view.View
{

    public abstract Handler a();

    public abstract void a(Vi vi);

    public abstract void a(UserStateChangedEvent userstatechangedevent);

    public abstract void a(VideoFrameSizeChangedEvent videoframesizechangedevent);

    public abstract String b();

    public abstract String c();

    public abstract View d();

    public abstract void e();
}
