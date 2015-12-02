// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.qihoo.security.locale.widget.LocaleTextView;
import java.util.ArrayList;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            FileBrowseActivity, a, d, e, 
//            b

private class d extends BaseAdapter
{

    final FileBrowseActivity a;
    private final a b;
    private final b c;
    private final ArrayList d;

    public int getCount()
    {
        return d.size();
    }

    public Object getItem(int i)
    {
        return d.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        d d1;
        if (view == null)
        {
            view = LayoutInflater.from(FileBrowseActivity.o(a)).inflate(0x7f030098, null);
            viewgroup = new <init>(a, null);
            viewgroup.g = (CheckBox)view.findViewById(0x7f0b01ff);
            viewgroup.h = (FrameLayout)view.findViewById(0x7f0b01fe);
            viewgroup.b = (LocaleTextView)view.findViewById(0x7f0b01fc);
            viewgroup.f = (ImageView)view.findViewById(0x7f0b01f8);
            viewgroup.e = (ImageView)view.findViewById(0x7f0b01f7);
            viewgroup.a = (LocaleTextView)view.findViewById(0x7f0b01fa);
            viewgroup.d = (LocaleTextView)view.findViewById(0x7f0b01fb);
            viewgroup.c = (LocaleTextView)view.findViewById(0x7f0b01fd);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (c)view.getTag();
        }
        d1 = b.a(i);
        if (d1 == null) goto _L2; else goto _L1
_L1:
        ((b) (viewgroup)).a.setLocalText(d1.a);
        ((a) (viewgroup)).d.setLocalText(e.a(FileBrowseActivity.o(a), d1.f));
        if (d1.d)
        {
            if (FileBrowseActivity.i(a))
            {
                ((a) (viewgroup)).b.setVisibility(8);
                ((b) (viewgroup)).c.setVisibility(4);
                ((c) (viewgroup)).f.setImageResource(0x7f020132);
            } else
            {
                ((f) (viewgroup)).c.setVisibility(8);
                ((c) (viewgroup)).b.setVisibility(0);
                ((b) (viewgroup)).b.setLocalText((new StringBuilder()).append("(").append(d1.e).append(")").toString());
                ((b) (viewgroup)).e.setVisibility(8);
                ((e) (viewgroup)).f.setImageResource(0x7f020132);
            }
        } else
        {
            ((f) (viewgroup)).b.setVisibility(8);
            ((b) (viewgroup)).c.setVisibility(0);
            ((c) (viewgroup)).c.setLocalText(e.a(d1.c));
            c.a(d1, ((c) (viewgroup)).f, ((f) (viewgroup)).e);
        }
        if (FileBrowseActivity.i(a))
        {
            ((a) (viewgroup)).h.setVisibility(0);
        }
        ((h) (viewgroup)).g.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(d1) {

            final d a;
            final FileBrowseActivity.a b;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
label0:
                {
                    if (FileBrowseActivity.i(b.a))
                    {
                        a.g = flag;
                        if (!flag)
                        {
                            break label0;
                        }
                        compoundbutton.setButtonDrawable(0x7f02006c);
                    }
                    return;
                }
                compoundbutton.setButtonDrawable(0x7f02006d);
            }

            
            {
                b = FileBrowseActivity.a.this;
                a = d1;
                super();
            }
        });
        if (!d1.g) goto _L4; else goto _L3
_L3:
        ((_cls1.a) (viewgroup)).g.setChecked(true);
        if (FileBrowseActivity.i(a))
        {
            ((a) (viewgroup)).g.setButtonDrawable(0x7f02006c);
        }
_L6:
        viewgroup = b.d();
        i = a.getResources().getColor(0x7f080050);
        if (!d1.b.equals(viewgroup))
        {
            break; /* Loop/switch isn't completed */
        }
        view.setBackgroundColor(a.getResources().getColor(0x7f08004f));
_L2:
        return view;
_L4:
        ((tResources) (viewgroup)).g.setChecked(false);
        if (FileBrowseActivity.i(a))
        {
            ((a) (viewgroup)).g.setButtonDrawable(0x7f02006d);
        }
        if (true) goto _L6; else goto _L5
_L5:
        view.setBackgroundColor(i);
        return view;
    }

    public _cls1.a(FileBrowseActivity filebrowseactivity, ArrayList arraylist, a a1, b b1)
    {
        a = filebrowseactivity;
        super();
        b = a1;
        c = b1;
        d = arraylist;
    }
}
