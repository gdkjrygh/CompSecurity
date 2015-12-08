// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.exception;

import com.auditude.ads.util.StringUtil;
import java.util.HashMap;

// Referenced classes of package com.auditude.ads.exception:
//            PlayerException

public class AssetException extends PlayerException
{

    private static final long serialVersionUID = 1L;
    public String adId;
    public String assetId;

    public AssetException(int i, String s)
    {
        super(i, s);
    }

    public HashMap toParams()
    {
        HashMap hashmap = super.toParams();
        if (StringUtil.isNotNullOrEmpty(adId))
        {
            hashmap.put("a", adId);
        }
        if (StringUtil.isNotNullOrEmpty(assetId))
        {
            hashmap.put("a1", assetId);
        }
        return hashmap;
    }
}
