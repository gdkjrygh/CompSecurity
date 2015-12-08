// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.cmcm.adsdk.b.c.b;
import com.cmcm.adsdk.h;
import com.cmcm.adsdk.i;

public class PicksLoadingActivity extends Activity
{

    public static boolean a = true;
    private static final String b = com/cmcm/adsdk/nativead/PicksLoadingActivity.getSimpleName();
    private ImageView c;
    private TextView d;
    private TextView e;
    private ImageView f;

    public PicksLoadingActivity()
    {
    }

    public static void a(Context context)
    {
        a = true;
        Intent intent = new Intent(context, com/cmcm/adsdk/nativead/PicksLoadingActivity);
        intent.addFlags(0x10000000);
        context.startActivity(intent);
    }

    public static void b(Context context)
    {
        Intent intent = new Intent(context, com/cmcm/adsdk/nativead/PicksLoadingActivity);
        intent.putExtra("tag_close_dialog", true);
        intent.addFlags(0x10000000);
        context.startActivity(intent);
    }

    public void onBackPressed()
    {
        a = false;
        com.cmcm.adsdk.b.c.b.a(b, "onBackPressed");
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        com.cmcm.adsdk.b.c.b.a(b, "oncreate");
        boolean flag = getIntent().getBooleanExtra("tag_close_dialog", false);
        com.cmcm.adsdk.b.c.b.a(b, (new StringBuilder("isClose")).append(flag).toString());
        if (flag)
        {
            finish();
            return;
        } else
        {
            setContentView(i.a);
            com.cmcm.adsdk.b.c.b.a(b, "setContenView");
            c = (ImageView)findViewById(h.a);
            d = (TextView)findViewById(h.b);
            e = (TextView)findViewById(h.c);
            f = (ImageView)findViewById(h.d);
            int j = ((WindowManager)getSystemService("window")).getDefaultDisplay().getWidth();
            bundle = e.getLayoutParams();
            bundle.height = (int)((double)j * 0.13333333333333333D);
            bundle.width = j;
            e.setLayoutParams(bundle);
            bundle = f.getLayoutParams();
            int k = (int)((double)j * 0.13333333333333333D);
            bundle.height = k;
            bundle.width = k;
            f.setLayoutParams(bundle);
            j = (int)((double)j * 0.066666666666666666D);
            d.setPadding(j, 0, j, 0);
            d.setText("");
            com.cmcm.adsdk.b.c.b.a(b, "init");
            c.clearAnimation();
            bundle = new RotateAnimation(0.0F, 360F, 1, 0.5F, 1, 0.5F);
            bundle.setDuration(800L);
            bundle.setRepeatMode(1);
            bundle.setRepeatCount(-1);
            bundle.setInterpolator(new LinearInterpolator());
            c.startAnimation(bundle);
            com.cmcm.adsdk.b.c.b.a(b, "startAnim");
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (c != null)
        {
            c.clearAnimation();
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        com.cmcm.adsdk.b.c.b.a(b, "onNewIntent");
        if (intent.getBooleanExtra("tag_close_dialog", false))
        {
            finish();
        }
    }

}
