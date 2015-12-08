// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media;

import android.content.Context;
import android.view.Surface;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.ui.IMedia;
import com.netflix.mediaclient.media.JPlayer.JPlayer2;
import com.netflix.mediaclient.service.configuration.BitrateRangeFactory;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.media:
//            MediaPlayerHelper

public class JPlayer2Helper
    implements MediaPlayerHelper
{

    private static final String TAG = "NF_JPlayer2";
    private JPlayer2 jp;

    public JPlayer2Helper()
    {
    }

    public void prepare(IMedia imedia, Surface surface, Context context)
    {
        Log.d("NF_JPlayer2", "Create JPlayer2");
        if (jp != null)
        {
            jp.release();
        }
        jp = new JPlayer2(surface);
        jp.setMaxVideoBitrate(BitrateRangeFactory.getBitrateCap(context));
        imedia.setVOapi(0L, jp.getNativePlayer());
    }

    public void prepareJPlayer(IMedia imedia, Surface surface, com.netflix.mediaclient.media.JPlayer.JPlayer.JplayerListener jplayerlistener, boolean flag, JSONObject jsonobject)
    {
    }

    public void release()
    {
        if (jp != null)
        {
            jp.release();
        }
        jp = null;
    }

    public void updateSurface(Surface surface)
    {
        if (jp != null)
        {
            jp.updateSurface(surface);
        }
    }

    static 
    {
        Log.v("NF_JPlayer2", "loadLibrary - libnetflix_jp2jni.so");
        try
        {
            System.load("/data/data/com.netflix.mediaclient/lib/libnetflix_jp2jni.so");
        }
        catch (Exception exception)
        {
            Log.v("NF_JPlayer2", "loadLibrary - libnetflix_jp2jni.so first attempt fails");
            System.loadLibrary("netflix_jp2jni");
        }
    }
}
