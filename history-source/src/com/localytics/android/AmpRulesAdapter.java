// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.localytics.android:
//            LocalyticsProvider

class AmpRulesAdapter extends BaseAdapter
{

    private List mAmpRules;
    private Context mContext;

    public AmpRulesAdapter(Context context)
    {
        mContext = context;
        mAmpRules = new ArrayList();
    }

    public int getCount()
    {
        return mAmpRules.size();
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public Map getItem(int i)
    {
        return (Map)mAmpRules.get(i);
    }

    public long getItemId(int i)
    {
        return (long)((Integer)((HashMap)mAmpRules.get(i)).get("campaign_id")).intValue();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new LinearLayout(mContext);
            view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            view.setOrientation(0);
            viewgroup = new LinearLayout(mContext);
            viewgroup.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
            viewgroup.setGravity(16);
            viewgroup.setOrientation(1);
            int j = (int)(mContext.getResources().getDisplayMetrics().density * 8F + 0.5F);
            viewgroup.setPadding(j << 1, j, j << 1, j);
            view.addView(viewgroup);
            TextView textview = new TextView(mContext);
            textview.setId(1);
            textview.setTextSize(16F);
            textview.setTextColor(0xff000000);
            TextView textview2 = new TextView(mContext);
            textview2.setId(2);
            textview2.setTextSize(24F);
            textview2.setTextColor(0xff000000);
            viewgroup.addView(textview2);
            viewgroup.addView(textview);
        }
        viewgroup = (TextView)view.findViewById(1);
        TextView textview1 = (TextView)view.findViewById(2);
        viewgroup.setText(String.format("Campaign ID: %d", new Object[] {
            Long.valueOf(getItemId(i))
        }));
        textview1.setText((String)getItem(i).get("rule_name"));
        return view;
    }

    public boolean updateDataSet(LocalyticsProvider localyticsprovider)
    {
        LocalyticsProvider localyticsprovider1;
        LocalyticsProvider localyticsprovider2;
        boolean flag1;
        flag1 = false;
        mAmpRules.clear();
        localyticsprovider2 = null;
        localyticsprovider1 = null;
        localyticsprovider = localyticsprovider.query("amp_rules", null, null, null, "campaign_id");
_L2:
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        if (!localyticsprovider.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        HashMap hashmap = new HashMap();
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("_id", Integer.valueOf(localyticsprovider.getInt(localyticsprovider.getColumnIndexOrThrow("_id"))));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("campaign_id", Integer.valueOf(localyticsprovider.getInt(localyticsprovider.getColumnIndexOrThrow("campaign_id"))));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("expiration", Integer.valueOf(localyticsprovider.getInt(localyticsprovider.getColumnIndexOrThrow("expiration"))));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("display_seconds", Integer.valueOf(localyticsprovider.getInt(localyticsprovider.getColumnIndexOrThrow("display_seconds"))));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("display_session", Integer.valueOf(localyticsprovider.getInt(localyticsprovider.getColumnIndexOrThrow("display_session"))));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("version", localyticsprovider.getString(localyticsprovider.getColumnIndexOrThrow("version")));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("phone_location", localyticsprovider.getString(localyticsprovider.getColumnIndexOrThrow("phone_location")));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("phone_size_width", Integer.valueOf(localyticsprovider.getInt(localyticsprovider.getColumnIndexOrThrow("phone_size_width"))));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("phone_size_height", Integer.valueOf(localyticsprovider.getInt(localyticsprovider.getColumnIndexOrThrow("phone_size_height"))));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("tablet_location", localyticsprovider.getString(localyticsprovider.getColumnIndexOrThrow("tablet_location")));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("tablet_size_width", Integer.valueOf(localyticsprovider.getInt(localyticsprovider.getColumnIndexOrThrow("tablet_size_width"))));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("tablet_size_height", Integer.valueOf(localyticsprovider.getInt(localyticsprovider.getColumnIndexOrThrow("tablet_size_height"))));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("time_to_display", Integer.valueOf(localyticsprovider.getInt(localyticsprovider.getColumnIndexOrThrow("time_to_display"))));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("internet_required", Integer.valueOf(localyticsprovider.getInt(localyticsprovider.getColumnIndexOrThrow("internet_required"))));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("ab_test", localyticsprovider.getString(localyticsprovider.getColumnIndexOrThrow("ab_test")));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("rule_name", localyticsprovider.getString(localyticsprovider.getColumnIndexOrThrow("rule_name")));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("location", localyticsprovider.getString(localyticsprovider.getColumnIndexOrThrow("location")));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        hashmap.put("devices", localyticsprovider.getString(localyticsprovider.getColumnIndexOrThrow("devices")));
        localyticsprovider1 = localyticsprovider;
        localyticsprovider2 = localyticsprovider;
        mAmpRules.add(hashmap);
        if (true) goto _L2; else goto _L1
        localyticsprovider;
        localyticsprovider2 = localyticsprovider1;
        localyticsprovider.printStackTrace();
        boolean flag;
        flag = flag1;
        if (localyticsprovider1 != null)
        {
            localyticsprovider1.close();
            flag = flag1;
        }
_L4:
        return flag;
_L1:
        flag = true;
        if (localyticsprovider == null) goto _L4; else goto _L3
_L3:
        localyticsprovider.close();
        return true;
        localyticsprovider;
        if (localyticsprovider2 != null)
        {
            localyticsprovider2.close();
        }
        throw localyticsprovider;
    }
}
