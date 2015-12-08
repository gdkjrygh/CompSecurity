// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DView

public interface Pulse3DViewListener
{

    public abstract void onEndTransition(Pulse3DView pulse3dview, boolean flag);

    public abstract void onFailLoadingSceneAtURL(Pulse3DView pulse3dview, String s, Error error);

    public abstract void onFinishLoadingSceneAtURL(Pulse3DView pulse3dview, String s);

    public abstract void onLeavingApplication(Pulse3DView pulse3dview);

    public abstract void onStartTransition(Pulse3DView pulse3dview, boolean flag);

    public abstract boolean webLinkOutRequested(String s, boolean flag);
}
