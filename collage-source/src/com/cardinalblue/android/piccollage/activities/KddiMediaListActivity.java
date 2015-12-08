// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.a.j;
import com.cardinalblue.android.piccollage.model.gson.Media;
import com.cardinalblue.android.piccollage.view.CheckableImageView;
import com.cardinalblue.android.piccollage.view.a.n;
import java.util.ArrayList;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            KddiActivity

public class KddiMediaListActivity extends KddiActivity
    implements android.widget.AdapterView.OnItemClickListener
{

    private int a;
    private n b;
    private View c;
    private TextView d;

    public KddiMediaListActivity()
    {
        a = 30;
    }

    private ArrayList c()
    {
        ArrayList arraylist = new ArrayList();
        int l = b.getCount();
        for (int i = 0; i < l; i++)
        {
            Media media = (Media)b.getItem(i);
            if (media.isSelected())
            {
                arraylist.add(media.getId());
            }
        }

        return arraylist;
    }

    private void d()
    {
        boolean flag = false;
        if (b != null)
        {
            int l = b.a();
            if (d != null)
            {
                Object obj = d;
                int i;
                if (l > 0)
                {
                    i = 0;
                } else
                {
                    i = 8;
                }
                ((TextView) (obj)).setVisibility(i);
                d.setText(Integer.toString(l));
            }
            if (c != null)
            {
                obj = c;
                if (l > 0)
                {
                    flag = true;
                }
                ((View) (obj)).setEnabled(flag);
                return;
            }
        }
    }

    public void a()
    {
        setContentView(0x7f030034);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        GridView gridview = (GridView)findViewById(0x7f1000d7);
        b = new n(this);
        gridview.setAdapter(b);
        gridview.setOnItemClickListener(this);
        d();
        (new j(this, com.cardinalblue.android.piccollage.model.j.a(this), b)).execute(new String[] {
            getIntent().getStringExtra("albumId")
        });
    }

    public void onBackPressed()
    {
        setResult(3);
        super.onBackPressed();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f110014, menu);
        menu = menu.findItem(0x7f1002ea);
        View view = MenuItemCompat.getActionView(menu);
        c = view.findViewById(0x7f1000bf);
        c.setOnClickListener(new android.view.View.OnClickListener(menu) {

            final MenuItem a;
            final KddiMediaListActivity b;

            public void onClick(View view1)
            {
                b.onOptionsItemSelected(a);
            }

            
            {
                b = KddiMediaListActivity.this;
                a = menuitem;
                super();
            }
        });
        d = (TextView)view.findViewById(0x7f1000c0);
        d();
        return true;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (CheckableImageView)view;
        int i1;
        boolean flag;
        if (!adapterview.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        if (flag && i1 + b.a() >= a)
        {
            view = String.format(adapterview.getContext().getString(0x7f0702a4), new Object[] {
                Integer.valueOf(30)
            });
            k.a(adapterview.getContext(), view, 0);
            return;
        } else
        {
            adapterview.setChecked(flag);
            ((Media)b.getItem(i)).setSelected(adapterview.a());
            d();
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            finish();
            return true;

        case 2131755754: 
            menuitem = new Intent();
            break;
        }
        menuitem.putExtra("photo_ids", c());
        setResult(1, menuitem);
        finish();
        return true;
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        a = getIntent().getExtras().getInt("max_choices", 30);
    }
}
