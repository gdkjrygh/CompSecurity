// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter;

import android.content.Context;
import android.os.Environment;
import com.roidapp.cloudlib.al;
import com.roidapp.imagelib.a;
import com.roidapp.imagelib.b.d;
import com.roidapp.photogrid.common.b;
import com.roidapp.photogrid.release.ap;
import com.roidapp.photogrid.release.hw;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public final class c
    implements a
{

    public c()
    {
    }

    public final String a()
    {
        return al.c;
    }

    public final String a(Context context)
    {
        return ap.a(context);
    }

    public final void a(String s)
    {
        com.roidapp.photogrid.common.b.a(s);
    }

    public final Integer[] a(Context context, String s)
    {
        ArrayList arraylist = new ArrayList(Arrays.asList(new Integer[] {
            Integer.valueOf(1660), Integer.valueOf(1024), Integer.valueOf(960), Integer.valueOf(720), Integer.valueOf(640), Integer.valueOf(480), Integer.valueOf(320)
        }));
        if (hw.H(context))
        {
            arraylist.add(0, Integer.valueOf(1660));
        }
        if (hw.f(context))
        {
            arraylist.add(0, Integer.valueOf(2048));
        }
        context = new Integer[arraylist.size()];
        arraylist.toArray(context);
        context = d.a(s, context);
        (new StringBuilder("save min length is ")).append(Arrays.toString(context));
        return context;
    }

    public final Integer[] a(String s, int i)
    {
        Object obj;
        Integer ainteger[];
        if (i >= 1280)
        {
            obj = new Integer[8];
            obj[0] = Integer.valueOf(1920);
            obj[1] = Integer.valueOf(1660);
            obj[2] = Integer.valueOf(1024);
            obj[3] = Integer.valueOf(960);
            obj[4] = Integer.valueOf(720);
            obj[5] = Integer.valueOf(640);
            obj[6] = Integer.valueOf(480);
            obj[7] = Integer.valueOf(320);
        } else
        {
            obj = new Integer[7];
            obj[0] = Integer.valueOf(1660);
            obj[1] = Integer.valueOf(1024);
            obj[2] = Integer.valueOf(960);
            obj[3] = Integer.valueOf(720);
            obj[4] = Integer.valueOf(640);
            obj[5] = Integer.valueOf(480);
            obj[6] = Integer.valueOf(320);
        }
        obj = new ArrayList(Arrays.asList(((Object []) (obj))));
        ainteger = new Integer[((ArrayList) (obj)).size()];
        ((ArrayList) (obj)).toArray(ainteger);
        s = d.a(s, ainteger);
        (new StringBuilder("save min length is ")).append(Arrays.toString(s));
        return s;
    }

    public final String b(Context context)
    {
        return (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(context.getString(0x7f07002e)).toString();
    }
}
