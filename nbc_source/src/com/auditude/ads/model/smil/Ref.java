// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model.smil;

import com.auditude.ads.model.Ad;
import com.auditude.ads.model.Asset;
import com.auditude.ads.model.ILinearAsset;
import com.auditude.ads.model.INonLinearAsset;
import com.auditude.ads.model.OnPageAsset;
import java.util.ArrayList;

// Referenced classes of package com.auditude.ads.model.smil:
//            SmilElementType, Par

public class Ref
{

    private Ad ad;
    private Asset assets[];
    private OnPageAsset companions[];
    private String id;
    private boolean isWatched;
    private Par par;
    private Asset primaryAsset;
    private SmilElementType type;

    public Ref()
    {
        this(null);
    }

    public Ref(Par par1)
    {
        isWatched = false;
        type = SmilElementType.LINEAR;
        par = par1;
    }

    private void mapAssets()
    {
        ArrayList arraylist;
        if (ad == null)
        {
            return;
        }
        arraylist = new ArrayList();
        primaryAsset = null;
        if (assets == null || assets.length <= 0) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i < assets.length) goto _L3; else goto _L2
_L2:
        companions = (OnPageAsset[])arraylist.toArray(new OnPageAsset[0]);
        return;
_L3:
        Asset asset;
        asset = assets[i];
        if (!(asset instanceof ILinearAsset) || type != SmilElementType.LINEAR)
        {
            break; /* Loop/switch isn't completed */
        }
        primaryAsset = asset;
_L6:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        if ((asset instanceof INonLinearAsset) && type == SmilElementType.NON_LINEAR)
        {
            primaryAsset = asset;
        } else
        if (asset instanceof OnPageAsset)
        {
            if (!(asset instanceof OnPageAsset))
            {
                asset = null;
            }
            arraylist.add((OnPageAsset)asset);
        }
          goto _L6
        if (true) goto _L5; else goto _L7
_L7:
    }

    public final void dispose()
    {
    }

    public final Ad getAd()
    {
        return ad;
    }

    public final Asset[] getAssets()
    {
        return assets;
    }

    public final OnPageAsset[] getCompanions()
    {
        return companions;
    }

    public final String getID()
    {
        return id;
    }

    public final Par getPar()
    {
        return par;
    }

    public final Asset getPrimaryAsset()
    {
        return primaryAsset;
    }

    public final SmilElementType getType()
    {
        if (par != null)
        {
            return par.getType();
        } else
        {
            return SmilElementType.UNKNOWN;
        }
    }

    public final boolean isWatched()
    {
        return isWatched;
    }

    public final void setAd(Ad ad1)
    {
        ad = ad1;
    }

    public final void setAssets(Asset aasset[])
    {
        assets = aasset;
        mapAssets();
    }

    public final void setID(String s)
    {
        id = s;
    }

    public void setPar(Par par1)
    {
        par = par1;
    }

    public final void setWatched(boolean flag)
    {
        isWatched = flag;
    }
}
