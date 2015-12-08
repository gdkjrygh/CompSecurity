// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.ads.AdView;
import com.scannerfire.utils.EncodeUtils;
import com.scannerfire.utils.Utils;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class CreateGps extends SherlockActivity
{
    public class MyCurrentLocationListener
        implements LocationListener
    {

        EditText lat;
        EditText lon;
        final CreateGps this$0;

        public void onLocationChanged(Location location)
        {
            lat.setText(Double.toString(location.getLatitude()));
            lon.setText(Double.toString(location.getLongitude()));
            prog.dismiss();
        }

        public void onProviderDisabled(String s)
        {
        }

        public void onProviderEnabled(String s)
        {
        }

        public void onStatusChanged(String s, int i, Bundle bundle)
        {
        }

        MyCurrentLocationListener(EditText edittext, EditText edittext1)
        {
            this$0 = CreateGps.this;
            super();
            lat = edittext;
            lon = edittext1;
        }
    }


    protected static final int PICK_CONTACT = 0;
    Activity activity;
    EditText address;
    Button current;
    Button encode;
    private Geocoder geoCoder;
    EditText lat;
    MyCurrentLocationListener locationListener;
    LocationManager locationManager;
    EditText lon;
    Button maps;
    Button pick;
    ProgressDialog prog;
    ImageButton search;

    public CreateGps()
    {
    }

    private void showGPSDisabledAlertToUser()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setMessage(0x7f080106).setCancelable(false).setPositiveButton(0x7f080107, new android.content.DialogInterface.OnClickListener() {

            final CreateGps this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                startActivity(dialoginterface);
            }

            
            {
                this$0 = CreateGps.this;
                super();
            }
        });
        builder.setNegativeButton(0x7f0800b7, new android.content.DialogInterface.OnClickListener() {

            final CreateGps this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

            
            {
                this$0 = CreateGps.this;
                super();
            }
        });
        builder.create().show();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        i;
        JVM INSTR tableswitch 0 0: default 28
    //                   0 29;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (j == -1 && (intent = managedQuery(intent.getData(), null, null, null, null)).moveToFirst())
        {
            try
            {
                intent = intent.getString(intent.getColumnIndex("data1"));
                Log.d("", (new StringBuilder("Address ->")).append(intent).toString());
                address.setText(intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030024);
        activity = this;
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(0x7f0800cd);
        bundle.setHomeButtonEnabled(true);
        ((AdView)findViewById(0x7f0d0061)).loadAd((new com.google.android.gms.ads.AdRequest.Builder()).build());
        geoCoder = new Geocoder(this, Locale.getDefault());
        address = (EditText)findViewById(0x7f0d0086);
        lon = (EditText)findViewById(0x7f0d0088);
        lat = (EditText)findViewById(0x7f0d0089);
        search = (ImageButton)findViewById(0x7f0d0087);
        encode = (Button)findViewById(0x7f0d0079);
        current = (Button)findViewById(0x7f0d008a);
        maps = (Button)findViewById(0x7f0d008b);
        pick = (Button)findViewById(0x7f0d0078);
        search.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateGps this$0;

            public void onClick(View view)
            {
                if (locationManager != null && locationListener != null)
                {
                    locationManager.removeUpdates(locationListener);
                }
                lat.setText("");
                lon.setText("");
                if (address.getText().length() == 0)
                {
                    Utils.showToastNotification(activity, getString(0x7f0800fe));
                    return;
                }
                if (!(new Utils()).checkConnectivity(activity))
                {
                    Utils.showToastNotification(activity, getString(0x7f0800ff));
                    return;
                }
                view = (Address)geoCoder.getFromLocationName(address.getText().toString(), 1).get(0);
                if (view.hasLongitude() && view.hasLatitude())
                {
                    double d = view.getLongitude();
                    double d1 = view.getLatitude();
                    lon.setText(Double.toString(d));
                    lat.setText(Double.toString(d1));
                    return;
                }
                try
                {
                    Utils.showToastNotification(activity, getString(0x7f080100));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    Utils.showToastNotification(activity, getString(0x7f080101));
                    view.printStackTrace();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    Utils.showToastNotification(activity, getString(0x7f080100));
                }
                view.printStackTrace();
                return;
            }

            
            {
                this$0 = CreateGps.this;
                super();
            }
        });
        encode.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateGps this$0;

            public void onClick(View view)
            {
                if (lon.getText().length() == 0 || lat.getText().length() == 0)
                {
                    Utils.showToastNotification(activity, getString(0x7f080102));
                    return;
                }
                view = new EncodeUtils(CreateGps.this);
                String s = lat.getText().toString();
                String s1 = lon.getText().toString();
                if (s.matches("-?[0-9]?[0-9][.][0-9]+") && s1.matches("-?[0-9]?[0-9]?[0-9][.][0-9]+"))
                {
                    view.start((new StringBuilder("geo:")).append(s).append(",").append(s1).toString(), (new StringBuilder(String.valueOf(s))).append(",").append(s1).toString());
                    return;
                } else
                {
                    Utils.showToastNotification(activity, getString(0x7f080103));
                    return;
                }
            }

            
            {
                this$0 = CreateGps.this;
                super();
            }
        });
        current.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateGps this$0;

            public void onClick(View view)
            {
                address.setText("");
                locationManager = (LocationManager)getSystemService("location");
                locationListener = new MyCurrentLocationListener(lat, lon);
                if (!locationManager.isProviderEnabled("gps"))
                {
                    showGPSDisabledAlertToUser();
                    return;
                } else
                {
                    view = new Utils();
                    prog = view.showProgress(activity, getString(0x7f080104), getString(0x7f0800f9));
                    prog.setCancelable(true);
                    locationManager.requestLocationUpdates("gps", 0L, 0.0F, locationListener);
                    locationManager.requestLocationUpdates("network", 0L, 0.0F, locationListener);
                    Log.d("", "CHECKPOINT");
                    return;
                }
            }

            
            {
                this$0 = CreateGps.this;
                super();
            }
        });
        maps.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateGps this$0;

            public void onClick(View view)
            {
                if (lon.getText().length() == 0 || lat.getText().length() == 0)
                {
                    Utils.showToastNotification(activity, getString(0x7f080102));
                    return;
                }
                String s = lat.getText().toString();
                String s1 = lon.getText().toString();
                if (s.matches("-?[0-9]?[0-9][.][0-9]+") && s1.matches("-?[0-9]?[0-9]?[0-9][.][0-9]+"))
                {
                    String s2;
                    if (address.getText().length() == 0)
                    {
                        view = getString(0x7f080105);
                    } else
                    {
                        view = address.getText().toString();
                    }
                    s2 = (new StringBuilder("geo:")).append(s).append(",").append(s1).toString();
                    view = Uri.encode((new StringBuilder(String.valueOf(s))).append(",").append(s1).append("(").append(view).append(")").toString());
                    view = Uri.parse((new StringBuilder(String.valueOf(s2))).append("?q=").append(view).append("&z=16").toString());
                    startActivity(new Intent("android.intent.action.VIEW", view));
                    return;
                } else
                {
                    Utils.showToastNotification(activity, getString(0x7f080103));
                    return;
                }
            }

            
            {
                this$0 = CreateGps.this;
                super();
            }
        });
        pick.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateGps this$0;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.PICK");
                view.setType("vnd.android.cursor.dir/postal-address_v2");
                startActivityForResult(view, 0);
            }

            
            {
                this$0 = CreateGps.this;
                super();
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        finish();
        return true;
    }


}
