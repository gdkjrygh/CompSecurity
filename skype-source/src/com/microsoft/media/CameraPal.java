// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;

import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.Log;
import android.view.SurfaceHolder;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.microsoft.media:
//            RtcPalConfig

public class CameraPal
    implements android.hardware.Camera.PreviewCallback
{

    private static final String TAG = "pal.video.camera";
    private Camera m_Camera;
    private android.hardware.Camera.Parameters m_Parameters;
    private volatile boolean m_bCameraStarted;
    private boolean m_bPreviewStarted;
    private boolean m_bSurfaceTextureChanged;
    private Object m_cameraReleaseLock;
    private int m_degreeCW;
    private int m_hPalSource;
    private int m_nCameraID;
    private Object m_surfaceTexture;

    public CameraPal(int i)
    {
        m_Camera = null;
        m_Parameters = null;
        m_nCameraID = -1;
        m_surfaceTexture = null;
        m_bSurfaceTextureChanged = false;
        m_bCameraStarted = false;
        m_bPreviewStarted = false;
        m_degreeCW = 0;
        m_hPalSource = 0;
        m_cameraReleaseLock = new Object();
        m_hPalSource = i;
    }

    private void CreatePreview(Object obj)
    {
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Setting the surface texture");
        }
        if (obj == null)
        {
            Log.e("pal.video.camera", "Failed to set surface texture, because it's null");
        } else
        {
            m_surfaceTexture = obj;
            m_bSurfaceTextureChanged = true;
            if (RtcPalConfig.isLogcatEnabled())
            {
                Log.i("pal.video.camera", "Surface texture set");
                return;
            }
        }
    }

    private void DeletePreview()
    {
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Removing the surface texture");
        }
        StopPreviewRendering();
        m_surfaceTexture = null;
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Surface texture removed");
        }
    }

    private static int GetCameraInfo(int i, int ai[], int ai1[])
    {
        android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
        try
        {
            Camera.getCameraInfo(i, camerainfo);
        }
        catch (RuntimeException runtimeexception)
        {
            if (RtcPalConfig.isLogcatEnabled())
            {
                Log.e("pal.video.camera", runtimeexception.getMessage(), runtimeexception);
            }
            ai[0] = -1;
            ai1[0] = -1;
            return -1;
        }
        if (GetNumberOfCameras() > 1)
        {
            if (camerainfo.facing == 0)
            {
                ai[0] = 0;
            } else
            {
                ai[0] = 1;
            }
        } else
        {
            ai[0] = 1;
        }
        ai1[0] = camerainfo.orientation;
        return 0;
    }

    private int GetColorFormat(int ai[], int ai1[])
    {
        boolean flag = false;
        Iterator iterator = m_Parameters.getSupportedPreviewFormats().iterator();
        int i;
        do
        {
            i = ((flag) ? 1 : 0);
            if (!iterator.hasNext())
            {
                break;
            }
            Integer integer = (Integer)iterator.next();
            if (integer.intValue() != 17)
            {
                continue;
            }
            ai[0] = integer.intValue();
            ai1[0] = ImageFormat.getBitsPerPixel(integer.intValue());
            i = 0 + 1;
            break;
        } while (true);
        return i;
    }

    private int GetFrameRate(int ai[], int ai1[])
    {
        int i = 0;
        Iterator iterator = m_Parameters.getSupportedPreviewFpsRange().iterator();
_L2:
        int j = i;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        int ai2[] = (int[])iterator.next();
        ai[i] = ai2[0] / 1000;
        ai1[i] = ai2[1] / 1000;
        i++;
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        ai[0] = 10;
        ai1[0] = 30;
        j = 1;
_L1:
        return j;
    }

    private static int GetNumberOfCameras()
    {
        return Camera.getNumberOfCameras();
    }

    private int GetResolution(int ai[], int ai1[])
    {
        int i;
        int k;
        i = 0;
        Object obj = m_Parameters.getSupportedPreviewSizes();
        boolean flag = false;
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            android.hardware.Camera.Size size = (android.hardware.Camera.Size)((Iterator) (obj)).next();
            ai[i] = size.width;
            ai1[i] = size.height;
            int j = i + 1;
            i = j;
            if (size.width == 320)
            {
                i = j;
                if (size.height == 240)
                {
                    flag = true;
                    i = j;
                }
            }
        } while (true);
        k = i;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        m_Parameters.setPreviewSize(320, 240);
        m_Camera.setParameters(m_Parameters);
        ai[i] = 320;
        ai1[i] = 240;
        k = i + 1;
_L2:
        return k;
        ai;
        k = i;
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "can not support qvga resolution");
            return i;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private int OpenCamera(int i)
    {
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Opening camera");
        }
        if (m_Camera != null)
        {
            if (RtcPalConfig.isLogcatEnabled())
            {
                Log.i("pal.video.camera", "Skipping opening the camera, camera has already been open");
            }
        } else
        {
            try
            {
                m_Camera = Camera.open(i);
                m_Parameters = m_Camera.getParameters();
            }
            catch (RuntimeException runtimeexception)
            {
                if (RtcPalConfig.isLogcatEnabled())
                {
                    Log.e("pal.video.camera", (new StringBuilder("Failed to open camera: ")).append(runtimeexception.getMessage()).toString(), runtimeexception);
                }
                return -1;
            }
            m_nCameraID = i;
            if (RtcPalConfig.isLogcatEnabled())
            {
                Log.i("pal.video.camera", "Camera opened");
                return 0;
            }
        }
        return 0;
    }

    private void ReleaseCamera()
    {
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Releasing the camera");
        }
        if (m_Camera != null) goto _L2; else goto _L1
_L1:
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Skipping releasing the camera, camera has already been released");
        }
_L4:
        return;
_L2:
        m_Camera.setPreviewCallbackWithBuffer(null);
        synchronized (m_cameraReleaseLock)
        {
            m_Camera.release();
        }
        m_Camera = null;
        if (!RtcPalConfig.isLogcatEnabled()) goto _L4; else goto _L3
_L3:
        Log.i("pal.video.camera", "Camera released");
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private int StartCamera()
    {
        this;
        JVM INSTR monitorenter ;
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Starting camera");
        }
        if (m_Camera != null) goto _L2; else goto _L1
_L1:
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.e("pal.video.camera", "Failed to start the camera, camera has not been opened");
        }
        int i = -1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = doStartCamera();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private int StartPreviewRendering()
    {
        int i;
        i = -1;
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Starting the preview");
        }
        if (!m_bPreviewStarted) goto _L2; else goto _L1
_L1:
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Skipping starting the preview, preview has already been started");
        }
        i = 0;
_L4:
        return i;
_L2:
        if (m_Camera != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.e("pal.video.camera", "Failed to start the preview, camera has not been opened");
            return -1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (m_surfaceTexture != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.e("pal.video.camera", "Failed to start the preview, surface texture has not been set");
            return -1;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (m_bSurfaceTextureChanged)
        {
            doStopCamera();
        }
        m_bPreviewStarted = true;
        setRotation(m_degreeCW);
        int j = doStartCamera();
        i = j;
        if (RtcPalConfig.isLogcatEnabled())
        {
            if (j == 0)
            {
                Log.i("pal.video.camera", "Preview started");
                return j;
            } else
            {
                Log.i("pal.video.camera", "Failed to start the preview, failed to start the camera");
                return j;
            }
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    private void StopCamera()
    {
        this;
        JVM INSTR monitorenter ;
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Stopping camera");
        }
        if (m_Camera != null) goto _L2; else goto _L1
_L1:
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Skipping stopping camera, camera has not been opened");
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        doStopCamera();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private int StopPreviewRendering()
    {
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Stopping the preview");
        }
        if (!m_bPreviewStarted)
        {
            if (RtcPalConfig.isLogcatEnabled())
            {
                Log.i("pal.video.camera", "Skipping stopping the preview, preview has not been started");
            }
        } else
        {
            if (m_Camera == null)
            {
                if (RtcPalConfig.isLogcatEnabled())
                {
                    Log.e("pal.video.camera", "Failed to stop the preview, camera has not been opened");
                }
                return -1;
            }
            m_bPreviewStarted = false;
            if (RtcPalConfig.isLogcatEnabled())
            {
                Log.i("pal.video.camera", "Preview stopped");
                return 0;
            }
        }
        return 0;
    }

    private int doStartCamera()
    {
        this;
        JVM INSTR monitorenter ;
        if (!m_bCameraStarted) goto _L2; else goto _L1
_L1:
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Skipping starting the camera, camera has already been started");
        }
        int i = 0;
_L5:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        if (m_surfaceTexture != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Skipping starting the camera, surface texture has not been set");
        }
        i = 0;
        continue; /* Loop/switch isn't completed */
        m_bCameraStarted = true;
        m_Camera.setPreviewTexture((SurfaceTexture)m_surfaceTexture);
_L3:
        m_Camera.setPreviewCallbackWithBuffer(this);
        m_bSurfaceTextureChanged = false;
        m_Camera.startPreview();
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Camera started");
        }
        i = 0;
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        m_Camera.setPreviewDisplay((SurfaceHolder)m_surfaceTexture);
          goto _L3
        obj;
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.e("pal.video.camera", (new StringBuilder("Failed to start the camera: ")).append(((Exception) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
        m_bCameraStarted = false;
        i = -1;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        throw obj;
    }

    private void doStopCamera()
    {
        this;
        JVM INSTR monitorenter ;
        if (m_bCameraStarted) goto _L2; else goto _L1
_L1:
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Skipping stopping camera, camera has not been started");
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        m_Camera.stopPreview();
        m_bCameraStarted = false;
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Camera stopped");
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public native int DeliverFrame(int i, byte abyte0[]);

    public boolean IsStarted()
    {
        return m_bCameraStarted;
    }

    public void Prepare(int i, int j, int k, int l)
    {
        byte abyte0[];
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", "Preparing camera");
        }
        m_Camera.setPreviewCallbackWithBuffer(null);
        abyte0 = new byte[(i * j * ImageFormat.getBitsPerPixel(k)) / 8];
        m_Parameters.setPreviewSize(i, j);
        m_Parameters.setPreviewFormat(k);
        m_Parameters.setPreviewFrameRate(l);
        m_Camera.setParameters(m_Parameters);
        m_Camera.addCallbackBuffer(abyte0);
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.i("pal.video.camera", (new StringBuilder("Camera prepared: ")).append(i).append(" ").append(j).append(" ").append(k).append(" ").append(l).toString());
        }
_L2:
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.e("pal.video.camera", (new StringBuilder("Failed to prepare the camera: ")).append(runtimeexception.getMessage()).toString(), runtimeexception);
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onPreviewFrame(byte abyte0[], Camera camera)
    {
        if (abyte0 != null && abyte0.length != 0) goto _L2; else goto _L1
_L1:
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.e("pal.video.camera", "Get empty buffer in callback, skip this frame.");
        }
_L4:
        return;
_L2:
        if (!IsStarted()) goto _L4; else goto _L3
_L3:
        DeliverFrame(m_hPalSource, abyte0);
        synchronized (m_cameraReleaseLock)
        {
            camera.addCallbackBuffer(abyte0);
        }
        return;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public void setRotation(int i)
    {
        this;
        JVM INSTR monitorenter ;
        m_degreeCW = i;
        if (m_Camera == null) goto _L2; else goto _L1
_L1:
        boolean flag = m_bPreviewStarted;
        if (flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        android.hardware.Camera.CameraInfo camerainfo;
        camerainfo = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(m_nCameraID, camerainfo);
        Exception exception;
        if (camerainfo.facing == 1)
        {
            i %= 360;
        } else
        {
            i = (360 - i) % 360;
        }
        m_Camera.setDisplayOrientation(i);
        if (true) goto _L2; else goto _L4
_L4:
        exception;
        throw exception;
    }
}
