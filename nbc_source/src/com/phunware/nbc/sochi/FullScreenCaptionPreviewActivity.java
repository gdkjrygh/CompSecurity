// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.nbcsports.liveextra.ApplicationComponent;
import com.phunware.nbc.sochi.caption.caption.CaptionPreviewHelper;

// Referenced classes of package com.phunware.nbc.sochi:
//            NBCSportsApplication

public class FullScreenCaptionPreviewActivity extends AppCompatActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{

    private static final String EXTRA_STYLE_ID = "style_id";
    private CaptionPreviewHelper captionPreviewHelper;
    private long mStyleId;
    private TextView mTextViewCaptionPreview;

    public FullScreenCaptionPreviewActivity()
    {
    }

    public static Intent getIntent(Context context, long l)
    {
        context = new Intent(context, com/phunware/nbc/sochi/FullScreenCaptionPreviewActivity);
        context.putExtra("style_id", l);
        return context;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        captionPreviewHelper = NBCSportsApplication.component().captionPreviewHelper();
        setContentView(0x7f04001c);
        getSupportActionBar().setIcon(0x7f030000);
        mStyleId = getIntent().getLongExtra("style_id", 0L);
        bundle = (ImageView)findViewById(0x7f0f0114);
        ImageView imageview = (ImageView)findViewById(0x7f0f0115);
        mTextViewCaptionPreview = (TextView)findViewById(0x7f0f0113);
        bundle.setVisibility(8);
        imageview.setVisibility(0);
        imageview.setOnClickListener(new android.view.View.OnClickListener() {

            final FullScreenCaptionPreviewActivity this$0;

            public void onClick(View view)
            {
                finish();
            }

            
            {
                this$0 = FullScreenCaptionPreviewActivity.this;
                super();
            }
        });
        getSupportLoaderManager().restartLoader(1, null, this);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new CursorLoader(this, ContentUris.withAppendedId(com.phunware.nbc.sochi.caption.provider.ClosedCaptioningStylesContract.Styles.CONTENT_URI, mStyleId), null, null, null, null);
    }

    public void onLoadFinished(Loader loader, Cursor cursor)
    {
        captionPreviewHelper.preview(this, cursor, mTextViewCaptionPreview);
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (Cursor)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }
}
