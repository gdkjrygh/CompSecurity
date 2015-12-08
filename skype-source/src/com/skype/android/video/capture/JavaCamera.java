// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;

import android.view.SurfaceHolder;
import com.skype.android.platform.capture.CameraCapabilities;
import com.skype.android.platform.capture.CameraInfo;
import com.skype.android.platform.capture.CameraManager;
import com.skype.android.platform.capture.CameraManagerSingleton;
import com.skype.android.platform.capture.CaptureException;
import com.skype.android.platform.capture.FpsRange;
import com.skype.android.platform.capture.ImageFormat;
import com.skype.android.util.Log;
import com.skype.android.video.capture.impl.Capturer;
import com.skype.android.video.capture.impl.FrameConsumer;
import com.skype.android.video.hw.format.Resolution;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;

// Referenced classes of package com.skype.android.video.capture:
//            CameraParamsHolder

public class JavaCamera
    implements Closeable
{
    private class FPSController
    {

        private int m_acceptableBoundryMS;
        private int m_cameraFrames;
        private int m_fps;
        private int m_frameCountSinceReset;
        private long m_lastFrameTimeMS;
        private int m_periodMS;
        private int m_producedFrames;
        private long m_startTimeMS;
        final JavaCamera this$0;

        private void getReport(boolean flag)
        {
            long l = System.currentTimeMillis() - m_startTimeMS;
            m_cameraFrames = m_cameraFrames + 1;
            if (flag)
            {
                m_producedFrames = m_producedFrames + 1;
            }
            if (l >= 3000L)
            {
                m_startTimeMS = System.currentTimeMillis();
                if (Log.isLoggable("JavaCapturer_Java", 3))
                {
                    Log.d("JavaCapturer_Java", String.format("PreviewCallbackProfiler: requested fps=%d produced fps=%.1f camera fps=%.1f", new Object[] {
                        Integer.valueOf(m_fps), Double.valueOf(((double)m_producedFrames * 1000D) / (double)l), Double.valueOf(((double)m_cameraFrames * 1000D) / (double)l)
                    }));
                }
                resetReport();
            }
        }

        private void resetReport()
        {
            m_startTimeMS = System.currentTimeMillis();
            m_producedFrames = 0;
            m_cameraFrames = 0;
        }

        public boolean checkAccept()
        {
            long l = System.currentTimeMillis();
            boolean flag;
            if (l - m_lastFrameTimeMS >= (long)(m_periodMS - m_acceptableBoundryMS))
            {
                m_lastFrameTimeMS = m_lastFrameTimeMS + (long)m_periodMS;
                int i = m_frameCountSinceReset + 1;
                m_frameCountSinceReset = i;
                if (i > m_fps * 5)
                {
                    m_frameCountSinceReset = 0;
                    m_lastFrameTimeMS = l;
                }
                flag = true;
            } else
            {
                flag = false;
            }
            getReport(flag);
            return flag;
        }

        public void setFPS(int i)
        {
            m_fps = i;
            if (m_fps != 0)
            {
                i = 1000 / m_fps;
            } else
            {
                i = 0x7fffffff;
            }
            m_periodMS = i;
            m_acceptableBoundryMS = m_periodMS / 3;
            m_lastFrameTimeMS = System.currentTimeMillis();
            m_frameCountSinceReset = 0;
            resetReport();
        }

        private FPSController()
        {
            this$0 = JavaCamera.this;
            super();
            m_frameCountSinceReset = 0;
        }

    }


    private static final int FRM_FMT_NV21 = 1;
    private static final int FRM_FMT_YV12 = 2;
    private static final int MAX_FPS = 30000;
    private static final int MIN_FPS = 100;
    private static final String TAG = "JavaCapturer_Java";
    private static final ImageFormat m_fourcc;
    private volatile long cobj;
    private FPSController m_FPSController;
    private int m_cameraId;
    private Capturer m_capturer;
    private boolean m_capturingStarted;
    private int m_fps[];
    private boolean m_previewStarted;

    public JavaCamera()
        throws CaptureException
    {
        m_FPSController = new FPSController();
        m_cameraId = -1;
        m_previewStarted = false;
        m_capturingStarted = false;
        cobj = 0L;
        if (Log.isLoggable("JavaCapturer_Java", 3))
        {
            Log.d("JavaCapturer_Java", "JavaCamera");
        }
    }

    private boolean getCameraFps(CameraCapabilities cameracapabilities)
    {
        boolean flag = false;
        m_fps = new int[2];
        cameracapabilities = new ArrayList(cameracapabilities.d());
        for (int i = 0; i < cameracapabilities.size(); i++)
        {
            if (Log.isLoggable("JavaCapturer_Java", 3))
            {
                Log.d("JavaCapturer_Java", String.format((new StringBuilder("Possible FPS range: ")).append(cameracapabilities.get(i)).toString(), new Object[0]));
            }
            if (((FpsRange)cameracapabilities.get(i)).b() <= m_fps[1])
            {
                continue;
            }
            m_fps[0] = ((FpsRange)cameracapabilities.get(i)).a();
            m_fps[1] = ((FpsRange)cameracapabilities.get(i)).b();
            if (Log.isLoggable("JavaCapturer_Java", 3))
            {
                Log.d("JavaCapturer_Java", (new StringBuilder("Set FPS to ")).append(m_fps[0]).append(":").append(m_fps[1]).toString());
            }
            flag = true;
        }

        if (!flag)
        {
            m_fps[0] = 100;
            m_fps[1] = 30000;
        }
        return true;
    }

    private static int hasBack()
    {
        return hasFacing(com.skype.android.platform.capture.CameraInfo.Facing.a);
    }

    private static int hasFacing(com.skype.android.platform.capture.CameraInfo.Facing facing)
    {
        if (Log.isLoggable("JavaCapturer_Java", 3))
        {
            Log.d("JavaCapturer_Java", "::hasFront()");
        }
        int j = CameraManagerSingleton.a().a();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (CameraManagerSingleton.a().b(i).a() != facing)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        if (Log.isLoggable("JavaCapturer_Java", 3))
        {
            Log.d("JavaCapturer_Java", (new StringBuilder("::hasFront() ")).append(facing).append(" camera founded. e").toString());
        }
        return 1;
        i++;
        if (true) goto _L2; else goto _L1
        CaptureException captureexception;
        captureexception;
        if (Log.isLoggable("JavaCapturer_Java", 6))
        {
            Log.e("JavaCapturer_Java", "hasFacing failed", captureexception);
        }
_L1:
        if (Log.isLoggable("JavaCapturer_Java", 3))
        {
            Log.d("JavaCapturer_Java", (new StringBuilder("::hasFront() ")).append(facing).append(" camera not found. e").toString());
        }
        return 0;
    }

    private static int hasFront()
    {
        return hasFacing(com.skype.android.platform.capture.CameraInfo.Facing.b);
    }

    private static native void processFrame(long l, int i, int j, byte abyte0[]);

    private native boolean setCapabilities(long l, int i, int j, int k, int ai[]);

    public void close()
        throws IOException
    {
        cobj = 0L;
    }

    int getOrientation(int i)
    {
        int j;
        int k;
        j = 0;
        k = j;
        CameraInfo camerainfo = CameraManagerSingleton.a().b(m_cameraId);
        k = j;
        if (camerainfo.a() != com.skype.android.platform.capture.CameraInfo.Facing.b) goto _L2; else goto _L1
_L1:
        k = j;
        j = (360 - (camerainfo.b() + i) % 360) % 360;
_L4:
        int l;
        k = j;
        l = j;
        if (!Log.isLoggable("JavaCapturer_Java", 3))
        {
            break; /* Loop/switch isn't completed */
        }
        k = j;
        Log.d("JavaCapturer_Java", (new StringBuilder("getOrientation: ")).append(camerainfo.b()).append("+").append(i).append(" => ").append(j).toString());
        return j;
_L2:
        k = j;
        j = ((camerainfo.b() - i) + 360) % 360;
        if (true) goto _L4; else goto _L3
        CaptureException captureexception;
        captureexception;
        l = k;
        if (Log.isLoggable("JavaCapturer_Java", 6))
        {
            Log.e("JavaCapturer_Java", "getOrientation failed", captureexception);
            l = k;
        }
_L3:
        return l;
    }

    public void init(int i)
    {
        Object obj;
        if (Log.isLoggable("JavaCapturer_Java", 3))
        {
            static class _cls2
            {

                static final int $SwitchMap$com$skype$android$platform$capture$ImageFormat[];

                static 
                {
                    $SwitchMap$com$skype$android$platform$capture$ImageFormat = new int[ImageFormat.values().length];
                    try
                    {
                        $SwitchMap$com$skype$android$platform$capture$ImageFormat[ImageFormat.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$skype$android$platform$capture$ImageFormat[ImageFormat.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            Iterator iterator;
            ImageFormat imageformat;
            if (i == com.skype.android.platform.capture.CameraInfo.Facing.a.ordinal())
            {
                obj = "back";
            } else
            {
                obj = "front";
            }
            Log.d("JavaCapturer_Java", String.format("::SetupJavaCapturer() init %s camera facing", new Object[] {
                obj
            }));
        }
        obj = CameraParamsHolder.getInstance().getParameters(i);
        m_cameraId = ((CameraCapabilities) (obj)).a();
        i = 0;
        iterator = ((CameraCapabilities) (obj)).b().iterator();
        do
        {
            if (iterator.hasNext())
            {
                imageformat = (ImageFormat)iterator.next();
                switch (_cls2..SwitchMap.com.skype.android.platform.capture.ImageFormat[imageformat.ordinal()])
                {
                case 1: // '\001'
                    if (Log.isLoggable("JavaCapturer_Java", 3))
                    {
                        Log.d("JavaCapturer_Java", "::SetupJavaCapturer() YV12");
                    }
                    i = 2;
                    break;

                case 2: // '\002'
                    if (Log.isLoggable("JavaCapturer_Java", 3))
                    {
                        Log.d("JavaCapturer_Java", "::SetupJavaCapturer() NV21");
                    }
                    i = 1;
                    break;
                }
                continue;
            }
            ArrayList arraylist = new ArrayList(((CameraCapabilities) (obj)).c());
            Collections.sort(arraylist);
            getCameraFps(((CameraCapabilities) (obj)));
            obj = new ArrayList();
            for (int j = 0; j < arraylist.size(); j++)
            {
                Resolution resolution;
                int i1;
label0:
                {
                    resolution = (Resolution)arraylist.get(j);
                    boolean flag = true;
                    float f = 0.0F;
                    float f1 = 0.0F;
                    i1 = ((flag) ? 1 : 0);
                    if (resolution.getWidth() != resolution.getHeight())
                    {
                        break label0;
                    }
                    if (j > 0)
                    {
                        i1 = ((Resolution)arraylist.get(j - 1)).getWidth();
                        f = (float)(((Resolution)arraylist.get(j - 1)).getHeight() * i1) / (float)(resolution.getWidth() * resolution.getHeight());
                    }
                    if (j < arraylist.size() - 2)
                    {
                        i1 = ((Resolution)arraylist.get(j + 1)).getWidth();
                        f1 = (((Resolution)arraylist.get(j + 1)).getHeight() * i1) / (resolution.getWidth() * resolution.getHeight());
                    }
                    if ((double)f < 0.33000000000000002D || (double)f > 2.5D)
                    {
                        i1 = ((flag) ? 1 : 0);
                        if ((double)f1 < 0.33000000000000002D)
                        {
                            break label0;
                        }
                        i1 = ((flag) ? 1 : 0);
                        if ((double)f1 > 2.5D)
                        {
                            break label0;
                        }
                    }
                    i1 = 0;
                }
                if (i1 == 0)
                {
                    continue;
                }
                if (Log.isLoggable("JavaCapturer_Java", 3))
                {
                    Log.d("JavaCapturer_Java", (new StringBuilder("Init: supported preview size: ")).append(resolution.getWidth()).append("x").append(resolution.getHeight()).toString());
                }
                ((ArrayList) (obj)).add(Integer.valueOf(resolution.getWidth()));
                ((ArrayList) (obj)).add(Integer.valueOf(resolution.getHeight()));
            }

            int ai[] = new int[((ArrayList) (obj)).size()];
            for (int k = 0; k < ai.length; k++)
            {
                ai[k] = ((Integer)((ArrayList) (obj)).get(k)).intValue();
            }

            int l;
            int j1;
            if (m_fps[0] < 100)
            {
                l = 100;
            } else
            {
                l = m_fps[0];
            }
            if (m_fps[1] > 30000)
            {
                j1 = 30000;
            } else
            {
                j1 = m_fps[1];
            }
            if (Log.isLoggable("JavaCapturer_Java", 3))
            {
                Log.d("JavaCapturer_Java", (new StringBuilder("Init: FPS:")).append(l).append(":").append(j1).toString());
            }
            setCapabilities(cobj, i, l, j1, ai);
            return;
        } while (true);
    }

    public void setFps(int i)
    {
        if (Log.isLoggable("JavaCapturer_Java", 3))
        {
            Log.d("JavaCapturer_Java", (new StringBuilder("setFPS() fps: ")).append(i).toString());
        }
        m_FPSController.setFPS(i);
        if (Log.isLoggable("JavaCapturer_Java", 3))
        {
            Log.d("JavaCapturer_Java", "setFPS() e");
        }
    }

    public int startCapturing()
    {
        if (!m_previewStarted)
        {
            if (Log.isLoggable("JavaCapturer_Java", 6))
            {
                Log.e("JavaCapturer_Java", "startCapturing: preview not started !");
            }
        } else
        {
            m_capturingStarted = true;
        }
        return !m_capturingStarted ? 0 : 1;
    }

    public int startPreview(int i, int j, int k, SurfaceHolder surfaceholder)
    {
        if (Log.isLoggable("JavaCapturer_Java", 3))
        {
            Log.d("JavaCapturer_Java", (new StringBuilder("startPreview: dim=")).append(i).append("x").append(j).append(" angle=").append(k).append(" started=").append(m_previewStarted).toString());
        }
        if (m_previewStarted)
        {
            if (Log.isLoggable("JavaCapturer_Java", 5))
            {
                Log.w("JavaCapturer_Java", "startCamera: camera alredy startd !");
            }
        } else
        {
            com.skype.android.video.capture.impl.Capturer.CaptureSourceParameters capturesourceparameters = new com.skype.android.video.capture.impl.Capturer.CaptureSourceParameters();
            capturesourceparameters.cameraId = m_cameraId;
            capturesourceparameters.width = i;
            capturesourceparameters.height = j;
            capturesourceparameters.angle = k;
            capturesourceparameters.fpsMin = m_fps[0];
            capturesourceparameters.fpsMax = m_fps[1];
            capturesourceparameters.fourcc = m_fourcc;
            capturesourceparameters.display = surfaceholder;
            try
            {
                m_capturer = new Capturer(capturesourceparameters, new FrameConsumer() {

                    final JavaCamera this$0;

                    public void onFrameArrived(byte abyte0[], int l, int i1)
                    {
                        if (!m_capturingStarted)
                        {
                            break MISSING_BLOCK_LABEL_36;
                        }
                        if (!m_FPSController.checkAccept())
                        {
                            break MISSING_BLOCK_LABEL_58;
                        }
                        JavaCamera.processFrame(cobj, l, i1, abyte0);
_L2:
                        return;
                        abyte0;
                        if (!Log.isLoggable("JavaCapturer_Java", 6)) goto _L2; else goto _L1
_L1:
                        Log.e("JavaCapturer_Java", "onFrameArrived: runtime exception. Error ", abyte0);
                        return;
                        if (Log.isLoggable("JavaCapturer_Java", 3))
                        {
                            Log.d("JavaCapturer_Java", "Frame DROPPED inside");
                            return;
                        }
                          goto _L2
                    }

            
            {
                this$0 = JavaCamera.this;
                super();
            }
                });
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceHolder surfaceholder)
            {
                return 0;
            }
            try
            {
                m_capturer.start();
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceHolder surfaceholder)
            {
                if (Log.isLoggable("JavaCapturer_Java", 6))
                {
                    Log.e("JavaCapturer_Java", (new StringBuilder()).append(getClass().getSimpleName()).append(".startCamera: failed").toString(), surfaceholder);
                }
                return 0;
            }
            m_previewStarted = true;
            if (Log.isLoggable("JavaCapturer_Java", 3))
            {
                Log.d("JavaCapturer_Java", "::CameraStart() e");
                return 1;
            }
        }
        return 1;
    }

    public void stopCapturing()
    {
        if (!m_capturingStarted)
        {
            if (Log.isLoggable("JavaCapturer_Java", 5))
            {
                Log.w("JavaCapturer_Java", "stopCapturing: capturing not started !");
            }
            return;
        } else
        {
            m_capturingStarted = false;
            return;
        }
    }

    public int stopPreview()
    {
        if (Log.isLoggable("JavaCapturer_Java", 3))
        {
            Log.d("JavaCapturer_Java", "stopPreview");
        }
        try
        {
            m_capturer.stop();
        }
        catch (InterruptedException interruptedexception)
        {
            throw new RuntimeException(interruptedexception);
        }
        catch (CaptureException captureexception)
        {
            throw new RuntimeException(captureexception);
        }
        m_capturer = null;
        m_previewStarted = false;
        if (Log.isLoggable("JavaCapturer_Java", 3))
        {
            Log.d("JavaCapturer_Java", "::CameraStop() e");
        }
        return 0;
    }

    static 
    {
        m_fourcc = ImageFormat.b;
    }




}
