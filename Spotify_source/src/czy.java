// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class czy extends dab
{

    private final Map c = new HashMap();

    public czy(List list, String s, daf daf)
    {
        super(list, s, daf, true);
    }

    public final void a()
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext(); ((TextView)entry.getKey()).removeTextChangedListener((TextWatcher)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        c.clear();
    }

    public final void a(View view)
    {
        if (view instanceof TextView)
        {
            view = (TextView)view;
            czz czz1 = new czz(this, view);
            TextWatcher textwatcher = (TextWatcher)c.get(view);
            if (textwatcher != null)
            {
                view.removeTextChangedListener(textwatcher);
            }
            view.addTextChangedListener(czz1);
            c.put(view, czz1);
        }
    }

    public final volatile void b(View view)
    {
        super.b(view);
    }
}
