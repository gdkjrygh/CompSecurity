// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ubercab.analytics.app.AnalyticsEventListActivity;
import java.util.Map;

public final class chw extends BaseAdapter
{

    final AnalyticsEventListActivity a;

    private chw(AnalyticsEventListActivity analyticseventlistactivity)
    {
        a = analyticseventlistactivity;
        super();
    }

    public chw(AnalyticsEventListActivity analyticseventlistactivity, byte byte0)
    {
        this(analyticseventlistactivity);
    }

    private Map a(int i)
    {
        return (Map)AnalyticsEventListActivity.a(a)[i];
    }

    public final int getCount()
    {
        return AnalyticsEventListActivity.a(a).length;
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = a.getLayoutInflater().inflate(0x1090004, viewgroup, false);
        }
        view = (TextView)view1.findViewById(0x1020014);
        viewgroup = (TextView)view1.findViewById(0x1020015);
        Map map = a(i);
        view.setText(map.get("name").toString());
        viewgroup.setText(map.get("type").toString());
        return view1;
    }
}
