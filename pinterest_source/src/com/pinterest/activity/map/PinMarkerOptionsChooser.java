// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.map;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.MarkerOptions;
import com.makeramen.RoundedDrawable;
import com.pinterest.base.Application;
import com.pinterest.base.Colors;
import com.pinterest.kit.application.Resources;
import com.twotoasters.clusterkraf.ClusterPoint;
import com.twotoasters.clusterkraf.InputPoint;
import com.twotoasters.clusterkraf.MarkerOptionsChooser;
import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.map:
//            MapPin, PinInfo, DescriptorInfo

public class PinMarkerOptionsChooser extends MarkerOptionsChooser
{

    private static final int BLOB_RADIUS = (int)Resources.dimension(0x7f0a019d);
    private static final int MARKER_PADDING;
    private static final int MARKER_PADDING_DOUBLE;
    private static final int MAX_SIZE = 99;
    private static final String NINETY_NINE_PLUS = "99+";
    private static final float TEXT_SIZE = (float)(int)Resources.dimension(0x7f0a01d7);
    private static PinMarkerOptionsChooser _instance;
    private Bitmap _markerBitmap;
    private final Paint clusterPaint = new Paint();
    private HashMap descriptorCache;
    public final Paint redPaint = new Paint();
    public final Paint whitePaint = new Paint();

    public PinMarkerOptionsChooser()
    {
        descriptorCache = new HashMap();
        clusterPaint.setColor(0xff000000);
        clusterPaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
        clusterPaint.setTextSize(Resources.dimension(0x7f0a01e2));
        whitePaint.setColor(-1);
        whitePaint.setTextSize(TEXT_SIZE);
        whitePaint.setTypeface(Typeface.defaultFromStyle(1));
        whitePaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        whitePaint.setAntiAlias(true);
        redPaint.setColor(Colors.RED);
        redPaint.setAntiAlias(true);
    }

    public static PinMarkerOptionsChooser instance()
    {
        if (_instance == null)
        {
            _instance = new PinMarkerOptionsChooser();
        }
        return _instance;
    }

    public void choose(MarkerOptions markeroptions, ClusterPoint clusterpoint)
    {
        boolean flag1 = false;
        MapPin mappin;
        int i;
        boolean flag;
        if (clusterpoint.e() > 99)
        {
            i = 100;
        } else
        {
            i = clusterpoint.e();
        }
        if (i > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mappin = (MapPin)clusterpoint.a(0).d();
        mappin.setCluster(clusterpoint);
        if (!mappin.bitmapLoaded()) goto _L2; else goto _L1
_L1:
        clusterpoint = new PinInfo(mappin.pinId, i);
        if (!descriptorCache.containsKey(clusterpoint)) goto _L2; else goto _L3
_L3:
        clusterpoint = (DescriptorInfo)descriptorCache.get(clusterpoint);
        if (((DescriptorInfo) (clusterpoint)).size != i) goto _L2; else goto _L4
_L4:
        clusterpoint = ((DescriptorInfo) (clusterpoint)).descriptor;
        flag1 = true;
_L6:
        if (!mappin.bitmapLoaded() || !flag1)
        {
            clusterpoint = getDescriptorFromRounded(mappin.pinId, null, i);
        }
        if (!flag)
        {
            markeroptions.title(mappin.label);
        }
        markeroptions.icon(clusterpoint);
        markeroptions.anchor(0.5F, 1.0F);
        return;
_L2:
        clusterpoint = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void clearCache()
    {
        _markerBitmap = null;
        descriptorCache.clear();
    }

    public BitmapDescriptor getDescriptorFromRounded(String s, RoundedDrawable roundeddrawable, int i)
    {
        if (_markerBitmap == null)
        {
            _markerBitmap = BitmapFactory.decodeResource(Application.context().getResources(), 0x7f0201dc);
        }
        int j = _markerBitmap.getWidth();
        int k = _markerBitmap.getHeight();
        if (roundeddrawable == null)
        {
            return BitmapDescriptorFactory.fromBitmap(_markerBitmap);
        }
        Bitmap bitmap = Bitmap.createBitmap(j, k, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        k = j - MARKER_PADDING_DOUBLE;
        int l = MARKER_PADDING;
        Rect rect = new Rect(l, l, l + k, k + l);
        canvas.save();
        roundeddrawable.setBounds(rect);
        roundeddrawable.draw(canvas);
        canvas.drawBitmap(_markerBitmap, 0.0F, 0.0F, null);
        canvas.restore();
        if (i > 1)
        {
            canvas.drawCircle(j - BLOB_RADIUS, BLOB_RADIUS, BLOB_RADIUS, redPaint);
            if (i <= 99)
            {
                roundeddrawable = String.valueOf(i);
            } else
            {
                roundeddrawable = "99+";
            }
            canvas.drawText(roundeddrawable, j - BLOB_RADIUS, (float)BLOB_RADIUS + whitePaint.getTextSize() / 4F + 2.0F, whitePaint);
        }
        roundeddrawable = BitmapDescriptorFactory.fromBitmap(bitmap);
        descriptorCache.put(new PinInfo(s, i), new DescriptorInfo(roundeddrawable, i));
        return roundeddrawable;
    }

    static 
    {
        MARKER_PADDING = (int)Resources.dimension(0x7f0a01a1);
        MARKER_PADDING_DOUBLE = MARKER_PADDING * 2;
    }
}
