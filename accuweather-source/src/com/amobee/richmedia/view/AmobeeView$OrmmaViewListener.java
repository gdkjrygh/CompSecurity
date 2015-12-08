// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;


// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeView

public static interface 
{

    public abstract void handleRequest(String s);

    public abstract boolean onEventFired();

    public abstract boolean onExpand();

    public abstract boolean onExpandClose();

    public abstract void onLeavingApplication();

    public abstract boolean onOverlay();

    public abstract boolean onReady();

    public abstract boolean onResize();

    public abstract boolean onResizeClose();
}
