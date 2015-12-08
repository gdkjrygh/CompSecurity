// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.a.g;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

final class ba
{

    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;

    public ba(View view)
    {
        a = (TextView)view.findViewById(0x1020014);
        b = (TextView)view.findViewById(0x1020015);
        c = (ImageView)view.findViewById(0x1020007);
        d = (ImageView)view.findViewById(0x1020008);
        e = (ImageView)view.findViewById(g.edit_query);
    }
}
