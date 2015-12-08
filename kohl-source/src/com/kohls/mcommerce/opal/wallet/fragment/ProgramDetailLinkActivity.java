// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import java.net.URL;

public class ProgramDetailLinkActivity extends Activity
{
    private class DownloadImageTask extends AsyncTask
    {

        ImageView bmImage;
        final ProgramDetailLinkActivity this$0;

        protected transient Bitmap doInBackground(String as[])
        {
            as = as[0];
            try
            {
                as = BitmapFactory.decodeStream((new URL(as)).openStream());
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                return null;
            }
            return as;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected void onPostExecute(Bitmap bitmap)
        {
            bmImage.setImageBitmap(bitmap);
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Bitmap)obj);
        }

        public DownloadImageTask(ImageView imageview)
        {
            this$0 = ProgramDetailLinkActivity.this;
            super();
            bmImage = imageview;
        }
    }


    public ProgramDetailLinkActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030010);
        setUpActionBar();
        bundle = (ImageView)findViewById(0x7f0d005f);
        String s = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getProgramDetailsHeader();
        if (!TextUtils.isEmpty(s))
        {
            (new DownloadImageTask(bundle)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
                s
            });
        }
        bundle = (WebView)findViewById(0x7f0d0060);
        s = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getProgramDetailsContent();
        if (!TextUtils.isEmpty(s))
        {
            bundle.loadData(s, "text/html", "charset=UTF-8");
        }
        bundle = bundle.getSettings();
        bundle.setJavaScriptEnabled(true);
        bundle.setSupportZoom(true);
        bundle.setBuiltInZoomControls(false);
        bundle.setDomStorageEnabled(true);
        bundle.setLoadWithOverviewMode(true);
    }

    protected void setUpActionBar()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setDisplayShowHomeEnabled(false);
            actionbar.setDisplayHomeAsUpEnabled(false);
            actionbar.setDisplayShowTitleEnabled(false);
            actionbar.setDisplayUseLogoEnabled(false);
            actionbar.setHomeButtonEnabled(false);
            actionbar.setIcon(0x106000d);
            actionbar.setDisplayShowTitleEnabled(true);
            actionbar.setTitle(getResources().getString(0x7f080452));
            actionbar.show();
        }
    }
}
