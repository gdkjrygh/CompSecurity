// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.util.Pair;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.media.BifManager;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.IMdxSharedState;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import java.nio.ByteBuffer;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            DummyMdxVideoDetails

public class DummyMdx
    implements IMdx
{

    private final BifManager bifMan;
    private final VideoDetails dummyDetails = new DummyMdxVideoDetails();

    public DummyMdx(NetflixActivity netflixactivity)
    {
        bifMan = new BifManager(netflixactivity, "http://tp.akam.nflximg.com/tpa2/799/1190182799.bif");
    }

    public ByteBuffer getBifFrame(int i)
    {
        return bifMan.getIndexFrame(i);
    }

    public String getCurrentTarget()
    {
        return "Dummy_UUID";
    }

    public IMdxSharedState getSharedState()
    {
        return null;
    }

    public Pair[] getTargetList()
    {
        return new Pair[0];
    }

    public VideoDetails getVideoDetail()
    {
        return dummyDetails;
    }

    public com.netflix.mediaclient.util.WebApiUtils.VideoIds getVideoIds()
    {
        return null;
    }

    public boolean isBifReady()
    {
        return bifMan.isBifReady();
    }

    public boolean isPaused()
    {
        return false;
    }

    public boolean isReady()
    {
        return true;
    }

    public void setCurrentTarget(String s)
    {
    }

    public boolean setDialUuidAsCurrentTarget(String s)
    {
        return false;
    }

    public void switchPlaybackFromTarget(String s, int i)
    {
    }
}
