// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package net.hockeyapp.android:
//            UpdateInfoListener

public class UpdateInfoAdapter extends BaseAdapter
{

    Activity activity;
    UpdateInfoListener listener;
    JSONObject newest;
    ArrayList sortedVersions;

    public UpdateInfoAdapter(Activity activity1, String s, UpdateInfoListener updateinfolistener)
    {
        activity = activity1;
        listener = updateinfolistener;
        loadVersions(s);
        sortVersions();
    }

    private static int failSafeGetIntFromJSON(JSONObject jsonobject, String s, int i)
    {
        int j;
        try
        {
            j = jsonobject.getInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return i;
        }
        return j;
    }

    private static String failSafeGetStringFromJSON(JSONObject jsonobject, String s, String s1)
    {
        try
        {
            jsonobject = jsonobject.getString(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return s1;
        }
        return jsonobject;
    }

    private View getSimpleView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag = true;
        View view1 = view;
        if (!(view instanceof TextView))
        {
            view1 = activity.getLayoutInflater().inflate(0x1090003, viewgroup, false);
        }
        view = (String)getItem(i);
        viewgroup = (TextView)view1.findViewById(0x1020014);
        float f = activity.getResources().getDisplayMetrics().density;
        int j;
        int k;
        if (i == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j = (int)(20F * f);
        k = (int)(20F * f);
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        viewgroup.setPadding(j * 1, i * k, (int)(20F * f), 0);
        viewgroup.setText(view);
        viewgroup.setTextColor(0xff000000);
        viewgroup.setTextSize(2, 16F);
        return view1;
    }

    private View getWebView(int i, View view, ViewGroup viewgroup)
    {
label0:
        {
            viewgroup = view;
            if (view != null)
            {
                view = viewgroup;
                if (viewgroup.findViewById(1337) != null)
                {
                    break label0;
                }
            }
            viewgroup = new RelativeLayout(activity);
            viewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            view = viewgroup;
            WebView webview = new WebView(activity);
            webview.setId(1337);
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            float f = activity.getResources().getDisplayMetrics().density;
            layoutparams.setMargins((int)(20F * f) * 1, (int)(0.0F * f), (int)(20F * f), 0);
            webview.setLayoutParams(layoutparams);
            viewgroup.addView(webview);
        }
        viewgroup = (WebView)view.findViewById(1337);
        String s = (String)getItem(i);
        if (s.trim().length() == 0)
        {
            viewgroup.loadData("<em>No information.</em>", "text/html", "utf-8");
            return view;
        } else
        {
            viewgroup.loadData(s, "text/html", "utf-8");
            return view;
        }
    }

    private void loadVersions(String s)
    {
        newest = new JSONObject();
        int j;
        s = new JSONArray(s);
        sortedVersions = new ArrayList();
        j = listener.getCurrentVersionCode();
        int i = 0;
_L1:
        JSONObject jsonobject;
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_107;
        }
        jsonobject = s.getJSONObject(i);
        int k = j;
        if (jsonobject.getInt("version") > j)
        {
            newest = jsonobject;
            k = jsonobject.getInt("version");
        }
        sortedVersions.add(jsonobject);
        i++;
        j = k;
          goto _L1
        s;
    }

    private void sortVersions()
    {
        Collections.sort(sortedVersions, new Comparator() {

            final UpdateInfoAdapter this$0;

            public final volatile int compare(Object obj, Object obj1)
            {
                return compare((JSONObject)obj, (JSONObject)obj1);
            }

            public final int compare(JSONObject jsonobject, JSONObject jsonobject1)
            {
                int i;
                int j;
                try
                {
                    i = jsonobject.getInt("version");
                    j = jsonobject1.getInt("version");
                }
                // Misplaced declaration of an exception variable
                catch (JSONObject jsonobject)
                {
                    return 0;
                }
                if (i <= j);
                return 0;
            }

            
            {
                this$0 = UpdateInfoAdapter.this;
                super();
            }
        });
    }

    public int getCount()
    {
        return sortedVersions.size() * 2;
    }

    public String getFileInfoString()
    {
        int i = failSafeGetIntFromJSON(newest, "appsize", 0);
        Date date = new Date(1000L * (long)failSafeGetIntFromJSON(newest, "timestamp", 0));
        SimpleDateFormat simpledateformat = new SimpleDateFormat("dd.MM.yyyy");
        return (new StringBuilder()).append(simpledateformat.format(date)).append(" - ").append(String.format("%.2f", new Object[] {
            Float.valueOf((float)i / 1024F / 1024F)
        })).append(" MB").toString();
    }

    public Object getItem(int i)
    {
        String s;
        JSONObject jsonobject;
        int j;
        int l;
        l = listener.getCurrentVersionCode();
        jsonobject = (JSONObject)sortedVersions.get(i / 2);
        j = 0;
        s = "";
        int k = jsonobject.getInt("version");
        j = k;
        String s1 = jsonobject.getString("shortversion");
        s = s1;
        j = k;
_L2:
        switch (i % 2)
        {
        default:
            return null;

        case 0: // '\0'
            if (i == 0)
            {
                return "Release Notes:";
            }
            StringBuilder stringbuilder = (new StringBuilder("Version ")).append(s).append(" (").append(j).append("): ");
            if (j == l)
            {
                s = "[INSTALLED]";
            } else
            {
                s = "";
            }
            return stringbuilder.append(s).toString();

        case 1: // '\001'
            return failSafeGetStringFromJSON(jsonobject, "notes", "");
        }
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public long getItemId(int i)
    {
        return (long)(new Integer(i)).hashCode();
    }

    public String getVersionString()
    {
        return (new StringBuilder()).append(failSafeGetStringFromJSON(newest, "shortversion", "")).append(" (").append(failSafeGetStringFromJSON(newest, "version", "")).append(")").toString();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        switch (i % 2)
        {
        default:
            return null;

        case 0: // '\0'
            return getSimpleView(i, view, viewgroup);

        case 1: // '\001'
            return getWebView(i, view, viewgroup);
        }
    }
}
