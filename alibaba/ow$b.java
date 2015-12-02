// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

public static class f extends f
{

    public ViewGroup c;
    public ProgressBar d;
    public TextView e;
    public String f;

    public >(long l, int i, id id)
    {
        super(l, i, id);
    }

    public >(long l, int i, id id, ViewGroup viewgroup, ProgressBar progressbar, TextView textview, 
            String s)
    {
        super(l, i, id);
        c = viewgroup;
        d = progressbar;
        e = textview;
        f = s;
    }
}
