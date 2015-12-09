// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.View;
import android.widget.AdapterView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.mdx.MdxTarget;
import com.netflix.mediaclient.ui.mdx.MdxTargetSelection;
import com.netflix.mediaclient.util.MdxUtils;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            BottomPanel, PlayerActivity

class val.wasPlaying
    implements android.widget.ItemClickListener
{

    final BottomPanel this$0;
    final PlayerActivity val$controller;
    final boolean val$wasPlaying;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        Log.d("screen", (new StringBuilder()).append("Mdx target clicked: item with id ").append(l).append(", on position ").append(i).toString());
        val$controller.removeVisibleDialog();
        if (mdxTargetSelector == null) goto _L2; else goto _L1
_L1:
        mdxTargetSelector.setTarget(i);
        adapterview = mdxTargetSelector.getSelectedTarget();
        if (adapterview != null) goto _L4; else goto _L3
_L3:
        Log.e("screen", "Target is NULL, this should NOT happen!");
        if (val$wasPlaying)
        {
            val$controller.doUnpause();
        }
_L2:
        return;
_L4:
        if (!adapterview.isLocal())
        {
            break; /* Loop/switch isn't completed */
        }
        Log.d("screen", "Target is local, same as cancel. Do nothing");
        if (val$wasPlaying)
        {
            val$controller.doUnpause();
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (Log.isLoggable("screen", 3))
        {
            Log.d("screen", (new StringBuilder()).append("Remote target is selected ").append(adapterview).toString());
        }
        if (!MdxUtils.isMdxTargetAvailable(val$controller.getServiceManager(), adapterview.getUUID()))
        {
            break; /* Loop/switch isn't completed */
        }
        Log.d("screen", "Remote target is available, start MDX playback, use local bookmark!");
        val$controller.getServiceManager().getMdx().setCurrentTarget(adapterview.getUUID());
        adapterview = val$controller.getCurrentAsset();
        adapterview.setPlaybackBookmark(val$controller.getPlayer().getCurrentPositionMs() / 1000);
        PlaybackLauncher.startPlaybackAfterPIN(val$controller, adapterview);
        if (PlaybackLauncher.shouldPlayOnRemoteTarget(val$controller.getServiceManager()))
        {
            val$controller.finish();
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
        Log.w("screen", "Remote target is NOT available anymore, continue local plaback");
        if (val$wasPlaying)
        {
            val$controller.doUnpause();
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    ()
    {
        this$0 = final_bottompanel;
        val$controller = playeractivity;
        val$wasPlaying = Z.this;
        super();
    }
}
