// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import com.cardinalblue.android.b.k;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            AssetBackgroundBundleInfo, IBackground

public class AssetBackgroundBundle
{

    private static final String BACKGROUND_META_DATA = "background.json";
    private final List mBackgrounds = new ArrayList();
    private final String mUri;

    public AssetBackgroundBundle(String s)
    {
        mUri = s;
        s = (AssetBackgroundBundleInfo)k.a(getInfoPath(), com/cardinalblue/android/piccollage/model/gson/AssetBackgroundBundleInfo);
        if (s != null)
        {
            mBackgrounds.addAll(s.getBackgrounds());
        }
    }

    private String getInfoPath()
    {
        return (new StringBuilder(mUri)).append("/").append("background.json").toString();
    }

    public IBackground getBackgroundAtIndex(int i)
    {
        if (i < mBackgrounds.size())
        {
            return (IBackground)mBackgrounds.get(i);
        } else
        {
            return null;
        }
    }

    public List getBackgrounds()
    {
        return mBackgrounds;
    }

    public int length()
    {
        return mBackgrounds.size();
    }
}
