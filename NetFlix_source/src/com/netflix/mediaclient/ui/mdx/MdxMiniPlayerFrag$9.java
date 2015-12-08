// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;


// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerFrag

class this._cls0
    implements com.netflix.mediaclient.service.mdx.dxKeyEventCallbacks
{

    final MdxMiniPlayerFrag this$0;

    public int getVolumeAsPercent()
    {
        return getVolume();
    }

    public void onVolumeSet(int i)
    {
        MdxMiniPlayerFrag.access$500().mostRecentVolume = i;
    }

    aredState()
    {
        this$0 = MdxMiniPlayerFrag.this;
        super();
    }
}
