// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.platform;


// Referenced classes of package com.addlive.platform:
//            InitProgressChangedEvent, InitStateChangedEvent

public interface PlatformInitListener
{

    public abstract void onInitProgressChanged(InitProgressChangedEvent initprogresschangedevent);

    public abstract void onInitStateChanged(InitStateChangedEvent initstatechangedevent);
}
