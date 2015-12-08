// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Jo;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

public class CustomVolumeView extends LinearLayout
{
    public static final class VolumeViewType extends Enum
    {

        private static final VolumeViewType $VALUES[];
        public static final VolumeViewType HERE;
        public static final VolumeViewType MEDIA;

        public static VolumeViewType valueOf(String s)
        {
            return (VolumeViewType)Enum.valueOf(com/snapchat/android/ui/CustomVolumeView$VolumeViewType, s);
        }

        public static VolumeViewType[] values()
        {
            return (VolumeViewType[])$VALUES.clone();
        }

        static 
        {
            MEDIA = new VolumeViewType("MEDIA", 0);
            HERE = new VolumeViewType("HERE", 1);
            $VALUES = (new VolumeViewType[] {
                MEDIA, HERE
            });
        }

        private VolumeViewType(String s, int j)
        {
            super(s, j);
        }
    }


    public ArrayList a;
    public VolumeViewType b;
    private int c;
    private int d;
    private int e;
    private AudioManager f;
    private Context g;
    private Runnable h;
    private ObjectAnimator i;

    public CustomVolumeView(Context context)
    {
        super(context);
        a = new ArrayList();
        b = VolumeViewType.MEDIA;
        a(context, (AudioManager)context.getSystemService("audio"));
    }

    protected CustomVolumeView(Context context, AudioManager audiomanager)
    {
        super(context);
        a = new ArrayList();
        b = VolumeViewType.MEDIA;
        a(context, audiomanager);
    }

    public CustomVolumeView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ArrayList();
        b = VolumeViewType.MEDIA;
        a(context, (AudioManager)context.getSystemService("audio"));
    }

    public CustomVolumeView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a = new ArrayList();
        b = VolumeViewType.MEDIA;
        a(context, (AudioManager)context.getSystemService("audio"));
    }

    static ObjectAnimator a(CustomVolumeView customvolumeview)
    {
        return customvolumeview.i;
    }

    private void a(Context context, AudioManager audiomanager)
    {
        f = audiomanager;
        g = context;
        a();
        i = ObjectAnimator.ofFloat(this, View.ALPHA, new float[] {
            1.0F, 0.0F
        });
        i.setDuration(500L);
        i.addListener(new android.animation.Animator.AnimatorListener() {

            private CustomVolumeView a;

            public final void onAnimationCancel(Animator animator)
            {
                a.setAlpha(1.0F);
            }

            public final void onAnimationEnd(Animator animator)
            {
                a.setVisibility(8);
                a.setAlpha(1.0F);
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
            }

            
            {
                a = CustomVolumeView.this;
                super();
            }
        });
        h = new Runnable() {

            private CustomVolumeView a;

            public final void run()
            {
                CustomVolumeView.a(a).start();
            }

            
            {
                a = CustomVolumeView.this;
                super();
            }
        };
    }

    private void b()
    {
        int k = f.getStreamVolume(e);
        int j = 0;
        while (j < c) 
        {
            View view = (View)a.get(j);
            if (k == 0)
            {
                if (b == VolumeViewType.HERE && j == 0)
                {
                    view.setVisibility(0);
                    view.setAlpha(0.5F);
                } else
                {
                    view.setVisibility(4);
                }
            } else
            {
                int l = d * j;
                if (k > l)
                {
                    view.setVisibility(0);
                    view.setAlpha(1.0F);
                } else
                if (k == l)
                {
                    view.setVisibility(0);
                    view.setAlpha(0.5F);
                } else
                {
                    view.setVisibility(4);
                }
            }
            j++;
        }
    }

    public final void a()
    {
        static final class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[VolumeViewType.values().length];
                try
                {
                    a[VolumeViewType.MEDIA.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[VolumeViewType.HERE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3.a[b.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 204
    //                   2 223;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_223;
_L1:
        c = 8;
        d = 2;
        e = 3;
_L4:
        boolean flag = Jo.f(g);
        int j;
        int k;
        int j1;
        if (flag)
        {
            j = Jo.a(g);
        } else
        {
            j = Jo.b(g);
        }
        if (flag)
        {
            k = Jo.b(g);
        } else
        {
            k = Jo.a(g);
        }
        j1 = (int)((double)k * 0.0088000000000000005D);
        j = (int)((double)j * 0.0040200000000000001D);
        k = 0;
        while (k < c) 
        {
            View view = new View(g);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, j1, 1.0F);
            int l;
            int i1;
            if (k == 0)
            {
                l = 0;
            } else
            {
                l = j;
            }
            if (k == c - 1)
            {
                i1 = 0;
            } else
            {
                i1 = j;
            }
            layoutparams.setMargins(l, 0, i1, 0);
            view.setLayoutParams(layoutparams);
            view.setBackgroundColor(-1);
            a.add(view);
            addView(view);
            k++;
        }
        break MISSING_BLOCK_LABEL_276;
_L2:
        c = 8;
        d = 2;
        e = 3;
          goto _L4
        c = 5;
        d = 1;
        e = 0;
          goto _L4
        b();
        return;
    }

    public final void a(int j)
    {
        removeCallbacks(h);
        i.cancel();
        f.adjustStreamVolume(e, j, 0);
        b();
        setVisibility(0);
        postDelayed(h, 500L);
    }
}
