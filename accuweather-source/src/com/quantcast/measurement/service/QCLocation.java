// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import android.content.Context;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.quantcast.measurement.service:
//            QCNotificationListener, QCNotificationCenter, QCLog, QCMeasurement

public final class QCLocation extends Enum
    implements QCNotificationListener
{
    private class MeasurementLocation
    {

        private final String country;
        private final String locality;
        private final String state;
        final QCLocation this$0;

        public String getCountry()
        {
            return country;
        }

        public String getLocality()
        {
            return locality;
        }

        public String getState()
        {
            return state;
        }

        public MeasurementLocation(String s, String s1, String s2)
        {
            this$0 = QCLocation.this;
            super();
            country = s;
            state = s1;
            locality = s2;
        }
    }


    private static final QCLocation $VALUES[];
    private static final String ADDRESS = "address_components";
    private static final String COUNTRY = "country";
    public static final QCLocation INSTANCE;
    private static final String LOCALITY = "locality";
    private static final String OK = "OK";
    static final String QC_CITY_KEY = "l";
    static final String QC_COUNTRY_KEY = "c";
    static final String QC_EVENT_LOCATION = "location";
    public static final String QC_NOTIF_LOCATION_START = "QC_LOC_START";
    static final String QC_STATE_KEY = "st";
    private static final String RESULTS = "results";
    private static final String SHORT_NAME = "short_name";
    private static final int STALE_LIMIT = 0x927c0;
    private static final String STATE = "administrative_area_level_1";
    private static final String STATUS = "status";
    private static final QCLog.Tag TAG = new QCLog.Tag(com/quantcast/measurement/service/QCLocation);
    private static final String TYPES = "types";
    private static final String URL = "https://maps.googleapis.com/maps/api/geocode/json?sensor=true&latlng=";
    private AsyncTask _geoTask;
    private Geocoder _geocoder;
    private LocationManager _locManager;
    private boolean _locationEnabled;
    private String _myProvider;
    protected final LocationListener singleUpdateListener = new LocationListener() {

        final QCLocation this$0;

        public void onLocationChanged(Location location)
        {
            _locManager.removeUpdates(singleUpdateListener);
            if (location != null)
            {
                sendLocation(location);
            }
        }

        public void onProviderDisabled(String s1)
        {
        }

        public void onProviderEnabled(String s1)
        {
        }

        public void onStatusChanged(String s1, int j, Bundle bundle)
        {
        }

            
            {
                this$0 = QCLocation.this;
                super();
            }
    };

    private QCLocation(String s, int i)
    {
        super(s, i);
        _locationEnabled = false;
        QCNotificationCenter.INSTANCE.addListener("QC_START", this);
        QCNotificationCenter.INSTANCE.addListener("QC_STOP", this);
        QCNotificationCenter.INSTANCE.addListener("QC_OUC", this);
        QCNotificationCenter.INSTANCE.addListener("QC_PU", this);
    }

    private boolean containsString(JSONArray jsonarray, String s)
    {
        for (int i = 0; i < jsonarray.length(); i++)
        {
            String s1 = jsonarray.optString(i);
            if (s1 != null && s1.equals(s))
            {
                return true;
            }
        }

        return false;
    }

    private MeasurementLocation lookup(double d, double d1)
    {
        Object obj;
        Object obj1;
        Object obj3;
        obj1 = (new StringBuilder()).append("https://maps.googleapis.com/maps/api/geocode/json?sensor=true&latlng=").append(d).append(",").append(d1).toString();
        obj = null;
        obj3 = null;
        obj1 = new BufferedReader(new InputStreamReader(((HttpURLConnection)(new URL(((String) (obj1)))).openConnection()).getInputStream()));
        obj = new StringBuilder();
_L3:
        String s = ((BufferedReader) (obj1)).readLine();
        if (s == null) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj)).append(s);
        ((StringBuilder) (obj)).append("\n");
          goto _L3
        Object obj2;
        obj2;
_L7:
        obj = obj1;
        QCLog.e(TAG, "Exception thrown by Google Maps", ((Throwable) (obj2)));
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        return null;
_L2:
        obj = parseJson(((StringBuilder) (obj)).toString());
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        return ((MeasurementLocation) (obj));
        obj;
        QCLog.e(TAG, "Unable to get address from JSON", ((Throwable) (obj)));
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        obj1;
_L5:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw obj1;
        obj2;
        obj = obj1;
        obj1 = obj2;
        if (true) goto _L5; else goto _L4
_L4:
        obj2;
        obj1 = obj3;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private MeasurementLocation parseJson(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        if ("OK".equals(s.optString("status")))
        {
            s = s.optJSONArray("results");
            if (s != null)
            {
                for (int i = 0; i < s.length(); i++)
                {
                    JSONArray jsonarray = s.getJSONObject(i).optJSONArray("address_components");
                    if (jsonarray != null)
                    {
                        String s2 = "";
                        String s1 = "";
                        s = "";
                        for (i = 0; i < jsonarray.length();)
                        {
                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                            JSONArray jsonarray1 = jsonobject.optJSONArray("types");
                            String s5 = s2;
                            String s3 = s1;
                            String s4 = s;
                            if (jsonarray1 != null)
                            {
                                if (containsString(jsonarray1, "locality"))
                                {
                                    s1 = jsonobject.getString("short_name");
                                }
                                if (containsString(jsonarray1, "administrative_area_level_1"))
                                {
                                    s = jsonobject.getString("short_name");
                                }
                                s5 = s2;
                                s3 = s1;
                                s4 = s;
                                if (containsString(jsonarray1, "country"))
                                {
                                    s5 = jsonobject.getString("short_name");
                                    s4 = s;
                                    s3 = s1;
                                }
                            }
                            i++;
                            s2 = s5;
                            s1 = s3;
                            s = s4;
                        }

                        return new MeasurementLocation(s2, s, s1);
                    }
                }

            }
        }
        return null;
    }

    private void sendLocation(Location location)
    {
        double d = location.getLatitude();
        double d1 = location.getLongitude();
        _geoTask = (new AsyncTask() {

            final QCLocation this$0;

            protected transient MeasurementLocation doInBackground(Double adouble[])
            {
                double d2 = adouble[0].doubleValue();
                double d3 = adouble[1].doubleValue();
                QCLog.i(QCLocation.TAG, "Looking for address.");
                try
                {
                    QCLog.i(QCLocation.TAG, "Geocoder.");
                    adouble = _geocoder.getFromLocation(d2, d3, 1);
                }
                // Misplaced declaration of an exception variable
                catch (Double adouble[])
                {
                    QCLog.i(QCLocation.TAG, "Geocoder API not available.");
                    return fallbackGeoLocate(d2, d3);
                }
                if (adouble == null)
                {
                    break MISSING_BLOCK_LABEL_94;
                }
                if (adouble.size() > 0)
                {
                    adouble = (Address)adouble.get(0);
                    return new MeasurementLocation(adouble.getCountryCode(), adouble.getAdminArea(), adouble.getLocality());
                }
                QCLog.i(QCLocation.TAG, "Geocoder reverse lookup failed.");
                adouble = fallbackGeoLocate(d2, d3);
                return adouble;
            }

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Double[])aobj);
            }

            protected MeasurementLocation fallbackGeoLocate(double d2, double d3)
            {
                MeasurementLocation measurementlocation = lookup(d2, d3);
                if (measurementlocation != null && !isCancelled())
                {
                    return measurementlocation;
                } else
                {
                    QCLog.i(QCLocation.TAG, "Google Maps API reverse lookup failed.");
                    return null;
                }
            }

            protected void onPostExecute(MeasurementLocation measurementlocation)
            {
                if (measurementlocation != null && measurementlocation.getCountry() != null)
                {
                    QCLog.i(QCLocation.TAG, (new StringBuilder()).append("Got address and sending...").append(measurementlocation.getCountry()).append(" ").append(measurementlocation.getState()).append(" ").append(measurementlocation.getLocality()).toString());
                    HashMap hashmap = new HashMap();
                    hashmap.put("event", "location");
                    if (measurementlocation.getCountry() != null)
                    {
                        hashmap.put("c", measurementlocation.getCountry());
                    }
                    if (measurementlocation.getState() != null)
                    {
                        hashmap.put("st", measurementlocation.getState());
                    }
                    if (measurementlocation.getLocality() != null)
                    {
                        hashmap.put("l", measurementlocation.getLocality());
                    }
                    QCMeasurement.INSTANCE.logOptionalEvent(hashmap, null, null);
                }
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((MeasurementLocation)obj);
            }

            
            {
                this$0 = QCLocation.this;
                super();
            }
        }).execute(new Double[] {
            Double.valueOf(d), Double.valueOf(d1)
        });
    }

    public static void setEnableLocationGathering(boolean flag)
    {
        INSTANCE.setLocationEnabled(flag);
        if (QCMeasurement.INSTANCE.isMeasurementActive())
        {
            INSTANCE.startStopLocation(QCMeasurement.INSTANCE.getAppContext());
        }
    }

    public static QCLocation valueOf(String s)
    {
        return (QCLocation)Enum.valueOf(com/quantcast/measurement/service/QCLocation, s);
    }

    public static QCLocation[] values()
    {
        return (QCLocation[])$VALUES.clone();
    }

    Location findBestLocation()
    {
        float f;
        Location location;
        Iterator iterator;
        long l;
        location = null;
        l = System.currentTimeMillis() - 0x927c0L;
        f = 3.402823E+38F;
        iterator = _locManager.getAllProviders().iterator();
_L2:
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        obj = (String)iterator.next();
        obj = _locManager.getLastKnownLocation(((String) (obj)));
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        float f1;
        long l1;
        f1 = ((Location) (obj)).getAccuracy();
        l1 = ((Location) (obj)).getTime();
        if ((double)f1 > 0.0D && l1 >= l && f1 <= f)
        {
            location = ((Location) (obj));
            f = f1;
            l = l1;
        }
        continue; /* Loop/switch isn't completed */
        return location;
        SecurityException securityexception;
        securityexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    Geocoder getGeocoder()
    {
        return _geocoder;
    }

    public void notificationCallback(String s, Object obj)
    {
        if (s.equals("QC_START") || s.equals("QC_LOC_START"))
        {
            startStopLocation((Context)obj);
        } else
        {
            if (s.equals("QC_STOP"))
            {
                stop();
                return;
            }
            if (s.equals("QC_OUC"))
            {
                if (((Boolean)obj).booleanValue())
                {
                    stop();
                    _locManager = null;
                    _myProvider = null;
                    _geocoder = null;
                    return;
                } else
                {
                    startStopLocation(QCMeasurement.INSTANCE.getAppContext());
                    return;
                }
            }
        }
    }

    public void setLocationEnabled(boolean flag)
    {
        _locationEnabled = flag;
    }

    void setupLocManager(Context context)
    {
        if (context == null)
        {
            return;
        }
        _locManager = (LocationManager)context.getSystemService("location");
        if (_locManager != null)
        {
            Criteria criteria = new Criteria();
            criteria.setAccuracy(2);
            criteria.setAltitudeRequired(false);
            criteria.setBearingRequired(false);
            criteria.setCostAllowed(false);
            criteria.setPowerRequirement(0);
            criteria.setSpeedRequired(false);
            _myProvider = _locManager.getBestProvider(criteria, true);
            _geocoder = new Geocoder(context);
        }
        QCLog.i(TAG, (new StringBuilder()).append("Setting location provider ").append(_myProvider).toString());
    }

    void start()
    {
        Location location;
        QCLog.i(TAG, "Start retrieving location ");
        location = findBestLocation();
        if (location == null) goto _L2; else goto _L1
_L1:
        sendLocation(location);
_L4:
        return;
_L2:
        if (_myProvider == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        if (!_locManager.isProviderEnabled(_myProvider)) goto _L4; else goto _L3
_L3:
        _locManager.requestLocationUpdates(_myProvider, 0L, 0.0F, singleUpdateListener, Looper.getMainLooper());
        return;
        Exception exception;
        exception;
        QCLog.e(TAG, "Available location provider not found.  Skipping Location Event", exception);
        return;
        QCLog.i(TAG, "Available location provider not found.  Skipping Location Event");
        return;
    }

    void startStopLocation(Context context)
    {
        if (_locationEnabled)
        {
            setupLocManager(context);
            start();
            return;
        } else
        {
            stop();
            _locManager = null;
            _myProvider = null;
            _geocoder = null;
            return;
        }
    }

    void stop()
    {
        if (_locManager != null)
        {
            _locManager.removeUpdates(singleUpdateListener);
            if (_geoTask != null && _geoTask.getStatus() != android.os.AsyncTask.Status.FINISHED)
            {
                _geoTask.cancel(true);
            }
            _geoTask = null;
        }
    }

    static 
    {
        INSTANCE = new QCLocation("INSTANCE", 0);
        $VALUES = (new QCLocation[] {
            INSTANCE
        });
    }





}
