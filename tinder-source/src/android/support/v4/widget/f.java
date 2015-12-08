// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;

final class f extends Filter
{
    static interface a
    {

        public abstract void changeCursor(Cursor cursor);

        public abstract CharSequence convertToString(Cursor cursor);

        public abstract Cursor getCursor();

        public abstract Cursor runQueryOnBackgroundThread(CharSequence charsequence);
    }


    a a;

    f(a a1)
    {
        a = a1;
    }

    public final CharSequence convertResultToString(Object obj)
    {
        return a.convertToString((Cursor)obj);
    }

    protected final android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
    {
        charsequence = a.runQueryOnBackgroundThread(charsequence);
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

    protected final void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
    {
        charsequence = a.getCursor();
        if (filterresults.values != null && filterresults.values != charsequence)
        {
            a.changeCursor((Cursor)filterresults.values);
        }
    }
}
