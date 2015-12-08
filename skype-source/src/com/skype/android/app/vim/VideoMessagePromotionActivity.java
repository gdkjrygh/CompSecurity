// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.Navigation;
import com.skype.android.media.CameraView;
import com.skype.android.media.ScaleMode;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;

public class VideoMessagePromotionActivity extends SkypeActivity
{

    public static final String EXTRA_CONTACT_NAME = "contactName";
    public static final int VIDEO_MESSAGE_PROMOTION_REQUEST_NO = 0;
    public static final int VIDEO_MESSAGE_PROMOTION_REQUEST_OK = 1;
    private final String TAG = "VideoMessagePromotionActivity";
    Analytics analytics;
    CameraView cameraPreview;
    private Contact contact;
    ContactUtil contactUtil;
    ConversationUtil conversationUtil;
    TextView mNoThanksTextView;
    Button mOkButton;
    Navigation navigation;

    public VideoMessagePromotionActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        setRequestedOrientation(1);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        super.onCreate(bundle);
        getComponent().inject(this);
        bundle = getIntent().getExtras().getString("contactName");
        bundle = getResources().getString(0x7f0804db, new Object[] {
            bundle
        });
        ((TextView)findViewById(0x7f1004d8)).setText(bundle);
        new Intent();
        if (cameraPreview != null)
        {
            cameraPreview.initialize();
            cameraPreview.setScaleMode(ScaleMode.b);
        }
        mOkButton.setOnClickListener(new android.view.View.OnClickListener() {

            final VideoMessagePromotionActivity this$0;

            public final void onClick(View view)
            {
                analytics.c(AnalyticsEvent.I);
                view = new Intent();
                setResult(-1, view);
                finish();
            }

            
            {
                this$0 = VideoMessagePromotionActivity.this;
                super();
            }
        });
        mNoThanksTextView.setOnClickListener(new android.view.View.OnClickListener() {

            final VideoMessagePromotionActivity this$0;

            public final void onClick(View view)
            {
                analytics.c(AnalyticsEvent.J);
                view = new Intent();
                setResult(0, view);
                finish();
            }

            
            {
                this$0 = VideoMessagePromotionActivity.this;
                super();
            }
        });
    }

    protected void onDestroy()
    {
        if (cameraPreview != null)
        {
            cameraPreview.onDestroy();
        }
        super.onDestroy();
    }

    protected void onPause()
    {
        super.onPause();
        if (cameraPreview != null)
        {
            cameraPreview.onPause();
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (cameraPreview != null)
        {
            cameraPreview.onResume();
        }
    }
}
