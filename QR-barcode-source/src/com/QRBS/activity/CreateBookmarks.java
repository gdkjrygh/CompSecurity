// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.EditText;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.ads.AdView;
import com.scannerfire.utils.EncodeUtils;
import com.scannerfire.utils.Utils;

// Referenced classes of package com.QRBS.activity:
//            BookmarksListActivity

public class CreateBookmarks extends SherlockActivity
{

    Button encode;
    Button pick;

    public CreateBookmarks()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030021);
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(0x7f0800cc);
        bundle.setHomeButtonEnabled(true);
        ((AdView)findViewById(0x7f0d0061)).loadAd((new com.google.android.gms.ads.AdRequest.Builder()).build());
        pick = (Button)findViewById(0x7f0d0078);
        pick.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateBookmarks this$0;

            public void onClick(View view)
            {
                view = new Intent(CreateBookmarks.this, com/QRBS/activity/BookmarksListActivity);
                startActivity(view);
            }

            
            {
                this$0 = CreateBookmarks.this;
                super();
            }
        });
        encode = (Button)findViewById(0x7f0d0079);
        encode.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateBookmarks this$0;

            public void onClick(View view)
            {
                view = ((EditText)findViewById(0x7f0d0077)).getText().toString();
                if (view == null || view.length() == 0)
                {
                    Utils.showToastNotification(CreateBookmarks.this, getString(0x7f0800fa));
                    return;
                }
                if (!URLUtil.isValidUrl(view) && !view.startsWith("www."))
                {
                    Utils.showToastNotification(CreateBookmarks.this, getString(0x7f0800fb));
                    return;
                } else
                {
                    (new EncodeUtils(CreateBookmarks.this)).start(view, view);
                    return;
                }
            }

            
            {
                this$0 = CreateBookmarks.this;
                super();
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        finish();
        return true;
    }
}
