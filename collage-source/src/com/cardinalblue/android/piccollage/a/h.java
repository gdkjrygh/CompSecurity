// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;

public class h
{

    private h a;
    private Context b;
    private int c;
    private Intent d;

    public h(Context context)
    {
        c = 0;
        a = this;
        b = context;
        d = new Intent();
    }

    public h(Context context, Intent intent)
    {
        c = 0;
        b = context;
        a = this;
        d = intent;
    }

    public h a(int i)
    {
        c = i;
        return a;
    }

    public h a(Uri uri)
    {
        d.setData(uri);
        return a;
    }

    public h a(Bundle bundle)
    {
        d.putExtras(bundle);
        return a;
    }

    public h a(Class class1)
    {
        d.setClass(b, class1);
        return a;
    }

    public h a(String s)
    {
        d.setAction(s);
        return a;
    }

    public h a(String s, int i)
    {
        d.putExtra(s, i);
        return a;
    }

    public h a(String s, Parcelable parcelable)
    {
        d.putExtra(s, parcelable);
        return a;
    }

    public h a(String s, String s1)
    {
        d.putExtra(s, s1);
        return a;
    }

    public h b(int i)
    {
        d.addFlags(i);
        return a;
    }

    public h b(String s)
    {
        d.setType(s);
        return a;
    }

    public PendingIntent c(int i)
    {
        return PendingIntent.getActivity(b, c, d, i);
    }

    public h c(String s)
    {
        return a(Uri.parse(s));
    }

    public PendingIntent d(int i)
    {
        return PendingIntent.getService(b, c, d, i);
    }
}
