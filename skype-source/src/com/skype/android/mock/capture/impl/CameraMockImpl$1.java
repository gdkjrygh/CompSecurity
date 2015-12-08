// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mock.capture.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.skype.android.platform.capture.CameraCallback;

// Referenced classes of package com.skype.android.mock.capture.impl:
//            CameraMockImpl

final class a extends Handler
{

    final CameraMockImpl a;

    public final void handleMessage(Message message)
    {
        CameraMockImpl.a(a).onFrame((byte[])message.obj, a);
    }

    (CameraMockImpl cameramockimpl, Looper looper)
    {
        a = cameramockimpl;
        super(looper);
    }
}
