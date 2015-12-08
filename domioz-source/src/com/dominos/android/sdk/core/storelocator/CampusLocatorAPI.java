// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.storelocator;

import com.dominos.android.sdk.common.dom.locator.RegionResult;
import com.dominos.android.sdk.common.dom.locator.SiteResult;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.data.http.power.PowerRestClient;

public class CampusLocatorAPI
{

    PowerRestClient mPowerRestClient;

    public CampusLocatorAPI()
    {
    }

    private void getSavedBuildings(final RegionResult regionResult, final SiteResult siteResult, int i, final LabsAddress campusAddress, final CampusLocatorManager.GetCampusLocationCallback callback)
    {
        mPowerRestClient.getBuildings(i, new _cls6());
    }

    private void getSavedSites(final RegionResult regionResult, String s, final LabsAddress campusAddress, final CampusLocatorManager.GetCampusLocationCallback callback)
    {
        mPowerRestClient.getSites(s, new _cls5());
    }

    public void getBuildings(int i, final CampusLocatorManager.GetCampusLocationCallback callback)
    {
        mPowerRestClient.getBuildings(i, new _cls3());
    }

    public void getRegions(final CampusLocatorManager.GetCampusLocationCallback callback)
    {
        mPowerRestClient.getRegions(new _cls1());
    }

    public void getSavedCampusLocation(final LabsAddress campusAddress, final CampusLocatorManager.GetCampusLocationCallback callback)
    {
        mPowerRestClient.getRegions(new _cls4());
    }

    public void getSites(String s, final CampusLocatorManager.GetCampusLocationCallback callback)
    {
        mPowerRestClient.getSites(s, new _cls2());
    }



    private class _cls6 extends PowerRestCallback
    {

        final CampusLocatorAPI this$0;
        final CampusLocatorManager.GetCampusLocationCallback val$callback;
        final LabsAddress val$campusAddress;
        final RegionResult val$regionResult;
        final SiteResult val$siteResult;

        public void onBegin()
        {
            super.onBegin();
            callback.onBegin();
        }

        public void onError(Exception exception, String s)
        {
        }

        public void onFinish()
        {
            super.onFinish();
            callback.onFinish();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            s = (BuildingResult)(new k()).a(s, com/dominos/android/sdk/common/dom/locator/BuildingResult);
            if (s != null)
            {
                for (Iterator iterator = s.getBuildings().iterator(); iterator.hasNext();)
                {
                    com.dominos.android.sdk.common.dom.locator.BuildingResult.Building building = (com.dominos.android.sdk.common.dom.locator.BuildingResult.Building)iterator.next();
                    if (building != null && StringHelper.equalsIgnoreCase(building.getBuildingName(), campusAddress.getLine3()))
                    {
                        callback.onGetSavedCampusLocationFound(regionResult, siteResult, s);
                        return;
                    }
                }

                callback.onGetSavedCampusLocationFound(regionResult, siteResult, s);
                return;
            } else
            {
                callback.onGetSavedCampusLocationFound(regionResult, siteResult, null);
                return;
            }
        }

        _cls6()
        {
            this$0 = CampusLocatorAPI.this;
            callback = getcampuslocationcallback;
            campusAddress = labsaddress;
            regionResult = regionresult;
            siteResult = siteresult;
            super();
        }
    }


    private class _cls5 extends PowerRestCallback
    {

        final CampusLocatorAPI this$0;
        final CampusLocatorManager.GetCampusLocationCallback val$callback;
        final LabsAddress val$campusAddress;
        final RegionResult val$regionResult;

        public void onBegin()
        {
            super.onBegin();
            callback.onBegin();
        }

        public void onError(Exception exception, String s)
        {
            callback.onGetSavedCampusLocationFound(regionResult, null, null);
        }

        public void onFinish()
        {
            super.onFinish();
            callback.onFinish();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            s = (SiteResult)(new k()).a(s, com/dominos/android/sdk/common/dom/locator/SiteResult);
            if (s != null)
            {
                for (Iterator iterator = s.getSites().iterator(); iterator.hasNext();)
                {
                    com.dominos.android.sdk.common.dom.locator.SiteResult.Site site = (com.dominos.android.sdk.common.dom.locator.SiteResult.Site)iterator.next();
                    if (site != null && StringHelper.equalsIgnoreCase(site.getSiteName(), campusAddress.getOrganizationName()))
                    {
                        getSavedBuildings(regionResult, s, site.getSiteId(), campusAddress, callback);
                        return;
                    }
                }

                callback.onGetSavedCampusLocationFound(regionResult, s, null);
                return;
            } else
            {
                callback.onGetSavedCampusLocationFound(regionResult, null, null);
                return;
            }
        }

        _cls5()
        {
            this$0 = CampusLocatorAPI.this;
            callback = getcampuslocationcallback;
            regionResult = regionresult;
            campusAddress = labsaddress;
            super();
        }
    }


    private class _cls3 extends PowerRestCallback
    {

        final CampusLocatorAPI this$0;
        final CampusLocatorManager.GetCampusLocationCallback val$callback;

        public void onBegin()
        {
            super.onBegin();
            callback.onBegin();
        }

        public void onError(Exception exception, String s)
        {
            callback.onError();
        }

        public void onFinish()
        {
            super.onFinish();
            callback.onFinish();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            s = (BuildingResult)(new k()).a(s, com/dominos/android/sdk/common/dom/locator/BuildingResult);
            callback.onGetBuildingsFound(s);
        }

        _cls3()
        {
            this$0 = CampusLocatorAPI.this;
            callback = getcampuslocationcallback;
            super();
        }
    }


    private class _cls1 extends PowerRestCallback
    {

        final CampusLocatorAPI this$0;
        final CampusLocatorManager.GetCampusLocationCallback val$callback;

        public void onBegin()
        {
            super.onBegin();
            callback.onBegin();
        }

        public void onError(Exception exception, String s)
        {
            callback.onError();
        }

        public void onFinish()
        {
            super.onFinish();
            callback.onFinish();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            s = (RegionResult)(new k()).a(s, com/dominos/android/sdk/common/dom/locator/RegionResult);
            callback.onGetRegionsFound(s);
        }

        _cls1()
        {
            this$0 = CampusLocatorAPI.this;
            callback = getcampuslocationcallback;
            super();
        }
    }


    private class _cls4 extends PowerRestCallback
    {

        final CampusLocatorAPI this$0;
        final CampusLocatorManager.GetCampusLocationCallback val$callback;
        final LabsAddress val$campusAddress;

        public void onBegin()
        {
            super.onBegin();
            callback.onBegin();
        }

        public void onError(Exception exception, String s)
        {
            callback.onError();
        }

        public void onFinish()
        {
            super.onFinish();
            callback.onFinish();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            s = (RegionResult)(new k()).a(s, com/dominos/android/sdk/common/dom/locator/RegionResult);
            if (s != null)
            {
                Iterator iterator = s.getRegions().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    com.dominos.android.sdk.common.dom.locator.RegionResult.Region region = (com.dominos.android.sdk.common.dom.locator.RegionResult.Region)iterator.next();
                    if (region == null || !StringHelper.equalsIgnoreCase(region.getCode(), campusAddress.getRegion()))
                    {
                        continue;
                    }
                    getSavedSites(s, region.getCode(), campusAddress, callback);
                    break;
                } while (true);
                return;
            } else
            {
                callback.onError();
                return;
            }
        }

        _cls4()
        {
            this$0 = CampusLocatorAPI.this;
            callback = getcampuslocationcallback;
            campusAddress = labsaddress;
            super();
        }
    }


    private class _cls2 extends PowerRestCallback
    {

        final CampusLocatorAPI this$0;
        final CampusLocatorManager.GetCampusLocationCallback val$callback;

        public void onBegin()
        {
            super.onBegin();
            callback.onBegin();
        }

        public void onError(Exception exception, String s)
        {
            callback.onError();
        }

        public void onFinish()
        {
            super.onFinish();
            callback.onFinish();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            s = (SiteResult)(new k()).a(s, com/dominos/android/sdk/common/dom/locator/SiteResult);
            callback.onGetSitesFound(s);
        }

        _cls2()
        {
            this$0 = CampusLocatorAPI.this;
            callback = getcampuslocationcallback;
            super();
        }
    }

}
