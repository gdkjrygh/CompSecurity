// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.utils.Utils;
import com.aetn.history.android.historyhere.view.ClusterIconGenerator;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import java.util.ArrayList;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

public class mImageView extends DefaultClusterRenderer
{

    final BitmapDescriptor bdFavoriteIcon;
    final BitmapDescriptor bdIcon;
    final BitmapDescriptor bdSelectedFavoriteIcon;
    final BitmapDescriptor bdSelectedIcon;
    private final ClusterIconGenerator mClusterIconGenerator;
    private final ImageView mClusterImageView;
    private final int mDimension;
    private final ClusterIconGenerator mIconGenerator;
    private final ImageView mImageView;
    private ArrayList mUnclusteredPois;
    final MapFragment this$0;
    private int totalPoisRendered;

    private void onClusteringDone()
    {
        MapFragment.access$3400(MapFragment.this, mUnclusteredPois);
        totalPoisRendered = 0;
        mUnclusteredPois.clear();
    }

    private void resetClustering()
    {
        Utils.logger(MapFragment.access$000(MapFragment.this), "resetClustering:");
        totalPoisRendered = 0;
        mUnclusteredPois.clear();
    }

    protected void onBeforeClusterItemRendered(POIDetail poidetail, MarkerOptions markeroptions)
    {
        Utils.logger(MapFragment.access$000(MapFragment.this), "onBeforeClusterItemRendered:");
        markeroptions.title(poidetail.getId());
        BitmapDescriptor bitmapdescriptor;
        boolean flag;
        if (MapFragment.access$1700(MapFragment.this).indexOf((new StringBuilder()).append(",").append(poidetail.getId()).append(",").toString()) > -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            bitmapdescriptor = bdFavoriteIcon;
        } else
        {
            bitmapdescriptor = bdIcon;
        }
        if (MapFragment.access$2400(MapFragment.this) != null)
        {
            Utils.logger(MapFragment.access$000(MapFragment.this), (new StringBuilder()).append("addMarkers(): getCurrentlySelectedPoi:").append(MapFragment.access$2400(MapFragment.this).getId()).toString());
            if (MapFragment.access$2400(MapFragment.this).getId().equals(poidetail.getId()))
            {
                if (flag)
                {
                    bitmapdescriptor = bdSelectedFavoriteIcon;
                } else
                {
                    bitmapdescriptor = bdSelectedIcon;
                }
            }
        } else
        {
            MapFragment.access$1800(MapFragment.this);
        }
        markeroptions.icon(bitmapdescriptor);
    }

    protected volatile void onBeforeClusterItemRendered(ClusterItem clusteritem, MarkerOptions markeroptions)
    {
        onBeforeClusterItemRendered((POIDetail)clusteritem, markeroptions);
    }

    protected void onBeforeClusterRendered(Cluster cluster, MarkerOptions markeroptions)
    {
        markeroptions.icon(BitmapDescriptorFactory.fromBitmap(mClusterIconGenerator.makeIcon(String.valueOf(cluster.getSize()))));
    }

    protected void onClusterItemRendered(POIDetail poidetail, Marker marker)
    {
        Utils.logger(MapFragment.access$000(MapFragment.this), (new StringBuilder()).append("PoiRenderer: onClusterItemRendered(): cluster item of: ").append(poidetail).toString());
        mUnclusteredPois.add(poidetail);
        totalPoisRendered = totalPoisRendered + 1;
        Utils.logger(MapFragment.access$000(MapFragment.this), (new StringBuilder()).append("PoiRenderer: onClusterItemRendered(): newPoiList.size(): ").append(MapFragment.access$2900(MapFragment.this).size()).toString());
        if (totalPoisRendered == MapFragment.access$2900(MapFragment.this).size())
        {
            onClusteringDone();
        }
    }

    protected volatile void onClusterItemRendered(ClusterItem clusteritem, Marker marker)
    {
        onClusterItemRendered((POIDetail)clusteritem, marker);
    }

    protected void onClusterRendered(Cluster cluster, Marker marker)
    {
        totalPoisRendered = totalPoisRendered + cluster.getSize();
        Utils.logger(MapFragment.access$000(MapFragment.this), (new StringBuilder()).append("PoiRenderer: onClusterRendered(): newPoiList.size(): ").append(MapFragment.access$2900(MapFragment.this).size()).toString());
        if (totalPoisRendered == MapFragment.access$2900(MapFragment.this).size())
        {
            onClusteringDone();
        }
    }

    protected boolean shouldRenderAsCluster(Cluster cluster)
    {
        return cluster.getSize() > 1;
    }


    public ()
    {
        this$0 = MapFragment.this;
        super(getActivity(), MapFragment.access$100(MapFragment.this), MapFragment.access$300(MapFragment.this));
        mIconGenerator = new ClusterIconGenerator(getActivity());
        mClusterIconGenerator = new ClusterIconGenerator(getActivity());
        totalPoisRendered = 0;
        bdIcon = MapFragment.access$3000(MapFragment.this);
        bdFavoriteIcon = MapFragment.access$3100(MapFragment.this);
        bdSelectedIcon = MapFragment.access$3200(MapFragment.this);
        bdSelectedFavoriteIcon = MapFragment.access$3300(MapFragment.this);
        View view = getActivity().getLayoutInflater().inflate(0x7f030036, null);
        mClusterIconGenerator.setContentView(view);
        mClusterImageView = (ImageView)view.findViewById(0x7f0a003d);
        mUnclusteredPois = new ArrayList();
        mImageView = new ImageView(getActivity());
        mDimension = (int)getResources().getDimension(0x7f0b0014);
        mImageView.setLayoutParams(new android.view.init>(mDimension, mDimension));
        int i = (int)getResources().getDimension(0x7f0b0015);
        mImageView.setPadding(i, i, i, i);
        mIconGenerator.setContentView(mImageView);
    }
}
