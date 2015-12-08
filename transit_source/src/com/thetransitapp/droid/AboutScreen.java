// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.crashlytics.android.Crashlytics;
import com.thetransitapp.droid.controller.FeedManager;
import com.thetransitapp.droid.controller.RouteViewController;
import com.thetransitapp.droid.data.TransitDatabaseHelper;
import com.thetransitapp.droid.model.Feed;
import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.model.TransitBundle;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.OpenUDID.OpenUDID_manager;

// Referenced classes of package com.thetransitapp.droid:
//            BaseMapScreen, DebugInfoProvider

public class AboutScreen extends BaseMapScreen
    implements android.view.View.OnClickListener
{

    private TransitDatabaseHelper databaseHelper;
    private FeedManager manager;
    private LinearLayout overlay;
    private Button reviewApp;
    private RouteViewController routeViewController;
    private Button sendFeedback;
    private Button shareApp;
    private Button stayTouch;

    public AboutScreen()
    {
        super(TransitActivity.TransitScreen.ABOUT_SCREEN);
    }

    private boolean createDebugInfo(String s)
    {
        Object obj3;
        NearbyRouteViewModel nearbyrouteviewmodel;
        Object obj1;
        Object obj2;
        Object obj4;
        try
        {
            Object obj = getActivity().getPackageManager().getPackageInfo(getActivity().getPackageName(), 0);
            obj = (new StringBuilder("Transit : ")).append(((PackageInfo) (obj)).versionName).append(" (").append(((PackageInfo) (obj)).versionCode).append(")\n").toString();
            obj2 = android.os.Build.VERSION.RELEASE;
            obj3 = Build.MODEL;
            obj = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(obj))).append("Device : ").append(((String) (obj3))).append("\n").toString()))).append("Android ").append(((String) (obj2))).append("\n").toString()))).append("Identifier ").append(OpenUDID_manager.getOpenUDID()).append("\n").toString();
            obj2 = getActivity().getResources().getDisplayMetrics();
            obj2 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(obj))).append("Screen size ").append(((DisplayMetrics) (obj2)).widthPixels).append("x").append(((DisplayMetrics) (obj2)).heightPixels).append(" (").append(((DisplayMetrics) (obj2)).xdpi).append("x").append(((DisplayMetrics) (obj2)).ydpi).append("dpi) (").append(((DisplayMetrics) (obj2)).densityDpi).append(" android-dpi)\n\n").toString()))).append("Current local time : ").append(new Date()).append("\n").toString();
            obj3 = super.getLastLocation();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(com/thetransitapp/droid/AboutScreen.getSimpleName(), s.getMessage(), s);
            Crashlytics.logException(s);
            return false;
        }
        obj1 = obj2;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        obj1 = (new StringBuilder(String.valueOf(obj2))).append("Pushed location : ").append(((Location) (obj3)).getLatitude()).append(",").append(((Location) (obj3)).getLongitude()).append("\n\n").toString();
        obj1 = (new StringBuilder(String.valueOf(obj1))).append("Local feeds\n").toString();
        obj2 = manager.getClosestBundle().getFeeds().iterator();
_L7:
        if (((Iterator) (obj2)).hasNext()) goto _L2; else goto _L1
_L1:
        obj2 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(obj1))).append("\n").toString()))).append("Last /plan fetches\n").toString()))).append(databaseHelper.getCache("LAST_PLAN_FETCH_KEY")).toString()))).append("\n").toString();
        obj1 = obj2;
        if (routeViewController == null) goto _L4; else goto _L3
_L3:
        obj4 = routeViewController.getDisplayedRoute();
        obj1 = new StringBuilder();
        obj3 = new StringBuilder();
        obj4 = ((List) (obj4)).iterator();
_L8:
        if (((Iterator) (obj4)).hasNext()) goto _L6; else goto _L5
_L5:
        obj1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(obj2))).append("\nVisible routes with real-time: ").append(((StringBuilder) (obj1)).toString()).toString()))).append("\nVisible routes without real-time: ").append(((StringBuilder) (obj3)).toString()).toString();
_L4:
        s = new OutputStreamWriter(new FileOutputStream(s), "UTF-8");
        s.write(((String) (obj1)));
        s.flush();
        s.close();
        return true;
_L2:
        obj3 = (Feed)((Iterator) (obj2)).next();
        obj1 = (new StringBuilder(String.valueOf(obj1))).append(((Feed) (obj3)).getName()).append(" (").append(((Feed) (obj3)).getCode()).append(") \n").toString();
          goto _L7
_L6:
label0:
        {
            nearbyrouteviewmodel = (NearbyRouteViewModel)((Iterator) (obj4)).next();
            if (nearbyrouteviewmodel.getCurrentItinerary() != null && nearbyrouteviewmodel.getCurrentItinerary().isActive() && nearbyrouteviewmodel.getCurrentItinerary().getCurrentScheduleItem() != null)
            {
                if (nearbyrouteviewmodel.getCurrentItinerary().getCurrentScheduleItem().getRealStopTime() == null)
                {
                    break label0;
                }
                if (((StringBuilder) (obj1)).length() > 0)
                {
                    ((StringBuilder) (obj1)).append(",");
                }
                ((StringBuilder) (obj1)).append(nearbyrouteviewmodel.getShortName());
            }
        }
          goto _L8
        if (((StringBuilder) (obj3)).length() > 0)
        {
            ((StringBuilder) (obj3)).append(", ");
        }
        ((StringBuilder) (obj3)).append(nearbyrouteviewmodel.getShortName());
          goto _L8
    }

    private String getStringWithPackage(int i)
    {
        return getString(i, new Object[] {
            getString(0x7f0a0069)
        });
    }

    public void onClick(View view)
    {
        if (view != reviewApp)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        view = new Intent("android.intent.action.VIEW");
        view.setData(Uri.parse(getStringWithPackage(0x7f0a006a)));
        startActivity(view);
_L1:
        return;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        view.setData(Uri.parse(getStringWithPackage(0x7f0a006b)));
        try
        {
            startActivity(view);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Toast.makeText(super.getActivity(), 0x7f0a0062, 0).show();
        }
        return;
        if (view == sendFeedback)
        {
            view = new Intent("android.intent.action.SEND");
            view.setType("message/rfc822");
            view.putExtra("android.intent.extra.EMAIL", new String[] {
                getString(0x7f0a0068)
            });
            view.putExtra("android.intent.extra.SUBJECT", getString(0x7f0a0065, new Object[] {
                getString(0x7f0a002b)
            }));
            String s = DebugInfoProvider.getDebugInfoPath(getActivity());
            if (s != null && createDebugInfo(s))
            {
                view.putExtra("android.intent.extra.STREAM", Uri.parse("content://com.thetransitapp.droid/Debugging_info.txt"));
            }
            startActivity(Intent.createChooser(view, "Send via"));
            return;
        }
        if (view == shareApp)
        {
            view = manager.getShareMessage();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", getString(0x7f0a002e));
            intent.putExtra("android.intent.extra.TEXT", view);
            startActivity(Intent.createChooser(intent, "Share via"));
            return;
        }
          goto _L1
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        overlay.setOnTouchListener(new android.view.View.OnTouchListener() {

            final AboutScreen this$0;

            public boolean onTouch(View view1, MotionEvent motionevent)
            {
                return true;
            }

            
            {
                this$0 = AboutScreen.this;
                super();
            }
        });
        sendFeedback.setOnClickListener(this);
        reviewApp.setOnClickListener(this);
        shareApp.setOnClickListener(this);
        stayTouch.setOnClickListener(this);
    }
}
