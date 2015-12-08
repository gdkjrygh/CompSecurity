// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.os.Handler;
import com.netflix.mediaclient.android.activity.NetflixActivity;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerFrag, MdxMiniPlayerViews

class this._cls0
    implements Runnable
{

    final MdxMiniPlayerFrag this$0;

    public void run()
    {
        if (MdxMiniPlayerFrag.access$200(MdxMiniPlayerFrag.this).destroyed() || MdxMiniPlayerFrag.access$700(MdxMiniPlayerFrag.this))
        {
            MdxMiniPlayerFrag.access$400(MdxMiniPlayerFrag.this, "skipping seekbar update");
            return;
        }
        long l = System.currentTimeMillis() - MdxMiniPlayerFrag.access$800(MdxMiniPlayerFrag.this);
        if (MdxMiniPlayerFrag.access$800(MdxMiniPlayerFrag.this) > 0L && l > 0L)
        {
            MdxMiniPlayerFrag.access$914(MdxMiniPlayerFrag.this, l);
            int i = (int)MdxMiniPlayerFrag.access$900(MdxMiniPlayerFrag.this) / 1000;
            MdxMiniPlayerFrag.access$300(MdxMiniPlayerFrag.this).setProgress(i);
        }
        MdxMiniPlayerFrag.access$802(MdxMiniPlayerFrag.this, System.currentTimeMillis());
        MdxMiniPlayerFrag.access$1100(MdxMiniPlayerFrag.this).postDelayed(MdxMiniPlayerFrag.access$1000(MdxMiniPlayerFrag.this), 1000L);
    }

    ivity()
    {
        this$0 = MdxMiniPlayerFrag.this;
        super();
    }
}
