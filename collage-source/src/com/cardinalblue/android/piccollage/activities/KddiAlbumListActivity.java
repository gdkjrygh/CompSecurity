// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import com.cardinalblue.android.piccollage.controller.a.h;
import com.cardinalblue.android.piccollage.model.gson.Album;
import com.cardinalblue.android.piccollage.model.j;
import com.cardinalblue.android.piccollage.view.a.m;
import java.util.ArrayList;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            KddiActivity, KddiMediaListActivity

public class KddiAlbumListActivity extends KddiActivity
    implements android.widget.AdapterView.OnItemClickListener
{

    public KddiAlbumListActivity()
    {
    }

    public void a()
    {
        setContentView(0x7f030032);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ListView listview = (ListView)findViewById(0x102000a);
        m m1 = new m(this, 0x7f0300e7);
        listview.setAdapter(m1);
        listview.setOnItemClickListener(this);
        (new h(this, m1, j.a(this))).execute(new Void[0]);
    }

    protected void onActivityResult(int i, int k, Intent intent)
    {
        super.onActivityResult(i, k, intent);
        if (i == 100)
        {
            if (k == 2)
            {
                setResult(0);
                finish();
            } else
            if (k == 1)
            {
                ArrayList arraylist = intent.getExtras().getStringArrayList("photo_ids");
                if (arraylist != null && arraylist.size() > 0)
                {
                    setResult(-1, intent);
                } else
                {
                    setResult(0);
                }
                finish();
                return;
            }
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((Album)adapterview.getAdapter().getItem(i)).getId();
        view = new Intent(this, com/cardinalblue/android/piccollage/activities/KddiMediaListActivity);
        view.putExtra("albumId", adapterview);
        view.putExtra("max_choices", getIntent().getExtras().getInt("max_choices", 30));
        startActivityForResult(view, 100);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            finish();
            break;
        }
        return true;
    }
}
