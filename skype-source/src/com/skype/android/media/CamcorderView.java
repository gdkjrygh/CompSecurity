// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import java.io.File;

// Referenced classes of package com.skype.android.media:
//            CameraView, Camcorder, DeviceProfile, OrientationLock, 
//            CamcorderDeviceProfile, GLTextureViewWrapper, GLTextureView, GLSurfaceViewWrapper, 
//            ComponentCamcorder, MediaRecorderCamcorder, CamcorderCallback, Size, 
//            AudioFilter, SurfaceWrapper, ShaderEffect

public class CamcorderView extends CameraView
    implements Camcorder
{

    private File a;
    private Camcorder b;
    private CamcorderCallback c;
    private OrientationLock d;
    private Size e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private int l;

    public CamcorderView(Context context)
    {
        this(context, null);
    }

    public CamcorderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = -1;
        f = true;
        g = true;
        h = true;
    }

    private boolean f()
    {
        return g && !deviceProfile.k() && android.os.Build.VERSION.SDK_INT >= 18;
    }

    public final void a(AudioFilter audiofilter)
    {
        if (f())
        {
            b.a(audiofilter);
            return;
        } else
        {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean a()
    {
        return b.a();
    }

    public final void b()
    {
        if (i >= 0)
        {
            b.setAudioSource(i);
        }
        if (k > 0)
        {
            b.setAudioBitRate(k);
        }
        if (l > 0)
        {
            b.setVideoBitRate(l);
        }
        if (j > 0)
        {
            b.setAudioChannels(j);
        }
        if (a == null)
        {
            String s = (new StringBuilder("scv_")).append(System.currentTimeMillis()).append(".mp4").toString();
            setRecordingFile(new File(getContext().getExternalCacheDir(), s));
        }
        if (d == null && h)
        {
            d = new OrientationLock((Activity)getContext(), getDeviceProfile());
            d.a();
        }
        b.b();
    }

    public final void c()
    {
        b.c();
        if (d != null)
        {
            d.b();
        }
        a = null;
        return;
        Exception exception;
        exception;
        if (d != null)
        {
            d.b();
        }
        a = null;
        throw exception;
    }

    protected void createDeviceProfile()
    {
        if (deviceProfile == null)
        {
            deviceProfile = new CamcorderDeviceProfile();
        }
    }

    protected SurfaceWrapper createSurface()
    {
        boolean flag1 = true;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (f() && flag)
        {
            Object obj = (android.graphics.SurfaceTexture.OnFrameAvailableListener)b;
            if (f)
            {
                obj = new GLTextureViewWrapper(getContext(), this, ((android.graphics.SurfaceTexture.OnFrameAvailableListener) (obj)));
                GLTextureView gltextureview = ((GLTextureViewWrapper) (obj)).h();
                gltextureview.setUseMainThread(deviceProfile.r());
                if (deviceProfile.b())
                {
                    flag1 = false;
                }
                gltextureview.setReleaseSurfaceThread(flag1);
                return ((SurfaceWrapper) (obj));
            } else
            {
                return new GLSurfaceViewWrapper(getContext(), this, ((android.graphics.SurfaceTexture.OnFrameAvailableListener) (obj)));
            }
        } else
        {
            return super.createSurface();
        }
    }

    public final void d()
    {
        b.d();
    }

    public final void e()
    {
        b.e();
    }

    protected String getDebugText()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (f() && (surfaceWrapper instanceof GLTextureViewWrapper))
        {
            stringbuilder.append("OES GL capture\n");
        }
        return (new StringBuilder()).append(stringbuilder.toString()).append(super.getDebugText()).toString();
    }

    public void initialize()
    {
        createDeviceProfile();
        if (f())
        {
            b = new ComponentCamcorder(this, deviceProfile);
        } else
        {
            b = new MediaRecorderCamcorder(this, deviceProfile);
        }
        if (e != null)
        {
            b.setTargetVideoSize(e);
        }
        b.setCamcorderCallback(c);
        super.initialize();
    }

    public void onPause()
    {
        c();
        super.onPause();
    }

    public void setAudioBitRate(int i1)
    {
        k = i1;
    }

    public void setAudioChannels(int i1)
    {
        j = i1;
    }

    public void setAudioSource(int i1)
    {
        i = i1;
    }

    public void setCamcorderCallback(CamcorderCallback camcordercallback)
    {
        c = camcordercallback;
        if (b != null)
        {
            b.setCamcorderCallback(camcordercallback);
        }
    }

    public void setCameraFacing(int i1)
    {
        super.setCameraFacing(i1);
        if (b != null)
        {
            b.setCameraFacing(i1);
        }
    }

    public void setGLTextureViewEnabled(boolean flag)
    {
        f = flag;
    }

    public void setLockOrientation(boolean flag)
    {
        h = flag;
    }

    public void setMaxDuration(int i1)
    {
        b.setMaxDuration(i1);
    }

    public void setMediaCodecsEnabled(boolean flag)
    {
        g = flag;
    }

    public void setRecordingFile(File file)
    {
        a = file;
        b.setRecordingFile(file);
    }

    public void setShaderEffect(ShaderEffect shadereffect)
    {
        if (f())
        {
            ((ComponentCamcorder)b).a(shadereffect);
            return;
        } else
        {
            throw new UnsupportedOperationException("not supported on media recorder");
        }
    }

    public void setTargetVideoSize(Size size)
    {
        e = size;
    }

    public void setVideoBitRate(int i1)
    {
        l = i1;
    }
}
