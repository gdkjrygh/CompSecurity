// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.dialogs.NoInternetDialogFragment;
import com.aetn.history.android.historyhere.model.Configuration;
import com.aetn.history.android.historyhere.model.LocationManager;
import com.aetn.history.android.historyhere.utils.ConnectionManager;
import com.aetn.history.android.historyhere.utils.Signing;
import com.aetn.history.android.historyhere.utils.Utils;
import com.localytics.android.LocalyticsAmpSession;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class SuggestActivity extends FragmentActivity
{
    class AddressLookupTask extends AsyncTask
    {

        final SuggestActivity this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient List doInBackground(String as[])
        {
            List list1 = null;
            int i = 0;
            List list = list1;
            Geocoder geocoder;
            int j;
            try
            {
                geocoder = new Geocoder(mContext);
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                Utils.logger("SuggestActivity", (new StringBuilder()).append("AddressLookupTask: IOException: ").append(as).toString());
                as.printStackTrace();
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                Utils.logger("SuggestActivity", (new StringBuilder()).append("AddressLookupTask: Exception: ").append(as).toString());
                as.printStackTrace();
                return list;
            }
            list = list1;
            Utils.logger("SuggestActivity", (new StringBuilder()).append("the geocoder: ").append(geocoder).toString());
            list = list1;
            list1 = geocoder.getFromLocationName(as[0], 1);
            list = list1;
            Utils.logger("SuggestActivity", (new StringBuilder()).append("AddressLookupTask: ").append(list1).toString());
            list = list1;
_L2:
            list1 = list;
            j = i;
            if (list != null)
            {
                break; /* Loop/switch isn't completed */
            }
            list1 = geocoder.getFromLocationName(as[0], 1);
            j = i + 1;
            list = list1;
            i = j;
            if (j != 10) goto _L2; else goto _L1
_L1:
            list = list1;
            Utils.logger("SuggestActivity", (new StringBuilder()).append("AddressLookupTask -- the address is: ").append(as[0]).toString());
            list = list1;
            Utils.logger("SuggestActivity", (new StringBuilder()).append("AddressLookupTask -- request #: ").append(j).toString());
            return list1;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((List)obj);
        }

        protected void onPostExecute(List list)
        {
            Utils.logger("SuggestActivity", "AddressLookupTask:onPostExecute()");
            if (list != null && list.size() >= 1) goto _L2; else goto _L1
_L1:
            Utils.logger("SuggestActivity", "AddressLookupTask:onPostExecute: geocoderError: so set the location to 0.0|0.0 ");
            mSuggestionData.lat = 0.0D;
            mSuggestionData.lng = 0.0D;
_L5:
            doPostSuggestion();
            return;
_L2:
            Double double1;
            Object obj;
            boolean flag;
            obj = (Address)list.get(0);
            Utils.logger("SuggestActivity", (new StringBuilder()).append("AddressLookupTask:onPostExecute: firstAddress: ").append(obj).toString());
            list = Double.valueOf(((Address) (obj)).getLatitude());
            double1 = Double.valueOf(((Address) (obj)).getLongitude());
            flag = false;
            obj = ((Address) (obj)).getCountryCode();
            if (obj != null) goto _L4; else goto _L3
_L3:
            flag = true;
_L6:
            if (flag)
            {
                Utils.logger("SuggestActivity", "AddressLookupTask:onPostExecute: searchError: so set the location to 0.0|0.0 ");
                mSuggestionData.lat = 0.0D;
                mSuggestionData.lng = 0.0D;
            } else
            {
                Utils.logger("SuggestActivity", "AddressLookupTask:onPostExecute: success: ");
                mSuggestionData.lat = list.doubleValue();
                mSuggestionData.lng = double1.doubleValue();
                Utils.logger("SuggestActivity", (new StringBuilder()).append("AddressLookupTask:onPostExecute: lat: ").append(list).toString());
                Utils.logger("SuggestActivity", (new StringBuilder()).append("AddressLookupTask:onPostExecute: lng:: ").append(double1).toString());
            }
            if (true) goto _L5; else goto _L4
_L4:
            if (!((String) (obj)).equalsIgnoreCase("US"))
            {
                flag = true;
            }
              goto _L6
        }

        protected transient void onProgressUpdate(Integer ainteger[])
        {
            super.onProgressUpdate(ainteger);
        }

        protected volatile void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Integer[])aobj);
        }

        AddressLookupTask()
        {
            this$0 = SuggestActivity.this;
            super();
        }
    }

    private class PostSuggestionTask extends AsyncTask
    {

        final SuggestActivity this$0;

        protected transient Boolean doInBackground(SuggestionData asuggestiondata[])
        {
            int i = asuggestiondata.length;
            i = Math.round((new Date()).getTime() / 1000L);
            Object obj = asuggestiondata[0];
            Object obj1 = Signing.signRequestForSuggestAPlaceService(HistoryHereApplication.getConfiguration().suggestServiceHost, "/v1/suggestaplace/create?", "hh_android_3", "nd78tYq6e4", i);
            Utils.logger("SuggestActivity", (new StringBuilder()).append("PostSuggestionTask():finalRequestString: ").append(((String) (obj1))).toString());
            asuggestiondata = new DefaultHttpClient();
            HttpConnectionParams.setConnectionTimeout(asuggestiondata.getParams(), 10000);
            JSONObject jsonobject = new JSONObject();
            try
            {
                obj1 = new HttpPost(((String) (obj1)));
                jsonobject.put("lat", ((SuggestionData) (obj)).lat);
                jsonobject.put("lng", ((SuggestionData) (obj)).lat);
                jsonobject.put("placeName", ((SuggestionData) (obj)).placeName);
                jsonobject.put("address", ((SuggestionData) (obj)).address);
                jsonobject.put("city", ((SuggestionData) (obj)).city);
                jsonobject.put("state", ((SuggestionData) (obj)).state);
                jsonobject.put("zip", ((SuggestionData) (obj)).zip);
                jsonobject.put("historicalSignificance", ((SuggestionData) (obj)).historicalSignificance);
                obj = new StringEntity(jsonobject.toString());
                Utils.logger("SuggestActivity", (new StringBuilder()).append("PostSuggestionTask():json.toString(): ").append(jsonobject.toString()).toString());
                ((StringEntity) (obj)).setContentType(new BasicHeader("Content-Type", "application/json"));
                ((HttpPost) (obj1)).setEntity(((org.apache.http.HttpEntity) (obj)));
                asuggestiondata = asuggestiondata.execute(((org.apache.http.client.methods.HttpUriRequest) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (SuggestionData asuggestiondata[])
            {
                asuggestiondata.printStackTrace();
                Utils.logger("SuggestActivity", "PostSuggestionTask():ERROR: ");
                return Boolean.valueOf(false);
            }
            if (asuggestiondata == null)
            {
                break MISSING_BLOCK_LABEL_360;
            }
            asuggestiondata = EntityUtils.toString(asuggestiondata.getEntity(), "UTF-8");
            Log.i("SuggestActivity", (new StringBuilder()).append("sendJson() response:").append(asuggestiondata).toString());
            if (asuggestiondata.indexOf("OK") > -1)
            {
                Utils.logger("SuggestActivity", "PostSuggestionTask():SUCCESS: ");
                return Boolean.valueOf(true);
            }
            Utils.logger("SuggestActivity", "PostSuggestionTask():OOPS: ");
            return Boolean.valueOf(false);
            return Boolean.valueOf(true);
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((SuggestionData[])aobj);
        }

        protected void onPostExecute(Boolean boolean1)
        {
            if (boolean1.booleanValue())
            {
                Utils.logger("SuggestActivity", "PostSuggestionTask():onPostExecute:TRUE -- show success message: ");
                setSuccessMessage();
                localyticsSession.tagEvent("Submit Suggestion");
                return;
            } else
            {
                Utils.logger("SuggestActivity", "PostSuggestionTask():onPostExecute:TRUE -- show error message: ");
                setGenericErrorMessage();
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Boolean)obj);
        }

        protected transient void onProgressUpdate(Integer ainteger[])
        {
        }

        protected volatile void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Integer[])aobj);
        }

        private PostSuggestionTask()
        {
            this$0 = SuggestActivity.this;
            super();
        }

    }

    public class SuggestionData
    {

        public String address;
        public String city;
        public String historicalSignificance;
        public double lat;
        public double lng;
        public String placeName;
        public String state;
        final SuggestActivity this$0;
        public String zip;

        public String getAddressForSearch()
        {
            return (new StringBuilder()).append(address).append(" ").append(city).append(" ").append(state).append(" ").append(zip).toString();
        }

        public SuggestionData()
        {
            this$0 = SuggestActivity.this;
            super();
            lat = 0.0D;
            lng = 0.0D;
            placeName = "";
            address = "";
            city = "";
            state = "";
            zip = "";
            historicalSignificance = "";
        }
    }


    private static final String TAG = "SuggestActivity";
    private LocalyticsAmpSession localyticsSession;
    private EditText mAddress;
    private EditText mCity;
    private Context mContext;
    private EditText mDescription;
    private Location mLocation;
    private Button mOk;
    private TextView mOr;
    private EditText mPlaceName;
    private EditText mState;
    private Button mSubmit;
    private ViewGroup mSuggestPrompt;
    private TextView mSuggestPromptText;
    private TextView mSuggestPromptTitle;
    private SuggestionData mSuggestionData;
    private Button mUseLocation;
    private Location mUsersLocation;
    private EditText mZip;

    public SuggestActivity()
    {
    }

    private String checkForErrors()
    {
        String s = "";
        if (mPlaceName.getText().toString().isEmpty())
        {
            s = (new StringBuilder()).append("").append(getResources().getString(0x7f0d0073)).toString();
        }
        String s1 = s;
        if (mState.getText().toString().isEmpty())
        {
            s1 = (new StringBuilder()).append(s).append(getResources().getString(0x7f0d0074)).toString();
        }
        return s1;
    }

    private void doPostSuggestion()
    {
        if (!ConnectionManager.isNetworkAvailable(mContext))
        {
            (new NoInternetDialogFragment()).show(getSupportFragmentManager(), "NoInternetDialogFragment");
            return;
        } else
        {
            (new PostSuggestionTask()).execute(new SuggestionData[] {
                mSuggestionData
            });
            return;
        }
    }

    private void setErrorMessage(String s)
    {
        mSuggestPromptTitle.setText(getResources().getString(0x7f0d0077));
        mSuggestPromptText.setText(s);
        mSuggestPrompt.setVisibility(0);
        mOk.setOnClickListener(new android.view.View.OnClickListener() {

            final SuggestActivity this$0;

            public void onClick(View view)
            {
                mSuggestPrompt.setVisibility(8);
            }

            
            {
                this$0 = SuggestActivity.this;
                super();
            }
        });
    }

    private void setGenericErrorMessage()
    {
        mSuggestPromptTitle.setText(getResources().getString(0x7f0d0077));
        mSuggestPromptText.setText(getResources().getString(0x7f0d0076));
        mSuggestPrompt.setVisibility(0);
        mOk.setOnClickListener(new android.view.View.OnClickListener() {

            final SuggestActivity this$0;

            public void onClick(View view)
            {
                mSuggestPrompt.setVisibility(8);
            }

            
            {
                this$0 = SuggestActivity.this;
                super();
            }
        });
    }

    private void setListeners()
    {
        mUseLocation.setOnClickListener(new android.view.View.OnClickListener() {

            final SuggestActivity this$0;

            public void onClick(View view)
            {
                view = LocationManager.getInstance(mContext).getUsersAddress();
                mLocation = LocationManager.getInstance(mContext).getUsersLocation();
                if (view != null)
                {
                    mAddress.setText(view.getAddressLine(0));
                    mCity.setText(view.getLocality());
                    mState.setText(view.getAdminArea());
                    mZip.setText(view.getPostalCode());
                }
            }

            
            {
                this$0 = SuggestActivity.this;
                super();
            }
        });
        mSubmit.setOnClickListener(new android.view.View.OnClickListener() {

            final SuggestActivity this$0;

            public void onClick(View view)
            {
                view = (InputMethodManager)mContext.getSystemService("input_method");
                view.hideSoftInputFromWindow(mPlaceName.getWindowToken(), 0);
                view.hideSoftInputFromWindow(mAddress.getWindowToken(), 0);
                view.hideSoftInputFromWindow(mCity.getWindowToken(), 0);
                view.hideSoftInputFromWindow(mState.getWindowToken(), 0);
                view.hideSoftInputFromWindow(mZip.getWindowToken(), 0);
                view.hideSoftInputFromWindow(mDescription.getWindowToken(), 0);
                view = checkForErrors();
                if (view.isEmpty())
                {
                    mSuggestionData = new SuggestionData();
                    mSuggestionData.placeName = mPlaceName.getText().toString();
                    mSuggestionData.address = mAddress.getText().toString();
                    mSuggestionData.city = mCity.getText().toString();
                    mSuggestionData.state = mState.getText().toString();
                    mSuggestionData.zip = mZip.getText().toString();
                    mSuggestionData.historicalSignificance = mDescription.getText().toString();
                    (new AddressLookupTask()).execute(new String[] {
                        mSuggestionData.getAddressForSearch()
                    });
                    return;
                } else
                {
                    setErrorMessage(view);
                    return;
                }
            }

            
            {
                this$0 = SuggestActivity.this;
                super();
            }
        });
    }

    private void setSuccessMessage()
    {
        mSuggestPrompt.setVisibility(0);
        mSuggestPromptTitle.setText(getResources().getString(0x7f0d0079));
        mSuggestPromptText.setText(getResources().getString(0x7f0d0078));
        mOk.setOnClickListener(new android.view.View.OnClickListener() {

            final SuggestActivity this$0;

            public void onClick(View view)
            {
                finish();
            }

            
            {
                this$0 = SuggestActivity.this;
                super();
            }
        });
    }

    protected void onCreate(Bundle bundle)
    {
        String s;
        String s1;
        super.onCreate(bundle);
        setContentView(0x7f03004e);
        mContext = this;
        mPlaceName = (EditText)findViewById(0x7f0a00d6);
        mAddress = (EditText)findViewById(0x7f0a0064);
        mCity = (EditText)findViewById(0x7f0a00d5);
        mState = (EditText)findViewById(0x7f0a00d9);
        mZip = (EditText)findViewById(0x7f0a00da);
        mDescription = (EditText)findViewById(0x7f0a0065);
        mUseLocation = (Button)findViewById(0x7f0a00d7);
        mSubmit = (Button)findViewById(0x7f0a00db);
        mOr = (TextView)findViewById(0x7f0a00d8);
        mSuggestPrompt = (ViewGroup)findViewById(0x7f0a00dc);
        mSuggestPromptTitle = (TextView)findViewById(0x7f0a00dd);
        mSuggestPromptText = (TextView)findViewById(0x7f0a00de);
        mOk = (Button)findViewById(0x7f0a0071);
        mSuggestPrompt.setVisibility(8);
        mUsersLocation = LocationManager.getInstance(this).getUsersLocation();
        if (mUsersLocation == null)
        {
            mUseLocation.setVisibility(8);
            mOr.setVisibility(8);
        }
        localyticsSession = new LocalyticsAmpSession(getApplicationContext(), ((HistoryHereApplication)getApplication()).getLocalyticsKey());
        bundle = getIntent().getExtras();
        s = "";
        s1 = "";
        if (bundle != null)
        {
            s = bundle.getString("called_from");
        }
        bundle = s1;
        if (s.isEmpty()) goto _L2; else goto _L1
_L1:
        if (!s.equalsIgnoreCase("map")) goto _L4; else goto _L3
_L3:
        bundle = "HH:Places:Suggest";
_L2:
        Utils.logger("SuggestActivity", (new StringBuilder()).append("tag screen from: ").append(bundle).toString());
        localyticsSession.open();
        localyticsSession.tagScreen(bundle);
        localyticsSession.upload();
        setListeners();
        return;
_L4:
        bundle = s1;
        if (s.equalsIgnoreCase("more"))
        {
            bundle = "HH:Suggest";
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void onPause()
    {
        if (localyticsSession != null)
        {
            localyticsSession.detach();
            localyticsSession.close();
            localyticsSession.upload();
        }
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        localyticsSession.open();
        localyticsSession.upload();
        localyticsSession.attach(this);
    }




/*
    static Location access$102(SuggestActivity suggestactivity, Location location)
    {
        suggestactivity.mLocation = location;
        return location;
    }

*/















/*
    static SuggestionData access$902(SuggestActivity suggestactivity, SuggestionData suggestiondata)
    {
        suggestactivity.mSuggestionData = suggestiondata;
        return suggestiondata;
    }

*/
}
