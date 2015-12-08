// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableAdapter extends ArrayAdapter
{

    public IterableAdapter(Context context, int i)
    {
        super(context, i);
    }

    public IterableAdapter(Context context, int i, int j)
    {
        super(context, i, j);
    }

    public IterableAdapter(Context context, int i, int j, Iterable iterable)
    {
        super(context, i, j, toList(iterable));
    }

    public IterableAdapter(Context context, int i, Iterable iterable)
    {
        super(context, i, toList(iterable));
    }

    protected static List toList(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add(iterable.next())) { }
        return arraylist;
    }
}
