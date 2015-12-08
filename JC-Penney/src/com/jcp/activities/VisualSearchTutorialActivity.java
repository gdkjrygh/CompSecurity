// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ActionBar;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import butterknife.ButterKnife;
import com.jcp.adapters.dg;
import com.jcp.fragments.a.a;
import com.jcp.fragments.a.b;
import com.jcp.fragments.a.c;
import com.jcp.views.CarouselPageIndicator;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.activities:
//            ao

public class VisualSearchTutorialActivity extends ao
{

    protected CarouselPageIndicator pageIndicator;
    protected ViewPager pager;

    public VisualSearchTutorialActivity()
    {
    }

    protected String h()
    {
        return "VISUALSEARCHTUTORIAL";
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030032);
        ButterKnife.inject(this);
        if (getActionBar() != null)
        {
            getActionBar().hide();
        }
        bundle = new ArrayList();
        bundle.add(new b());
        bundle.add(new c());
        bundle.add(new a());
        pager.setAdapter(new dg(f(), bundle));
        pageIndicator.setViewPager(pager);
    }

    public void onGotItClick()
    {
        getSharedPreferences("com.jcp.activities", 0).edit().putBoolean("gotIt", true).apply();
        setResult(-1);
        finish();
    }
}
