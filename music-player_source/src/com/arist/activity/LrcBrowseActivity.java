// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.arist.activity.base.BaseActivity;
import com.arist.c.a;
import com.arist.c.c;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

// Referenced classes of package com.arist.activity:
//            h, i, j

public class LrcBrowseActivity extends BaseActivity
    implements android.widget.AdapterView.OnItemClickListener
{

    private final ArrayList a = new ArrayList();
    private ArrayList b;
    private j c;
    private String d;
    private TextView e;
    private String g;
    private int h;
    private String i;
    private Comparator j;
    private FileFilter k;

    public LrcBrowseActivity()
    {
        b = new ArrayList();
        j = new h(this);
        k = new i(this);
    }

    static ArrayList a(LrcBrowseActivity lrcbrowseactivity)
    {
        return lrcbrowseactivity.a;
    }

    private void a()
    {
        if (b.isEmpty())
        {
            i = "/";
            a("/");
            return;
        } else
        {
            i = "/storage";
            a.clear();
            a.addAll(b);
            c.notifyDataSetChanged();
            e.setText(i);
            return;
        }
    }

    private void a(String s)
    {
        d = s;
        e.setText(s);
        s = new File(s);
        if (!s.exists() || !s.canRead() || !s.isDirectory())
        {
            return;
        }
        s = s.listFiles(k);
        a.clear();
        if (s != null)
        {
            a.addAll(Arrays.asList(s));
        }
        Collections.sort(a, j);
        c.notifyDataSetChanged();
    }

    public void handleBackClicked(View view)
    {
        onBackPressed();
    }

    public void onBackPressed()
    {
        if (h == 0)
        {
            super.onBackPressed();
            return;
        }
        if (h == 1)
        {
            h = h - 1;
            a();
            return;
        } else
        {
            h = h - 1;
            a((new File(d)).getParentFile().getAbsolutePath());
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        g = getIntent().getStringExtra("music_path");
        setContentView(0x7f030003);
        e = (TextView)findViewById(0x7f060022);
        bundle = (ListView)findViewById(0x7f060023);
        c = new j(this);
        bundle.setAdapter(c);
        bundle.setOnItemClickListener(this);
        h = 0;
        b.clear();
        bundle = com.arist.c.c.a(getApplicationContext()).iterator();
        do
        {
            if (!bundle.hasNext())
            {
                a();
                return;
            }
            String s = (String)bundle.next();
            b.add(new File(s));
        } while (true);
    }

    public void onItemClick(AdapterView adapterview, View view, int l, long l1)
    {
        adapterview = c.a(l);
        if (adapterview.isDirectory())
        {
            h = h + 1;
            a(adapterview.getAbsolutePath());
            return;
        } else
        {
            com.arist.c.c.a(adapterview, new File((new StringBuilder(String.valueOf(a.F))).append(com.arist.c.c.d(g)).append(".lrc").toString()));
            setResult(-1);
            finish();
            return;
        }
    }
}
