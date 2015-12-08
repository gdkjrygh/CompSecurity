// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.googlemap;

import com.google.android.gms.maps.model.UrlTileProvider;
import java.net.URL;
import me.lyft.android.map.core.tileoverlay.ITileProvider;

// Referenced classes of package me.lyft.android.map.googlemap:
//            GooglePlayMap

class der extends UrlTileProvider
{

    final GooglePlayMap this$0;
    final ITileProvider val$provider;

    public URL getTileUrl(int i, int j, int k)
    {
        return val$provider.getTileUrl(i, j, k);
    }

    ider(int j, ITileProvider itileprovider)
    {
        this$0 = final_googleplaymap;
        val$provider = itileprovider;
        super(I.this, j);
    }
}
