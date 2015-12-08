// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.android.slyce.report.c:
//            as, ar, at

public class aq extends as
{

    private final Map a = new HashMap();

    public aq(List list, String s, at at)
    {
        super(list, s, at, true);
    }

    public void a()
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); ((TextView)entry.getKey()).removeTextChangedListener((TextWatcher)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        a.clear();
    }

    public void a(View view)
    {
        if (view instanceof TextView)
        {
            view = (TextView)view;
            ar ar1 = new ar(this, view);
            TextWatcher textwatcher = (TextWatcher)a.get(view);
            if (textwatcher != null)
            {
                view.removeTextChangedListener(textwatcher);
            }
            view.addTextChangedListener(ar1);
            a.put(view, ar1);
        }
    }

    public volatile void b(View view)
    {
        super.b(view);
    }
}
