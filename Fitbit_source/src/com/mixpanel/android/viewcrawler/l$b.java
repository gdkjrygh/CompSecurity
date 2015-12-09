// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            l

public static class <init> extends <init>
{

    private final Map a = new HashMap();

    public void a()
    {
        java.util.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); ((TextView)entry.getKey()).removeTextChangedListener((TextWatcher)entry.getValue()))
        {
            entry = (java.util.Entry)iterator.next();
        }

        a.clear();
    }

    public void a(View view)
    {
        if (view instanceof TextView)
        {
            view = (TextView)view;
    /* block-local class not found */
    class a {}

            a a1 = new a(view);
            TextWatcher textwatcher = (TextWatcher)a.get(view);
            if (textwatcher != null)
            {
                view.removeTextChangedListener(textwatcher);
            }
            view.addTextChangedListener(a1);
            a.put(view, a1);
        }
    }

    public volatile void b(View view)
    {
        super.b(view);
    }

    protected String d()
    {
        return (new StringBuilder()).append(e()).append(" on Text Change").toString();
    }

    public a(List list, String s, a a1)
    {
        super(list, s, a1, true);
    }
}
