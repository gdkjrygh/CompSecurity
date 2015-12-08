// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package in.srain.cube.views.ptr;

import afA;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package in.srain.cube.views.ptr:
//            PtrFrameLayout

public class PtrClassicDefaultHeader extends FrameLayout
    implements afA
{
    final class a
        implements Runnable
    {

        private boolean a;
        private PtrClassicDefaultHeader b;

        static void a(a a1)
        {
            if (!TextUtils.isEmpty(PtrClassicDefaultHeader.a(a1.b)))
            {
                a1.a = true;
                a1.run();
            }
        }

        static void b(a a1)
        {
            a1.a = false;
            a1.b.removeCallbacks(a1);
        }

        public final void run()
        {
            PtrClassicDefaultHeader.b(b);
            if (a)
            {
                b.postDelayed(this, 1000L);
            }
        }

        private a()
        {
            b = PtrClassicDefaultHeader.this;
            super();
            a = false;
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private int b;
    private RotateAnimation c;
    private RotateAnimation d;
    private TextView e;
    private View f;
    private View g;
    private long h;
    private TextView i;
    private String j;
    private boolean k;
    private a l;

    public PtrClassicDefaultHeader(Context context)
    {
        super(context);
        b = 150;
        h = -1L;
        l = new a((byte)0);
        a(((AttributeSet) (null)));
    }

    public PtrClassicDefaultHeader(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 150;
        h = -1L;
        l = new a((byte)0);
        a(attributeset);
    }

    public PtrClassicDefaultHeader(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = 150;
        h = -1L;
        l = new a((byte)0);
        a(attributeset);
    }

    static String a(PtrClassicDefaultHeader ptrclassicdefaultheader)
    {
        return ptrclassicdefaultheader.j;
    }

    private void a()
    {
        c = new RotateAnimation(0.0F, -180F, 1, 0.5F, 1, 0.5F);
        c.setInterpolator(new LinearInterpolator());
        c.setDuration(b);
        c.setFillAfter(true);
        d = new RotateAnimation(-180F, 0.0F, 1, 0.5F, 1, 0.5F);
        d.setInterpolator(new LinearInterpolator());
        d.setDuration(b);
        d.setFillAfter(true);
    }

    private void a(AttributeSet attributeset)
    {
        attributeset = getContext().obtainStyledAttributes(attributeset, afD.d.PtrClassicHeader, 0, 0);
        if (attributeset != null)
        {
            b = attributeset.getInt(0, b);
        }
        a();
        attributeset = LayoutInflater.from(getContext()).inflate(afD.b.cube_ptr_classic_default_header, this);
        f = attributeset.findViewById(afD.a.ptr_classic_header_rotate_view);
        e = (TextView)attributeset.findViewById(afD.a.ptr_classic_header_rotate_view_header_title);
        i = (TextView)attributeset.findViewById(afD.a.ptr_classic_header_rotate_view_header_last_update);
        g = attributeset.findViewById(afD.a.ptr_classic_header_rotate_view_progressbar);
        b();
    }

    private void b()
    {
        c();
        g.setVisibility(4);
    }

    static void b(PtrClassicDefaultHeader ptrclassicdefaultheader)
    {
        ptrclassicdefaultheader.d();
    }

    private void c()
    {
        f.clearAnimation();
        f.setVisibility(4);
    }

    private void d()
    {
        Object obj1 = null;
        if (TextUtils.isEmpty(j) || !k)
        {
            i.setVisibility(8);
            return;
        }
        if (h == -1L && !TextUtils.isEmpty(j))
        {
            h = getContext().getSharedPreferences("cube_ptr_classic_last_update", 0).getLong(j, -1L);
        }
        Object obj;
        if (h == -1L)
        {
            obj = obj1;
        } else
        {
            long l1 = (new Date()).getTime() - h;
            int i1 = (int)(l1 / 1000L);
            obj = obj1;
            if (l1 >= 0L)
            {
                obj = obj1;
                if (i1 > 0)
                {
                    obj = new StringBuilder();
                    ((StringBuilder) (obj)).append(getContext().getString(afD.c.cube_ptr_last_update));
                    if (i1 < 60)
                    {
                        ((StringBuilder) (obj)).append((new StringBuilder()).append(i1).append(getContext().getString(afD.c.cube_ptr_seconds_ago)).toString());
                    } else
                    {
                        i1 /= 60;
                        if (i1 > 60)
                        {
                            i1 /= 60;
                            if (i1 > 24)
                            {
                                Date date = new Date(h);
                                ((StringBuilder) (obj)).append(a.format(date));
                            } else
                            {
                                ((StringBuilder) (obj)).append((new StringBuilder()).append(i1).append(getContext().getString(afD.c.cube_ptr_hours_ago)).toString());
                            }
                        } else
                        {
                            ((StringBuilder) (obj)).append((new StringBuilder()).append(i1).append(getContext().getString(afD.c.cube_ptr_minutes_ago)).toString());
                        }
                    }
                    obj = ((StringBuilder) (obj)).toString();
                }
            }
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            i.setVisibility(8);
            return;
        } else
        {
            i.setVisibility(0);
            i.setText(((CharSequence) (obj)));
            return;
        }
    }

    public final void a(PtrFrameLayout ptrframelayout)
    {
        b();
        k = true;
        d();
    }

    public final void a(PtrFrameLayout ptrframelayout, boolean flag, byte byte0, int i1, int j1, float f1, float f2)
    {
        int k1 = ptrframelayout.b;
        if (j1 < k1 && i1 >= k1)
        {
            if (flag && byte0 == 2)
            {
                e.setVisibility(0);
                if (ptrframelayout.c)
                {
                    e.setText(getResources().getString(afD.c.cube_ptr_pull_down_to_refresh));
                } else
                {
                    e.setText(getResources().getString(afD.c.cube_ptr_pull_down));
                }
                if (f != null)
                {
                    f.clearAnimation();
                    f.startAnimation(d);
                }
            }
        } else
        if (j1 > k1 && i1 <= k1 && flag && byte0 == 2)
        {
            if (!ptrframelayout.c)
            {
                e.setVisibility(0);
                e.setText(afD.c.cube_ptr_release_to_refresh);
            }
            if (f != null)
            {
                f.clearAnimation();
                f.startAnimation(c);
                return;
            }
        }
    }

    public final void b(PtrFrameLayout ptrframelayout)
    {
        k = true;
        d();
        a.a(l);
        g.setVisibility(4);
        f.setVisibility(0);
        e.setVisibility(0);
        if (ptrframelayout.c)
        {
            e.setText(getResources().getString(afD.c.cube_ptr_pull_down_to_refresh));
            return;
        } else
        {
            e.setText(getResources().getString(afD.c.cube_ptr_pull_down));
            return;
        }
    }

    public final void c(PtrFrameLayout ptrframelayout)
    {
        k = false;
        c();
        g.setVisibility(0);
        e.setVisibility(0);
        e.setText(afD.c.cube_ptr_refreshing);
        d();
        a.b(l);
    }

    public final void d(PtrFrameLayout ptrframelayout)
    {
        c();
        g.setVisibility(4);
        e.setVisibility(0);
        e.setText(getResources().getString(afD.c.cube_ptr_refresh_complete));
        ptrframelayout = getContext().getSharedPreferences("cube_ptr_classic_last_update", 0);
        if (!TextUtils.isEmpty(j))
        {
            h = (new Date()).getTime();
            ptrframelayout.edit().putLong(j, h).commit();
        }
    }

    public void setLastUpdateTimeKey(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            j = s;
            return;
        }
    }

    public void setLastUpdateTimeRelateObject(Object obj)
    {
        setLastUpdateTimeKey(obj.getClass().getName());
    }

    public void setRotateAniTime(int i1)
    {
        if (i1 == b || i1 == 0)
        {
            return;
        } else
        {
            b = i1;
            a();
            return;
        }
    }

}
