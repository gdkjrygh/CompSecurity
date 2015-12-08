// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            MdxPostplayState

public class mTitleType
{

    private int mTitleId;
    private String mTitleType;
    final MdxPostplayState this$0;

    public int getId()
    {
        return mTitleId;
    }

    public boolean isEpisode()
    {
        if (mTitleType != null)
        {
            return mTitleType.contains("episode");
        } else
        {
            return false;
        }
    }

    (int i, String s)
    {
        this$0 = MdxPostplayState.this;
        super();
        mTitleId = -1;
        mTitleId = i;
        mTitleType = s;
    }
}
