// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.thetransitapp.droid.model.Feed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LegalAdapter extends ArrayAdapter
{

    private Activity activity;

    public LegalAdapter(Context context)
    {
        super(context, 0x7f03001b, new ArrayList());
    }

    public void addAll(Collection collection)
    {
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                return;
            }
            super.add((Feed)collection.next());
        } while (true);
    }

    public View getView(int i, View view, final ViewGroup feed)
    {
        feed = view;
        view = feed;
        if (feed == null)
        {
            view = ((LayoutInflater)super.getContext().getSystemService("layout_inflater")).inflate(0x7f03001b, null);
        }
        feed = (Feed)super.getItem(i);
        TextView textview = (TextView)view.findViewById(0x7f050047);
        TextView textview1 = (TextView)view.findViewById(0x7f050048);
        TextView textview2 = (TextView)view.findViewById(0x7f050049);
        TextView textview3 = (TextView)view.findViewById(0x7f05004a);
        Button button = (Button)view.findViewById(0x7f05004b);
        textview.setText(feed.getName());
        textview1.setText(feed.getLicence());
        if (feed.getUpdatedDate() != null)
        {
            textview2.setVisibility(0);
            textview3.setVisibility(0);
            textview3.setText(DateFormat.getDateFormat(activity).format(feed.getUpdatedDate()));
        } else
        {
            textview2.setVisibility(8);
            textview3.setVisibility(8);
        }
        if (feed.getLicenceUrl() != null)
        {
            button.setVisibility(0);
            button.setOnClickListener(new android.view.View.OnClickListener() {

                final LegalAdapter this$0;
                private final Feed val$feed;

                public void onClick(View view1)
                {
                    view1 = new Intent("android.intent.action.VIEW", Uri.parse(feed.getLicenceUrl()));
                    if (activity != null)
                    {
                        activity.startActivity(view1);
                    }
                }

            
            {
                this$0 = LegalAdapter.this;
                feed = feed1;
                super();
            }
            });
            return view;
        }
        if (feed.getCode().equals("play"))
        {
            button.setVisibility(0);
            button.setOnClickListener(new android.view.View.OnClickListener() {

                final LegalAdapter this$0;

                public void onClick(View view1)
                {
                    view1 = (new android.app.AlertDialog.Builder(getContext())).create();
                    view1.setTitle("Google Play Services");
                    view1.setMessage(GooglePlayServicesUtil.getOpenSourceSoftwareLicenseInfo(getContext()));
                    view1.setButton(-1, getContext().getText(0x7f0a002f), null);
                    view1.show();
                }

            
            {
                this$0 = LegalAdapter.this;
                super();
            }
            });
            return view;
        } else
        {
            button.setVisibility(8);
            return view;
        }
    }

    public void setActivity(Activity activity1)
    {
        activity = activity1;
    }

}
