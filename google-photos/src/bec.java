// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public abstract class bec extends ome
{

    public bec()
    {
        (new mnk(this, g)).a(f).a = false;
        new msh(g);
        (new fnt(this, g)).a(f);
        (new mov(this, g, com.google.android.apps.consumerphotoeditor.R.menu.cpe_main_activity_actions)).a(f);
        new fno(g, com.google.android.apps.consumerphotoeditor.R.id.cpe_send_feedback, fnl.g);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        f.a("com.google.android.libraries.social.appid", 192);
        bundle = getIntent().getStringExtra("com.google.android.apps.photos.photoeditor.contract.media_key");
        if (!TextUtils.isEmpty(bundle))
        {
            bundle = new ogv(i(), new ogw[] {
                ogw.a(h(), bundle)
            });
        } else
        {
            bundle = getIntent().getStringExtra("com.google.android.apps.photos.photoeditor.contract.sha");
            bundle = new ogv(i(), new ogw[] {
                ogw.b(h(), bundle)
            });
        }
        (new msi(bundle)).a(f);
    }

    public void b(am am)
    {
    }

    public void c(am am)
    {
    }

    public abstract void f();

    public abstract boolean g();

    public abstract int h();

    public abstract msp i();

    public void onBackPressed()
    {
        if (g())
        {
            (new bfh()).a(c(), "OnBackPressedDialogFragment");
            return;
        } else
        {
            super.onBackPressed();
            overridePendingTransition(0, 0);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        bundle = e().a();
        if (bundle == null)
        {
            throw new IllegalStateException("Failed to get action bar reference");
        }
        bundle.a(false);
        bundle.c(false);
        bundle.d(true);
        if (!b.a(this, getResources())) goto _L2; else goto _L1
_L1:
        ((ViewGroup)getWindow().getDecorView()).setSystemUiVisibility(1024);
        if (android.os.Build.VERSION.SDK_INT < 21) goto _L4; else goto _L3
_L3:
        int j = 0x80000000;
_L6:
        getWindow().setFlags(j, j);
_L2:
        return;
_L4:
        j = 0x4000000;
        if (b.a(getResources()))
        {
            j = 0xc000000;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onResume()
    {
        super.onResume();
        f();
    }

    public void onStart()
    {
        boolean flag = false;
        super.onStart();
        Resources resources = getResources();
        if (b.a(this, resources))
        {
            int j = resources.getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_system_bar_background);
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                j = resources.getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_system_bar_background);
                getWindow().setStatusBarColor(j);
                j = 0;
            }
            int k = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
            Object obj = findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_status_bar_space);
            ((View) (obj)).setBackgroundColor(j);
            ((View) (obj)).getLayoutParams().height = k;
            ((View) (obj)).requestLayout();
            View view = findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_nav_bar_space);
            view.setBackgroundColor(j);
            if (resources.getConfiguration().orientation == 2)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (j != 0)
            {
                obj = "navigation_bar_height_landscape";
            } else
            {
                obj = "navigation_bar_height";
            }
            k = resources.getDimensionPixelSize(resources.getIdentifier(((String) (obj)), "dimen", "android"));
            j = ((flag) ? 1 : 0);
            if (b.a(resources))
            {
                if (android.os.Build.VERSION.SDK_INT >= 21)
                {
                    j = ((flag) ? 1 : 0);
                } else
                {
                    j = k;
                }
            }
            view.getLayoutParams().height = j;
            view.requestLayout();
        }
    }
}
