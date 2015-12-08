// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            RequestListener, MMRequest

public interface MMAd
{

    public abstract String getApid();

    public abstract boolean getIgnoresDensityScaling();

    public abstract RequestListener getListener();

    public abstract MMRequest getMMRequest();

    public abstract void setApid(String s);

    public abstract void setIgnoresDensityScaling(boolean flag);

    public abstract void setListener(RequestListener requestlistener);

    public abstract void setMMRequest(MMRequest mmrequest);
}
