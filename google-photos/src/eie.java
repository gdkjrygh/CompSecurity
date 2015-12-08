// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

final class eie extends BaseAdapter
{

    private static final int a[];
    private static final int b[];
    private static final List c;
    private final Context d;

    eie(Context context)
    {
        d = context;
    }

    public static Set a(int i)
    {
        return (Set)c.get(i);
    }

    private TextView b(int i)
    {
        return (TextView)LayoutInflater.from(d).inflate(i, null);
    }

    public final int getCount()
    {
        return a.length;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        view = b(b.lx);
        view.setText(d.getString(b[i]));
        return view;
    }

    public final Object getItem(int i)
    {
        return d.getString(a[i]);
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = b(b.lw);
        view.setText(d.getString(a[i]));
        return view;
    }

    static 
    {
        a = (new int[] {
            b.lO, b.lP, b.lR, b.lS
        });
        b = (new int[] {
            b.lQ, b.lP, b.lR, b.lS
        });
        c = Collections.unmodifiableList(Arrays.asList(new Set[] {
            esm.e, Collections.unmodifiableSet(EnumSet.of(esm.b)), Collections.unmodifiableSet(EnumSet.of(esm.d)), Collections.unmodifiableSet(EnumSet.of(esm.c))
        }));
    }
}
