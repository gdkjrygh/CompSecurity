// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import java.util.Set;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerFrag, MdxMiniPlayerViews

class llback extends LoggingManagerCallback
{

    final MdxMiniPlayerFrag this$0;
    final String val$id;

    public void onVideoHide(int i)
    {
        if (MdxMiniPlayerFrag.access$200(MdxMiniPlayerFrag.this).destroyed())
        {
            return;
        }
        Object obj = MdxMiniPlayerFrag.access$300(MdxMiniPlayerFrag.this);
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((MdxMiniPlayerViews) (obj)).setSharingButtonVisibility(flag);
        if (i == 0)
        {
            MdxMiniPlayerFrag.access$400(MdxMiniPlayerFrag.this, "onVideoHide, unshared state is: true");
            MdxMiniPlayerFrag.access$500().isVideoUnshared = true;
            MdxMiniPlayerFrag.access$600().add(val$id);
        }
        obj = (new StringBuilder()).append("DEBUG: onVideoHide status: ").append(i).toString();
        MdxMiniPlayerFrag.access$400(MdxMiniPlayerFrag.this, ((String) (obj)));
    }

    aredState(String s1)
    {
        this$0 = final_mdxminiplayerfrag;
        val$id = s1;
        super(String.this);
    }
}
