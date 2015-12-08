// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.ui.view.DraggableSeekBar;
import dvv;
import dwh;
import ern;
import fpk;
import fpl;
import gar;
import gcg;

public class VolumeWidgetActivity extends fpk
{

    private Handler d;
    private DraggableSeekBar i;
    private TextView j;
    private ImageView k;
    private boolean l;
    private ern m;
    private Runnable n;

    public VolumeWidgetActivity()
    {
        n = new Runnable() {

            private VolumeWidgetActivity a;

            public final void run()
            {
                a.finish();
            }

            
            {
                a = VolumeWidgetActivity.this;
                super();
            }
        };
    }

    public static Intent a(ConnectDevice connectdevice, float f1, Context context)
    {
        context = new Intent(context, com/spotify/mobile/android/ui/activity/VolumeWidgetActivity);
        context.putExtra("active_device", connectdevice);
        context.putExtra("volume_level", f1);
        return context;
    }

    static void a(VolumeWidgetActivity volumewidgetactivity)
    {
        volumewidgetactivity.f();
    }

    static boolean a(VolumeWidgetActivity volumewidgetactivity, boolean flag)
    {
        volumewidgetactivity.l = flag;
        return flag;
    }

    static DraggableSeekBar b(VolumeWidgetActivity volumewidgetactivity)
    {
        return volumewidgetactivity.i;
    }

    private void f()
    {
        d.removeCallbacks(n);
        d.postDelayed(n, 2000L);
    }

    public final void a(float f1)
    {
        if (l)
        {
            return;
        } else
        {
            fpl.a(f1, i);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03014b);
        m = new ern(this);
        i = (DraggableSeekBar)findViewById(0x7f110367);
        j = (TextView)findViewById(0x7f1104af);
        k = (ImageView)findViewById(0x7f1104e2);
        d = new Handler();
        i.setMax(100);
        i.a = new gar() {

            private VolumeWidgetActivity a;

            public final void a()
            {
                VolumeWidgetActivity.a(a, true);
            }

            public final void a(int i1)
            {
                if (a.f.c())
                {
                    ConnectManager connectmanager = (ConnectManager)a.f.f();
                    int j1 = VolumeWidgetActivity.b(a).getMax();
                    connectmanager.b((float)(i1 - 6) / (float)j1);
                    VolumeWidgetActivity.a(a);
                }
            }

            public final void a(SeekBar seekbar)
            {
                if (a.f.c())
                {
                    ((ConnectManager)a.f.f()).b(fpl.a(seekbar));
                }
                VolumeWidgetActivity.a(a, false);
            }

            public final void b(int i1)
            {
                if (a.f.c())
                {
                    ConnectManager connectmanager = (ConnectManager)a.f.f();
                    int j1 = VolumeWidgetActivity.b(a).getMax();
                    connectmanager.b((float)(i1 + 6) / (float)j1);
                    VolumeWidgetActivity.a(a);
                }
            }

            public final void b(SeekBar seekbar)
            {
                if (a.f.c())
                {
                    ((ConnectManager)a.f.f()).b(fpl.a(seekbar));
                    VolumeWidgetActivity.a(a);
                }
            }

            
            {
                a = VolumeWidgetActivity.this;
                super();
            }
        };
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 25 || i1 == 24)
        {
            f();
        }
        return super.onKeyDown(i1, keyevent);
    }

    protected void onResume()
    {
        super.onResume();
        startService(dvv.a(this, "com.spotify.mobile.android.service.action.client.FOREGROUND"));
        d.postDelayed(n, 2000L);
    }

    protected void onStart()
    {
        super.onStart();
        Object obj = getIntent();
        fpl.a(((Intent) (obj)).getFloatExtra("volume_level", 0.0F), i);
        obj = (ConnectDevice)((Intent) (obj)).getParcelableExtra("active_device");
        if (obj == null)
        {
            finish();
            return;
        } else
        {
            j.setText(((ConnectDevice) (obj)).d);
            int i1 = gcg.b(this, 0x7f0f00b9);
            int j1 = getResources().getDimensionPixelSize(0x7f0c00bf);
            obj = m.a(((ConnectDevice) (obj)), i1, j1);
            k.setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
            return;
        }
    }

    protected void onStop()
    {
        super.onStop();
        d.removeCallbacks(n);
    }
}
