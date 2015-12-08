// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.a;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.arist.activity.MyApplication;
import com.arist.b.c;
import java.util.ArrayList;

// Referenced classes of package com.arist.a:
//            g, f

public final class e extends BaseAdapter
{

    private ArrayList a;
    private LayoutInflater b;
    private Context c;
    private int d;

    public e(Context context, ArrayList arraylist)
    {
        a = new ArrayList();
        d = MyApplication.f;
        b = LayoutInflater.from(context);
        c = context;
        a = arraylist;
    }

    static Context a(e e1)
    {
        return e1.c;
    }

    private void a(ArrayList arraylist)
    {
        a = arraylist;
        notifyDataSetChanged();
    }

    public final int a()
    {
        return d;
    }

    public final void a(int i)
    {
        d = i;
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            a(MyApplication.n);
            return;

        case 4: // '\004'
            a(MyApplication.m);
            return;

        case 2: // '\002'
            a(MyApplication.o);
            return;

        case 3: // '\003'
            a(MyApplication.l);
            return;

        case 0: // '\0'
            a(MyApplication.p);
            return;
        }
    }

    public final void a(c c1)
    {
        a.remove(c1);
        notifyDataSetChanged();
    }

    public final c b(int i)
    {
        return (c)a.get(i);
    }

    public final int getCount()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.size();
        }
    }

    public final Object getItem(int i)
    {
        return b(i);
    }

    public final long getItemId(int i)
    {
        return (long)((c)a.get(i)).d();
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        int j;
        boolean flag = false;
        Object obj;
        c c1;
        TextView textview;
        StringBuilder stringbuilder;
        if (view == null)
        {
            view = b.inflate(0x7f03001e, null);
            viewgroup = new g();
            g.a(viewgroup, (TextView)view.findViewById(0x7f060088));
            g.b(viewgroup, (TextView)view.findViewById(0x7f060089));
            g.a(viewgroup, (ImageView)view.findViewById(0x7f060086));
            g.a(viewgroup, view.findViewById(0x7f060087));
            g.b(viewgroup, view.findViewById(0x7f060085));
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (g)view.getTag();
        }
        obj = g.a(viewgroup);
        if (3 == d)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((View) (obj)).setVisibility(j);
        c1 = b(i);
        g.b(viewgroup).setText(c1.b());
        textview = com.arist.a.g.c(viewgroup);
        stringbuilder = (new StringBuilder(String.valueOf(c1.f().size()))).append(" ").append(c.getString(0x7f090056));
        if (!TextUtils.isEmpty(c1.c()))
        {
            obj = (new StringBuilder("  -  ")).append(c1.c()).toString();
        } else
        {
            obj = "";
        }
        textview.setText(stringbuilder.append(((String) (obj))).toString());
        g.d(viewgroup).setTag(c1.b());
        obj = g.d(viewgroup);
        d;
        JVM INSTR tableswitch 1 4: default 284
    //                   1 419
    //                   2 433
    //                   3 440
    //                   4 426;
           goto _L1 _L2 _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_440;
_L1:
        j = 0x7f020095;
_L6:
        ((ImageView) (obj)).setImageResource(j);
        if (c1.b().equals(MyApplication.f().b()) && MyApplication.f().c().equals(c1.c()))
        {
            view.setBackgroundColor(Color.rgb(195, 212, 222));
        } else
        {
            view.setBackgroundColor(Color.argb(0, 0, 0, 0));
        }
        obj = g.e(viewgroup);
        if (d != 3)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 8;
        }
        ((View) (obj)).setVisibility(j);
        g.e(viewgroup).setOnClickListener(new f(this, i));
        return view;
_L2:
        j = 0x7f020091;
          goto _L6
_L5:
        j = 0x7f020092;
          goto _L6
_L3:
        j = 0x7f020093;
          goto _L6
        j = 0x7f020094;
          goto _L6
    }
}
