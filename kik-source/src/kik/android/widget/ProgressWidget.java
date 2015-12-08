// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kik.cache.MaskedContentPreviewImage;
import java.lang.ref.WeakReference;
import kik.android.chat.KikApplication;
import kik.android.e.e;
import kik.android.util.ac;
import kik.android.util.av;
import kik.android.util.cv;

// Referenced classes of package kik.android.widget:
//            db, ProgressWheel, dd, dc

public class ProgressWidget extends LinearLayout
{

    private static final int d = KikApplication.e(0x7f0c004e);
    private final int a = 10;
    private final int b = 1;
    private final int c = 2;
    private ProgressWheel e;
    private ImageView f;
    private WeakReference g;
    private View h[];
    private View i;
    private View j;
    private View k;
    private MaskedContentPreviewImage l;
    private TextView m;
    private final Handler n = new db(this);

    public ProgressWidget(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        LayoutInflater.from(context).inflate(0x7f030060, this);
        m = (TextView)findViewById(0x7f0e013f);
        cv.a(m, ac.a);
        f = (ImageView)findViewById(0x7f0e013e);
        context = findViewById(0x7f0e013d);
        context.setPadding(context.getPaddingLeft() + KikApplication.a(2), context.getPaddingTop(), context.getPaddingLeft() + KikApplication.a(2), context.getPaddingBottom());
    }

    static WeakReference a(ProgressWidget progresswidget)
    {
        return progresswidget.g;
    }

    private void a(int i1)
    {
        if (e != null)
        {
            float f1 = (float)Math.max(i1, 10) / 100F;
            if (f1 > e.b())
            {
                e.a(f1);
            }
        }
    }

    static void a(ProgressWidget progresswidget, int i1)
    {
        progresswidget.a(i1);
    }

    private void a(boolean flag)
    {
label0:
        {
            if (l != null)
            {
                if (!flag)
                {
                    break label0;
                }
                l.c(d);
            }
            return;
        }
        l.a();
    }

    static void b(ProgressWidget progresswidget)
    {
        cv.b(progresswidget.h);
        av.a(progresswidget.e, 200, new dd(progresswidget));
        cv.e(new View[] {
            progresswidget.k
        });
        progresswidget.a(false);
    }

    private void c()
    {
        if (h != null)
        {
            cv.e(h);
            setVisibility(0);
        }
        cv.e(new View[] {
            e, k
        });
        cv.b(new View[] {
            f, m
        });
        if (j != null && i != null)
        {
            i.setVisibility(0);
        }
        a(true);
        a(10);
    }

    static void c(ProgressWidget progresswidget)
    {
        progresswidget.c();
    }

    private void d()
    {
        cv.e(new View[] {
            e, k
        });
        cv.e(h);
        cv.b(new View[] {
            f, m, i
        });
        a(true);
    }

    static void d(ProgressWidget progresswidget)
    {
        progresswidget.d();
    }

    private void e()
    {
        if (e != null && k != null)
        {
            e.setBackgroundResource(0x7f0c0086);
        }
    }

    static void e(ProgressWidget progresswidget)
    {
        cv.b(new View[] {
            progresswidget.e, progresswidget.k
        });
        cv.b(progresswidget.h);
        progresswidget.e();
        progresswidget.a(10);
        cv.e(new View[] {
            progresswidget.f, progresswidget.m, progresswidget.i
        });
        progresswidget.a(false);
    }

    static void f(ProgressWidget progresswidget)
    {
        cv.b(new View[] {
            progresswidget.e, progresswidget.k
        });
        cv.b(progresswidget.h);
        progresswidget.e();
        cv.e(new View[] {
            progresswidget.f, progresswidget.m, progresswidget.i
        });
        progresswidget.a(false);
    }

    public final void a()
    {
        n.sendEmptyMessage(1);
    }

    public final void a(android.view.View.OnClickListener onclicklistener)
    {
        if (j != null)
        {
            j.setOnClickListener(onclicklistener);
        }
    }

    public final void a(View view)
    {
        k = view;
    }

    public final void a(View view, View view1)
    {
        i = view;
        j = view1;
        break MISSING_BLOCK_LABEL_10;
        if (i != null && g != null)
        {
            view = (e)g.get();
            if (view != null)
            {
                if (view.b() == -1 || view.b() == 1)
                {
                    i.setVisibility(0);
                    a(true);
                    cv.e(h);
                    cv.e(new View[] {
                        k
                    });
                    return;
                }
                if (view.b() != 4)
                {
                    i.setVisibility(8);
                    a(false);
                    cv.b(new View[] {
                        k
                    });
                    cv.b(h);
                    return;
                }
            } else
            {
                i.setVisibility(8);
                return;
            }
        }
        return;
    }

    public final void a(MaskedContentPreviewImage maskedcontentpreviewimage)
    {
        if (l != null)
        {
            l.a();
        }
        l = maskedcontentpreviewimage;
    }

    public final void a(WeakReference weakreference)
    {
        if (weakreference == null)
        {
            return;
        }
        g = weakreference;
        if (h != null)
        {
            weakreference = (e)g.get();
            if (weakreference != null && weakreference.b() != 4)
            {
                setVisibility(0);
                weakreference.a(new dc(this));
                if (weakreference.b() == -1)
                {
                    c();
                    return;
                }
                if (weakreference.b() == 1)
                {
                    d();
                    a(weakreference.a());
                    return;
                }
            } else
            {
                setVisibility(8);
            }
        }
        a();
    }

    public final void a(ProgressWheel progresswheel)
    {
        if (progresswheel == null || e == progresswheel)
        {
            return;
        } else
        {
            e = progresswheel;
            e.a();
            a(10);
            return;
        }
    }

    public final void a(View aview[])
    {
        h = aview;
    }

    public final void b()
    {
        d();
        n.sendEmptyMessage(2);
    }

    public final void b(android.view.View.OnClickListener onclicklistener)
    {
        if (k != null)
        {
            k.setOnClickListener(onclicklistener);
        }
    }

}
