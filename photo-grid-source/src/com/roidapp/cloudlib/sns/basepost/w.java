// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.load.b.e;
import com.bumptech.glide.p;
import com.roidapp.baselib.view.RoundImageView;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ao;
import com.roidapp.cloudlib.ap;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.b.a;
import com.roidapp.cloudlib.sns.b.b;
import com.roidapp.cloudlib.sns.b.x;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            x, y, ac, PostCommentsTextView, 
//            ab, at, aa, z

public final class w extends BaseAdapter
    implements android.view.View.OnClickListener
{

    private Fragment a;
    private Context b;
    private List c;
    private com.roidapp.cloudlib.sns.basepost.at d;
    private Drawable e;
    private Pattern f;
    private TextPaint g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    public w(Fragment fragment, List list, com.roidapp.cloudlib.sns.basepost.at at1)
    {
        f = Pattern.compile("[#|@]\\w+");
        a = fragment;
        b = fragment.getActivity();
        c = list;
        d = at1;
        m = b.getResources().getColor(ao.d);
    }

    static com.roidapp.cloudlib.sns.basepost.at a(w w1)
    {
        return w1.d;
    }

    private void a(SpannableStringBuilder spannablestringbuilder, CharSequence charsequence)
    {
        for (charsequence = f.matcher(charsequence); charsequence.find();)
        {
            String s = charsequence.group();
            if (s.startsWith("#"))
            {
                spannablestringbuilder.setSpan(new com.roidapp.cloudlib.sns.basepost.x(this, s, k, l), charsequence.start() + 0, charsequence.end() + 0, 33);
            } else
            {
                spannablestringbuilder.setSpan(new y(this, i, j, s), charsequence.start() + 0, charsequence.end() + 0, 33);
            }
        }

    }

    static List b(w w1)
    {
        return w1.c;
    }

    static Context c(w w1)
    {
        return w1.b;
    }

    public final void a(long l1)
    {
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            if (a1.b != l1 || a1.e != b.b)
            {
                continue;
            }
            a1.e = b.c;
            break;
        } while (true);
    }

    public final void a(long l1, a a1)
    {
        int j1 = c.size();
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < j1)
                {
                    a a2 = (a)c.get(i1);
                    if (a2.b != l1 || a2.e != b.b)
                    {
                        break label0;
                    }
                    a1.e = b.a;
                    c.set(i1, a1);
                }
                return;
            }
            i1++;
        } while (true);
    }

    public final void a(a a1)
    {
        c.add(0, a1);
    }

    public final void a(List list)
    {
        c = list;
    }

    public final int getCount()
    {
        if (c == null)
        {
            return 0;
        } else
        {
            return c.size();
        }
    }

    public final Object getItem(int i1)
    {
        if (c == null || c.isEmpty())
        {
            return null;
        } else
        {
            return (a)c.get(getCount() - 1 - i1);
        }
    }

    public final long getItemId(int i1)
    {
        return 0L;
    }

    public final View getView(int i1, View view, ViewGroup viewgroup)
    {
        a a1;
        Object obj;
        String s;
        int j1;
        if (view == null)
        {
            view = LayoutInflater.from(b).inflate(as.r, viewgroup, false);
            viewgroup = new ac();
            viewgroup.a = (RoundImageView)view.findViewById(ar.ae);
            viewgroup.b = (TextView)view.findViewById(ar.af);
            viewgroup.c = (TextView)view.findViewById(ar.ad);
            viewgroup.d = (PostCommentsTextView)view.findViewById(ar.P);
            viewgroup.e = (ProgressBar)view.findViewById(ar.ac);
            ((ac) (viewgroup)).b.setOnClickListener(this);
            ((ac) (viewgroup)).a.setOnClickListener(this);
            ((ac) (viewgroup)).c.setOnClickListener(this);
            g = new TextPaint();
            g.setAntiAlias(true);
            g.setColor(Color.parseColor("#384238"));
            g.setTextSize(b.getResources().getDimensionPixelSize(ap.i));
            i = Color.parseColor("#00ca72");
            j = Color.parseColor("#00844a");
            k = Color.parseColor("#1de9b6");
            l = Color.parseColor("#19cea1");
            h = b.getResources().getDisplayMetrics().widthPixels - (int)(b.getResources().getDisplayMetrics().density * 72F);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ac)view.getTag();
        }
        i1 = getCount() - 1 - i1;
        a1 = (a)c.get(i1);
        obj = a1.d;
        if (a != null)
        {
            com.bumptech.glide.h.a(a).a(((x) (obj)).h).i().a().a(e.c).a(new com.roidapp.cloudlib.sns.e.a(((ac) (viewgroup)).a));
        }
        ((ac) (viewgroup)).a.setTag(Integer.valueOf(i1));
        ((ac) (viewgroup)).c.setTag(Integer.valueOf(i1));
        ((ac) (viewgroup)).b.setTag(Integer.valueOf(i1));
        ((ac) (viewgroup)).b.setText(((x) (obj)).b);
        obj = ((ac) (viewgroup)).d;
        s = a1.c;
        if (!TextUtils.isEmpty(s))
        {
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s);
            a(spannablestringbuilder, s);
            ((PostCommentsTextView) (obj)).a(new StaticLayout(spannablestringbuilder, g, h, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 1.0F, true));
        } else
        {
            ((PostCommentsTextView) (obj)).a();
        }
        j1 = a1.e;
        i1 = j1;
        if (j1 == 0)
        {
            i1 = b.a;
            a1.e = i1;
        }
        com.roidapp.cloudlib.sns.basepost.ab.a[i1 - 1];
        JVM INSTR tableswitch 1 3: default 508
    //                   1 554
    //                   2 599
    //                   3 629;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_629;
_L5:
        if (d.b(a1.a))
        {
            view.setBackgroundColor(m);
            return view;
        } else
        {
            view.setBackgroundColor(-1);
            return view;
        }
_L2:
        ((ac) (viewgroup)).e.setVisibility(8);
        ((ac) (viewgroup)).c.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        ((ac) (viewgroup)).c.setText(com.roidapp.cloudlib.sns.h.a().a(b, a1.b));
          goto _L5
_L3:
        ((ac) (viewgroup)).e.setVisibility(0);
        ((ac) (viewgroup)).c.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        ((ac) (viewgroup)).c.setText(null);
          goto _L5
        ((ac) (viewgroup)).e.setVisibility(8);
        if (e == null)
        {
            e = b.getResources().getDrawable(0x1080041);
        }
        ((ac) (viewgroup)).c.setCompoundDrawablesWithIntrinsicBounds(e, null, null, null);
        ((ac) (viewgroup)).c.setText(null);
          goto _L5
    }

    public final void onClick(View view)
    {
        int i1 = view.getId();
        if (i1 != ar.af) goto _L2; else goto _L1
_L1:
        i1 = ((Integer)view.getTag()).intValue();
        view = ((a)c.get(i1)).d;
        com.roidapp.baselib.c.b.a("SNS", "click", "SNS/ToPersonalCenter/FromCommentUserName/Click");
        al.g().a(b, "SNS", "click", "SNS/ToPersonalCenter/FromCommentUserName/Click", Long.valueOf(1L));
        if (d != null)
        {
            d.a(view, null);
        }
_L4:
        return;
_L2:
        if (i1 != ar.ae)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = ((Integer)view.getTag()).intValue();
        view = ((a)c.get(i1)).d;
        com.roidapp.baselib.c.b.a("SNS", "click", "SNS/ToPersonalCenter/FromCommentUserAvatar/Click");
        al.g().a(b, "SNS", "click", "SNS/ToPersonalCenter/FromCommentUserAvatar/Click", Long.valueOf(1L));
        if (d == null) goto _L4; else goto _L3
_L3:
        d.a(view, null);
        return;
        if (i1 != ar.ad) goto _L4; else goto _L5
_L5:
        long l1;
        i1 = ((Integer)view.getTag()).intValue();
        view = (a)c.get(i1);
        int j1 = ((a) (view)).e;
        switch (com.roidapp.cloudlib.sns.basepost.ab.a[j1 - 1])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            break;

        case 3: // '\003'
            l1 = ((a) (view)).b;
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L6
_L6:
        view = (new android.app.AlertDialog.Builder(b)).setMessage(at.o).setCancelable(true).setPositiveButton(at.p, new aa(this, i1, l1)).setNegativeButton(at.v, new z(this, i1, l1)).create();
        view.setCanceledOnTouchOutside(true);
        view.show();
        return;
    }
}
