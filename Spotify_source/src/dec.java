// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.Set;

public final class dec
    implements ddv
{

    ProgressBar a;
    private deg b;
    private dee c;
    private ded d;
    private def e;
    private final Handler f = new Handler();
    private Set g;
    private Runnable h;

    public dec(Context context, deh deh1, Picasso picasso, String s, Set set)
    {
        h = new Runnable() {

            private dec a;

            public final void run()
            {
                a.a.setVisibility(0);
            }

            
            {
                a = dec.this;
                super();
            }
        };
        g = set;
        e = new def(context);
        b = new deg(context);
        c = new dee(b, deh1.h, picasso);
        d = new ded(context, b, s);
        a = b.f;
        a(deh1);
    }

    public final LinearLayout a()
    {
        return b.b;
    }

    public final void a(deh deh1)
    {
        Object obj4 = c;
        String s1 = deh1.a;
        int i = deh1.b;
        String s = deh1.c;
        Object obj1 = deh1.d;
        Object obj5 = deh1.e;
        boolean flag2 = deh1.f;
        com.spotify.android.paste.graphics.SpotifyIcon spotifyicon = deh1.g;
        Object obj3 = (dib)((dcn) (((dee) (obj4)).b)).j;
        ImageView imageview = ((dib) (obj3)).d();
        ((dee) (obj4)).e.a(((android.net.Uri) (obj5))).a(dgf.a).a(0x7f02018e).a(((dee) (obj4)).d.d);
        obj5 = ((dee) (obj4)).e.a(((android.net.Uri) (obj5)));
        ((gwb) (obj5)).a(dff.a(((dee) (obj4)).a, spotifyicon));
        if (flag2)
        {
            ((gwb) (obj5)).a(gft.a(imageview));
        } else
        {
            ((gwb) (obj5)).a(imageview, null);
        }
        if (!flag2)
        {
            imageview.setBackgroundColor(((dee) (obj4)).c);
        }
        ((dib) (obj3)).a(s1);
        if (i != -1)
        {
            obj4 = ((dib) (obj3)).a();
            ((TextView) (obj4)).setSingleLine(false);
            ((TextView) (obj4)).setMaxLines(i);
            ((TextView) (obj4)).setEllipsize(android.text.TextUtils.TruncateAt.END);
        } else
        {
            dee.a(((dib) (obj3)).a());
        }
        dee.a(((dib) (obj3)).b());
        if (!TextUtils.isEmpty(s))
        {
            ((dib) (obj3)).c(s);
        } else
        {
            ((dib) (obj3)).b(((CharSequence) (obj1)));
        }
        obj1 = d;
        obj3 = deh1.i;
        s = deh1.j;
        obj4 = ((ded) (obj1)).a;
        if (TextUtils.isEmpty(((CharSequence) (obj3))))
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((TextView) (obj4)).setVisibility(i);
        ((ded) (obj1)).a.setText(((CharSequence) (obj3)));
        ((ded) (obj1)).a();
        obj1 = ((ded) (obj1)).c.g;
        if (TextUtils.isEmpty(s))
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((TextView) (obj1)).setVisibility(i);
        ((TextView) (obj1)).setText(s);
        if (deh1.l)
        {
            a.setVisibility(4);
            f.postDelayed(h, 200L);
        } else
        {
            f.removeCallbacks(h);
            a.setVisibility(8);
            LinearLayout linearlayout = b.h;
            linearlayout.removeAllViews();
            List list = deh1.k;
            int j = 0;
            while (j < list.size()) 
            {
                Object obj;
                Object obj2;
                dei dei1;
                android.graphics.drawable.Drawable drawable;
                CharSequence charsequence;
                dhw dhw1;
                boolean flag;
                boolean flag1;
                int k;
                int l;
                int i1;
                int j1;
                boolean flag3;
                if (j == list.size() - 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                dei1 = (dei)list.get(j);
                if (!deh1.m && g.contains(Integer.valueOf(dei1.a)))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                obj = e;
                drawable = dei1.b;
                charsequence = dei1.c;
                if (drawable != null)
                {
                    obj = dhv.c(((def) (obj)).a, linearlayout);
                    obj2 = ((dhx)((dcn) (obj)).j).d();
                } else
                {
                    obj = dhv.b(((def) (obj)).a, linearlayout);
                    obj2 = null;
                }
                dhw1 = (dhw)((dcn) (obj)).j;
                if (obj2 != null)
                {
                    ((ImageView) (obj2)).setScaleType(android.widget.ImageView.ScaleType.CENTER);
                    ((ImageView) (obj2)).setImageDrawable(drawable);
                } else
                {
                    dhw1.a().setGravity(17);
                }
                dhw1.a(charsequence);
                obj2 = ((dcn) (obj)).a;
                k = ((View) (obj2)).getPaddingBottom();
                l = ((View) (obj2)).getPaddingTop();
                i1 = ((View) (obj2)).getPaddingRight();
                j1 = ((View) (obj2)).getPaddingLeft();
                ((View) (obj2)).setBackgroundResource(0x7f0200df);
                ((View) (obj2)).setPadding(j1, l, i1, k);
                ((dhu) (obj)).e(true);
                if (flag)
                {
                    ((dhu) (obj)).e(false);
                }
                obj = ((dcn) (obj)).a;
                ((View) (obj)).setOnClickListener(dei1.e);
                if (dei1.d && !flag1)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                ((View) (obj)).setEnabled(flag3);
                linearlayout.addView(((View) (obj)));
                j++;
            }
        }
    }

    public final void b()
    {
        ded ded1 = d;
        if (ded1.a != null)
        {
            gcg.a(ded1.a.getViewTreeObserver(), ded1.d);
        }
    }
}
