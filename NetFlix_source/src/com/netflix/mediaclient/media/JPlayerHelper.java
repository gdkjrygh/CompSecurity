// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media;

import android.content.Context;
import android.view.Surface;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.ui.IMedia;
import com.netflix.mediaclient.media.JPlayer.JPlayer;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.media:
//            MediaPlayerHelper

public class JPlayerHelper
    implements MediaPlayerHelper
{

    private static final String TAG = "NF_JPlayer";
    private JPlayer jp;

    public JPlayerHelper()
    {
    }

    public void prepare(IMedia imedia, Surface surface, Context context)
    {
    }

    public void prepareJPlayer(IMedia imedia, Surface surface, com.netflix.mediaclient.media.JPlayer.JPlayer.JplayerListener jplayerlistener, boolean flag, JSONObject jsonobject)
    {
        Log.d("NF_JPlayer", "Create JPlayer");
        if (jp != null)
        {
            jp.release();
        }
        jp = new JPlayer(surface, jsonobject);
        imedia.setVOapi(0L, jp.getNativePlayer());
        jp.setJplayerListener(jplayerlistener);
        jp.setEnablePlatformDrs(flag);
    }

    public void release()
    {
        if (jp != null)
        {
            jp.release();
        }
        jp = null;
    }

    static 
    {
        Log.v("NF_JPlayer", "loadLibrary - libnetflix_jpjni.so");
        try
        {
            System.load("/data/data/com.netflix.mediaclient/lib/libnetflix_jpjni.so");
        }
        catch (Exception exception)
        {
            Log.v("NF_JPlayer", "loadLibrary - libnetflix_jpjni.so first attempt fails");
            System.loadLibrary("netflix_jpjni");
        }
    }
}
