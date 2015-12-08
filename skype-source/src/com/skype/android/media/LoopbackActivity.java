// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.hardware.Camera;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.skype.android.media:
//            CamcorderCallback, VideoTextureView, CamcorderView, Size, 
//            ShaderEffect

public class LoopbackActivity extends Activity
    implements android.widget.AdapterView.OnItemSelectedListener, CamcorderCallback
{

    private CamcorderView a;
    private VideoTextureView b;
    private boolean c;
    private ArrayAdapter d;

    public LoopbackActivity()
    {
    }

    static CamcorderView a(LoopbackActivity loopbackactivity)
    {
        return loopbackactivity.a;
    }

    static boolean a(LoopbackActivity loopbackactivity, boolean flag)
    {
        loopbackactivity.c = flag;
        return flag;
    }

    static boolean b(LoopbackActivity loopbackactivity)
    {
        return loopbackactivity.c;
    }

    public void onBackPressed()
    {
        if (b != null && b.getVisibility() == 0)
        {
            b.setVisibility(8);
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().addFlags(1152);
        bundle = new ShapeDrawable(new RectShape());
        bundle.getPaint().setColor(-1);
        getWindow().setBackgroundDrawable(bundle);
        a = new CamcorderView(this);
        a.setDebug(true);
        a.setTargetVideoSize(Size.f);
        a.setCamcorderCallback(this);
        a.setKeepScreenOn(true);
        a.initialize();
        bundle = new Button(this);
        Object obj;
        Object obj1;
        Object obj2;
        int i;
        if (Camera.getNumberOfCameras() > 1)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        bundle.setVisibility(i);
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            final LoopbackActivity a;

            public final void onClick(View view)
            {
                int j = 1;
                view = LoopbackActivity.a(a);
                if (LoopbackActivity.a(a).getCameraFacing() == 1)
                {
                    j = 0;
                }
                view.setCameraFacing(j);
            }

            
            {
                a = LoopbackActivity.this;
                super();
            }
        });
        obj = new ShapeDrawable(new OvalShape());
        ((ShapeDrawable) (obj)).setIntrinsicWidth(50);
        ((ShapeDrawable) (obj)).setIntrinsicHeight(50);
        ((ShapeDrawable) (obj)).getPaint().setColor(0xff888888);
        bundle.setBackgroundDrawable(((Drawable) (obj)));
        obj = new Button(this);
        obj1 = new ShapeDrawable(new OvalShape());
        ((ShapeDrawable) (obj1)).setIntrinsicWidth(100);
        ((ShapeDrawable) (obj1)).setIntrinsicHeight(100);
        ((ShapeDrawable) (obj1)).setBounds(new Rect(0, 0, 100, 100));
        ((ShapeDrawable) (obj1)).getPaint().setColor(0xffff0000);
        obj2 = new ShapeDrawable(new OvalShape());
        ((ShapeDrawable) (obj2)).setIntrinsicHeight(25);
        ((ShapeDrawable) (obj2)).setIntrinsicWidth(25);
        ((ShapeDrawable) (obj2)).getPaint().setColor(-1);
        ((ShapeDrawable) (obj2)).setBounds(new Rect(0, 0, 25, 25));
        ((Button) (obj)).setBackgroundDrawable(new LayerDrawable(new Drawable[] {
            obj1, obj2
        }));
        ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final LoopbackActivity a;

            public final void onClick(View view)
            {
                if (LoopbackActivity.b(a))
                {
                    LoopbackActivity.a(a).c();
                    LoopbackActivity.a(a, false);
                    Toast.makeText(view.getContext(), "Stopped recording", 0).show();
                    return;
                } else
                {
                    LoopbackActivity.a(a).b();
                    Toast.makeText(view.getContext(), "Recording", 0).show();
                    LoopbackActivity.a(a, true);
                    return;
                }
            }

            
            {
                a = LoopbackActivity.this;
                super();
            }
        });
        obj1 = new Spinner(this);
        obj2 = new HashMap();
        ((Map) (obj2)).put("none", ShaderEffect.a);
        ((Map) (obj2)).put("black & white", ShaderEffect.b);
        ((Map) (obj2)).put("grayscale red", ShaderEffect.e);
        ((Map) (obj2)).put("posterization", ShaderEffect.i);
        ((Map) (obj2)).put("sepia", ShaderEffect.g);
        ((Map) (obj2)).put("emboss", ShaderEffect.o);
        ((Map) (obj2)).put("xray", ShaderEffect.f);
        ((Map) (obj2)).put("dent", ShaderEffect.j);
        ((Map) (obj2)).put("twirl", ShaderEffect.l);
        ((Map) (obj2)).put("stretch", ShaderEffect.n);
        ((Map) (obj2)).put("squeeze", ShaderEffect.m);
        d = new ArrayAdapter(this, new ArrayList(((Map) (obj2)).entrySet())) {

            final LoopbackActivity a;

            public final View getDropDownView(int j, View view, ViewGroup viewgroup)
            {
                view = super.getView(j, view, viewgroup);
                ((TextView)view.findViewById(0x1020014)).setText((CharSequence)((java.util.Map.Entry)getItem(j)).getKey());
                return view;
            }

            
            {
                a = LoopbackActivity.this;
                super(context, 0x1090009, list);
            }
        };
        ((Spinner) (obj1)).setAdapter(d);
        ((Spinner) (obj1)).setOnItemSelectedListener(this);
        obj2 = new FrameLayout(this);
        ((FrameLayout) (obj2)).addView(a);
        ((FrameLayout) (obj2)).addView(((View) (obj)), new android.widget.FrameLayout.LayoutParams(200, 200, 81));
        obj = new android.widget.FrameLayout.LayoutParams(80, 80, 0x800055);
        ((android.widget.FrameLayout.LayoutParams) (obj)).setMargins(20, 20, 20, 20);
        ((FrameLayout) (obj2)).addView(bundle, ((android.view.ViewGroup.LayoutParams) (obj)));
        setContentView(((View) (obj2)), new android.view.ViewGroup.LayoutParams(-1, -1));
        ((FrameLayout) (obj2)).addView(((View) (obj1)), new android.widget.LinearLayout.LayoutParams(600, 200, 80F));
    }

    protected void onDestroy()
    {
        a.onDestroy();
        super.onDestroy();
    }

    public void onError(int i)
    {
    }

    public void onException(Throwable throwable)
    {
        throwable.printStackTrace();
    }

    public void onFileRecorded(File file)
    {
        if (b == null)
        {
            b = new VideoTextureView(this);
            addContentView(b, new android.view.ViewGroup.LayoutParams(-1, -1));
            b.setLooping(true);
            b.setMediaController(new MediaController(this));
            b.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

                final LoopbackActivity a;

                public final void onPrepared(MediaPlayer mediaplayer)
                {
                    mediaplayer.start();
                }

            
            {
                a = LoopbackActivity.this;
                super();
            }
            });
        }
        b.setVisibility(0);
        b.setVideoPath(file.getAbsolutePath());
    }

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            adapterview = (java.util.Map.Entry)d.getItem(i);
            a.setShaderEffect((ShaderEffect)adapterview.getValue());
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    protected void onPause()
    {
        a.onPause();
        super.onPause();
    }

    public void onRecording()
    {
    }

    protected void onResume()
    {
        super.onResume();
        a.onResume();
    }

    public void onStoppable()
    {
    }
}
