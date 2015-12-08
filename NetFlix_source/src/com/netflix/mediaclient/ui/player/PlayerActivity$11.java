// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.SurfaceHolder;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.TappableSurfaceView;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity, PlayScreen

class this._cls0
    implements android.view.back
{

    final PlayerActivity this$0;

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("Surface changed, format: ").append(i).append(", width: ").append(j).append(", height: ").append(k).toString());
            if (surfaceholder != null && surfaceholder.getSurface() != null)
            {
                Log.d("PlayerActivity", (new StringBuilder()).append("Holder: ").append(surfaceholder).toString());
                Log.d("PlayerActivity", (new StringBuilder()).append("Native surface: ").append(surfaceholder.getSurface()).toString());
            }
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("PlayerActivity", "Surface created");
        if (surfaceholder == null) goto _L2; else goto _L1
_L1:
        if (surfaceholder.getSurface() == null || PlayerActivity.access$700(PlayerActivity.this) == null) goto _L2; else goto _L3
_L3:
        PlayerActivity.access$2902(PlayerActivity.this, true);
        PlayerActivity.access$700(PlayerActivity.this).getSurfaceView().setVisibility(0);
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("Native surface: ").append(surfaceholder.getSurface()).toString());
        }
        PlayerActivity.access$3000(PlayerActivity.this);
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        PlayerActivity.access$2902(PlayerActivity.this, false);
        if (PlayerActivity.access$400(PlayerActivity.this) == null)
        {
            Log.e("PlayerActivity", "surfaceCreated again, playout already set to null");
        }
        Log.d("PlayerActivity", "SurfaceCreated again, no playback");
        if (true) goto _L5; else goto _L4
_L4:
        surfaceholder;
        throw surfaceholder;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        Log.d("PlayerActivity", "Surface destroyed, exit if we are not already in it");
        PlayerActivity.access$2902(PlayerActivity.this, false);
        if (!PlayerActivity.access$700(PlayerActivity.this).canExitPlaybackEndOfPlay())
        {
            Log.d("PlayerActivity", "In posplay when surface is destroyed, do not exit");
            return;
        } else
        {
            cleanupAndExit();
            return;
        }
    }

    ceView()
    {
        this$0 = PlayerActivity.this;
        super();
    }
}
