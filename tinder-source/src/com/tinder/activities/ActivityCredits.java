// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Html;
import android.widget.ScrollView;
import android.widget.TextView;

public class ActivityCredits extends Activity
{

    private TextView a;
    private TextView b;
    private ScrollView c;

    public ActivityCredits()
    {
    }

    static ScrollView a(ActivityCredits activitycredits)
    {
        return activitycredits.c;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03008f);
        a = (TextView)findViewById(0x7f0e0233);
        b = (TextView)findViewById(0x7f0e0235);
        c = (ScrollView)findViewById(0x7f0e0231);
        a.setText(Html.fromHtml("<br><b>Director of Android</b><br>Karim Varela<br><br><b>Android Developers</b><br>Paul Cafardo &<br>Jose \"King of the Jungle\" Pons Vega<br>Louis \"LTSmooth\" Tang <br>Matthew Runo<br><br><b>Android Designer</b><br>Mike Gottschalk<br><br><b>Android QA Lead</b><br>Rob Holsinger<br>"));
        b.setText(Html.fromHtml("<br><b>Chief Executive Officer</b><br>Sean Rad<br><br><b>Chief Technical Officer</b><br>Ryan Ogle<br><br><b>Vice President, Engineering</b><br>Jonathan \"The Digital Pimp\" Badeen<br><br><b>Director of Quality Assurance</b><br>Justin Stefek<br><br><b>Director of Operations</b><br>Brandon Beveridge<br><br><b>Back-end Engineers</b><br>Gabe Lipson & Aaron Miller<br><br><b>Dev Ops Engineers</b><br>Patrick Albert, Brian Haney, & Tor Solli-Nowlan<br><br><b>Mascot</b><br>Coco the Dog"));
        (new CountDownTimer() {

            final ActivityCredits a;

            public final void onFinish()
            {
                if (android.os.Build.VERSION.SDK_INT > 14)
                {
                    ActivityCredits.a(a).setScrollY(0);
                }
            }

            public final void onTick(long l)
            {
                ActivityCredits.a(a).scrollBy(0, 1);
            }

            
            {
                a = ActivityCredits.this;
                super(40000L, 25L);
            }
        }).start();
    }
}
