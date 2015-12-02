// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.threads.ui.name;

import android.content.res.Resources;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.o;
import com.facebook.widget.text.l;
import com.google.common.a.es;
import com.google.common.base.Joiner;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.messages.threads.ui.name:
//            f, a, c, d, 
//            g

public class e
    implements l
{

    private final Resources a;
    private final a b;
    private final d c;

    public e(Resources resources, a a1, d d1)
    {
        a = resources;
        b = a1;
        c = d1;
    }

    private StaticLayout a(List list, TextPaint textpaint, int i, android.text.Layout.Alignment alignment)
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
        return new StaticLayout(list, 0, list.length(), textpaint, 16384, alignment, 1.0F, 0.0F, true, android.text.TextUtils.TruncateAt.END, i);
    }

    private f a(TextPaint textpaint, String s, int i)
    {
        if (textpaint.measureText(s) <= (float)i)
        {
            return new f(textpaint, es.a(s));
        } else
        {
            return null;
        }
    }

    private f a(List list, List list1, int i, int j, int k)
    {
        Object obj = a(list1);
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            f f1 = a((TextPaint)iterator.next(), ((String) (obj)), i);
            if (f1 != null)
            {
                return f1;
            }
        }

        if (k < 0)
        {
            k = 0x7fffffff;
        }
        list = (TextPaint)list.get(list.size() - 1);
        if (list1.size() < 2)
        {
            return new f(list, es.a(obj));
        }
        int i1 = (int)list.measureText(a(8));
        int j1 = (int)list.measureText(a(88));
        int k1 = (int)list.measureText(a(888));
        list1 = b.a(list1, i, j, k, list, new int[] {
            i1, j1, k1
        });
        obj = list1.a();
        i = ((List) (obj)).size();
        if (((List) (obj)).size() > 0 && list1.b() > 0)
        {
            ((List) (obj)).set(i - 1, (new StringBuilder()).append((String)((List) (obj)).get(i - 1)).append(a(list1.b())).toString());
        }
        return new f(list, ((List) (obj)));
    }

    private String a(int i)
    {
        return (new StringBuilder()).append(", ").append(a.getString(o.thread_name_n_more, new Object[] {
            Integer.valueOf(i)
        })).toString();
    }

    private String a(List list)
    {
        if (!list.isEmpty())
        {
            return Joiner.on(", ").join(list);
        } else
        {
            return a.getString(o.thread_name_with_only_you);
        }
    }

    public Layout a(g g1, List list, int i, android.text.Layout.Alignment alignment, int j, int k)
    {
        TextPaint textpaint = (TextPaint)list.get(0);
        if (g1 == null)
        {
            return a(((List) (es.d())), textpaint, i, alignment);
        }
        if (c == d.USE_THREAD_NAME_IF_AVAILABLE && g1.a())
        {
            return a(((List) (es.a(g1.b()))), textpaint, i, alignment);
        } else
        {
            g1 = a(list, ((List) (g1.c())), i, j, k);
            return a(((f) (g1)).b, ((f) (g1)).a, i, alignment);
        }
    }

    public volatile Layout a(Object obj, List list, int i, android.text.Layout.Alignment alignment, int j, int k)
    {
        return a((g)obj, list, i, alignment, j, k);
    }
}
