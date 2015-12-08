// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.mock;

import android.util.SparseArray;
import com.microsoft.dl.video.capture.api.Camera;
import com.microsoft.dl.video.capture.api.CameraCapabilities;
import com.microsoft.dl.video.capture.api.CameraManager;
import com.microsoft.dl.video.capture.api.CameraManagerFactory;
import com.microsoft.dl.video.capture.api.CaptureException;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.microsoft.dl.video.capture.impl.mock:
//            MockCameraManager, MockCamera, MockCameraImpl

public class MockCameraManagerImpl
    implements CameraManager, MockCameraManager
{
    public static class Factory
        implements CameraManagerFactory
    {

        public final CameraManager createCameraManager()
        {
            return new MockCameraManagerImpl();
        }

        public Factory()
        {
        }
    }


    private final SparseArray a = new SparseArray();
    private final SparseArray b = new SparseArray();
    private int c;

    public MockCameraManagerImpl()
    {
    }

    public void close()
    {
    }

    public final CameraCapabilities getCameraCapabilities(int i)
        throws CaptureException
    {
        CameraCapabilities cameracapabilities = (CameraCapabilities)a.get(i);
        if (cameracapabilities == null)
        {
            throw new CaptureException((new StringBuilder("No such camera ")).append(i).toString());
        } else
        {
            return cameracapabilities.clone();
        }
    }

    public final int getNumberOfCameras()
    {
        return a.size();
    }

    public final MockCamera getOpenCamera(int i)
    {
        return (MockCamera)b.get(i);
    }

    public final Camera openCamera(int i)
        throws CaptureException
    {
        Object obj = (CameraCapabilities)a.get(i);
        if (obj == null)
        {
            throw new CaptureException((new StringBuilder("No such camera ")).append(i).toString());
        }
        if (b.get(i) != null)
        {
            throw new CaptureException((new StringBuilder("Camera ")).append(i).append(" is already open").toString());
        }
        if (b.size() >= c)
        {
            throw new CaptureException((new StringBuilder("Can not open more than ")).append(c).append(" cameras").toString());
        } else
        {
            obj = new MockCameraImpl(((CameraCapabilities) (obj)));
            b.append(i, obj);
            return ((Camera) (obj));
        }
    }

    public final void setMockCameraConfigs(Collection collection, int i)
    {
        c = i;
        CameraCapabilities cameracapabilities;
        for (collection = collection.iterator(); collection.hasNext(); a.append(cameracapabilities.getCameraId(), cameracapabilities.clone()))
        {
            cameracapabilities = (CameraCapabilities)collection.next();
        }

    }
}
