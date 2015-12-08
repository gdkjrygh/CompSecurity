// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.a.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package net.a.a:
//            c, d, a

public class e extends c
{

    private ArrayList o;
    private int p;

    public e(Context context, View view, boolean flag)
    {
        super(context, view, flag);
        o = new ArrayList();
    }

    public void a(a a1)
    {
        m.add(a1);
        TableRow tablerow;
        String s;
        android.graphics.drawable.Drawable drawable;
        View view;
        ImageView imageview;
        TextView textview;
        int i;
        if (a1 instanceof d)
        {
            i = ((d)a1).e();
        } else
        {
            i = 0;
        }
        if (i >= o.size())
        {
            tablerow = (TableRow)e.inflate(0x7f030123, j, false);
            o.add(tablerow);
            i = 1;
        } else
        {
            tablerow = (TableRow)o.get(i);
            i = 0;
        }
        s = a1.a();
        drawable = a1.b();
        view = e.inflate(p, tablerow, false);
        imageview = (ImageView)view.findViewById(0x7f1000b8);
        textview = (TextView)view.findViewById(0x7f1000b9);
        if (drawable != null)
        {
            imageview.setImageDrawable(drawable);
        } else
        {
            imageview.setVisibility(8);
        }
        if (s != null)
        {
            textview.setText(s);
        } else
        {
            textview.setVisibility(8);
        }
        view.setOnClickListener(new _cls1(a1.c(), imageview, textview));
        view.setFocusable(true);
        view.setClickable(true);
        tablerow.addView(view);
        if (i != 0)
        {
            j.addView(tablerow);
        }
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            f = e.inflate(0x7f030120, null);
            p = 0x7f030122;
        } else
        {
            f = e.inflate(0x7f03011f, null);
            p = 0x7f030121;
        }
        j = (ViewGroup)f.findViewById(0x7f10025f);
        h = (ImageView)f.findViewById(0x7f100260);
        g = (ImageView)f.findViewById(0x7f10025d);
        k = (ScrollView)f.findViewById(0x7f10025e);
        f.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        a(f);
    }

    /* member class not found */
    class _cls1 {}

}
