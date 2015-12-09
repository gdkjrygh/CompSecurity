// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.content.res.Resources;
import android.widget.AutoCompleteTextView;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.pandora.android.util:
//            ac

public class x
{

    private ac a;
    private List b;
    private List c;

    public x(Context context)
    {
        b = Arrays.asList(context.getResources().getStringArray(0x7f0e0000));
        c = Arrays.asList(context.getResources().getStringArray(0x7f0e0001));
        a = new ac(context, 0x1090003, b);
    }

    public String a(String s)
    {
        int i = b.indexOf(s);
        if (i >= 0)
        {
            return (String)c.get(i);
        } else
        {
            return s;
        }
    }

    public void a(boolean flag, AutoCompleteTextView autocompletetextview)
    {
        if (flag)
        {
            autocompletetextview.setAdapter(a);
            a.notifyDataSetChanged();
            return;
        } else
        {
            autocompletetextview.setAdapter((ac)null);
            return;
        }
    }
}
