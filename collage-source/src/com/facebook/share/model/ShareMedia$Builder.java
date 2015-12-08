// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Bundle;

// Referenced classes of package com.facebook.share.model:
//            ShareModelBuilder, ShareMedia, ShareModel

public static abstract class params
    implements ShareModelBuilder
{

    private Bundle params;

    public params readFrom(ShareMedia sharemedia)
    {
        if (sharemedia == null)
        {
            return this;
        } else
        {
            return setParameters(sharemedia.getParameters());
        }
    }

    public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
    {
        return readFrom((ShareMedia)sharemodel);
    }

    public readFrom setParameter(String s, String s1)
    {
        params.putString(s, s1);
        return this;
    }

    public params setParameters(Bundle bundle)
    {
        params.putAll(bundle);
        return this;
    }


    public ()
    {
        params = new Bundle();
    }
}
