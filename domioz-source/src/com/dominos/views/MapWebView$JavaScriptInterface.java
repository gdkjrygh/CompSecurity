// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;


// Referenced classes of package com.dominos.views:
//            MapWebView

public class this._cls0
{

    final MapWebView this$0;

    public void mapInitialized()
    {
        if (MapWebView.access$000(MapWebView.this) != null)
        {
            MapWebView.access$000(MapWebView.this).mapFinishedLoading();
        }
    }

    public void markerSet()
    {
        if (MapWebView.access$000(MapWebView.this) != null)
        {
            MapWebView.access$000(MapWebView.this).mapMarkerSet();
        }
    }

    public ()
    {
        this$0 = MapWebView.this;
        super();
    }
}
