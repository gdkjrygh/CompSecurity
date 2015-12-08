// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.view;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.utils.Utils;
import java.util.HashMap;

public class AssetVideoButton extends RelativeLayout
{

    private String TAG;
    private HistoryHereApplication app;
    private Button assetButton;
    private String assetId;
    private String body;
    private ProgressDialog dialog;
    private RelativeLayout layout;
    private Context mContext;
    private String poiId;
    private String poiTitle;
    private String title;
    private TextView titleTextView;
    private String type;

    public AssetVideoButton(Context context, String s, String s1, String s2, String s3, String s4, String s5)
    {
        super(context);
        TAG = getClass().getSimpleName();
        Utils.logger(TAG, "AssetVideoButton()");
        assetId = s;
        title = s1;
        type = s2;
        body = s3;
        poiId = s4;
        poiTitle = s5;
        mContext = context;
        app = (HistoryHereApplication)mContext.getApplicationContext();
        layout = new RelativeLayout(context);
        context = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f03001b, layout);
        titleTextView = (TextView)context.findViewById(0x7f0a0056);
        titleTextView.setText(title);
        assetButton = (Button)context.findViewById(0x7f0a0057);
        assetButton.setOnClickListener(new android.view.View.OnClickListener() {

            final AssetVideoButton this$0;

            public void onClick(View view)
            {
                Utils.logger(TAG, "clicked on the bubble");
                openContent();
            }

            
            {
                this$0 = AssetVideoButton.this;
                super();
            }
        });
        addView(layout);
    }

    private boolean isVideo()
    {
        return type.equalsIgnoreCase("video_mp4_pd_uri");
    }

    private void openContent()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("assetId", assetId);
        hashmap.put("assetTitle", title);
        hashmap.put("assetType", type);
        hashmap.put("poiId", poiId);
        hashmap.put("poiTitle", poiTitle);
        Utils.logger(TAG, (new StringBuilder()).append("openContent: *").append(body).append("*").toString());
        Utils.logger(TAG, (new StringBuilder()).append("type: *").append(type).append("*").toString());
        if (isVideo())
        {
            Utils.logger(TAG, (new StringBuilder()).append("isVideo: *").append(body).append("*").toString());
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(body), "video/*");
            mContext.startActivity(intent);
        }
    }

    public void hideMessageBox()
    {
        Utils.logger(TAG, "hideMessageBox");
        dialog.dismiss();
    }

    public void showMessageBox(Context context, String s)
    {
        Utils.logger(TAG, "showMessageBox");
        dialog = ProgressDialog.show(mContext, "", s, true);
    }


}
