// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.ads.AdView;
import com.scannerfire.utils.EncodeUtils;
import com.scannerfire.utils.Utils;
import java.util.ArrayList;

// Referenced classes of package com.QRBS.activity:
//            EmailList

public class CreateEmail extends SherlockActivity
{

    final int PICK_CONTACT_REQUEST = 0;
    Button encode;
    Button pick;
    EditText text;

    public CreateEmail()
    {
    }

    private void pickContact()
    {
        ArrayList arraylist = (new EncodeUtils(this)).getNameEmailDetails(this);
        int i = 0;
        do
        {
            if (i >= arraylist.size())
            {
                Intent intent = new Intent(this, com/QRBS/activity/EmailList);
                intent.putExtra("list", arraylist);
                startActivity(intent);
                return;
            }
            Log.d("", (new StringBuilder("EMAIL -> ")).append((String)arraylist.get(i)).toString());
            i++;
        } while (true);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030023);
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(0x7f0800ce);
        bundle.setHomeButtonEnabled(true);
        ((AdView)findViewById(0x7f0d0061)).loadAd((new com.google.android.gms.ads.AdRequest.Builder()).build());
        text = (EditText)findViewById(0x7f0d0085);
        encode = (Button)findViewById(0x7f0d0079);
        pick = (Button)findViewById(0x7f0d0078);
        encode.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateEmail this$0;

            public void onClick(View view)
            {
                view = text.getText().toString();
                if (view == null || view.length() == 0)
                {
                    Utils.showToastNotification(CreateEmail.this, getString(0x7f0800fd));
                    return;
                } else
                {
                    (new EncodeUtils(CreateEmail.this)).start((new StringBuilder("mailto:")).append(view).toString(), view);
                    return;
                }
            }

            
            {
                this$0 = CreateEmail.this;
                super();
            }
        });
        pick.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateEmail this$0;

            public void onClick(View view)
            {
                pickContact();
            }

            
            {
                this$0 = CreateEmail.this;
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
