// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;

import android.util.Log;

// Referenced classes of package com.microsoft.media:
//            CameraPal, RtcPalConfig

public class VideoSourcePal
{

    private static final String TAG = "pal.video.source";
    private static VideoSourcePal g_vspal = null;
    private CameraPal m_Camera;

    public VideoSourcePal()
    {
        m_Camera = null;
    }

    private static int CreateVideoSource(int i, int j)
    {
        if (g_vspal != null)
        {
            return -1;
        } else
        {
            VideoSourcePal videosourcepal = new VideoSourcePal();
            g_vspal = videosourcepal;
            return videosourcepal.Initialize(i, j);
        }
    }

    private static int DestroyVideoSource(int i, int j)
    {
        if (g_vspal == null)
        {
            return -1;
        } else
        {
            g_vspal.UnInitialize();
            g_vspal = null;
            return 0;
        }
    }

    private int Initialize(int i, int j)
    {
        m_Camera = new CameraPal(j);
        SetJniObj(m_Camera);
        return 0;
    }

    private native int SetJniObj(Object obj);

    private int SetVideoFormat(int i, int j, int k, int l)
    {
        try
        {
            m_Camera.Prepare(i, j, k, l);
        }
        catch (RuntimeException runtimeexception)
        {
            if (RtcPalConfig.isLogcatEnabled())
            {
                Log.e("pal.video.source", runtimeexception.getMessage(), runtimeexception);
            }
            return -1;
        }
        return 0;
    }

    private int UnInitialize()
    {
        SetJniObj(null);
        m_Camera = null;
        return 0;
    }

}
