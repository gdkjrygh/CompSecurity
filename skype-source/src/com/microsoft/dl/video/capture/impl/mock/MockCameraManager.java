// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.mock;

import java.util.Collection;

// Referenced classes of package com.microsoft.dl.video.capture.impl.mock:
//            MockCamera

public interface MockCameraManager
{

    public abstract MockCamera getOpenCamera(int i);

    public abstract void setMockCameraConfigs(Collection collection, int i);
}
