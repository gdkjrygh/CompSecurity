// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture.impl;

import android.view.SurfaceHolder;
import com.skype.android.platform.capture.CaptureException;
import com.skype.android.platform.capture.FpsRange;
import com.skype.android.platform.capture.ImageFormat;
import com.skype.android.util.Log;
import com.skype.android.video.hw.format.Resolution;

// Referenced classes of package com.skype.android.video.capture.impl:
//            CaptureSource, FrameConsumer

public class Capturer
{
    public static class CaptureSourceParameters
    {

        public int angle;
        public int cameraId;
        public SurfaceHolder display;
        public ImageFormat fourcc;
        public int fpsMax;
        public int fpsMin;
        public int height;
        public int width;

        public final String toString()
        {
            return (new StringBuilder("CaptureSourceParameters [ cameraId=")).append(cameraId).append(", width=").append(width).append(", height=").append(height).append(", angle=").append(angle).append(", fpsMin=").append(fpsMin).append(", fpsMax=").append(fpsMax).append(", fourcc=").append(fourcc).append(", display=").append(display).append("]").toString();
        }

        public CaptureSourceParameters()
        {
        }
    }

    private static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State STARTED;
        public static final State STOPPED;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/skype/android/video/capture/impl/Capturer$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            STARTED = new State("STARTED", 0);
            STOPPED = new State("STOPPED", 1);
            $VALUES = (new State[] {
                STARTED, STOPPED
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = "Capture";
    private final CaptureSource m_source;
    private final Thread m_sourceThread;
    private State m_state;

    public Capturer(CaptureSourceParameters capturesourceparameters, FrameConsumer frameconsumer)
        throws CaptureException
    {
        m_state = State.STOPPED;
        m_source = new CaptureSource(capturesourceparameters.cameraId, frameconsumer, new Resolution(capturesourceparameters.width, capturesourceparameters.height));
        m_source.setParameters(new Resolution(capturesourceparameters.width, capturesourceparameters.height), new FpsRange(capturesourceparameters.fpsMin, capturesourceparameters.fpsMax), capturesourceparameters.fourcc);
        m_source.setPreviewDisplay(capturesourceparameters.display);
        m_source.setPreviewOrientation(capturesourceparameters.angle);
        m_sourceThread = new Thread(m_source);
    }

    public void start()
        throws InterruptedException, CaptureException
    {
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Staring capturing from camera ")).append(m_source.getCameraId()).toString());
        }
        if (m_state == State.STARTED)
        {
            Log.w("Capture", (new StringBuilder("Capturing from camera ")).append(m_source.getCameraId()).append(" already started").toString());
        } else
        {
            m_sourceThread.start();
            m_source.waitUntil(CaptureSource.CameraState.STARTED);
            m_state = State.STARTED;
            if (Log.isLoggable("Capture", 4))
            {
                Log.i("Capture", (new StringBuilder("Capturing from camera ")).append(m_source.getCameraId()).append(" started").toString());
                return;
            }
        }
    }

    public void stop()
        throws InterruptedException, CaptureException
    {
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Stopping capturing from camera ")).append(m_source.getCameraId()).toString());
        }
        if (m_state == State.STOPPED)
        {
            if (Log.isLoggable("Capture", 5))
            {
                Log.w("Capture", (new StringBuilder("Capturing from camera ")).append(m_source.getCameraId()).append(" already stopped").toString());
            }
        } else
        {
            m_source.close();
            m_source.waitUntil(CaptureSource.CameraState.CLOSED);
            m_state = State.STOPPED;
            if (Log.isLoggable("Capture", 4))
            {
                Log.i("Capture", (new StringBuilder("Capturing from camera ")).append(m_source.getCameraId()).append(" stopped").toString());
                return;
            }
        }
    }
}
