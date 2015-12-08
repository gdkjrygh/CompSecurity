// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.b.a.d;
import com.facebook.a.e;
import com.squareup.picasso.Picasso;
import com.tinder.enums.UserType;
import com.tinder.model.InstagramDataSet;
import com.tinder.model.InstagramPhoto;
import com.tinder.model.Match;
import com.tinder.model.Message;
import com.tinder.model.SparksEvent;
import com.tinder.utils.a;
import com.tinder.utils.ad;
import com.tinder.utils.g;
import com.tinder.utils.o;
import com.tinder.views.RoundImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

// Referenced classes of package com.tinder.c:
//            t

public final class s extends Dialog
    implements android.support.v4.view.ViewPager.f, android.view.View.OnClickListener
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(int i1);
    }

    public static final class b
    {

        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public int f;
        public int g;
        public float h;

        public final String toString()
        {
            return String.format("thumbail width[%s] height[%s], x[%s] y[%s], statusbarheight [%s]", new Object[] {
                Float.valueOf(a), Float.valueOf(b), Float.valueOf(c), Float.valueOf(d)
            });
        }

        public b()
        {
        }
    }


    boolean a;
    private Context b;
    private View c;
    private ViewPager d;
    private com.tinder.adapters.s e;
    private RelativeLayout f;
    private RoundImageView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private a k;
    private ImageView l;
    private b m;
    private InstagramDataSet n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private float t;
    private float u;
    private float v;
    private String w;
    private UserType x;
    private long y;
    private Match z;

    public s(Context context, Match match, int i1, int j1, InstagramDataSet instagramdataset, b b1, String s1, 
            UserType usertype, a a1)
    {
        super(context, 0x7f0b01ee);
        q = -1;
        y = 700L;
        setContentView(0x7f03005d);
        t = ad.a(b);
        u = ad.b(b);
        m = b1;
        w = s1;
        x = usertype;
        v = m.a / t;
        b = context;
        o = i1;
        p = i1;
        r = j1;
        n = instagramdataset;
        k = a1;
        z = match;
        s = (int)b.getResources().getDimension(0x7f0900f3);
        c = findViewById(0x7f0e019c);
        g = (RoundImageView)findViewById(0x7f0e019f);
        h = (TextView)findViewById(0x7f0e01a0);
        i = (TextView)findViewById(0x7f0e01a2);
        j = (TextView)findViewById(0x7f0e01a3);
        d = (ViewPager)findViewById(0x7f0e019d);
        f = (RelativeLayout)findViewById(0x7f0e019e);
        l = (ImageView)findViewById(0x7f0e01a4);
        match = new ArrayList(r);
        for (i1 = 0; i1 < r; i1++)
        {
            match.add(n.photos.get(i1));
        }

        e = new com.tinder.adapters.s(context, match, new android.view.View.OnClickListener() {

            final s a;

            public final void onClick(View view)
            {
                com.tinder.c.s.a(a);
            }

            
            {
                a = s.this;
                super();
            }
        });
        d.setOffscreenPageLimit(0);
        d.setAdapter(e);
        d.setCurrentItem(o);
        d.setOnPageChangeListener(this);
        d.setPageMargin((int)b.getResources().getDimension(0x7f0900f0));
        g.setOnClickListener(this);
        a = com.tinder.utils.o.e();
        context = n.profileImageUrl;
        if (!TextUtils.isEmpty(context))
        {
            Picasso.a(b).a(context).b(s, s).b().a(g);
        }
        context = b;
        f.post(new Runnable(context) {

            final Context a;
            final s b;

            public final void run()
            {
                float f1 = ad.a(10F, a);
                float f3 = s.f(b);
                float f2 = com.tinder.c.s.g(b).getHeight() / 2;
                f3 /= 2.0F;
                float f4 = s.c(b).getHeight();
                s.c(b).setY(f2 - f3 - f4 - f1);
            }

            
            {
                b = s.this;
                a = context;
                super();
            }
        });
        h.setText(n.username);
        i.setText(a(((InstagramPhoto)n.photos.get(o)).mTimestamp));
        if (k != null)
        {
            k.a(o);
        }
        c.setAlpha(0.0F);
        f.setAlpha(0.0F);
        d.setAlpha(0.0F);
        context = (InstagramPhoto)n.photos.get(o);
        match = new g(l) {

            final s a;

            public final void onBitmapFailed(Drawable drawable)
            {
                super.onBitmapFailed(drawable);
                a.dismiss();
            }

            public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
            {
                super.onBitmapLoaded(bitmap, loadedfrom);
                com.tinder.c.s.a(a, com.tinder.c.s.d(a));
                com.tinder.c.s.e(a);
            }

            
            {
                a = s.this;
                super(imageview);
            }
        };
        instagramdataset = Picasso.a(b);
        if (((InstagramPhoto) (context)).mUrlLarge != null)
        {
            context = ((InstagramPhoto) (context)).mUrlLarge;
        } else
        {
            context = ((InstagramPhoto) (context)).mUrlSmall;
        }
        instagramdataset.a(context).a(match);
        c(o);
    }

    private static String a(long l1)
    {
        long l2 = System.currentTimeMillis();
        l1 = l2 - l1;
        String s1;
        int i1;
        if (l1 == l2)
        {
            s1 = "%sh";
            i1 = 0;
        } else
        if (l1 >= 0x240c8400L)
        {
            s1 = "%sw";
            i1 = (int)(l1 / 0x240c8400L);
        } else
        if (l1 >= 0x5265c00L)
        {
            s1 = "%sd";
            i1 = (int)(l1 / 0x5265c00L);
        } else
        if (l1 >= 0x36ee80L)
        {
            s1 = "%sh";
            i1 = (int)(l1 / 0x36ee80L);
        } else
        {
            s1 = "%sm";
            i1 = (int)(l1 / 60000L);
        }
        return String.format(s1, new Object[] {
            Integer.valueOf(i1)
        });
    }

    private void a()
    {
        if (p != o)
        {
            Object obj = (InstagramPhoto)n.photos.get(o);
            g g1 = new g(l) {

                final s a;

                public final void onBitmapFailed(Drawable drawable)
                {
                    super.onBitmapFailed(drawable);
                    s.b(a).setAlpha(0);
                    com.tinder.c.s.a(a, false);
                }

                public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
                {
                    super.onBitmapLoaded(bitmap, loadedfrom);
                    s.b(a).setVisibility(0);
                    com.tinder.c.s.a(a, false);
                }

            
            {
                a = s.this;
                super(imageview);
            }
            };
            Picasso picasso = Picasso.a(b);
            if (((InstagramPhoto) (obj)).mUrlLarge != null)
            {
                obj = ((InstagramPhoto) (obj)).mUrlLarge;
            } else
            {
                obj = ((InstagramPhoto) (obj)).mUrlSmall;
            }
            picasso.a(((String) (obj))).a(g1);
            return;
        } else
        {
            b(false);
            return;
        }
    }

    static void a(s s1)
    {
        s1.a();
    }

    static void a(s s1, float f1)
    {
        s1.a(true, f1);
    }

    static void a(s s1, boolean flag)
    {
        s1.b(flag);
    }

    private void a(boolean flag)
    {
        float f2 = 1.0F;
        float f1;
        if (flag)
        {
            f1 = 0.0F;
        } else
        {
            f1 = 1.0F;
        }
        if (!flag)
        {
            f2 = 0.0F;
        }
        c.setAlpha(f1);
        c.animate().alpha(f2).setDuration(225L).start();
    }

    private void a(boolean flag, float f1)
    {
        float f6 = t / 2.0F;
        float f3 = u;
        float f2;
        float f4;
        float f5;
        float f7;
        float f8;
        float f9;
        float f10;
        e e1;
        int j1;
        int l1;
        boolean flag1;
        if (a)
        {
            f2 = 0.0F;
        } else
        {
            f2 = m.e;
        }
        f8 = (f2 + f3) / 2.0F;
        f7 = m.a / 2.0F;
        f9 = m.b / 2.0F;
        f10 = f8 - f9;
        f5 = m.c;
        f4 = m.d;
        f2 = f4;
        f3 = f5;
        if (!flag)
        {
            int i1 = m.f;
            int k1 = m.g;
            int i2 = i1 * k1;
            i1 = p % i2;
            i2 = o % i2;
            int j2 = i1 / k1;
            int k2 = i2 / k1;
            int l2 = p % k1;
            k1 = o % k1;
            int i3 = k2 - j2;
            f3 = k1 - l2;
            f2 = (float)i3 * (m.b + m.h * 2.0F);
            float f11 = (m.a + m.h * 2.0F) * f3;
            String.format("photo row - origin[%s],dest:[%s], offset[%s], translationY[%s]", new Object[] {
                Integer.valueOf(j2), Integer.valueOf(k2), Integer.valueOf(i3), Float.valueOf(f2)
            });
            String.format("photo column - origin[%s],dest:[%s]), offset[%s], translationX[%s]", new Object[] {
                Integer.valueOf(l2), Integer.valueOf(k1), Float.valueOf(f3), Float.valueOf(f11)
            });
            f3 = f5 + f11;
            f2 = f4 + f2;
            String.format("photo position origin:[%s] destination:[%s] ", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(i2)
            });
        }
        f5 = f3 - (f6 - f7);
        if (ad.e())
        {
            f3 = m.e;
        } else
        {
            f3 = 0.0F;
        }
        f3 = f2 - f10 - f3;
        if (flag)
        {
            f4 = f1;
        } else
        {
            f4 = 1.0F;
        }
        if (flag)
        {
            f1 = 1.0F;
        }
        if (flag)
        {
            f6 = f5;
        } else
        {
            f6 = 0.0F;
        }
        if (flag)
        {
            f5 = 0.0F;
        }
        if (flag)
        {
            f7 = f3;
        } else
        {
            f7 = 0.0F;
        }
        if (flag)
        {
            f3 = 0.0F;
        }
        String.format("instagram thumb translation \n- transXStart [%s]\n- transXEnd [%s]\n- transYStart [%s]\n- transYEnd [%s] = original thumb top[%s] - photoTop[%s]\n- startXScale [%s]\n- endXScale [%s]\n\n- screenHeight [%s]\n- midpointScreenHeight[%s]\n- thumbnailHeight[%s]- midpoint thumbnailHeight[%s]\n- statusbar height[%s]", new Object[] {
            Float.valueOf(f6), Float.valueOf(f5), Float.valueOf(f7), Float.valueOf(f3), Float.valueOf(f2), Float.valueOf(f10), Float.valueOf(f4), Float.valueOf(f1), Float.valueOf(u), Float.valueOf(f8), 
            Float.valueOf(m.b), Float.valueOf(f9), Float.valueOf(m.e)
        });
        if (flag)
        {
            j1 = 0;
        } else
        {
            j1 = 1;
        }
        if (flag)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (!flag)
        {
            l.setVisibility(0);
            d.setVisibility(4);
        }
        ad.c(l, f4);
        l.setTranslationX(f6);
        l.setTranslationY(f7);
        e1 = com.tinder.utils.a.a();
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        e1.b = flag1;
        e1.c(80D);
        e1.a(new com.facebook.a.d(f4, f1, f6, f5, f7, f3, j1, l1, flag) {

            final float a;
            final float b;
            final float c;
            final float d;
            final float e;
            final float f;
            final int g;
            final int h;
            final boolean i;
            final s j;

            public final void onSpringAtRest(e e2)
            {
                if (i)
                {
                    com.tinder.c.s.a(j, true);
                    return;
                } else
                {
                    j.dismiss();
                    return;
                }
            }

            public final void onSpringUpdate(e e2)
            {
                float f12 = (float)e2.d.a;
                ad.c(s.b(j), com.tinder.utils.o.a(f12, 0.0F, a, 1.0F, b));
                s.b(j).setTranslationX(com.tinder.utils.o.a(f12, 0.0F, c, 1.0F, d));
                s.b(j).setTranslationY(com.tinder.utils.o.a(f12, 0.0F, e, 1.0F, f));
                s.c(j).setAlpha(com.tinder.utils.o.a(f12, 0.0F, g, 1.0F, h));
            }

            
            {
                j = s.this;
                a = f1;
                b = f2;
                c = f3;
                d = f4;
                e = f5;
                f = f6;
                g = i1;
                h = j1;
                i = flag;
                super();
            }
        });
        e1.a(0.0D);
        e1.b(1.0D);
    }

    static boolean a(Message message)
    {
        return message.isFromMe();
    }

    static ImageView b(s s1)
    {
        return s1.l;
    }

    private void b(boolean flag)
    {
        int j1 = 1;
        DecelerateInterpolator decelerateinterpolator;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        if (!flag)
        {
            j1 = 0;
        }
        decelerateinterpolator = new DecelerateInterpolator();
        d.setAlpha(i1);
        d.animate().alpha(j1).setInterpolator(decelerateinterpolator).withEndAction(new Runnable(flag) {

            final boolean a;
            final s b;

            public final void run()
            {
                if (a)
                {
                    s.b(b).setVisibility(4);
                }
            }

            
            {
                b = s.this;
                a = flag;
                super();
            }
        }).start();
        if (!flag)
        {
            a(false);
            a(false, v);
        }
    }

    static RelativeLayout c(s s1)
    {
        return s1.f;
    }

    private void c(int i1)
    {
        long l1 = 0L;
        if (x != UserType.ME)
        {
            Object obj;
            int j1;
            boolean flag;
            if (q < i1)
            {
                j1 = 1;
            } else
            {
                j1 = 2;
            }
            if (i1 == n.photos.size() - 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (x == UserType.REC)
            {
                obj = new SparksEvent("Recs.ProfileInstagramPhotoViewerPage");
            } else
            if (x == UserType.MATCH)
            {
                SparksEvent sparksevent = new SparksEvent("Chat.ProfileInstagramPhotoViewerPage");
                obj = "none";
                long l2;
                if (z != null && z.hasMessages())
                {
                    l1 = com.b.a.d.a(z.getMessages()).a(com.tinder.c.t.a()).a();
                    l2 = (long)z.getMessages().size() - l1;
                    if (((Message)z.getMessages().last()).isFromMe())
                    {
                        obj = "self";
                    } else
                    {
                        obj = "other";
                    }
                } else
                {
                    l2 = 0L;
                }
                sparksevent.put("numMessagesOther", Long.valueOf(l2));
                sparksevent.put("numMessagesMe", Long.valueOf(l1));
                sparksevent.put("lastMessageFrom", obj);
                obj = sparksevent;
            } else
            {
                obj = null;
            }
            if (obj != null)
            {
                if (q != -1)
                {
                    ((SparksEvent) (obj)).put("direction", Integer.valueOf(j1));
                }
                ((SparksEvent) (obj)).put("otherId", w);
                ((SparksEvent) (obj)).put("instagramName", n.username);
                ((SparksEvent) (obj)).put("endOfPhotos", Boolean.valueOf(flag));
                com.tinder.managers.a.a(((SparksEvent) (obj)));
            }
        }
        q = i1;
    }

    static float d(s s1)
    {
        return s1.v;
    }

    static void e(s s1)
    {
        s1.a(true);
    }

    static float f(s s1)
    {
        return s1.t;
    }

    static ViewPager g(s s1)
    {
        return s1.d;
    }

    public final void a(int i1)
    {
    }

    public final void a(int i1, float f1, int j1)
    {
    }

    public final void b(int i1)
    {
        o = i1;
        if (k != null)
        {
            k.a(i1);
        }
        long l1 = ((InstagramPhoto)n.photos.get(i1)).mTimestamp;
        i.setText(a(l1));
        c(i1);
    }

    public final void dismiss()
    {
        k = null;
        super.dismiss();
    }

    public final void onBackPressed()
    {
        a();
    }

    public final void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131624351: 
        case 2131624352: 
            k.a();
            break;
        }
    }
}
