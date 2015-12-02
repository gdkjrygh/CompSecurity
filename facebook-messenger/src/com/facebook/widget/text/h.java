// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.text;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.google.common.a.es;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.widget.text:
//            l, i, g

class h
    implements l
{

    private h()
    {
    }

    h(g g)
    {
        this();
    }

    private StaticLayout a(List list, TextPaint textpaint, int j, android.text.Layout.Alignment alignment)
    {
        if (list == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        list = list.iterator();
        for (boolean flag = true; list.hasNext(); flag = false)
        {
            String s = (String)list.next();
            if (!flag)
            {
                stringbuilder.append("\n");
            }
            stringbuilder.append(s);
        }

        list = stringbuilder.toString();
        return new StaticLayout(list, 0, list.length(), textpaint, 16384, alignment, 1.0F, 0.0F, false, android.text.TextUtils.TruncateAt.END, j);
    }

    private i a(List list, String s, int j, int k, int i1)
    {
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            TextPaint textpaint = (TextPaint)iterator.next();
            if (a(textpaint, s, j))
            {
                return new i(textpaint, es.a(s));
            }
        }

        return new i((TextPaint)list.get(list.size() - 1), es.a(s));
    }

    private boolean a(TextPaint textpaint, String s, int j)
    {
        return textpaint.measureText(s) <= (float)j;
    }

    public volatile Layout a(Object obj, List list, int j, android.text.Layout.Alignment alignment, int k, int i1)
    {
        return a((String)obj, list, j, alignment, k, i1);
    }

    public Layout a(String s, List list, int j, android.text.Layout.Alignment alignment, int k, int i1)
    {
        boolean flag = true;
        if (k != 1)
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        s = a(list, s, j, k, i1);
        return a(((i) (s)).b, ((i) (s)).a, j, alignment);
    }
}
