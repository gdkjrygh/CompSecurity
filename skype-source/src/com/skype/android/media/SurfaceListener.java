// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;


// Referenced classes of package com.skype.android.media:
//            SurfaceWrapper

public interface SurfaceListener
{

    public abstract void onSurfaceAvailable(SurfaceWrapper surfacewrapper);

    public abstract boolean onSurfaceDestroyed(SurfaceWrapper surfacewrapper);

    public abstract void onSurfaceSizeChanged(SurfaceWrapper surfacewrapper, int i, int j);

    public abstract void onSurfaceUpdated(SurfaceWrapper surfacewrapper);
}
