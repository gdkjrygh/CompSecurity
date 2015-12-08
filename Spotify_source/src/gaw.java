// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public final class gaw
{

    public static View a(Context context)
    {
        return LayoutInflater.from(context).inflate(0x7f0300c1, null, false);
    }

    public static ViewGroup b(Context context)
    {
        context = new LinearLayout(context);
        context.setOrientation(1);
        context.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        return context;
    }
}
