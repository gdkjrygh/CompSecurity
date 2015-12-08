// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.util;

import com.pinterest.api.model.Interest;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.data.DiskCache;
import java.util.ArrayList;

public class ExploreInterestsData
{

    private static ExploreInterestsData _instance;
    private ArrayList _exploreData;
    private ExploreInterestsResponseHandler _onInterestExploreLoaded;

    private ExploreInterestsData()
    {
        _exploreData = new ArrayList();
    }

    public static ExploreInterestsData get()
    {
        if (_instance == null)
        {
            _instance = new ExploreInterestsData();
        }
        return _instance;
    }

    public static ArrayList getExploreDataBlocking()
    {
        if (hasRecent())
        {
            return get()._exploreData;
        }
        com.pinterest.network.json.PinterestJsonArray pinterestjsonarray = DiskCache.getJsonArray("EXPLORE_TOPIC_DATA");
        if (pinterestjsonarray != null)
        {
            get()._exploreData = Interest.makeAllFromExploreData(pinterestjsonarray, false);
            return get()._exploreData;
        } else
        {
            return null;
        }
    }

    private ExploreInterestsResponseHandler getOnInterestExploreLoadedHandler()
    {
        if (_onInterestExploreLoaded == null)
        {
            _onInterestExploreLoaded = new ExploreInterestsResponseHandler();
        }
        return _onInterestExploreLoaded;
    }

    public static boolean hasRecent()
    {
        return get()._exploreData != null && get()._exploreData.size() > 0;
    }

    public static void loadCachedInterests()
    {
        if (!Experiments.j() || hasRecent())
        {
            return;
        }
        PinterestJsonArray pinterestjsonarray = DiskCache.getJsonArray("EXPLORE_TOPIC_DATA");
        if (pinterestjsonarray != null)
        {
            get()._exploreData = Interest.makeAllFromExploreData(pinterestjsonarray, false);
            return;
        } else
        {
            get().refreshFromServer();
            return;
        }
    }

    public void refreshFromServer()
    {
        InterestsApi.a(getOnInterestExploreLoadedHandler());
    }

    public void resetOnInterestExploreLoadedHander()
    {
        _onInterestExploreLoaded = null;
    }


    private class ExploreInterestsResponseHandler extends ApiResponseHandler
    {

        public void onSuccess(final ApiResponse data)
        {
            super.onSuccess(data);
            data = ((ApiResponse) (data.getData()));
            class _cls1 extends BackgroundTask
            {

                ArrayList interests;
                final ExploreInterestsResponseHandler this$0;
                final Object val$data;

                public void onFinish()
                {
                    super.onFinish();
                    onSuccess(interests);
                }

                public void run()
                {
                    interests = Interest.makeAllFromExploreData((PinterestJsonArray)data, false);
                    DiskCache.setJsonArray("EXPLORE_TOPIC_DATA", (PinterestJsonArray)data);
                }

                _cls1()
                {
                    this$0 = ExploreInterestsResponseHandler.this;
                    data = obj;
                    super();
                }
            }

            if (data instanceof PinterestJsonArray)
            {
                (new _cls1()).execute();
            }
        }

        public void onSuccess(ArrayList arraylist)
        {
            ExploreInterestsData.get()._exploreData.clear();
            ExploreInterestsData.get()._exploreData.addAll(arraylist);
        }

        public ExploreInterestsResponseHandler()
        {
        }
    }

}
