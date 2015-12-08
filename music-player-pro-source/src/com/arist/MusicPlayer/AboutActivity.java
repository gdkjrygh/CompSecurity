// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import com.arist.Adapter.MyPagerAdapter;
import java.util.ArrayList;

public class AboutActivity extends Activity
{

    private MyPagerAdapter pagerAdapter;
    private ViewPager vpAbout;

    public AboutActivity()
    {
    }

    protected void onCreate(final Bundle inflater)
    {
        super.onCreate(inflater);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(0x7f030000);
        vpAbout = (ViewPager)findViewById(0x7f0d0017);
        inflater = LayoutInflater.from(this);
        final ArrayList views = new ArrayList();
        final TypedArray skinRes = getResources().obtainTypedArray(0x7f0b0006);
        int i = 0;
        do
        {
            if (i >= 2)
            {
                pagerAdapter = new MyPagerAdapter(views);
                vpAbout.setAdapter(pagerAdapter);
                (new Handler()).postDelayed(new Runnable() {

                    final AboutActivity this$0;
                    private final LayoutInflater val$inflater;
                    private final TypedArray val$skinRes;
                    private final ArrayList val$views;

                    public void run()
                    {
                        int j = 2;
                        do
                        {
                            if (j >= skinRes.length())
                            {
                                pagerAdapter.changeData(views);
                                return;
                            }
                            View view1 = inflater.inflate(0x7f030002, null);
                            ((ImageView)view1.findViewById(0x7f0d0018)).setImageResource(skinRes.getResourceId(j, 0));
                            views.add(view1);
                            j++;
                        } while (true);
                    }

            
            {
                this$0 = AboutActivity.this;
                skinRes = typedarray;
                inflater = layoutinflater;
                views = arraylist;
                super();
            }
                }, 200L);
                return;
            }
            View view = inflater.inflate(0x7f030002, null);
            ((ImageView)view.findViewById(0x7f0d0018)).setImageResource(skinRes.getResourceId(i, 0));
            views.add(view);
            i++;
        } while (true);
    }

}
