// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

final class deg
{

    final Context a;
    final LinearLayout b;
    final ViewGroup c;
    final TextView d;
    final TextView e;
    final ProgressBar f;
    final TextView g;
    final LinearLayout h;

    public deg(Context context)
    {
        a = context;
        b = (LinearLayout)LayoutInflater.from(a).inflate(0x7f0300cd, null);
        c = (ViewGroup)b.findViewById(0x7f1103ce);
        d = (TextView)b.findViewById(0x7f1102a3);
        e = (TextView)b.findViewById(0x7f1103e0);
        f = (ProgressBar)b.findViewById(0x7f1103a1);
        g = (TextView)b.findViewById(0x7f1103df);
        h = (LinearLayout)b.findViewById(0x7f1103e1);
    }
}
