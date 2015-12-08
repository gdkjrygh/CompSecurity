// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bumptech.glide.a;
import com.bumptech.glide.d;
import com.bumptech.glide.load.b.e;
import com.roidapp.baselib.view.RoundImageView;
import com.roidapp.cloudlib.ao;
import com.roidapp.cloudlib.ap;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.b.c;
import com.roidapp.cloudlib.sns.b.h;
import com.roidapp.cloudlib.sns.b.i;
import com.roidapp.cloudlib.sns.b.k;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.q;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.basepost.PostCommentsTextView;
import com.roidapp.cloudlib.sns.g.b;
import com.roidapp.cloudlib.sns.o;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            j, k, l, i, 
//            m, n, g, h, 
//            o

public final class f extends BaseAdapter
{

    private Fragment a;
    private Context b;
    private ListView c;
    private List d;
    private android.view.View.OnClickListener e;
    private int f;
    private TextPaint g;
    private Pattern h;
    private int i;
    private int j;
    private int k;
    private com.roidapp.cloudlib.sns.notification.o l;

    public f(Fragment fragment, ListView listview, android.view.View.OnClickListener onclicklistener)
    {
        h = Pattern.compile("[#|@]\\w+");
        a = fragment;
        b = fragment.getActivity();
        c = listview;
        d = null;
        e = onclicklistener;
        fragment = b.getResources().getDisplayMetrics();
        f = ((DisplayMetrics) (fragment)).widthPixels - (int)(((DisplayMetrics) (fragment)).density * 70F) - (int)(((DisplayMetrics) (fragment)).density * 100F);
        g = new TextPaint();
        g.setAntiAlias(true);
        g.setColor(Color.parseColor("#384248"));
        i = Color.parseColor("#00ca72");
        j = Color.parseColor("#00844a");
        k = Color.parseColor("#384248");
    }

    static Context a(f f1)
    {
        return f1.b;
    }

    private void a(SpannableStringBuilder spannablestringbuilder, CharSequence charsequence, int i1)
    {
        for (charsequence = h.matcher(charsequence); charsequence.find();)
        {
            String s = charsequence.group();
            if (s.startsWith("#"))
            {
                spannablestringbuilder.setSpan(new j(this, s, i, j), charsequence.start() + i1, charsequence.end() + i1, 33);
                spannablestringbuilder.setSpan(new AbsoluteSizeSpan(b.getResources().getDimensionPixelSize(ap.k), false), charsequence.start() + i1, charsequence.end() + i1, 33);
            } else
            {
                spannablestringbuilder.setSpan(new com.roidapp.cloudlib.sns.notification.k(this, i, j, s), charsequence.start() + i1, charsequence.end() + i1, 33);
                spannablestringbuilder.setSpan(new AbsoluteSizeSpan(b.getResources().getDimensionPixelSize(ap.k), false), charsequence.start() + i1, charsequence.end() + i1, 33);
            }
        }

    }

    static void a(f f1, h h1)
    {
        p p1 = q.a(f1.b).c();
        com.roidapp.cloudlib.sns.g.b.a().b(h1.c, p1);
        com.roidapp.cloudlib.sns.q.b(p1.a, p1.b.a, h1.c.a, new l(f1, h1, p1)).a(f1);
    }

    static void a(f f1, String s, String s1, String s2, h h1, int i1, PostCommentsTextView postcommentstextview)
    {
        f1.a(s, s1, s2, h1, i1, postcommentstextview);
    }

    private void a(String s, String s1, String s2, h h1, int i1, PostCommentsTextView postcommentstextview)
    {
        h1 = com.roidapp.cloudlib.sns.h.a().a(b, h1.f);
        h1 = (new StringBuilder()).append(s).append(s1).append(s2).append(". ").append(h1).toString();
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(h1);
        spannablestringbuilder.setSpan(new AbsoluteSizeSpan(b.getResources().getDimensionPixelSize(ap.k), false), 0, s.length(), 33);
        spannablestringbuilder.setSpan(new com.roidapp.cloudlib.sns.notification.i(this, i, j, i1, i1), 0, s.length(), 33);
        spannablestringbuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#384248")), s.length(), s.length() + s1.length(), 33);
        spannablestringbuilder.setSpan(new AbsoluteSizeSpan(b.getResources().getDimensionPixelSize(ap.k), false), s.length(), s.length() + s1.length(), 33);
        a(spannablestringbuilder, ((CharSequence) (s2)), s.length() + s1.length());
        spannablestringbuilder.setSpan(new AbsoluteSizeSpan(b.getResources().getDimensionPixelSize(ap.k), false), s.length() + s1.length(), s.length() + s1.length() + s2.length(), 33);
        spannablestringbuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#384248")), s.length() + s1.length() + s2.length(), s.length() + s1.length() + s2.length() + ". ".length(), 33);
        spannablestringbuilder.setSpan(new AbsoluteSizeSpan(b.getResources().getDimensionPixelSize(ap.k), false), s.length() + s1.length() + s2.length(), s.length() + s1.length() + s2.length() + ". ".length(), 33);
        spannablestringbuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#8f8f8f")), s.length() + s1.length() + s2.length() + ". ".length(), h1.length(), 33);
        spannablestringbuilder.setSpan(new AbsoluteSizeSpan(b.getResources().getDimensionPixelSize(ap.l), false), s.length() + s1.length() + s2.length() + ". ".length(), h1.length(), 33);
        postcommentstextview.a(new StaticLayout(spannablestringbuilder, g, f, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 1.0F, true));
    }

    static List b(f f1)
    {
        return f1.d;
    }

    static void b(f f1, h h1)
    {
        p p1 = q.a(f1.b).c();
        com.roidapp.cloudlib.sns.g.b.a().b(h1.c, p1);
        com.roidapp.cloudlib.sns.q.a(p1.a, p1.b.a, h1.c.a, new m(f1, h1, p1)).a(f1);
    }

    static android.view.View.OnClickListener c(f f1)
    {
        return f1.e;
    }

    static com.roidapp.cloudlib.sns.notification.o d(f f1)
    {
        return f1.l;
    }

    public final void a(int i1)
    {
        if (d != null)
        {
            Iterator iterator = d.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                h h1 = (h)iterator.next();
                if (h1.d != null && h1.d.a == i1)
                {
                    iterator.remove();
                }
            } while (true);
        }
    }

    public final void a(com.roidapp.cloudlib.sns.notification.o o1)
    {
        l = o1;
    }

    public final void a(List list)
    {
        d = list;
    }

    public final h b(int i1)
    {
        if (d == null)
        {
            return null;
        } else
        {
            return (h)d.get(i1);
        }
    }

    public final int getCount()
    {
        if (d == null)
        {
            return 0;
        } else
        {
            return d.size();
        }
    }

    public final Object getItem(int i1)
    {
        return b(i1);
    }

    public final long getItemId(int i1)
    {
        return 0L;
    }

    public final View getView(int i1, View view, ViewGroup viewgroup)
    {
        if (d == null)
        {
            return null;
        }
        n n1;
        View view1;
        h h1;
        PostCommentsTextView postcommentstextview;
        String s;
        if (view == null)
        {
            view1 = LayoutInflater.from(b).inflate(as.M, viewgroup, false);
            n1 = new n();
            n1.a = (RoundImageView)view1.findViewById(ar.dn);
            n1.b = (PostCommentsTextView)view1.findViewById(ar.n);
            n1.c = (TextView)view1.findViewById(ar.aP);
            n1.d = (ImageView)view1.findViewById(ar.aQ);
            n1.e = (ProgressBar)view1.findViewById(ar.aR);
            n1.e.setVisibility(8);
            n1.a.setOnClickListener(e);
            n1.d.setOnClickListener(e);
            n1.c.setOnClickListener(new g(this, n1));
            if (((h)d.get(i1)).a == i.b)
            {
                n1.c.setVisibility(0);
                n1.d.setVisibility(8);
            } else
            {
                n1.c.setVisibility(8);
                n1.d.setVisibility(0);
            }
            view1.setTag(n1);
        } else
        {
            n1 = (n)view.getTag();
            view1 = view;
        }
        h1 = (h)d.get(i1);
        com.roidapp.cloudlib.sns.g.b.a();
        view = com.roidapp.cloudlib.sns.g.b.a(h1.c);
        if (h1.a == i.b)
        {
            n1.c.setVisibility(0);
            n1.d.setVisibility(8);
            viewgroup = com.roidapp.cloudlib.sns.g.f.a(view, h1.c.q);
            if (viewgroup == c.c)
            {
                n1.e.setVisibility(8);
                n1.c.setText(b.getString(at.N));
                n1.c.setTextColor(Color.parseColor("#ffffff"));
                n1.c.setBackgroundResource(aq.k);
            } else
            if (viewgroup == c.b)
            {
                n1.e.setVisibility(8);
                n1.c.setText(b.getString(at.P));
                n1.c.setTextColor(b.getResources().getColor(ao.a));
                n1.c.setBackgroundResource(aq.K);
            } else
            {
                n1.e.setVisibility(0);
                n1.c.setText("");
                n1.c.setBackgroundResource(aq.K);
            }
        } else
        {
            n1.e.setVisibility(8);
            n1.c.setVisibility(8);
            n1.d.setVisibility(0);
            viewgroup = n1.d;
            com.bumptech.glide.h.a(a).a(h1.d.e).g().b(com.roidapp.baselib.b.a.b()).a(viewgroup);
        }
        if (h1.c != null && view != null)
        {
            h1.c.b = com.roidapp.cloudlib.sns.g.f.a(view, h1.c.b);
            h1.c.h = com.roidapp.cloudlib.sns.g.f.b(view, h1.c.h);
            view = com.roidapp.cloudlib.sns.g.f.a(view);
        } else
        {
            view = null;
        }
        viewgroup = n1.a;
        if (view == null)
        {
            com.bumptech.glide.h.a(a).a(h1.c.h).i().a().a(e.c).a(new com.roidapp.cloudlib.sns.e.a(viewgroup));
        } else
        {
            com.bumptech.glide.h.a(a).a(h1.c.h).i().a(com.bumptech.glide.h.a(a).a(view).i()).a().a(e.c).a(new com.roidapp.cloudlib.sns.e.a(viewgroup));
        }
        postcommentstextview = n1.b;
        if (h1 == null) goto _L2; else goto _L1
_L1:
        s = h1.c.b;
        viewgroup = "";
        if (h1.a != i.b) goto _L4; else goto _L3
_L3:
        view = " started following you";
_L7:
        a(s, view, viewgroup, h1, i1, postcommentstextview);
_L2:
        n1.c.setTag(Integer.valueOf(i1));
        n1.a.setTag(Integer.valueOf(i1));
        n1.d.setTag(Integer.valueOf(i1));
        return view1;
_L4:
        if (h1.a == i.a)
        {
            view = " liked your photo";
            continue; /* Loop/switch isn't completed */
        }
        if (h1.a == i.c)
        {
            view = " left a comment on your photo:";
            viewgroup = h1.b;
            continue; /* Loop/switch isn't completed */
        }
        if (h1.a == i.e)
        {
            view = " mentioned you in a comment:";
            viewgroup = h1.b;
            continue; /* Loop/switch isn't completed */
        }
        view = " mentioned you in a post:";
        if (!h1.d.l)
        {
            break; /* Loop/switch isn't completed */
        }
        com.roidapp.cloudlib.sns.b.k.a(postcommentstextview, h1.d.d, new com.roidapp.cloudlib.sns.notification.h(this, s, " mentioned you in a post:", "", h1, i1));
        if (true) goto _L2; else goto _L5
_L5:
        viewgroup = h1.d.d;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
