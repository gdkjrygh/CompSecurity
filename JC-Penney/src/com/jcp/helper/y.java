// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.text.TextUtils;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.List;

public final class y
{

    private static int a(int i)
    {
        if (i % 3 == 0)
        {
            return i / 3;
        } else
        {
            return i / 3 + 1;
        }
    }

    public static int a(List list)
    {
        int i = list.size();
        byte byte0 = 2;
        if (i > 3)
        {
            byte0 = 0;
        }
        return byte0;
    }

    public static String a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if (s.indexOf("under") != -1)
            {
                s = a(s, "\\s+");
                if (s == null)
                {
                    return "";
                } else
                {
                    return (new StringBuilder()).append("<").append(s[s.length - 1].trim()).toString();
                }
            }
            s = a(s, "-");
            if (s == null)
            {
                return "";
            } else
            {
                return (new StringBuilder()).append("<").append(s[0].trim()).toString();
            }
        } else
        {
            return "";
        }
    }

    public static void a(GridView gridview, int i)
    {
        ListAdapter listadapter = gridview.getAdapter();
        int k = a(i);
        if (listadapter != null)
        {
            int l = android.view.View.MeasureSpec.makeMeasureSpec(gridview.getWidth(), 0);
            Object obj = null;
            int j = 0;
            for (i = 0; i < k; i++)
            {
                obj = listadapter.getView(i, ((View) (obj)), gridview);
                if (i == 0)
                {
                    ((View) (obj)).setLayoutParams(new android.view.ViewGroup.LayoutParams(l, -2));
                }
                ((View) (obj)).measure(l, 0);
                j += ((View) (obj)).getMeasuredHeight();
            }

            obj = gridview.getLayoutParams();
            obj.height = (listadapter.getCount() - 1) * 10 + j;
            gridview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            gridview.requestLayout();
        }
    }

    public static void a(ListView listview)
    {
        ListAdapter listadapter = listview.getAdapter();
        if (listadapter != null)
        {
            int k = android.view.View.MeasureSpec.makeMeasureSpec(listview.getWidth(), 0);
            Object obj = null;
            int j = 0;
            for (int i = 0; i < listadapter.getCount(); i++)
            {
                obj = listadapter.getView(i, ((View) (obj)), listview);
                if (i == 0)
                {
                    ((View) (obj)).setLayoutParams(new android.view.ViewGroup.LayoutParams(k, -2));
                }
                ((View) (obj)).measure(k, 0);
                j += ((View) (obj)).getMeasuredHeight();
            }

            obj = listview.getLayoutParams();
            obj.height = listview.getDividerHeight() * (listadapter.getCount() - 1) + j;
            listview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            listview.requestLayout();
        }
    }

    private static String[] a(String s, String s1)
    {
        if (!TextUtils.isEmpty(s))
        {
            return s.split(s1);
        } else
        {
            return null;
        }
    }

    public static String b(String s)
    {
        s = a(s, "\\s+");
        if (s == null)
        {
            return "";
        } else
        {
            return s[s.length - 1].trim();
        }
    }

    public static int c(String s)
    {
        if (s.equals("Average Rating"))
        {
            return 2;
        }
        if (s.equals("Bed Size") | s.equals("Top Construction"))
        {
            return 0;
        }
        return !s.equals("PRICE_RANGE") ? 4 : 1;
    }
}
