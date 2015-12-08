// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui;


// Referenced classes of package com.netflix.mediaclient.javabridge.ui:
//            EventListener

public interface Storage
{

    public static final String EVENT_overbudget = "overbudget";
    public static final String NAME = "storage";
    public static final String NO_DEVICE_ACCOUNT = "NDAKADN";
    public static final String PATH = "nrdp.storage";

    public abstract void addEventListener(String s, EventListener eventlistener);

    public abstract void clear(String s);

    public abstract void clearAll();

    public abstract String getItem(String s, String s1);

    public abstract String key(String s, int i);

    public abstract int length(String s);

    public abstract void removeEventListener(String s, EventListener eventlistener);

    public abstract void removeItem(String s, String s1);

    public abstract void setItem(String s, String s1, String s2);

    public abstract int size();
}
