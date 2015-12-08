// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.cardinalblue.android.b.a;
import com.cardinalblue.android.piccollage.model.gson.ClippingPathModel;
import com.cardinalblue.android.piccollage.model.k;
import com.cardinalblue.android.piccollage.view.ClipActivityView;
import com.cardinalblue.android.piccollage.view.g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseActivity

public class ClipActivity extends BaseActivity
{

    private ClipActivityView a;
    private List b;

    public ClipActivity()
    {
        b = new ArrayList();
    }

    private void a()
    {
        if (a != null)
        {
            a.b();
        }
    }

    private boolean b()
    {
        return a.a();
    }

    public void onBackPressed()
    {
        setResult(0);
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030026);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        a = (ClipActivityView)findViewById(0x7f1000c3);
        ClippingPathModel clippingpathmodel;
        g g1;
        try
        {
            bundle = new File(getIntent().getStringExtra("clip_image_path"));
            g1 = new g(getApplicationContext(), k.a(bundle), bundle, 0, false);
            clippingpathmodel = (ClippingPathModel)getIntent().getParcelableExtra("clip_points");
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            com.cardinalblue.android.b.k.a(this, 0x7f0700f8, 1);
            finish();
            return;
        }
        bundle = clippingpathmodel;
        if (clippingpathmodel != null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        bundle = new ClippingPathModel();
        a.a(g1, bundle);
        return;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f110007, menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        if (a != null)
        {
            g g1 = a.getScrap();
            if (g1 != null)
            {
                com.cardinalblue.android.b.a.b(g1.m());
            }
            a = null;
            System.gc();
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR lookupswitch 3: default 40
    //                   16908332: 46
    //                   2131755753: 57
    //                   2131755754: 64;
           goto _L1 _L2 _L3 _L4
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        setResult(0);
        finish();
_L6:
        return true;
_L3:
        a();
        continue; /* Loop/switch isn't completed */
_L4:
        a.d();
        menuitem = new Intent();
        if (b())
        {
            menuitem.putExtra("clip_points", a.getClippingPathModel());
            setResult(-1, menuitem);
        } else
        {
            setResult(0, menuitem);
        }
        finish();
        if (true) goto _L6; else goto _L5
_L5:
    }
}
