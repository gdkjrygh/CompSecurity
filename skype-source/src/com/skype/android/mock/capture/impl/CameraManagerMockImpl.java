// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mock.capture.impl;

import com.skype.android.mock.capture.CameraManagerMock;
import com.skype.android.platform.capture.Camera;
import com.skype.android.platform.capture.CameraCapabilities;
import com.skype.android.platform.capture.CameraInfo;
import com.skype.android.platform.capture.CameraManager;
import com.skype.android.platform.capture.CameraParameters;
import com.skype.android.platform.capture.CaptureException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.skype.android.mock.capture.impl:
//            CameraMockImpl

public class CameraManagerMockImpl
    implements CameraManagerMock, CameraManager
{
    public static interface CloseCallback
    {

        public abstract void a(int i);
    }

    private static final class a
    {

        private final CameraInfo a;
        private final CameraCapabilities b;
        private final CameraParameters c;

        public final CameraCapabilities a()
        {
            return b;
        }

        public final CameraParameters b()
        {
            return c;
        }

        public final CameraInfo c()
        {
            return a;
        }

        public final String toString()
        {
            return (new StringBuilder()).append(getClass().getSimpleName()).append(" [info=").append(a).append(", capabilities=").append(b).append(", initialParameters=").append(c).append("]").toString();
        }
    }


    private final Set a = new HashSet();
    private final List b = new ArrayList();
    private final CloseCallback c = new CloseCallback() {

        final CameraManagerMockImpl a;

        public final void a(int i)
        {
            CameraManagerMockImpl.a(a).add(Integer.valueOf(i));
        }

            
            {
                a = CameraManagerMockImpl.this;
                super();
            }
    };

    public CameraManagerMockImpl()
    {
    }

    static Set a(CameraManagerMockImpl cameramanagermockimpl)
    {
        return cameramanagermockimpl.a;
    }

    public final int a()
    {
        return b.size();
    }

    public final Camera a(int i)
        throws CaptureException
    {
        if (!a.remove(Integer.valueOf(i)))
        {
            throw new CaptureException((new StringBuilder("Camera ")).append(i).append(" is not available").toString());
        } else
        {
            a a1 = (a)b.get(i);
            return new CameraMockImpl(i, a1.a(), a1.b(), c);
        }
    }

    public final CameraInfo b(int i)
        throws CaptureException
    {
        a a1 = (a)b.get(i);
        if (a1 == null)
        {
            throw new CaptureException((new StringBuilder("Camera ")).append(i).append(" is not available").toString());
        } else
        {
            return a1.c().c();
        }
    }

    public void close()
    {
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [availableCameras=").append(a).append(", cameraSettings=").append(b).append("]").toString();
    }
}
