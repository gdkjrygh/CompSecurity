// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import com.cardinalblue.android.b.k;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            StickerTranslation

public class AssetStickerBundleInfo
{

    public String description;
    public boolean isFree;
    public String productId;
    public List stickers;
    public String title;
    private StickerTranslation translation;

    public AssetStickerBundleInfo()
    {
    }

    public String getTitleTranslatedString()
    {
        String s;
        if (translation == null || translation.title == null)
        {
            s = title;
        } else
        {
            String s1 = (String)translation.title.get(k.i());
            s = s1;
            if (s1 == null)
            {
                return title;
            }
        }
        return s;
    }
}
