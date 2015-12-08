// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.maps;

import android.os.AsyncTask;
import com.accuweather.android.services.request.AsyncTaskCallback;
import com.accuweather.android.utilities.Logger;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.accuweather.android.maps:
//            MapOverlayFrame, AccuTileProvider, MapOverlayLayerManager, MapOverlayAnimation

public class RetrieveOverlaysTask extends AsyncTask
{

    private AsyncTaskCallback asyncTaskCallback;
    private String gmtOffset;
    private GoogleMap googleMap;
    private Exception lastException;
    private MapOverlayLayerManager mapOverlayLayerManager;

    public RetrieveOverlaysTask(GoogleMap googlemap, AsyncTaskCallback asynctaskcallback, MapOverlayLayerManager mapoverlaylayermanager, String s)
    {
        googleMap = googlemap;
        asyncTaskCallback = asynctaskcallback;
        mapOverlayLayerManager = mapoverlaylayermanager;
        gmtOffset = s;
    }

    private MapOverlayFrame buildMapOverlayFrame(String s, AccuTileProvider accutileprovider)
    {
        TileOverlay tileoverlay = googleMap.addTileOverlay((new TileOverlayOptions()).tileProvider(accutileprovider));
        tileoverlay.setVisible(false);
        return new MapOverlayFrame(s, accutileprovider.getFrameId(), tileoverlay, gmtOffset);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient List doInBackground(Void avoid[])
    {
        try
        {
            avoid = mapOverlayLayerManager.retrieveOverlayAnimations();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            lastException = avoid;
            Logger.e(getClass().getName(), "Error retrieving map overlays", avoid);
            return new ArrayList();
        }
        return avoid;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((List)obj);
    }

    protected void onPostExecute(List list)
    {
        if (lastException != null)
        {
            asyncTaskCallback.onBackgroundProcessingError(lastException);
            return;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            MapOverlayAnimation mapoverlayanimation = (MapOverlayAnimation)list.next();
            try
            {
                Iterator iterator = mapoverlayanimation.buildTileProviders().iterator();
                while (iterator.hasNext()) 
                {
                    AccuTileProvider accutileprovider = (AccuTileProvider)iterator.next();
                    mapOverlayLayerManager.addMapOverlayFrame(buildMapOverlayFrame(mapoverlayanimation.getOverlayType(), accutileprovider));
                }
            }
            catch (JSONException jsonexception)
            {
                Logger.d(getClass().getName(), jsonexception.toString());
            }
        }

        asyncTaskCallback.onPostExecute(null);
    }
}
