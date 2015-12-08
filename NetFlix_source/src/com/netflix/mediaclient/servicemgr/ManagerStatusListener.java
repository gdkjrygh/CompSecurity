// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            ServiceManager

public interface ManagerStatusListener
{

    public abstract void onManagerReady(ServiceManager servicemanager, int i);

    public abstract void onManagerUnavailable(ServiceManager servicemanager, int i);
}
