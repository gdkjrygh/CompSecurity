// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v4.widget:
//            m

public abstract class bb extends m
{

    private int j;
    private int k;
    private LayoutInflater l;

    public bb(Context context, int i)
    {
        super(context);
        k = i;
        j = i;
        l = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public bb(Context context, int i, byte byte0)
    {
        super(context, (byte)0);
        k = i;
        j = i;
        l = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return l.inflate(j, viewgroup, false);
    }

    public final View b(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return l.inflate(k, viewgroup, false);
    }
}
