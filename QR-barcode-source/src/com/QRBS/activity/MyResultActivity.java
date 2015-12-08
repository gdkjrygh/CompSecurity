// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.ads.AdView;
import com.scannerfire.utils.EncodeUtils;
import com.scannerfire.utils.ResultUtils;
import com.scannerfire.utils.Utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MyResultActivity extends SherlockActivity
{

    Activity a;
    ImageView barcode;
    Bundle bundle;
    Button custom;
    TextView details;
    TextView format;
    String label;
    TextView qrtext;
    Button share;
    TextView type;

    public MyResultActivity()
    {
    }

    public void buildButton(final String correctURI, String s, final String text)
    {
        share.setText(0x7f080112);
        share.setOnClickListener(new android.view.View.OnClickListener() {

            final MyResultActivity this$0;
            private final String val$text;

            public void onClick(View view)
            {
                Log.d("", "SHARE");
                (new EncodeUtils(MyResultActivity.this)).start(text, label);
            }

            
            {
                this$0 = MyResultActivity.this;
                text = s;
                super();
            }
        });
        if (s.equals("CODE_39") || s.equals("CODE_128"))
        {
            custom.setText(0x7f08011a);
            custom.setOnClickListener(new android.view.View.OnClickListener() {

                final MyResultActivity this$0;
                private final String val$text;

                public void onClick(View view)
                {
                    view = (new StringBuilder("http://www.google.com/m/products?q=")).append(text).toString();
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(view)));
                }

            
            {
                this$0 = MyResultActivity.this;
                text = s;
                super();
            }
            });
        } else
        if (correctURI.equals("URI"))
        {
            if (text != null)
            {
                Log.d("", (new StringBuilder("URI -> ")).append(text).append("\n").toString());
                Log.d("", (new StringBuilder("SCHEME -> ")).append(Uri.parse(text).getScheme()).toString());
                Log.d("", (new StringBuilder("NEW URI -> ")).append(Utils.URICorrection(text, "http://")).toString());
                correctURI = Utils.URICorrection(text, "http://");
                if (correctURI.startsWith("market://details?id="))
                {
                    custom.setText(0x7f080113);
                    custom.setOnClickListener(new android.view.View.OnClickListener() {

                        final MyResultActivity this$0;
                        private final String val$correctURI;

                        public void onClick(View view)
                        {
                            view = correctURI.split("=");
                            try
                            {
                                Log.d("", (new StringBuilder("SPLIT 1->")).append(view[0]).append(" SPLIT 2->").append(view[1]).toString());
                                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(correctURI)));
                                return;
                            }
                            catch (ActivityNotFoundException activitynotfoundexception)
                            {
                                startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("http://play.google.com/store/apps/details?id=")).append(view[1]).toString())));
                            }
                        }

            
            {
                this$0 = MyResultActivity.this;
                correctURI = s;
                super();
            }
                    });
                    return;
                } else
                {
                    custom.setText(0x7f080114);
                    custom.setOnClickListener(new android.view.View.OnClickListener() {

                        final MyResultActivity this$0;
                        private final String val$correctURI;

                        public void onClick(View view)
                        {
                            view = correctURI;
                            try
                            {
                                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(view)));
                                return;
                            }
                            catch (ActivityNotFoundException activitynotfoundexception)
                            {
                                Utils.showToastNotification(MyResultActivity.this, getString(0x7f080157));
                            }
                            Log.d("", (new StringBuilder("ActivityNotFoundException: url is ->")).append(view).toString());
                        }

            
            {
                this$0 = MyResultActivity.this;
                correctURI = s;
                super();
            }
                    });
                    return;
                }
            }
        } else
        {
            if (correctURI.equals("ADDRESSBOOK"))
            {
                custom.setText(0x7f0800bf);
                custom.setOnClickListener(new android.view.View.OnClickListener() {

                    final MyResultActivity this$0;

                    public void onClick(View view)
                    {
                        ResultUtils.myAddressbookIntent(bundle, a);
                    }

            
            {
                this$0 = MyResultActivity.this;
                super();
            }
                });
                return;
            }
            if (correctURI.equals("GEO"))
            {
                custom.setText(0x7f080115);
                custom.setOnClickListener(new android.view.View.OnClickListener() {

                    final MyResultActivity this$0;
                    private final String val$text;

                    public void onClick(View view)
                    {
                        view = Utils.URICorrection(text, "geo:");
                        Intent intent;
                        Log.d("", (new StringBuilder("TEXT ->")).append(text).toString());
                        intent = new Intent("android.intent.action.VIEW");
                        if (!view.contains("?"))
                        {
                            break MISSING_BLOCK_LABEL_90;
                        }
                        intent.setData(Uri.parse((new StringBuilder(String.valueOf(view))).append("&z=16").toString()));
_L1:
                        startActivity(intent);
                        return;
                        try
                        {
                            intent.setData(Uri.parse((new StringBuilder(String.valueOf(view))).append("?z=16").toString()));
                        }
                        // Misplaced declaration of an exception variable
                        catch (View view)
                        {
                            Utils.showToastNotification(a, getString(0x7f080116));
                            return;
                        }
                          goto _L1
                    }

            
            {
                this$0 = MyResultActivity.this;
                text = s;
                super();
            }
                });
                return;
            }
            if (correctURI.equals("TEL"))
            {
                custom.setText(0x7f080117);
                custom.setOnClickListener(new android.view.View.OnClickListener() {

                    final MyResultActivity this$0;
                    private final String val$text;

                    public void onClick(View view)
                    {
                        view = new Intent("android.intent.action.DIAL", Uri.parse(text));
                        try
                        {
                            startActivity(view);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (View view)
                        {
                            Utils.showToastNotification(MyResultActivity.this, getString(0x7f080157));
                        }
                    }

            
            {
                this$0 = MyResultActivity.this;
                text = s;
                super();
            }
                });
                return;
            }
            if (correctURI.equals("EMAIL_ADDRESS"))
            {
                custom.setText(0x7f0800be);
                custom.setOnClickListener(new android.view.View.OnClickListener() {

                    final MyResultActivity this$0;
                    private final String val$text;

                    public void onClick(View view)
                    {
                        view = new Intent("android.intent.action.SENDTO", Uri.parse(text));
                        startActivity(Intent.createChooser(view, "Send with:"));
                    }

            
            {
                this$0 = MyResultActivity.this;
                text = s;
                super();
            }
                });
                return;
            }
            if (correctURI.equals("TEXT"))
            {
                if (URLUtil.isValidUrl(text))
                {
                    custom.setText(0x7f080114);
                    custom.setOnClickListener(new android.view.View.OnClickListener() {

                        final MyResultActivity this$0;
                        private final String val$text;

                        public void onClick(View view)
                        {
                            try
                            {
                                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(text)));
                                return;
                            }
                            // Misplaced declaration of an exception variable
                            catch (View view)
                            {
                                Utils.showToastNotification(MyResultActivity.this, getString(0x7f080157));
                            }
                        }

            
            {
                this$0 = MyResultActivity.this;
                text = s;
                super();
            }
                    });
                    return;
                } else
                {
                    custom.setText(0x7f0800bd);
                    custom.setOnClickListener(new android.view.View.OnClickListener() {

                        final MyResultActivity this$0;

                        public void onClick(View view)
                        {
                            finish();
                        }

            
            {
                this$0 = MyResultActivity.this;
                super();
            }
                    });
                    return;
                }
            }
            if (correctURI.equals("CALENDAR"))
            {
                custom.setText(0x7f080119);
                custom.setOnClickListener(new android.view.View.OnClickListener() {

                    final MyResultActivity this$0;
                    private final String val$text;

                    public void onClick(View view)
                    {
                        String as[];
                        int i;
                        view = new Intent("android.intent.action.EDIT");
                        view.setType("vnd.android.cursor.item/event");
                        as = text.split("\n|(:)");
                        i = 0;
_L5:
                        if (i >= as.length)
                        {
                            startActivity(view);
                            return;
                        }
                        if (!as[i].contains("DTSTART")) goto _L2; else goto _L1
_L1:
                        Object obj = as[i + 1];
                        if (obj != null) goto _L4; else goto _L3
_L3:
                        i++;
                          goto _L5
_L4:
                        obj = ((String) (obj)).replace("T", "").replace("00Z", "");
                        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMddHHmm", Locale.getDefault());
                        try
                        {
                            obj = simpledateformat.parse(((String) (obj)));
                            Log.d("", (new StringBuilder("START ")).append(((Date) (obj)).getTime()).toString());
                            view.putExtra("beginTime", ((Date) (obj)).getTime());
                        }
                        catch (ParseException parseexception)
                        {
                            parseexception.printStackTrace();
                        }
_L2:
                        if (!as[i].contains("DTEND"))
                        {
                            break MISSING_BLOCK_LABEL_247;
                        }
                        obj = as[i + 1];
                        if (obj == null) goto _L3; else goto _L6
_L6:
                        obj = ((String) (obj)).replace("T", "").replace("00Z", "");
                        simpledateformat = new SimpleDateFormat("yyyyMMddHHmm", Locale.getDefault());
                        try
                        {
                            obj = simpledateformat.parse(((String) (obj)));
                            Log.d("", (new StringBuilder("END ")).append(((Date) (obj)).getTime()).toString());
                            view.putExtra("endTime", ((Date) (obj)).getTime());
                        }
                        catch (ParseException parseexception1)
                        {
                            parseexception1.printStackTrace();
                        }
                        if (as[i].contains("LOCATION"))
                        {
                            Log.d("", (new StringBuilder("Luogo ")).append(as[i + 1]).toString());
                            if (as[i + 1] != null)
                            {
                                view.putExtra("eventLocation", as[i + 1]);
                            }
                        }
                        if (as[i].contains("DESCRIPTION"))
                        {
                            Log.d("", (new StringBuilder("Descrizione ")).append(as[i + 1]).toString());
                            if (as[i + 1] != null)
                            {
                                view.putExtra("description", as[i + 1]);
                            }
                        }
                        if (as[i].contains("SUMMARY"))
                        {
                            Log.d("", (new StringBuilder("Titolo ")).append(as[i + 1]).toString());
                            if (as[i + 1] != null)
                            {
                                view.putExtra("title", as[i + 1]);
                            }
                        }
                          goto _L3
                    }

            
            {
                this$0 = MyResultActivity.this;
                text = s;
                super();
            }
                });
                return;
            }
            if (correctURI.equals("PRODUCT"))
            {
                correctURI = Utils.getCustomUrlPref(getApplicationContext());
                if (!correctURI.equals("") && (correctURI.startsWith("http://") || correctURI.startsWith("https://")))
                {
                    custom.setText(0x7f08011b);
                    custom.setOnClickListener(new android.view.View.OnClickListener() {

                        final MyResultActivity this$0;
                        private final String val$customUrl;
                        private final String val$text;

                        public void onClick(View view)
                        {
                            view = Uri.parse(customUrl.replaceAll("%s", text));
                            try
                            {
                                startActivity(new Intent("android.intent.action.VIEW", view));
                                return;
                            }
                            // Misplaced declaration of an exception variable
                            catch (View view)
                            {
                                Utils.showToastNotification(MyResultActivity.this, getString(0x7f080157));
                            }
                        }

            
            {
                this$0 = MyResultActivity.this;
                customUrl = s;
                text = s1;
                super();
            }
                    });
                    return;
                } else
                {
                    custom.setText(0x7f08011a);
                    custom.setOnClickListener(new android.view.View.OnClickListener() {

                        final MyResultActivity this$0;
                        private final String val$text;

                        public void onClick(View view)
                        {
                            view = (new StringBuilder("http://www.google.com/m/products?q=")).append(text).toString();
                            try
                            {
                                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(view)));
                                return;
                            }
                            // Misplaced declaration of an exception variable
                            catch (View view)
                            {
                                Utils.showToastNotification(MyResultActivity.this, getString(0x7f080157));
                            }
                        }

            
            {
                this$0 = MyResultActivity.this;
                text = s;
                super();
            }
                    });
                    return;
                }
            }
            if (correctURI.equals("ISBN"))
            {
                custom.setText(0x7f080149);
                custom.setOnClickListener(new android.view.View.OnClickListener() {

                    final MyResultActivity this$0;
                    private final String val$text;

                    public void onClick(View view)
                    {
                        view = (new StringBuilder("http://books.google.com/books?vid=isbn")).append(text).toString();
                        try
                        {
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(view)));
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (View view)
                        {
                            Utils.showToastNotification(MyResultActivity.this, getString(0x7f080157));
                        }
                    }

            
            {
                this$0 = MyResultActivity.this;
                text = s;
                super();
            }
                });
                return;
            } else
            {
                custom.setText(0x7f0800bd);
                custom.setOnClickListener(new android.view.View.OnClickListener() {

                    final MyResultActivity this$0;

                    public void onClick(View view)
                    {
                        finish();
                    }

            
            {
                this$0 = MyResultActivity.this;
                super();
            }
                });
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle1)
    {
        super.onCreate(bundle1);
        setContentView(0x7f030037);
        bundle1 = getSupportActionBar();
        bundle1.setIcon(0x7f0200d4);
        bundle1.setTitle(0x7f0800b1);
        bundle1.setSubtitle(0x7f0800d6);
        bundle1.setHomeButtonEnabled(true);
        a = this;
        ((AdView)findViewById(0x7f0d0061)).loadAd((new com.google.android.gms.ads.AdRequest.Builder()).build());
        qrtext = (TextView)findViewById(0x7f0d00ca);
        barcode = (ImageView)findViewById(0x7f0d00c1);
        format = (TextView)findViewById(0x7f0d00c3);
        details = (TextView)findViewById(0x7f0d00c8);
        type = (TextView)findViewById(0x7f0d00c6);
        share = (Button)findViewById(0x7f0d00be);
        custom = (Button)findViewById(0x7f0d00bd);
        qrtext.setMovementMethod(new ScrollingMovementMethod());
        bundle1 = getIntent().getExtras();
        bundle = bundle1;
        if (bundle1 != null)
        {
            label = bundle1.getString("label");
            qrtext.setText(label);
            byte abyte0[] = bundle1.getByteArray("picture");
            if (abyte0 != null)
            {
                Bitmap bitmap = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
                if (bitmap.getHeight() > 2000 || bitmap.getWidth() > 2000)
                {
                    barcode.setImageBitmap(Bitmap.createScaledBitmap(bitmap, 300, 300, false));
                } else
                {
                    barcode.setImageBitmap(bitmap);
                }
            }
            format.setText(bundle1.getString("format"));
            details.setText(bundle1.getString("details"));
            type.setText(bundle1.getString("type"));
            buildButton(bundle1.getString("type"), bundle1.getString("format"), bundle1.getString("TEXT"));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getSupportMenuInflater().inflate(0x7f0f0005, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return true;

        case 2131558645: 
            Utils.copyToClipboard(getApplicationContext(), label);
            return true;

        case 16908332: 
            finish();
            return true;
        }
    }
}
