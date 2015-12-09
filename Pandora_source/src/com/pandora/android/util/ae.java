// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageButton;
import com.pandora.android.provider.b;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import com.pandora.radio.data.z;
import com.pandora.radio.util.k;
import p.cm.ah;
import p.cw.c;
import p.dd.bb;
import p.dd.bc;
import p.dd.bd;

// Referenced classes of package com.pandora.android.util:
//            ThumbImageButton, s

public class ae
{

    public static void a(int i, ThumbImageButton thumbimagebutton, ThumbImageButton thumbimagebutton1, aa aa1)
    {
        if (i == 1)
        {
            thumbimagebutton.setChecked(false);
            thumbimagebutton1.setChecked(true);
        } else
        if (i == -1)
        {
            thumbimagebutton.setChecked(true);
            thumbimagebutton1.setChecked(false);
        } else
        {
            thumbimagebutton.setChecked(false);
            thumbimagebutton1.setChecked(false);
        }
        (new Handler()).postDelayed(new Runnable(aa1, thumbimagebutton, thumbimagebutton1) {

            final aa a;
            final ThumbImageButton b;
            final ThumbImageButton c;

            public void run()
            {
                boolean flag1 = false;
                if (a != null)
                {
                    boolean flag = flag1;
                    static class _cls2
                    {

                        static final int a[];

                        static 
                        {
                            a = new int[ac.values().length];
                            try
                            {
                                a[ac.b.ordinal()] = 1;
                            }
                            catch (NoSuchFieldError nosuchfielderror2) { }
                            try
                            {
                                a[ac.c.ordinal()] = 2;
                            }
                            catch (NoSuchFieldError nosuchfielderror1) { }
                            try
                            {
                                a[ac.a.ordinal()] = 3;
                            }
                            catch (NoSuchFieldError nosuchfielderror)
                            {
                                return;
                            }
                        }
                    }

                    switch (_cls2.a[a.l().ordinal()])
                    {
                    default:
                        throw new IllegalArgumentException((new StringBuilder()).append("toggleThumbs: unknown TrackData type ").append(a).toString());

                    case 3: // '\003'
                        flag = flag1;
                        if (!a.k())
                        {
                            flag = true;
                        }
                        // fall through

                    case 1: // '\001'
                    case 2: // '\002'
                        b.setEnabled(flag);
                        c.setEnabled(flag);
                        break;
                    }
                }
            }

            
            {
                a = aa1;
                b = thumbimagebutton;
                c = thumbimagebutton1;
                super();
            }
        }, 500L);
    }

    public static void a(ThumbImageButton thumbimagebutton, com.pandora.android.ads.c.a a1)
    {
        if (a1 != null)
        {
            a1.b("rateUp");
        }
        if (a(((View) (thumbimagebutton)), 0x7f080183))
        {
            return;
        } else
        {
            b.a.b().d().c();
            return;
        }
    }

    public static void a(aa aa1)
    {
        if (aa1 == null)
        {
            return;
        }
        if (!aa1.B())
        {
            s.a(b.a.h(), 0x7f080183);
            return;
        }
        c c1 = b.a.b();
        if (aa1.E() == 1)
        {
            c1.a(new bc(aa1, 0, true));
            (new ah()).execute(new Object[] {
                c1, aa1, Integer.valueOf(0)
            });
            return;
        } else
        {
            c1.a(new bd(p.cw.d.a.a, aa1, true));
            (new ah()).execute(new Object[] {
                b.a.b(), aa1, Integer.valueOf(1)
            });
            return;
        }
    }

    public static void a(boolean flag, ImageButton imagebutton)
    {
        imagebutton.setEnabled(true);
        if (flag)
        {
            imagebutton.setImageResource(0x7f020236);
            imagebutton.setContentDescription(s.d(0x7f0800db));
            return;
        } else
        {
            imagebutton.setImageResource(0x7f020233);
            imagebutton.setContentDescription(s.d(0x7f0800da));
            return;
        }
    }

    public static void a(boolean flag, ImageButton imagebutton, int i, int j)
    {
        if (flag)
        {
            imagebutton.setImageResource(i);
            imagebutton.setContentDescription(s.d(0x7f0800db));
            return;
        } else
        {
            imagebutton.setImageResource(j);
            imagebutton.setContentDescription(s.d(0x7f0800da));
            return;
        }
    }

    private static boolean a(View view, int i)
    {
        if (((ThumbImageButton)view).getPreventFeedback())
        {
            view = b.a.h();
            s.a(view, view.getString(i));
            return true;
        } else
        {
            return false;
        }
    }

    public static boolean a(com.pandora.android.ads.c.a a1)
    {
        Object obj = b.a.b().d();
        boolean flag;
        if (((p.cw.b) (obj)).m())
        {
            ((p.cw.b) (obj)).b(p.cw.b.c.a);
            obj = "pause";
            flag = false;
        } else
        {
            b.a.b().o().b(new z(com.pandora.radio.data.z.a.b, SystemClock.elapsedRealtime()));
            ((p.cw.b) (obj)).a(p.cw.b.c.a);
            obj = "play";
            flag = true;
        }
        if (a1 != null)
        {
            a1.b(((String) (obj)));
        }
        return flag;
    }

    public static void b(com.pandora.android.ads.c.a a1)
    {
        b.a.b().o().b(new z(com.pandora.radio.data.z.a.g, SystemClock.elapsedRealtime()));
        b.a.b().d().b("NowPlaying skip button");
        if (a1 != null)
        {
            a1.b("skip");
        }
    }

    public static void b(ThumbImageButton thumbimagebutton, com.pandora.android.ads.c.a a1)
    {
        if (a1 != null)
        {
            a1.b("rateDown");
        }
        if (a(thumbimagebutton, 0x7f080183))
        {
            return;
        } else
        {
            b.a.b().o().b(new z(com.pandora.radio.data.z.a.h, SystemClock.elapsedRealtime()));
            b.a.b().d().d();
            return;
        }
    }

    public static void b(aa aa1)
    {
        if (aa1 == null)
        {
            return;
        }
        if (!aa1.B())
        {
            s.a(b.a.h(), 0x7f080183);
            return;
        }
        c c1 = b.a.b();
        if (aa1.E() == -1)
        {
            c1.a(new bc(aa1, 0, true));
            (new ah()).execute(new Object[] {
                c1, aa1, Integer.valueOf(0)
            });
            return;
        } else
        {
            c1.a(new bb(p.cw.d.a.a, aa1, true));
            (new ah()).execute(new Object[] {
                b.a.b(), aa1, Integer.valueOf(-1)
            });
            return;
        }
    }
}
