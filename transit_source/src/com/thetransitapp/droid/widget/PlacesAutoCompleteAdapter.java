// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.support.v4.widget.CursorAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PlacesAutoCompleteAdapter extends CursorAdapter
    implements Filterable
{

    private static final String API_KEY_1 = "AIzaSyDQzN6bZalwK_oAspvs9VUjVC2BSz-tQJE";
    private static final String API_KEY_2 = "AIzaSyAxkB78JcpBz-QrxAu69Vb0qBa1Qt9dtFY";
    private static final String COLUMNS[] = {
        "_id", "suggest_text_1", "suggest_text_2"
    };
    private static final String LOG_TAG = "ExampleApp";
    private static final String OUT_JSON = "/json";
    private static final String PLACES_API_BASE = "https://maps.googleapis.com/maps/api/place";
    private static final String TYPE_AUTOCOMPLETE = "/autocomplete";
    private LatLng current;
    private String currentLocation;
    private LatLng location;
    private int textViewResourceId;

    public PlacesAutoCompleteAdapter(Context context, int i)
    {
        super(context, new MatrixCursor(COLUMNS), true);
        textViewResourceId = i;
        currentLocation = context.getString(0x7f0a0042);
    }

    private MatrixCursor autocomplete(String s)
    {
        String s1;
        String s2;
        String s3;
        char ac[];
        Object obj1;
        Object obj2;
        MatrixCursor matrixcursor;
        StringBuilder stringbuilder;
        matrixcursor = new MatrixCursor(COLUMNS);
        obj1 = null;
        obj2 = null;
        ac = null;
        stringbuilder = new StringBuilder();
        s2 = ac;
        s3 = obj1;
        s1 = obj2;
        StringBuilder stringbuilder1 = new StringBuilder("https://maps.googleapis.com/maps/api/place/autocomplete/json");
        s2 = ac;
        s3 = obj1;
        s1 = obj2;
        int i;
        Object obj;
        if ((new Random()).nextBoolean())
        {
            obj = "AIzaSyDQzN6bZalwK_oAspvs9VUjVC2BSz-tQJE";
        } else
        {
            obj = "AIzaSyAxkB78JcpBz-QrxAu69Vb0qBa1Qt9dtFY";
        }
        s2 = ac;
        s3 = obj1;
        s1 = obj2;
        stringbuilder1.append((new StringBuilder("?sensor=false&key=")).append(((String) (obj))).toString());
        s2 = ac;
        s3 = obj1;
        s1 = obj2;
        stringbuilder1.append((new StringBuilder("&input=")).append(URLEncoder.encode(s, "utf8")).toString());
        s2 = ac;
        s3 = obj1;
        s1 = obj2;
        if (location == null)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        s2 = ac;
        s3 = obj1;
        s1 = obj2;
        stringbuilder1.append("&location=");
        s2 = ac;
        s3 = obj1;
        s1 = obj2;
        stringbuilder1.append(location.latitude);
        s2 = ac;
        s3 = obj1;
        s1 = obj2;
        stringbuilder1.append(",");
        s2 = ac;
        s3 = obj1;
        s1 = obj2;
        stringbuilder1.append(location.longitude);
        s2 = ac;
        s3 = obj1;
        s1 = obj2;
        stringbuilder1.append("&radius=5000");
        s2 = ac;
        s3 = obj1;
        s1 = obj2;
        Log.d("Calling URL", stringbuilder1.toString());
        s2 = ac;
        s3 = obj1;
        s1 = obj2;
        s = (HttpURLConnection)(new URL(stringbuilder1.toString())).openConnection();
        s2 = s;
        s3 = s;
        s1 = s;
        obj = new InputStreamReader(s.getInputStream());
        s2 = s;
        s3 = s;
        s1 = s;
        ac = new char[1024];
_L10:
        s2 = s;
        s3 = s;
        s1 = s;
        i = ((InputStreamReader) (obj)).read(ac);
        if (i != -1) goto _L2; else goto _L1
_L1:
        if (s != null)
        {
            s.disconnect();
        }
        s = new JSONObject(stringbuilder.toString());
        if (!s.optString("status", "").equals("OVER_QUERY_LIMIT")) goto _L4; else goto _L3
_L3:
        matrixcursor.addRow(new String[] {
            "-2", super.mContext.getString(0x7f0a009f), ""
        });
_L8:
        return matrixcursor;
_L2:
        s2 = s;
        s3 = s;
        s1 = s;
        stringbuilder.append(ac, 0, i);
        continue; /* Loop/switch isn't completed */
        s;
        s1 = s2;
        Log.e("ExampleApp", "Error processing Places API URL", s);
        if (s2 != null)
        {
            s2.disconnect();
            return matrixcursor;
        }
        continue; /* Loop/switch isn't completed */
        s;
        s1 = s3;
        Log.e("ExampleApp", "Error connecting to Places API", s);
        if (s3 != null)
        {
            s3.disconnect();
            return matrixcursor;
        }
        continue; /* Loop/switch isn't completed */
        s;
        if (s1 != null)
        {
            s1.disconnect();
        }
        throw s;
_L4:
        s = s.getJSONArray("predictions");
        i = 0;
_L6:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject = s.getJSONObject(i);
        matrixcursor.addRow(new String[] {
            (new StringBuilder(String.valueOf(i))).toString(), jsonobject.getString("description"), jsonobject.getString("reference")
        });
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
        s;
        Log.e("ExampleApp", "Cannot process JSON results", s);
        return matrixcursor;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        int i = cursor.getColumnIndex("_id");
        int j = cursor.getColumnIndex("suggest_text_1");
        view = (TextView)view;
        view.setText(cursor.getString(j));
        view.setTextColor(-1);
        if ("-1".equals(cursor.getString(i)))
        {
            view.setCompoundDrawablesWithIntrinsicBounds(0x7f0200a1, 0, 0, 0);
            return;
        }
        if ("-2".equals(cursor.getString(i)))
        {
            view.setTextColor(0xffa1a1a1);
            return;
        } else
        {
            view.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            return;
        }
    }

    public Filter getFilter()
    {
        return new Filter() {

            final PlacesAutoCompleteAdapter this$0;

            protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
            {
                Object obj;
                Object obj1;
                android.widget.Filter.FilterResults filterresults;
                filterresults = new android.widget.Filter.FilterResults();
                obj1 = null;
                obj = null;
                if (charsequence == null || charsequence.length() == 0) goto _L2; else goto _L1
_L1:
                charsequence = autocomplete(charsequence.toString());
_L4:
                if (charsequence != null)
                {
                    filterresults.values = charsequence;
                    filterresults.count = charsequence.getCount();
                }
                return filterresults;
_L2:
                charsequence = obj;
                if (current != null)
                {
                    charsequence = obj;
                    if (current.latitude != 0.0D)
                    {
                        charsequence = obj1;
                        if (true)
                        {
                            charsequence = new MatrixCursor(PlacesAutoCompleteAdapter.COLUMNS);
                        }
                        charsequence.addRow(new String[] {
                            "-1", currentLocation, (new StringBuilder("my_loc,")).append(currentLocation).append(",").append(current.latitude).append(",").append(current.longitude).toString()
                        });
                    }
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
            {
                swapCursor((Cursor)filterresults.values);
                if (filterresults != null && filterresults.count > 0)
                {
                    notifyDataSetChanged();
                    return;
                } else
                {
                    notifyDataSetInvalidated();
                    return;
                }
            }

            
            {
                this$0 = PlacesAutoCompleteAdapter.this;
                super();
            }
        };
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return LayoutInflater.from(context).inflate(textViewResourceId, viewgroup, false);
    }

    public void setCurrent(LatLng latlng)
    {
        current = latlng;
    }

    public void setLocation(LatLng latlng)
    {
        location = latlng;
    }





}
