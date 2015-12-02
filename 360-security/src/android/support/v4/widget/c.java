// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;

class c extends Filter
{
    static interface a
    {

        public abstract Cursor a();

        public abstract Cursor a(CharSequence charsequence);

        public abstract void a(Cursor cursor);

        public abstract CharSequence c(Cursor cursor);
    }


    a a;

    c(a a1)
    {
        a = a1;
    }

    public CharSequence convertResultToString(Object obj)
    {
        return a.c((Cursor)obj);
    }

    protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
    {
        charsequence = a.a(charsequence);
        android.widget.Filter.FilterResults filterresults = new android.widget.Filter.FilterResults();
        if (charsequence != null)
        {
            filterresults.count = charsequence.getCount();
            filterresults.values = charsequence;
            return filterresults;
        } else
        {
            filterresults.count = 0;
            filterresults.values = null;
            return filterresults;
        }
    }

    protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
    {
        charsequence = a.a();
        if (filterresults.values != null && filterresults.values != charsequence)
        {
            a.a((Cursor)filterresults.values);
        }
    }
}
