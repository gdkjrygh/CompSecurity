// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.jcp.views.HorizontalListView;

// Referenced classes of package com.jcp.activities:
//            SlyceScanActivity, br, bs, bt, 
//            bu, bv

public class 
    implements butterknife.jector
{

    public void inject(butterknife.jector jector, SlyceScanActivity slycescanactivity, Object obj)
    {
        slycescanactivity.mSimilarSearchProgress = (View)jector.iew(obj, 0x7f0e04db, "field 'mSimilarSearchProgress'");
        slycescanactivity.mSimilarSearchLoaderImage = (ImageView)jector.rSearchLoaderImage((View)jector.iew(obj, 0x7f0e04dd, "field 'mSimilarSearchLoaderImage'"), 0x7f0e04dd, "field 'mSimilarSearchLoaderImage'");
        slycescanactivity.surfaceView = (SurfaceView)jector.View((View)jector.iew(obj, 0x7f0e014f, "field 'surfaceView'"), 0x7f0e014f, "field 'surfaceView'");
        slycescanactivity.lytScannedItemsContainer = (View)jector.iew(obj, 0x7f0e0475, "field 'lytScannedItemsContainer'");
        slycescanactivity.lvScannedItems = (HorizontalListView)jector.edItems((View)jector.iew(obj, 0x7f0e0478, "field 'lvScannedItems'"), 0x7f0e0478, "field 'lvScannedItems'");
        slycescanactivity.tvScannedItems = (TextView)jector.edItems((View)jector.iew(obj, 0x7f0e0476, "field 'tvScannedItems'"), 0x7f0e0476, "field 'tvScannedItems'");
        slycescanactivity.mCancelSearch = (ImageView)jector.Search((View)jector.iew(obj, 0x7f0e04dc, "field 'mCancelSearch'"), 0x7f0e04dc, "field 'mCancelSearch'");
        ((View)jector.iew(obj, 0x7f0e014e, "method 'onCloseClick'")).setOnClickListener(new br(this, slycescanactivity));
        ((View)jector.iew(obj, 0x7f0e0477, "method 'onClearScannedItemsClick'")).setOnClickListener(new bs(this, slycescanactivity));
        ((View)jector.iew(obj, 0x7f0e0152, "method 'onHelpClick'")).setOnClickListener(new bt(this, slycescanactivity));
        ((View)jector.iew(obj, 0x7f0e0153, "method 'onCaptureClick'")).setOnClickListener(new bu(this, slycescanactivity));
        ((View)jector.iew(obj, 0x7f0e0154, "method 'onFlipCameraClick'")).setOnClickListener(new bv(this, slycescanactivity));
    }

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (SlyceScanActivity)obj, obj1);
    }

    public void reset(SlyceScanActivity slycescanactivity)
    {
        slycescanactivity.mSimilarSearchProgress = null;
        slycescanactivity.mSimilarSearchLoaderImage = null;
        slycescanactivity.surfaceView = null;
        slycescanactivity.lytScannedItemsContainer = null;
        slycescanactivity.lvScannedItems = null;
        slycescanactivity.tvScannedItems = null;
        slycescanactivity.mCancelSearch = null;
    }

    public volatile void reset(Object obj)
    {
        reset((SlyceScanActivity)obj);
    }

    public ()
    {
    }
}
