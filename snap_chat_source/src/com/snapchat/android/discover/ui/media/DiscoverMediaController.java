// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.media;

import Ii;
import Jr;
import Mf;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.media.AudioManager;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.snapchat.android.Timber;
import wB;

// Referenced classes of package com.snapchat.android.discover.ui.media:
//            DiscoverVideoSeekBar

public class DiscoverMediaController extends MediaController
    implements DiscoverVideoSeekBar.a
{

    android.widget.MediaController.MediaPlayerControl a;
    public DiscoverVideoSeekBar b;
    public TextView c;
    public ImageButton d;
    public ImageButton e;
    public ImageButton f;
    public ImageButton g;
    public boolean h;
    private final AudioManager i;
    private ObjectAnimator j;
    private final Paint k;
    private View l;
    private boolean m;
    private wB n;
    private Runnable o = new Runnable() {

        private DiscoverMediaController a;

        public final void run()
        {
            if (DiscoverMediaController.b(a) != null)
            {
                DiscoverMediaController.c(a);
                DiscoverMediaController.e(a).postDelayed(DiscoverMediaController.d(a), 100L);
            }
        }

            
            {
                a = DiscoverMediaController.this;
                super();
            }
    };
    private android.view.View.OnClickListener p = new android.view.View.OnClickListener() {

        private DiscoverMediaController a;

        public final void onClick(View view)
        {
            view = a;
            if (a.isShowing())
            {
                view.hide();
                return;
            } else
            {
                view.show();
                return;
            }
        }

            
            {
                a = DiscoverMediaController.this;
                super();
            }
    };
    private android.view.View.OnClickListener q = new android.view.View.OnClickListener() {

        private DiscoverMediaController a;

        public final void onClick(View view)
        {
            boolean flag1;
            if (!view.isSelected())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            view.setSelected(flag1);
            a.a(view.isSelected());
        }

            
            {
                a = DiscoverMediaController.this;
                super();
            }
    };
    private android.view.View.OnClickListener r = new android.view.View.OnClickListener() {

        private DiscoverMediaController a;

        public final void onClick(View view)
        {
            boolean flag1 = DiscoverMediaController.b(a).isPlaying();
            view.setSelected(flag1);
            view = a;
            if (flag1)
            {
                ((DiscoverMediaController) (view)).a.pause();
                return;
            } else
            {
                ((DiscoverMediaController) (view)).a.start();
                view.c();
                return;
            }
        }

            
            {
                a = DiscoverMediaController.this;
                super();
            }
    };
    private android.view.View.OnClickListener s = new android.view.View.OnClickListener() {

        private DiscoverMediaController a;

        public final void onClick(View view)
        {
            if (DiscoverMediaController.f(a) == null) goto _L2; else goto _L1
_L1:
            view = DiscoverMediaController.f(a);
            ((wB) (view)).b;
            JVM INSTR lookupswitch 3: default 56
        //                       1: 64
        //                       16: 73
        //                       4096: 81;
               goto _L3 _L4 _L5 _L6
_L3:
            a.d();
_L2:
            return;
_L4:
            view.b(16);
            continue; /* Loop/switch isn't completed */
_L5:
            view.b(1);
            continue; /* Loop/switch isn't completed */
_L6:
            view.b(1);
            if (true) goto _L3; else goto _L7
_L7:
        }

            
            {
                a = DiscoverMediaController.this;
                super();
            }
    };

    public DiscoverMediaController(Context context)
    {
        this(context, true);
    }

    public DiscoverMediaController(Context context, boolean flag)
    {
        AudioManager audiomanager = (AudioManager)context.getSystemService("audio");
        Mf.a();
        this(context, flag, audiomanager);
    }

    private DiscoverMediaController(Context context, boolean flag, AudioManager audiomanager)
    {
        super(context, flag);
        k = new Paint();
        h = false;
        m = false;
        i = audiomanager;
    }

    static void a(DiscoverMediaController discovermediacontroller)
    {
        discovermediacontroller.b(false);
    }

    public static boolean a(MotionEvent motionevent, View view)
    {
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        return f2 >= (float)view.getTop() && f2 <= (float)view.getBottom() && f1 >= (float)view.getLeft() && f1 <= (float)view.getRight();
    }

    static android.widget.MediaController.MediaPlayerControl b(DiscoverMediaController discovermediacontroller)
    {
        return discovermediacontroller.a;
    }

    private void b(boolean flag)
    {
        f.setClickable(flag);
        e.setClickable(flag);
        g.setClickable(flag);
        d.setClickable(flag);
        b.setClickable(flag);
    }

    static void c(DiscoverMediaController discovermediacontroller)
    {
        discovermediacontroller.c();
    }

    static Runnable d(DiscoverMediaController discovermediacontroller)
    {
        return discovermediacontroller.o;
    }

    static DiscoverVideoSeekBar e(DiscoverMediaController discovermediacontroller)
    {
        return discovermediacontroller.b;
    }

    static wB f(DiscoverMediaController discovermediacontroller)
    {
        return discovermediacontroller.n;
    }

    public final void a()
    {
        Timber.c("DiscoverMediaController", "begin scrubbing invoked.", new Object[0]);
        show(0);
        h = true;
        m = true;
    }

    public final void a(float f1, boolean flag)
    {
label0:
        {
            Timber.c("DiscoverMediaController", "Scrubbing to %f percent and continuePlaying: %b", new Object[] {
                Float.valueOf(f1), Boolean.valueOf(flag)
            });
            if (a != null && f1 >= 0.0F && f1 <= 1.0F)
            {
                int i1 = (int)((float)a.getDuration() * f1);
                a.seekTo(i1);
                if (!flag)
                {
                    break label0;
                }
                a.start();
            }
            return;
        }
        a.pause();
    }

    public final void a(boolean flag)
    {
        Timber.c("DiscoverMediaController", "toggleMute, mute: %b", new Object[] {
            Boolean.valueOf(flag)
        });
        i.setStreamMute(3, flag);
    }

    public final void b()
    {
        Timber.c("DiscoverMediaController", "end scrubbing invoked.", new Object[0]);
        m = false;
        h = false;
        show(500);
    }

    final void c()
    {
        if (a != null && isShowing()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (b == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int i1 = a.getDuration();
        float f1;
        String s1;
        if (i1 <= 0)
        {
            f1 = 0.0F;
        } else
        {
            int j1 = a.getCurrentPosition();
            if (j1 >= i1)
            {
                f1 = 1.0F;
            } else
            {
                f1 = (float)j1 / (float)i1;
            }
        }
        b.setProgress(f1);
        if (c == null) goto _L1; else goto _L3
_L3:
        s1 = Ii.a(a.getCurrentPosition());
        c.setText(s1);
        return;
    }

    public final void d()
    {
        if (e != null && n != null)
        {
            e.setSelected(n.a());
        }
    }

    public void hide()
    {
        if (m)
        {
            Timber.c("DiscoverMediaController", "Skipping hide since is scrubbing is true.", new Object[0]);
        } else
        {
            Timber.c("DiscoverMediaController", "Hiding the mediaController", new Object[0]);
            j.cancel();
            if (l != null)
            {
                l.setAlpha(0.0F);
                return;
            }
        }
    }

    public boolean isShowing()
    {
        return l != null && l.getAlpha() > 0.0F;
    }

    public void setAnchorView(View view)
    {
        l = view;
        l.setAlpha(0.0F);
        j = ObjectAnimator.ofFloat(l, View.ALPHA, new float[] {
            1.0F, 0.0F
        });
        j.setDuration(500L);
        j.addListener(new Jr() {

            private DiscoverMediaController a;

            public final void onAnimationEnd(Animator animator)
            {
                DiscoverMediaController.a(a);
            }

            
            {
                a = DiscoverMediaController.this;
                super();
            }
        });
        view = l;
        ((RelativeLayout)view.findViewById(0x7f0d026a)).setOnClickListener(p);
        g = (ImageButton)view.findViewById(0x7f0d0270);
        g.setOnClickListener(q);
        g.setImageResource(0x7f020123);
        f = (ImageButton)view.findViewById(0x7f0d0271);
        f.setOnClickListener(r);
        f.setImageResource(0x7f02012d);
        e = (ImageButton)view.findViewById(0x7f0d0272);
        e.setOnClickListener(s);
        e.setImageResource(0x7f02011d);
        if (n != null)
        {
            e.setSelected(n.a());
        } else
        {
            e.setSelected(false);
        }
        view.findViewById(0x7f0d026f);
        c = (TextView)view.findViewById(0x7f0d026e);
        d = (ImageButton)view.findViewById(0x7f0d026c);
        b = (DiscoverVideoSeekBar)view.findViewById(0x7f0d026d);
        b.setColor(k);
        b.setSeekBarCallback(this);
        b.postDelayed(o, 100L);
    }

    public void setCloseSignOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        if (d != null)
        {
            d.setOnClickListener(onclicklistener);
        }
    }

    public void setColor(int i1, int j1)
    {
        Timber.c("DiscoverMediaController", "setting colors: primaryColor %d, secondaryColor %d", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1)
        });
        k.setColor(i1);
    }

    public void setMediaPlayer(android.widget.MediaController.MediaPlayerControl mediaplayercontrol)
    {
        a = mediaplayercontrol;
    }

    public void setRotateLayoutHelper(wB wb)
    {
        n = wb;
    }

    public void show()
    {
        show(3000);
    }

    public void show(int i1)
    {
        if (m)
        {
            Timber.c("DiscoverMediaController", "Skipping show since is scrubbing is true.", new Object[0]);
        } else
        {
            Timber.c("DiscoverMediaController", "Showing media controls with %d timeout", new Object[] {
                Integer.valueOf(i1)
            });
            if (l != null && l.getWindowToken() != null)
            {
                j.cancel();
                l.setAlpha(1.0F);
                b(true);
                if (i1 != 0)
                {
                    j.setStartDelay(i1);
                    j.start();
                    return;
                }
            }
        }
    }
}
