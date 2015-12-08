// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mock.capture.impl;

import java.util.Set;

// Referenced classes of package com.skype.android.mock.capture.impl:
//            CameraManagerMockImpl

final class a
    implements oseCallback
{

    final CameraManagerMockImpl a;

    public final void a(int i)
    {
        CameraManagerMockImpl.a(a).add(Integer.valueOf(i));
    }

    oseCallback(CameraManagerMockImpl cameramanagermockimpl)
    {
        a = cameramanagermockimpl;
        super();
    }
}
