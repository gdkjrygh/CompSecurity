// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.afollestad.materialdialogs.internal.b;
import java.util.List;

// Referenced classes of package com.afollestad.materialdialogs:
//            f, e

class a extends BaseAdapter
{

    public RadioButton a;
    public boolean b;
    private final f c;
    private final int d;
    private final e e;

    public a(f f1, int i)
    {
        c = f1;
        d = i;
        e = f1.b.f;
    }

    private void a(ViewGroup viewgroup)
    {
        ((LinearLayout)viewgroup).setGravity(e.a() | 0x10);
        if (viewgroup.getChildCount() == 2)
        {
            if (e == e.c && !a() && (viewgroup.getChildAt(0) instanceof CompoundButton))
            {
                CompoundButton compoundbutton = (CompoundButton)viewgroup.getChildAt(0);
                viewgroup.removeView(compoundbutton);
                TextView textview = (TextView)viewgroup.getChildAt(0);
                viewgroup.removeView(textview);
                textview.setPadding(textview.getPaddingRight(), textview.getPaddingTop(), textview.getPaddingLeft(), textview.getPaddingBottom());
                viewgroup.addView(textview);
                viewgroup.addView(compoundbutton);
            } else
            if (e == e.a && a() && (viewgroup.getChildAt(1) instanceof CompoundButton))
            {
                CompoundButton compoundbutton1 = (CompoundButton)viewgroup.getChildAt(1);
                viewgroup.removeView(compoundbutton1);
                TextView textview1 = (TextView)viewgroup.getChildAt(0);
                viewgroup.removeView(textview1);
                textview1.setPadding(textview1.getPaddingRight(), textview1.getPaddingTop(), textview1.getPaddingRight(), textview1.getPaddingBottom());
                viewgroup.addView(compoundbutton1);
                viewgroup.addView(textview1);
                return;
            }
        }
    }

    private boolean a()
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            return false;
        }
        if (c.b().a().getResources().getConfiguration().getLayoutDirection() != 1)
        {
            flag = false;
        }
        return flag;
    }

    public int getCount()
    {
        if (c.b.l != null)
        {
            return c.b.l.length;
        } else
        {
            return 0;
        }
    }

    public Object getItem(int i)
    {
        return c.b.l[i];
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = LayoutInflater.from(c.getContext()).inflate(d, viewgroup, false);
        }
        viewgroup = (TextView)view.findViewById(R.id.title);
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[f.h.values().length];
                try
                {
                    a[com.afollestad.materialdialogs.f.h.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[f.h.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[c.q.ordinal()];
        JVM INSTR tableswitch 1 2: default 72
    //                   1 253
    //                   2 331;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_331;
_L4:
        viewgroup.setText(c.b.l[i]);
        viewgroup.setTextColor(c.b.Z);
        c.a(viewgroup, c.b.L);
        view.setTag((new StringBuilder()).append(i).append(":").append(c.b.l[i]).toString());
        a((ViewGroup)view);
        if (c.b.an != null)
        {
            if (i < c.b.an.length)
            {
                view.setId(c.b.an[i]);
            } else
            {
                view.setId(-1);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            viewgroup = (ViewGroup)view;
            Object obj;
            boolean flag;
            if (viewgroup.getChildCount() == 2)
            {
                if (viewgroup.getChildAt(0) instanceof CompoundButton)
                {
                    viewgroup.getChildAt(0).setBackground(null);
                } else
                if (viewgroup.getChildAt(1) instanceof CompoundButton)
                {
                    viewgroup.getChildAt(1).setBackground(null);
                    return view;
                }
            }
        }
        return view;
_L2:
        obj = (RadioButton)view.findViewById(R.id.control);
        if (c.b.I == i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.afollestad.materialdialogs.internal.b.a(((RadioButton) (obj)), c.b.q);
        ((RadioButton) (obj)).setChecked(flag);
        if (flag && b)
        {
            a = ((RadioButton) (obj));
        }
          goto _L4
        obj = (CheckBox)view.findViewById(R.id.control);
        flag = c.r.contains(Integer.valueOf(i));
        com.afollestad.materialdialogs.internal.b.a(((CheckBox) (obj)), c.b.q);
        ((CheckBox) (obj)).setChecked(flag);
          goto _L4
    }

    public boolean hasStableIds()
    {
        return true;
    }
}
