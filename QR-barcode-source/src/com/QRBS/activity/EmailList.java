// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.scannerfire.utils.EncodeUtils;
import java.util.ArrayList;

public class EmailList extends SherlockActivity
{

    ArrayList email_list;
    ListView lv;

    public EmailList()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030029);
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(0x7f0800d1);
        bundle.setHomeButtonEnabled(true);
        lv = (ListView)findViewById(0x7f0d0093);
        lv.setSelector(0x7f0200e7);
        email_list = getIntent().getCharSequenceArrayListExtra("list");
        bundle = new ArrayAdapter(this, 0x1090003, email_list);
        lv.setAdapter(bundle);
        lv.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final EmailList this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = ((CharSequence)email_list.get(i)).toString();
                (new EncodeUtils(EmailList.this)).start((new StringBuilder("mailto:")).append(adapterview).toString(), adapterview);
            }

            
            {
                this$0 = EmailList.this;
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
